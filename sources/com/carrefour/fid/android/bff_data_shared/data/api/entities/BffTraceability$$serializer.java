package com.carrefour.fid.android.bff_data_shared.data.api.entities;

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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTraceability;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffTraceability$$serializer implements C12327y<BffTraceability> {
    @C12579k
    public static final BffTraceability$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffTraceability$$serializer bffTraceability$$serializer = new BffTraceability$$serializer();
        INSTANCE = bffTraceability$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability", bffTraceability$$serializer, 17);
        pluginGeneratedSerialDescriptor.mo24966k("salt_addition", true);
        pluginGeneratedSerialDescriptor.mo24966k("capture_gear", true);
        pluginGeneratedSerialDescriptor.mo24966k("production_method", true);
        pluginGeneratedSerialDescriptor.mo24966k("latin_fish_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("thawed_products", true);
        pluginGeneratedSerialDescriptor.mo24966k("brine_products", true);
        pluginGeneratedSerialDescriptor.mo24966k("breeding_area", true);
        pluginGeneratedSerialDescriptor.mo24966k("fishing_area", true);
        pluginGeneratedSerialDescriptor.mo24966k("under_fishing_area", true);
        pluginGeneratedSerialDescriptor.mo24966k("caliber", true);
        pluginGeneratedSerialDescriptor.mo24966k("variety", true);
        pluginGeneratedSerialDescriptor.mo24966k("shot_in", true);
        pluginGeneratedSerialDescriptor.mo24966k("age_at_slaughter", true);
        pluginGeneratedSerialDescriptor.mo24966k("category", true);
        pluginGeneratedSerialDescriptor.mo24966k("raised_in", true);
        pluginGeneratedSerialDescriptor.mo24966k("born_in", true);
        pluginGeneratedSerialDescriptor.mo24966k("turned_into", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffTraceability$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01fe, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0200, code lost:
        r4 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x027c, code lost:
        r2 = r16;
        r3 = r22;
        r4 = r35;
        r35 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r43) {
        /*
            r42 = this;
            r0 = r43
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r42.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r7 = 11
            r8 = 10
            r9 = 9
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 3
            r15 = 8
            r14 = 4
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0090
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r6)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r6)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r6)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r2, r6)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r2, r6)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r6)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r6)
            java.lang.Object r10 = r0.mo24885n(r1, r10, r2, r6)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r2, r6)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r6)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r6)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r6)
            r20 = r3
            r3 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r6)
            r19 = r3
            r3 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r6)
            r18 = r3
            r3 = 14
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r6)
            r17 = r3
            r3 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r6)
            r16 = r5
            r5 = 16
            java.lang.Object r2 = r0.mo24885n(r1, r5, r2, r6)
            r5 = 131071(0x1ffff, float:1.8367E-40)
            r22 = r5
            r5 = r16
            r41 = r4
            r4 = r3
            r3 = r20
            r20 = r41
            goto L_0x02b3
        L_0x0090:
            r2 = r5
            r5 = 16
            r36 = r4
            r3 = r6
            r4 = r3
            r7 = r4
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r21 = r15
            r32 = r21
            r33 = r32
            r34 = r33
            r35 = r34
            r6 = r2
            r2 = r35
        L_0x00ad:
            if (r36 == 0) goto L_0x0288
            int r5 = r0.mo24931o(r1)
            switch(r5) {
                case -1: goto L_0x0269;
                case 0: goto L_0x024c;
                case 1: goto L_0x0227;
                case 2: goto L_0x0206;
                case 3: goto L_0x01ea;
                case 4: goto L_0x01d5;
                case 5: goto L_0x01c0;
                case 6: goto L_0x01ab;
                case 7: goto L_0x0195;
                case 8: goto L_0x017d;
                case 9: goto L_0x0165;
                case 10: goto L_0x014d;
                case 11: goto L_0x0135;
                case 12: goto L_0x011d;
                case 13: goto L_0x00ff;
                case 14: goto L_0x00e3;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00bc;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r5)
            throw r0
        L_0x00bc:
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r38 = r4
            r4 = 16
            java.lang.Object r2 = r0.mo24885n(r1, r4, r5, r2)
            r5 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r5
            r5 = r4
            r4 = r38
            goto L_0x00ad
        L_0x00cd:
            r38 = r4
            r4 = 16
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r16 = r2
            r4 = r34
            r2 = 15
            java.lang.Object r34 = r0.mo24885n(r1, r2, r5, r4)
            r4 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r4
            goto L_0x01fe
        L_0x00e3:
            r16 = r2
            r38 = r4
            r4 = r34
            r2 = 15
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r4
            r2 = r33
            r4 = 14
            java.lang.Object r33 = r0.mo24885n(r1, r4, r5, r2)
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r2 = r16
            r34 = r17
            goto L_0x0200
        L_0x00ff:
            r16 = r2
            r38 = r4
            r2 = r33
            r17 = r34
            r4 = 14
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r2
            r4 = r32
            r2 = 13
            java.lang.Object r32 = r0.mo24885n(r1, r2, r5, r4)
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            r2 = r16
            r33 = r18
            goto L_0x0200
        L_0x011d:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 13
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 12
            java.lang.Object r7 = r0.mo24885n(r1, r2, r5, r7)
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            goto L_0x01fe
        L_0x0135:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 12
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 11
            java.lang.Object r8 = r0.mo24885n(r1, r2, r5, r8)
            r6 = r6 | 2048(0x800, float:2.87E-42)
            goto L_0x01fe
        L_0x014d:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 11
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 10
            java.lang.Object r9 = r0.mo24885n(r1, r2, r5, r9)
            r6 = r6 | 1024(0x400, float:1.435E-42)
            goto L_0x01fe
        L_0x0165:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 10
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 9
            java.lang.Object r15 = r0.mo24885n(r1, r2, r5, r15)
            r6 = r6 | 512(0x200, float:7.175E-43)
            goto L_0x01fe
        L_0x017d:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 9
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 8
            java.lang.Object r10 = r0.mo24885n(r1, r2, r5, r10)
            r6 = r6 | 256(0x100, float:3.59E-43)
            goto L_0x01fe
        L_0x0195:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 8
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 7
            java.lang.Object r11 = r0.mo24885n(r1, r2, r5, r11)
            r6 = r6 | 128(0x80, float:1.794E-43)
            goto L_0x01fe
        L_0x01ab:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 7
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 6
            java.lang.Object r12 = r0.mo24885n(r1, r2, r5, r12)
            r6 = r6 | 64
            goto L_0x01fe
        L_0x01c0:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 6
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 5
            java.lang.Object r14 = r0.mo24885n(r1, r2, r5, r14)
            r6 = r6 | 32
            goto L_0x01fe
        L_0x01d5:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 5
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 4
            java.lang.Object r13 = r0.mo24885n(r1, r2, r5, r13)
            r6 = r6 | 16
            goto L_0x01fe
        L_0x01ea:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 4
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 3
            java.lang.Object r3 = r0.mo24885n(r1, r2, r5, r3)
            r6 = r6 | 8
        L_0x01fe:
            r2 = r16
        L_0x0200:
            r4 = r38
            r5 = 16
            goto L_0x00ad
        L_0x0206:
            r16 = r2
            r38 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r2 = 3
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r3
            r2 = r38
            r3 = 2
            java.lang.Object r2 = r0.mo24885n(r1, r3, r5, r2)
            r6 = r6 | 4
            r3 = r22
            r5 = 16
            r4 = r2
            r2 = r16
            goto L_0x00ad
        L_0x0227:
            r16 = r2
            r22 = r3
            r2 = r4
            r4 = r32
            r18 = r33
            r17 = r34
            r3 = 2
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r35
            r35 = r2
            r2 = 1
            java.lang.Object r3 = r0.mo24885n(r1, r2, r5, r3)
            r6 = r6 | 2
            r2 = r16
            r4 = r35
            r5 = 16
            r35 = r3
            r3 = r22
            goto L_0x00ad
        L_0x024c:
            r16 = r2
            r22 = r3
            r18 = r33
            r17 = r34
            r3 = r35
            r2 = 1
            r35 = r4
            r4 = r32
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r20 = r3
            r2 = r21
            r3 = 0
            java.lang.Object r21 = r0.mo24885n(r1, r3, r5, r2)
            r6 = r6 | 1
            goto L_0x027c
        L_0x0269:
            r16 = r2
            r22 = r3
            r2 = r21
            r18 = r33
            r17 = r34
            r20 = r35
            r3 = 0
            r35 = r4
            r4 = r32
            r36 = r3
        L_0x027c:
            r2 = r16
            r3 = r22
            r4 = r35
            r5 = 16
            r35 = r20
            goto L_0x00ad
        L_0x0288:
            r16 = r2
            r22 = r3
            r2 = r21
            r18 = r33
            r17 = r34
            r20 = r35
            r35 = r4
            r4 = r32
            r5 = r2
            r19 = r7
            r7 = r8
            r8 = r9
            r9 = r15
            r2 = r16
            r3 = r35
            r15 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = r13
            r13 = r22
            r22 = r6
            r41 = r18
            r18 = r4
            r4 = r17
            r17 = r41
        L_0x02b3:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability
            r21 = r0
            r23 = r5
            java.lang.String r23 = (java.lang.String) r23
            r24 = r20
            java.lang.String r24 = (java.lang.String) r24
            r25 = r3
            java.lang.String r25 = (java.lang.String) r25
            r26 = r13
            java.lang.String r26 = (java.lang.String) r26
            r27 = r14
            java.lang.String r27 = (java.lang.String) r27
            r28 = r12
            java.lang.String r28 = (java.lang.String) r28
            r29 = r11
            java.lang.String r29 = (java.lang.String) r29
            r30 = r10
            java.lang.String r30 = (java.lang.String) r30
            r31 = r15
            java.lang.String r31 = (java.lang.String) r31
            r32 = r9
            java.lang.String r32 = (java.lang.String) r32
            r33 = r8
            java.lang.String r33 = (java.lang.String) r33
            r34 = r7
            java.lang.String r34 = (java.lang.String) r34
            r35 = r19
            java.lang.String r35 = (java.lang.String) r35
            r36 = r18
            java.lang.String r36 = (java.lang.String) r36
            r37 = r17
            java.lang.String r37 = (java.lang.String) r37
            r38 = r4
            java.lang.String r38 = (java.lang.String) r38
            r39 = r2
            java.lang.String r39 = (java.lang.String) r39
            r40 = 0
            r21.<init>((int) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (java.lang.String) r35, (java.lang.String) r36, (java.lang.String) r37, (java.lang.String) r38, (java.lang.String) r39, (kotlinx.serialization.internal.C12295n1) r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffTraceability bffTraceability) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffTraceability, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffTraceability.write$Self(bffTraceability, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
