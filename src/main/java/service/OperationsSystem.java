package service;

import model.Todo;

public class OperationsSystem {
    DataRetriever dataRetriever;

    public OperationsSystem(DataRetriever dataRetriever) {
        this.dataRetriever = dataRetriever;
    }

    public String getTitleWithPrefix(String prefix) {
        //dataRetriever.operation1();
        //dataRetriever.operation2();
        //dataRetriever.operation3();
        return prefix + dataRetriever.getData().getTitle();
    }

    public int getSumOfUserIdAndId() {
        Todo todo = dataRetriever.getData();
        return todo.getUserId() + todo.getId();
//        return dataRetriever.getData().getUserId() + dataRetriever.getData().getId();
    }

    public boolean isCompleted() {
        return dataRetriever.getData().isCompleted();
    }
}
