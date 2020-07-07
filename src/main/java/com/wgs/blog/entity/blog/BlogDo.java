package com.wgs.blog.entity.blog;

import java.io.Serializable;
import java.util.Date;


public class BlogDo implements Serializable {
    private String id;

    private String title;

    private String label;

    private Date createTime;

    private Integer createrId;

    private Integer status;

    private Integer appreciate;

    private Integer browse;

    private String content;

    private static final long serialVersionUID = 1L;

    public BlogDo(String id, String title, String label, Date createTime, Integer createrId, Integer status, Integer appreciate, Integer browse, String content) {
        this.id = id;
        this.title = title;
        this.label = label;
        this.createTime = createTime;
        this.createrId = createrId;
        this.status = status;
        this.appreciate = appreciate;
        this.browse = browse;
        this.content = content;
    }

    public BlogDo() {
        super();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAppreciate() {
        return appreciate;
    }

    public void setAppreciate(Integer appreciate) {
        this.appreciate = appreciate;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", label=").append(label);
        sb.append(", createTime=").append(createTime);
        sb.append(", createrId=").append(createrId);
        sb.append(", status=").append(status);
        sb.append(", appreciate=").append(appreciate);
        sb.append(", browse=").append(browse);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}