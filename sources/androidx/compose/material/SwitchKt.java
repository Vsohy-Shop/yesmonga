package androidx.compose.material;

import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ripple.C7922j;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.ShadowKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.contentsquare.android.api.C14092c;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,380:1\n25#2:381\n460#2,13:410\n473#2,3:424\n25#2:429\n50#2:436\n49#2:437\n36#2:444\n36#2:454\n1114#3,6:382\n1114#3,6:430\n1114#3,6:438\n1114#3,6:445\n1114#3,6:455\n76#4:388\n76#4:390\n76#4:398\n76#4:451\n76#4:452\n1#5:389\n67#6,6:391\n73#6:423\n77#6:428\n75#7:397\n76#7,11:399\n89#7:427\n51#8:453\n58#8:468\n76#9:461\n76#9:462\n154#10:463\n154#10:464\n154#10:465\n154#10:466\n154#10:467\n154#10:469\n154#10:470\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material/SwitchKt\n*L\n94#1:381\n115#1:410,13\n115#1:424,3\n185#1:429\n187#1:436\n187#1:437\n208#1:444\n223#1:454\n94#1:382,6\n185#1:430,6\n187#1:438,6\n208#1:445,6\n223#1:455,6\n98#1:388\n100#1:390\n115#1:398\n212#1:451\n213#1:452\n115#1:391,6\n115#1:423\n115#1:428\n115#1:397\n115#1:399,11\n115#1:427\n213#1:453\n254#1:468\n206#1:461\n211#1:462\n245#1:463\n246#1:464\n247#1:465\n249#1:466\n251#1:467\n258#1:469\n259#1:470\n*E\n"})
public final class SwitchKt {

    /* renamed from: a */
    public static final float f7922a;

    /* renamed from: b */
    public static final float f7923b = C16483g.m74435M((float) 14);

    /* renamed from: c */
    public static final float f7924c;

    /* renamed from: d */
    public static final float f7925d = C16483g.m74435M((float) 24);

    /* renamed from: e */
    public static final float f7926e = C16483g.m74435M((float) 2);

    /* renamed from: f */
    public static final float f7927f;

    /* renamed from: g */
    public static final float f7928g;

    /* renamed from: h */
    public static final float f7929h;
    @C12579k

    /* renamed from: i */
    public static final C2023z0<Float> f7930i = new C2023z0(100, 0, (C2022z) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final float f7931j = C16483g.m74435M((float) 1);

    /* renamed from: k */
    public static final float f7932k = C16483g.m74435M((float) 6);

    static {
        float M = C16483g.m74435M((float) 34);
        f7922a = M;
        float M2 = C16483g.m74435M((float) 20);
        f7924c = M2;
        f7927f = M;
        f7928g = M2;
        f7929h = C16483g.m74435M(M - M2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015f  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14058a(boolean r36, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r37, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r38, boolean r39, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r40, @org.jetbrains.annotations.C12580l androidx.compose.material.C7892p1 r41, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43, int r44) {
        /*
            r7 = r37
            r8 = r43
            r0 = 25866825(0x18ab249, float:5.094902E-38)
            r1 = r42
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r44 & 1
            r5 = 2
            if (r1 == 0) goto L_0x0017
            r1 = r8 | 6
            r4 = r36
            goto L_0x0029
        L_0x0017:
            r1 = r8 & 14
            r4 = r36
            if (r1 != 0) goto L_0x0028
            boolean r1 = r6.mo14961b(r4)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = r5
        L_0x0026:
            r1 = r1 | r8
            goto L_0x0029
        L_0x0028:
            r1 = r8
        L_0x0029:
            r2 = r44 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0040
        L_0x0030:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0040
            boolean r2 = r6.mo14927P(r7)
            if (r2 == 0) goto L_0x003d
            r2 = 32
            goto L_0x003f
        L_0x003d:
            r2 = 16
        L_0x003f:
            r1 = r1 | r2
        L_0x0040:
            r2 = r44 & 4
            if (r2 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x0047:
            r3 = r8 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005a
            r3 = r38
            boolean r9 = r6.mo15006n0(r3)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r1 = r1 | r9
            goto L_0x005c
        L_0x005a:
            r3 = r38
        L_0x005c:
            r9 = r44 & 8
            if (r9 == 0) goto L_0x0063
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0076
            r10 = r39
            boolean r11 = r6.mo14961b(r10)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r1 = r1 | r11
            goto L_0x0078
        L_0x0076:
            r10 = r39
        L_0x0078:
            r11 = r44 & 16
            if (r11 == 0) goto L_0x007f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x007f:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0094
            r12 = r40
            boolean r13 = r6.mo15006n0(r12)
            if (r13 == 0) goto L_0x0090
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r13
            goto L_0x0096
        L_0x0094:
            r12 = r40
        L_0x0096:
            r32 = 458752(0x70000, float:6.42848E-40)
            r13 = r8 & r32
            if (r13 != 0) goto L_0x00b1
            r13 = r44 & 32
            if (r13 != 0) goto L_0x00ab
            r13 = r41
            boolean r14 = r6.mo15006n0(r13)
            if (r14 == 0) goto L_0x00ad
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ab:
            r13 = r41
        L_0x00ad:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r1 = r1 | r14
            goto L_0x00b3
        L_0x00b1:
            r13 = r41
        L_0x00b3:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00cc
            boolean r14 = r6.mo15011p()
            if (r14 != 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            r6.mo14958a0()
            r0 = r6
            r4 = r10
            r5 = r12
            r6 = r13
            goto L_0x02ff
        L_0x00cc:
            r6.mo14930Q()
            r14 = r8 & 1
            r33 = -458753(0xfffffffffff8ffff, float:NaN)
            r34 = 1
            if (r14 == 0) goto L_0x00f2
            boolean r14 = r6.mo14977f0()
            if (r14 == 0) goto L_0x00df
            goto L_0x00f2
        L_0x00df:
            r6.mo14958a0()
            r2 = r44 & 32
            if (r2 == 0) goto L_0x00e8
            r1 = r1 & r33
        L_0x00e8:
            r9 = r1
            r15 = r3
            r17 = r10
            r35 = r12
        L_0x00ee:
            r30 = r13
            goto L_0x0156
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x00f8
        L_0x00f7:
            r2 = r3
        L_0x00f8:
            if (r9 == 0) goto L_0x00fd
            r3 = r34
            goto L_0x00fe
        L_0x00fd:
            r3 = r10
        L_0x00fe:
            if (r11 == 0) goto L_0x0121
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r9)
            java.lang.Object r9 = r6.mo14921N()
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r9 != r10) goto L_0x0119
            androidx.compose.foundation.interaction.g r9 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r6.mo14893C(r9)
        L_0x0119:
            r6.mo15002m0()
            androidx.compose.foundation.interaction.g r9 = (androidx.compose.foundation.interaction.C2243g) r9
            r35 = r9
            goto L_0x0123
        L_0x0121:
            r35 = r12
        L_0x0123:
            r9 = r44 & 32
            if (r9 == 0) goto L_0x0151
            androidx.compose.material.q1 r9 = androidx.compose.material.C7903q1.f18967a
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            r30 = 6
            r31 = 1023(0x3ff, float:1.434E-42)
            r28 = r6
            androidx.compose.material.p1 r9 = r9.mo10989a(r10, r12, r14, r15, r17, r19, r20, r22, r24, r26, r28, r29, r30, r31)
            r1 = r1 & r33
            r15 = r2
            r17 = r3
            r30 = r9
            r9 = r1
            goto L_0x0156
        L_0x0151:
            r9 = r1
            r15 = r2
            r17 = r3
            goto L_0x00ee
        L_0x0156:
            r6.mo14899E()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0165
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Switch (Switch.kt:88)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r1, r2)
        L_0x0165:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r6.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            float r1 = f7929h
            float r10 = r0.mo7425g5(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r36)
            if (r7 != 0) goto L_0x017f
            androidx.compose.material.SwitchKt$Switch$swipeableState$1 r0 = androidx.compose.material.SwitchKt$Switch$swipeableState$1.f7934f
            r2 = r0
            goto L_0x0180
        L_0x017f:
            r2 = r7
        L_0x0180:
            androidx.compose.animation.core.z0<java.lang.Float> r3 = f7930i
            r0 = r9 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            r11 = 0
            r4 = r6
            r12 = r5
            r5 = r0
            r14 = r6
            r6 = r11
            androidx.compose.material.SwipeableState r11 = androidx.compose.material.SwipeableKt.m13911j(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r14.mo15032w(r0)
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            r13 = 0
            if (r0 != r1) goto L_0x01a0
            r23 = r34
            goto L_0x01a2
        L_0x01a0:
            r23 = r13
        L_0x01a2:
            if (r7 == 0) goto L_0x01be
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.semantics.g$a r1 = androidx.compose.p004ui.semantics.C16031g.f39793b
            int r1 = r1.mo46126f()
            r3 = 0
            androidx.compose.ui.semantics.g r5 = androidx.compose.p004ui.semantics.C16031g.m72093h(r1)
            r1 = r36
            r2 = r35
            r4 = r17
            r6 = r37
            androidx.compose.ui.m r0 = androidx.compose.foundation.selection.ToggleableKt.m12065a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01c0
        L_0x01be:
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
        L_0x01c0:
            if (r7 == 0) goto L_0x01c9
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r1 = androidx.compose.material.InteractiveComponentSizeKt.m13549f(r1)
            goto L_0x01cb
        L_0x01c9:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
        L_0x01cb:
            androidx.compose.ui.m r1 = r15.mo17224k3(r1)
            androidx.compose.ui.m r18 = r1.mo17224k3(r0)
            kotlin.Pair[] r0 = new kotlin.Pair[r12]
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r2)
            r0[r13] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r2)
            r0[r34] = r1
            java.util.Map r20 = kotlin.collections.C10977s0.m41456W(r0)
            androidx.compose.foundation.gestures.Orientation r21 = androidx.compose.foundation.gestures.Orientation.Horizontal
            if (r17 == 0) goto L_0x01fb
            if (r7 == 0) goto L_0x01fb
            r22 = r34
            goto L_0x01fd
        L_0x01fb:
            r22 = r13
        L_0x01fd:
            androidx.compose.material.SwitchKt$Switch$2 r25 = androidx.compose.material.SwitchKt$Switch$2.f7933f
            r26 = 0
            r27 = 0
            r28 = 256(0x100, float:3.59E-43)
            r29 = 0
            r19 = r11
            r24 = r35
            androidx.compose.ui.m r0 = androidx.compose.material.SwipeableKt.m13913l(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r2 = r1.mo17066i()
            r3 = 0
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10098N(r0, r2, r13, r12, r3)
            float r2 = f7926e
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10024k(r0, r2)
            float r2 = f7927f
            float r3 = f7928g
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10123w(r0, r2, r3)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r14.mo14918M(r2)
            androidx.compose.ui.c r1 = r1.mo17061C()
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.BoxKt.m9849k(r1, r13, r14, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r14.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r14.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r14.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r6 = r5.mo44585a()
            kotlin.jvm.functions.q r0 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r10 = r14.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x026f
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x026f:
            r14.mo14938T()
            boolean r10 = r14.mo14997l()
            if (r10 == 0) goto L_0x027c
            r14.mo14947W(r6)
            goto L_0x027f
        L_0x027c:
            r14.mo14888A()
        L_0x027f:
            r14.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r14)
            kotlin.jvm.functions.p r10 = r5.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r1, r10)
            kotlin.jvm.functions.p r1 = r5.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r1)
            kotlin.jvm.functions.p r1 = r5.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r3, r1)
            kotlin.jvm.functions.p r1 = r5.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r1)
            r14.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r14)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.runtime.k2 r13 = r11.mo10518v()
            int r1 = r9 << 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 6
            r2 = r2 | r3
            int r4 = r9 >> 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r3 = r9 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r32
            r16 = r2 | r1
            r9 = r0
            r10 = r36
            r11 = r17
            r12 = r30
            r0 = r14
            r14 = r35
            r2 = r15
            r15 = r0
            m14059b(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x02f8
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02f8:
            r3 = r2
            r4 = r17
            r6 = r30
            r5 = r35
        L_0x02ff:
            androidx.compose.runtime.t1 r9 = r0.mo15020s()
            if (r9 != 0) goto L_0x0306
            goto L_0x0317
        L_0x0306:
            androidx.compose.material.SwitchKt$Switch$4 r10 = new androidx.compose.material.SwitchKt$Switch$4
            r0 = r10
            r1 = r36
            r2 = r37
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo15202a(r10)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.m14058a(boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, boolean, androidx.compose.foundation.interaction.g, androidx.compose.material.p1, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m14059b(C2362h hVar, boolean z, boolean z2, C7892p1 p1Var, C8578k2<Float> k2Var, C2241e eVar, C8592o oVar, int i) {
        int i2;
        float f;
        long j;
        C8767m.C8768a aVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C2362h hVar2 = hVar;
        boolean z3 = z;
        boolean z4 = z2;
        C7892p1 p1Var2 = p1Var;
        C8578k2<Float> k2Var2 = k2Var;
        C2241e eVar2 = eVar;
        int i9 = i;
        C8592o o = oVar.mo15009o(-1834839253);
        if ((i9 & 14) == 0) {
            if (o.mo15006n0(hVar2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            i2 = i9;
        }
        if ((i9 & 112) == 0) {
            if (o.mo14961b(z3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i9 & 896) == 0) {
            if (o.mo14961b(z4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 7168) == 0) {
            if (o.mo15006n0(p1Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i9) == 0) {
            if (o.mo15006n0(k2Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i9) == 0) {
            if (o.mo15006n0(eVar2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) != 74898 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1834839253, i2, -1, "androidx.compose.material.SwitchImpl (Switch.kt:177)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar2 = C8592o.f23032a;
            if (N == aVar2.mo16277a()) {
                N = C8415c2.m30237f();
                o.mo14893C(N);
            }
            o.mo15002m0();
            SnapshotStateList snapshotStateList = (SnapshotStateList) N;
            int i10 = (i2 >> 15) & 14;
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(eVar2) | o.mo15006n0(snapshotStateList);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar2.mo16277a()) {
                N2 = new SwitchKt$SwitchImpl$1$1(eVar2, snapshotStateList, (C11045c<? super SwitchKt$SwitchImpl$1$1>) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            EffectsKt.m29896h(eVar2, (C11304p) N2, o, i10 | 64);
            if (!snapshotStateList.isEmpty()) {
                f = f7932k;
            } else {
                f = f7931j;
            }
            float f2 = f;
            int i11 = ((i2 >> 6) & 14) | (i2 & 112) | ((i2 >> 3) & 896);
            C8578k2<C15240j2> a = p1Var2.mo10913a(z4, z3, o, i11);
            C8767m.C8768a aVar3 = C8767m.f23478j;
            C8734c.C8735a aVar4 = C8734c.f23406a;
            C8767m l = SizeKt.m10112l(hVar2.mo7701c(aVar3, aVar4.mo17066i()), 0.0f, 1, (Object) null);
            o.mo14918M(1157296644);
            boolean n02 = o.mo15006n0(a);
            Object N3 = o.mo14921N();
            if (n02 || N3 == aVar2.mo16277a()) {
                N3 = new SwitchKt$SwitchImpl$2$1(a);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            CanvasKt.m8873b(l, (C11300l) N3, o, 0);
            C8578k2<C15240j2> b = p1Var2.mo10914b(z4, z3, o, i11);
            C3041f0 f0Var = (C3041f0) o.mo15032w(ElevationOverlayKt.m13498d());
            float M = C16483g.m74435M(((C16483g) o.mo15032w(ElevationOverlayKt.m13497c())).mo47823t0() + f2);
            o.mo14918M(-539245302);
            C8767m.C8768a aVar5 = aVar3;
            if (!C15240j2.m66082y(m14061d(b), C7933t0.f19075a.mo11075a(o, 6).mo10975n()) || f0Var == null) {
                aVar = aVar5;
                j = m14061d(b);
            } else {
                aVar = aVar5;
                j = f0Var.mo10754a(m14061d(b), M, o, 0);
            }
            long j2 = j;
            o.mo15002m0();
            C8767m c = hVar2.mo7701c(aVar, aVar4.mo17069o());
            o.mo14918M(1157296644);
            boolean n03 = o.mo15006n0(k2Var2);
            Object N4 = o.mo14921N();
            if (n03 || N4 == aVar2.mo16277a()) {
                N4 = new SwitchKt$SwitchImpl$3$1(k2Var2);
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C2428y0.m10726a(BackgroundKt.m8824c(ShadowKt.m32495b(SizeKt.m10121u(IndicationKt.m8973b(OffsetKt.m9998d(c, (C11300l) N4), eVar2, C7922j.m25285e(false, f7925d, 0, o, 54, 4)), f7924c), f2, C2694o.m12169k(), false, 0, 0, 24, (Object) null), j2, C2694o.m12169k()), o, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SwitchKt$SwitchImpl$4(hVar, z, z2, p1Var, k2Var, eVar, i));
        }
    }

    /* renamed from: c */
    public static final long m14060c(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* renamed from: d */
    public static final long m14061d(C8578k2<C15240j2> k2Var) {
        return k2Var.getValue().mo42833M();
    }

    /* renamed from: h */
    public static final void m14065h(C15187e eVar, long j, float f, float f2) {
        float f3 = f2 / ((float) 2);
        C15187e.m65695K2(eVar, j, C15096g.m64898a(f3, C15094f.m64882r(eVar.mo42717U())), C15096g.m64898a(f - f3, C15094f.m64882r(eVar.mo42717U())), f2, C15244j4.f37564b.mo42863b(), (C15242j3) null, 0.0f, (C15249k2) null, 0, C14092c.f34573Y0, (Object) null);
    }

    /* renamed from: i */
    public static final float m14066i() {
        return f7924c;
    }

    /* renamed from: j */
    public static final float m14067j() {
        return f7923b;
    }

    /* renamed from: k */
    public static final float m14068k() {
        return f7922a;
    }
}
