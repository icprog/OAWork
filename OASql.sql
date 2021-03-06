
/*
  请假表***************************************************
*/
create table TB_LEAVE
(
  leave_id     NUMBER(10) primary key,
  leave_type   VARCHAR2(10),
  time_start   DATE,
  time_end     DATE,
  time_used    NUMBER(10,1),
  user_id      NUMBER(10),
  leave_status NUMBER(2)
)

--请假表序列
--创建sequence：
create sequence tb_leave_sequence
increment by 1
start with 1
nomaxvalue
nocache;

delete from tb_leave;
commit;

-- 查询当前用户请假结束日期，最晚的一天
select *
  from (select t.*, row_number() over (order by TIME_END desc) as rnum
          from tb_leave t where USER_ID = 100) 
 where rnum = 1;
 
 
 --根据userid查询请假记录，带上user信息
 SELECT  l.*,u.*
  		FROM tb_leave l , sys_user u
		WHERE l.USER_ID=u.USERID and l.USER_ID=100;


--根据map条件查询总数量
SELECT  count(*)
  		FROM tb_leave l , sys_user u
		WHERE l.USER_ID=u.USERID and l.USER_ID=100;

--分页查询请假信息
SELECT *
 FROM (SELECT ROWNUM AS rowno,  l.*,u.*
 FROM tb_leave l , sys_user u
 WHERE l.USER_ID=u.USERID and l.USER_ID=100
 and ROWNUM <= 5*2
) tb_leave
 WHERE tb_leave.rowno > 5*(2-1) ;  

 order by TIME_START desc 
 
 --分页查询请假信息2，带按照开始日期排序
 select * from
   (select a.*,rownum row_num from
      (select * from tb_leave l , sys_user u  
              WHERE l.USER_ID=u.USERID and l.USER_ID=100
              order by l.TIME_START desc) a
   ) b
where b.row_num > 5*(2-1) and  b.row_num <= 5*2
 
 
 <!-- SELECT *
		 FROM (SELECT ROWNUM AS rowno,  l.*,u.*
		 FROM tb_leave l , sys_user u
		 WHERE l.USER_ID=u.USERID and l.USER_ID= #{userId}
		 AND ROWNUM <= #{rows} * #{page} ) tb_leave
		 WHERE tb_leave.rowno > #{rows} * (#{page}-1) -->
     
     
 /*
     部门经理查询，查询人所在部门下所有同部门员工的请假记录
 */
 select count(*) from tb_leave where USER_ID 
 in(select USERID from sys_user 
           where DID in 
                 (select DID from sys_dept where DPID =1000000327 ));
                 
/*
     带分页和排序的部门经理查询，查询人所在部门下所有同部门员工的请假记录
 */                                             
select * from
   (select a.*,rownum row_num from
      (select * from tb_leave l , sys_user u   where USER_ID 
         in(select USERID from sys_user 
                   where DID in 
                         (select DID from sys_dept where DPID =1000000327 ))
        and l.USER_ID=u.USERID  
        order by l.TIME_START desc) a
   ) b
where b.row_num > 5*(2-1) and  b.row_num <= 5*2


select count(*) from tb_leave;
                                  

/*
       分页查询所有请假记录
*/
select * from
		   (select a.*,rownum row_num from
		      (select * from tb_leave l , sys_user u  
		              WHERE l.USER_ID=u.USERID
		              order by l.TIME_START desc) a
		   ) b
where b.row_num > 5*(2-1) and  b.row_num <= 5*2       
 


 SELECT  l.*,u.*
	  		FROM tb_leave l , sys_user u
			WHERE l.USER_ID=u.USERID and LEAVE_STATUS=5
 order by u.REALNAME
 
 
 
/*
  考勤日期设置表***************************************************
*/
create table tb_checkDateOption
(
  setting_id     NUMBER(10) primary key,
  setting_date   DATE,
  am_status      NUMBER(2),
  pm_status      NUMBER(2),
  week           NUMBER(2),
  dayNum         NUMBER(10),
  message        varchar2(100),
  is_holiday     NUMBER(2)
)

--考勤日期设置表序列
--创建sequence：
create sequence tb_checkDateOption_sequence
increment by 1
start with 1
nomaxvalue
nocache;

select tb_checkDateOption_sequence.nextval from dual;

select * from tb_checkdateoption where  to_char(SETTING_DATE,'yyyy-MM') = '2018-10' order by DAYNUM;

delete from tb_checkdateoption;
commit;



/*
  考勤明细表***************************************************
*/
create table tb_checkDetail
(
  check_id     NUMBER(10) primary key,
  dept_id      NUMBER(10),
  user_id      NUMBER(10),
  check_code   NUMBER(10),
  time_check   DATE,
  check_num    NUMBER(10),
  check_type   varchar2(50)
);

--考勤明细表序列
--创建sequence：
create sequence tb_checkDetail_sequence
increment by 1
start with 1
nomaxvalue
nocache;

select * from sys_user where CHECKCODE=4132;

delete from tb_checkDetail;
commit;

--删除多余的重复记录，更具时间删除
--1、查询所有重复记录，只保留一条，所以查出重复记录中rownum>1的所有记录
select * from
		   (select a.*,rownum row_num from
		      (select * from tb_checkdetail
          where to_char(TIME_CHECK,'yyyy/MM/dd hh24:mi') 
                    in (select distinct to_char(TIME_CHECK,'yyyy/MM/dd hh24:mi') from tb_checkdetail where CHECK_CODE = 2020)
                    and  CHECK_CODE = 2020
		              ) a
		   ) b
where b.row_num>1;

select distinct to_char(TIME_CHECK,'yyyy/MM/dd hh24:mi') from tb_checkdetail where CHECK_CODE = 2020;

select * from tb_checkdetail where CHECK_CODE = 2020;


select TIME_CHECK from tb_checkdetail t
group by TIME_CHECK;   
          having to_char(TIME_CHECK,'yyyy/MM/dd hh24:mi') 
                    in (select distinct to_char(TIME_CHECK,'yyyy/MM/dd hh24:mi') from tb_checkdetail where CHECK_CODE = 2020)
                    and  CHECK_CODE = 2020;
                    

select * from
		   (select a.*,rownum row_num from
		      (select * from tb_checkdetail
          where to_char(TIME_CHECK,'yyyy/MM/dd hh24:mi') 
                    in ('2015/12/01 07:13')
                    and  CHECK_CODE = 2020
                    
		              ) a
		   ) b
where b.row_num>1;

--根据考勤机id，年月查询考勤明细记录，要求分页
select * from tb_checkdetail 
where 
CHECK_CODE=2020
and 
to_char(TIME_CHECK,'yyyy/MM') = '2015/12' 
order by TIME_CHECK asc; 

select s.*,d.* from sys_user s,sys_dept d
where s.CHECKCODE!=0
and s.did=d.did;


select * from tb_leave 
where USER_ID = 1000000644
and to_char(TIME_START,'yyyy/MM') = '2018/11';


select * from tb_checkdetail 
where 
CHECK_CODE=2020
and 
to_char(TIME_CHECK,'yyyy/MM') = '2015/12' 
where 
order by TIME_CHECK asc; 
