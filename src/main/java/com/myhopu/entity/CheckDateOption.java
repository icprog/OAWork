package com.myhopu.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CheckDateOption {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.SETTING_ID
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Long settingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.SETTING_DATE
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Date settingDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.AM_STATUS
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Short amStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.PM_STATUS
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Short pmStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.WEEK
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Short week;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.DAYNUM
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Long daynum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.MESSAGE
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CHECKDATEOPTION.IS_HOLIDAY
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    private Short isHoliday;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.SETTING_ID
     *
     * @return the value of TB_CHECKDATEOPTION.SETTING_ID
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Long getSettingId() {
        return settingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.SETTING_ID
     *
     * @param settingId the value for TB_CHECKDATEOPTION.SETTING_ID
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setSettingId(Long settingId) {
        this.settingId = settingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.SETTING_DATE
     *
     * @return the value of TB_CHECKDATEOPTION.SETTING_DATE
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Date getSettingDate() {
        return settingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.SETTING_DATE
     *
     * @param settingDate the value for TB_CHECKDATEOPTION.SETTING_DATE
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setSettingDate(Date settingDate) {
        this.settingDate = settingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.AM_STATUS
     *
     * @return the value of TB_CHECKDATEOPTION.AM_STATUS
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Short getAmStatus() {
        return amStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.AM_STATUS
     *
     * @param amStatus the value for TB_CHECKDATEOPTION.AM_STATUS
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setAmStatus(Short amStatus) {
        this.amStatus = amStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.PM_STATUS
     *
     * @return the value of TB_CHECKDATEOPTION.PM_STATUS
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Short getPmStatus() {
        return pmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.PM_STATUS
     *
     * @param pmStatus the value for TB_CHECKDATEOPTION.PM_STATUS
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setPmStatus(Short pmStatus) {
        this.pmStatus = pmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.WEEK
     *
     * @return the value of TB_CHECKDATEOPTION.WEEK
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Short getWeek() {
        return week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.WEEK
     *
     * @param week the value for TB_CHECKDATEOPTION.WEEK
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setWeek(Short week) {
        this.week = week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.DAYNUM
     *
     * @return the value of TB_CHECKDATEOPTION.DAYNUM
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Long getDaynum() {
        return daynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.DAYNUM
     *
     * @param daynum the value for TB_CHECKDATEOPTION.DAYNUM
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setDaynum(Long daynum) {
        this.daynum = daynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.MESSAGE
     *
     * @return the value of TB_CHECKDATEOPTION.MESSAGE
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.MESSAGE
     *
     * @param message the value for TB_CHECKDATEOPTION.MESSAGE
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CHECKDATEOPTION.IS_HOLIDAY
     *
     * @return the value of TB_CHECKDATEOPTION.IS_HOLIDAY
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public Short getIsHoliday() {
        return isHoliday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CHECKDATEOPTION.IS_HOLIDAY
     *
     * @param isHoliday the value for TB_CHECKDATEOPTION.IS_HOLIDAY
     *
     * @mbg.generated Fri Nov 16 09:08:24 GMT+08:00 2018
     */
    public void setIsHoliday(Short isHoliday) {
        this.isHoliday = isHoliday;
    }

	@Override
	public String toString() {
		return "CheckDateOption [settingId=" + settingId + ", settingDate=" + settingDate + ", amStatus=" + amStatus
				+ ", pmStatus=" + pmStatus + ", week=" + week + ", daynum=" + daynum + ", message=" + message
				+ ", isHoliday=" + isHoliday + "]";
	}
    
    
    
}