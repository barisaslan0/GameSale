package Concrete;

import java.time.LocalDate;

public class Campaign {
	private int id;
	private String name;
	private LocalDate campaignEndDate;
	private String detail;

	public Campaign() {

	}

	public Campaign(int id, String name, LocalDate campaignEndDate, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.campaignEndDate = campaignEndDate;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCampaignEndDate() {
		return campaignEndDate;
	}

	public void setCampaignEndDate(LocalDate campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
