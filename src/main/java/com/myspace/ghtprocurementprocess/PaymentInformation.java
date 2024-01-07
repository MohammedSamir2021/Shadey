package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PaymentInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("subTotal")
	private Double subTotal;
	@org.kie.api.definition.type.Label("totalAmount")
	private Double totalAmount;
	@org.kie.api.definition.type.Label("paymentMethod")
	private Integer paymentMethod;

	public PaymentInformation() {
	}

	public java.lang.Double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(java.lang.Double subTotal) {
		this.subTotal = subTotal;
	}

	public java.lang.Double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(java.lang.Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public java.lang.Integer getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(java.lang.Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentInformation(java.lang.Double subTotal,
			java.lang.Double totalAmount, java.lang.Integer paymentMethod) {
		this.subTotal = subTotal;
		this.totalAmount = totalAmount;
		this.paymentMethod = paymentMethod;
	}

}