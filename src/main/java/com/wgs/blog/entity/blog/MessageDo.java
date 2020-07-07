package com.wgs.blog.entity.blog;

import java.io.Serializable;
import java.util.Date;

public class MessageDo implements Serializable {
    private String id;

    private Integer creatorId;

    private Date created;

    private Integer addresseeId;

    private String title;

    private String content;

    private Integer dispatchStatus;

    private Integer receiptStatus;

    private static final long serialVersionUID = 1L;

    public MessageDo(String id, Integer creatorId, Date created, Integer addresseeId, String title, String content, Integer dispatchStatus, Integer receiptStatus) {
        this.id = id;
        this.creatorId = creatorId;
        this.created = created;
        this.addresseeId = addresseeId;
        this.title = title;
        this.content = content;
        this.dispatchStatus = dispatchStatus;
        this.receiptStatus = receiptStatus;
    }

    public MessageDo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getAddresseeId() {
        return addresseeId;
    }

    public void setAddresseeId(Integer addresseeId) {
        this.addresseeId = addresseeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getDispatchStatus() {
        return dispatchStatus;
    }

    public void setDispatchStatus(Integer dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
    }

    public Integer getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(Integer receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", created=").append(created);
        sb.append(", addresseeId=").append(addresseeId);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", dispatchStatus=").append(dispatchStatus);
        sb.append(", receiptStatus=").append(receiptStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}