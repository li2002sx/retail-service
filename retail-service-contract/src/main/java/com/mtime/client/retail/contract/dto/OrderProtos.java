// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package com.mtime.client.retail.contract.dto;

public final class OrderProtos {
  private OrderProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OrderOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 OrderID = 1;
    /**
     * <code>required int32 OrderID = 1;</code>
     */
    boolean hasOrderID();
    /**
     * <code>required int32 OrderID = 1;</code>
     */
    int getOrderID();

    // required string OrderCode = 2;
    /**
     * <code>required string OrderCode = 2;</code>
     */
    boolean hasOrderCode();
    /**
     * <code>required string OrderCode = 2;</code>
     */
    java.lang.String getOrderCode();
    /**
     * <code>required string OrderCode = 2;</code>
     */
    com.google.protobuf.ByteString
        getOrderCodeBytes();
  }
  /**
   * Protobuf type {@code Order}
   */
  public static final class Order extends
      com.google.protobuf.GeneratedMessage
      implements OrderOrBuilder {
    // Use Order.newBuilder() to construct.
    private Order(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Order(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Order defaultInstance;
    public static Order getDefaultInstance() {
      return defaultInstance;
    }

    public Order getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Order(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              orderID_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              orderCode_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mtime.client.retail.contract.dto.OrderProtos.internal_static_Order_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mtime.client.retail.contract.dto.OrderProtos.internal_static_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mtime.client.retail.contract.dto.OrderProtos.Order.class, com.mtime.client.retail.contract.dto.OrderProtos.Order.Builder.class);
    }

    public static com.google.protobuf.Parser<Order> PARSER =
        new com.google.protobuf.AbstractParser<Order>() {
      public Order parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Order(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Order> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 OrderID = 1;
    public static final int ORDERID_FIELD_NUMBER = 1;
    private int orderID_;
    /**
     * <code>required int32 OrderID = 1;</code>
     */
    public boolean hasOrderID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 OrderID = 1;</code>
     */
    public int getOrderID() {
      return orderID_;
    }

    // required string OrderCode = 2;
    public static final int ORDERCODE_FIELD_NUMBER = 2;
    private java.lang.Object orderCode_;
    /**
     * <code>required string OrderCode = 2;</code>
     */
    public boolean hasOrderCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string OrderCode = 2;</code>
     */
    public java.lang.String getOrderCode() {
      java.lang.Object ref = orderCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          orderCode_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string OrderCode = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOrderCodeBytes() {
      java.lang.Object ref = orderCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      orderID_ = 0;
      orderCode_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasOrderID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOrderCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, orderID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getOrderCodeBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, orderID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getOrderCodeBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.mtime.client.retail.contract.dto.OrderProtos.Order parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.mtime.client.retail.contract.dto.OrderProtos.Order prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Order}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.mtime.client.retail.contract.dto.OrderProtos.OrderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.mtime.client.retail.contract.dto.OrderProtos.internal_static_Order_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.mtime.client.retail.contract.dto.OrderProtos.internal_static_Order_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.mtime.client.retail.contract.dto.OrderProtos.Order.class, com.mtime.client.retail.contract.dto.OrderProtos.Order.Builder.class);
      }

      // Construct using com.mtime.client.retail.contract.dto.OrderProtos.Order.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        orderID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        orderCode_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.mtime.client.retail.contract.dto.OrderProtos.internal_static_Order_descriptor;
      }

      public com.mtime.client.retail.contract.dto.OrderProtos.Order getDefaultInstanceForType() {
        return com.mtime.client.retail.contract.dto.OrderProtos.Order.getDefaultInstance();
      }

      public com.mtime.client.retail.contract.dto.OrderProtos.Order build() {
        com.mtime.client.retail.contract.dto.OrderProtos.Order result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.mtime.client.retail.contract.dto.OrderProtos.Order buildPartial() {
        com.mtime.client.retail.contract.dto.OrderProtos.Order result = new com.mtime.client.retail.contract.dto.OrderProtos.Order(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.orderID_ = orderID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.orderCode_ = orderCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.mtime.client.retail.contract.dto.OrderProtos.Order) {
          return mergeFrom((com.mtime.client.retail.contract.dto.OrderProtos.Order)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.mtime.client.retail.contract.dto.OrderProtos.Order other) {
        if (other == com.mtime.client.retail.contract.dto.OrderProtos.Order.getDefaultInstance()) return this;
        if (other.hasOrderID()) {
          setOrderID(other.getOrderID());
        }
        if (other.hasOrderCode()) {
          bitField0_ |= 0x00000002;
          orderCode_ = other.orderCode_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOrderID()) {
          
          return false;
        }
        if (!hasOrderCode()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.mtime.client.retail.contract.dto.OrderProtos.Order parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.mtime.client.retail.contract.dto.OrderProtos.Order) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 OrderID = 1;
      private int orderID_ ;
      /**
       * <code>required int32 OrderID = 1;</code>
       */
      public boolean hasOrderID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 OrderID = 1;</code>
       */
      public int getOrderID() {
        return orderID_;
      }
      /**
       * <code>required int32 OrderID = 1;</code>
       */
      public Builder setOrderID(int value) {
        bitField0_ |= 0x00000001;
        orderID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 OrderID = 1;</code>
       */
      public Builder clearOrderID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        orderID_ = 0;
        onChanged();
        return this;
      }

      // required string OrderCode = 2;
      private java.lang.Object orderCode_ = "";
      /**
       * <code>required string OrderCode = 2;</code>
       */
      public boolean hasOrderCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string OrderCode = 2;</code>
       */
      public java.lang.String getOrderCode() {
        java.lang.Object ref = orderCode_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          orderCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string OrderCode = 2;</code>
       */
      public com.google.protobuf.ByteString
          getOrderCodeBytes() {
        java.lang.Object ref = orderCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          orderCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string OrderCode = 2;</code>
       */
      public Builder setOrderCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        orderCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string OrderCode = 2;</code>
       */
      public Builder clearOrderCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        orderCode_ = getDefaultInstance().getOrderCode();
        onChanged();
        return this;
      }
      /**
       * <code>required string OrderCode = 2;</code>
       */
      public Builder setOrderCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        orderCode_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Order)
    }

    static {
      defaultInstance = new Order(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Order)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Order_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Order.proto\"+\n\005Order\022\017\n\007OrderID\030\001 \002(\005\022" +
      "\021\n\tOrderCode\030\002 \002(\tB3\n$com.mtime.client.r" +
      "etail.contract.dtoB\013OrderProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Order_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Order_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Order_descriptor,
              new java.lang.String[] { "OrderID", "OrderCode", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
