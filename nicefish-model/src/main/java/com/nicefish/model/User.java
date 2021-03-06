package com.nicefish.model;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_NAME
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.REAL_NAME
     *
     * @mbg.generated
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.NICK_NAME
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.E_NAME
     *
     * @mbg.generated
     */
    private String eName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.QQ
     *
     * @mbg.generated
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.WEIXIN
     *
     * @mbg.generated
     */
    private String weixin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.CELL_PHONE
     *
     * @mbg.generated
     */
    private String cellPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_DESC
     *
     * @mbg.generated
     */
    private String userDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UP_ID
     *
     * @mbg.generated
     */
    private String upId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.STATUS
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.REG_TIME
     *
     * @mbg.generated
     */
    private Date regTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.LASTLOGIN_TIME
     *
     * @mbg.generated
     */
    private Date lastloginTime;
}