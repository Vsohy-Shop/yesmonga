package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,522:1\n474#2,4:523\n478#2,2:531\n482#2:537\n25#3:527\n1114#4,3:528\n1117#4,3:534\n474#5:533\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$1\n*L\n298#1:523,4\n298#1:531,2\n298#1:537\n298#1:527\n298#1:528,3\n298#1:534,3\n298#1:533\n*E\n"})
public final class BackdropScaffoldKt$BackdropScaffold$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $backLayer;
    final /* synthetic */ C11300l<C16476b, C16476b> $calculateBackLayerConstraints;
    final /* synthetic */ long $frontLayerBackgroundColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $frontLayerContent;
    final /* synthetic */ long $frontLayerContentColor;
    final /* synthetic */ float $frontLayerElevation;
    final /* synthetic */ long $frontLayerScrimColor;
    final /* synthetic */ C15218g4 $frontLayerShape;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ float $headerHeight;
    final /* synthetic */ float $headerHeightPx;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11300l<? super C16476b, C16476b> lVar, float f, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f2, int i, C15218g4 g4Var, long j, long j2, float f3, int i2, float f4, float f5, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, long j3, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(2);
        this.$modifier = mVar;
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$headerHeightPx = f;
        this.$stickyFrontLayer = z;
        this.$gesturesEnabled = z2;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f2;
        this.$$dirty = i;
        this.$frontLayerShape = g4Var;
        this.$frontLayerBackgroundColor = j;
        this.$frontLayerContentColor = j2;
        this.$frontLayerElevation = f3;
        this.$$dirty1 = i2;
        this.$headerHeight = f4;
        this.$peekHeight = f5;
        this.$frontLayerContent = pVar2;
        this.$frontLayerScrimColor = j3;
        this.$snackbarHost = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1049909631, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:296)");
            }
            oVar2.mo14918M(773894976);
            oVar2.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar2));
                oVar2.mo14893C(wVar);
                N = wVar;
            }
            oVar.mo15002m0();
            final C12074o0 a = ((C8690w) N).mo16831a();
            oVar.mo15002m0();
            C8767m l = SizeKt.m10112l(this.$modifier, 0.0f, 1, (Object) null);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$backLayer;
            C11300l<C16476b, C16476b> lVar = this.$calculateBackLayerConstraints;
            final float f = this.$headerHeightPx;
            final boolean z = this.$stickyFrontLayer;
            final boolean z2 = this.$gesturesEnabled;
            final BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
            final float f2 = this.$peekHeightPx;
            final int i3 = this.$$dirty;
            final C15218g4 g4Var = this.$frontLayerShape;
            C11300l<C16476b, C16476b> lVar2 = lVar;
            C28701 r3 = r6;
            final long j = this.$frontLayerBackgroundColor;
            final long j2 = this.$frontLayerContentColor;
            final float f3 = this.$frontLayerElevation;
            final int i4 = this.$$dirty1;
            final float f4 = this.$headerHeight;
            final float f5 = this.$peekHeight;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$frontLayerContent;
            final long j3 = this.$frontLayerScrimColor;
            final C11305q<SnackbarHostState, C8592o, Integer, C11079d2> qVar = this.$snackbarHost;
            C28701 r6 = new C11306r<C16476b, Float, C8592o, Integer, C11079d2>() {
                /* JADX WARNING: Removed duplicated region for block: B:46:0x01d2  */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x01de  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x01e2  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x0243  */
                /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
                @androidx.compose.runtime.C8540g
                @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo9975a(long r32, float r34, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36) {
                    /*
                        r31 = this;
                        r0 = r31
                        r1 = r34
                        r13 = r35
                        r2 = r36
                        r3 = r2 & 14
                        r4 = 2
                        r5 = r32
                        if (r3 != 0) goto L_0x001a
                        boolean r3 = r13.mo14980g(r5)
                        if (r3 == 0) goto L_0x0017
                        r3 = 4
                        goto L_0x0018
                    L_0x0017:
                        r3 = r4
                    L_0x0018:
                        r3 = r3 | r2
                        goto L_0x001b
                    L_0x001a:
                        r3 = r2
                    L_0x001b:
                        r7 = r2 & 112(0x70, float:1.57E-43)
                        if (r7 != 0) goto L_0x002b
                        boolean r7 = r13.mo14968d(r1)
                        if (r7 == 0) goto L_0x0028
                        r7 = 32
                        goto L_0x002a
                    L_0x0028:
                        r7 = 16
                    L_0x002a:
                        r3 = r3 | r7
                    L_0x002b:
                        r3 = r3 & 731(0x2db, float:1.024E-42)
                        r7 = 146(0x92, float:2.05E-43)
                        if (r3 != r7) goto L_0x003d
                        boolean r3 = r35.mo15011p()
                        if (r3 != 0) goto L_0x0038
                        goto L_0x003d
                    L_0x0038:
                        r35.mo14958a0()
                        goto L_0x0246
                    L_0x003d:
                        boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r3 == 0) goto L_0x004c
                        r3 = -1
                        java.lang.String r7 = "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:302)"
                        r8 = 1800047509(0x6b4a8b95, float:2.4486217E26)
                        androidx.compose.runtime.ComposerKt.m29845w0(r8, r2, r3, r7)
                    L_0x004c:
                        int r2 = androidx.compose.p004ui.unit.C16476b.m74361o(r32)
                        float r14 = (float) r2
                        float r2 = r7
                        float r2 = r14 - r2
                        boolean r3 = r8
                        if (r3 == 0) goto L_0x005d
                        float r2 = java.lang.Math.min(r2, r1)
                    L_0x005d:
                        r15 = r2
                        boolean r1 = r9
                        r2 = 0
                        if (r1 == 0) goto L_0x0070
                        androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
                        androidx.compose.material.BackdropScaffoldState r3 = r10
                        androidx.compose.ui.input.nestedscroll.a r3 = r3.mo9996T()
                        androidx.compose.ui.m r1 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68305b(r1, r3, r2, r4, r2)
                        goto L_0x0072
                    L_0x0070:
                        androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
                    L_0x0072:
                        androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
                        androidx.compose.ui.m r16 = r12.mo17224k3(r1)
                        androidx.compose.material.BackdropScaffoldState r1 = r10
                        kotlin.Pair[] r3 = new kotlin.Pair[r4]
                        float r4 = r11
                        java.lang.Float r4 = java.lang.Float.valueOf(r4)
                        androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
                        kotlin.Pair r4 = kotlin.C11078d1.m42659a(r4, r5)
                        r11 = 0
                        r3[r11] = r4
                        java.lang.Float r4 = java.lang.Float.valueOf(r15)
                        androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Revealed
                        kotlin.Pair r4 = kotlin.C11078d1.m42659a(r4, r5)
                        r10 = 1
                        r3[r10] = r4
                        java.util.Map r18 = kotlin.collections.C10977s0.m41456W(r3)
                        androidx.compose.foundation.gestures.Orientation r19 = androidx.compose.foundation.gestures.Orientation.Vertical
                        boolean r3 = r9
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 496(0x1f0, float:6.95E-43)
                        r27 = 0
                        r17 = r1
                        r20 = r3
                        androidx.compose.ui.m r1 = androidx.compose.material.SwipeableKt.m13913l(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1 r3 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
                        androidx.compose.material.BackdropScaffoldState r4 = r10
                        kotlinx.coroutines.o0 r5 = r21
                        r3.<init>(r4, r5)
                        androidx.compose.ui.m r1 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r1, r11, r3, r10, r2)
                        androidx.compose.material.BackdropScaffoldState r2 = r10
                        r3 = 1157296644(0x44faf204, float:2007.563)
                        r13.mo14918M(r3)
                        boolean r3 = r13.mo15006n0(r2)
                        java.lang.Object r4 = r35.mo14921N()
                        if (r3 != 0) goto L_0x00dd
                        androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r3 = r3.mo16277a()
                        if (r4 != r3) goto L_0x00e5
                    L_0x00dd:
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1 r4 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                        r4.<init>(r2)
                        r13.mo14893C(r4)
                    L_0x00e5:
                        r35.mo15002m0()
                        kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
                        androidx.compose.ui.m r2 = androidx.compose.foundation.layout.OffsetKt.m9998d(r12, r4)
                        androidx.compose.ui.m r1 = r2.mo17224k3(r1)
                        androidx.compose.ui.graphics.g4 r2 = r13
                        long r3 = r14
                        long r5 = r16
                        float r8 = r18
                        androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2 r9 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2
                        float r11 = r22
                        kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r7 = r23
                        int r10 = r12
                        r26 = r14
                        r36 = r15
                        long r14 = r24
                        r27 = r12
                        androidx.compose.material.BackdropScaffoldState r12 = r10
                        r28 = r8
                        int r8 = r19
                        r29 = r5
                        boolean r5 = r9
                        kotlinx.coroutines.o0 r6 = r21
                        r16 = r9
                        r17 = r11
                        r18 = r7
                        r19 = r10
                        r20 = r14
                        r22 = r12
                        r23 = r8
                        r24 = r5
                        r25 = r6
                        r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25)
                        r5 = -1065299503(0xffffffffc080d1d1, float:-4.0256124)
                        r10 = 1
                        androidx.compose.runtime.internal.a r9 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r5, r10, r9)
                        int r5 = r19
                        int r6 = r5 >> 3
                        r6 = r6 & 112(0x70, float:1.57E-43)
                        r7 = 1572864(0x180000, float:2.204052E-39)
                        r6 = r6 | r7
                        int r7 = r5 >> 6
                        r7 = r7 & 896(0x380, float:1.256E-42)
                        r6 = r6 | r7
                        int r7 = r5 >> 6
                        r7 = r7 & 7168(0x1c00, float:1.0045E-41)
                        r6 = r6 | r7
                        r7 = 458752(0x70000, float:6.42848E-40)
                        r14 = 6
                        int r5 = r5 << r14
                        r5 = r5 & r7
                        r11 = r6 | r5
                        r12 = 16
                        r5 = r29
                        r7 = 0
                        r8 = r28
                        r15 = r10
                        r10 = r35
                        r15 = 0
                        r16 = r27
                        androidx.compose.material.SurfaceKt.m13879b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        androidx.compose.material.BackdropScaffoldState r1 = r10
                        boolean r1 = r1.mo9999W()
                        if (r1 == 0) goto L_0x0178
                        float r1 = r7
                        float r1 = r26 - r1
                        int r1 = (r36 > r1 ? 1 : (r36 == r1 ? 0 : -1))
                        if (r1 != 0) goto L_0x0172
                        r11 = 1
                        goto L_0x0173
                    L_0x0172:
                        r11 = r15
                    L_0x0173:
                        if (r11 == 0) goto L_0x0178
                        float r1 = r20
                        goto L_0x017d
                    L_0x0178:
                        float r1 = (float) r15
                        float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
                    L_0x017d:
                        r9 = r1
                        r10 = 7
                        r11 = 0
                        r5 = r16
                        androidx.compose.ui.m r1 = androidx.compose.foundation.layout.PaddingKt.m10028o(r5, r6, r7, r8, r9, r10, r11)
                        androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
                        androidx.compose.ui.c r2 = r2.mo17063c()
                        kotlin.jvm.functions.q<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r3 = r26
                        androidx.compose.material.BackdropScaffoldState r4 = r10
                        int r5 = r19
                        r6 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
                        r13.mo14918M(r6)
                        androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.BoxKt.m9849k(r2, r15, r13, r14)
                        r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
                        r13.mo14918M(r6)
                        androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
                        java.lang.Object r6 = r13.mo15032w(r6)
                        androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
                        androidx.compose.runtime.i1 r7 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
                        java.lang.Object r7 = r13.mo15032w(r7)
                        androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p004ui.unit.LayoutDirection) r7
                        androidx.compose.runtime.i1 r8 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
                        java.lang.Object r8 = r13.mo15032w(r8)
                        androidx.compose.ui.platform.c4 r8 = (androidx.compose.p004ui.platform.C15863c4) r8
                        androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
                        kotlin.jvm.functions.a r10 = r9.mo44585a()
                        kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
                        androidx.compose.runtime.d r11 = r35.mo15017r()
                        boolean r11 = r11 instanceof androidx.compose.runtime.C8428d
                        if (r11 != 0) goto L_0x01d5
                        androidx.compose.runtime.ComposablesKt.m29519n()
                    L_0x01d5:
                        r35.mo14938T()
                        boolean r11 = r35.mo14997l()
                        if (r11 == 0) goto L_0x01e2
                        r13.mo14947W(r10)
                        goto L_0x01e5
                    L_0x01e2:
                        r35.mo14888A()
                    L_0x01e5:
                        r35.mo14941U()
                        androidx.compose.runtime.o r10 = androidx.compose.runtime.Updater.m30180b(r35)
                        kotlin.jvm.functions.p r11 = r9.mo44588d()
                        androidx.compose.runtime.Updater.m30188j(r10, r2, r11)
                        kotlin.jvm.functions.p r2 = r9.mo44586b()
                        androidx.compose.runtime.Updater.m30188j(r10, r6, r2)
                        kotlin.jvm.functions.p r2 = r9.mo44587c()
                        androidx.compose.runtime.Updater.m30188j(r10, r7, r2)
                        kotlin.jvm.functions.p r2 = r9.mo44590f()
                        androidx.compose.runtime.Updater.m30188j(r10, r8, r2)
                        r35.mo14972e()
                        androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r35)
                        androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
                        r1.invoke(r2, r13, r6)
                        r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
                        r13.mo14918M(r1)
                        androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.f6046a
                        androidx.compose.material.SnackbarHostState r1 = r4.mo9997U()
                        int r2 = r5 >> 18
                        r2 = r2 & 112(0x70, float:1.57E-43)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r3.invoke(r1, r13, r2)
                        r35.mo15002m0()
                        r35.mo14896D()
                        r35.mo15002m0()
                        r35.mo15002m0()
                        boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r1 == 0) goto L_0x0246
                        androidx.compose.runtime.ComposerKt.m29843v0()
                    L_0x0246:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.C28701.mo9975a(long, float, androidx.compose.runtime.o, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    mo9975a(((C16476b) obj).mo47807x(), ((Number) obj2).floatValue(), (C8592o) obj3, ((Number) obj4).intValue());
                    return C11079d2.f28267a;
                }
            };
            C8592o oVar3 = oVar;
            BackdropScaffoldKt.m13223d(l, pVar, lVar2, C8553b.m31048b(oVar3, 1800047509, true, r3), oVar3, 3120);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
