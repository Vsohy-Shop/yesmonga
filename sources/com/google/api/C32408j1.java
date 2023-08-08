package com.google.api;

import com.google.protobuf.C34368g0;
import com.google.protobuf.C34471v0;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.util.List;

/* renamed from: com.google.api.j1 */
public final class C32408j1 {

    /* renamed from: a */
    public static final int f78794a = 1055;

    /* renamed from: b */
    public static final GeneratedMessageLite.C34268g<DescriptorProtos.FieldOptions, ResourceReference> f78795b;

    /* renamed from: c */
    public static final int f78796c = 1053;

    /* renamed from: d */
    public static final GeneratedMessageLite.C34268g<DescriptorProtos.FileOptions, List<ResourceDescriptor>> f78797d;

    /* renamed from: e */
    public static final int f78798e = 1053;

    /* renamed from: f */
    public static final GeneratedMessageLite.C34268g<DescriptorProtos.MessageOptions, ResourceDescriptor> f78799f;

    static {
        DescriptorProtos.FieldOptions defaultInstance = DescriptorProtos.FieldOptions.getDefaultInstance();
        ResourceReference defaultInstance2 = ResourceReference.getDefaultInstance();
        ResourceReference defaultInstance3 = ResourceReference.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f78795b = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, (C34471v0.C34475d<?>) null, f78794a, fieldType, ResourceReference.class);
        f78797d = GeneratedMessageLite.newRepeatedGeneratedExtension(DescriptorProtos.FileOptions.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), (C34471v0.C34475d<?>) null, 1053, fieldType, false, ResourceDescriptor.class);
        f78799f = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.MessageOptions.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), (C34471v0.C34475d<?>) null, 1053, fieldType, ResourceDescriptor.class);
    }

    /* renamed from: a */
    public static void m131348a(C34368g0 g0Var) {
        g0Var.mo101101b(f78795b);
        g0Var.mo101101b(f78797d);
        g0Var.mo101101b(f78799f);
    }
}
