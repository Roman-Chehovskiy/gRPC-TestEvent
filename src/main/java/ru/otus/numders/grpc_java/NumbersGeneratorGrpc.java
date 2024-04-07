package ru.otus.numders.grpc_java;

import io.grpc.stub.StreamObserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.processing.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: numbers.proto")
public final class NumbersGeneratorGrpc {

  private NumbersGeneratorGrpc() {}

  public static final String SERVICE_NAME = "NumbersGenerator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<NumbersRequest,
          NumbersResponse> getGenerateNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateNumbers",
      requestType = NumbersRequest.class,
      responseType = NumbersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<NumbersRequest,
          NumbersResponse> getGenerateNumbersMethod() {
    io.grpc.MethodDescriptor<NumbersRequest, NumbersResponse> getGenerateNumbersMethod;
    if ((getGenerateNumbersMethod = NumbersGeneratorGrpc.getGenerateNumbersMethod) == null) {
      synchronized (NumbersGeneratorGrpc.class) {
        if ((getGenerateNumbersMethod = NumbersGeneratorGrpc.getGenerateNumbersMethod) == null) {
          NumbersGeneratorGrpc.getGenerateNumbersMethod = getGenerateNumbersMethod =
              io.grpc.MethodDescriptor.<NumbersRequest, NumbersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NumbersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NumbersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NumbersGeneratorMethodDescriptorSupplier("GenerateNumbers"))
              .build();
        }
      }
    }
    return getGenerateNumbersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumbersGeneratorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumbersGeneratorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumbersGeneratorStub>() {
        @java.lang.Override
        public NumbersGeneratorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumbersGeneratorStub(channel, callOptions);
        }
      };
    return NumbersGeneratorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumbersGeneratorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumbersGeneratorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumbersGeneratorBlockingStub>() {
        @java.lang.Override
        public NumbersGeneratorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumbersGeneratorBlockingStub(channel, callOptions);
        }
      };
    return NumbersGeneratorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumbersGeneratorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumbersGeneratorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumbersGeneratorFutureStub>() {
        @java.lang.Override
        public NumbersGeneratorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumbersGeneratorFutureStub(channel, callOptions);
        }
      };
    return NumbersGeneratorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NumbersGeneratorImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateNumbers(NumbersRequest request,
                                io.grpc.stub.StreamObserver<NumbersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateNumbersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateNumbersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                      NumbersRequest,
                      NumbersResponse>(
                  this, METHODID_GENERATE_NUMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class NumbersGeneratorStub extends io.grpc.stub.AbstractAsyncStub<NumbersGeneratorStub> {
    private NumbersGeneratorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumbersGeneratorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumbersGeneratorStub(channel, callOptions);
    }

    /**
     */
    public StreamObserver<NumbersResponse> generateNumbers(NumbersRequest request,
                                                           io.grpc.stub.StreamObserver<NumbersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGenerateNumbersMethod(), getCallOptions()), request, responseObserver);
      return responseObserver;
    }
  }

  /**
   */
  public static final class NumbersGeneratorBlockingStub extends io.grpc.stub.AbstractBlockingStub<NumbersGeneratorBlockingStub> {
    private NumbersGeneratorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumbersGeneratorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumbersGeneratorBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<NumbersResponse> generateNumbers(
        NumbersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGenerateNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumbersGeneratorFutureStub extends io.grpc.stub.AbstractFutureStub<NumbersGeneratorFutureStub> {
    private NumbersGeneratorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumbersGeneratorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumbersGeneratorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GENERATE_NUMBERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumbersGeneratorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumbersGeneratorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_NUMBERS:
          serviceImpl.generateNumbers((NumbersRequest) request,
              (io.grpc.stub.StreamObserver<NumbersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NumbersGeneratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumbersGeneratorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return NumbersProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumbersGenerator");
    }
  }

  private static final class NumbersGeneratorFileDescriptorSupplier
      extends NumbersGeneratorBaseDescriptorSupplier {
    NumbersGeneratorFileDescriptorSupplier() {}
  }

  private static final class NumbersGeneratorMethodDescriptorSupplier
      extends NumbersGeneratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumbersGeneratorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NumbersGeneratorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumbersGeneratorFileDescriptorSupplier())
              .addMethod(getGenerateNumbersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
