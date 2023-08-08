package com.carrefour.fid.android.presentation.p035ui.home.toolbar;

import androidx.compose.foundation.layout.C2362h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26509i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nToolbarHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarHome.kt\ncom/carrefour/fid/android/presentation/ui/home/toolbar/ToolbarHomeKt$ToolbarHome$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,196:1\n74#2,6:197\n80#2:229\n84#2:249\n75#3:203\n76#3,11:205\n89#3:248\n76#4:204\n460#5,13:216\n36#5:231\n36#5:238\n473#5,3:245\n154#6:230\n1114#7,6:232\n1114#7,6:239\n*S KotlinDebug\n*F\n+ 1 ToolbarHome.kt\ncom/carrefour/fid/android/presentation/ui/home/toolbar/ToolbarHomeKt$ToolbarHome$1\n*L\n81#1:197,6\n81#1:229\n81#1:249\n81#1:203\n81#1:205,11\n81#1:248\n81#1:204\n81#1:216,13\n93#1:231\n94#1:238\n81#1:245,3\n89#1:230\n93#1:232,6\n94#1:239,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1 */
public final class ToolbarHomeKt$ToolbarHome$1 extends Lambda implements C11305q<C2362h, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C24216a, C11079d2> $actioner;
    final /* synthetic */ float $collapseState;
    final /* synthetic */ float $insetTop;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ boolean $userHasNotification;
    final /* synthetic */ C26509i $userStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToolbarHomeKt$ToolbarHome$1(C8767m mVar, float f, C26509i iVar, boolean z, float f2, C11300l<? super C24216a, C11079d2> lVar, int i) {
        super(3);
        this.$modifier = mVar;
        this.$insetTop = f;
        this.$userStatus = iVar;
        this.$userHasNotification = z;
        this.$collapseState = f2;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70843a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2362h r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r15 = r26
            r2 = r27
            java.lang.String r3 = "$this$WithBackgroundImage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            if (r3 != 0) goto L_0x001c
            boolean r3 = r15.mo15006n0(r1)
            if (r3 == 0) goto L_0x0019
            r3 = 4
            goto L_0x001a
        L_0x0019:
            r3 = 2
        L_0x001a:
            r3 = r3 | r2
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            r3 = r3 & 91
            r4 = 18
            if (r3 != r4) goto L_0x002f
            boolean r3 = r26.mo15011p()
            if (r3 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r26.mo14958a0()
            goto L_0x01bf
        L_0x002f:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x003e
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHome.<anonymous> (ToolbarHome.kt:79)"
            r5 = 1544521708(0x5c0f87ec, float:1.61601477E17)
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
        L_0x003e:
            androidx.compose.ui.m r2 = r0.$modifier
            r17 = 0
            float r3 = r0.$insetTop
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            r16 = r2
            r18 = r3
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r4 = r3.mo17074y()
            androidx.compose.ui.m r1 = r1.mo7701c(r2, r4)
            com.carrefour.fid.android.presentation.viewmodels.home.state.i r2 = r0.$userStatus
            boolean r4 = r0.$userHasNotification
            float r5 = r0.$collapseState
            kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.ui.home.toolbar.a, kotlin.d2> r9 = r0.$actioner
            int r6 = r0.$$dirty
            r7 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo14918M(r7)
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r7 = r7.mo7631r()
            androidx.compose.ui.c$b r3 = r3.mo17072u()
            r10 = 0
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r7, r3, r15, r10)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r7)
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r7 = r15.mo15032w(r7)
            androidx.compose.ui.unit.d r7 = (androidx.compose.p004ui.unit.C16479d) r7
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r15.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r15.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r14 = r13.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            androidx.compose.runtime.d r8 = r26.mo15017r()
            boolean r8 = r8 instanceof androidx.compose.runtime.C8428d
            if (r8 != 0) goto L_0x00b6
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00b6:
            r26.mo14938T()
            boolean r8 = r26.mo14997l()
            if (r8 == 0) goto L_0x00c3
            r15.mo14947W(r14)
            goto L_0x00c6
        L_0x00c3:
            r26.mo14888A()
        L_0x00c6:
            r26.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r26)
            kotlin.jvm.functions.p r14 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r3, r14)
            kotlin.jvm.functions.p r3 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r7, r3)
            kotlin.jvm.functions.p r3 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r11, r3)
            kotlin.jvm.functions.p r3 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r12, r3)
            r26.mo14972e()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.C8684u1.m31906b(r26)
            androidx.compose.runtime.u1 r3 = androidx.compose.runtime.C8684u1.m31905a(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r1.invoke(r3, r15, r7)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r3 = r6 & 112(0x70, float:1.57E-43)
            r7 = 6
            r3 = r3 | r7
            r7 = r6 & 896(0x380, float:1.256E-42)
            r3 = r3 | r7
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r7
            int r6 = r6 >> 3
            r7 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r7
            r7 = r3 | r6
            r3 = r4
            r4 = r5
            r5 = r9
            r6 = r26
            com.carrefour.fid.android.presentation.p035ui.home.toolbar.ToolbarHomeKt.m106586a(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.m$a r17 = androidx.compose.p004ui.C8767m.f23478j
            r1 = 4
            float r1 = (float) r1
            float r19 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r1 = 9
            float r1 = (float) r1
            float r21 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r1 = 16
            float r1 = (float) r1
            float r20 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r18 = 0
            r22 = 1
            r23 = 0
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r17, r18, r19, r20, r21, r22, r23)
            com.carrefour.fid.android.design.components.compose.SearchBarVariant r2 = com.carrefour.fid.android.design.components.compose.SearchBarVariant.WHITE
            r3 = 2131953594(0x7f1307ba, float:1.9543663E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r3, r15, r10)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r11)
            boolean r12 = r15.mo15006n0(r9)
            java.lang.Object r13 = r26.mo14921N()
            if (r12 != 0) goto L_0x0164
            androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r12.mo16277a()
            if (r13 != r12) goto L_0x016c
        L_0x0164:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1$1$1$1 r13 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1$1$1$1
            r13.<init>(r9)
            r15.mo14893C(r13)
        L_0x016c:
            r26.mo15002m0()
            r12 = r13
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            r13 = 0
            r15.mo14918M(r11)
            boolean r11 = r15.mo15006n0(r9)
            java.lang.Object r14 = r26.mo14921N()
            if (r11 != 0) goto L_0x0188
            androidx.compose.runtime.o$a r11 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r11 = r11.mo16277a()
            if (r14 != r11) goto L_0x0190
        L_0x0188:
            com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1$1$2$1 r14 = new com.carrefour.fid.android.presentation.ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1$1$2$1
            r14.<init>(r9)
            r15.mo14893C(r14)
        L_0x0190:
            r26.mo15002m0()
            kotlin.jvm.functions.a r14 = (kotlin.jvm.functions.C11289a) r14
            r16 = 24624(0x6030, float:3.4506E-41)
            r17 = 0
            r18 = 1512(0x5e8, float:2.119E-42)
            r9 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r26
            r14 = r16
            r15 = r17
            r16 = r18
            com.carrefour.fid.android.design.components.compose.SearchBarComponentKt.m151597c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r26.mo15002m0()
            r26.mo14896D()
            r26.mo15002m0()
            r26.mo15002m0()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01bf
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.home.toolbar.ToolbarHomeKt$ToolbarHome$1.mo70843a(androidx.compose.foundation.layout.h, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo70843a((C2362h) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
