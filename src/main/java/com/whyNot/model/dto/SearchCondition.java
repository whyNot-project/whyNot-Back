package com.whyNot.model.dto;

public class SearchCondition {
	
	private int isInside;
	private int isSingle;
	private int isCardio;
	private int useEquip;
	
	public SearchCondition() {
	}

	public SearchCondition(int isInside, int isSingle, int isCardio, int useEquip) {
		super();
		this.isInside = isInside;
		this.isSingle = isSingle;
		this.isCardio = isCardio;
		this.useEquip = useEquip;
	}

	public int getIsInside() {
		return isInside;
	}

	public void setIsInside(int isInside) {
		this.isInside = isInside;
	}

	public int getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(int isSingle) {
		this.isSingle = isSingle;
	}

	public int getIsCardio() {
		return isCardio;
	}

	public void setIsCardio(int isCardio) {
		this.isCardio = isCardio;
	}

	public int getUseEquip() {
		return useEquip;
	}

	public void setUseEquip(int useEquip) {
		this.useEquip = useEquip;
	}

	@Override
	public String toString() {
		return "SearchCondition [isInside=" + isInside + ", isSingle=" + isSingle + ", isCardio=" + isCardio
				+ ", useEquip=" + useEquip + "]";
	}
	
}
