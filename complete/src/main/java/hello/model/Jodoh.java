package hello.model;

public class Jodoh {
    private final String yourName;
    private final String partnerName;
    private final int yourAge;
    private final int partnerAge;

    public Jodoh(String yourName, String partnerName, int yourAge, int partnerAge) {
        this.yourName = yourName;
        this.partnerName = partnerName;
        this.yourAge = yourAge;
        this.partnerAge = partnerAge;
    }

    public String getYourName() {
        return yourName;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public int getYourAge() {
        return yourAge;
    }

    public int getPartnerAge() {
        return partnerAge;
    }
}
