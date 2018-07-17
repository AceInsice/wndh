package xg.yxtk.pojo;

import java.util.Date;

public class TbNavigationType {
    private String navigationId;

    private String userId;

    private String navigationName;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Double navigationCount;

    public String getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(String navigationId) {
        this.navigationId = navigationId == null ? null : navigationId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName == null ? null : navigationName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getNavigationCount() {
        return navigationCount;
    }

    public void setNavigationCount(Double navigationCount) {
        this.navigationCount = navigationCount;
    }
}