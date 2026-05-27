package controller;

import model.Subscription;
import model.User;
import model.Website;
import notification.ChannelType;
import notification.NotificationPreference;
import java.util.ArrayList;
import java.util.List;

public class MonitorController {
    private List<Subscription> subscriptions = new ArrayList<>();

    // Logic đăng ký subscription theo yêu cầu Exercise 3
    public void registerSubscription(User user, String url, String frequency, ChannelType channel) {
        Website website = new Website(url);
        NotificationPreference pref = new NotificationPreference(frequency, channel);
        Subscription sub = new Subscription("SUB-" + (subscriptions.size() + 1), user, website, pref);
        subscriptions.add(sub);
        System.out.println("Successfully registered: " + url + " for User: " + user.getUserId());
    }

    // Logic quét kiểm tra cập nhật (Mockup)
    public void checkWebsites() {
        System.out.println("\n--- Starting Website Monitoring Check ---");
        for (Subscription sub : subscriptions) {
            // Giả lập ngẫu nhiên xem website có cập nhật hay không (tỷ lệ 70% có update)
            boolean isUpdated = Math.random() > 0.3; 
            if (isUpdated) {
                sendNotification(sub);
            } else {
                System.out.println("No updates for: " + sub.getWebsite().getUrl());
            }
        }
    }

    // Hàm mockup gửi notification
    private void sendNotification(Subscription sub) {
        System.out.println("[ALERT] Website " + sub.getWebsite().getUrl() + " has changed! " +
                           "Sending notification to " + sub.getUser().getEmail() + 
                           " via " + sub.getPreference().getPreferredChannel() + 
                           " (" + sub.getPreference().getFrequency() + ")");
    }

}
