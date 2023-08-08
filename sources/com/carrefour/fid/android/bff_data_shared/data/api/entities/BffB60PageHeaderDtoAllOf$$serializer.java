package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffB60PageHeaderDtoAllOf.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffB60PageHeaderDtoAllOf;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffB60PageHeaderDtoAllOf$$serializer implements C12327y<BffB60PageHeaderDtoAllOf> {
    @C12579k
    public static final BffB60PageHeaderDtoAllOf$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffB60PageHeaderDtoAllOf$$serializer bffB60PageHeaderDtoAllOf$$serializer = new BffB60PageHeaderDtoAllOf$$serializer();
        INSTANCE = bffB60PageHeaderDtoAllOf$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf", bffB60PageHeaderDtoAllOf$$serializer, 13);
        pluginGeneratedSerialDescriptor.mo24966k(C13814a.f33702X0, true);
        pluginGeneratedSerialDescriptor.mo24966k("title", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("subhead_title", true);
        pluginGeneratedSerialDescriptor.mo24966k("text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("block_position", true);
        pluginGeneratedSerialDescriptor.mo24966k("bg_color", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("image_mobile", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta1", true);
        pluginGeneratedSerialDescriptor.mo24966k("cta2", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto", true);
        pluginGeneratedSerialDescriptor.mo24966k("picto_link", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffB60PageHeaderDtoAllOf$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        BffImageDto$$serializer bffImageDto$$serializer = BffImageDto$$serializer.INSTANCE;
        BffUrlDto$$serializer bffUrlDto$$serializer = BffUrlDto$$serializer.INSTANCE;
        return new C12248g[]{C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(bffUrlDto$$serializer), C12197a.m48817q(bffImageDto$$serializer), C12197a.m48817q(bffUrlDto$$serializer)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0172, code lost:
        r5 = r23;
        r3 = r25;
        r15 = r15;
        r12 = r12;
        r10 = r10;
        r9 = r9;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0196, code lost:
        r5 = r23;
        r4 = r25;
        r15 = r15;
        r12 = r12;
        r10 = r10;
        r9 = r9;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x019a, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r15 = r15;
        r12 = r12;
        r10 = r10;
        r9 = r9;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        r15 = r15;
        r12 = r12;
        r10 = r10;
        r9 = r9;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r27.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r5 = 10
            r6 = 9
            r7 = 7
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 8
            r12 = 4
            r13 = 2
            r14 = 1
            r15 = 0
            r3 = 0
            if (r2 == 0) goto L_0x0077
            kotlinx.serialization.internal.h0 r2 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r2 = r0.mo24885n(r1, r15, r2, r3)
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r14 = r0.mo24885n(r1, r14, r15, r3)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r15, r3)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r15, r3)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r15, r3)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r15, r3)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r15, r3)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            java.lang.Object r7 = r0.mo24885n(r1, r7, r15, r3)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r15, r3)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            java.lang.Object r6 = r0.mo24885n(r1, r6, r4, r3)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r4, r3)
            r17 = r2
            r2 = 11
            java.lang.Object r2 = r0.mo24885n(r1, r2, r15, r3)
            r15 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r15, r4, r3)
            r4 = 8191(0x1fff, float:1.1478E-41)
            r15 = r13
            r25 = r14
            r14 = r10
            r13 = r12
            r12 = r8
            r10 = r9
            r8 = r4
            r9 = r7
            r7 = r6
            r6 = r2
            r2 = r17
            goto L_0x01b0
        L_0x0077:
            r2 = 12
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r24 = r14
            r23 = r15
            r14 = r13
            r15 = r14
        L_0x0089:
            if (r24 == 0) goto L_0x01a0
            int r2 = r0.mo24931o(r1)
            switch(r2) {
                case -1: goto L_0x018c;
                case 0: goto L_0x0177;
                case 1: goto L_0x0162;
                case 2: goto L_0x0151;
                case 3: goto L_0x0140;
                case 4: goto L_0x012f;
                case 5: goto L_0x011e;
                case 6: goto L_0x010d;
                case 7: goto L_0x00fa;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00d2;
                case 10: goto L_0x00be;
                case 11: goto L_0x00ac;
                case 12: goto L_0x0098;
                default: goto L_0x0092;
            }
        L_0x0092:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r2)
            throw r0
        L_0x0098:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r25 = r3
            r3 = 12
            java.lang.Object r5 = r0.mo24885n(r1, r3, r2, r5)
            r2 = r23
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r23 = r2
            r2 = r3
            r3 = r25
            goto L_0x0089
        L_0x00ac:
            r25 = r3
            r2 = r23
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r23 = r5
            r5 = 11
            java.lang.Object r6 = r0.mo24885n(r1, r5, r3, r6)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            goto L_0x0172
        L_0x00be:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 11
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r5 = 10
            java.lang.Object r11 = r0.mo24885n(r1, r5, r3, r11)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x0172
        L_0x00d2:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 10
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto$$serializer.INSTANCE
            r5 = 9
            java.lang.Object r7 = r0.mo24885n(r1, r5, r3, r7)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x0172
        L_0x00e6:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 9
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r5 = 8
            java.lang.Object r8 = r0.mo24885n(r1, r5, r3, r8)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x0172
        L_0x00fa:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto$$serializer.INSTANCE
            r5 = 7
            java.lang.Object r9 = r0.mo24885n(r1, r5, r3, r9)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0172
        L_0x010d:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 6
            java.lang.Object r12 = r0.mo24885n(r1, r5, r3, r12)
            r2 = r2 | 64
            goto L_0x0172
        L_0x011e:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 5
            java.lang.Object r10 = r0.mo24885n(r1, r5, r3, r10)
            r2 = r2 | 32
            goto L_0x0172
        L_0x012f:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 4
            java.lang.Object r13 = r0.mo24885n(r1, r5, r3, r13)
            r2 = r2 | 16
            goto L_0x0172
        L_0x0140:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 3
            java.lang.Object r14 = r0.mo24885n(r1, r5, r3, r14)
            r2 = r2 | 8
            goto L_0x0172
        L_0x0151:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 3
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 2
            java.lang.Object r15 = r0.mo24885n(r1, r5, r3, r15)
            r2 = r2 | 4
            goto L_0x0172
        L_0x0162:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 1
            java.lang.Object r4 = r0.mo24885n(r1, r5, r3, r4)
            r2 = r2 | 2
        L_0x0172:
            r5 = r23
            r3 = r25
            goto L_0x019a
        L_0x0177:
            r25 = r3
            r2 = r23
            r23 = r5
            r5 = 1
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r5 = r25
            r25 = r4
            r4 = 0
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r5)
            r2 = r2 | 1
            goto L_0x0196
        L_0x018c:
            r25 = r4
            r2 = r23
            r4 = 0
            r23 = r5
            r5 = r3
            r24 = r4
        L_0x0196:
            r5 = r23
            r4 = r25
        L_0x019a:
            r23 = r2
            r2 = 12
            goto L_0x0089
        L_0x01a0:
            r25 = r4
            r2 = r23
            r23 = r5
            r5 = r3
            r3 = r23
            r26 = r8
            r8 = r2
            r2 = r5
            r5 = r11
            r11 = r26
        L_0x01b0:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf
            r1 = r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            r4 = r15
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r13 = (java.lang.String) r13
            r15 = r10
            java.lang.String r15 = (java.lang.String) r15
            r16 = r12
            java.lang.String r16 = (java.lang.String) r16
            r17 = r9
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r17 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r17
            r18 = r11
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r18 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r18
            r19 = r7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r19 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r19
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r5 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r5
            r20 = r6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto r20 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r20
            r21 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto r21 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r21
            r22 = 0
            r7 = r0
            r9 = r1
            r10 = r2
            r11 = r4
            r12 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r5
            r7.<init>((int) r8, (java.lang.Integer) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r16, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r17, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r18, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r19, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffImageDto) r20, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUrlDto) r21, (kotlinx.serialization.internal.C12295n1) r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffB60PageHeaderDtoAllOf");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffB60PageHeaderDtoAllOf bffB60PageHeaderDtoAllOf) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffB60PageHeaderDtoAllOf, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffB60PageHeaderDtoAllOf.write$Self(bffB60PageHeaderDtoAllOf, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
