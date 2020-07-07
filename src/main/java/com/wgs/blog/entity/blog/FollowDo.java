package com.wgs.blog.entity.blog;

import java.io.Serializable;

public class FollowDo implements Serializable {
    private Integer id;

    private Integer fromId;

    private Integer toId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public FollowDo(Integer id, Integer fromId, Integer toId, Integer status) {
        this.id = id;
        this.fromId = fromId;
        this.toId = toId;
        this.status = status;
    }

    public FollowDo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}