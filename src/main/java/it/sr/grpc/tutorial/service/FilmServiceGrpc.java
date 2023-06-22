package it.sr.grpc.tutorial.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: product-service")
@io.grpc.stub.annotations.GrpcGenerated
public final class FilmServiceGrpc {

  private FilmServiceGrpc() {}

  public static final String SERVICE_NAME = "it.sr.grpc.tutorial.service.FilmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<it.sr.grpc.tutorial.service.ProductService.GetFilmRequest,
      it.sr.grpc.tutorial.service.ProductService.FilmResponse> getGetFilmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFilm",
      requestType = it.sr.grpc.tutorial.service.ProductService.GetFilmRequest.class,
      responseType = it.sr.grpc.tutorial.service.ProductService.FilmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<it.sr.grpc.tutorial.service.ProductService.GetFilmRequest,
      it.sr.grpc.tutorial.service.ProductService.FilmResponse> getGetFilmMethod() {
    io.grpc.MethodDescriptor<it.sr.grpc.tutorial.service.ProductService.GetFilmRequest, it.sr.grpc.tutorial.service.ProductService.FilmResponse> getGetFilmMethod;
    if ((getGetFilmMethod = FilmServiceGrpc.getGetFilmMethod) == null) {
      synchronized (FilmServiceGrpc.class) {
        if ((getGetFilmMethod = FilmServiceGrpc.getGetFilmMethod) == null) {
          FilmServiceGrpc.getGetFilmMethod = getGetFilmMethod =
              io.grpc.MethodDescriptor.<it.sr.grpc.tutorial.service.ProductService.GetFilmRequest, it.sr.grpc.tutorial.service.ProductService.FilmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFilm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.sr.grpc.tutorial.service.ProductService.GetFilmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.sr.grpc.tutorial.service.ProductService.FilmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FilmServiceMethodDescriptorSupplier("GetFilm"))
              .build();
        }
      }
    }
    return getGetFilmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<it.sr.grpc.tutorial.service.ProductService.AddFilmRequest,
      it.sr.grpc.tutorial.service.ProductService.FilmResponse> getAddFilmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFilm",
      requestType = it.sr.grpc.tutorial.service.ProductService.AddFilmRequest.class,
      responseType = it.sr.grpc.tutorial.service.ProductService.FilmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<it.sr.grpc.tutorial.service.ProductService.AddFilmRequest,
      it.sr.grpc.tutorial.service.ProductService.FilmResponse> getAddFilmMethod() {
    io.grpc.MethodDescriptor<it.sr.grpc.tutorial.service.ProductService.AddFilmRequest, it.sr.grpc.tutorial.service.ProductService.FilmResponse> getAddFilmMethod;
    if ((getAddFilmMethod = FilmServiceGrpc.getAddFilmMethod) == null) {
      synchronized (FilmServiceGrpc.class) {
        if ((getAddFilmMethod = FilmServiceGrpc.getAddFilmMethod) == null) {
          FilmServiceGrpc.getAddFilmMethod = getAddFilmMethod =
              io.grpc.MethodDescriptor.<it.sr.grpc.tutorial.service.ProductService.AddFilmRequest, it.sr.grpc.tutorial.service.ProductService.FilmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFilm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.sr.grpc.tutorial.service.ProductService.AddFilmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  it.sr.grpc.tutorial.service.ProductService.FilmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FilmServiceMethodDescriptorSupplier("AddFilm"))
              .build();
        }
      }
    }
    return getAddFilmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FilmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilmServiceStub>() {
        @java.lang.Override
        public FilmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilmServiceStub(channel, callOptions);
        }
      };
    return FilmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FilmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilmServiceBlockingStub>() {
        @java.lang.Override
        public FilmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilmServiceBlockingStub(channel, callOptions);
        }
      };
    return FilmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FilmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FilmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FilmServiceFutureStub>() {
        @java.lang.Override
        public FilmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FilmServiceFutureStub(channel, callOptions);
        }
      };
    return FilmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FilmServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFilm(it.sr.grpc.tutorial.service.ProductService.GetFilmRequest request,
        io.grpc.stub.StreamObserver<it.sr.grpc.tutorial.service.ProductService.FilmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFilmMethod(), responseObserver);
    }

    /**
     */
    public void addFilm(it.sr.grpc.tutorial.service.ProductService.AddFilmRequest request,
        io.grpc.stub.StreamObserver<it.sr.grpc.tutorial.service.ProductService.FilmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFilmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFilmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                it.sr.grpc.tutorial.service.ProductService.GetFilmRequest,
                it.sr.grpc.tutorial.service.ProductService.FilmResponse>(
                  this, METHODID_GET_FILM)))
          .addMethod(
            getAddFilmMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                it.sr.grpc.tutorial.service.ProductService.AddFilmRequest,
                it.sr.grpc.tutorial.service.ProductService.FilmResponse>(
                  this, METHODID_ADD_FILM)))
          .build();
    }
  }

  /**
   */
  public static final class FilmServiceStub extends io.grpc.stub.AbstractAsyncStub<FilmServiceStub> {
    private FilmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilmServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFilm(it.sr.grpc.tutorial.service.ProductService.GetFilmRequest request,
        io.grpc.stub.StreamObserver<it.sr.grpc.tutorial.service.ProductService.FilmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFilmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addFilm(it.sr.grpc.tutorial.service.ProductService.AddFilmRequest request,
        io.grpc.stub.StreamObserver<it.sr.grpc.tutorial.service.ProductService.FilmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFilmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FilmServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FilmServiceBlockingStub> {
    private FilmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilmServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public it.sr.grpc.tutorial.service.ProductService.FilmResponse getFilm(it.sr.grpc.tutorial.service.ProductService.GetFilmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFilmMethod(), getCallOptions(), request);
    }

    /**
     */
    public it.sr.grpc.tutorial.service.ProductService.FilmResponse addFilm(it.sr.grpc.tutorial.service.ProductService.AddFilmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFilmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FilmServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FilmServiceFutureStub> {
    private FilmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FilmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FilmServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<it.sr.grpc.tutorial.service.ProductService.FilmResponse> getFilm(
        it.sr.grpc.tutorial.service.ProductService.GetFilmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFilmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<it.sr.grpc.tutorial.service.ProductService.FilmResponse> addFilm(
        it.sr.grpc.tutorial.service.ProductService.AddFilmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFilmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FILM = 0;
  private static final int METHODID_ADD_FILM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FilmServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FilmServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FILM:
          serviceImpl.getFilm((it.sr.grpc.tutorial.service.ProductService.GetFilmRequest) request,
              (io.grpc.stub.StreamObserver<it.sr.grpc.tutorial.service.ProductService.FilmResponse>) responseObserver);
          break;
        case METHODID_ADD_FILM:
          serviceImpl.addFilm((it.sr.grpc.tutorial.service.ProductService.AddFilmRequest) request,
              (io.grpc.stub.StreamObserver<it.sr.grpc.tutorial.service.ProductService.FilmResponse>) responseObserver);
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

  private static abstract class FilmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FilmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return it.sr.grpc.tutorial.service.ProductService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FilmService");
    }
  }

  private static final class FilmServiceFileDescriptorSupplier
      extends FilmServiceBaseDescriptorSupplier {
    FilmServiceFileDescriptorSupplier() {}
  }

  private static final class FilmServiceMethodDescriptorSupplier
      extends FilmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FilmServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FilmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FilmServiceFileDescriptorSupplier())
              .addMethod(getGetFilmMethod())
              .addMethod(getAddFilmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
