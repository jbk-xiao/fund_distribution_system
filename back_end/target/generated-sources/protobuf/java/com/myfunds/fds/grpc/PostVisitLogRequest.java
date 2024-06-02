// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesManagerService.proto

package com.myfunds.fds.grpc;

/**
 * Protobuf type {@code com.myfunds.fds.grpc.PostVisitLogRequest}
 */
public  final class PostVisitLogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.myfunds.fds.grpc.PostVisitLogRequest)
    PostVisitLogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostVisitLogRequest.newBuilder() to construct.
  private PostVisitLogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostVisitLogRequest() {
    visitLog_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostVisitLogRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostVisitLogRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            visitLog_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.myfunds.fds.grpc.SalesManagerServiceOuterClass.internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.myfunds.fds.grpc.SalesManagerServiceOuterClass.internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.myfunds.fds.grpc.PostVisitLogRequest.class, com.myfunds.fds.grpc.PostVisitLogRequest.Builder.class);
  }

  public static final int VISITLOG_FIELD_NUMBER = 1;
  private volatile java.lang.Object visitLog_;
  /**
   * <code>string visitLog = 1;</code>
   */
  public java.lang.String getVisitLog() {
    java.lang.Object ref = visitLog_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      visitLog_ = s;
      return s;
    }
  }
  /**
   * <code>string visitLog = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVisitLogBytes() {
    java.lang.Object ref = visitLog_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      visitLog_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getVisitLogBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, visitLog_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVisitLogBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, visitLog_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.myfunds.fds.grpc.PostVisitLogRequest)) {
      return super.equals(obj);
    }
    com.myfunds.fds.grpc.PostVisitLogRequest other = (com.myfunds.fds.grpc.PostVisitLogRequest) obj;

    if (!getVisitLog()
        .equals(other.getVisitLog())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VISITLOG_FIELD_NUMBER;
    hash = (53 * hash) + getVisitLog().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.myfunds.fds.grpc.PostVisitLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.myfunds.fds.grpc.PostVisitLogRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.myfunds.fds.grpc.PostVisitLogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.myfunds.fds.grpc.PostVisitLogRequest)
      com.myfunds.fds.grpc.PostVisitLogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.myfunds.fds.grpc.SalesManagerServiceOuterClass.internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.myfunds.fds.grpc.SalesManagerServiceOuterClass.internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.myfunds.fds.grpc.PostVisitLogRequest.class, com.myfunds.fds.grpc.PostVisitLogRequest.Builder.class);
    }

    // Construct using com.myfunds.fds.grpc.PostVisitLogRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      visitLog_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.myfunds.fds.grpc.SalesManagerServiceOuterClass.internal_static_com_myfunds_fds_grpc_PostVisitLogRequest_descriptor;
    }

    @java.lang.Override
    public com.myfunds.fds.grpc.PostVisitLogRequest getDefaultInstanceForType() {
      return com.myfunds.fds.grpc.PostVisitLogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.myfunds.fds.grpc.PostVisitLogRequest build() {
      com.myfunds.fds.grpc.PostVisitLogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.myfunds.fds.grpc.PostVisitLogRequest buildPartial() {
      com.myfunds.fds.grpc.PostVisitLogRequest result = new com.myfunds.fds.grpc.PostVisitLogRequest(this);
      result.visitLog_ = visitLog_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.myfunds.fds.grpc.PostVisitLogRequest) {
        return mergeFrom((com.myfunds.fds.grpc.PostVisitLogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.myfunds.fds.grpc.PostVisitLogRequest other) {
      if (other == com.myfunds.fds.grpc.PostVisitLogRequest.getDefaultInstance()) return this;
      if (!other.getVisitLog().isEmpty()) {
        visitLog_ = other.visitLog_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.myfunds.fds.grpc.PostVisitLogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.myfunds.fds.grpc.PostVisitLogRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object visitLog_ = "";
    /**
     * <code>string visitLog = 1;</code>
     */
    public java.lang.String getVisitLog() {
      java.lang.Object ref = visitLog_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        visitLog_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string visitLog = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVisitLogBytes() {
      java.lang.Object ref = visitLog_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        visitLog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string visitLog = 1;</code>
     */
    public Builder setVisitLog(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      visitLog_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string visitLog = 1;</code>
     */
    public Builder clearVisitLog() {
      
      visitLog_ = getDefaultInstance().getVisitLog();
      onChanged();
      return this;
    }
    /**
     * <code>string visitLog = 1;</code>
     */
    public Builder setVisitLogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      visitLog_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.myfunds.fds.grpc.PostVisitLogRequest)
  }

  // @@protoc_insertion_point(class_scope:com.myfunds.fds.grpc.PostVisitLogRequest)
  private static final com.myfunds.fds.grpc.PostVisitLogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.myfunds.fds.grpc.PostVisitLogRequest();
  }

  public static com.myfunds.fds.grpc.PostVisitLogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostVisitLogRequest>
      PARSER = new com.google.protobuf.AbstractParser<PostVisitLogRequest>() {
    @java.lang.Override
    public PostVisitLogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostVisitLogRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostVisitLogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostVisitLogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.myfunds.fds.grpc.PostVisitLogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
