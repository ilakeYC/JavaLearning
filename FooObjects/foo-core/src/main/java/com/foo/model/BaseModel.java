package com.foo.model;

import com.foo.Constants;
import com.foo.util.CalendarUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mixueqiang
 * @since Mar 8, 2014
 */
public class BaseModel implements Serializable {
  private static final long serialVersionUID = -6363055536956583470L;

  protected long id;
  protected String name;
  protected int status;
  protected long createTime;
  protected long updateTime;
  private Map<String, Object> properties;

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BaseModel other = (BaseModel) obj;
    if (createTime != other.createTime)
      return false;
    if (id != other.id)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  public Date getCreateDate() {
    return CalendarUtils.getDate(createTime);
  }

  public long getCreateTime() {
    return createTime;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Map<String, Object> getProperties() {
    if (properties == null) {
      properties = new HashMap<String, Object>();
    }

    return properties;
  }

  public int getStatus() {
    return status;
  }

  public Date getUpdateDate() {
    return CalendarUtils.getDate(updateTime);
  }

  public long getUpdateTime() {
    return updateTime;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (createTime ^ (createTime >>> 32));
    result = prime * result + (int) (id ^ (id >>> 32));
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  public boolean isDeleted() {
    return status == -2;
  }

  public boolean isDisabled() {
    return status < 1;
  }

  public boolean isEnabled() {
    return getStatus() > Constants.STATUS_DISABLED;
  }

  public boolean isFinished() {
    return status == 100;
  }

  public boolean isHidden() {
    return status == -1;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public void setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "BaseModel [id=" + id + ", name=" + name + ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
  }

}
