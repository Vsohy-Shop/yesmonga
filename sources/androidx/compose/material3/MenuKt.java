package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.C7922j;
import androidx.compose.material3.tokens.C8302f0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8698y1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.urbanairship.util.C9647e0;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,443:1\n936#2,4:444\n857#2,5:448\n936#2,4:453\n857#2,5:457\n67#3,3:462\n66#3:465\n460#3,13:491\n473#3,3:505\n1114#4,6:466\n75#5,6:472\n81#5:504\n85#5:509\n75#6:478\n76#6,11:480\n89#6:508\n76#7:479\n76#8:510\n76#8:511\n154#9:512\n154#9:513\n154#9:514\n154#9:515\n154#9:516\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n75#1:444,4\n75#1:448,5\n101#1:453,4\n101#1:457,5\n121#1:462,3\n121#1:465\n154#1:491,13\n154#1:505,3\n121#1:466,6\n154#1:472,6\n154#1:504\n154#1:509\n154#1:478\n154#1:480,11\n154#1:508\n154#1:479\n75#1:510\n101#1:511\n434#1:512\n435#1:513\n436#1:514\n437#1:515\n438#1:516\n*E\n"})
public final class MenuKt {

    /* renamed from: a */
    public static final float f19475a = C16483g.m74435M((float) 48);

    /* renamed from: b */
    public static final float f19476b = C16483g.m74435M((float) 12);

    /* renamed from: c */
    public static final float f19477c = C16483g.m74435M((float) 8);

    /* renamed from: d */
    public static final float f19478d = C16483g.m74435M((float) 112);

    /* renamed from: e */
    public static final float f19479e = C16483g.m74435M((float) 280);

    /* renamed from: f */
    public static final int f19480f = 120;

    /* renamed from: g */
    public static final int f19481g = 75;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m25868a(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1998o0<java.lang.Boolean> r22, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8700z0<androidx.compose.p004ui.graphics.C15283o4> r23, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r24, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            java.lang.String r0 = "expandedStates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "transformOriginState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -159754260(0xfffffffff67a57ec, float:-1.2693921E33)
            r3 = r26
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r6 = r28 & 1
            if (r6 == 0) goto L_0x0027
            r6 = r5 | 6
            goto L_0x0037
        L_0x0027:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0036
            boolean r6 = r3.mo15006n0(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 4
            goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r7 = r28 & 2
            if (r7 == 0) goto L_0x003e
            r6 = r6 | 48
            goto L_0x004e
        L_0x003e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x004e
            boolean r7 = r3.mo15006n0(r2)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x004b:
            r7 = 16
        L_0x004d:
            r6 = r6 | r7
        L_0x004e:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x0055
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r24
            boolean r9 = r3.mo15006n0(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r24
        L_0x006a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0071
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            boolean r9 = r3.mo14927P(r4)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r6 = r6 | r9
        L_0x0081:
            r14 = r6
            r6 = r14 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r6 != r9) goto L_0x0094
            boolean r6 = r3.mo15011p()
            if (r6 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r3.mo14958a0()
            goto L_0x025e
        L_0x0094:
            if (r7 == 0) goto L_0x009a
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            r15 = r6
            goto L_0x009b
        L_0x009a:
            r15 = r8
        L_0x009b:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            r13 = -1
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r13, r6)
        L_0x00a7:
            int r0 = androidx.compose.animation.core.C1998o0.f5575d
            r0 = r0 | 48
            r6 = r14 & 14
            r0 = r0 | r6
            java.lang.String r6 = "DropDownMenu"
            r12 = 0
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.m8195n(r1, r6, r3, r0, r12)
            androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2 r6 = androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2.f19483f
            r11 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.mo14918M(r11)
            java.lang.String r16 = "FloatAnimation"
            kotlin.jvm.internal.x r17 = kotlin.jvm.internal.C11377x.f28521a
            androidx.compose.animation.core.a1 r10 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r17)
            r9 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.mo14918M(r9)
            java.lang.Object r7 = r0.mo6700h()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1808111696(0x6bc59850, float:4.7775532E26)
            r3.mo14918M(r8)
            boolean r18 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r9 = "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)"
            if (r18 == 0) goto L_0x00e6
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r12, r13, r9)
        L_0x00e6:
            r18 = 1061997773(0x3f4ccccd, float:0.8)
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x00f0
            r7 = r19
            goto L_0x00f2
        L_0x00f0:
            r7 = r18
        L_0x00f2:
            boolean r20 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r20 == 0) goto L_0x00fb
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00fb:
            r3.mo15002m0()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r20 = r0.mo6706o()
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            r3.mo14918M(r8)
            boolean r21 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r21 == 0) goto L_0x0118
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r12, r13, r9)
        L_0x0118:
            if (r20 == 0) goto L_0x011c
            r18 = r19
        L_0x011c:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x0125
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0125:
            r3.mo15002m0()
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$b r9 = r0.mo6704m()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r6.invoke(r9, r3, r11)
            r9 = r6
            androidx.compose.animation.core.d0 r9 = (androidx.compose.animation.core.C1956d0) r9
            r18 = 0
            r6 = r0
            r11 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r11 = r16
            r1 = r12
            r12 = r3
            r5 = r13
            r13 = r18
            androidx.compose.runtime.k2 r13 = androidx.compose.animation.core.TransitionKt.m8194m(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.mo15002m0()
            r3.mo15002m0()
            androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2 r6 = androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2.f19482f
            r7 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r3.mo14918M(r7)
            java.lang.String r11 = "FloatAnimation"
            androidx.compose.animation.core.a1 r10 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r17)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r3.mo14918M(r7)
            java.lang.Object r7 = r0.mo6700h()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1864763068(0x6f2606bc, float:5.1382653E28)
            r3.mo14918M(r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            java.lang.String r12 = "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)"
            if (r9 == 0) goto L_0x0181
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r1, r5, r12)
        L_0x0181:
            r9 = 0
            if (r7 == 0) goto L_0x0187
            r7 = r19
            goto L_0x0188
        L_0x0187:
            r7 = r9
        L_0x0188:
            boolean r16 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r16 == 0) goto L_0x0191
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0191:
            r3.mo15002m0()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r16 = r0.mo6706o()
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            r3.mo14918M(r8)
            boolean r17 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r17 == 0) goto L_0x01ae
            androidx.compose.runtime.ComposerKt.m29845w0(r8, r1, r5, r12)
        L_0x01ae:
            if (r16 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r19 = r9
        L_0x01b3:
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x01bc
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01bc:
            r3.mo15002m0()
            java.lang.Float r8 = java.lang.Float.valueOf(r19)
            androidx.compose.animation.core.Transition$b r5 = r0.mo6704m()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r6.invoke(r5, r3, r1)
            r9 = r1
            androidx.compose.animation.core.d0 r9 = (androidx.compose.animation.core.C1956d0) r9
            r6 = r0
            r12 = r3
            r0 = r13
            r13 = r18
            androidx.compose.runtime.k2 r1 = androidx.compose.animation.core.TransitionKt.m8194m(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.mo15002m0()
            r3.mo15002m0()
            androidx.compose.ui.m$a r5 = androidx.compose.p004ui.C8767m.f23478j
            r6 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.mo14918M(r6)
            boolean r6 = r3.mo15006n0(r0)
            boolean r7 = r3.mo15006n0(r1)
            r6 = r6 | r7
            boolean r7 = r3.mo15006n0(r2)
            r6 = r6 | r7
            java.lang.Object r7 = r3.mo14921N()
            if (r6 != 0) goto L_0x0205
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x020d
        L_0x0205:
            androidx.compose.material3.MenuKt$DropdownMenuContent$1$1 r7 = new androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
            r7.<init>(r2, r0, r1)
            r3.mo14893C(r7)
        L_0x020d:
            r3.mo15002m0()
            kotlin.jvm.functions.l r7 = (kotlin.jvm.functions.C11300l) r7
            androidx.compose.ui.m r6 = androidx.compose.p004ui.graphics.C15320t2.m66557a(r5, r7)
            androidx.compose.material3.tokens.f0 r0 = androidx.compose.material3.tokens.C8302f0.f21080a
            androidx.compose.material3.tokens.ShapeKeyTokens r1 = r0.mo13505c()
            r5 = 6
            androidx.compose.ui.graphics.g4 r7 = androidx.compose.material3.ShapesKt.m26127f(r1, r3, r5)
            androidx.compose.material3.i1 r1 = androidx.compose.material3.C8215i1.f20180a
            androidx.compose.material3.z r1 = r1.mo12652a(r3, r5)
            androidx.compose.material3.tokens.ColorSchemeKeyTokens r5 = r0.mo13503a()
            long r8 = androidx.compose.material3.ColorSchemeKt.m25519f(r1, r5)
            r10 = 0
            float r12 = r0.mo13504b()
            float r13 = r0.mo13504b()
            r0 = 0
            androidx.compose.material3.MenuKt$DropdownMenuContent$2 r1 = new androidx.compose.material3.MenuKt$DropdownMenuContent$2
            r1.<init>(r15, r4, r14)
            r5 = -1651673913(0xffffffff9d8d74c7, float:-3.7443134E-21)
            r14 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r3, r5, r14, r1)
            r17 = 12804096(0xc36000, float:1.794236E-38)
            r18 = 72
            r14 = r0
            r0 = r15
            r15 = r1
            r16 = r3
            androidx.compose.material3.SurfaceKt.m26352a(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x025d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x025d:
            r8 = r0
        L_0x025e:
            androidx.compose.runtime.t1 r7 = r3.mo15020s()
            if (r7 != 0) goto L_0x0265
            goto L_0x0279
        L_0x0265:
            androidx.compose.material3.MenuKt$DropdownMenuContent$3 r9 = new androidx.compose.material3.MenuKt$DropdownMenuContent$3
            r0 = r9
            r1 = r22
            r2 = r23
            r3 = r8
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r9)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.m25868a(androidx.compose.animation.core.o0, androidx.compose.runtime.z0, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final float m25869b(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: c */
    public static final float m25870c(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: d */
    public static final void m25871d(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12579k C11289a<C11079d2> aVar, @C12579k C8767m mVar, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, @C12580l C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, boolean z, @C12579k C8234k1 k1Var, @C12579k C2366i0 i0Var, @C12579k C2243g gVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar;
        C11289a<C11079d2> aVar2 = aVar;
        C8767m mVar2 = mVar;
        C8234k1 k1Var2 = k1Var;
        C2366i0 i0Var2 = i0Var;
        C2243g gVar2 = gVar;
        int i12 = i;
        Intrinsics.checkNotNullParameter(pVar4, "text");
        Intrinsics.checkNotNullParameter(aVar2, "onClick");
        Intrinsics.checkNotNullParameter(mVar2, "modifier");
        Intrinsics.checkNotNullParameter(k1Var2, C9874a.f27063h);
        Intrinsics.checkNotNullParameter(i0Var2, "contentPadding");
        Intrinsics.checkNotNullParameter(gVar2, "interactionSource");
        C8592o o = oVar.mo15009o(-1564716777);
        if ((i12 & 14) == 0) {
            if (o.mo14927P(pVar4)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i12;
        } else {
            i2 = i12;
        }
        if ((i12 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i12 & 896) == 0) {
            if (o.mo15006n0(mVar2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar5 = pVar2;
        if ((i12 & 7168) == 0) {
            if (o.mo14927P(pVar5)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar6 = pVar3;
        if ((57344 & i12) == 0) {
            if (o.mo14927P(pVar6)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        boolean z2 = z;
        if ((458752 & i12) == 0) {
            if (o.mo14961b(z2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((3670016 & i12) == 0) {
            if (o.mo15006n0(k1Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((29360128 & i12) == 0) {
            if (o.mo15006n0(i0Var2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((234881024 & i12) == 0) {
            if (o.mo15006n0(gVar2)) {
                i3 = C8698y1.f23302n;
            } else {
                i3 = C9647e0.f26435a;
            }
            i2 |= i3;
        }
        int i13 = i2;
        if ((191739611 & i13) != 38347922 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1564716777, i13, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            int i14 = i13;
            C8767m n = SizeKt.m10114n(ClickableKt.m8876c(mVar, gVar, C7922j.m25285e(true, 0.0f, 0, o, 6, 6), z, (String) null, (C16031g) null, aVar, 24, (Object) null), 0.0f, 1, (Object) null);
            float f = f19478d;
            float f2 = f19479e;
            C8302f0 f0Var = C8302f0.f21080a;
            C8767m j = PaddingKt.m10023j(SizeKt.m10091G(n, f, f0Var.mo13507e(), f2, 0.0f, 8, (Object) null), i0Var2);
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(j);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            oVar2 = o;
            TextKt.m26698a(TypographyKt.m26914a(C8215i1.f20180a.mo12654c(o, 6), f0Var.mo13514l()), C8553b.m31048b(oVar2, 1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(pVar2, k1Var, z, i14, pVar3, RowScopeInstance.f6147a, pVar)), oVar2, 48);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new MenuKt$DropdownMenuItemContent$2(pVar, aVar, mVar, pVar2, pVar3, z, k1Var, i0Var, gVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m25875h(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16497o r5, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.unit.C16497o r6) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.mo47886t()
            int r1 = r5.mo47890x()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x0019
        L_0x0017:
            r0 = r3
            goto L_0x0053
        L_0x0019:
            int r0 = r6.mo47890x()
            int r1 = r5.mo47886t()
            if (r0 > r1) goto L_0x0025
            r0 = r2
            goto L_0x0053
        L_0x0025:
            int r0 = r6.mo47862G()
            if (r0 != 0) goto L_0x002c
            goto L_0x0017
        L_0x002c:
            int r0 = r5.mo47886t()
            int r1 = r6.mo47886t()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.mo47890x()
            int r4 = r6.mo47890x()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.mo47886t()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.mo47862G()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0053:
            int r1 = r6.mo47858B()
            int r4 = r5.mo47878j()
            if (r1 < r4) goto L_0x005f
        L_0x005d:
            r2 = r3
            goto L_0x0099
        L_0x005f:
            int r1 = r6.mo47878j()
            int r4 = r5.mo47858B()
            if (r1 > r4) goto L_0x006a
            goto L_0x0099
        L_0x006a:
            int r1 = r6.mo47885r()
            if (r1 != 0) goto L_0x0071
            goto L_0x005d
        L_0x0071:
            int r1 = r5.mo47858B()
            int r2 = r6.mo47858B()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.mo47878j()
            int r2 = r6.mo47878j()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.mo47858B()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.mo47885r()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x0099:
            long r5 = androidx.compose.p004ui.graphics.C15291p4.m66401a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.m25875h(androidx.compose.ui.unit.o, androidx.compose.ui.unit.o):long");
    }

    /* renamed from: i */
    public static final float m25876i() {
        return f19477c;
    }

    /* renamed from: j */
    public static final float m25877j() {
        return f19475a;
    }
}
