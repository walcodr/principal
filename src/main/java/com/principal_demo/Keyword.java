package com.principal_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Keyword {
	
	private String keyword;
	private Boolean is_positive;
	private Boolean is_negative;
	private Boolean is_neutral;
	private int emphasis;
	
	public Keyword() {
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Boolean getIsPositive() {
		return is_positive;
	}

	public void setIsPositive(Boolean is_positive) {
		this.is_positive = is_positive;
	}

	public Boolean getIsNegative() {
		return is_negative;
	}

	public void setIsNegative(Boolean is_negative) {
		this.is_negative = is_negative;
	}

	public Boolean getIsNeutral() {
		return is_neutral;
	}

	public void setIsNeutral(Boolean isNeutral) {
		this.is_neutral = is_neutral;
	}

	public int getEmphasis() {
		return emphasis;
	}

	public void setEmphasis(int emphasis) {
		this.emphasis = emphasis;
	}

	@Override
	public String toString() {
		return "Keywords [keyword=" + keyword + ", is_positive=" + is_positive + ", is_negative=" + is_negative
				+ ", is_neutral=" + is_neutral + ", emphasis=" + emphasis + "]";
	}
	
}
