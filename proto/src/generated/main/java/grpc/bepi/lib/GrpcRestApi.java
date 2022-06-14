// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idl.proto

package grpc.bepi.lib;

public final class GrpcRestApi {
  private GrpcRestApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRequest_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRequest_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GResponse_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GResponse_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tidl.proto\"\177\n\010GRequest\022\014\n\004path\030\001 \001(\t\022\'\n" +
      "\007headers\030\002 \003(\0132\026.GRequest.HeadersEntry\022\014" +
      "\n\004body\030\003 \001(\014\032.\n\014HeadersEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\203\001\n\tGResponse\022\016\n\006st" +
      "atus\030\001 \001(\005\022(\n\007headers\030\002 \003(\0132\027.GResponse." +
      "HeadersEntry\022\014\n\004body\030\003 \001(\014\032.\n\014HeadersEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\007\n\005Em" +
      "pty2\253\001\n\007RestApi\022\034\n\004ping\022\006.Empty\032\n.GRespo" +
      "nse\"\000\022\036\n\003get\022\t.GRequest\032\n.GResponse\"\000\022\037\n" +
      "\004post\022\t.GRequest\032\n.GResponse\"\000\022\036\n\003put\022\t." +
      "GRequest\032\n.GResponse\"\000\022!\n\006delete\022\t.GRequ" +
      "est\032\n.GResponse\"\000B\036\n\rgrpc.bepi.libB\013Grpc" +
      "RestApiP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRequest_descriptor,
        new java.lang.String[] { "Path", "Headers", "Body", });
    internal_static_GRequest_HeadersEntry_descriptor =
      internal_static_GRequest_descriptor.getNestedTypes().get(0);
    internal_static_GRequest_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRequest_HeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_GResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GResponse_descriptor,
        new java.lang.String[] { "Status", "Headers", "Body", });
    internal_static_GResponse_HeadersEntry_descriptor =
      internal_static_GResponse_descriptor.getNestedTypes().get(0);
    internal_static_GResponse_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GResponse_HeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}