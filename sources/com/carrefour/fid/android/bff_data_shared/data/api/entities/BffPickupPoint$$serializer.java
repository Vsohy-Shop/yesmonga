package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.analytics.location.C35563d;
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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffPickupPoint$$serializer implements C12327y<BffPickupPoint> {
    @C12579k
    public static final BffPickupPoint$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffPickupPoint$$serializer bffPickupPoint$$serializer = new BffPickupPoint$$serializer();
        INSTANCE = bffPickupPoint$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint", bffPickupPoint$$serializer, 20);
        pluginGeneratedSerialDescriptor.mo24966k("country_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("distance", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_carrefour", true);
        pluginGeneratedSerialDescriptor.mo24966k(C35563d.f87833T0, true);
        pluginGeneratedSerialDescriptor.mo24966k(C35563d.f87834U0, true);
        pluginGeneratedSerialDescriptor.mo24966k("location_key", true);
        pluginGeneratedSerialDescriptor.mo24966k("opening_week_pattern", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_financial_key", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_gln_key", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_internal_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_provider", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_provider_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_point_provider_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("pickup_return_flag", true);
        pluginGeneratedSerialDescriptor.mo24966k("postal_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("street_address_one", true);
        pluginGeneratedSerialDescriptor.mo24966k("street_address_two", true);
        pluginGeneratedSerialDescriptor.mo24966k("town", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffPickupPoint$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffPickupPoint.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[1]), C12197a.m48817q(C12278i.f30070a), C12197a.m48817q(access$get$childSerializers$cp[3]), C12197a.m48817q(access$get$childSerializers$cp[4]), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[6]), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x02a1, code lost:
        r12 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x032a, code lost:
        r12 = r16;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x032e, code lost:
        r3 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x037b, code lost:
        r12 = r16;
        r4 = r30;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r48) {
        /*
            r47 = this;
            r0 = r48
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r47.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint.$childSerializers
            boolean r3 = r0.mo24886p()
            r13 = 9
            r14 = 7
            r15 = 5
            r5 = 8
            r6 = 2
            r4 = 6
            r7 = 3
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x00b4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r10, r3, r11)
            r12 = r2[r9]
            java.lang.Object r9 = r0.mo24885n(r1, r9, r12, r11)
            kotlinx.serialization.internal.i r12 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r6 = r0.mo24885n(r1, r6, r12, r11)
            r12 = r2[r7]
            java.lang.Object r7 = r0.mo24885n(r1, r7, r12, r11)
            r12 = r2[r8]
            java.lang.Object r8 = r0.mo24885n(r1, r8, r12, r11)
            java.lang.Object r12 = r0.mo24885n(r1, r15, r3, r11)
            r2 = r2[r4]
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r11)
            java.lang.Object r4 = r0.mo24885n(r1, r14, r3, r11)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r11)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r3, r11)
            r14 = 10
            java.lang.Object r14 = r0.mo24885n(r1, r14, r3, r11)
            r15 = 11
            java.lang.Object r15 = r0.mo24885n(r1, r15, r3, r11)
            r23 = r2
            r2 = 12
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r22 = r2
            r2 = 13
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r21 = r2
            r2 = 14
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r20 = r2
            r2 = 15
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r19 = r2
            r2 = 16
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r18 = r2
            r2 = 17
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r17 = r2
            r2 = 18
            java.lang.Object r2 = r0.mo24885n(r1, r2, r3, r11)
            r16 = r10
            r10 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r10, r3, r11)
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r24 = r10
            r10 = r16
            r16 = r3
            r3 = r2
            r2 = r23
            goto L_0x03dd
        L_0x00b4:
            r3 = r10
            r10 = 19
            r43 = r9
            r4 = r11
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r12 = r9
            r13 = r12
            r14 = r13
            r15 = r14
            r34 = r15
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r11 = r3
            r3 = r42
        L_0x00d8:
            if (r43 == 0) goto L_0x03a8
            int r10 = r0.mo24931o(r1)
            switch(r10) {
                case -1: goto L_0x0383;
                case 0: goto L_0x0355;
                case 1: goto L_0x0331;
                case 2: goto L_0x0309;
                case 3: goto L_0x02e8;
                case 4: goto L_0x02c7;
                case 5: goto L_0x02a5;
                case 6: goto L_0x0284;
                case 7: goto L_0x0264;
                case 8: goto L_0x0243;
                case 9: goto L_0x0221;
                case 10: goto L_0x01ff;
                case 11: goto L_0x01d7;
                case 12: goto L_0x01b1;
                case 13: goto L_0x018d;
                case 14: goto L_0x016b;
                case 15: goto L_0x0149;
                case 16: goto L_0x012a;
                case 17: goto L_0x010d;
                case 18: goto L_0x00f8;
                case 19: goto L_0x00e7;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r10)
            throw r0
        L_0x00e7:
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r45 = r3
            r3 = 19
            java.lang.Object r12 = r0.mo24885n(r1, r3, r10, r12)
            r10 = 524288(0x80000, float:7.34684E-40)
            r11 = r11 | r10
            r10 = r3
            r3 = r45
            goto L_0x00d8
        L_0x00f8:
            r45 = r3
            r3 = 19
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r16 = r12
            r3 = r41
            r12 = 18
            java.lang.Object r41 = r0.mo24885n(r1, r12, r10, r3)
            r3 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 | r3
            goto L_0x02a1
        L_0x010d:
            r45 = r3
            r16 = r12
            r3 = r41
            r12 = 18
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r3
            r12 = r40
            r3 = 17
            java.lang.Object r40 = r0.mo24885n(r1, r3, r10, r12)
            r10 = 131072(0x20000, float:1.83671E-40)
            r11 = r11 | r10
            r12 = r16
            r41 = r17
            goto L_0x032e
        L_0x012a:
            r45 = r3
            r16 = r12
            r12 = r40
            r17 = r41
            r3 = 17
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r12
            r3 = r39
            r12 = 16
            java.lang.Object r39 = r0.mo24885n(r1, r12, r10, r3)
            r3 = 65536(0x10000, float:9.18355E-41)
            r11 = r11 | r3
            r12 = r16
            r40 = r18
            goto L_0x032e
        L_0x0149:
            r45 = r3
            r16 = r12
            r3 = r39
            r18 = r40
            r17 = r41
            r12 = 16
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r19 = r3
            r12 = r38
            r3 = 15
            java.lang.Object r38 = r0.mo24885n(r1, r3, r10, r12)
            r10 = 32768(0x8000, float:4.5918E-41)
            r11 = r11 | r10
            r12 = r16
            r39 = r19
            goto L_0x032e
        L_0x016b:
            r45 = r3
            r16 = r12
            r12 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 15
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r20 = r12
            r3 = r37
            r12 = 14
            java.lang.Object r37 = r0.mo24885n(r1, r12, r10, r3)
            r11 = r11 | 16384(0x4000, float:2.2959E-41)
            r12 = r16
            r38 = r20
            goto L_0x032e
        L_0x018d:
            r45 = r3
            r16 = r12
            r3 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r12 = 14
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r21 = r3
            r12 = r36
            r3 = 13
            java.lang.Object r36 = r0.mo24885n(r1, r3, r10, r12)
            r11 = r11 | 8192(0x2000, float:1.14794E-41)
            r12 = r16
            r37 = r21
            goto L_0x032e
        L_0x01b1:
            r45 = r3
            r16 = r12
            r12 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 13
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r12
            r3 = r35
            r12 = 12
            java.lang.Object r35 = r0.mo24885n(r1, r12, r10, r3)
            r11 = r11 | 4096(0x1000, float:5.74E-42)
            r12 = r16
            r36 = r22
            goto L_0x032e
        L_0x01d7:
            r45 = r3
            r16 = r12
            r3 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r12 = 12
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r3
            r12 = r34
            r3 = 11
            java.lang.Object r34 = r0.mo24885n(r1, r3, r10, r12)
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r12 = r16
            r35 = r23
            goto L_0x032e
        L_0x01ff:
            r45 = r3
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 11
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 10
            java.lang.Object r13 = r0.mo24885n(r1, r3, r10, r13)
            r11 = r11 | 1024(0x400, float:1.435E-42)
            goto L_0x02a1
        L_0x0221:
            r45 = r3
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 10
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 9
            java.lang.Object r5 = r0.mo24885n(r1, r3, r10, r5)
            r11 = r11 | 512(0x200, float:7.175E-43)
            goto L_0x02a1
        L_0x0243:
            r45 = r3
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 9
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 8
            java.lang.Object r14 = r0.mo24885n(r1, r3, r10, r14)
            r11 = r11 | 256(0x100, float:3.59E-43)
            goto L_0x02a1
        L_0x0264:
            r45 = r3
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 8
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = 7
            java.lang.Object r4 = r0.mo24885n(r1, r3, r10, r4)
            r11 = r11 | 128(0x80, float:1.794E-43)
            goto L_0x02a1
        L_0x0284:
            r45 = r3
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r10 = 6
            r3 = r2[r10]
            java.lang.Object r15 = r0.mo24885n(r1, r10, r3, r15)
            r11 = r11 | 64
        L_0x02a1:
            r12 = r16
            goto L_0x032e
        L_0x02a5:
            r45 = r3
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r10 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r4
            r4 = 5
            java.lang.Object r8 = r0.mo24885n(r1, r4, r3, r8)
            r11 = r11 | 32
            goto L_0x032a
        L_0x02c7:
            r45 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 4
            r10 = 6
            r4 = r2[r3]
            java.lang.Object r7 = r0.mo24885n(r1, r3, r4, r7)
            r11 = r11 | 16
            goto L_0x032a
        L_0x02e8:
            r45 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r4 = 3
            r10 = 6
            r3 = r2[r4]
            java.lang.Object r6 = r0.mo24885n(r1, r4, r3, r6)
            r11 = r11 | 8
            goto L_0x032a
        L_0x0309:
            r45 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r4 = 3
            r10 = 6
            kotlinx.serialization.internal.i r3 = kotlinx.serialization.internal.C12278i.f30070a
            r4 = 2
            java.lang.Object r9 = r0.mo24885n(r1, r4, r3, r9)
            r11 = r11 | 4
        L_0x032a:
            r12 = r16
            r4 = r30
        L_0x032e:
            r3 = r45
            goto L_0x037f
        L_0x0331:
            r45 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 1
            r10 = 6
            r4 = r2[r3]
            r10 = r45
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r10)
            r11 = r11 | 2
            r3 = r4
            goto L_0x037b
        L_0x0355:
            r10 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = 1
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r48 = r2
            r3 = r42
            r2 = 0
            java.lang.Object r42 = r0.mo24885n(r1, r2, r4, r3)
            r11 = r11 | 1
            r2 = r48
            r3 = r10
        L_0x037b:
            r12 = r16
            r4 = r30
        L_0x037f:
            r10 = 19
            goto L_0x00d8
        L_0x0383:
            r48 = r2
            r10 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = r42
            r2 = 0
            r43 = r2
            r3 = r10
            r12 = r16
            r10 = 19
            r2 = r48
            goto L_0x00d8
        L_0x03a8:
            r10 = r3
            r30 = r4
            r16 = r12
            r12 = r34
            r23 = r35
            r22 = r36
            r21 = r37
            r20 = r38
            r19 = r39
            r18 = r40
            r17 = r41
            r3 = r42
            r24 = r11
            r2 = r15
            r15 = r12
            r12 = r8
            r8 = r7
            r7 = r6
            r6 = r9
            r9 = r10
            r10 = r3
            r3 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r46 = r13
            r13 = r5
            r5 = r14
            r14 = r46
        L_0x03dd:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint
            r23 = r0
            r25 = r10
            java.lang.String r25 = (java.lang.String) r25
            r26 = r9
            java.math.BigDecimal r26 = (java.math.BigDecimal) r26
            r27 = r6
            java.lang.Boolean r27 = (java.lang.Boolean) r27
            r28 = r7
            java.math.BigDecimal r28 = (java.math.BigDecimal) r28
            r29 = r8
            java.math.BigDecimal r29 = (java.math.BigDecimal) r29
            r30 = r12
            java.lang.String r30 = (java.lang.String) r30
            r31 = r2
            java.util.List r31 = (java.util.List) r31
            r32 = r4
            java.lang.String r32 = (java.lang.String) r32
            r33 = r5
            java.lang.String r33 = (java.lang.String) r33
            r34 = r13
            java.lang.String r34 = (java.lang.String) r34
            r35 = r14
            java.lang.String r35 = (java.lang.String) r35
            r36 = r15
            java.lang.String r36 = (java.lang.String) r36
            r37 = r22
            java.lang.String r37 = (java.lang.String) r37
            r38 = r21
            java.lang.String r38 = (java.lang.String) r38
            r39 = r20
            java.lang.String r39 = (java.lang.String) r39
            r40 = r19
            java.lang.String r40 = (java.lang.String) r40
            r41 = r18
            java.lang.String r41 = (java.lang.String) r41
            r42 = r17
            java.lang.String r42 = (java.lang.String) r42
            r43 = r3
            java.lang.String r43 = (java.lang.String) r43
            r44 = r16
            java.lang.String r44 = (java.lang.String) r44
            r45 = 0
            r23.<init>((int) r24, (java.lang.String) r25, (java.math.BigDecimal) r26, (java.lang.Boolean) r27, (java.math.BigDecimal) r28, (java.math.BigDecimal) r29, (java.lang.String) r30, (java.util.List) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (java.lang.String) r35, (java.lang.String) r36, (java.lang.String) r37, (java.lang.String) r38, (java.lang.String) r39, (java.lang.String) r40, (java.lang.String) r41, (java.lang.String) r42, (java.lang.String) r43, (java.lang.String) r44, (kotlinx.serialization.internal.C12295n1) r45)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffPickupPoint bffPickupPoint) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffPickupPoint, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffPickupPoint.write$Self(bffPickupPoint, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
