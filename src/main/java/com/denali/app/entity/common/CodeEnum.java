package com.denali.app.entity.common;

public enum CodeEnum {

    SUCCESS(0, "成功"),
    FAIL(-1, "失败"),
    ERROR(-2, "异常/错误"),
    NO_AUTH(-3, "没有权限"),
    NO_LOGIN(-4, "用户未登录或已登出"),
    SYS_ERROR(-5, "系统异常"),
    BUSINESS_ERROR(-6, "业务异常"),
    PARAMS_ERROR(-7, "参数异常"),
    NO_RESPONSE(-200, "服务提供方未响应")
    ;

  private int value;
  private String text;

  CodeEnum(int value, String text) {
    this.value = value;
    this.text = text;
  }

  /**
   * 通过值获取对应文本.
   *
   * @param value 枚举值
   * @return 返回对应文本
   */
  public static String getTextByValue(int value) {
    String text = "";
    for (CodeEnum e : CodeEnum.values()) {
      if (e.getValue() == value) {
        text = e.getText();
        break;
      }
    }
    return text;
  }

  public int getValue() {
    return this.value;
  }

  public String getText() {
    return this.text;
  }
}
