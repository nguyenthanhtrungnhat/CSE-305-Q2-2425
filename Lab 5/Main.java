import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creating and processing a low-priority request
        RequestCreator lowCreator = new LowPriorityConcreteCreator();
        Request lowRequest = lowCreator.createRequest();
        lowRequest.setPriority("Ignore");
        lowRequest.setStatus("Done");
        lowRequest.setExpire(LocalDate.now().toString());
        lowRequest.processRequest();

        // Creating and processing a medium-priority request
        RequestCreator midCreator = new MidPriorityConcreteCreator();
        Request midRequest = midCreator.createRequest();
        midRequest.setPriority("Medium");
        midRequest.setStatus("Accepted");
        midRequest.setExpire(LocalDate.now().plusMonths(1).toString());
        midRequest.processRequest();

        // Creating and processing a high-priority request
        RequestCreator highCreator = new HighPriorityConcreteCreator();
        Request highRequest = highCreator.createRequest();
        highRequest.setPriority("Emergency");
        highRequest.setStatus("Accept");
        highRequest.setExpire(LocalDate.now().toString());
        highRequest.processRequest();
    }
}
