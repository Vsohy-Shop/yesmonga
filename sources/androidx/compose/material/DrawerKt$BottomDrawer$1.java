package androidx.compose.material;

import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,713:1\n36#2:714\n460#2,13:741\n36#2:755\n36#2:762\n473#2,3:769\n1114#3,6:715\n1114#3,6:756\n1114#3,6:763\n76#4:721\n76#4:729\n67#5,6:722\n73#5:754\n77#5:773\n75#6:728\n76#6,11:730\n89#6:772\n76#7:774\n102#7,2:775\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1\n*L\n536#1:714\n577#1:741,13\n593#1:755\n594#1:762\n577#1:769,3\n536#1:715,6\n593#1:756,6\n594#1:763,6\n555#1:721\n577#1:729\n577#1:722,6\n577#1:754\n577#1:773\n577#1:728\n577#1:730,11\n577#1:772\n536#1:774\n536#1:775,2\n*E\n"})
public final class DrawerKt$BottomDrawer$1 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ C15218g4 $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1(boolean z, BottomDrawerState bottomDrawerState, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, long j, C15218g4 g4Var, long j2, long j3, float f, C12074o0 o0Var, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = pVar;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = g4Var;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$scope = o0Var;
        this.$drawerContent = qVar;
    }

    /* renamed from: c */
    public static final float m13449c(C8700z0<Float> z0Var) {
        return z0Var.getValue().floatValue();
    }

    /* renamed from: d */
    public static final void m13450d(C8700z0<Float> z0Var, float f) {
        z0Var.setValue(Float.valueOf(f));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.compose.runtime.z0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10139b(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2365i r28, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r13 = r29
            r2 = r30
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            r4 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r13.mo15006n0(r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r5 = 18
            if (r3 != r5) goto L_0x0030
            boolean r3 = r29.mo15011p()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r29.mo14958a0()
            goto L_0x02ea
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:533)"
            r6 = 1220102512(0x48b94970, float:379467.5)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r2, r3, r5)
        L_0x003f:
            long r2 = r28.mo8086b()
            int r2 = androidx.compose.p004ui.unit.C16476b.m74361o(r2)
            float r2 = (float) r2
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r7)
            boolean r3 = r13.mo15006n0(r3)
            java.lang.Object r5 = r29.mo14921N()
            r8 = 0
            if (r3 != 0) goto L_0x0065
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r5 != r3) goto L_0x0070
        L_0x0065:
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            androidx.compose.runtime.z0 r5 = androidx.compose.runtime.C8539f2.m30981g(r3, r8, r4, r8)
            r13.mo14893C(r5)
        L_0x0070:
            r29.mo15002m0()
            r9 = r5
            androidx.compose.runtime.z0 r9 = (androidx.compose.runtime.C8700z0) r9
            long r5 = r28.mo8086b()
            int r3 = androidx.compose.p004ui.unit.C16476b.m74362p(r5)
            long r5 = r28.mo8086b()
            int r5 = androidx.compose.p004ui.unit.C16476b.m74361o(r5)
            r10 = 1
            r11 = 0
            if (r3 <= r5) goto L_0x008c
            r3 = r10
            goto L_0x008d
        L_0x008c:
            r3 = r11
        L_0x008d:
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r2
            float r6 = m13449c(r9)
            float r6 = r2 - r6
            r12 = 0
            float r6 = java.lang.Math.max(r12, r6)
            float r12 = m13449c(r9)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 < 0) goto L_0x00d2
            if (r3 == 0) goto L_0x00a6
            goto L_0x00d2
        L_0x00a6:
            r3 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.material.BottomDrawerValue r12 = androidx.compose.material.BottomDrawerValue.Closed
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r12)
            r3[r11] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Open
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r3[r10] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Expanded
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r3[r4] = r2
            java.util.Map r2 = kotlin.collections.C10977s0.m41456W(r3)
            goto L_0x00f0
        L_0x00d2:
            kotlin.Pair[] r3 = new kotlin.Pair[r4]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Closed
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r3[r11] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r6)
            androidx.compose.material.BottomDrawerValue r5 = androidx.compose.material.BottomDrawerValue.Expanded
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r3[r10] = r2
            java.util.Map r2 = kotlin.collections.C10977s0.m41456W(r3)
        L_0x00f0:
            r16 = r2
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r13.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r18 = 0
            r19 = 0
            long r5 = r28.mo8086b()
            int r5 = androidx.compose.p004ui.unit.C16476b.m74362p(r5)
            float r20 = r2.mo7416L(r5)
            long r5 = r28.mo8086b()
            int r1 = androidx.compose.p004ui.unit.C16476b.m74361o(r5)
            float r21 = r2.mo7416L(r1)
            r22 = 3
            r23 = 0
            r17 = r3
            androidx.compose.ui.m r12 = androidx.compose.foundation.layout.SizeKt.m10091G(r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = r0.$gesturesEnabled
            if (r1 == 0) goto L_0x0133
            androidx.compose.material.BottomDrawerState r1 = r0.$drawerState
            androidx.compose.ui.input.nestedscroll.a r1 = r1.mo10012U()
            androidx.compose.ui.m r1 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68305b(r3, r1, r8, r4, r8)
            goto L_0x0134
        L_0x0133:
            r1 = r3
        L_0x0134:
            androidx.compose.ui.m r14 = r3.mo17224k3(r1)
            androidx.compose.material.BottomDrawerState r15 = r0.$drawerState
            androidx.compose.foundation.gestures.Orientation r17 = androidx.compose.foundation.gestures.Orientation.Vertical
            boolean r1 = r0.$gesturesEnabled
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 368(0x170, float:5.16E-43)
            r25 = 0
            r18 = r1
            androidx.compose.ui.m r1 = androidx.compose.material.SwipeableKt.m13913l(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r2 = r0.$content
            int r14 = r0.$$dirty
            long r3 = r0.$scrimColor
            androidx.compose.material.BottomDrawerState r15 = r0.$drawerState
            androidx.compose.ui.graphics.g4 r6 = r0.$drawerShape
            r16 = r9
            long r8 = r0.$drawerBackgroundColor
            r18 = r8
            long r7 = r0.$drawerContentColor
            float r9 = r0.$drawerElevation
            boolean r5 = r0.$gesturesEnabled
            kotlinx.coroutines.o0 r10 = r0.$scope
            kotlin.jvm.functions.q<androidx.compose.foundation.layout.k, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r11 = r0.$drawerContent
            r0 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r13.mo14918M(r0)
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r0 = r0.mo17061C()
            r22 = r6
            r6 = 0
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.BoxKt.m9849k(r0, r6, r13, r6)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r13.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            r23 = r9
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r9 = r13.mo15032w(r9)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p004ui.unit.LayoutDirection) r9
            r24 = r7
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r7 = r13.mo15032w(r7)
            androidx.compose.ui.platform.c4 r7 = (androidx.compose.p004ui.platform.C15863c4) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r28 = r11
            kotlin.jvm.functions.a r11 = r8.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            r26 = r12
            androidx.compose.runtime.d r12 = r29.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x01c0
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c0:
            r29.mo14938T()
            boolean r12 = r29.mo14997l()
            if (r12 == 0) goto L_0x01cd
            r13.mo14947W(r11)
            goto L_0x01d0
        L_0x01cd:
            r29.mo14888A()
        L_0x01d0:
            r29.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r29)
            kotlin.jvm.functions.p r12 = r8.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r0, r12)
            kotlin.jvm.functions.p r0 = r8.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r6, r0)
            kotlin.jvm.functions.p r0 = r8.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r9, r0)
            kotlin.jvm.functions.p r0 = r8.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r7, r0)
            r29.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r29)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1.invoke(r0, r13, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            int r0 = r14 >> 27
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r13, r0)
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$1 r0 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$1
            r0.<init>(r5, r15, r10)
            java.lang.Object r1 = r15.mo10490A()
            androidx.compose.material.BottomDrawerValue r2 = androidx.compose.material.BottomDrawerValue.Closed
            if (r1 == r2) goto L_0x0228
            r5 = 1
            goto L_0x0229
        L_0x0228:
            r5 = 0
        L_0x0229:
            int r1 = r14 >> 24
            r6 = r1 & 14
            r1 = r3
            r3 = r0
            r4 = r5
            r5 = r29
            r0 = r22
            androidx.compose.material.DrawerKt.m13434b(r1, r3, r4, r5, r6)
            androidx.compose.material.k1$a r1 = androidx.compose.material.C7875k1.f18863b
            int r1 = r1.mo10865e()
            r2 = 6
            java.lang.String r1 = androidx.compose.material.C7879l1.m25061a(r1, r13, r2)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r2)
            boolean r2 = r13.mo15006n0(r15)
            java.lang.Object r3 = r29.mo14921N()
            if (r2 != 0) goto L_0x025a
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0262
        L_0x025a:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1 r3 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
            r3.<init>(r15)
            r13.mo14893C(r3)
        L_0x0262:
            r29.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            r2 = r26
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.OffsetKt.m9998d(r2, r3)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r3)
            r5 = r16
            boolean r3 = r13.mo15006n0(r5)
            java.lang.Object r4 = r29.mo14921N()
            if (r3 != 0) goto L_0x0287
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x028f
        L_0x0287:
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1 r4 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
            r4.<init>(r5)
            r13.mo14893C(r4)
        L_0x028f:
            r29.mo15002m0()
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            androidx.compose.ui.m r2 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r2, r4)
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$4 r3 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$4
            r3.<init>(r1, r15, r10)
            r1 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r2, r5, r3, r4, r1)
            r7 = 0
            androidx.compose.material.DrawerKt$BottomDrawer$1$1$5 r2 = new androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
            r3 = r28
            r2.<init>(r3, r14)
            r3 = 457750254(0x1b48b6ee, float:1.660272E-22)
            androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r3, r4, r2)
            int r2 = r14 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r3
            int r3 = r14 >> 12
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r14
            r11 = r2 | r3
            r12 = 16
            r2 = r0
            r3 = r18
            r5 = r24
            r8 = r23
            r10 = r29
            androidx.compose.material.SurfaceKt.m13879b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r29.mo15002m0()
            r29.mo14896D()
            r29.mo15002m0()
            r29.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02ea
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$BottomDrawer$1.mo10139b(androidx.compose.foundation.layout.i, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10139b((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
