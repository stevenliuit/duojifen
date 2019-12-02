package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:35
 */
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4588434655966955421L;

	/** 
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
