/*
 * Copyright 2017, Google LLC All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.logging.v2.stub;

import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogEntriesPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogsPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListMonitoredResourceDescriptorsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.logging.v2.LoggingSettings;
import com.google.logging.v2.DeleteLogRequest;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListLogsRequest;
import com.google.logging.v2.ListLogsResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.WriteLogEntriesRequest;
import com.google.logging.v2.WriteLogEntriesResponse;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Stackdriver Logging API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcLoggingServiceV2Stub extends LoggingServiceV2Stub {

  private static final MethodDescriptor<DeleteLogRequest, Empty> deleteLogMethodDescriptor =
      MethodDescriptor.<DeleteLogRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.logging.v2.LoggingServiceV2/DeleteLog")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteLogRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesMethodDescriptor =
          MethodDescriptor.<WriteLogEntriesRequest, WriteLogEntriesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.logging.v2.LoggingServiceV2/WriteLogEntries")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(WriteLogEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(WriteLogEntriesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListLogEntriesRequest, ListLogEntriesResponse>
      listLogEntriesMethodDescriptor =
          MethodDescriptor.<ListLogEntriesRequest, ListLogEntriesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.logging.v2.LoggingServiceV2/ListLogEntries")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLogEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLogEntriesResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsMethodDescriptor =
          MethodDescriptor
              .<ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.logging.v2.LoggingServiceV2/ListMonitoredResourceDescriptors")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      ListMonitoredResourceDescriptorsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      ListMonitoredResourceDescriptorsResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListLogsRequest, ListLogsResponse>
      listLogsMethodDescriptor =
          MethodDescriptor.<ListLogsRequest, ListLogsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.logging.v2.LoggingServiceV2/ListLogs")
              .setRequestMarshaller(ProtoUtils.marshaller(ListLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListLogsResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteLogRequest, Empty> deleteLogCallable;
  private final UnaryCallable<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesCallable;
  private final UnaryCallable<ListLogEntriesRequest, ListLogEntriesResponse> listLogEntriesCallable;
  private final UnaryCallable<ListLogEntriesRequest, ListLogEntriesPagedResponse>
      listLogEntriesPagedCallable;
  private final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable;
  private final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable;
  private final UnaryCallable<ListLogsRequest, ListLogsResponse> listLogsCallable;
  private final UnaryCallable<ListLogsRequest, ListLogsPagedResponse> listLogsPagedCallable;

  public static final GrpcLoggingServiceV2Stub create(LoggingSettings settings) throws IOException {
    return new GrpcLoggingServiceV2Stub(settings, ClientContext.create(settings));
  }

  public static final GrpcLoggingServiceV2Stub create(ClientContext clientContext)
      throws IOException {
    return new GrpcLoggingServiceV2Stub(LoggingSettings.newBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcLoggingServiceV2Stub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLoggingServiceV2Stub(LoggingSettings settings, ClientContext clientContext)
      throws IOException {

    GrpcCallSettings<DeleteLogRequest, Empty> deleteLogTransportSettings =
        GrpcCallSettings.<DeleteLogRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteLogMethodDescriptor)
            .build();
    GrpcCallSettings<WriteLogEntriesRequest, WriteLogEntriesResponse>
        writeLogEntriesTransportSettings =
            GrpcCallSettings.<WriteLogEntriesRequest, WriteLogEntriesResponse>newBuilder()
                .setMethodDescriptor(writeLogEntriesMethodDescriptor)
                .build();
    GrpcCallSettings<ListLogEntriesRequest, ListLogEntriesResponse>
        listLogEntriesTransportSettings =
            GrpcCallSettings.<ListLogEntriesRequest, ListLogEntriesResponse>newBuilder()
                .setMethodDescriptor(listLogEntriesMethodDescriptor)
                .build();
    GrpcCallSettings<
            ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
        listMonitoredResourceDescriptorsTransportSettings =
            GrpcCallSettings
                .<ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
                    newBuilder()
                .setMethodDescriptor(listMonitoredResourceDescriptorsMethodDescriptor)
                .build();
    GrpcCallSettings<ListLogsRequest, ListLogsResponse> listLogsTransportSettings =
        GrpcCallSettings.<ListLogsRequest, ListLogsResponse>newBuilder()
            .setMethodDescriptor(listLogsMethodDescriptor)
            .build();

    this.deleteLogCallable =
        GrpcCallableFactory.createUnaryCallable(
            deleteLogTransportSettings, settings.deleteLogSettings(), clientContext);
    this.writeLogEntriesCallable =
        GrpcCallableFactory.createBatchingCallable(
            writeLogEntriesTransportSettings, settings.writeLogEntriesSettings(), clientContext);
    this.listLogEntriesCallable =
        GrpcCallableFactory.createUnaryCallable(
            listLogEntriesTransportSettings, settings.listLogEntriesSettings(), clientContext);
    this.listLogEntriesPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listLogEntriesTransportSettings, settings.listLogEntriesSettings(), clientContext);
    this.listMonitoredResourceDescriptorsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listMonitoredResourceDescriptorsTransportSettings,
            settings.listMonitoredResourceDescriptorsSettings(),
            clientContext);
    this.listMonitoredResourceDescriptorsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listMonitoredResourceDescriptorsTransportSettings,
            settings.listMonitoredResourceDescriptorsSettings(),
            clientContext);
    this.listLogsCallable =
        GrpcCallableFactory.createUnaryCallable(
            listLogsTransportSettings, settings.listLogsSettings(), clientContext);
    this.listLogsPagedCallable =
        GrpcCallableFactory.createPagedCallable(
            listLogsTransportSettings, settings.listLogsSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<DeleteLogRequest, Empty> deleteLogCallable() {
    return deleteLogCallable;
  }

  public UnaryCallable<WriteLogEntriesRequest, WriteLogEntriesResponse> writeLogEntriesCallable() {
    return writeLogEntriesCallable;
  }

  public UnaryCallable<ListLogEntriesRequest, ListLogEntriesPagedResponse>
      listLogEntriesPagedCallable() {
    return listLogEntriesPagedCallable;
  }

  public UnaryCallable<ListLogEntriesRequest, ListLogEntriesResponse> listLogEntriesCallable() {
    return listLogEntriesCallable;
  }

  public UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable() {
    return listMonitoredResourceDescriptorsPagedCallable;
  }

  public UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable() {
    return listMonitoredResourceDescriptorsCallable;
  }

  public UnaryCallable<ListLogsRequest, ListLogsPagedResponse> listLogsPagedCallable() {
    return listLogsPagedCallable;
  }

  public UnaryCallable<ListLogsRequest, ListLogsResponse> listLogsCallable() {
    return listLogsCallable;
  }

  @Override
  public final void close() throws Exception {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
