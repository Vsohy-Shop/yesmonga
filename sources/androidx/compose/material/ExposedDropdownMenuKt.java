package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,731:1\n76#2:732\n76#2:733\n76#2:788\n25#3:734\n25#3:741\n25#3:749\n67#3,3:756\n66#3:759\n25#3:766\n50#3:773\n49#3:774\n460#3,13:800\n473#3,3:814\n50#3:819\n49#3:820\n1114#4,6:735\n1114#4,6:742\n1114#4,6:750\n1114#4,6:760\n1114#4,6:767\n1114#4,6:775\n1114#4,6:821\n1#5:748\n67#6,6:781\n73#6:813\n77#6:818\n75#7:787\n76#7,11:789\n89#7:817\n76#8:827\n102#8,2:828\n76#8:830\n102#8,2:831\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt\n*L\n94#1:732\n95#1:733\n116#1:788\n96#1:734\n97#1:741\n99#1:749\n101#1:756,3\n101#1:759\n114#1:766\n128#1:773\n128#1:774\n116#1:800,13\n116#1:814,3\n135#1:819\n135#1:820\n96#1:735,6\n97#1:742,6\n99#1:750,6\n101#1:760,6\n114#1:767,6\n128#1:775,6\n135#1:821,6\n116#1:781,6\n116#1:813\n116#1:818\n116#1:787\n116#1:789,11\n116#1:817\n96#1:827\n96#1:828,2\n97#1:830\n97#1:831,2\n*E\n"})
public final class ExposedDropdownMenuKt {

    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$a */
    public static final class C2930a implements ExposedDropdownMenuBoxScope {

        /* renamed from: a */
        public final /* synthetic */ C16479d f7670a;

        /* renamed from: b */
        public final /* synthetic */ C8700z0<Integer> f7671b;

        /* renamed from: c */
        public final /* synthetic */ C8700z0<Integer> f7672c;

        public C2930a(C16479d dVar, C8700z0<Integer> z0Var, C8700z0<Integer> z0Var2) {
            this.f7670a = dVar;
            this.f7671b = z0Var;
            this.f7672c = z0Var2;
        }

        @C12579k
        /* renamed from: a */
        public C8767m mo10199a(@C12579k C8767m mVar, boolean z) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            C16479d dVar = this.f7670a;
            C8700z0<Integer> z0Var = this.f7671b;
            C8700z0<Integer> z0Var2 = this.f7672c;
            C8767m q = SizeKt.m10117q(mVar, 0.0f, dVar.mo7416L(ExposedDropdownMenuKt.m13514d(z0Var)), 1, (Object) null);
            if (z) {
                return SizeKt.m10092H(q, dVar.mo7416L(ExposedDropdownMenuKt.m13512b(z0Var2)));
            }
            return q;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: androidx.compose.material.ExposedDropdownMenuKt$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13511a(boolean r20, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.Boolean, kotlin.C11079d2> r21, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r23, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r1 = r20
            r2 = r21
            r4 = r23
            r5 = r25
            java.lang.String r0 = "onExpandedChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1456052980(0x56c99af4, float:1.10833678E14)
            r3 = r24
            androidx.compose.runtime.o r3 = r3.mo15009o(r0)
            r6 = r26 & 1
            r7 = 2
            if (r6 == 0) goto L_0x0023
            r6 = r5 | 6
            goto L_0x0033
        L_0x0023:
            r6 = r5 & 14
            if (r6 != 0) goto L_0x0032
            boolean r6 = r3.mo14961b(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 4
            goto L_0x0030
        L_0x002f:
            r6 = r7
        L_0x0030:
            r6 = r6 | r5
            goto L_0x0033
        L_0x0032:
            r6 = r5
        L_0x0033:
            r8 = r26 & 2
            if (r8 == 0) goto L_0x003a
            r6 = r6 | 48
            goto L_0x004a
        L_0x003a:
            r8 = r5 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004a
            boolean r8 = r3.mo14927P(r2)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r6 = r6 | r8
        L_0x004a:
            r8 = r26 & 4
            if (r8 == 0) goto L_0x0051
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0051:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r22
            boolean r10 = r3.mo15006n0(r9)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r10
            goto L_0x0066
        L_0x0064:
            r9 = r22
        L_0x0066:
            r10 = r26 & 8
            if (r10 == 0) goto L_0x006d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006d:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007d
            boolean r10 = r3.mo14927P(r4)
            if (r10 == 0) goto L_0x007a
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r6 = r6 | r10
        L_0x007d:
            r10 = r6 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008f
            boolean r10 = r3.mo15011p()
            if (r10 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r3.mo14958a0()
            goto L_0x02c5
        L_0x008f:
            if (r8 == 0) goto L_0x0094
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
            r9 = r8
        L_0x0094:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00a0
            r8 = -1
            java.lang.String r10 = "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:87)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r8, r10)
        L_0x00a0:
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r0 = r3.mo15032w(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.p004ui.unit.C16479d) r0
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70956k()
            java.lang.Object r8 = r3.mo15032w(r8)
            android.view.View r8 = (android.view.View) r8
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r10)
            java.lang.Object r11 = r3.mo14921N()
            androidx.compose.runtime.o$a r16 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r12 = r16.mo16277a()
            r13 = 0
            r15 = 0
            if (r11 != r12) goto L_0x00d3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            androidx.compose.runtime.z0 r11 = androidx.compose.runtime.C8539f2.m30981g(r11, r13, r7, r13)
            r3.mo14893C(r11)
        L_0x00d3:
            r3.mo15002m0()
            r14 = r11
            androidx.compose.runtime.z0 r14 = (androidx.compose.runtime.C8700z0) r14
            r3.mo14918M(r10)
            java.lang.Object r11 = r3.mo14921N()
            java.lang.Object r12 = r16.mo16277a()
            if (r11 != r12) goto L_0x00f1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            androidx.compose.runtime.z0 r11 = androidx.compose.runtime.C8539f2.m30981g(r11, r13, r7, r13)
            r3.mo14893C(r11)
        L_0x00f1:
            r3.mo15002m0()
            r7 = r11
            androidx.compose.runtime.z0 r7 = (androidx.compose.runtime.C8700z0) r7
            float r11 = androidx.compose.material.MenuKt.m13573j()
            int r13 = r0.mo7429n2(r11)
            r3.mo14918M(r10)
            java.lang.Object r11 = r3.mo14921N()
            java.lang.Object r12 = r16.mo16277a()
            if (r11 != r12) goto L_0x0114
            androidx.compose.ui.node.i1 r11 = new androidx.compose.ui.node.i1
            r11.<init>()
            r3.mo14893C(r11)
        L_0x0114:
            r3.mo15002m0()
            r12 = r11
            androidx.compose.ui.node.i1 r12 = (androidx.compose.p004ui.node.C15695i1) r12
            int r11 = m13514d(r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r17 = m13512b(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)
            r10 = 1618982084(0x607fb4c4, float:7.370227E19)
            r3.mo14918M(r10)
            boolean r10 = r3.mo15006n0(r0)
            boolean r11 = r3.mo15006n0(r11)
            r10 = r10 | r11
            boolean r11 = r3.mo15006n0(r15)
            r10 = r10 | r11
            java.lang.Object r11 = r3.mo14921N()
            if (r10 != 0) goto L_0x014a
            java.lang.Object r10 = r16.mo16277a()
            if (r11 != r10) goto L_0x0152
        L_0x014a:
            androidx.compose.material.ExposedDropdownMenuKt$a r11 = new androidx.compose.material.ExposedDropdownMenuKt$a
            r11.<init>(r0, r7, r14)
            r3.mo14893C(r11)
        L_0x0152:
            r3.mo15002m0()
            r0 = r11
            androidx.compose.material.ExposedDropdownMenuKt$a r0 = (androidx.compose.material.ExposedDropdownMenuKt.C2930a) r0
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.mo14918M(r10)
            java.lang.Object r10 = r3.mo14921N()
            java.lang.Object r11 = r16.mo16277a()
            if (r10 != r11) goto L_0x0170
            androidx.compose.ui.focus.FocusRequester r10 = new androidx.compose.ui.focus.FocusRequester
            r10.<init>()
            r3.mo14893C(r10)
        L_0x0170:
            r3.mo15002m0()
            r15 = r10
            androidx.compose.ui.focus.FocusRequester r15 = (androidx.compose.p004ui.focus.FocusRequester) r15
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1 r11 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1
            r10 = r11
            r5 = r11
            r11 = r12
            r18 = r12
            r12 = r8
            r24 = r13
            r22 = r0
            r17 = r8
            r8 = r15
            r0 = 0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            androidx.compose.ui.m r5 = androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt.m68999a(r9, r5)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r20)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r11)
            boolean r12 = r3.mo15006n0(r2)
            boolean r10 = r3.mo15006n0(r10)
            r10 = r10 | r12
            java.lang.Object r12 = r3.mo14921N()
            if (r10 != 0) goto L_0x01ad
            java.lang.Object r10 = r16.mo16277a()
            if (r12 != r10) goto L_0x01b5
        L_0x01ad:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 r12 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
            r12.<init>(r2, r1)
            r3.mo14893C(r12)
        L_0x01b5:
            r3.mo15002m0()
            kotlin.jvm.functions.a r12 = (kotlin.jvm.functions.C11289a) r12
            androidx.compose.material.k1$a r10 = androidx.compose.material.C7875k1.f18863b
            int r10 = r10.mo10864d()
            r13 = 6
            java.lang.String r10 = androidx.compose.material.C7879l1.m25061a(r10, r3, r13)
            androidx.compose.ui.m r5 = m13521k(r5, r12, r10)
            androidx.compose.ui.m r5 = androidx.compose.p004ui.focus.C15083v.m64810a(r5, r8)
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r3.mo14918M(r10)
            androidx.compose.ui.c$a r10 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r10 = r10.mo17061C()
            androidx.compose.ui.layout.f0 r10 = androidx.compose.foundation.layout.BoxKt.m9849k(r10, r0, r3, r0)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.mo14918M(r12)
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r12 = r3.mo15032w(r12)
            androidx.compose.ui.unit.d r12 = (androidx.compose.p004ui.unit.C16479d) r12
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r3.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r3.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r11 = r19.mo44585a()
            kotlin.jvm.functions.q r5 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r5)
            androidx.compose.runtime.d r13 = r3.mo15017r()
            boolean r13 = r13 instanceof androidx.compose.runtime.C8428d
            if (r13 != 0) goto L_0x0216
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0216:
            r3.mo14938T()
            boolean r13 = r3.mo14997l()
            if (r13 == 0) goto L_0x0223
            r3.mo14947W(r11)
            goto L_0x0226
        L_0x0223:
            r3.mo14888A()
        L_0x0226:
            r3.mo14941U()
            androidx.compose.runtime.o r11 = androidx.compose.runtime.Updater.m30180b(r3)
            kotlin.jvm.functions.p r13 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r11, r10, r13)
            kotlin.jvm.functions.p r10 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r11, r12, r10)
            kotlin.jvm.functions.p r10 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r11, r14, r10)
            kotlin.jvm.functions.p r10 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r11, r15, r10)
            r3.mo14972e()
            androidx.compose.runtime.o r10 = androidx.compose.runtime.C8684u1.m31906b(r3)
            androidx.compose.runtime.u1 r10 = androidx.compose.runtime.C8684u1.m31905a(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r5.invoke(r10, r3, r11)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r3.mo14918M(r5)
            androidx.compose.foundation.layout.BoxScopeInstance r5 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            r5 = 6
            int r5 = r6 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11 = r22
            r4.invoke(r11, r3, r5)
            r3.mo15002m0()
            r3.mo14896D()
            r3.mo15002m0()
            r3.mo15002m0()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r20)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.mo14918M(r6)
            boolean r5 = r3.mo15006n0(r5)
            boolean r6 = r3.mo15006n0(r8)
            r5 = r5 | r6
            java.lang.Object r6 = r3.mo14921N()
            if (r5 != 0) goto L_0x029c
            java.lang.Object r5 = r16.mo16277a()
            if (r6 != r5) goto L_0x02a4
        L_0x029c:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1 r6 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1
            r6.<init>(r1, r8)
            r3.mo14893C(r6)
        L_0x02a4:
            r3.mo15002m0()
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            androidx.compose.runtime.EffectsKt.m29899k(r6, r3, r0)
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5 r0 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5
            r5 = r24
            r8 = r17
            r11 = r18
            r0.<init>(r8, r11, r5, r7)
            r5 = 8
            androidx.compose.runtime.EffectsKt.m29891c(r8, r0, r3, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02c5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02c5:
            androidx.compose.runtime.t1 r7 = r3.mo15020s()
            if (r7 != 0) goto L_0x02cc
            goto L_0x02e0
        L_0x02cc:
            androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$6 r8 = new androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$6
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r9
            r4 = r23
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo15202a(r8)
        L_0x02e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuKt.m13511a(boolean, kotlin.jvm.functions.l, androidx.compose.ui.m, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: b */
    public static final int m13512b(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: c */
    public static final void m13513c(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    /* renamed from: d */
    public static final int m13514d(C8700z0<Integer> z0Var) {
        return z0Var.getValue().intValue();
    }

    /* renamed from: e */
    public static final void m13515e(C8700z0<Integer> z0Var, int i) {
        z0Var.setValue(Integer.valueOf(i));
    }

    /* renamed from: k */
    public static final C8767m m13521k(C8767m mVar, C11289a<C11079d2> aVar, String str) {
        return SemanticsModifierKt.m71868c(SuspendingPointerInputFilterKt.m68437c(mVar, C11079d2.f28267a, new ExposedDropdownMenuKt$expandable$1(aVar, (C11045c<? super ExposedDropdownMenuKt$expandable$1>) null)), false, new ExposedDropdownMenuKt$expandable$2(str, aVar), 1, (Object) null);
    }

    /* renamed from: l */
    public static final void m13522l(View view, C15588o oVar, int i, C11300l<? super Integer, C11079d2> lVar) {
        if (oVar != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            float B = C15591p.m69301c(oVar).mo42249B();
            int i2 = rect.top;
            lVar.invoke(Integer.valueOf(((int) Math.max(B - ((float) i2), ((float) (rect.bottom - i2)) - C15591p.m69301c(oVar).mo42271j())) - i));
        }
    }
}
