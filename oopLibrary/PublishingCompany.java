package oopLibrary;

public class PublishingCompany {
    String publishComp;

    public PublishingCompany(String publishComp) {
        this.publishComp = publishComp;
    }

    public PublishingCompany() {
        this.publishComp = "Publisher";
    }

    // getter//
    public String getPublishComp() {
        return publishComp;
    }

    public void setPublishComp(String publishComp) {
        this.publishComp = publishComp;
    }

    @Override
    public String toString() {
        return getPublishComp();
    }
}