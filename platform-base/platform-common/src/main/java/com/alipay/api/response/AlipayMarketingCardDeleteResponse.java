package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.card.delete response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:06
 */
public class AlipayMarketingCardDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5775793976216322394L;

	/** 
	 * 支付宝端删卡业务流水号
	 */
	@ApiField("biz_serial_no")
	private String bizSerialNo;

	public void setBizSerialNo(String bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}
	public String getBizSerialNo( ) {
		return this.bizSerialNo;
	}

}
