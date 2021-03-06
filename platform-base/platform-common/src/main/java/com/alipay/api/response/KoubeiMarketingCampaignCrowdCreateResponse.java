package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-01 16:00:43
 */
public class KoubeiMarketingCampaignCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7469576134793259167L;

	/** 
	 * 返回的人群组的唯一标识
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}
	public String getCrowdGroupId( ) {
		return this.crowdGroupId;
	}

}
