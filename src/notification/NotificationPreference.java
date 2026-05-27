package notification;

public class NotificationPreference {
    private String frequency; // Eg: "daily", "hourly"
    private ChannelType preferredChannel;

    public NotificationPreference(String frequency, ChannelType preferredChannel) {
        this.frequency = frequency;
        this.preferredChannel = preferredChannel;
    }

    public String getFrequency() { return frequency; }
    public ChannelType getPreferredChannel() { return preferredChannel; }

}
