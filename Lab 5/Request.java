public interface Request {
    void setPriority(String priority);

    void setExpire(String expireDay);

    void setStatus(String status);

    void processRequest();
}
