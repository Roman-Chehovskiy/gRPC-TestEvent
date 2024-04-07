package ru.otus.numders.server;

import ru.otus.numders.grpc_java.NumbersGeneratorGrpc;
import ru.otus.numders.grpc_java.NumbersRequest;
import ru.otus.numders.grpc_java.NumbersResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class NumbersServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new NumbersGeneratorImpl())
                .build();

        server.start();
        server.awaitTermination();
    }

    static class NumbersGeneratorImpl extends NumbersGeneratorGrpc.NumbersGeneratorImplBase {
        @Override
        public void generateNumbers(NumbersRequest request, StreamObserver<NumbersResponse> responseObserver) {
            int currentValue = request.getFirstValue();
            int lastValue = request.getLastValue();

            while (currentValue <= lastValue) {
                NumbersResponse response = NumbersResponse.newBuilder().setValue(currentValue).build();
                responseObserver.onNext(response);
                currentValue++;
                try {
                    Thread.sleep(2000); // Раз в две секунды
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            responseObserver.onCompleted();
        }
    }

}
