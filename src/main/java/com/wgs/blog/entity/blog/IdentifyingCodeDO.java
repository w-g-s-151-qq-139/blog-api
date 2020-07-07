package com.wgs.blog.entity.blog;

import java.io.Serializable;
import java.util.Date;

public class IdentifyingCodeDO implements Serializable {
    private Integer id;

    private Date createTime;

    private Date deadTime;

    private String code;

    private String createIp;

    private Integer used;

    private static final long serialVersionUID = 1L;

    public IdentifyingCodeDO(Integer id, Date createTime, Date deadTime, String code, String createIp, Integer used) {
        this.id = id;
        this.createTime = createTime;
        this.deadTime = deadTime;
        this.code = code;
        this.createIp = createIp;
        this.used = used;
    }

    public IdentifyingCodeDO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeadTime() {
        return deadTime;
    }

    public void setDeadTime(Date deadTime) {
        this.deadTime = deadTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", deadTime=").append(deadTime);
        sb.append(", code=").append(code);
        sb.append(", createIp=").append(createIp);
        sb.append(", used=").append(used);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}