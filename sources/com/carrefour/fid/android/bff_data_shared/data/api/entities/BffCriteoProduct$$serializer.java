package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.google.firebase.analytics.FirebaseAnalytics;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffCriteoProduct$$serializer implements C12327y<BffCriteoProduct> {
    @C12579k
    public static final BffCriteoProduct$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffCriteoProduct$$serializer bffCriteoProduct$$serializer = new BffCriteoProduct$$serializer();
        INSTANCE = bffCriteoProduct$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct", bffCriteoProduct$$serializer, 25);
        pluginGeneratedSerialDescriptor.mo24966k("product_name", true);
        pluginGeneratedSerialDescriptor.mo24966k("product_id", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9127a0.f24709d, true);
        pluginGeneratedSerialDescriptor.mo24966k("rating", true);
        pluginGeneratedSerialDescriptor.mo24966k("price", true);
        pluginGeneratedSerialDescriptor.mo24966k("compare_price", true);
        pluginGeneratedSerialDescriptor.mo24966k(FirebaseAnalytics.C32532b.f78917E, true);
        pluginGeneratedSerialDescriptor.mo24966k("promo_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("parent_sku", true);
        pluginGeneratedSerialDescriptor.mo24966k("client_advertiser_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("advertiser_id", true);
        pluginGeneratedSerialDescriptor.mo24966k("rendering_attributes", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_load_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_view_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_click_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_file_click_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_basket_change_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_wishlist_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_video_beacon", true);
        pluginGeneratedSerialDescriptor.mo24966k("product_page", true);
        pluginGeneratedSerialDescriptor.mo24966k("on_availability_update", true);
        pluginGeneratedSerialDescriptor.mo24966k("line_item_ID", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_product", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_position", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_button_name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffCriteoProduct$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(BffCommonProduct$$serializer.INSTANCE), C12197a.m48817q(C12276h0.f30067a), C12197a.m48817q(s1Var)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0158, code lost:
        r2 = r2 | r10;
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01b8, code lost:
        r2 = r2 | r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01cc, code lost:
        r6 = r65;
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01ce, code lost:
        r11 = r49;
        r10 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0424, code lost:
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x044a, code lost:
        r3 = r22;
        r4 = r23;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x044e, code lost:
        r11 = r35;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0450, code lost:
        r6 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        r15 = r15;
        r14 = r14;
        r13 = r13;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0107, code lost:
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        r15 = r15;
        r14 = r14;
        r13 = r13;
        r10 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r65) {
        /*
            r64 = this;
            r0 = r65
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r64.getDescriptor()
            kotlinx.serialization.encoding.c r0 = r0.mo24875b(r1)
            boolean r2 = r0.mo24886p()
            r11 = 11
            r12 = 10
            r13 = 9
            r14 = 7
            r15 = 6
            r3 = 5
            r4 = 3
            r6 = 8
            r5 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x00e0
            kotlinx.serialization.internal.s1 r2 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r9 = r0.mo24885n(r1, r9, r2, r10)
            java.lang.Object r8 = r0.mo24885n(r1, r8, r2, r10)
            java.lang.Object r7 = r0.mo24885n(r1, r7, r2, r10)
            java.lang.Object r4 = r0.mo24885n(r1, r4, r2, r10)
            java.lang.Object r5 = r0.mo24885n(r1, r5, r2, r10)
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            java.lang.Object r15 = r0.mo24885n(r1, r15, r2, r10)
            java.lang.Object r14 = r0.mo24885n(r1, r14, r2, r10)
            java.lang.Object r6 = r0.mo24885n(r1, r6, r2, r10)
            java.lang.Object r13 = r0.mo24885n(r1, r13, r2, r10)
            java.lang.Object r12 = r0.mo24885n(r1, r12, r2, r10)
            java.lang.Object r11 = r0.mo24885n(r1, r11, r2, r10)
            r24 = r3
            r3 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r23 = r3
            r3 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r22 = r3
            r3 = 14
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r21 = r3
            r3 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r20 = r3
            r3 = 16
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r19 = r3
            r3 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r18 = r3
            r3 = 18
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r17 = r3
            r3 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r16 = r3
            r3 = 20
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r65 = r3
            r3 = 21
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r25 = r3
            r3 = 22
            r26 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct$$serializer r4 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct$$serializer.INSTANCE
            java.lang.Object r3 = r0.mo24885n(r1, r3, r4, r10)
            r4 = 23
            r27 = r3
            kotlinx.serialization.internal.h0 r3 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r3 = r0.mo24885n(r1, r4, r3, r10)
            r4 = 24
            java.lang.Object r2 = r0.mo24885n(r1, r4, r2, r10)
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r37 = r4
            r31 = r6
            r32 = r13
            r30 = r14
            r29 = r15
            r6 = r22
            r35 = r23
            r14 = r25
            r4 = r26
            r15 = r65
            r13 = r3
            r3 = r24
            goto L_0x0494
        L_0x00e0:
            r48 = r8
            r2 = r9
            r3 = r10
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
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
            r47 = r46
        L_0x0107:
            if (r48 == 0) goto L_0x0454
            r49 = r11
            int r11 = r0.mo24931o(r1)
            switch(r11) {
                case -1: goto L_0x0426;
                case 0: goto L_0x03f7;
                case 1: goto L_0x03c1;
                case 2: goto L_0x038d;
                case 3: goto L_0x035b;
                case 4: goto L_0x032b;
                case 5: goto L_0x02fd;
                case 6: goto L_0x02d1;
                case 7: goto L_0x02a6;
                case 8: goto L_0x027c;
                case 9: goto L_0x0254;
                case 10: goto L_0x022e;
                case 11: goto L_0x0211;
                case 12: goto L_0x01f2;
                case 13: goto L_0x01d4;
                case 14: goto L_0x01ba;
                case 15: goto L_0x01a5;
                case 16: goto L_0x0192;
                case 17: goto L_0x017f;
                case 18: goto L_0x016c;
                case 19: goto L_0x015b;
                case 20: goto L_0x014c;
                case 21: goto L_0x013f;
                case 22: goto L_0x0132;
                case 23: goto L_0x0125;
                case 24: goto L_0x0118;
                default: goto L_0x0112;
            }
        L_0x0112:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r11)
            throw r0
        L_0x0118:
            r11 = 24
            r50 = r10
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r12 = r0.mo24885n(r1, r11, r10, r12)
            r10 = 16777216(0x1000000, float:2.3509887E-38)
            goto L_0x0158
        L_0x0125:
            r50 = r10
            r10 = 23
            kotlinx.serialization.internal.h0 r11 = kotlinx.serialization.internal.C12276h0.f30067a
            java.lang.Object r13 = r0.mo24885n(r1, r10, r11, r13)
            r10 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0158
        L_0x0132:
            r50 = r10
            r10 = 22
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct$$serializer r11 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct$$serializer.INSTANCE
            java.lang.Object r6 = r0.mo24885n(r1, r10, r11, r6)
            r10 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0158
        L_0x013f:
            r50 = r10
            r10 = 21
            kotlinx.serialization.internal.s1 r11 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r14 = r0.mo24885n(r1, r10, r11, r14)
            r10 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0158
        L_0x014c:
            r50 = r10
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r11 = 20
            java.lang.Object r15 = r0.mo24885n(r1, r11, r10, r15)
            r10 = 1048576(0x100000, float:1.469368E-39)
        L_0x0158:
            r2 = r2 | r10
            goto L_0x01ce
        L_0x015b:
            r50 = r10
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r65 = r6
            r6 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r6, r10, r3)
            r10 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01b8
        L_0x016c:
            r65 = r6
            r50 = r10
            r6 = 19
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r6 = 18
            java.lang.Object r5 = r0.mo24885n(r1, r6, r10, r5)
            r10 = 262144(0x40000, float:3.67342E-40)
            goto L_0x01b8
        L_0x017f:
            r65 = r6
            r50 = r10
            r6 = 18
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r6 = 17
            java.lang.Object r4 = r0.mo24885n(r1, r6, r10, r4)
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01b8
        L_0x0192:
            r65 = r6
            r50 = r10
            r6 = 17
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r6 = 16
            java.lang.Object r7 = r0.mo24885n(r1, r6, r10, r7)
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01b8
        L_0x01a5:
            r65 = r6
            r50 = r10
            r6 = 16
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r6 = 15
            java.lang.Object r8 = r0.mo24885n(r1, r6, r10, r8)
            r10 = 32768(0x8000, float:4.5918E-41)
        L_0x01b8:
            r2 = r2 | r10
            goto L_0x01cc
        L_0x01ba:
            r65 = r6
            r50 = r10
            r6 = 15
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r6 = 14
            java.lang.Object r9 = r0.mo24885n(r1, r6, r10, r9)
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L_0x01cc:
            r6 = r65
        L_0x01ce:
            r11 = r49
            r10 = r50
            goto L_0x0107
        L_0x01d4:
            r65 = r6
            r50 = r10
            r6 = 14
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r3
            r6 = r50
            r3 = 13
            java.lang.Object r10 = r0.mo24885n(r1, r3, r10, r6)
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r6 = r65
            r3 = r22
            r11 = r49
            goto L_0x0107
        L_0x01f2:
            r22 = r3
            r65 = r6
            r6 = r10
            r3 = 13
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r4
            r3 = r49
            r4 = 12
            java.lang.Object r3 = r0.mo24885n(r1, r4, r10, r3)
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r11 = r3
            r10 = r6
            r3 = r22
            r4 = r23
            goto L_0x0450
        L_0x0211:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r49
            r4 = 12
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r3
            r4 = r47
            r3 = 11
            java.lang.Object r47 = r0.mo24885n(r1, r3, r10, r4)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            goto L_0x0424
        L_0x022e:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r4 = r47
            r35 = r49
            r3 = 11
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r34 = r4
            r3 = r46
            r4 = 10
            java.lang.Object r46 = r0.mo24885n(r1, r4, r10, r3)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r10 = r6
            r3 = r22
            r4 = r23
            r47 = r34
            goto L_0x044e
        L_0x0254:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r46
            r34 = r47
            r35 = r49
            r4 = 10
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r33 = r3
            r4 = r45
            r3 = 9
            java.lang.Object r45 = r0.mo24885n(r1, r3, r10, r4)
            r2 = r2 | 512(0x200, float:7.175E-43)
            r10 = r6
            r3 = r22
            r4 = r23
            r46 = r33
            goto L_0x044e
        L_0x027c:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r4 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r3 = 9
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r32 = r4
            r3 = r44
            r4 = 8
            java.lang.Object r44 = r0.mo24885n(r1, r4, r10, r3)
            r2 = r2 | 256(0x100, float:3.59E-43)
            r10 = r6
            r3 = r22
            r4 = r23
            r45 = r32
            goto L_0x044e
        L_0x02a6:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r4 = 8
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r31 = r3
            r4 = r43
            r3 = 7
            java.lang.Object r43 = r0.mo24885n(r1, r3, r10, r4)
            r2 = r2 | 128(0x80, float:1.794E-43)
            r10 = r6
            r3 = r22
            r4 = r23
            r44 = r31
            goto L_0x044e
        L_0x02d1:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r4 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r3 = 7
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r4
            r3 = r42
            r4 = 6
            java.lang.Object r42 = r0.mo24885n(r1, r4, r10, r3)
            r2 = r2 | 64
            r10 = r6
            r3 = r22
            r4 = r23
            r43 = r30
            goto L_0x044e
        L_0x02fd:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r4 = 6
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r3
            r4 = r41
            r3 = 5
            java.lang.Object r41 = r0.mo24885n(r1, r3, r10, r4)
            r2 = r2 | 32
            r10 = r6
            r3 = r22
            r4 = r23
            r42 = r29
            goto L_0x044e
        L_0x032b:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r4 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r3 = 5
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r28 = r4
            r3 = r40
            r4 = 4
            java.lang.Object r40 = r0.mo24885n(r1, r4, r10, r3)
            r2 = r2 | 16
            r10 = r6
            r3 = r22
            r4 = r23
            r41 = r28
            goto L_0x044e
        L_0x035b:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r4 = 4
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r27 = r3
            r4 = r39
            r3 = 3
            java.lang.Object r39 = r0.mo24885n(r1, r3, r10, r4)
            r2 = r2 | 8
            r10 = r6
            r3 = r22
            r4 = r23
            r40 = r27
            goto L_0x044e
        L_0x038d:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r4 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r3 = 3
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r26 = r4
            r3 = r38
            r4 = 2
            java.lang.Object r38 = r0.mo24885n(r1, r4, r10, r3)
            r2 = r2 | 4
            r10 = r6
            r3 = r22
            r4 = r23
            r39 = r26
            goto L_0x044e
        L_0x03c1:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r4 = 2
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r25 = r3
            r4 = r37
            r3 = 1
            java.lang.Object r37 = r0.mo24885n(r1, r3, r10, r4)
            r2 = r2 | 2
            r10 = r6
            r3 = r22
            r4 = r23
            r38 = r25
            goto L_0x044e
        L_0x03f7:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r4 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r3 = 1
            r11 = 20
            kotlinx.serialization.internal.s1 r10 = kotlinx.serialization.internal.C12310s1.f30117a
            r3 = r36
            r11 = 0
            java.lang.Object r36 = r0.mo24885n(r1, r11, r10, r3)
            r2 = r2 | 1
        L_0x0424:
            r10 = r6
            goto L_0x044a
        L_0x0426:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r3 = r36
            r4 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r49
            r11 = 0
            r48 = r11
        L_0x044a:
            r3 = r22
            r4 = r23
        L_0x044e:
            r11 = r35
        L_0x0450:
            r6 = r65
            goto L_0x0107
        L_0x0454:
            r22 = r3
            r23 = r4
            r65 = r6
            r6 = r10
            r35 = r11
            r3 = r36
            r4 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r37 = r2
            r17 = r5
            r19 = r7
            r20 = r8
            r21 = r9
            r2 = r12
            r16 = r22
            r18 = r23
            r7 = r25
            r5 = r27
            r12 = r33
            r11 = r34
            r27 = r65
            r9 = r3
            r8 = r4
            r4 = r26
            r3 = r28
        L_0x0494:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct
            r36 = r0
            r38 = r9
            java.lang.String r38 = (java.lang.String) r38
            r39 = r8
            java.lang.String r39 = (java.lang.String) r39
            r40 = r7
            java.lang.String r40 = (java.lang.String) r40
            r41 = r4
            java.lang.String r41 = (java.lang.String) r41
            r42 = r5
            java.lang.String r42 = (java.lang.String) r42
            r43 = r3
            java.lang.String r43 = (java.lang.String) r43
            r44 = r29
            java.lang.String r44 = (java.lang.String) r44
            r45 = r30
            java.lang.String r45 = (java.lang.String) r45
            r46 = r31
            java.lang.String r46 = (java.lang.String) r46
            r47 = r32
            java.lang.String r47 = (java.lang.String) r47
            r48 = r12
            java.lang.String r48 = (java.lang.String) r48
            r49 = r11
            java.lang.String r49 = (java.lang.String) r49
            r50 = r35
            java.lang.String r50 = (java.lang.String) r50
            r51 = r6
            java.lang.String r51 = (java.lang.String) r51
            r52 = r21
            java.lang.String r52 = (java.lang.String) r52
            r53 = r20
            java.lang.String r53 = (java.lang.String) r53
            r54 = r19
            java.lang.String r54 = (java.lang.String) r54
            r55 = r18
            java.lang.String r55 = (java.lang.String) r55
            r56 = r17
            java.lang.String r56 = (java.lang.String) r56
            r57 = r16
            java.lang.String r57 = (java.lang.String) r57
            r58 = r15
            java.lang.String r58 = (java.lang.String) r58
            r59 = r14
            java.lang.String r59 = (java.lang.String) r59
            r60 = r27
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct r60 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct) r60
            r61 = r13
            java.lang.Integer r61 = (java.lang.Integer) r61
            r62 = r2
            java.lang.String r62 = (java.lang.String) r62
            r63 = 0
            r36.<init>((int) r37, (java.lang.String) r38, (java.lang.String) r39, (java.lang.String) r40, (java.lang.String) r41, (java.lang.String) r42, (java.lang.String) r43, (java.lang.String) r44, (java.lang.String) r45, (java.lang.String) r46, (java.lang.String) r47, (java.lang.String) r48, (java.lang.String) r49, (java.lang.String) r50, (java.lang.String) r51, (java.lang.String) r52, (java.lang.String) r53, (java.lang.String) r54, (java.lang.String) r55, (java.lang.String) r56, (java.lang.String) r57, (java.lang.String) r58, (java.lang.String) r59, (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct) r60, (java.lang.Integer) r61, (java.lang.String) r62, (kotlinx.serialization.internal.C12295n1) r63)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffCriteoProduct bffCriteoProduct) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffCriteoProduct, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffCriteoProduct.write$Self(bffCriteoProduct, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
