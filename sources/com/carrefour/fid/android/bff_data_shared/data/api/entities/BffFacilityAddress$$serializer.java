package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.util.C9650g;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffFacilityAddress$$serializer implements C12327y<BffFacilityAddress> {
    @C12579k
    public static final BffFacilityAddress$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffFacilityAddress$$serializer bffFacilityAddress$$serializer = new BffFacilityAddress$$serializer();
        INSTANCE = bffFacilityAddress$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress", bffFacilityAddress$$serializer, 14);
        pluginGeneratedSerialDescriptor.mo24966k("street_address_one", true);
        pluginGeneratedSerialDescriptor.mo24966k("street_address_two", true);
        pluginGeneratedSerialDescriptor.mo24966k("street_address_three", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9650g.f26444g, true);
        pluginGeneratedSerialDescriptor.mo24966k("city_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("country", true);
        pluginGeneratedSerialDescriptor.mo24966k("country_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("postal_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("department", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9650g.f26445h, true);
        pluginGeneratedSerialDescriptor.mo24966k("city_insee_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("department_insee_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("region_insee_code", true);
        pluginGeneratedSerialDescriptor.mo24966k("geo_coordinates", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffFacilityAddress$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffGeoCoordinates$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x013a, code lost:
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0160, code lost:
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0188, code lost:
        r3 = r19;
        r18 = r2;
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r38) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r37.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r5 = 11
            r6 = 10
            r7 = 9
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 3
            r12 = 8
            r13 = 4
            r14 = 2
            r15 = 1
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0076
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r4)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r2, r4)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r2, r4)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r4)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r2, r4)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r2, r4)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r4)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r4)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r4)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r4)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r2, r4)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r4)
            r17 = r3
            r3 = 12
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r4)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates$$serializer.INSTANCE
            r16 = r15
            r15 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r15, r3, r4)
            r4 = 16383(0x3fff, float:2.2957E-41)
            r19 = r3
            r21 = r4
            r15 = r16
            r3 = r17
            goto L_0x01ab
        L_0x0076:
            r2 = r15
            r15 = 13
            r30 = r2
            r2 = r4
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r18 = r14
            r29 = r18
            r4 = r3
            r3 = r29
        L_0x008d:
            if (r30 == 0) goto L_0x0192
            int r15 = r0.mo24931o(r1)
            switch(r15) {
                case -1: goto L_0x017d;
                case 0: goto L_0x0166;
                case 1: goto L_0x014e;
                case 2: goto L_0x013d;
                case 3: goto L_0x012e;
                case 4: goto L_0x0121;
                case 5: goto L_0x0114;
                case 6: goto L_0x0107;
                case 7: goto L_0x00f9;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00db;
                case 10: goto L_0x00cc;
                case 11: goto L_0x00bc;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009c;
                default: goto L_0x0096;
            }
        L_0x0096:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r15)
            throw r0
        L_0x009c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates$$serializer r15 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates$$serializer.INSTANCE
            r32 = r2
            r2 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r2, r15, r3)
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r15 = r2
            r2 = r32
            goto L_0x008d
        L_0x00ac:
            r32 = r2
            r2 = 13
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 12
            java.lang.Object r5 = r0.mo24885n(r1, r2, r15, r5)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            goto L_0x013a
        L_0x00bc:
            r32 = r2
            r2 = 12
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 11
            java.lang.Object r6 = r0.mo24885n(r1, r2, r15, r6)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x013a
        L_0x00cc:
            r32 = r2
            r2 = 11
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 10
            java.lang.Object r7 = r0.mo24885n(r1, r2, r15, r7)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x013a
        L_0x00db:
            r32 = r2
            r2 = 10
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 9
            java.lang.Object r12 = r0.mo24885n(r1, r2, r15, r12)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x013a
        L_0x00ea:
            r32 = r2
            r2 = 9
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 8
            java.lang.Object r8 = r0.mo24885n(r1, r2, r15, r8)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x013a
        L_0x00f9:
            r32 = r2
            r2 = 8
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 7
            java.lang.Object r9 = r0.mo24885n(r1, r2, r15, r9)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x013a
        L_0x0107:
            r32 = r2
            r2 = 7
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 6
            java.lang.Object r10 = r0.mo24885n(r1, r2, r15, r10)
            r4 = r4 | 64
            goto L_0x013a
        L_0x0114:
            r32 = r2
            r2 = 6
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 5
            java.lang.Object r13 = r0.mo24885n(r1, r2, r15, r13)
            r4 = r4 | 32
            goto L_0x013a
        L_0x0121:
            r32 = r2
            r2 = 5
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 4
            java.lang.Object r11 = r0.mo24885n(r1, r2, r15, r11)
            r4 = r4 | 16
            goto L_0x013a
        L_0x012e:
            r32 = r2
            r2 = 4
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 3
            java.lang.Object r14 = r0.mo24885n(r1, r2, r15, r14)
            r4 = r4 | 8
        L_0x013a:
            r2 = r32
            goto L_0x0162
        L_0x013d:
            r32 = r2
            r2 = 3
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r19 = r3
            r2 = r32
            r3 = 2
            java.lang.Object r2 = r0.mo24885n(r1, r3, r15, r2)
            r4 = r4 | 4
            goto L_0x0160
        L_0x014e:
            r19 = r3
            r3 = 2
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r2
            r3 = r29
            r2 = 1
            java.lang.Object r29 = r0.mo24885n(r1, r2, r15, r3)
            r4 = r4 | 2
            r2 = r17
        L_0x0160:
            r3 = r19
        L_0x0162:
            r15 = 13
            goto L_0x008d
        L_0x0166:
            r17 = r2
            r19 = r3
            r3 = r29
            r2 = 1
            kotlinx.serialization.internal.s1 r15 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = r18
            r18 = r3
            r3 = 0
            java.lang.Object r2 = r0.mo24885n(r1, r3, r15, r2)
            r4 = r4 | 1
            r29 = r18
            goto L_0x0188
        L_0x017d:
            r17 = r2
            r19 = r3
            r2 = r18
            r18 = r29
            r3 = 0
            r30 = r3
        L_0x0188:
            r3 = r19
            r15 = 13
            r18 = r2
            r2 = r17
            goto L_0x008d
        L_0x0192:
            r17 = r2
            r19 = r3
            r2 = r18
            r18 = r29
            r3 = r2
            r21 = r4
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r15 = r18
            r12 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r13 = r11
            r11 = r14
            r14 = r17
        L_0x01ab:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress
            r20 = r0
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            r23 = r15
            java.lang.String r23 = (java.lang.String) r23
            r24 = r14
            java.lang.String r24 = (java.lang.String) r24
            r25 = r11
            java.lang.String r25 = (java.lang.String) r25
            r26 = r13
            java.lang.String r26 = (java.lang.String) r26
            r27 = r10
            java.lang.String r27 = (java.lang.String) r27
            r28 = r9
            java.lang.String r28 = (java.lang.String) r28
            r29 = r8
            java.lang.String r29 = (java.lang.String) r29
            r30 = r12
            java.lang.String r30 = (java.lang.String) r30
            r31 = r7
            java.lang.String r31 = (java.lang.String) r31
            r32 = r6
            java.lang.String r32 = (java.lang.String) r32
            r33 = r5
            java.lang.String r33 = (java.lang.String) r33
            r34 = r2
            java.lang.String r34 = (java.lang.String) r34
            r35 = r19
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates r35 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates) r35
            r36 = 0
            r20.<init>((int) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffGeoCoordinates) r35, (kotlinx.serialization.internal.C12295n1) r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffFacilityAddress bffFacilityAddress) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffFacilityAddress, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffFacilityAddress.write$Self(bffFacilityAddress, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
