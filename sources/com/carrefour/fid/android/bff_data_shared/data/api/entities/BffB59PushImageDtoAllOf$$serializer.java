package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB59PushImageDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB59PushImageDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB59PushImageDtoAllOf$$serializer implements C12327y<BffB59PushImageDtoAllOf> {
    @C12579k
    public static final BffB59PushImageDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB59PushImageDtoAllOf$$serializer bffB59PushImageDtoAllOf$$serializer = new BffB59PushImageDtoAllOf$$serializer();
        INSTANCE = bffB59PushImageDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf", bffB59PushImageDtoAllOf$$serializer, 11);
        pluginGeneratedSerialDescriptor.mo24966k(C13814a.f33702X0, true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("design", true);
        pluginGeneratedSerialDescriptor.mo24966k("ean", true);
        pluginGeneratedSerialDescriptor.mo24966k("image_format", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_mobile_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("legal_mentions", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta1", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta2", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB59PushImageDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        BffImageDto$$serializer bffImageDto$$serializer = BffImageDto$$serializer.INSTANCE;
        BffCtaImageDto$$serializer bffCtaImageDto$$serializer = BffCtaImageDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffCtaImageDto$$serializer), C12197a.m48817q(bffCtaImageDto$$serializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r28.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r3 = 10
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 1
            r13 = 0
            r14 = 0
            if (r2 == 0) goto L_0x005d
            kotlinx.serialization.internal.h0 r2 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r2 = r0.mo24885n(r1, r13, r2, r14)
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r12 = r0.mo24885n(r1, r12, r13, r14)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r13, r14)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r13, r14)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r13, r14)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r7, r15, r14)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r15, r14)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r13, r14)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r13, r14)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r4, r13, r14)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r13, r14)
            r13 = 2047(0x7ff, float:2.868E-42)
            r14 = r13
            goto L_0x010f
        L_0x005d:
            r24 = r12
            r2 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x006a:
            if (r24 == 0) goto L_0x0100
            int r4 = r0.mo24931o(r1)
            switch(r4) {
                case -1: goto L_0x00f7;
                case 0: goto L_0x00ec;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00aa;
                case 7: goto L_0x009e;
                case 8: goto L_0x0091;
                case 9: goto L_0x0083;
                case 10: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r4)
            throw r0
        L_0x0079:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto$$serializer.INSTANCE
            java.lang.Object r9 = r0.mo24885n(r1, r3, r4, r9)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x00fc
        L_0x0083:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto$$serializer.INSTANCE
            r3 = 9
            java.lang.Object r5 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 512(0x200, float:7.175E-43)
            r4 = r3
            r3 = 10
            goto L_0x006a
        L_0x0091:
            r3 = 9
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 8
            java.lang.Object r6 = r0.mo24885n(r1, r3, r4, r6)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00fa
        L_0x009e:
            r3 = 8
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 7
            java.lang.Object r7 = r0.mo24885n(r1, r3, r4, r7)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00fa
        L_0x00aa:
            r3 = 7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = 6
            java.lang.Object r10 = r0.mo24885n(r1, r3, r4, r10)
            r2 = r2 | 64
            goto L_0x00fa
        L_0x00b5:
            r3 = 6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r3 = 5
            java.lang.Object r8 = r0.mo24885n(r1, r3, r4, r8)
            r2 = r2 | 32
            goto L_0x00fa
        L_0x00c0:
            r3 = 5
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 4
            java.lang.Object r11 = r0.mo24885n(r1, r3, r4, r11)
            r2 = r2 | 16
            goto L_0x00fa
        L_0x00cb:
            r3 = 4
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 3
            java.lang.Object r12 = r0.mo24885n(r1, r3, r4, r12)
            r2 = r2 | 8
            goto L_0x00fa
        L_0x00d6:
            r3 = 3
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 2
            java.lang.Object r13 = r0.mo24885n(r1, r3, r4, r13)
            r2 = r2 | 4
            goto L_0x00fa
        L_0x00e1:
            r3 = 2
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 1
            java.lang.Object r15 = r0.mo24885n(r1, r3, r4, r15)
            r2 = r2 | 2
            goto L_0x00fa
        L_0x00ec:
            r3 = 1
            kotlinx.serialization.internal.h0 r4 = kotlinx.serialization.internal.C12276h0.f30067a
            r3 = 0
            java.lang.Object r14 = r0.mo24885n(r1, r3, r4, r14)
            r2 = r2 | 1
            goto L_0x00fa
        L_0x00f7:
            r3 = 0
            r24 = r3
        L_0x00fa:
            r3 = 10
        L_0x00fc:
            r4 = 9
            goto L_0x006a
        L_0x0100:
            r4 = r5
            r5 = r7
            r7 = r8
            r3 = r9
            r8 = r12
            r12 = r15
            r9 = r6
            r6 = r10
            r10 = r11
            r11 = r13
            r27 = r14
            r14 = r2
            r2 = r27
        L_0x010f:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf
            r15 = r2
            java.lang.Integer r15 = (java.lang.Integer) r15
            r16 = r12
            java.lang.String r16 = (java.lang.String) r16
            r17 = r11
            java.lang.String r17 = (java.lang.String) r17
            r18 = r8
            java.lang.String r18 = (java.lang.String) r18
            r19 = r10
            java.lang.String r19 = (java.lang.String) r19
            r20 = r7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r20 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r20
            r21 = r6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r21 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r21
            r22 = r5
            java.lang.String r22 = (java.lang.String) r22
            r23 = r9
            java.lang.String r23 = (java.lang.String) r23
            r24 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto r24 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto) r24
            r25 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto r25 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto) r25
            r26 = 0
            r13 = r0
            r13.<init>((int) r14, (java.lang.Integer) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r20, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r21, (java.lang.String) r22, (java.lang.String) r23, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto) r24, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCtaImageDto) r25, (kotlinx.serialization.internal.C12295n1) r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB59PushImageDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB59PushImageDtoAllOf bffB59PushImageDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB59PushImageDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB59PushImageDtoAllOf.write$Self(bffB59PushImageDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
