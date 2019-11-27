package com.denali.app.entity.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象
 *
 * @version : V1.0
 * @Auther: yxw
 * @Date: 2019-03-16 15:39
 */

public class PageResult<T> {


  private List<T> rows = new ArrayList<T>();

  private long total;

  public PageResult() {
    super();
  }

  public PageResult(List<T> rows, long total) {
    this.rows = rows;
    this.total = total;
  }

  public static <T> PageResult<T> empty(){
      return new PageResult<>();
  }

  public List<T> getRows() {
    return rows;
  }

  public void setRows(List<T> rows) {
    this.rows = rows;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }
}
