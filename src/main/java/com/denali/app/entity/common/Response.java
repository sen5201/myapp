/**
 * @Copyright (c) 2017, 广电运通信息科技有限公司 All Rights Reserved.
 */
package com.denali.app.entity.common;


import io.swagger.annotations.ApiModelProperty;

/**
 * 远程调用返回结果封装对象
 *
 * @author yzx
 * @date 2019/7/9 8:49
 * @return
 */

public final class Response<T> {

    public static final int MSREQUEST_SUCCESS_CODE = 0;
    public static final String MSREQUEST_SUCCESS_DESC = "查询信息成功";
    public static final int MSREQUEST_FAIL_CODE = 500;
    public static final String MSREQUEST_FAIL_DESC = "查询信息失败";

    @ApiModelProperty(value = "0:成功,-1:失败,-2:异常/错误,-3:没有权限,-4:没有登录")
    private Integer code;
    @ApiModelProperty(value = "结果描述")
    private String msg;
    @ApiModelProperty(value = "结果集")
    private T data = null;

    public Response() {

        this(CodeEnum.SUCCESS);
    }

    public Response(T data) {

        this(CodeEnum.SUCCESS);
        this.data = data;
    }

    public Response(CodeEnum codeEnum){
        this.code = codeEnum.getValue();
        this.msg = codeEnum.getText();
    }

    public Response(CodeEnum codeEnum, T data) {

        this(codeEnum);
        this.data = data;
    }

    public Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
