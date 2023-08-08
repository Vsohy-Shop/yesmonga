package androidx.compose.material;

import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.runtime.C8592o;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,243:1\n76#2:244\n76#2:259\n76#2:292\n76#2:337\n36#3:245\n460#3,13:271\n460#3,13:304\n473#3,3:318\n36#3:323\n460#3,13:349\n473#3,3:363\n473#3,3:368\n1114#4,6:246\n1114#4,6:324\n67#5,6:252\n73#5:284\n77#5:372\n75#6:258\n76#6,11:260\n75#6:291\n76#6,11:293\n89#6:321\n75#6:336\n76#6,11:338\n89#6:366\n89#6:371\n75#7,6:285\n81#7:317\n85#7:322\n75#7,6:330\n81#7:362\n85#7:367\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt$SwipeToDismiss$2\n*L\n184#1:244\n197#1:259\n212#1:292\n216#1:337\n190#1:245\n197#1:271,13\n212#1:304,13\n212#1:318,3\n218#1:323\n216#1:349,13\n216#1:363,3\n197#1:368,3\n190#1:246,6\n218#1:324,6\n197#1:252,6\n197#1:284\n197#1:372\n197#1:258\n197#1:260,11\n212#1:291\n212#1:293,11\n212#1:321\n216#1:336\n216#1:338,11\n216#1:366\n197#1:371\n212#1:285,6\n212#1:317\n212#1:322\n216#1:330,6\n216#1:362\n216#1:367\n*E\n"})
public final class SwipeToDismissKt$SwipeToDismiss$2 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $dismissContent;
    final /* synthetic */ C11300l<DismissDirection, C7941v1> $dismissThresholds;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2(Set<? extends DismissDirection> set, C11300l<? super DismissDirection, ? extends C7941v1> lVar, int i, DismissState dismissState, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar2) {
        super(3);
        this.$directions = set;
        this.$dismissThresholds = lVar;
        this.$$dirty = i;
        this.$state = dismissState;
        this.$background = qVar;
        this.$dismissContent = qVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: kotlin.jvm.functions.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10470a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2365i r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r4 = r3 & 14
            if (r4 != 0) goto L_0x001c
            boolean r4 = r2.mo15006n0(r1)
            if (r4 == 0) goto L_0x0019
            r4 = 4
            goto L_0x001a
        L_0x0019:
            r4 = 2
        L_0x001a:
            r4 = r4 | r3
            goto L_0x001d
        L_0x001c:
            r4 = r3
        L_0x001d:
            r4 = r4 & 91
            r5 = 18
            if (r4 != r5) goto L_0x002f
            boolean r4 = r22.mo15011p()
            if (r4 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r22.mo14958a0()
            goto L_0x0384
        L_0x002f:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x003e
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:181)"
            r6 = 338007641(0x14259659, float:8.360022E-27)
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r3, r4, r5)
        L_0x003e:
            long r3 = r21.mo8086b()
            int r1 = androidx.compose.p004ui.unit.C16476b.m74362p(r3)
            float r1 = (float) r1
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r2.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.p004ui.unit.LayoutDirection.Rtl
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L_0x0057
            r12 = r5
            goto L_0x0058
        L_0x0057:
            r12 = r6
        L_0x0058:
            kotlin.Pair[] r3 = new kotlin.Pair[r5]
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            androidx.compose.material.DismissValue r7 = androidx.compose.material.DismissValue.Default
            kotlin.Pair r4 = kotlin.C11078d1.m42659a(r4, r7)
            r3[r6] = r4
            java.util.Map r9 = kotlin.collections.C10977s0.m41469j0(r3)
            java.util.Set<androidx.compose.material.DismissDirection> r3 = r0.$directions
            androidx.compose.material.DismissDirection r4 = androidx.compose.material.DismissDirection.StartToEnd
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x008a
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            androidx.compose.material.DismissValue r8 = androidx.compose.material.DismissValue.DismissedToEnd
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r3, r8)
            java.lang.Object r8 = r3.mo21849e()
            java.lang.Object r3 = r3.mo21851f()
            r9.put(r8, r3)
        L_0x008a:
            java.util.Set<androidx.compose.material.DismissDirection> r3 = r0.$directions
            androidx.compose.material.DismissDirection r8 = androidx.compose.material.DismissDirection.EndToStart
            boolean r3 = r3.contains(r8)
            if (r3 == 0) goto L_0x00aa
            float r3 = -r1
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.material.DismissValue r10 = androidx.compose.material.DismissValue.DismissedToStart
            kotlin.Pair r3 = kotlin.C11078d1.m42659a(r3, r10)
            java.lang.Object r10 = r3.mo21849e()
            java.lang.Object r3 = r3.mo21851f()
            r9.put(r10, r3)
        L_0x00aa:
            kotlin.jvm.functions.l<androidx.compose.material.DismissDirection, androidx.compose.material.v1> r3 = r0.$dismissThresholds
            r15 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r15)
            boolean r10 = r2.mo15006n0(r3)
            java.lang.Object r11 = r22.mo14921N()
            if (r10 != 0) goto L_0x00c4
            androidx.compose.runtime.o$a r10 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r10 = r10.mo16277a()
            if (r11 != r10) goto L_0x00cc
        L_0x00c4:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 r11 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
            r11.<init>(r3)
            r2.mo14893C(r11)
        L_0x00cc:
            r22.mo15002m0()
            r14 = r11
            kotlin.jvm.functions.p r14 = (kotlin.jvm.functions.C11304p) r14
            java.util.Set<androidx.compose.material.DismissDirection> r3 = r0.$directions
            boolean r3 = r3.contains(r8)
            r8 = 1092616192(0x41200000, float:10.0)
            r10 = 1101004800(0x41a00000, float:20.0)
            if (r3 == 0) goto L_0x00e0
            r3 = r8
            goto L_0x00e1
        L_0x00e0:
            r3 = r10
        L_0x00e1:
            java.util.Set<androidx.compose.material.DismissDirection> r11 = r0.$directions
            boolean r4 = r11.contains(r4)
            if (r4 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r8 = r10
        L_0x00eb:
            androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.material.DismissState r11 = r0.$state
            java.lang.Object r11 = r11.mo10513p()
            if (r11 != r7) goto L_0x00f9
            r11 = r5
            goto L_0x00fa
        L_0x00f9:
            r11 = r6
        L_0x00fa:
            androidx.compose.material.c1 r5 = new androidx.compose.material.c1
            r5.<init>(r1, r3, r8)
            androidx.compose.material.DismissState r8 = r0.$state
            r13 = 0
            r16 = 0
            r17 = 288(0x120, float:4.04E-43)
            r18 = 0
            r7 = r4
            r1 = r15
            r15 = r5
            androidx.compose.ui.m r3 = androidx.compose.material.SwipeableKt.m13913l(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r5 = r0.$background
            int r7 = r0.$$dirty
            androidx.compose.material.DismissState r8 = r0.$state
            kotlin.jvm.functions.q<androidx.compose.foundation.layout.u0, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r9 = r0.$dismissContent
            r10 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.mo14918M(r10)
            androidx.compose.ui.c$a r10 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r11 = r10.mo17061C()
            androidx.compose.ui.layout.f0 r11 = androidx.compose.foundation.layout.BoxKt.m9849k(r11, r6, r2, r6)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r12)
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r13 = r2.mo15032w(r13)
            androidx.compose.ui.unit.d r13 = (androidx.compose.p004ui.unit.C16479d) r13
            androidx.compose.runtime.i1 r14 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r14 = r2.mo15032w(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.p004ui.unit.LayoutDirection) r14
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r15 = r2.mo15032w(r15)
            androidx.compose.ui.platform.c4 r15 = (androidx.compose.p004ui.platform.C15863c4) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r1 = r16.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r12 = r22.mo15017r()
            boolean r12 = r12 instanceof androidx.compose.runtime.C8428d
            if (r12 != 0) goto L_0x0160
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0160:
            r22.mo14938T()
            boolean r12 = r22.mo14997l()
            if (r12 == 0) goto L_0x016d
            r2.mo14947W(r1)
            goto L_0x0170
        L_0x016d:
            r22.mo14888A()
        L_0x0170:
            r22.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r22)
            kotlin.jvm.functions.p r12 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r11, r12)
            kotlin.jvm.functions.p r11 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r13, r11)
            kotlin.jvm.functions.p r11 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r14, r11)
            kotlin.jvm.functions.p r11 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r15, r11)
            r22.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r22)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.invoke(r1, r2, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r1)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
            androidx.compose.ui.m r3 = r3.mo7702e(r4)
            int r6 = r7 >> 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo14918M(r11)
            androidx.compose.foundation.layout.Arrangement r12 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r13 = r12.mo7630p()
            androidx.compose.ui.c$c r14 = r10.mo17073w()
            int r15 = r6 >> 3
            r18 = r15 & 14
            r15 = r15 & 112(0x70, float:1.57E-43)
            r15 = r18 | r15
            androidx.compose.ui.layout.f0 r13 = androidx.compose.foundation.layout.RowKt.m10071d(r13, r14, r2, r15)
            int r14 = r6 << 3
            r14 = r14 & 112(0x70, float:1.57E-43)
            r15 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r15)
            androidx.compose.runtime.i1 r15 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r15 = r2.mo15032w(r15)
            androidx.compose.ui.unit.d r15 = (androidx.compose.p004ui.unit.C16479d) r15
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r11 = r2.mo15032w(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p004ui.unit.LayoutDirection) r11
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r1 = r2.mo15032w(r1)
            androidx.compose.ui.platform.c4 r1 = (androidx.compose.p004ui.platform.C15863c4) r1
            kotlin.jvm.functions.a r0 = r16.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            int r14 = r14 << 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | 6
            r19 = r9
            androidx.compose.runtime.d r9 = r22.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x0214
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0214:
            r22.mo14938T()
            boolean r9 = r22.mo14997l()
            if (r9 == 0) goto L_0x0221
            r2.mo14947W(r0)
            goto L_0x0224
        L_0x0221:
            r22.mo14888A()
        L_0x0224:
            r22.mo14941U()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.Updater.m30180b(r22)
            kotlin.jvm.functions.p r9 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r0, r13, r9)
            kotlin.jvm.functions.p r9 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r0, r15, r9)
            kotlin.jvm.functions.p r9 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r0, r11, r9)
            kotlin.jvm.functions.p r9 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r0, r1, r9)
            r22.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r22)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            int r1 = r14 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.invoke(r0, r2, r1)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r1 = r6 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.invoke(r0, r2, r1)
            r22.mo15002m0()
            r22.mo14896D()
            r22.mo15002m0()
            r22.mo15002m0()
            r1 = 1157296644(0x44faf204, float:2007.563)
            r2.mo14918M(r1)
            boolean r1 = r2.mo15006n0(r8)
            java.lang.Object r3 = r22.mo14921N()
            if (r1 != 0) goto L_0x0296
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r3 != r1) goto L_0x029e
        L_0x0296:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1 r3 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
            r3.<init>(r8)
            r2.mo14893C(r3)
        L_0x029e:
            r22.mo15002m0()
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.OffsetKt.m9998d(r4, r3)
            int r3 = r7 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement$d r4 = r12.mo7630p()
            androidx.compose.ui.c$c r5 = r10.mo17073w()
            int r6 = r3 >> 3
            r7 = r6 & 14
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r5, r2, r6)
            int r5 = r3 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo14918M(r6)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r2.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r7 = r2.mo15032w(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
            androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r8 = r2.mo15032w(r8)
            androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
            kotlin.jvm.functions.a r9 = r16.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            int r5 = r5 << 9
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | 6
            androidx.compose.runtime.d r10 = r22.mo15017r()
            boolean r10 = r10 instanceof androidx.compose.runtime.C8428d
            if (r10 != 0) goto L_0x0305
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0305:
            r22.mo14938T()
            boolean r10 = r22.mo14997l()
            if (r10 == 0) goto L_0x0312
            r2.mo14947W(r9)
            goto L_0x0315
        L_0x0312:
            r22.mo14888A()
        L_0x0315:
            r22.mo14941U()
            androidx.compose.runtime.o r9 = androidx.compose.runtime.Updater.m30180b(r22)
            kotlin.jvm.functions.p r10 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r9, r4, r10)
            kotlin.jvm.functions.p r4 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r9, r6, r4)
            kotlin.jvm.functions.p r4 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r9, r7, r4)
            kotlin.jvm.functions.p r4 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r9, r8, r4)
            r22.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r22)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            int r5 = r5 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.invoke(r4, r2, r5)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.mo14918M(r1)
            int r1 = r3 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = r19
            r3.invoke(r0, r2, r1)
            r22.mo15002m0()
            r22.mo14896D()
            r22.mo15002m0()
            r22.mo15002m0()
            r22.mo15002m0()
            r22.mo14896D()
            r22.mo15002m0()
            r22.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0384
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0384:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2.mo10470a(androidx.compose.foundation.layout.i, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10470a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
