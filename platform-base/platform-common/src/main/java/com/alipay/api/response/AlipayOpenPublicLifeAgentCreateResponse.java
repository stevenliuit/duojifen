package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.open.public.life.agent.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-17 12:23:29
 */
public class AlipayOpenPublicLifeAgentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2563986196846992546L;

	/** 
	 * 外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
