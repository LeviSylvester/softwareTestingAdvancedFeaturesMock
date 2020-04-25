import service.DataRetriever;
import service.OperationsSystem;

public class Main {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        OperationsSystem operationSystem = new OperationsSystem(dataRetriever);

        System.out.println(operationSystem.getSumOfUserIdAndId());
        System.out.println(operationSystem.getTitleWithPrefix("Pr**"));
        System.out.println(operationSystem.isCompleted());
    }
}
