package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProcurementApp implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<com.AuditApp> auditList;
	private java.util.List<com.myspace.ghtprocurementprocess.ItemInformation> itemInformation;
	private com.myspace.ghtprocurementprocess.VendorInformation vendorInformation;
	private com.myspace.ghtprocurementprocess.POInformation poInformation;
	private com.myspace.ghtprocurementprocess.PaymentInformation paymentInformation;
	private com.myspace.ghtprocurementprocess.InvoiceInformation invoiceInformation;
	private com.myspace.ghtprocurementprocess.FinanceInformation financeInformation;
	private com.myspace.ghtprocurementprocess.DeliveryInformation deliveryInformation;
	private java.util.List<com.myspace.ghtprocurementprocess.ItemAudit> itemAudit;

	public ProcurementApp() {
	}

	public java.util.List<com.AuditApp> getAuditList() {
		return this.auditList;
	}

	public void setAuditList(java.util.List<com.AuditApp> auditList) {
		this.auditList = auditList;
	}

	public java.util.List<com.myspace.ghtprocurementprocess.ItemInformation> getItemInformation() {
		return this.itemInformation;
	}

	public void setItemInformation(
			java.util.List<com.myspace.ghtprocurementprocess.ItemInformation> itemInformation) {
		this.itemInformation = itemInformation;
	}

	public com.myspace.ghtprocurementprocess.VendorInformation getVendorInformation() {
		return this.vendorInformation;
	}

	public void setVendorInformation(
			com.myspace.ghtprocurementprocess.VendorInformation vendorInformation) {
		this.vendorInformation = vendorInformation;
	}

	public com.myspace.ghtprocurementprocess.POInformation getPoInformation() {
		return this.poInformation;
	}

	public void setPoInformation(
			com.myspace.ghtprocurementprocess.POInformation poInformation) {
		this.poInformation = poInformation;
	}

	public com.myspace.ghtprocurementprocess.PaymentInformation getPaymentInformation() {
		return this.paymentInformation;
	}

	public void setPaymentInformation(
			com.myspace.ghtprocurementprocess.PaymentInformation paymentInformation) {
		this.paymentInformation = paymentInformation;
	}

	public com.myspace.ghtprocurementprocess.InvoiceInformation getInvoiceInformation() {
		return this.invoiceInformation;
	}

	public void setInvoiceInformation(
			com.myspace.ghtprocurementprocess.InvoiceInformation invoiceInformation) {
		this.invoiceInformation = invoiceInformation;
	}

	public com.myspace.ghtprocurementprocess.FinanceInformation getFinanceInformation() {
		return this.financeInformation;
	}

	public void setFinanceInformation(
			com.myspace.ghtprocurementprocess.FinanceInformation financeInformation) {
		this.financeInformation = financeInformation;
	}

	public com.myspace.ghtprocurementprocess.DeliveryInformation getDeliveryInformation() {
		return this.deliveryInformation;
	}

	public void setDeliveryInformation(
			com.myspace.ghtprocurementprocess.DeliveryInformation deliveryInformation) {
		this.deliveryInformation = deliveryInformation;
	}

	public java.util.List<com.myspace.ghtprocurementprocess.ItemAudit> getItemAudit() {
		return this.itemAudit;
	}

	public void setItemAudit(
			java.util.List<com.myspace.ghtprocurementprocess.ItemAudit> itemAudit) {
		this.itemAudit = itemAudit;
	}

	public ProcurementApp(
			java.util.List<com.AuditApp> auditList,
			java.util.List<com.myspace.ghtprocurementprocess.ItemInformation> itemInformation,
			com.myspace.ghtprocurementprocess.VendorInformation vendorInformation,
			com.myspace.ghtprocurementprocess.POInformation poInformation,
			com.myspace.ghtprocurementprocess.PaymentInformation paymentInformation,
			com.myspace.ghtprocurementprocess.InvoiceInformation invoiceInformation,
			com.myspace.ghtprocurementprocess.FinanceInformation financeInformation,
			com.myspace.ghtprocurementprocess.DeliveryInformation deliveryInformation,
			java.util.List<com.myspace.ghtprocurementprocess.ItemAudit> itemAudit) {
		this.auditList = auditList;
		this.itemInformation = itemInformation;
		this.vendorInformation = vendorInformation;
		this.poInformation = poInformation;
		this.paymentInformation = paymentInformation;
		this.invoiceInformation = invoiceInformation;
		this.financeInformation = financeInformation;
		this.deliveryInformation = deliveryInformation;
		this.itemAudit = itemAudit;
	}

}