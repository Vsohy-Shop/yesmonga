package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffDiscount$$serializer implements C12327y<BffDiscount> {
    @C12579k
    public static final BffDiscount$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffDiscount$$serializer bffDiscount$$serializer = new BffDiscount$$serializer();
        INSTANCE = bffDiscount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount", bffDiscount$$serializer, 13);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78959k, true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78961l, true);
        pluginGeneratedSerialDescriptor.mo24966k("label", true);
        pluginGeneratedSerialDescriptor.mo24966k("forced_price", true);
        pluginGeneratedSerialDescriptor.mo24966k("buffer_promo", true);
        pluginGeneratedSerialDescriptor.mo24966k("type", true);
        pluginGeneratedSerialDescriptor.mo24966k("deals", true);
        pluginGeneratedSerialDescriptor.mo24966k("limit", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_displayed_as_promo", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_promotion", true);
        pluginGeneratedSerialDescriptor.mo24966k("store", true);
        pluginGeneratedSerialDescriptor.mo24966k("gtins", true);
        pluginGeneratedSerialDescriptor.mo24966k("bundle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffDiscount$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffDiscount.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        C12276h0 h0Var = C12276h0.f30067a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[6]), C12197a.m48817q(BffLimit$$serializer.INSTANCE), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[10]), C12197a.m48817q(access$get$childSerializers$cp[11]), C12197a.m48817q(access$get$childSerializers$cp[12])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x015c, code lost:
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x015e, code lost:
        r13 = r30;
        r11 = r31;
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0197, code lost:
        r3 = 12;
        r11 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01ab, code lost:
        r2 = r23;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r33.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount.$childSerializers
            boolean r3 = r0.mo24886p()
            r4 = 9
            r5 = 7
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r14 = 6
            r15 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x007b
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r11 = r0.mo24885n(r1, r11, r3, r12)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r3, r12)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r3, r12)
            kotlinx.serialization.internal.h0 r13 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r7 = r0.mo24885n(r1, r7, r13, r12)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r13, r12)
            java.lang.Object r3 = r0.mo24885n(r1, r6, r3, r12)
            r6 = r2[r14]
            java.lang.Object r6 = r0.mo24885n(r1, r14, r6, r12)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer.INSTANCE
            java.lang.Object r5 = r0.mo24885n(r1, r5, r13, r12)
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r13, r12)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r13, r12)
            r13 = 10
            r14 = r2[r13]
            java.lang.Object r13 = r0.mo24885n(r1, r13, r14, r12)
            r16 = r3
            r14 = 11
            r3 = r2[r14]
            java.lang.Object r3 = r0.mo24885n(r1, r14, r3, r12)
            r14 = 12
            r2 = r2[r14]
            java.lang.Object r2 = r0.mo24885n(r1, r14, r2, r12)
            r12 = 8191(0x1fff, float:1.1478E-41)
            r14 = r12
            r12 = r11
            r11 = r3
            r3 = r16
            goto L_0x01c6
        L_0x007b:
            r3 = 12
            r4 = r12
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r13 = r10
            r14 = r13
            r27 = r14
            r28 = r27
            r29 = r15
            r12 = r11
            r11 = r28
            r15 = r11
        L_0x0090:
            if (r29 == 0) goto L_0x01af
            r30 = r13
            int r13 = r0.mo24931o(r1)
            switch(r13) {
                case -1: goto L_0x019b;
                case 0: goto L_0x0180;
                case 1: goto L_0x0166;
                case 2: goto L_0x014b;
                case 3: goto L_0x0139;
                case 4: goto L_0x0127;
                case 5: goto L_0x0116;
                case 6: goto L_0x0108;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00d4;
                case 10: goto L_0x00c4;
                case 11: goto L_0x00b2;
                case 12: goto L_0x00a1;
                default: goto L_0x009b;
            }
        L_0x009b:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r13)
            throw r0
        L_0x00a1:
            r13 = r2[r3]
            r31 = r11
            r11 = r28
            java.lang.Object r28 = r0.mo24885n(r1, r3, r13, r11)
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r13 = r30
            r11 = r31
            goto L_0x0090
        L_0x00b2:
            r31 = r11
            r11 = r28
            r13 = 11
            r3 = r2[r13]
            r11 = r27
            java.lang.Object r27 = r0.mo24885n(r1, r13, r3, r11)
            r12 = r12 | 2048(0x800, float:2.87E-42)
            goto L_0x015e
        L_0x00c4:
            r31 = r11
            r11 = r27
            r3 = 10
            r13 = r2[r3]
            java.lang.Object r4 = r0.mo24885n(r1, r3, r13, r4)
            r12 = r12 | 1024(0x400, float:1.435E-42)
            goto L_0x015e
        L_0x00d4:
            r31 = r11
            r11 = r27
            r3 = 10
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 9
            java.lang.Object r8 = r0.mo24885n(r1, r3, r13, r8)
            r12 = r12 | 512(0x200, float:7.175E-43)
            goto L_0x015e
        L_0x00e6:
            r31 = r11
            r11 = r27
            r3 = 9
            kotlinx.serialization.internal.i r13 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = 8
            java.lang.Object r5 = r0.mo24885n(r1, r3, r13, r5)
            r12 = r12 | 256(0x100, float:3.59E-43)
            goto L_0x015e
        L_0x00f8:
            r31 = r11
            r11 = r27
            r3 = 8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer r13 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer.INSTANCE
            r3 = 7
            java.lang.Object r14 = r0.mo24885n(r1, r3, r13, r14)
            r12 = r12 | 128(0x80, float:1.794E-43)
            goto L_0x015e
        L_0x0108:
            r31 = r11
            r11 = r27
            r13 = 6
            r3 = r2[r13]
            java.lang.Object r6 = r0.mo24885n(r1, r13, r3, r6)
            r12 = r12 | 64
            goto L_0x015e
        L_0x0116:
            r31 = r11
            r11 = r27
            r13 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r2
            r2 = 5
            java.lang.Object r9 = r0.mo24885n(r1, r2, r3, r9)
            r12 = r12 | 32
            goto L_0x015c
        L_0x0127:
            r23 = r2
            r31 = r11
            r11 = r27
            r2 = 5
            r13 = 6
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 4
            java.lang.Object r7 = r0.mo24885n(r1, r2, r3, r7)
            r12 = r12 | 16
            goto L_0x015c
        L_0x0139:
            r23 = r2
            r31 = r11
            r11 = r27
            r2 = 4
            r13 = 6
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 3
            java.lang.Object r10 = r0.mo24885n(r1, r2, r3, r10)
            r12 = r12 | 8
            goto L_0x015c
        L_0x014b:
            r23 = r2
            r31 = r11
            r11 = r27
            r2 = 3
            r13 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 2
            java.lang.Object r15 = r0.mo24885n(r1, r2, r3, r15)
            r12 = r12 | 4
        L_0x015c:
            r2 = r23
        L_0x015e:
            r13 = r30
            r11 = r31
            r3 = 12
            goto L_0x0090
        L_0x0166:
            r23 = r2
            r31 = r11
            r11 = r27
            r2 = 2
            r13 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r4
            r2 = r31
            r4 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r4, r3, r2)
            r12 = r12 | 2
            r4 = r18
            r13 = r30
            goto L_0x0197
        L_0x0180:
            r23 = r2
            r18 = r4
            r2 = r11
            r11 = r27
            r4 = 1
            r13 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r4 = r30
            r13 = 0
            java.lang.Object r3 = r0.mo24885n(r1, r13, r3, r4)
            r12 = r12 | 1
            r13 = r3
            r4 = r18
        L_0x0197:
            r3 = 12
            r11 = r2
            goto L_0x01ab
        L_0x019b:
            r23 = r2
            r18 = r4
            r2 = r11
            r11 = r27
            r4 = r30
            r13 = 0
            r29 = r13
            r11 = r2
            r13 = r4
            r4 = r18
        L_0x01ab:
            r2 = r23
            goto L_0x0090
        L_0x01af:
            r18 = r4
            r2 = r11
            r4 = r13
            r11 = r27
            r3 = r9
            r13 = r18
            r9 = r7
            r7 = r10
            r10 = r15
            r15 = r2
            r2 = r28
            r32 = r12
            r12 = r4
            r4 = r8
            r8 = r5
            r5 = r14
            r14 = r32
        L_0x01c6:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            r16 = r15
            java.lang.String r16 = (java.lang.String) r16
            r17 = r10
            java.lang.String r17 = (java.lang.String) r17
            r18 = r7
            java.lang.Integer r18 = (java.lang.Integer) r18
            r19 = r9
            java.lang.Integer r19 = (java.lang.Integer) r19
            r20 = r3
            java.lang.String r20 = (java.lang.String) r20
            r21 = r6
            java.util.List r21 = (java.util.List) r21
            r22 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit r22 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit) r22
            r23 = r8
            java.lang.Boolean r23 = (java.lang.Boolean) r23
            r24 = r4
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            r25 = r13
            java.util.List r25 = (java.util.List) r25
            r26 = r11
            java.util.List r26 = (java.util.List) r26
            r27 = r2
            java.util.List r27 = (java.util.List) r27
            r28 = 0
            r13 = r0
            r15 = r1
            r13.<init>((int) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.Integer) r18, (java.lang.Integer) r19, (java.lang.String) r20, (java.util.List) r21, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit) r22, (java.lang.Boolean) r23, (java.lang.Boolean) r24, (java.util.List) r25, (java.util.List) r26, (java.util.List) r27, (kotlinx.serialization.internal.C12295n1) r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffDiscount bffDiscount) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffDiscount, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffDiscount.write$Self(bffDiscount, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
