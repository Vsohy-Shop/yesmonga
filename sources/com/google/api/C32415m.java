package com.google.api;

import com.google.protobuf.C34368g0;
import com.google.protobuf.C34412l1;
import com.google.protobuf.C34471v0;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.util.List;

/* renamed from: com.google.api.m */
public final class C32415m {

    /* renamed from: a */
    public static final int f78800a = 1051;

    /* renamed from: b */
    public static final GeneratedMessageLite.C34268g<DescriptorProtos.MethodOptions, List<String>> f78801b;

    /* renamed from: c */
    public static final int f78802c = 1049;

    /* renamed from: d */
    public static final GeneratedMessageLite.C34268g<DescriptorProtos.ServiceOptions, String> f78803d;

    /* renamed from: e */
    public static final int f78804e = 1050;

    /* renamed from: f */
    public static final GeneratedMessageLite.C34268g<DescriptorProtos.ServiceOptions, String> f78805f;

    static {
        DescriptorProtos.MethodOptions defaultInstance = DescriptorProtos.MethodOptions.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
        f78801b = GeneratedMessageLite.newRepeatedGeneratedExtension(defaultInstance, (C34412l1) null, (C34471v0.C34475d<?>) null, f78800a, fieldType, false, String.class);
        WireFormat.FieldType fieldType2 = fieldType;
        f78803d = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.ServiceOptions.getDefaultInstance(), "", (C34412l1) null, (C34471v0.C34475d<?>) null, 1049, fieldType2, String.class);
        f78805f = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.ServiceOptions.getDefaultInstance(), "", (C34412l1) null, (C34471v0.C34475d<?>) null, f78804e, fieldType2, String.class);
    }

    /* renamed from: a */
    public static void m131351a(C34368g0 g0Var) {
        g0Var.mo101101b(f78801b);
        g0Var.mo101101b(f78803d);
        g0Var.mo101101b(f78805f);
    }
}
