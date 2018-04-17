/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.sanotsh.mywebapp.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author mishra
 */
@Component
public class EmployeeBean {
    private Integer EMP_ID;
    private String EMP_NAME;
    private String EMP_PASSWORD;
    private String EMP_GENDER;
    private String EMP_ADDRESS;
    private String EMP_COUNTRY;
    private String EMP_MOBILE_NUMBER;
    private String EMP_EMAIL_ID;

    /**
     * @return the EMP_ID
     */
    public Integer getEMP_ID() {
        return EMP_ID;
    }

    /**
     * @param EMP_ID the EMP_ID to set
     */
    public void setEMP_ID(Integer EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    /**
     * @return the EMP_NAME
     */
    public String getEMP_NAME() {
        return EMP_NAME;
    }

    /**
     * @param EMP_NAME the EMP_NAME to set
     */
    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    /**
     * @return the EMP_PASSWORD
     */
    public String getEMP_PASSWORD() {
        return EMP_PASSWORD;
    }

    /**
     * @param EMP_PASSWORD the EMP_PASSWORD to set
     */
    public void setEMP_PASSWORD(String EMP_PASSWORD) {
        this.EMP_PASSWORD = EMP_PASSWORD;
    }

    /**
     * @return the EMP_GENDER
     */
    public String getEMP_GENDER() {
        return EMP_GENDER;
    }

    /**
     * @param EMP_GENDER the EMP_GENDER to set
     */
    public void setEMP_GENDER(String EMP_GENDER) {
        this.EMP_GENDER = EMP_GENDER;
    }

    /**
     * @return the EMP_ADDRESS
     */
    public String getEMP_ADDRESS() {
        return EMP_ADDRESS;
    }

    /**
     * @param EMP_ADDRESS the EMP_ADDRESS to set
     */
    public void setEMP_ADDRESS(String EMP_ADDRESS) {
        this.EMP_ADDRESS = EMP_ADDRESS;
    }

    /**
     * @return the EMP_COUNTRY
     */
    public String getEMP_COUNTRY() {
        return EMP_COUNTRY;
    }

    /**
     * @param EMP_COUNTRY the EMP_COUNTRY to set
     */
    public void setEMP_COUNTRY(String EMP_COUNTRY) {
        this.EMP_COUNTRY = EMP_COUNTRY;
    }

    /**
     * @return the EMP_MOBILE_NUMBER
     */
    public String getEMP_MOBILE_NUMBER() {
        return EMP_MOBILE_NUMBER;
    }

    /**
     * @param EMP_MOBILE_NUMBER the EMP_MOBILE_NUMBER to set
     */
    public void setEMP_MOBILE_NUMBER(String EMP_MOBILE_NUMBER) {
        this.EMP_MOBILE_NUMBER = EMP_MOBILE_NUMBER;
    }

    /**
     * @return the EMP_EMAIL_ID
     */
    public String getEMP_EMAIL_ID() {
        return EMP_EMAIL_ID;
    }

    /**
     * @param EMP_EMAIL_ID the EMP_EMAIL_ID to set
     */
    public void setEMP_EMAIL_ID(String EMP_EMAIL_ID) {
        this.EMP_EMAIL_ID = EMP_EMAIL_ID;
    }
              
}
