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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCommonCategory$$serializer implements C12327y<BffCommonCategory> {
    @C12579k
    public static final BffCommonCategory$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCommonCategory$$serializer bffCommonCategory$$serializer = new BffCommonCategory$$serializer();
        INSTANCE = bffCommonCategory$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory", bffCommonCategory$$serializer, 23);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78971t, true);
        pluginGeneratedSerialDescriptor.mo24966k("code", true);
        pluginGeneratedSerialDescriptor.mo24966k("order_num", true);
        pluginGeneratedSerialDescriptor.mo24966k("picture_path", true);
        pluginGeneratedSerialDescriptor.mo24966k("name", true);
        pluginGeneratedSerialDescriptor.mo24966k("slug", true);
        pluginGeneratedSerialDescriptor.mo24966k("status", true);
        pluginGeneratedSerialDescriptor.mo24966k("type", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("shop_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("sub_nodes", true);
        pluginGeneratedSerialDescriptor.mo24966k("sub_node", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_new", true);
        pluginGeneratedSerialDescriptor.mo24966k("alimentary_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("is_boutique", true);
        pluginGeneratedSerialDescriptor.mo24966k("with_origin", true);
        pluginGeneratedSerialDescriptor.mo24966k("id_path", true);
        pluginGeneratedSerialDescriptor.mo24966k("fieldPath", true);
        pluginGeneratedSerialDescriptor.mo24966k("field_path_origin", true);
        pluginGeneratedSerialDescriptor.mo24966k("id", true);
        pluginGeneratedSerialDescriptor.mo24966k("copy_of", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_search_param", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCommonCategory$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12248g[] access$get$childSerializers$cp = BffCommonCategory.$childSerializers;
        C12276h0 h0Var = C12276h0.f30067a;
        C12310s1 s1Var = C12310s1.f30117a;
        C12278i iVar = C12278i.f30070a;
        return new C12248g[]{C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(h0Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(access$get$childSerializers$cp[10]), C12197a.m48817q(INSTANCE), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(iVar), C12197a.m48817q(iVar), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0178, code lost:
        r9 = r9 | r2;
        r15 = r15;
        r14 = r14;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01a6, code lost:
        r2 = r48;
        r13 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0366, code lost:
        r5 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0368, code lost:
        r2 = r48;
        r4 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r15 = r15;
        r14 = r14;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        r15 = r15;
        r14 = r14;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r15 = r15;
        r14 = r14;
        r7 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r62) {
        /*
            r61 = this;
            r0 = r62
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r61.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            kotlinx.serialization.g[] r2 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory.$childSerializers
            boolean r3 = r0.mo24886p()
            r13 = 9
            r14 = 7
            r15 = 6
            r4 = 5
            r5 = 3
            r7 = 8
            r6 = 4
            r8 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x00d1
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r11 = r0.mo24885n(r1, r11, r3, r12)
            kotlinx.serialization.internal.s1 r9 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r10 = r0.mo24885n(r1, r10, r9, r12)
            java.lang.Object r3 = r0.mo24885n(r1, r8, r3, r12)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r9, r12)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r9, r12)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r9, r12)
            java.lang.Object r8 = r0.mo24885n(r1, r15, r9, r12)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r9, r12)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r9, r12)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r9, r12)
            r15 = 10
            r2 = r2[r15]
            java.lang.Object r2 = r0.mo24885n(r1, r15, r2, r12)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory$$serializer r15 = INSTANCE
            r25 = r2
            r2 = 11
            java.lang.Object r2 = r0.mo24885n(r1, r2, r15, r12)
            kotlinx.serialization.internal.i r15 = kotlinx.serialization.internal.C12278i.f30070a
            r24 = r2
            r2 = 12
            java.lang.Object r2 = r0.mo24885n(r1, r2, r15, r12)
            r23 = r2
            r2 = 13
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r22 = r2
            r2 = 14
            java.lang.Object r2 = r0.mo24885n(r1, r2, r15, r12)
            r21 = r2
            r2 = 15
            java.lang.Object r2 = r0.mo24885n(r1, r2, r15, r12)
            r15 = 16
            java.lang.Object r15 = r0.mo24885n(r1, r15, r9, r12)
            r19 = r2
            r2 = 17
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r18 = r2
            r2 = 18
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r17 = r2
            r2 = 19
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r16 = r2
            r2 = 20
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r62 = r2
            r2 = 21
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r20 = r2
            r2 = 22
            java.lang.Object r2 = r0.mo24885n(r1, r2, r9, r12)
            r9 = 8388607(0x7fffff, float:1.1754942E-38)
            r33 = r7
            r36 = r9
            r32 = r14
            r9 = r15
            r34 = r18
            r14 = r20
            r15 = r62
            r7 = r2
            r2 = r25
            goto L_0x03ab
        L_0x00d1:
            r47 = r10
            r9 = r11
            r3 = r12
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
            r36 = r15
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
        L_0x00f5:
            if (r47 == 0) goto L_0x036e
            r48 = r2
            int r2 = r0.mo24931o(r1)
            switch(r2) {
                case -1: goto L_0x0347;
                case 0: goto L_0x031a;
                case 1: goto L_0x02ef;
                case 2: goto L_0x02c5;
                case 3: goto L_0x029d;
                case 4: goto L_0x0277;
                case 5: goto L_0x0253;
                case 6: goto L_0x0231;
                case 7: goto L_0x0210;
                case 8: goto L_0x01f4;
                case 9: goto L_0x01d8;
                case 10: goto L_0x01c4;
                case 11: goto L_0x01ac;
                case 12: goto L_0x0198;
                case 13: goto L_0x0189;
                case 14: goto L_0x017a;
                case 15: goto L_0x0169;
                case 16: goto L_0x015a;
                case 17: goto L_0x014b;
                case 18: goto L_0x013c;
                case 19: goto L_0x012d;
                case 20: goto L_0x0120;
                case 21: goto L_0x0113;
                case 22: goto L_0x0106;
                default: goto L_0x0100;
            }
        L_0x0100:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r2)
            throw r0
        L_0x0106:
            r2 = 22
            r49 = r13
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r7 = r0.mo24885n(r1, r2, r13, r7)
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0178
        L_0x0113:
            r49 = r13
            r2 = 21
            kotlinx.serialization.internal.s1 r13 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r14 = r0.mo24885n(r1, r2, r13, r14)
            r2 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0178
        L_0x0120:
            r49 = r13
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 20
            java.lang.Object r15 = r0.mo24885n(r1, r13, r2, r15)
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0178
        L_0x012d:
            r49 = r13
            r13 = 20
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 19
            java.lang.Object r4 = r0.mo24885n(r1, r13, r2, r4)
            r2 = 524288(0x80000, float:7.34684E-40)
            goto L_0x0178
        L_0x013c:
            r49 = r13
            r13 = 19
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 18
            java.lang.Object r6 = r0.mo24885n(r1, r13, r2, r6)
            r2 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0178
        L_0x014b:
            r49 = r13
            r13 = 18
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 17
            java.lang.Object r5 = r0.mo24885n(r1, r13, r2, r5)
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0178
        L_0x015a:
            r49 = r13
            r13 = 17
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 16
            java.lang.Object r8 = r0.mo24885n(r1, r13, r2, r8)
            r2 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0178
        L_0x0169:
            r49 = r13
            r13 = 16
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            r13 = 15
            java.lang.Object r10 = r0.mo24885n(r1, r13, r2, r10)
            r2 = 32768(0x8000, float:4.5918E-41)
        L_0x0178:
            r9 = r9 | r2
            goto L_0x01a6
        L_0x017a:
            r49 = r13
            r13 = 15
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            r13 = 14
            java.lang.Object r11 = r0.mo24885n(r1, r13, r2, r11)
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01a6
        L_0x0189:
            r49 = r13
            r13 = 14
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            r13 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r13, r2, r3)
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            goto L_0x01a6
        L_0x0198:
            r49 = r13
            r13 = 13
            kotlinx.serialization.internal.i r2 = kotlinx.serialization.internal.C12278i.f30070a
            r13 = 12
            java.lang.Object r12 = r0.mo24885n(r1, r13, r2, r12)
            r9 = r9 | 4096(0x1000, float:5.74E-42)
        L_0x01a6:
            r2 = r48
            r13 = r49
            goto L_0x00f5
        L_0x01ac:
            r49 = r13
            r13 = 12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory$$serializer r2 = INSTANCE
            r24 = r3
            r13 = r49
            r3 = 11
            java.lang.Object r13 = r0.mo24885n(r1, r3, r2, r13)
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r3 = r24
            r2 = r48
            goto L_0x00f5
        L_0x01c4:
            r24 = r3
            r2 = 10
            r3 = r48[r2]
            r49 = r4
            r4 = r46
            java.lang.Object r46 = r0.mo24885n(r1, r2, r3, r4)
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r3 = r24
            goto L_0x0368
        L_0x01d8:
            r24 = r3
            r49 = r4
            r4 = r46
            r2 = 10
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r4
            r2 = r45
            r4 = 9
            java.lang.Object r45 = r0.mo24885n(r1, r4, r3, r2)
            r9 = r9 | 512(0x200, float:7.175E-43)
            r3 = r24
            r46 = r35
            goto L_0x0368
        L_0x01f4:
            r24 = r3
            r49 = r4
            r2 = r45
            r35 = r46
            r4 = 9
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r34 = r5
            r4 = r44
            r5 = 8
            java.lang.Object r44 = r0.mo24885n(r1, r5, r3, r4)
            r9 = r9 | 256(0x100, float:3.59E-43)
            r3 = r24
            goto L_0x0366
        L_0x0210:
            r24 = r3
            r49 = r4
            r34 = r5
            r4 = r44
            r2 = r45
            r35 = r46
            r5 = 8
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r33 = r4
            r5 = r43
            r4 = 7
            java.lang.Object r43 = r0.mo24885n(r1, r4, r3, r5)
            r9 = r9 | 128(0x80, float:1.794E-43)
            r3 = r24
            r44 = r33
            goto L_0x0366
        L_0x0231:
            r24 = r3
            r49 = r4
            r34 = r5
            r5 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r4 = 7
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r32 = r5
            r4 = r42
            r5 = 6
            java.lang.Object r42 = r0.mo24885n(r1, r5, r3, r4)
            r9 = r9 | 64
            r3 = r24
            r43 = r32
            goto L_0x0366
        L_0x0253:
            r24 = r3
            r49 = r4
            r34 = r5
            r4 = r42
            r32 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r5 = 6
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r31 = r4
            r5 = r41
            r4 = 5
            java.lang.Object r41 = r0.mo24885n(r1, r4, r3, r5)
            r9 = r9 | 32
            r3 = r24
            r42 = r31
            goto L_0x0366
        L_0x0277:
            r24 = r3
            r49 = r4
            r34 = r5
            r5 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r4 = 5
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r5
            r4 = r40
            r5 = 4
            java.lang.Object r40 = r0.mo24885n(r1, r5, r3, r4)
            r9 = r9 | 16
            r3 = r24
            r41 = r30
            goto L_0x0366
        L_0x029d:
            r24 = r3
            r49 = r4
            r34 = r5
            r4 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r5 = 4
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r4
            r5 = r39
            r4 = 3
            java.lang.Object r39 = r0.mo24885n(r1, r4, r3, r5)
            r9 = r9 | 8
            r3 = r24
            r40 = r29
            goto L_0x0366
        L_0x02c5:
            r24 = r3
            r49 = r4
            r34 = r5
            r5 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r4 = 3
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r28 = r5
            r4 = r38
            r5 = 2
            java.lang.Object r38 = r0.mo24885n(r1, r5, r3, r4)
            r9 = r9 | 4
            r3 = r24
            r39 = r28
            goto L_0x0366
        L_0x02ef:
            r24 = r3
            r49 = r4
            r34 = r5
            r4 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r5 = 2
            kotlinx.serialization.internal.s1 r3 = kotlinx.serialization.internal.C12310s1.f30117a
            r27 = r4
            r5 = r37
            r4 = 1
            java.lang.Object r37 = r0.mo24885n(r1, r4, r3, r5)
            r9 = r9 | 2
            r3 = r24
            r38 = r27
            goto L_0x0366
        L_0x031a:
            r24 = r3
            r49 = r4
            r34 = r5
            r5 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r2 = r45
            r35 = r46
            r4 = 1
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            r26 = r2
            r4 = r36
            r2 = 0
            java.lang.Object r36 = r0.mo24885n(r1, r2, r3, r4)
            r9 = r9 | 1
            r3 = r24
            r45 = r26
            goto L_0x0366
        L_0x0347:
            r24 = r3
            r49 = r4
            r34 = r5
            r4 = r36
            r5 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r26 = r45
            r35 = r46
            r2 = 0
            r47 = r2
        L_0x0366:
            r5 = r34
        L_0x0368:
            r2 = r48
            r4 = r49
            goto L_0x00f5
        L_0x036e:
            r24 = r3
            r49 = r4
            r34 = r5
            r4 = r36
            r5 = r37
            r27 = r38
            r28 = r39
            r29 = r40
            r30 = r41
            r31 = r42
            r32 = r43
            r33 = r44
            r26 = r45
            r35 = r46
            r17 = r6
            r36 = r9
            r19 = r10
            r21 = r11
            r23 = r12
            r22 = r24
            r3 = r27
            r6 = r29
            r2 = r35
            r16 = r49
            r11 = r4
            r10 = r5
            r9 = r8
            r24 = r13
            r13 = r26
            r5 = r28
            r4 = r30
            r8 = r31
        L_0x03ab:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory
            r35 = r0
            r37 = r11
            java.lang.Integer r37 = (java.lang.Integer) r37
            r38 = r10
            java.lang.String r38 = (java.lang.String) r38
            r39 = r3
            java.lang.Integer r39 = (java.lang.Integer) r39
            r40 = r5
            java.lang.String r40 = (java.lang.String) r40
            r41 = r6
            java.lang.String r41 = (java.lang.String) r41
            r42 = r4
            java.lang.String r42 = (java.lang.String) r42
            r43 = r8
            java.lang.String r43 = (java.lang.String) r43
            r44 = r32
            java.lang.String r44 = (java.lang.String) r44
            r45 = r33
            java.lang.String r45 = (java.lang.String) r45
            r46 = r13
            java.lang.String r46 = (java.lang.String) r46
            r47 = r2
            java.util.List r47 = (java.util.List) r47
            r48 = r24
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory r48 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory) r48
            r49 = r23
            java.lang.Boolean r49 = (java.lang.Boolean) r49
            r50 = r22
            java.lang.String r50 = (java.lang.String) r50
            r51 = r21
            java.lang.Boolean r51 = (java.lang.Boolean) r51
            r52 = r19
            java.lang.Boolean r52 = (java.lang.Boolean) r52
            r53 = r9
            java.lang.String r53 = (java.lang.String) r53
            r54 = r34
            java.lang.String r54 = (java.lang.String) r54
            r55 = r17
            java.lang.String r55 = (java.lang.String) r55
            r56 = r16
            java.lang.String r56 = (java.lang.String) r56
            r57 = r15
            java.lang.String r57 = (java.lang.String) r57
            r58 = r14
            java.lang.String r58 = (java.lang.String) r58
            r59 = r7
            java.lang.String r59 = (java.lang.String) r59
            r60 = 0
            r35.<init>((int) r36, (java.lang.Integer) r37, (java.lang.String) r38, (java.lang.Integer) r39, (java.lang.String) r40, (java.lang.String) r41, (java.lang.String) r42, (java.lang.String) r43, (java.lang.String) r44, (java.lang.String) r45, (java.lang.String) r46, (java.util.List) r47, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory) r48, (java.lang.Boolean) r49, (java.lang.String) r50, (java.lang.Boolean) r51, (java.lang.Boolean) r52, (java.lang.String) r53, (java.lang.String) r54, (java.lang.String) r55, (java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (kotlinx.serialization.internal.C12295n1) r60)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCommonCategory bffCommonCategory) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCommonCategory, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCommonCategory.write$Self(bffCommonCategory, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
