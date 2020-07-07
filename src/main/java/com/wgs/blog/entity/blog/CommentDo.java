package com.wgs.blog.entity.blog;

import java.io.Serializable;
import java.util.Date;

public class CommentDo implements Serializable {
    private String id;

    private Integer createrid;

    private String commentBlogId;

    private Integer commentId;

    private String content;

    private Date created;

    private Integer appreciate;

    private static final long serialVersionUID = 1L;

    public CommentDo(String id, Integer createrid, String commentBlogId, Integer commentId, String content, Date created, Integer appreciate) {
        this.id = id;
        this.createrid = createrid;
        this.commentBlogId = commentBlogId;
        this.commentId = commentId;
        this.content = content;
        this.created = created;
        this.appreciate = appreciate;
    }

    public CommentDo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCreaterid() {
        return createrid;
    }

    public void setCreaterid(Integer createrid) {
        this.createrid = createrid;
    }

    public String getCommentBlogId() {
        return commentBlogId;
    }

    public void setCommentBlogId(String commentBlogId) {
        this.commentBlogId = commentBlogId == null ? null : commentBlogId.trim();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getAppreciate() {
        return appreciate;
    }

    public void setAppreciate(Integer appreciate) {
        this.appreciate = appreciate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createrid=").append(createrid);
        sb.append(", commentBlogId=").append(commentBlogId);
        sb.append(", commentId=").append(commentId);
        sb.append(", content=").append(content);
        sb.append(", created=").append(created);
        sb.append(", appreciate=").append(appreciate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}