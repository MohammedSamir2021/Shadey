package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ItemAudit implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer totalqty;
	private java.lang.String status;
	private java.lang.String requester;
	private java.lang.Integer remarks;
	private java.lang.String refNumber;
	private java.lang.String description;
	private java.util.Date deliveryDate;
	private java.util.Date date;

	public ItemAudit() {
	}

	public java.lang.Integer getTotalqty() {
		return this.totalqty;
	}

	public void setTotalqty(java.lang.Integer totalqty) {
		this.totalqty = totalqty;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getRequester() {
		return this.requester;
	}

	public void setRequester(java.lang.String requester) {
		this.requester = requester;
	}

	public java.lang.Integer getRemarks() {
		return this.remarks;
	}

	public void setRemarks(java.lang.Integer remarks) {
		this.remarks = remarks;
	}

	public java.lang.String getRefNumber() {
		return this.refNumber;
	}

	public void setRefNumber(java.lang.String refNumber) {
		this.refNumber = refNumber;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.util.Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(java.util.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public ItemAudit(java.lang.Integer totalqty, java.lang.String status,
			java.lang.String requester, java.lang.Integer remarks,
			java.lang.String refNumber, java.lang.String description,
			java.util.Date deliveryDate, java.util.Date date) {
		this.totalqty = totalqty;
		this.status = status;
		this.requester = requester;
		this.remarks = remarks;
		this.refNumber = refNumber;
		this.description = description;
		this.deliveryDate = deliveryDate;
		this.date = date;
	}

}