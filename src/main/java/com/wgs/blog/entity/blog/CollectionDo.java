package com.wgs.blog.entity.blog;

import java.io.Serializable;

public class CollectionDo implements Serializable {
    private String id;

    private String blogId;

    private Integer collectorId;

    private String blogTitle;

    private static final long serialVersionUID = 1L;

    public CollectionDo(String id, String blogId, Integer collectorId, String blogTitle) {
        this.id = id;
        this.blogId = blogId;
        this.collectorId = collectorId;
        this.blogTitle = blogTitle;
    }

    public CollectionDo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public Integer getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", blogId=").append(blogId);
        sb.append(", collectorId=").append(collectorId);
        sb.append(", blogTitle=").append(blogTitle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}