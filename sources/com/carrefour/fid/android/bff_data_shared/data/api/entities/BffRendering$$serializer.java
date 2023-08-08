package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import com.urbanairship.iam.C9139b;
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
@C11076d0(mo22515d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"com/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering.$serializer", "Lkotlinx/serialization/internal/y;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "", "Lkotlinx/serialization/g;", "childSerializers", "()[Lkotlinx/serialization/g;", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/g;", "encoder", "value", "Lkotlin/d2;", "serialize", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "descriptor", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class BffRendering$$serializer implements C12327y<BffRendering> {
    @C12579k
    public static final BffRendering$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BffRendering$$serializer bffRendering$$serializer = new BffRendering$$serializer();
        INSTANCE = bffRendering$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering", bffRendering$$serializer, 30);
        pluginGeneratedSerialDescriptor.mo24966k("header_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("redirect_url", true);
        pluginGeneratedSerialDescriptor.mo24966k("button_1_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_button_2_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_button_3_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_button_4_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_button_5_text", true);
        pluginGeneratedSerialDescriptor.mo24966k(C9139b.f24752Y, true);
        pluginGeneratedSerialDescriptor.mo24966k("background_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("button_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("selected_button_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("button_text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("selected_button_text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_type", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_text", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_text_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_background_color", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_redirect_url", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_redirect_url_app", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_redirect_target", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_footer_media_file", true);
        pluginGeneratedSerialDescriptor.mo24966k("mobile_logo_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("bff_background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("mobile_background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("desktop_background_image", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_desktop_multibackground_image_2", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_desktop_multibackground_image_3", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_desktop_multibackground_image_4", true);
        pluginGeneratedSerialDescriptor.mo24966k("optional_desktop_multibackground_image_5", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BffRendering$$serializer() {
    }

    @C12579k
    public C12248g<?>[] childSerializers() {
        C12310s1 s1Var = C12310s1.f30117a;
        return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0230, code lost:
        r24 = r37;
        r25 = r38;
        r26 = r39;
        r27 = r40;
        r28 = r41;
        r29 = r42;
        r30 = r43;
        r31 = r44;
        r32 = r45;
        r33 = r46;
        r34 = r47;
        r35 = r48;
        r23 = r49;
        r22 = r50;
        r21 = r51;
        r20 = r52;
        r4 = r54;
        r5 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0706, code lost:
        r5 = r18;
        r4 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x070a, code lost:
        r3 = r17;
        r52 = r20;
        r51 = r21;
        r50 = r22;
        r49 = r23;
        r37 = r24;
        r38 = r25;
        r39 = r26;
        r40 = r27;
        r41 = r28;
        r42 = r29;
        r43 = r30;
        r44 = r31;
        r45 = r32;
        r46 = r33;
        r47 = r34;
        r48 = r35;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering deserialize(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12241e r60) {
        /*
            r59 = this;
            r0 = r60
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.serialization.descriptors.f r1 = r59.getDescriptor()
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
            if (r2 == 0) goto L_0x0118
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
            r60 = r3
            r3 = 21
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r25 = r3
            r3 = 22
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r26 = r3
            r3 = 23
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r27 = r3
            r3 = 24
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r28 = r3
            r3 = 25
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r29 = r3
            r3 = 26
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r30 = r3
            r3 = 27
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r31 = r3
            r3 = 28
            java.lang.Object r3 = r0.mo24885n(r1, r3, r2, r10)
            r32 = r3
            r3 = 29
            java.lang.Object r2 = r0.mo24885n(r1, r3, r2, r10)
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r35 = r23
            r33 = r29
            r34 = r30
            r36 = r31
            r37 = r32
            r23 = r19
            r29 = r25
            r30 = r26
            r31 = r27
            r32 = r28
            r28 = r60
            r27 = r16
            r26 = r17
            r25 = r18
            r16 = r11
            r11 = r15
            r15 = r12
            r12 = r14
            r14 = r13
            r13 = r6
            r6 = r8
            r8 = r4
            r4 = r3
            r56 = r9
            r9 = r5
            r5 = r56
            goto L_0x0794
        L_0x0118:
            r53 = r8
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
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
        L_0x0149:
            if (r53 == 0) goto L_0x072e
            r54 = r4
            int r4 = r0.mo24931o(r1)
            switch(r4) {
                case -1: goto L_0x06d9;
                case 0: goto L_0x06a0;
                case 1: goto L_0x0663;
                case 2: goto L_0x0628;
                case 3: goto L_0x05ec;
                case 4: goto L_0x05b0;
                case 5: goto L_0x0574;
                case 6: goto L_0x0538;
                case 7: goto L_0x04fb;
                case 8: goto L_0x04bd;
                case 9: goto L_0x047f;
                case 10: goto L_0x0441;
                case 11: goto L_0x0403;
                case 12: goto L_0x03c5;
                case 13: goto L_0x0387;
                case 14: goto L_0x0349;
                case 15: goto L_0x0309;
                case 16: goto L_0x02ca;
                case 17: goto L_0x0290;
                case 18: goto L_0x0256;
                case 19: goto L_0x021d;
                case 20: goto L_0x020a;
                case 21: goto L_0x01f7;
                case 22: goto L_0x01e4;
                case 23: goto L_0x01d1;
                case 24: goto L_0x01be;
                case 25: goto L_0x01aa;
                case 26: goto L_0x0196;
                case 27: goto L_0x0182;
                case 28: goto L_0x016e;
                case 29: goto L_0x015a;
                default: goto L_0x0154;
            }
        L_0x0154:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>((int) r4)
            throw r0
        L_0x015a:
            r4 = 29
            r55 = r5
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r7)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r7 = r4
            goto L_0x0230
        L_0x016e:
            r55 = r5
            r4 = 28
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r8)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r8 = r4
            goto L_0x0230
        L_0x0182:
            r55 = r5
            r4 = 27
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r9)
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r9 = r4
            goto L_0x0230
        L_0x0196:
            r55 = r5
            r4 = 26
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r10)
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r10 = r4
            goto L_0x0230
        L_0x01aa:
            r55 = r5
            r4 = 25
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r11)
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r11 = r4
            goto L_0x0230
        L_0x01be:
            r55 = r5
            r4 = 24
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r12)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r12 = r4
            goto L_0x0230
        L_0x01d1:
            r55 = r5
            r4 = 23
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r13)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r13 = r4
            goto L_0x0230
        L_0x01e4:
            r55 = r5
            r4 = 22
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r6)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r6 = r4
            goto L_0x0230
        L_0x01f7:
            r55 = r5
            r4 = 21
            kotlinx.serialization.internal.s1 r5 = kotlinx.serialization.internal.C12310s1.f30117a
            java.lang.Object r4 = r0.mo24885n(r1, r4, r5, r14)
            r5 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r17 = r3
            r14 = r4
            goto L_0x0230
        L_0x020a:
            r55 = r5
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 20
            java.lang.Object r4 = r0.mo24885n(r1, r5, r4, r15)
            r15 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r15
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r17 = r3
            r15 = r4
            goto L_0x0230
        L_0x021d:
            r55 = r5
            r5 = 20
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r5 = 19
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r4 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r4
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r17 = r3
        L_0x0230:
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r4 = r54
            r5 = r55
            goto L_0x069d
        L_0x0256:
            r55 = r5
            r5 = 19
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r17 = r3
            r5 = r55
            r3 = 18
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r5 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r5 = r4
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r4 = r54
            goto L_0x069d
        L_0x0290:
            r17 = r3
            r3 = 18
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r18 = r5
            r3 = r54
            r5 = 17
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r4 = r3
            r5 = r18
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            goto L_0x069d
        L_0x02ca:
            r17 = r3
            r18 = r5
            r3 = r54
            r5 = 17
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r19 = r3
            r5 = r52
            r3 = 16
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r5 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r5
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r20 = r4
            r5 = r18
            r4 = r19
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            goto L_0x069d
        L_0x0309:
            r17 = r3
            r18 = r5
            r5 = r52
            r19 = r54
            r3 = 16
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r20 = r5
            r3 = r51
            r5 = 15
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r4
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r21 = r3
            r5 = r18
            r4 = r19
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            goto L_0x069d
        L_0x0349:
            r17 = r3
            r18 = r5
            r3 = r51
            r20 = r52
            r19 = r54
            r5 = 15
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r21 = r3
            r5 = r50
            r3 = 14
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r22 = r4
            r5 = r18
            r4 = r19
            r24 = r37
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
            r35 = r48
            r23 = r49
            goto L_0x069d
        L_0x0387:
            r17 = r3
            r18 = r5
            r5 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 14
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r22 = r5
            r3 = r49
            r5 = 13
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r23 = r3
            r5 = r18
            r4 = r19
            r24 = r37
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
            r35 = r48
            goto L_0x069d
        L_0x03c5:
            r17 = r3
            r18 = r5
            r3 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 13
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r23 = r3
            r5 = r48
            r3 = 12
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r35 = r4
            r5 = r18
            r4 = r19
            r24 = r37
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
            goto L_0x069d
        L_0x0403:
            r17 = r3
            r18 = r5
            r5 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 12
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r35 = r5
            r3 = r47
            r5 = 11
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r34 = r3
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            goto L_0x069d
        L_0x0441:
            r17 = r3
            r18 = r5
            r3 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 11
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r34 = r3
            r5 = r46
            r3 = 10
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r33 = r4
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            goto L_0x069d
        L_0x047f:
            r17 = r3
            r18 = r5
            r5 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 10
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r33 = r5
            r3 = r45
            r5 = 9
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 512(0x200, float:7.175E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r32 = r3
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            goto L_0x069d
        L_0x04bd:
            r17 = r3
            r18 = r5
            r3 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 9
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r32 = r3
            r5 = r44
            r3 = 8
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 256(0x100, float:3.59E-43)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r31 = r4
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            goto L_0x069d
        L_0x04fb:
            r17 = r3
            r18 = r5
            r5 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 8
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r31 = r5
            r3 = r43
            r5 = 7
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 128(0x80, float:1.794E-43)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r30 = r3
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            goto L_0x069d
        L_0x0538:
            r17 = r3
            r18 = r5
            r3 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 7
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r30 = r3
            r5 = r42
            r3 = 6
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 64
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r29 = r4
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            goto L_0x069d
        L_0x0574:
            r17 = r3
            r18 = r5
            r5 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 6
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r29 = r5
            r3 = r41
            r5 = 5
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 32
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r28 = r3
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            r27 = r40
            goto L_0x069d
        L_0x05b0:
            r17 = r3
            r18 = r5
            r3 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 5
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r28 = r3
            r5 = r40
            r3 = 4
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 16
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r27 = r4
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            r26 = r39
            goto L_0x069d
        L_0x05ec:
            r17 = r3
            r18 = r5
            r5 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 4
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r27 = r5
            r3 = r39
            r5 = 3
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 8
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r26 = r3
            r5 = r18
            r4 = r19
            r24 = r37
            r25 = r38
            goto L_0x069d
        L_0x0628:
            r17 = r3
            r18 = r5
            r3 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 3
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r26 = r3
            r5 = r38
            r3 = 2
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 4
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r25 = r4
            r5 = r18
            r4 = r19
            r24 = r37
            goto L_0x069d
        L_0x0663:
            r17 = r3
            r18 = r5
            r5 = r38
            r26 = r39
            r27 = r40
            r28 = r41
            r29 = r42
            r30 = r43
            r31 = r44
            r32 = r45
            r33 = r46
            r34 = r47
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 2
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r25 = r5
            r3 = r37
            r5 = 1
            java.lang.Object r3 = r0.mo24885n(r1, r5, r4, r3)
            r2 = r2 | 2
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r24 = r3
            r5 = r18
            r4 = r19
        L_0x069d:
            r3 = 0
            goto L_0x070a
        L_0x06a0:
            r17 = r3
            r18 = r5
            r3 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 1
            kotlinx.serialization.internal.s1 r4 = kotlinx.serialization.internal.C12310s1.f30117a
            r24 = r3
            r5 = r36
            r3 = 0
            java.lang.Object r4 = r0.mo24885n(r1, r3, r4, r5)
            r2 = r2 | 1
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r36 = r4
            goto L_0x0706
        L_0x06d9:
            r17 = r3
            r18 = r5
            r5 = r36
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 0
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r53 = r3
        L_0x0706:
            r5 = r18
            r4 = r19
        L_0x070a:
            r3 = r17
            r52 = r20
            r51 = r21
            r50 = r22
            r49 = r23
            r37 = r24
            r38 = r25
            r39 = r26
            r40 = r27
            r41 = r28
            r42 = r29
            r43 = r30
            r44 = r31
            r45 = r32
            r46 = r33
            r47 = r34
            r48 = r35
            goto L_0x0149
        L_0x072e:
            r17 = r3
            r19 = r4
            r18 = r5
            r5 = r36
            r24 = r37
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
            r35 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r4 = r2
            r2 = r7
            r37 = r8
            r36 = r9
            r7 = r25
            r8 = r26
            r9 = r27
            r16 = r34
            r34 = r10
            r27 = r17
            r26 = r18
            r25 = r19
            r56 = r30
            r30 = r6
            r6 = r24
            r24 = r28
            r28 = r15
            r15 = r33
            r33 = r11
            r11 = r29
            r29 = r14
            r14 = r32
            r32 = r12
            r12 = r56
            r57 = r31
            r31 = r13
            r13 = r57
            r58 = r23
            r23 = r20
            r20 = r21
            r21 = r22
            r22 = r58
        L_0x0794:
            r0.mo24876c(r1)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering r0 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering
            r3 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = r24
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r16 = (java.lang.String) r16
            r17 = r35
            java.lang.String r17 = (java.lang.String) r17
            r18 = r22
            java.lang.String r18 = (java.lang.String) r18
            r19 = r21
            java.lang.String r19 = (java.lang.String) r19
            java.lang.String r20 = (java.lang.String) r20
            r21 = r23
            java.lang.String r21 = (java.lang.String) r21
            r22 = r25
            java.lang.String r22 = (java.lang.String) r22
            r23 = r26
            java.lang.String r23 = (java.lang.String) r23
            r24 = r27
            java.lang.String r24 = (java.lang.String) r24
            r25 = r28
            java.lang.String r25 = (java.lang.String) r25
            r26 = r29
            java.lang.String r26 = (java.lang.String) r26
            r27 = r30
            java.lang.String r27 = (java.lang.String) r27
            r28 = r31
            java.lang.String r28 = (java.lang.String) r28
            r29 = r32
            java.lang.String r29 = (java.lang.String) r29
            r30 = r33
            java.lang.String r30 = (java.lang.String) r30
            r31 = r34
            java.lang.String r31 = (java.lang.String) r31
            r32 = r36
            java.lang.String r32 = (java.lang.String) r32
            r33 = r37
            java.lang.String r33 = (java.lang.String) r33
            r34 = r2
            java.lang.String r34 = (java.lang.String) r34
            r35 = 0
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (kotlinx.serialization.internal.C12295n1) r35)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering$$serializer.deserialize(kotlinx.serialization.encoding.e):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering");
    }

    @C12579k
    public C12217f getDescriptor() {
        return descriptor;
    }

    public void serialize(@C12579k C12244g gVar, @C12579k BffRendering bffRendering) {
        Intrinsics.checkNotNullParameter(gVar, "encoder");
        Intrinsics.checkNotNullParameter(bffRendering, "value");
        C12217f descriptor2 = getDescriptor();
        C12239d b = gVar.mo24906b(descriptor2);
        BffRendering.write$Self(bffRendering, b, descriptor2);
        b.mo24907c(descriptor2);
    }

    @C12579k
    public C12248g<?>[] typeParametersSerializers() {
        return C12327y.C12328a.m49635a(this);
    }
}
