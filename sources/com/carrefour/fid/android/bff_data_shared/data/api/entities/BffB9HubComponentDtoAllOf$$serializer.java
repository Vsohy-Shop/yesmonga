package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.iam.C9127a0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB9HubComponentDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB9HubComponentDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB9HubComponentDtoAllOf$$serializer implements C12327y<BffB9HubComponentDtoAllOf> {
    @C12579k
    public static final BffB9HubComponentDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB9HubComponentDtoAllOf$$serializer bffB9HubComponentDtoAllOf$$serializer = new BffB9HubComponentDtoAllOf$$serializer();
        INSTANCE = bffB9HubComponentDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB9HubComponentDtoAllOf", bffB9HubComponentDtoAllOf$$serializer, 5);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("image_mobile", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB9HubComponentDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        BffImageDto$$serializer bffImageDto$$serializer = BffImageDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(BffUrlDto$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB9HubComponentDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r16.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x003b
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r8)
            java.lang.Object r2 = r0.mo24885n(r1, r6, r2, r8)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r5, r6, r8)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r6, r8)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r6 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r6, r8)
            r6 = 31
            r8 = r7
            r7 = r6
            goto L_0x008e
        L_0x003b:
            r13 = r6
            r2 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x0041:
            if (r13 == 0) goto L_0x0089
            int r14 = r0.mo24931o(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0087
            if (r14 == 0) goto L_0x007e
            if (r14 == r6) goto L_0x0075
            if (r14 == r5) goto L_0x006c
            if (r14 == r3) goto L_0x0063
            if (r14 != r4) goto L_0x005d
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r12 = r0.mo24885n(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x0041
        L_0x005d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r14)
            throw r0
        L_0x0063:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r11 = r0.mo24885n(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x0041
        L_0x006c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r14 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r10 = r0.mo24885n(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x0041
        L_0x0075:
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r6, r14, r9)
            r2 = r2 | 2
            goto L_0x0041
        L_0x007e:
            kotlinx.serialization.internal.s1 r14 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r0.mo24885n(r1, r7, r14, r8)
            r2 = r2 | 1
            goto L_0x0041
        L_0x0087:
            r13 = r7
            goto L_0x0041
        L_0x0089:
            r7 = r2
            r2 = r9
            r5 = r10
            r3 = r11
            r4 = r12
        L_0x008e:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB9HubComponentDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB9HubComponentDtoAllOf
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r10 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r10 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r10
            r11 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r11
            r12 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r12 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r12
            r13 = 0
            r6 = r0
            r6.<init>((int) r7, (java.lang.String) r8, (java.lang.String) r9, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r10, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r11, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r12, (kotlinx.serialization.internal.C12295n1) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB9HubComponentDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB9HubComponentDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB9HubComponentDtoAllOf bffB9HubComponentDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB9HubComponentDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB9HubComponentDtoAllOf.write$Self(bffB9HubComponentDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
