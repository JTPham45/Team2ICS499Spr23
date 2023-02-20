package com.ics499.team2.clothingstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Promotion {
	@Id
	@GeneratedValue
	private long promotionId;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)

	private String promotionName;
	private double percentageOff;

	public Promotion(long promotionId, String promotionName, double percentageOff) {
		super();
		this.promotionId = promotionId;
		this.promotionName = promotionName;
		this.percentageOff = percentageOff;
	}

	public long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public double getPercentageOff() {
		return percentageOff;
	}

	public void setPercentageOff(double percentageOff) {
		this.percentageOff = percentageOff;
	}

	@Override
	public String toString() {
		return "Promotion [promotionId=" + promotionId + ", promotionName=" + promotionName + ", percentageOff="
				+ percentageOff + "]";
	}

}
