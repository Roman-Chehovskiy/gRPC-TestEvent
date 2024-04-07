package ru.otus.numders.client;


import ru.otus.numders.grpc_java.NumbersGeneratorGrpc;
import ru.otus.numders.grpc_java.NumbersRequest;
import ru.otus.numders.grpc_java.NumbersResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class NumbersClient {


    public static void main(String[] args) {
        int currentValue = 0;
        int oldValueFromServer = 0;

        System.out.println("Numbers Client is starting...");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        NumbersGeneratorGrpc.NumbersGeneratorStub stub = NumbersGeneratorGrpc.newStub(channel);
        NumbersRequest request = NumbersRequest.newBuilder().setFirstValue(0).setLastValue(30).build();
        ValueWrapper valueFromServer = new ValueWrapper();
        StreamObserver<NumbersResponse> requestObserver = new StreamObserver<>() {


            @Override
            public void onNext(NumbersResponse response) {
                valueFromServer.setValue(response.getValue());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("request completed");
            }
        };
        stub.generateNumbers(request, requestObserver);

        for (int i = 0; i <= 50; i++) {
            try {
                Thread.sleep(1000);
                if (oldValueFromServer != valueFromServer.getValue()) {
                    currentValue = currentValue + valueFromServer.getValue() + 1;
                    oldValueFromServer = valueFromServer.getValue();
                    System.out.println("new value: " + valueFromServer.getValue());
                } else {
                    currentValue += 1;
                }
                System.out.println("currentValue: " + currentValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        requestObserver.onCompleted();

        channel.shutdown();
    }
}



