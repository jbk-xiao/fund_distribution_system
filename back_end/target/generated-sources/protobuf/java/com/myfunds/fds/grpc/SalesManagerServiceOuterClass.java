// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesManagerService.proto

package com.myfunds.fds.grpc;

public final class SalesManagerServiceOuterClass {
  private SalesManagerServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_myfunds_fds_grpc_MidInformationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_myfunds_fds_grpc_MidInformationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_myfunds_fds_grpc_MidInformationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_myfunds_fds_grpc_MidInformationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_myfunds_fds_grpc_CidInformationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_myfunds_fds_grpc_CidInformationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_myfunds_fds_grpc_CidInformationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_myfunds_fds_grpc_CidInformationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_myfunds_fds_grpc_PostVisitLogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_myfunds_fds_grpc_PostVisitLogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031SalesManagerService.proto\022\024com.myfunds" +
      ".fds.grpc\"$\n\025MidInformationRequest\022\013\n\003mi" +
      "d\030\001 \001(\t\")\n\026MidInformationResponse\022\017\n\007mid" +
      "Info\030\001 \001(\t\"1\n\025CidInformationRequest\022\013\n\003c" +
      "id\030\001 \001(\t\022\013\n\003mid\030\002 \001(\t\")\n\026CidInformationR" +
      "esponse\022\017\n\007cidInfo\030\001 \001(\t\"\'\n\023PostVisitLog" +
      "Request\022\020\n\010visitLog\030\001 \001(\t\"#\n\024PostVisitLo" +
      "gResponse\022\013\n\003res\030\001 \001(\t2\304\004\n\023SalesManagerS" +
      "ervice\022o\n\022getBaseInformation\022+.com.myfun" +
      "ds.fds.grpc.MidInformationRequest\032,.com." +
      "myfunds.fds.grpc.MidInformationResponse\022" +
      "k\n\016getChannelList\022+.com.myfunds.fds.grpc" +
      ".MidInformationRequest\032,.com.myfunds.fds" +
      ".grpc.MidInformationResponse\022s\n\026getManag" +
      "erVisitLogList\022+.com.myfunds.fds.grpc.Mi" +
      "dInformationRequest\032,.com.myfunds.fds.gr" +
      "pc.MidInformationResponse\022s\n\026getChannelV" +
      "isitLogList\022+.com.myfunds.fds.grpc.CidIn" +
      "formationRequest\032,.com.myfunds.fds.grpc." +
      "CidInformationResponse\022e\n\014postVisitLog\022)" +
      ".com.myfunds.fds.grpc.PostVisitLogReques" +
      "t\032*.com.myfunds.fds.grpc.PostVisitLogRes" +
      "ponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_myfunds_fds_grpc_MidInformationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_myfunds_fds_grpc_MidInformationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_myfunds_fds_grpc_MidInformationRequest_descriptor,
        new java.lang.String[] { "Mid", });
    internal_static_com_myfunds_fds_grpc_MidInformationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_myfunds_fds_grpc_MidInformationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_myfunds_fds_grpc_MidInformationResponse_descriptor,
        new java.lang.String[] { "MidInfo", });
    internal_static_com_myfunds_fds_grpc_CidInformationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_myfunds_fds_grpc_CidInformationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_myfunds_fds_grpc_CidInformationRequest_descriptor,
        new java.lang.String[] { "Cid", "Mid", });
    internal_static_com_myfunds_fds_grpc_CidInformationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_myfunds_fds_grpc_CidInformationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_myfunds_fds_grpc_CidInformationResponse_descriptor,
        new java.lang.String[] { "CidInfo", });
    internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_descriptor,
        new java.lang.String[] { "VisitLog", });
    internal_static_com_myfunds_fds_grpc_PostVisitLogResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_myfunds_fds_grpc_PostVisitLogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_myfunds_fds_grpc_PostVisitLogResponse_descriptor,
        new java.lang.String[] { "Res", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
