// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/http/request.proto

package org.mojo-lang.mojo.http;

/**
 * Protobuf type {@code mojo.http.Request}
 */
public final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.http.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    method_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Request();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojo-lang.mojo.http.RequestProto.internal_static_mojo_http_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojo-lang.mojo.http.RequestProto.internal_static_mojo_http_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojo-lang.mojo.http.Request.class, org.mojo-lang.mojo.http.Request.Builder.class);
  }

  public static final int METHOD_FIELD_NUMBER = 1;
  private int method_ = 0;
  /**
   * <code>.mojo.http.Method method = 1;</code>
   * @return The enum numeric value on the wire for method.
   */
  @java.lang.Override public int getMethodValue() {
    return method_;
  }
  /**
   * <code>.mojo.http.Method method = 1;</code>
   * @return The method.
   */
  @java.lang.Override public org.mojo-lang.mojo.http.Method getMethod() {
    org.mojo-lang.mojo.http.Method result = org.mojo-lang.mojo.http.Method.forNumber(method_);
    return result == null ? org.mojo-lang.mojo.http.Method.UNRECOGNIZED : result;
  }

  public static final int URL_FIELD_NUMBER = 2;
  private org.mojolang.mojo.core.Url url_;
  /**
   * <code>.mojo.core.Url url = 2;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return url_ != null;
  }
  /**
   * <code>.mojo.core.Url url = 2;</code>
   * @return The url.
   */
  @java.lang.Override
  public org.mojolang.mojo.core.Url getUrl() {
    return url_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
  }
  /**
   * <code>.mojo.core.Url url = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.core.UrlOrBuilder getUrlOrBuilder() {
    return url_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private org.mojo-lang.mojo.http.Version version_;
  /**
   * <code>.mojo.http.Version version = 3;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <code>.mojo.http.Version version = 3;</code>
   * @return The version.
   */
  @java.lang.Override
  public org.mojo-lang.mojo.http.Version getVersion() {
    return version_ == null ? org.mojo-lang.mojo.http.Version.getDefaultInstance() : version_;
  }
  /**
   * <code>.mojo.http.Version version = 3;</code>
   */
  @java.lang.Override
  public org.mojo-lang.mojo.http.VersionOrBuilder getVersionOrBuilder() {
    return version_ == null ? org.mojo-lang.mojo.http.Version.getDefaultInstance() : version_;
  }

  public static final int HEADERS_FIELD_NUMBER = 4;
  private org.mojo-lang.mojo.http.Headers headers_;
  /**
   * <code>.mojo.http.Headers headers = 4;</code>
   * @return Whether the headers field is set.
   */
  @java.lang.Override
  public boolean hasHeaders() {
    return headers_ != null;
  }
  /**
   * <code>.mojo.http.Headers headers = 4;</code>
   * @return The headers.
   */
  @java.lang.Override
  public org.mojo-lang.mojo.http.Headers getHeaders() {
    return headers_ == null ? org.mojo-lang.mojo.http.Headers.getDefaultInstance() : headers_;
  }
  /**
   * <code>.mojo.http.Headers headers = 4;</code>
   */
  @java.lang.Override
  public org.mojo-lang.mojo.http.HeadersOrBuilder getHeadersOrBuilder() {
    return headers_ == null ? org.mojo-lang.mojo.http.Headers.getDefaultInstance() : headers_;
  }

  public static final int BODY_FIELD_NUMBER = 5;
  private org.mojolang.mojo.core.Value body_;
  /**
   * <code>.mojo.core.Value body = 5;</code>
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <code>.mojo.core.Value body = 5;</code>
   * @return The body.
   */
  @java.lang.Override
  public org.mojolang.mojo.core.Value getBody() {
    return body_ == null ? org.mojolang.mojo.core.Value.getDefaultInstance() : body_;
  }
  /**
   * <code>.mojo.core.Value body = 5;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.core.ValueOrBuilder getBodyOrBuilder() {
    return body_ == null ? org.mojolang.mojo.core.Value.getDefaultInstance() : body_;
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
    if (method_ != org.mojo-lang.mojo.http.Method.METHOD_UNSEPECIFIED.getNumber()) {
      output.writeEnum(1, method_);
    }
    if (url_ != null) {
      output.writeMessage(2, getUrl());
    }
    if (version_ != null) {
      output.writeMessage(3, getVersion());
    }
    if (headers_ != null) {
      output.writeMessage(4, getHeaders());
    }
    if (body_ != null) {
      output.writeMessage(5, getBody());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (method_ != org.mojo-lang.mojo.http.Method.METHOD_UNSEPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, method_);
    }
    if (url_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUrl());
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVersion());
    }
    if (headers_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getHeaders());
    }
    if (body_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getBody());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojo-lang.mojo.http.Request)) {
      return super.equals(obj);
    }
    org.mojo-lang.mojo.http.Request other = (org.mojo-lang.mojo.http.Request) obj;

    if (method_ != other.method_) return false;
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (hasHeaders() != other.hasHeaders()) return false;
    if (hasHeaders()) {
      if (!getHeaders()
          .equals(other.getHeaders())) return false;
    }
    if (hasBody() != other.hasBody()) return false;
    if (hasBody()) {
      if (!getBody()
          .equals(other.getBody())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + method_;
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasHeaders()) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeaders().hashCode();
    }
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojo-lang.mojo.http.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.http.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.http.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojo-lang.mojo.http.Request parseFrom(
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
  public static Builder newBuilder(org.mojo-lang.mojo.http.Request prototype) {
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
   * Protobuf type {@code mojo.http.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.http.Request)
      org.mojo-lang.mojo.http.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojo-lang.mojo.http.RequestProto.internal_static_mojo_http_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojo-lang.mojo.http.RequestProto.internal_static_mojo_http_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojo-lang.mojo.http.Request.class, org.mojo-lang.mojo.http.Request.Builder.class);
    }

    // Construct using org.mojo-lang.mojo.http.Request.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      method_ = 0;
      url_ = null;
      if (urlBuilder_ != null) {
        urlBuilder_.dispose();
        urlBuilder_ = null;
      }
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      headers_ = null;
      if (headersBuilder_ != null) {
        headersBuilder_.dispose();
        headersBuilder_ = null;
      }
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojo-lang.mojo.http.RequestProto.internal_static_mojo_http_Request_descriptor;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.http.Request getDefaultInstanceForType() {
      return org.mojo-lang.mojo.http.Request.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojo-lang.mojo.http.Request build() {
      org.mojo-lang.mojo.http.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojo-lang.mojo.http.Request buildPartial() {
      org.mojo-lang.mojo.http.Request result = new org.mojo-lang.mojo.http.Request(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojo-lang.mojo.http.Request result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.method_ = method_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = urlBuilder_ == null
            ? url_
            : urlBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = versionBuilder_ == null
            ? version_
            : versionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.headers_ = headersBuilder_ == null
            ? headers_
            : headersBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.body_ = bodyBuilder_ == null
            ? body_
            : bodyBuilder_.build();
      }
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
      if (other instanceof org.mojo-lang.mojo.http.Request) {
        return mergeFrom((org.mojo-lang.mojo.http.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojo-lang.mojo.http.Request other) {
      if (other == org.mojo-lang.mojo.http.Request.getDefaultInstance()) return this;
      if (other.method_ != 0) {
        setMethodValue(other.getMethodValue());
      }
      if (other.hasUrl()) {
        mergeUrl(other.getUrl());
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasHeaders()) {
        mergeHeaders(other.getHeaders());
      }
      if (other.hasBody()) {
        mergeBody(other.getBody());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              method_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getUrlFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getVersionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getHeadersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getBodyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int method_ = 0;
    /**
     * <code>.mojo.http.Method method = 1;</code>
     * @return The enum numeric value on the wire for method.
     */
    @java.lang.Override public int getMethodValue() {
      return method_;
    }
    /**
     * <code>.mojo.http.Method method = 1;</code>
     * @param value The enum numeric value on the wire for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodValue(int value) {
      method_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Method method = 1;</code>
     * @return The method.
     */
    @java.lang.Override
    public org.mojo-lang.mojo.http.Method getMethod() {
      org.mojo-lang.mojo.http.Method result = org.mojo-lang.mojo.http.Method.forNumber(method_);
      return result == null ? org.mojo-lang.mojo.http.Method.UNRECOGNIZED : result;
    }
    /**
     * <code>.mojo.http.Method method = 1;</code>
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(org.mojo-lang.mojo.http.Method value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      method_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Method method = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      method_ = 0;
      onChanged();
      return this;
    }

    private org.mojolang.mojo.core.Url url_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder> urlBuilder_;
    /**
     * <code>.mojo.core.Url url = 2;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     * @return The url.
     */
    public org.mojolang.mojo.core.Url getUrl() {
      if (urlBuilder_ == null) {
        return url_ == null ? org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
      } else {
        return urlBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder setUrl(org.mojolang.mojo.core.Url value) {
      if (urlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        url_ = value;
      } else {
        urlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder setUrl(
        org.mojolang.mojo.core.Url.Builder builderForValue) {
      if (urlBuilder_ == null) {
        url_ = builderForValue.build();
      } else {
        urlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder mergeUrl(org.mojolang.mojo.core.Url value) {
      if (urlBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          url_ != null &&
          url_ != org.mojolang.mojo.core.Url.getDefaultInstance()) {
          getUrlBuilder().mergeFrom(value);
        } else {
          url_ = value;
        }
      } else {
        urlBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public Builder clearUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      url_ = null;
      if (urlBuilder_ != null) {
        urlBuilder_.dispose();
        urlBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public org.mojolang.mojo.core.Url.Builder getUrlBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUrlFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    public org.mojolang.mojo.core.UrlOrBuilder getUrlOrBuilder() {
      if (urlBuilder_ != null) {
        return urlBuilder_.getMessageOrBuilder();
      } else {
        return url_ == null ?
            org.mojolang.mojo.core.Url.getDefaultInstance() : url_;
      }
    }
    /**
     * <code>.mojo.core.Url url = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder> 
        getUrlFieldBuilder() {
      if (urlBuilder_ == null) {
        urlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.core.Url, org.mojolang.mojo.core.Url.Builder, org.mojolang.mojo.core.UrlOrBuilder>(
                getUrl(),
                getParentForChildren(),
                isClean());
        url_ = null;
      }
      return urlBuilder_;
    }

    private org.mojo-lang.mojo.http.Version version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.http.Version, org.mojo-lang.mojo.http.Version.Builder, org.mojo-lang.mojo.http.VersionOrBuilder> versionBuilder_;
    /**
     * <code>.mojo.http.Version version = 3;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     * @return The version.
     */
    public org.mojo-lang.mojo.http.Version getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? org.mojo-lang.mojo.http.Version.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    public Builder setVersion(org.mojo-lang.mojo.http.Version value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    public Builder setVersion(
        org.mojo-lang.mojo.http.Version.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    public Builder mergeVersion(org.mojo-lang.mojo.http.Version value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          version_ != null &&
          version_ != org.mojo-lang.mojo.http.Version.getDefaultInstance()) {
          getVersionBuilder().mergeFrom(value);
        } else {
          version_ = value;
        }
      } else {
        versionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      version_ = null;
      if (versionBuilder_ != null) {
        versionBuilder_.dispose();
        versionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    public org.mojo-lang.mojo.http.Version.Builder getVersionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    public org.mojo-lang.mojo.http.VersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            org.mojo-lang.mojo.http.Version.getDefaultInstance() : version_;
      }
    }
    /**
     * <code>.mojo.http.Version version = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.http.Version, org.mojo-lang.mojo.http.Version.Builder, org.mojo-lang.mojo.http.VersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojo-lang.mojo.http.Version, org.mojo-lang.mojo.http.Version.Builder, org.mojo-lang.mojo.http.VersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private org.mojo-lang.mojo.http.Headers headers_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.http.Headers, org.mojo-lang.mojo.http.Headers.Builder, org.mojo-lang.mojo.http.HeadersOrBuilder> headersBuilder_;
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     * @return Whether the headers field is set.
     */
    public boolean hasHeaders() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     * @return The headers.
     */
    public org.mojo-lang.mojo.http.Headers getHeaders() {
      if (headersBuilder_ == null) {
        return headers_ == null ? org.mojo-lang.mojo.http.Headers.getDefaultInstance() : headers_;
      } else {
        return headersBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    public Builder setHeaders(org.mojo-lang.mojo.http.Headers value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        headers_ = value;
      } else {
        headersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    public Builder setHeaders(
        org.mojo-lang.mojo.http.Headers.Builder builderForValue) {
      if (headersBuilder_ == null) {
        headers_ = builderForValue.build();
      } else {
        headersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    public Builder mergeHeaders(org.mojo-lang.mojo.http.Headers value) {
      if (headersBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          headers_ != null &&
          headers_ != org.mojo-lang.mojo.http.Headers.getDefaultInstance()) {
          getHeadersBuilder().mergeFrom(value);
        } else {
          headers_ = value;
        }
      } else {
        headersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    public Builder clearHeaders() {
      bitField0_ = (bitField0_ & ~0x00000008);
      headers_ = null;
      if (headersBuilder_ != null) {
        headersBuilder_.dispose();
        headersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    public org.mojo-lang.mojo.http.Headers.Builder getHeadersBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getHeadersFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    public org.mojo-lang.mojo.http.HeadersOrBuilder getHeadersOrBuilder() {
      if (headersBuilder_ != null) {
        return headersBuilder_.getMessageOrBuilder();
      } else {
        return headers_ == null ?
            org.mojo-lang.mojo.http.Headers.getDefaultInstance() : headers_;
      }
    }
    /**
     * <code>.mojo.http.Headers headers = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojo-lang.mojo.http.Headers, org.mojo-lang.mojo.http.Headers.Builder, org.mojo-lang.mojo.http.HeadersOrBuilder> 
        getHeadersFieldBuilder() {
      if (headersBuilder_ == null) {
        headersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojo-lang.mojo.http.Headers, org.mojo-lang.mojo.http.Headers.Builder, org.mojo-lang.mojo.http.HeadersOrBuilder>(
                getHeaders(),
                getParentForChildren(),
                isClean());
        headers_ = null;
      }
      return headersBuilder_;
    }

    private org.mojolang.mojo.core.Value body_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Value, org.mojolang.mojo.core.Value.Builder, org.mojolang.mojo.core.ValueOrBuilder> bodyBuilder_;
    /**
     * <code>.mojo.core.Value body = 5;</code>
     * @return Whether the body field is set.
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     * @return The body.
     */
    public org.mojolang.mojo.core.Value getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? org.mojolang.mojo.core.Value.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    public Builder setBody(org.mojolang.mojo.core.Value value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
      } else {
        bodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    public Builder setBody(
        org.mojolang.mojo.core.Value.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    public Builder mergeBody(org.mojolang.mojo.core.Value value) {
      if (bodyBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          body_ != null &&
          body_ != org.mojolang.mojo.core.Value.getDefaultInstance()) {
          getBodyBuilder().mergeFrom(value);
        } else {
          body_ = value;
        }
      } else {
        bodyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    public Builder clearBody() {
      bitField0_ = (bitField0_ & ~0x00000010);
      body_ = null;
      if (bodyBuilder_ != null) {
        bodyBuilder_.dispose();
        bodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    public org.mojolang.mojo.core.Value.Builder getBodyBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    public org.mojolang.mojo.core.ValueOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            org.mojolang.mojo.core.Value.getDefaultInstance() : body_;
      }
    }
    /**
     * <code>.mojo.core.Value body = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Value, org.mojolang.mojo.core.Value.Builder, org.mojolang.mojo.core.ValueOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.core.Value, org.mojolang.mojo.core.Value.Builder, org.mojolang.mojo.core.ValueOrBuilder>(
                getBody(),
                getParentForChildren(),
                isClean());
        body_ = null;
      }
      return bodyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.http.Request)
  }

  // @@protoc_insertion_point(class_scope:mojo.http.Request)
  private static final org.mojo-lang.mojo.http.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojo-lang.mojo.http.Request();
  }

  public static org.mojo-lang.mojo.http.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojo-lang.mojo.http.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

