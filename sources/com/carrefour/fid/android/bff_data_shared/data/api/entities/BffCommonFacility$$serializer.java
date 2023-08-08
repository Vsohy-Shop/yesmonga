package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.carrefour.fid.android.shared.constant.C28531e0;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonFacility.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonFacility;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCommonFacility$$serializer implements C12327y<BffCommonFacility> {
    @C12579k
    public static final BffCommonFacility$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCommonFacility$$serializer bffCommonFacility$$serializer = new BffCommonFacility$$serializer();
        INSTANCE = bffCommonFacility$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility", bffCommonFacility$$serializer, 20);
        pluginGeneratedSerialDescriptor.mo24966k("id", true);
        pluginGeneratedSerialDescriptor.mo24966k("name", true);
        pluginGeneratedSerialDescriptor.mo24966k("label", true);
        pluginGeneratedSerialDescriptor.mo24966k("description", true);
        pluginGeneratedSerialDescriptor.mo24966k("gln", true);
        pluginGeneratedSerialDescriptor.mo24966k("displayable_url_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("anabel_key", true);
        pluginGeneratedSerialDescriptor.mo24966k("phone_number", true);
        pluginGeneratedSerialDescriptor.mo24966k("opening_week_pattern", true);
        pluginGeneratedSerialDescriptor.mo24966k("opening_exception_calendar", true);
        pluginGeneratedSerialDescriptor.mo24966k("distance", true);
        pluginGeneratedSerialDescriptor.mo24966k("address", true);
        pluginGeneratedSerialDescriptor.mo24966k("banner", true);
        pluginGeneratedSerialDescriptor.mo24966k("format", true);
        pluginGeneratedSerialDescriptor.mo24966k("type", true);
        pluginGeneratedSerialDescriptor.mo24966k("status", true);
        pluginGeneratedSerialDescriptor.mo24966k("opening_date", true);
        pluginGeneratedSerialDescriptor.mo24966k("closing_date", true);
        pluginGeneratedSerialDescriptor.mo24966k(C28531e0.f69095y, true);
        pluginGeneratedSerialDescriptor.mo24966k("embedded_facilities", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCommonFacility$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffCommonFacility.$childSerializers;
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[8]), C12197a.m48817q(access$get$childSerializers$cp[9]), C12197a.m48817q(s1Var), C12197a.m48817q(BffFacilityAddress$$serializer.INSTANCE), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[18]), C12197a.m48817q(access$get$childSerializers$cp[19])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x013c, code lost:
        r3 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0306, code lost:
        r10 = r37;
        r8 = r38;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x032f, code lost:
        r3 = 19;
        r33 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0375, code lost:
        r10 = r2;
        r33 = r16;
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r41) {
        /*
            r40 = this;
            r0 = r41
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r40.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility.$childSerializers
            boolean r3 = r0.mo24886p()
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r4 = 4
            r15 = 2
            r5 = 9
            r6 = 8
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x00c2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r8 = r0.mo24885n(r1, r8, r3, r9)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r3, r9)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r3, r9)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r3, r9)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r9)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r3, r9)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r3, r9)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r3, r9)
            r10 = r2[r6]
            java.lang.Object r6 = r0.mo24885n(r1, r6, r10, r9)
            r10 = r2[r5]
            java.lang.Object r5 = r0.mo24885n(r1, r5, r10, r9)
            r10 = 10
            java.lang.Object r10 = r0.mo24885n(r1, r10, r3, r9)
            r24 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress$$serializer.INSTANCE
            r25 = r5
            r5 = 11
            java.lang.Object r4 = r0.mo24885n(r1, r5, r4, r9)
            r5 = 12
            java.lang.Object r5 = r0.mo24885n(r1, r5, r3, r9)
            r22 = r4
            r4 = 13
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r9)
            r21 = r4
            r4 = 14
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r9)
            r20 = r4
            r4 = 15
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r9)
            r17 = r4
            r4 = 16
            java.lang.Object r4 = r0.mo24885n(r1, r4, r3, r9)
            r16 = r4
            r4 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r9)
            r41 = r3
            r4 = 18
            r3 = r2[r4]
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r9)
            r4 = 19
            r2 = r2[r4]
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r9)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r33 = r3
            r18 = r5
            r9 = r14
            r23 = r17
            r14 = r24
            r3 = r41
            r5 = r4
            r24 = r16
            r16 = r10
            r10 = r15
            r15 = r6
            r39 = r13
            r13 = r11
            r11 = r39
            goto L_0x03b0
        L_0x00c2:
            r3 = 19
            r36 = r7
            r4 = r9
            r5 = r4
            r6 = r5
            r7 = r6
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r27 = r15
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r9 = r8
            r8 = r35
        L_0x00e5:
            if (r36 == 0) goto L_0x037c
            r37 = r10
            int r10 = r0.mo24931o(r1)
            switch(r10) {
                case -1: goto L_0x035a;
                case 0: goto L_0x0335;
                case 1: goto L_0x030b;
                case 2: goto L_0x02ea;
                case 3: goto L_0x02cd;
                case 4: goto L_0x02b0;
                case 5: goto L_0x0293;
                case 6: goto L_0x0275;
                case 7: goto L_0x0256;
                case 8: goto L_0x0238;
                case 9: goto L_0x021a;
                case 10: goto L_0x01fa;
                case 11: goto L_0x01d6;
                case 12: goto L_0x01b4;
                case 13: goto L_0x0194;
                case 14: goto L_0x0176;
                case 15: goto L_0x0158;
                case 16: goto L_0x013f;
                case 17: goto L_0x011f;
                case 18: goto L_0x0109;
                case 19: goto L_0x00f7;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            r2 = r10
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r2)
            throw r0
        L_0x00f7:
            r10 = r2[r3]
            r38 = r8
            r8 = r35
            java.lang.Object r35 = r0.mo24885n(r1, r3, r10, r8)
            r8 = 524288(0x80000, float:7.34684E-40)
            r9 = r9 | r8
            r10 = r37
            r8 = r38
            goto L_0x00e5
        L_0x0109:
            r38 = r8
            r8 = r35
            r10 = 18
            r3 = r2[r10]
            r8 = r34
            java.lang.Object r34 = r0.mo24885n(r1, r10, r3, r8)
            r3 = 262144(0x40000, float:3.67342E-40)
            r9 = r9 | r3
            r10 = r37
            r8 = r38
            goto L_0x013c
        L_0x011f:
            r38 = r8
            r8 = r34
            r10 = 18
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r10 = r33
            r33 = r8
            r8 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r8, r3, r10)
            r10 = 131072(0x20000, float:1.83671E-40)
            r9 = r9 | r10
            r34 = r33
            r10 = r37
            r8 = r38
            r33 = r3
        L_0x013c:
            r3 = 19
            goto L_0x00e5
        L_0x013f:
            r38 = r8
            r10 = r33
            r33 = r34
            r8 = 17
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r16 = r10
            r8 = r32
            r10 = 16
            java.lang.Object r32 = r0.mo24885n(r1, r10, r3, r8)
            r3 = 65536(0x10000, float:9.18355E-41)
            r9 = r9 | r3
            goto L_0x0306
        L_0x0158:
            r38 = r8
            r8 = r32
            r16 = r33
            r33 = r34
            r10 = 16
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r8
            r10 = r31
            r8 = 15
            java.lang.Object r31 = r0.mo24885n(r1, r8, r3, r10)
            r3 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r3
            r32 = r17
            goto L_0x0306
        L_0x0176:
            r38 = r8
            r10 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 15
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r20 = r10
            r8 = r30
            r10 = 14
            java.lang.Object r30 = r0.mo24885n(r1, r10, r3, r8)
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            r31 = r20
            goto L_0x0306
        L_0x0194:
            r38 = r8
            r8 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r10 = 14
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r21 = r8
            r10 = r29
            r8 = 13
            java.lang.Object r29 = r0.mo24885n(r1, r8, r3, r10)
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r30 = r21
            goto L_0x0306
        L_0x01b4:
            r38 = r8
            r10 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 13
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r10
            r8 = r28
            r10 = 12
            java.lang.Object r28 = r0.mo24885n(r1, r10, r3, r8)
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            r29 = r22
            goto L_0x0306
        L_0x01d6:
            r38 = r8
            r8 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r10 = 12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress$$serializer r3 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress$$serializer.INSTANCE
            r23 = r8
            r10 = r27
            r8 = 11
            java.lang.Object r27 = r0.mo24885n(r1, r8, r3, r10)
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r28 = r23
            goto L_0x0306
        L_0x01fa:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 11
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 10
            java.lang.Object r5 = r0.mo24885n(r1, r8, r3, r5)
            r9 = r9 | 1024(0x400, float:1.435E-42)
            goto L_0x0306
        L_0x021a:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r3 = 9
            r8 = r2[r3]
            java.lang.Object r6 = r0.mo24885n(r1, r3, r8, r6)
            r9 = r9 | 512(0x200, float:7.175E-43)
            goto L_0x0306
        L_0x0238:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 8
            r3 = r2[r8]
            java.lang.Object r11 = r0.mo24885n(r1, r8, r3, r11)
            r9 = r9 | 256(0x100, float:3.59E-43)
            goto L_0x0306
        L_0x0256:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 8
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 7
            java.lang.Object r12 = r0.mo24885n(r1, r8, r3, r12)
            r9 = r9 | 128(0x80, float:1.794E-43)
            goto L_0x0306
        L_0x0275:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 6
            java.lang.Object r13 = r0.mo24885n(r1, r8, r3, r13)
            r9 = r9 | 64
            goto L_0x0306
        L_0x0293:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 5
            java.lang.Object r4 = r0.mo24885n(r1, r8, r3, r4)
            r9 = r9 | 32
            goto L_0x0306
        L_0x02b0:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 4
            java.lang.Object r14 = r0.mo24885n(r1, r8, r3, r14)
            r9 = r9 | 16
            goto L_0x0306
        L_0x02cd:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 3
            java.lang.Object r15 = r0.mo24885n(r1, r8, r3, r15)
            r9 = r9 | 8
            goto L_0x0306
        L_0x02ea:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 3
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r8 = 2
            java.lang.Object r7 = r0.mo24885n(r1, r8, r3, r7)
            r9 = r9 | 4
        L_0x0306:
            r10 = r37
            r8 = r38
            goto L_0x032f
        L_0x030b:
            r38 = r8
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r8 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r25 = r2
            r8 = r38
            r2 = 1
            java.lang.Object r8 = r0.mo24885n(r1, r2, r3, r8)
            r9 = r9 | 2
            r2 = r25
            r10 = r37
        L_0x032f:
            r3 = 19
            r33 = r16
            goto L_0x00e5
        L_0x0335:
            r25 = r2
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r2 = 1
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r4
            r2 = r37
            r4 = 0
            java.lang.Object r2 = r0.mo24885n(r1, r4, r3, r2)
            r9 = r9 | 1
            r4 = r18
            r3 = 19
            goto L_0x0375
        L_0x035a:
            r25 = r2
            r18 = r4
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r2 = r37
            r4 = 0
            r36 = r4
            r4 = r18
        L_0x0375:
            r10 = r2
            r33 = r16
            r2 = r25
            goto L_0x00e5
        L_0x037c:
            r18 = r4
            r2 = r10
            r10 = r27
            r23 = r28
            r22 = r29
            r21 = r30
            r20 = r31
            r17 = r32
            r16 = r33
            r33 = r34
            r25 = r6
            r3 = r16
            r24 = r17
            r16 = r5
            r5 = r9
            r9 = r15
            r15 = r11
            r11 = r18
            r18 = r23
            r23 = r20
            r20 = r21
            r21 = r22
            r22 = r10
            r10 = r7
            r7 = r8
            r8 = r2
            r2 = r35
            r39 = r13
            r13 = r12
            r12 = r39
        L_0x03b0:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility
            r4 = r0
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r8 = r10
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = (java.lang.String) r13
            r14 = r15
            java.util.List r14 = (java.util.List) r14
            r15 = r25
            java.util.List r15 = (java.util.List) r15
            java.lang.String r16 = (java.lang.String) r16
            r17 = r22
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress r17 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress) r17
            java.lang.String r18 = (java.lang.String) r18
            r19 = r21
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r20 = (java.lang.String) r20
            r21 = r23
            java.lang.String r21 = (java.lang.String) r21
            r22 = r24
            java.lang.String r22 = (java.lang.String) r22
            r23 = r3
            java.lang.String r23 = (java.lang.String) r23
            r24 = r33
            java.util.List r24 = (java.util.List) r24
            r25 = r2
            java.util.List r25 = (java.util.List) r25
            r26 = 0
            r4.<init>((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.util.List) r14, (java.util.List) r15, (java.lang.String) r16, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.util.List) r24, (java.util.List) r25, (kotlinx.serialization.internal.C12295n1) r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCommonFacility bffCommonFacility) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCommonFacility, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCommonFacility.write$Self(bffCommonFacility, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
