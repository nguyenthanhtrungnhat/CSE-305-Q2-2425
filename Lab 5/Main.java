public class Main {
    public static void main(String[] args) {
        // Fixed data
        String priority = "High";
        String expireDay = "2025-12-31";
        String status = "Pending";

        // Creating a request using a high-priority creator
        RequestCreator creator = new HighPriorityConcreteCreator();
        Request request = creator.createRequest();

        // Setting request details
        request.setPriority(priority);
        request.setExpire(expireDay);
        request.setStatus(status);

        // Processing request
        request.processRequest();
    }
}
