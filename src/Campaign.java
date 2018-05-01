import java.util.Date;

public class Campaign {

    private String title;
    private Date campaignStartDate;
    private Date campaignFinishDate;
    private double estimatedCost;
    private double campaignOverheads;

    public Campaign(String title, Date campaignStartDate, Date campaignFinishDate, double estimatedCost, double campaignOverheads) {
        this.title = title;
        this.campaignStartDate = campaignStartDate;
        this.campaignFinishDate = campaignFinishDate;
        this.estimatedCost = estimatedCost;
        this.campaignOverheads = campaignOverheads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(Date campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public Date getCampaignFinishDate() {
        return campaignFinishDate;
    }

    public void setCampaignFinishDate(Date campaignFinishDate) {
        this.campaignFinishDate = campaignFinishDate;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public double getOverheads() {
        return campaignOverheads;
    }

    public void setCampaignOverheads(double campaignOverheads) {
        this.campaignOverheads = campaignOverheads;
    }

}
