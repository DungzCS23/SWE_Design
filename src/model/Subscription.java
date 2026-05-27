package model;

import notification.NotificationPreference;

public class Subscription {
    private String subscriptionId; // Thêm id
    private User user;
    private Website website;
    private NotificationPreference preference;

    // Phải khớp đúng 4 tham số này với Controller
    public Subscription(String subscriptionId, User user, Website website, NotificationPreference preference) {
        this.subscriptionId = subscriptionId;
        this.user = user;
        this.website = website;
        this.preference = preference;
    }

    // Các Getter cần thiết
    public User getUser() { return user; }
    public Website getWebsite() { return website; }
    public NotificationPreference getPreference() { return preference; }
}