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
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;

@C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlot;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffSlot$$serializer implements C12327y<BffSlot> {
    @C12579k
    public static final BffSlot$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffSlot$$serializer bffSlot$$serializer = new BffSlot$$serializer();
        INSTANCE = bffSlot$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot", bffSlot$$serializer, 13);
        pluginGeneratedSerialDescriptor.mo24966k("maximal_capacity", true);
        pluginGeneratedSerialDescriptor.mo24966k("capacity_used", true);
        pluginGeneratedSerialDescriptor.mo24966k("date_begin", true);
        pluginGeneratedSerialDescriptor.mo24966k("date_end", true);
        pluginGeneratedSerialDescriptor.mo24966k("id", true);
        pluginGeneratedSerialDescriptor.mo24966k("status", true);
        pluginGeneratedSerialDescriptor.mo24966k("slice", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_available", true);
        pluginGeneratedSerialDescriptor.mo24966k("cut_off", true);
        pluginGeneratedSerialDescriptor.mo24966k("used_day_capacity", true);
        pluginGeneratedSerialDescriptor.mo24966k("round_reference", true);
        pluginGeneratedSerialDescriptor.mo24966k("delivery_fees", true);
        pluginGeneratedSerialDescriptor.mo24966k("preparation_fees", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffSlot$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffSlot.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffSlot$Status$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(C12278i.f30070a), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[11]), C12197a.m48817q(access$get$childSerializers$cp[12])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0176, code lost:
        r2 = r27;
        r14 = r29;
        r3 = 12;
        r27 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x017e, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01cf, code lost:
        r13 = r2;
        r2 = r27;
        r27 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r35) {
        /*
            r34 = this;
            r0 = r35
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r34.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot.$childSerializers
            boolean r3 = r0.mo24886p()
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r15 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0079
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r13 = r0.mo24885n(r1, r13, r3, r14)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r3, r14)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r3, r14)
            java.lang.Object r9 = r0.mo24885n(r1, r9, r3, r14)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r3, r14)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$Status$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$Status$$serializer.INSTANCE
            java.lang.Object r4 = r0.mo24885n(r1, r8, r4, r14)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r3, r14)
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            java.lang.Object r6 = r0.mo24885n(r1, r6, r8, r14)
            java.lang.Object r8 = r0.mo24885n(r1, r10, r3, r14)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r14)
            r10 = 10
            java.lang.Object r3 = r0.mo24885n(r1, r10, r3, r14)
            r16 = r3
            r10 = 11
            r3 = r2[r10]
            java.lang.Object r3 = r0.mo24885n(r1, r10, r3, r14)
            r10 = 12
            r2 = r2[r10]
            java.lang.Object r2 = r0.mo24885n(r1, r10, r2, r14)
            r10 = 8191(0x1fff, float:1.1478E-41)
            r26 = r3
            r3 = r16
            r31 = r11
            r11 = r10
            r10 = r31
            goto L_0x01f3
        L_0x0079:
            r3 = 12
            r4 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r26 = r13
            r27 = r26
            r28 = r15
            r15 = r27
        L_0x008d:
            if (r28 == 0) goto L_0x01d6
            r29 = r14
            int r14 = r0.mo24931o(r1)
            switch(r14) {
                case -1: goto L_0x01be;
                case 0: goto L_0x01a1;
                case 1: goto L_0x0182;
                case 2: goto L_0x0164;
                case 3: goto L_0x0151;
                case 4: goto L_0x013e;
                case 5: goto L_0x012b;
                case 6: goto L_0x0118;
                case 7: goto L_0x0104;
                case 8: goto L_0x00ee;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00ae;
                case 12: goto L_0x009e;
                default: goto L_0x0098;
            }
        L_0x0098:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r14)
            throw r0
        L_0x009e:
            r14 = r2[r3]
            r30 = r13
            r13 = r27
            java.lang.Object r27 = r0.mo24885n(r1, r3, r14, r13)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r14 = r29
            goto L_0x017e
        L_0x00ae:
            r30 = r13
            r13 = r27
            r14 = 11
            r3 = r2[r14]
            r27 = r2
            r2 = r26
            java.lang.Object r26 = r0.mo24885n(r1, r14, r3, r2)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x0176
        L_0x00c2:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = r26
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 10
            java.lang.Object r5 = r0.mo24885n(r1, r2, r3, r5)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x0176
        L_0x00d8:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 10
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 9
            java.lang.Object r10 = r0.mo24885n(r1, r2, r3, r10)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x0176
        L_0x00ee:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 8
            java.lang.Object r6 = r0.mo24885n(r1, r2, r3, r6)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x0176
        L_0x0104:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 8
            kotlinx.serialization.internal.i r3 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = 7
            java.lang.Object r7 = r0.mo24885n(r1, r2, r3, r7)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x0176
        L_0x0118:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 6
            java.lang.Object r8 = r0.mo24885n(r1, r2, r3, r8)
            r4 = r4 | 64
            goto L_0x0176
        L_0x012b:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 6
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$Status$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$Status$$serializer.INSTANCE
            r2 = 5
            java.lang.Object r11 = r0.mo24885n(r1, r2, r3, r11)
            r4 = r4 | 32
            goto L_0x0176
        L_0x013e:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 4
            java.lang.Object r9 = r0.mo24885n(r1, r2, r3, r9)
            r4 = r4 | 16
            goto L_0x0176
        L_0x0151:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 3
            java.lang.Object r12 = r0.mo24885n(r1, r2, r3, r12)
            r4 = r4 | 8
            goto L_0x0176
        L_0x0164:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 3
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 2
            java.lang.Object r15 = r0.mo24885n(r1, r2, r3, r15)
            r4 = r4 | 4
        L_0x0176:
            r2 = r27
            r14 = r29
            r3 = 12
            r27 = r13
        L_0x017e:
            r13 = r30
            goto L_0x008d
        L_0x0182:
            r30 = r13
            r13 = r27
            r14 = 11
            r27 = r2
            r2 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r5
            r2 = r30
            r5 = 1
            java.lang.Object r2 = r0.mo24885n(r1, r5, r3, r2)
            r4 = r4 | 2
            r5 = r18
            r14 = r29
            r3 = 12
            r31 = r13
            goto L_0x01cf
        L_0x01a1:
            r18 = r5
            r5 = 1
            r14 = 11
            r31 = r27
            r27 = r2
            r2 = r13
            r13 = r31
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = r29
            r14 = 0
            java.lang.Object r3 = r0.mo24885n(r1, r14, r3, r5)
            r4 = r4 | 1
            r14 = r3
            r5 = r18
            r3 = 12
            goto L_0x01cf
        L_0x01be:
            r18 = r5
            r5 = r29
            r14 = 0
            r31 = r27
            r27 = r2
            r2 = r13
            r13 = r31
            r28 = r14
            r14 = r5
            r5 = r18
        L_0x01cf:
            r13 = r2
            r2 = r27
            r27 = r31
            goto L_0x008d
        L_0x01d6:
            r18 = r5
            r2 = r13
            r5 = r14
            r13 = r27
            r3 = r18
            r31 = r15
            r15 = r2
            r2 = r13
            r13 = r5
            r5 = r10
            r10 = r9
            r9 = r12
            r12 = r31
            r32 = r11
            r11 = r4
            r4 = r32
            r33 = r8
            r8 = r6
            r6 = r7
            r7 = r33
        L_0x01f3:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            r13 = r15
            java.lang.String r13 = (java.lang.String) r13
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r16 = r10
            java.lang.String r16 = (java.lang.String) r16
            r17 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$Status r17 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot.Status) r17
            r18 = r7
            java.lang.String r18 = (java.lang.String) r18
            r19 = r6
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            r20 = r8
            java.lang.String r20 = (java.lang.String) r20
            r21 = r5
            java.lang.String r21 = (java.lang.String) r21
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            r23 = r26
            java.math.BigDecimal r23 = (java.math.BigDecimal) r23
            r24 = r2
            java.math.BigDecimal r24 = (java.math.BigDecimal) r24
            r25 = 0
            r10 = r0
            r12 = r1
            r10.<init>((int) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot.Status) r17, (java.lang.String) r18, (java.lang.Boolean) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.math.BigDecimal) r23, (java.math.BigDecimal) r24, (kotlinx.serialization.internal.C12295n1) r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlot");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffSlot bffSlot) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffSlot, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffSlot.write$Self(bffSlot, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
