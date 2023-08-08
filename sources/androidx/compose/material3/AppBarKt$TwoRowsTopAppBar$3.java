package androidx.compose.material3;

import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1664:1\n73#2,7:1665\n80#2:1698\n84#2:1703\n75#3:1672\n76#3,11:1674\n89#3:1702\n76#4:1673\n460#5,13:1685\n473#5,3:1699\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt$TwoRowsTopAppBar$3\n*L\n1205#1:1665,7\n1205#1:1698\n1205#1:1703\n1205#1:1672\n1205#1:1674,11\n1205#1:1702\n1205#1:1673\n1205#1:1685,13\n1205#1:1699,3\n*E\n"})
public final class AppBarKt$TwoRowsTopAppBar$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $actionsRow;
    final /* synthetic */ float $bottomTitleAlpha;
    final /* synthetic */ C8270q3 $colors;
    final /* synthetic */ boolean $hideBottomRowSemantics;
    final /* synthetic */ boolean $hideTopRowSemantics;
    final /* synthetic */ Ref.FloatRef $maxHeightPx;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $navigationIcon;
    final /* synthetic */ Ref.FloatRef $pinnedHeightPx;
    final /* synthetic */ C8275r3 $scrollBehavior;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $smallTitle;
    final /* synthetic */ C16361p0 $smallTitleTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;
    final /* synthetic */ Ref.IntRef $titleBottomPaddingPx;
    final /* synthetic */ C16361p0 $titleTextStyle;
    final /* synthetic */ float $topTitleAlpha;
    final /* synthetic */ C2354e1 $windowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$3(C2354e1 e1Var, Ref.FloatRef floatRef, C8270q3 q3Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C16361p0 p0Var, float f, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, int i, Ref.FloatRef floatRef2, C8275r3 r3Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, C16361p0 p0Var2, float f2, Ref.IntRef intRef, boolean z2) {
        super(2);
        this.$windowInsets = e1Var;
        this.$pinnedHeightPx = floatRef;
        this.$colors = q3Var;
        this.$smallTitle = pVar;
        this.$smallTitleTextStyle = p0Var;
        this.$topTitleAlpha = f;
        this.$hideTopRowSemantics = z;
        this.$navigationIcon = pVar2;
        this.$actionsRow = pVar3;
        this.$$dirty = i;
        this.$maxHeightPx = floatRef2;
        this.$scrollBehavior = r3Var;
        this.$title = pVar4;
        this.$titleTextStyle = p0Var2;
        this.$bottomTitleAlpha = f2;
        this.$titleBottomPaddingPx = intRef;
        this.$hideBottomRowSemantics = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0188, code lost:
        r2 = r23.getState();
     */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            r15 = r42
            r1 = r43
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r42.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r42.mo14958a0()
            goto L_0x01e5
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1203)"
            r4 = 1985938853(0x765f05a5, float:1.1308561E33)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.foundation.layout.e1 r11 = r0.$windowInsets
            kotlin.jvm.internal.Ref$FloatRef r10 = r0.$pinnedHeightPx
            androidx.compose.material3.q3 r9 = r0.$colors
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r14 = r0.$smallTitle
            androidx.compose.ui.text.p0 r13 = r0.$smallTitleTextStyle
            float r12 = r0.$topTitleAlpha
            boolean r7 = r0.$hideTopRowSemantics
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r8 = r0.$navigationIcon
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r5 = r0.$actionsRow
            int r6 = r0.$$dirty
            kotlin.jvm.internal.Ref$FloatRef r3 = r0.$maxHeightPx
            androidx.compose.material3.r3 r4 = r0.$scrollBehavior
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r2 = r0.$title
            androidx.compose.ui.text.p0 r1 = r0.$titleTextStyle
            r16 = r14
            float r14 = r0.$bottomTitleAlpha
            r17 = r14
            kotlin.jvm.internal.Ref$IntRef r14 = r0.$titleBottomPaddingPx
            r18 = r14
            boolean r14 = r0.$hideBottomRowSemantics
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r21 = androidx.compose.foundation.layout.Arrangement.f6010a
            r19 = r1
            androidx.compose.foundation.layout.Arrangement$l r1 = r21.mo7631r()
            androidx.compose.ui.c$a r20 = androidx.compose.p004ui.C8734c.f23406a
            r43 = r2
            androidx.compose.ui.c$b r2 = r20.mo17072u()
            r20 = r3
            r3 = 0
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.ColumnKt.m9863b(r1, r2, r15, r3)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r15.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r15.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            r23 = r4
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r24 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r25 = r5
            kotlin.jvm.functions.a r5 = r24.mo44585a()
            r26 = r6
            kotlin.jvm.functions.q r6 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            r27 = r7
            androidx.compose.runtime.d r7 = r42.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00ae
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00ae:
            r42.mo14938T()
            boolean r7 = r42.mo14997l()
            if (r7 == 0) goto L_0x00bb
            r15.mo14947W(r5)
            goto L_0x00be
        L_0x00bb:
            r42.mo14888A()
        L_0x00be:
            r42.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r42)
            kotlin.jvm.functions.p r7 = r24.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r1, r7)
            kotlin.jvm.functions.p r1 = r24.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r1)
            kotlin.jvm.functions.p r1 = r24.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r1)
            kotlin.jvm.functions.p r1 = r24.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r1)
            r42.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r42)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.invoke(r1, r15, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.m10247g(r0, r11)
            androidx.compose.ui.m r1 = androidx.compose.p004ui.draw.C8744d.m32515b(r1)
            r22 = r19
            float r2 = r10.element
            r24 = r43
            long r3 = r9.mo12937c()
            r7 = r20
            long r5 = r9.mo12938d()
            long r19 = r9.mo12936b()
            r29 = r7
            r28 = r8
            r7 = r19
            androidx.compose.foundation.layout.Arrangement$e r19 = r21.mo7625f()
            r30 = r12
            r12 = r19
            androidx.compose.foundation.layout.Arrangement$d r19 = r21.mo7630p()
            r31 = r13
            r13 = r19
            r19 = 0
            r34 = r14
            r32 = r17
            r33 = r18
            r14 = r19
            int r17 = r26 << 3
            r35 = 458752(0x70000, float:6.42848E-40)
            r18 = r17 & r35
            r36 = 905969664(0x36000000, float:1.9073486E-6)
            r18 = r18 | r36
            r37 = 3670016(0x380000, float:5.142788E-39)
            r17 = r17 & r37
            r19 = r18 | r17
            int r14 = r26 >> 12
            r14 = r14 & 896(0x380, float:1.256E-42)
            r14 = r14 | 3078(0xc06, float:4.313E-42)
            r20 = r14
            r38 = r9
            r9 = r16
            r14 = r10
            r10 = r31
            r39 = r11
            r11 = r30
            r15 = r27
            r16 = r28
            r17 = r25
            r18 = r42
            r40 = r14
            r14 = 0
            androidx.compose.material3.AppBarKt.m25390j(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.layout.q1$a r1 = androidx.compose.foundation.layout.C2401q1.f6318b
            int r1 = r1.mo8146g()
            r2 = r39
            androidx.compose.foundation.layout.e1 r1 = androidx.compose.foundation.layout.C2358f1.m10397j(r2, r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.m10247g(r0, r1)
            androidx.compose.ui.m r1 = androidx.compose.p004ui.draw.C8744d.m32515b(r0)
            r0 = r29
            float r0 = r0.element
            r2 = r40
            float r2 = r2.element
            float r0 = r0 - r2
            if (r23 == 0) goto L_0x0193
            androidx.compose.material3.TopAppBarState r2 = r23.getState()
            if (r2 == 0) goto L_0x0193
            float r2 = r2.mo12413d()
            goto L_0x0194
        L_0x0193:
            r2 = 0
        L_0x0194:
            float r2 = r2 + r0
            long r3 = r38.mo12937c()
            long r5 = r38.mo12938d()
            long r7 = r38.mo12936b()
            androidx.compose.foundation.layout.Arrangement$l r12 = r21.mo7624d()
            androidx.compose.foundation.layout.Arrangement$d r13 = r21.mo7630p()
            r0 = r33
            int r14 = r0.element
            androidx.compose.material3.ComposableSingletons$AppBarKt r0 = androidx.compose.material3.ComposableSingletons$AppBarKt.f19229a
            kotlin.jvm.functions.p r16 = r0.mo11276c()
            kotlin.jvm.functions.p r17 = r0.mo11277d()
            int r0 = r26 << 12
            r9 = r0 & r35
            r9 = r9 | r36
            r0 = r0 & r37
            r19 = r9 | r0
            r20 = 3456(0xd80, float:4.843E-42)
            r9 = r24
            r10 = r22
            r11 = r32
            r15 = r34
            r18 = r42
            androidx.compose.material3.AppBarKt.m25390j(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r42.mo15002m0()
            r42.mo14896D()
            r42.mo15002m0()
            r42.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3.invoke(androidx.compose.runtime.o, int):void");
    }
}
