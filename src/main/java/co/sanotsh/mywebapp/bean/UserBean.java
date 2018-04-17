/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sanotsh.mywebapp.bean;

import java.sql.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author Santosh Kushwaha
 */
@Component
public class UserBean {

    private Integer USER_ID;
    private String USER_NAME;
    private String PASSWORD;
    private String EMAIL;
    private String MOBILE_NO;
    private Integer USER_STATUS;
    private Date ENTER_DATE;

    /**
     * @return the USER_ID
     */
    public Integer getUSER_ID() {
        return USER_ID;
    }

    /**
     * @param USER_ID the USER_ID to set
     */
    public void setUSER_ID(Integer USER_ID) {
        this.USER_ID = USER_ID;
    }

    /**
     * @return the USER_NAME
     */
    public String getUSER_NAME() {
        return USER_NAME;
    }

    /**
     * @param USER_NAME the USER_NAME to set
     */
    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    /**
     * @return the PASSWORD
     */
    public String getPASSWORD() {
        return PASSWORD;
    }

    /**
     * @param PASSWORD the PASSWORD to set
     */
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    /**
     * @return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /**
     * @return the MOBILE_NO
     */
    public String getMOBILE_NO() {
        return MOBILE_NO;
    }

    /**
     * @param MOBILE_NO the MOBILE_NO to set
     */
    public void setMOBILE_NO(String MOBILE_NO) {
        this.MOBILE_NO = MOBILE_NO;
    }

    /**
     * @return the USER_STATUS
     */
    public Integer getUSER_STATUS() {
        return USER_STATUS;
    }

    /**
     * @param USER_STATUS the USER_STATUS to set
     */
    public void setUSER_STATUS(Integer USER_STATUS) {
        this.USER_STATUS = USER_STATUS;
    }

    /**
     * @return the ENTER_DATE
     */
    public Date getENTER_DATE() {
        return ENTER_DATE;
    }

    /**
     * @param ENTER_DATE the ENTER_DATE to set
     */
    public void setENTER_DATE(Date ENTER_DATE) {
        this.ENTER_DATE = ENTER_DATE;
    }

}
