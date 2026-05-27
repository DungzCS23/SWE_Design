import controller.MonitorController;
import model.User;
import notification.ChannelType;

public class App {
    public static void main(String[] args) {
        // 1. Khởi tạo Controller điều phối hệ thống
        MonitorController controller = new MonitorController();

        // 2. Tạo một số người dùng mẫu
        User user1 = new User("U001", "alice@example.com");
        User user2 = new User("U002", "bob@example.com");

        // 3. Đăng ký theo dõi website cho người dùng
        controller.registerSubscription(user1, "https://github.com", "hourly", ChannelType.EMAIL);
        controller.registerSubscription(user1, "https://stackoverflow.com", "daily", ChannelType.PUSH);
        controller.registerSubscription(user2, "https://google.com", "daily", ChannelType.SMS);

        // 4. Giả lập hệ thống tự động quét định kỳ kiểm tra cập nhật
        controller.checkWebsites();
    }
}