package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,226:1\n25#2:227\n50#2:237\n49#2:238\n1114#3,6:228\n1114#3,6:239\n75#4:234\n75#4:236\n154#5:235\n154#5:245\n154#5:246\n154#5:247\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n79#1:227\n115#1:237\n115#1:238\n79#1:228,6\n115#1:239,6\n82#1:234\n96#1:236\n82#1:235\n223#1:245\n224#1:246\n225#1:247\n*E\n"})
public final class RadioButtonKt {

    /* renamed from: a */
    public static final int f19587a = 100;

    /* renamed from: b */
    public static final float f19588b;

    /* renamed from: c */
    public static final float f19589c = C16483g.m74435M((float) 12);

    /* renamed from: d */
    public static final float f19590d;

    static {
        float f = (float) 2;
        f19588b = C16483g.m74435M(f);
        f19590d = C16483g.m74435M(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26066a(boolean r25, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r26, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r27, boolean r28, @org.jetbrains.annotations.C12580l androidx.compose.material3.C8378z1 r29, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r7 = r25
            r8 = r26
            r9 = r32
            r0 = 408580840(0x185a72e8, float:2.8233852E-24)
            r1 = r31
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r33 & 1
            r5 = 2
            if (r1 == 0) goto L_0x0017
            r1 = r9 | 6
            goto L_0x0027
        L_0x0017:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0026
            boolean r1 = r6.mo14961b(r7)
            if (r1 == 0) goto L_0x0023
            r1 = 4
            goto L_0x0024
        L_0x0023:
            r1 = r5
        L_0x0024:
            r1 = r1 | r9
            goto L_0x0027
        L_0x0026:
            r1 = r9
        L_0x0027:
            r2 = r33 & 2
            if (r2 == 0) goto L_0x002e
            r1 = r1 | 48
            goto L_0x003e
        L_0x002e:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003e
            boolean r2 = r6.mo14927P(r8)
            if (r2 == 0) goto L_0x003b
            r2 = 32
            goto L_0x003d
        L_0x003b:
            r2 = 16
        L_0x003d:
            r1 = r1 | r2
        L_0x003e:
            r2 = r33 & 4
            if (r2 == 0) goto L_0x0045
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0045:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0058
            r3 = r27
            boolean r4 = r6.mo15006n0(r3)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r4
            goto L_0x005a
        L_0x0058:
            r3 = r27
        L_0x005a:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x0061
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0061:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0074
            r10 = r28
            boolean r11 = r6.mo14961b(r10)
            if (r11 == 0) goto L_0x0070
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r1 = r1 | r11
            goto L_0x0076
        L_0x0074:
            r10 = r28
        L_0x0076:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x0091
            r11 = r33 & 16
            if (r11 != 0) goto L_0x008b
            r11 = r29
            boolean r12 = r6.mo15006n0(r11)
            if (r12 == 0) goto L_0x008d
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008b:
            r11 = r29
        L_0x008d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r1 = r1 | r12
            goto L_0x0093
        L_0x0091:
            r11 = r29
        L_0x0093:
            r22 = r33 & 32
            if (r22 == 0) goto L_0x009d
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            r15 = r30
            goto L_0x00b0
        L_0x009d:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r15 = r30
            if (r12 != 0) goto L_0x00b0
            boolean r12 = r6.mo15006n0(r15)
            if (r12 == 0) goto L_0x00ad
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r1 = r1 | r12
        L_0x00b0:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00c9
            boolean r12 = r6.mo15011p()
            if (r12 != 0) goto L_0x00c0
            goto L_0x00c9
        L_0x00c0:
            r6.mo14958a0()
            r4 = r10
            r5 = r11
            r11 = r6
            r6 = r15
            goto L_0x0247
        L_0x00c9:
            r6.mo14930Q()
            r12 = r9 & 1
            r23 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00e9
            boolean r12 = r6.mo14977f0()
            if (r12 == 0) goto L_0x00da
            goto L_0x00e9
        L_0x00da:
            r6.mo14958a0()
            r2 = r33 & 16
            if (r2 == 0) goto L_0x00e3
            r1 = r1 & r23
        L_0x00e3:
            r4 = r3
            r3 = r10
            r2 = r11
            r17 = r15
            goto L_0x013a
        L_0x00e9:
            if (r2 == 0) goto L_0x00ee
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00ef
        L_0x00ee:
            r2 = r3
        L_0x00ef:
            if (r4 == 0) goto L_0x00f3
            r3 = 1
            goto L_0x00f4
        L_0x00f3:
            r3 = r10
        L_0x00f4:
            r4 = r33 & 16
            if (r4 == 0) goto L_0x0113
            androidx.compose.material3.a2 r10 = androidx.compose.material3.C8171a2.f19986a
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r21 = 15
            r15 = r16
            r17 = r18
            r19 = r6
            androidx.compose.material3.z1 r4 = r10.mo12448a(r11, r13, r15, r17, r19, r20, r21)
            r1 = r1 & r23
            r11 = r4
        L_0x0113:
            if (r22 == 0) goto L_0x0136
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r4)
            java.lang.Object r4 = r6.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r4 != r10) goto L_0x012e
            androidx.compose.foundation.interaction.g r4 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r6.mo14893C(r4)
        L_0x012e:
            r6.mo15002m0()
            androidx.compose.foundation.interaction.g r4 = (androidx.compose.foundation.interaction.C2243g) r4
            r17 = r4
            goto L_0x0138
        L_0x0136:
            r17 = r30
        L_0x0138:
            r4 = r2
            r2 = r11
        L_0x013a:
            r6.mo14899E()
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x0149
            r10 = -1
            java.lang.String r11 = "androidx.compose.material3.RadioButton (RadioButton.kt:72)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r10, r11)
        L_0x0149:
            r0 = 0
            if (r7 == 0) goto L_0x0155
            float r10 = f19589c
            float r11 = (float) r5
            float r10 = r10 / r11
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
            goto L_0x015a
        L_0x0155:
            float r10 = (float) r0
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r10)
        L_0x015a:
            r11 = 100
            r15 = 0
            r14 = 6
            androidx.compose.animation.core.z0 r11 = androidx.compose.animation.core.C1972h.m8392q(r11, r0, r15, r14, r15)
            r12 = 0
            r13 = 0
            r16 = 48
            r18 = 12
            r19 = r14
            r14 = r6
            r15 = r16
            r16 = r18
            androidx.compose.runtime.k2 r15 = androidx.compose.animation.core.AnimateAsStateKt.m7969c(r10, r11, r12, r13, r14, r15, r16)
            int r10 = r1 >> 9
            r10 = r10 & 14
            int r11 = r1 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            int r1 = r1 >> 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r10
            androidx.compose.runtime.k2 r1 = r2.mo14862a(r3, r7, r6, r1)
            r10 = 735546407(0x2bd78c27, float:1.5315569E-12)
            r6.mo14918M(r10)
            if (r8 == 0) goto L_0x01ce
            androidx.compose.ui.m$a r18 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.semantics.g$a r10 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r19 = r10.mo46125e()
            r10 = 0
            androidx.compose.material3.tokens.s0 r11 = androidx.compose.material3.tokens.C8338s0.f22041a
            float r11 = r11.mo14394h()
            float r12 = (float) r5
            float r11 = r11 / r12
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            r12 = 0
            r16 = 54
            r20 = 4
            r14 = r6
            r24 = r15
            r15 = r16
            r16 = r20
            androidx.compose.foundation.a0 r10 = androidx.compose.material.ripple.C7922j.m25285e(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.g r11 = androidx.compose.p004ui.semantics.C16031g.m72093h(r19)
            r12 = r0
            r0 = r18
            r13 = r1
            r1 = r25
            r14 = r2
            r2 = r17
            r15 = r3
            r3 = r10
            r10 = r4
            r4 = r15
            r7 = r5
            r5 = r11
            r11 = r6
            r6 = r26
            androidx.compose.ui.m r0 = androidx.compose.foundation.selection.SelectableKt.m12058a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d9
        L_0x01ce:
            r12 = r0
            r13 = r1
            r14 = r2
            r10 = r4
            r7 = r5
            r11 = r6
            r24 = r15
            r15 = r3
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
        L_0x01d9:
            r11.mo15002m0()
            if (r8 == 0) goto L_0x01e5
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.material3.InteractiveComponentSizeKt.m25834f(r1)
            goto L_0x01e7
        L_0x01e5:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
        L_0x01e7:
            androidx.compose.ui.m r1 = r10.mo17224k3(r1)
            androidx.compose.ui.m r0 = r1.mo17224k3(r0)
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r1 = r1.mo17066i()
            r2 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10098N(r0, r1, r12, r7, r2)
            float r1 = f19588b
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r1)
            androidx.compose.material3.tokens.s0 r1 = androidx.compose.material3.tokens.C8338s0.f22041a
            float r1 = r1.mo14389c()
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10121u(r0, r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo14918M(r1)
            boolean r1 = r11.mo15006n0(r13)
            r2 = r24
            boolean r3 = r11.mo15006n0(r2)
            r1 = r1 | r3
            java.lang.Object r3 = r11.mo14921N()
            if (r1 != 0) goto L_0x0229
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r3 != r1) goto L_0x0231
        L_0x0229:
            androidx.compose.material3.RadioButtonKt$RadioButton$2$1 r3 = new androidx.compose.material3.RadioButtonKt$RadioButton$2$1
            r3.<init>(r13, r2)
            r11.mo14893C(r3)
        L_0x0231:
            r11.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.foundation.CanvasKt.m8873b(r0, r3, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0242
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0242:
            r3 = r10
            r5 = r14
            r4 = r15
            r6 = r17
        L_0x0247:
            androidx.compose.runtime.t1 r10 = r11.mo15020s()
            if (r10 != 0) goto L_0x024e
            goto L_0x025f
        L_0x024e:
            androidx.compose.material3.RadioButtonKt$RadioButton$3 r11 = new androidx.compose.material3.RadioButtonKt$RadioButton$3
            r0 = r11
            r1 = r25
            r2 = r26
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.mo15202a(r11)
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RadioButtonKt.m26066a(boolean, kotlin.jvm.functions.a, androidx.compose.ui.m, boolean, androidx.compose.material3.z1, androidx.compose.foundation.interaction.g, androidx.compose.runtime.o, int, int):void");
    }
}
