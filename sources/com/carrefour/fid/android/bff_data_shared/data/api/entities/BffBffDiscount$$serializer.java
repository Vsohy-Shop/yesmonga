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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffBffDiscount$$serializer implements C12327y<BffBffDiscount> {
    @C12579k
    public static final BffBffDiscount$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffBffDiscount$$serializer bffBffDiscount$$serializer = new BffBffDiscount$$serializer();
        INSTANCE = bffBffDiscount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount", bffBffDiscount$$serializer, 19);
        pluginGeneratedSerialDescriptor.mo24966k("type", true);
        pluginGeneratedSerialDescriptor.mo24966k("label", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_discount_label", true);
        pluginGeneratedSerialDescriptor.mo24966k("buffer_promo", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_display_price", true);
        pluginGeneratedSerialDescriptor.mo24966k("forced_price", true);
        pluginGeneratedSerialDescriptor.mo24966k("display_price", true);
        pluginGeneratedSerialDescriptor.mo24966k("starting_price", true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78959k, true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78961l, true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_is_mixed", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_is_bundle", true);
        pluginGeneratedSerialDescriptor.mo24966k("deals", true);
        pluginGeneratedSerialDescriptor.mo24966k("limit", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_displayed_as_promo", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_promotion", true);
        pluginGeneratedSerialDescriptor.mo24966k("store", true);
        pluginGeneratedSerialDescriptor.mo24966k("gtins", true);
        pluginGeneratedSerialDescriptor.mo24966k("bundle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffBffDiscount$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffBffDiscount.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        C12276h0 h0Var = C12276h0.f30067a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(BffBffDiscount$Type$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[12]), C12197a.m48817q(BffLimit$$serializer.INSTANCE), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(access$get$childSerializers$cp[16]), C12197a.m48817q(access$get$childSerializers$cp[17]), C12197a.m48817q(access$get$childSerializers$cp[18])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x011a, code lost:
        r8 = r33;
        r5 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0171, code lost:
        r8 = r33;
        r5 = r34;
        r3 = 18;
        r28 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x02b5, code lost:
        r2 = r26;
        r8 = r33;
        r5 = r34;
        r26 = r3;
        r28 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0320, code lost:
        r2 = r26;
        r8 = r3;
        r28 = r16;
        r26 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0327, code lost:
        r3 = 18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r55) {
        /*
            r54 = this;
            r0 = r55
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r54.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.$childSerializers
            boolean r3 = r0.mo24886p()
            r9 = 9
            r10 = 7
            r11 = 6
            r12 = 5
            r13 = 3
            r14 = 8
            r15 = 4
            r4 = 2
            r6 = 1
            r5 = 0
            r7 = 0
            if (r3 == 0) goto L_0x00b3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type$$serializer.INSTANCE
            java.lang.Object r3 = r0.mo24885n(r1, r5, r3, r7)
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r6 = r0.mo24885n(r1, r6, r5, r7)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r7)
            kotlinx.serialization.internal.h0 r8 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r13 = r0.mo24885n(r1, r13, r8, r7)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r8, r7)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r8, r7)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r8, r7)
            java.lang.Object r8 = r0.mo24885n(r1, r10, r8, r7)
            java.lang.Object r10 = r0.mo24885n(r1, r14, r5, r7)
            java.lang.Object r5 = r0.mo24885n(r1, r9, r5, r7)
            kotlinx.serialization.internal.i r9 = kotlinx.serialization.internal.C12278i.f30070a
            r14 = 10
            java.lang.Object r14 = r0.mo24885n(r1, r14, r9, r7)
            r22 = r3
            r3 = 11
            java.lang.Object r3 = r0.mo24885n(r1, r3, r9, r7)
            r21 = r3
            r20 = r4
            r3 = 12
            r4 = r2[r3]
            java.lang.Object r3 = r0.mo24885n(r1, r3, r4, r7)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer.INSTANCE
            r23 = r3
            r3 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r3, r4, r7)
            r4 = 14
            java.lang.Object r4 = r0.mo24885n(r1, r4, r9, r7)
            r16 = r3
            r3 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r3, r9, r7)
            r55 = r3
            r9 = 16
            r3 = r2[r9]
            java.lang.Object r3 = r0.mo24885n(r1, r9, r3, r7)
            r18 = r3
            r9 = 17
            r3 = r2[r9]
            java.lang.Object r3 = r0.mo24885n(r1, r9, r3, r7)
            r9 = 18
            r2 = r2[r9]
            java.lang.Object r2 = r0.mo24885n(r1, r9, r2, r7)
            r7 = 524287(0x7ffff, float:7.34683E-40)
            r30 = r3
            r19 = r4
            r32 = r7
            r3 = r22
            r4 = r55
            goto L_0x0356
        L_0x00b3:
            r3 = 18
            r32 = r6
            r4 = r7
            r6 = r4
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r24 = r15
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r7 = r5
            r5 = r31
        L_0x00d4:
            if (r32 == 0) goto L_0x032b
            r33 = r8
            int r8 = r0.mo24931o(r1)
            switch(r8) {
                case -1: goto L_0x030b;
                case 0: goto L_0x02eb;
                case 1: goto L_0x02c1;
                case 2: goto L_0x029b;
                case 3: goto L_0x0280;
                case 4: goto L_0x0265;
                case 5: goto L_0x024a;
                case 6: goto L_0x022e;
                case 7: goto L_0x0211;
                case 8: goto L_0x01f3;
                case 9: goto L_0x01d5;
                case 10: goto L_0x01b7;
                case 11: goto L_0x0195;
                case 12: goto L_0x017b;
                case 13: goto L_0x0157;
                case 14: goto L_0x0140;
                case 15: goto L_0x0120;
                case 16: goto L_0x0109;
                case 17: goto L_0x00f7;
                case 18: goto L_0x00e5;
                default: goto L_0x00df;
            }
        L_0x00df:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r8)
            throw r0
        L_0x00e5:
            r8 = r2[r3]
            r34 = r5
            r5 = r31
            java.lang.Object r31 = r0.mo24885n(r1, r3, r8, r5)
            r5 = 262144(0x40000, float:3.67342E-40)
            r7 = r7 | r5
            r8 = r33
            r5 = r34
            goto L_0x00d4
        L_0x00f7:
            r34 = r5
            r5 = r31
            r8 = 17
            r3 = r2[r8]
            r5 = r30
            java.lang.Object r30 = r0.mo24885n(r1, r8, r3, r5)
            r3 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r3
            goto L_0x011a
        L_0x0109:
            r34 = r5
            r5 = r30
            r3 = 16
            r8 = r2[r3]
            r5 = r29
            java.lang.Object r29 = r0.mo24885n(r1, r3, r8, r5)
            r5 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 | r5
        L_0x011a:
            r8 = r33
            r5 = r34
            goto L_0x0327
        L_0x0120:
            r34 = r5
            r5 = r29
            r3 = 16
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r3 = r28
            r28 = r5
            r5 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r5, r8, r3)
            r8 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 | r8
            r29 = r28
            r8 = r33
            r5 = r34
            r28 = r3
            goto L_0x0327
        L_0x0140:
            r34 = r5
            r3 = r28
            r28 = r29
            r5 = 15
            kotlinx.serialization.internal.i r8 = kotlinx.serialization.internal.C12278i.f30070a
            r16 = r3
            r5 = r27
            r3 = 14
            java.lang.Object r27 = r0.mo24885n(r1, r3, r8, r5)
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0171
        L_0x0157:
            r34 = r5
            r5 = r27
            r16 = r28
            r28 = r29
            r3 = 14
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer r8 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit$$serializer.INSTANCE
            r19 = r5
            r3 = r26
            r5 = 13
            java.lang.Object r26 = r0.mo24885n(r1, r5, r8, r3)
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            r27 = r19
        L_0x0171:
            r8 = r33
            r5 = r34
            r3 = 18
            r28 = r16
            goto L_0x00d4
        L_0x017b:
            r34 = r5
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r8 = 12
            r5 = r2[r8]
            r26 = r2
            r2 = r25
            java.lang.Object r25 = r0.mo24885n(r1, r8, r5, r2)
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            goto L_0x02b5
        L_0x0195:
            r34 = r5
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r8 = 12
            r26 = r2
            r2 = r25
            kotlinx.serialization.internal.i r5 = kotlinx.serialization.internal.C12278i.f30070a
            r21 = r2
            r8 = r24
            r2 = 11
            java.lang.Object r24 = r0.mo24885n(r1, r2, r5, r8)
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r25 = r21
            goto L_0x02b5
        L_0x01b7:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 11
            kotlinx.serialization.internal.i r5 = kotlinx.serialization.internal.C12278i.f30070a
            r2 = 10
            java.lang.Object r9 = r0.mo24885n(r1, r2, r5, r9)
            r7 = r7 | 1024(0x400, float:1.435E-42)
            goto L_0x02b5
        L_0x01d5:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 10
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 9
            java.lang.Object r14 = r0.mo24885n(r1, r2, r5, r14)
            r7 = r7 | 512(0x200, float:7.175E-43)
            goto L_0x02b5
        L_0x01f3:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 9
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 8
            java.lang.Object r10 = r0.mo24885n(r1, r2, r5, r10)
            r7 = r7 | 256(0x100, float:3.59E-43)
            goto L_0x02b5
        L_0x0211:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 8
            kotlinx.serialization.internal.h0 r5 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 7
            java.lang.Object r11 = r0.mo24885n(r1, r2, r5, r11)
            r7 = r7 | 128(0x80, float:1.794E-43)
            goto L_0x02b5
        L_0x022e:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 7
            kotlinx.serialization.internal.h0 r5 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 6
            java.lang.Object r12 = r0.mo24885n(r1, r2, r5, r12)
            r7 = r7 | 64
            goto L_0x02b5
        L_0x024a:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 6
            kotlinx.serialization.internal.h0 r5 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 5
            java.lang.Object r15 = r0.mo24885n(r1, r2, r5, r15)
            r7 = r7 | 32
            goto L_0x02b5
        L_0x0265:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 5
            kotlinx.serialization.internal.h0 r5 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 4
            java.lang.Object r13 = r0.mo24885n(r1, r2, r5, r13)
            r7 = r7 | 16
            goto L_0x02b5
        L_0x0280:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 4
            kotlinx.serialization.internal.h0 r5 = kotlinx.serialization.internal.C12276h0.f30067a
            r2 = 3
            java.lang.Object r4 = r0.mo24885n(r1, r2, r5, r4)
            r7 = r7 | 8
            goto L_0x02b5
        L_0x029b:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 3
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r2 = 2
            java.lang.Object r6 = r0.mo24885n(r1, r2, r5, r6)
            r7 = r7 | 4
        L_0x02b5:
            r2 = r26
            r8 = r33
            r5 = r34
            r26 = r3
            r28 = r16
            goto L_0x0327
        L_0x02c1:
            r34 = r5
            r8 = r24
            r21 = r25
            r3 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r26 = r2
            r2 = 2
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r3
            r2 = r34
            r3 = 1
            java.lang.Object r5 = r0.mo24885n(r1, r3, r5, r2)
            r7 = r7 | 2
            r2 = r26
            r8 = r33
            r3 = 18
            r28 = r16
            r26 = r23
            goto L_0x00d4
        L_0x02eb:
            r8 = r24
            r21 = r25
            r23 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r3 = 1
            r26 = r2
            r2 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type$$serializer r5 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type$$serializer.INSTANCE
            r17 = r2
            r3 = r33
            r2 = 0
            java.lang.Object r3 = r0.mo24885n(r1, r2, r5, r3)
            r7 = r7 | 1
            r5 = r17
            goto L_0x0320
        L_0x030b:
            r17 = r5
            r8 = r24
            r21 = r25
            r23 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r3 = r33
            r26 = r2
            r2 = 0
            r32 = r2
        L_0x0320:
            r2 = r26
            r8 = r3
            r28 = r16
            r26 = r23
        L_0x0327:
            r3 = 18
            goto L_0x00d4
        L_0x032b:
            r17 = r5
            r3 = r8
            r8 = r24
            r21 = r25
            r23 = r26
            r19 = r27
            r16 = r28
            r28 = r29
            r20 = r6
            r32 = r7
            r5 = r14
            r6 = r17
            r18 = r28
            r2 = r31
            r14 = r9
            r53 = r13
            r13 = r4
            r4 = r16
            r16 = r23
            r23 = r21
            r21 = r8
            r8 = r11
            r11 = r12
            r12 = r15
            r15 = r53
        L_0x0356:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount
            r31 = r0
            r33 = r3
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r33 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type) r33
            r34 = r6
            java.lang.String r34 = (java.lang.String) r34
            r35 = r20
            java.lang.String r35 = (java.lang.String) r35
            r36 = r13
            java.lang.Integer r36 = (java.lang.Integer) r36
            r37 = r15
            java.lang.Integer r37 = (java.lang.Integer) r37
            r38 = r12
            java.lang.Integer r38 = (java.lang.Integer) r38
            r39 = r11
            java.lang.Integer r39 = (java.lang.Integer) r39
            r40 = r8
            java.lang.Integer r40 = (java.lang.Integer) r40
            r41 = r10
            java.lang.String r41 = (java.lang.String) r41
            r42 = r5
            java.lang.String r42 = (java.lang.String) r42
            r43 = r14
            java.lang.Boolean r43 = (java.lang.Boolean) r43
            r44 = r21
            java.lang.Boolean r44 = (java.lang.Boolean) r44
            r45 = r23
            java.util.List r45 = (java.util.List) r45
            r46 = r16
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit r46 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit) r46
            r47 = r19
            java.lang.Boolean r47 = (java.lang.Boolean) r47
            r48 = r4
            java.lang.Boolean r48 = (java.lang.Boolean) r48
            r49 = r18
            java.util.List r49 = (java.util.List) r49
            r50 = r30
            java.util.List r50 = (java.util.List) r50
            r51 = r2
            java.util.List r51 = (java.util.List) r51
            r52 = 0
            r31.<init>((int) r32, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type) r33, (java.lang.String) r34, (java.lang.String) r35, (java.lang.Integer) r36, (java.lang.Integer) r37, (java.lang.Integer) r38, (java.lang.Integer) r39, (java.lang.Integer) r40, (java.lang.String) r41, (java.lang.String) r42, (java.lang.Boolean) r43, (java.lang.Boolean) r44, (java.util.List) r45, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit) r46, (java.lang.Boolean) r47, (java.lang.Boolean) r48, (java.util.List) r49, (java.util.List) r50, (java.util.List) r51, (kotlinx.serialization.internal.C12295n1) r52)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffBffDiscount bffBffDiscount) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffBffDiscount, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffBffDiscount.write$Self(bffBffDiscount, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
