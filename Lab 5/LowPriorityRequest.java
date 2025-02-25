public class LowPriorityRequest implements Request {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDay = expireDay;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void processRequest() {
        System.out.println("Processing LOW priority request...");
        System.out.println("Status: " + status + ", Expire Day: " + expireDay);
    }
}
