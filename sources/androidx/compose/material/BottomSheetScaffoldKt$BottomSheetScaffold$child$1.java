package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$child$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,614:1\n36#2:615\n1114#3,6:616\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$child$1\n*L\n369#1:615\n369#1:616,6\n*E\n"})
public final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ C3043g $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ C15218g4 $sheetShape;
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1(C3043g gVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, float f, int i, int i2, int i3, int i4, boolean z, float f2, C15218g4 g4Var, float f3, long j, long j2, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar2, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar3) {
        super(2);
        this.$scaffoldState = gVar;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$floatingActionButton = pVar2;
        this.$sheetPeekHeight = f;
        this.$floatingActionButtonPosition = i;
        this.$$dirty = i2;
        this.$$dirty2 = i3;
        this.$$dirty1 = i4;
        this.$sheetGesturesEnabled = z;
        this.$peekHeightPx = f2;
        this.$sheetShape = g4Var;
        this.$sheetElevation = f3;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetContent = qVar2;
        this.$snackbarHost = qVar3;
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
                ComposerKt.m29845w0(893101063, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:328)");
            }
            BottomSheetState a = this.$scaffoldState.mo10762a();
            C11304p<C8592o, Integer, C11079d2> pVar = this.$topBar;
            C11305q<C2366i0, C8592o, Integer, C11079d2> qVar = this.$content;
            final C3043g gVar = this.$scaffoldState;
            final float f = this.$sheetPeekHeight;
            final boolean z = this.$sheetGesturesEnabled;
            final float f2 = this.$peekHeightPx;
            C15218g4 g4Var = this.$sheetShape;
            float f3 = this.$sheetElevation;
            long j = this.$sheetBackgroundColor;
            BottomSheetState bottomSheetState = a;
            long j2 = this.$sheetContentColor;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar2 = this.$sheetContent;
            C11305q<C2366i0, C8592o, Integer, C11079d2> qVar3 = qVar;
            C11304p<C8592o, Integer, C11079d2> pVar2 = pVar;
            final C11305q<C2373k, C8592o, Integer, C11079d2> qVar4 = qVar2;
            final C15218g4 g4Var2 = g4Var;
            final float f4 = f3;
            final long j3 = j;
            final long j4 = j2;
            final int i3 = this.$$dirty;
            final int i4 = this.$$dirty1;
            C8552a b = C8553b.m31048b(oVar2, -1378534681, true, new C11305q<Integer, C8592o, Integer, C11079d2>() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlin.jvm.functions.p} */
                /* JADX WARNING: Multi-variable type inference failed */
                @androidx.compose.runtime.C8540g
                @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo10046a(int r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21) {
                    /*
                        r18 = this;
                        r0 = r18
                        r1 = r19
                        r12 = r20
                        r2 = r21 & 14
                        r3 = 2
                        if (r2 != 0) goto L_0x0017
                        boolean r2 = r12.mo14976f(r1)
                        if (r2 == 0) goto L_0x0013
                        r2 = 4
                        goto L_0x0014
                    L_0x0013:
                        r2 = r3
                    L_0x0014:
                        r2 = r21 | r2
                        goto L_0x0019
                    L_0x0017:
                        r2 = r21
                    L_0x0019:
                        r4 = r2 & 91
                        r5 = 18
                        if (r4 != r5) goto L_0x002b
                        boolean r4 = r20.mo15011p()
                        if (r4 != 0) goto L_0x0026
                        goto L_0x002b
                    L_0x0026:
                        r20.mo14958a0()
                        goto L_0x0115
                    L_0x002b:
                        boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r4 == 0) goto L_0x003a
                        r4 = -1
                        java.lang.String r5 = "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:332)"
                        r6 = -1378534681(0xffffffffadd53ae7, float:-2.4241454E-11)
                        androidx.compose.runtime.ComposerKt.m29845w0(r6, r2, r4, r5)
                    L_0x003a:
                        androidx.compose.material.g r2 = r12
                        androidx.compose.material.BottomSheetState r2 = r2.mo10762a()
                        androidx.compose.ui.m$a r4 = androidx.compose.p004ui.C8767m.f23478j
                        androidx.compose.material.g r5 = r12
                        androidx.compose.material.BottomSheetState r5 = r5.mo10762a()
                        androidx.compose.material.SwipeableV2State r5 = r5.mo10067i()
                        androidx.compose.material.g r6 = r12
                        r7 = 1157296644(0x44faf204, float:2007.563)
                        r12.mo14918M(r7)
                        boolean r5 = r12.mo15006n0(r5)
                        java.lang.Object r7 = r20.mo14921N()
                        if (r5 != 0) goto L_0x0066
                        androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r5 = r5.mo16277a()
                        if (r7 != r5) goto L_0x0077
                    L_0x0066:
                        androidx.compose.material.BottomSheetState r5 = r6.mo10762a()
                        androidx.compose.material.SwipeableV2State r5 = r5.mo10067i()
                        androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
                        androidx.compose.ui.input.nestedscroll.a r7 = androidx.compose.material.BottomSheetScaffoldKt.m13297g(r5, r6)
                        r12.mo14893C(r7)
                    L_0x0077:
                        r20.mo15002m0()
                        androidx.compose.ui.input.nestedscroll.a r7 = (androidx.compose.p004ui.input.nestedscroll.C15446a) r7
                        r5 = 0
                        androidx.compose.ui.m r4 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68305b(r4, r7, r5, r3, r5)
                        r6 = 1
                        r7 = 0
                        androidx.compose.ui.m r4 = androidx.compose.foundation.layout.SizeKt.m10114n(r4, r7, r6, r5)
                        float r6 = r13
                        androidx.compose.ui.m r10 = androidx.compose.foundation.layout.SizeKt.m10120t(r4, r6, r7, r3, r5)
                        boolean r3 = r14
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
                        float r5 = r15
                        java.lang.Float r5 = java.lang.Float.valueOf(r5)
                        float r6 = r15
                        r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                        r12.mo14918M(r7)
                        boolean r4 = r12.mo15006n0(r4)
                        boolean r5 = r12.mo15006n0(r5)
                        r4 = r4 | r5
                        java.lang.Object r5 = r20.mo14921N()
                        if (r4 != 0) goto L_0x00b8
                        androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r4 = r4.mo16277a()
                        if (r5 != r4) goto L_0x00c0
                    L_0x00b8:
                        androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1 r5 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1
                        r5.<init>(r1, r6)
                        r12.mo14893C(r5)
                    L_0x00c0:
                        r20.mo15002m0()
                        r4 = r5
                        kotlin.jvm.functions.p r4 = (kotlin.jvm.functions.C11304p) r4
                        androidx.compose.ui.graphics.g4 r5 = r16
                        float r6 = r17
                        long r7 = r18
                        long r13 = r20
                        kotlin.jvm.functions.q<androidx.compose.foundation.layout.k, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r11 = r22
                        int r1 = r23
                        int r9 = r1 >> 18
                        r9 = r9 & 112(0x70, float:1.57E-43)
                        int r15 = r1 >> 15
                        r15 = r15 & 7168(0x1c00, float:1.0045E-41)
                        r9 = r9 | r15
                        int r15 = r1 >> 15
                        r16 = 57344(0xe000, float:8.0356E-41)
                        r15 = r15 & r16
                        r9 = r9 | r15
                        int r15 = r24
                        int r16 = r15 << 15
                        r17 = 458752(0x70000, float:6.42848E-40)
                        r16 = r16 & r17
                        r9 = r9 | r16
                        r16 = 3670016(0x380000, float:5.142788E-39)
                        int r15 = r15 << 15
                        r15 = r15 & r16
                        r9 = r9 | r15
                        int r1 = r1 << 24
                        r15 = 234881024(0xe000000, float:1.5777218E-30)
                        r1 = r1 & r15
                        r15 = r9 | r1
                        r16 = 0
                        r1 = r2
                        r2 = r3
                        r3 = r4
                        r4 = r5
                        r5 = r6
                        r6 = r7
                        r8 = r13
                        r12 = r20
                        r13 = r15
                        r14 = r16
                        androidx.compose.material.BottomSheetScaffoldKt.m13291a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
                        boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r1 == 0) goto L_0x0115
                        androidx.compose.runtime.ComposerKt.m29843v0()
                    L_0x0115:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.C28921.mo10046a(int, androidx.compose.runtime.o, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo10046a(((Number) obj).intValue(), (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            });
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$floatingActionButton;
            final C11305q<SnackbarHostState, C8592o, Integer, C11079d2> qVar5 = this.$snackbarHost;
            final C3043g gVar2 = this.$scaffoldState;
            final int i5 = this.$$dirty;
            C8552a b2 = C8553b.m31048b(oVar2, -486138068, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-486138068, i, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:365)");
                        }
                        qVar5.invoke(gVar2.mo10764c(), oVar, Integer.valueOf((i5 >> 9) & 112));
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            });
            float f5 = this.$sheetPeekHeight;
            int i6 = this.$floatingActionButtonPosition;
            C3043g gVar3 = this.$scaffoldState;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(gVar3);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new BottomSheetScaffoldKt$BottomSheetScaffold$child$1$3$1(gVar3);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            int i7 = this.$$dirty;
            int i8 = ((i7 >> 9) & 14) | 24960 | ((this.$$dirty2 >> 3) & 112) | ((i7 >> 6) & 7168) | ((this.$$dirty1 << 9) & 458752) | (i7 & 3670016);
            BottomSheetScaffoldKt.m13294d(pVar2, qVar3, b, pVar3, b2, f5, i6, (C11289a) N, bottomSheetState, oVar, i8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
