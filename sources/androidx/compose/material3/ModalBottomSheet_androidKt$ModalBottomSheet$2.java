package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ModalBottomSheet_androidKt$ModalBottomSheet$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8179c<SheetValue> $anchorChangeHandler;
    final /* synthetic */ C11289a<C11079d2> $animateToDismiss;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dragHandle;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ C11300l<Float, C11079d2> $settleToDismiss;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ int $systemBarHeight;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2(long j, C11289a<C11079d2> aVar, SheetState sheetState, int i, C8767m mVar, C8179c<SheetValue> cVar, int i2, C11300l<? super Float, C11079d2> lVar, C15218g4 g4Var, long j2, long j3, float f, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C12074o0 o0Var) {
        super(2);
        this.$scrimColor = j;
        this.$animateToDismiss = aVar;
        this.$sheetState = sheetState;
        this.$$dirty = i;
        this.$modifier = mVar;
        this.$anchorChangeHandler = cVar;
        this.$systemBarHeight = i2;
        this.$settleToDismiss = lVar;
        this.$shape = g4Var;
        this.$containerColor = j2;
        this.$contentColor = j3;
        this.$tonalElevation = f;
        this.$dragHandle = pVar;
        this.$content = qVar;
        this.$scope = o0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-620400863, i2, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:140)");
            }
            C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
            final long j = this.$scrimColor;
            final C11289a<C11079d2> aVar = this.$animateToDismiss;
            final SheetState sheetState = this.$sheetState;
            final int i3 = this.$$dirty;
            final C8767m mVar = this.$modifier;
            final C8179c<SheetValue> cVar = this.$anchorChangeHandler;
            final int i4 = this.$systemBarHeight;
            final C11300l<Float, C11079d2> lVar = this.$settleToDismiss;
            final C15218g4 g4Var = this.$shape;
            final long j2 = this.$containerColor;
            final long j3 = this.$contentColor;
            final float f = this.$tonalElevation;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$dragHandle;
            final C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$content;
            final C12074o0 o0Var = this.$scope;
            BoxWithConstraintsKt.m9860a(l, (C8734c) null, false, C8553b.m31048b(oVar, -868170889, true, new C11305q<C2365i, C8592o, Integer, C11079d2>() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: kotlin.jvm.functions.p} */
                /* JADX WARNING: Multi-variable type inference failed */
                @androidx.compose.runtime.C8540g
                @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo11663a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2365i r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23) {
                    /*
                        r20 = this;
                        r0 = r20
                        r1 = r21
                        r11 = r22
                        r2 = r23
                        java.lang.String r3 = "$this$BoxWithConstraints"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
                        r3 = r2 & 14
                        r8 = 2
                        if (r3 != 0) goto L_0x001d
                        boolean r3 = r11.mo15006n0(r1)
                        if (r3 == 0) goto L_0x001a
                        r3 = 4
                        goto L_0x001b
                    L_0x001a:
                        r3 = r8
                    L_0x001b:
                        r3 = r3 | r2
                        goto L_0x001e
                    L_0x001d:
                        r3 = r2
                    L_0x001e:
                        r3 = r3 & 91
                        r4 = 18
                        if (r3 != r4) goto L_0x0030
                        boolean r3 = r22.mo15011p()
                        if (r3 != 0) goto L_0x002b
                        goto L_0x0030
                    L_0x002b:
                        r22.mo14958a0()
                        goto L_0x0166
                    L_0x0030:
                        boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r3 == 0) goto L_0x003f
                        r3 = -1
                        java.lang.String r4 = "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:141)"
                        r5 = -868170889(0xffffffffcc40c377, float:-5.0531804E7)
                        androidx.compose.runtime.ComposerKt.m29845w0(r5, r2, r3, r4)
                    L_0x003f:
                        long r2 = r21.mo8086b()
                        int r9 = androidx.compose.p004ui.unit.C16476b.m74361o(r2)
                        long r2 = r9
                        kotlin.jvm.functions.a<kotlin.d2> r4 = r11
                        androidx.compose.material3.SheetState r5 = r12
                        androidx.compose.material3.SheetValue r5 = r5.mo11863k()
                        androidx.compose.material3.SheetValue r6 = androidx.compose.material3.SheetValue.Hidden
                        r10 = 1
                        if (r5 == r6) goto L_0x0058
                        r5 = r10
                        goto L_0x0059
                    L_0x0058:
                        r5 = 0
                    L_0x0059:
                        int r6 = r13
                        int r6 = r6 >> 21
                        r7 = r6 & 14
                        r6 = r22
                        androidx.compose.material3.ModalBottomSheet_androidKt.m25887d(r2, r4, r5, r6, r7)
                        androidx.compose.ui.m r2 = r14
                        float r3 = androidx.compose.material3.SheetDefaultsKt.m26132c()
                        r4 = 0
                        r5 = 0
                        androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10094J(r2, r4, r3, r10, r5)
                        androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r4, r10, r5)
                        androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
                        androidx.compose.ui.c r3 = r3.mo17074y()
                        androidx.compose.ui.m r1 = r1.mo7701c(r2, r3)
                        androidx.compose.material3.SheetState r2 = r12
                        r3 = 1157296644(0x44faf204, float:2007.563)
                        r11.mo14918M(r3)
                        boolean r4 = r11.mo15006n0(r2)
                        java.lang.Object r6 = r22.mo14921N()
                        if (r4 != 0) goto L_0x0098
                        androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r4 = r4.mo16277a()
                        if (r6 != r4) goto L_0x00a0
                    L_0x0098:
                        androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1$1 r6 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1$1
                        r6.<init>(r2)
                        r11.mo14893C(r6)
                    L_0x00a0:
                        r22.mo15002m0()
                        kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
                        androidx.compose.ui.m r1 = androidx.compose.foundation.layout.OffsetKt.m9998d(r1, r6)
                        androidx.compose.material3.SheetState r2 = r12
                        kotlin.jvm.functions.l<java.lang.Float, kotlin.d2> r4 = r17
                        r11.mo14918M(r3)
                        boolean r6 = r11.mo15006n0(r2)
                        java.lang.Object r7 = r22.mo14921N()
                        if (r6 != 0) goto L_0x00c2
                        androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r6 = r6.mo16277a()
                        if (r7 != r6) goto L_0x00cb
                    L_0x00c2:
                        androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
                        androidx.compose.ui.input.nestedscroll.a r7 = androidx.compose.material3.SheetDefaultsKt.m26130a(r2, r6, r4)
                        r11.mo14893C(r7)
                    L_0x00cb:
                        r22.mo15002m0()
                        androidx.compose.ui.input.nestedscroll.a r7 = (androidx.compose.p004ui.input.nestedscroll.C15446a) r7
                        androidx.compose.ui.m r12 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68305b(r1, r7, r5, r8, r5)
                        androidx.compose.material3.SheetState r13 = r12
                        androidx.compose.material3.c<androidx.compose.material3.SheetValue> r14 = r15
                        float r15 = (float) r9
                        int r1 = r16
                        float r1 = (float) r1
                        kotlin.jvm.functions.l<java.lang.Float, kotlin.d2> r2 = r17
                        r11.mo14918M(r3)
                        boolean r3 = r11.mo15006n0(r2)
                        java.lang.Object r4 = r22.mo14921N()
                        if (r3 != 0) goto L_0x00f3
                        androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r3 = r3.mo16277a()
                        if (r4 != r3) goto L_0x00fb
                    L_0x00f3:
                        androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3$1 r4 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$3$1
                        r4.<init>(r2)
                        r11.mo14893C(r4)
                    L_0x00fb:
                        r22.mo15002m0()
                        r17 = r4
                        kotlin.jvm.functions.p r17 = (kotlin.jvm.functions.C11304p) r17
                        r16 = r1
                        androidx.compose.ui.m r1 = androidx.compose.material3.ModalBottomSheet_androidKt.m25894k(r12, r13, r14, r15, r16, r17)
                        androidx.compose.ui.graphics.g4 r2 = r18
                        long r3 = r19
                        long r5 = r21
                        float r7 = r23
                        androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4 r15 = new androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$4
                        kotlin.jvm.functions.p<androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r13 = r24
                        kotlin.jvm.functions.q<androidx.compose.foundation.layout.k, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r14 = r25
                        int r12 = r13
                        androidx.compose.material3.SheetState r9 = r12
                        kotlin.jvm.functions.a<kotlin.d2> r8 = r11
                        kotlinx.coroutines.o0 r10 = r26
                        r16 = r12
                        r12 = r15
                        r19 = r7
                        r7 = r15
                        r15 = r16
                        r16 = r9
                        r17 = r8
                        r18 = r10
                        r12.<init>(r13, r14, r15, r16, r17, r18)
                        r8 = -14815598(0xffffffffff1dee92, float:-2.0992752E38)
                        r9 = 1
                        androidx.compose.runtime.internal.a r10 = androidx.compose.runtime.internal.C8553b.m31048b(r11, r8, r9, r7)
                        int r7 = r13
                        int r8 = r7 >> 6
                        r8 = r8 & 112(0x70, float:1.57E-43)
                        r9 = 12582912(0xc00000, float:1.7632415E-38)
                        r8 = r8 | r9
                        int r9 = r7 >> 6
                        r9 = r9 & 896(0x380, float:1.256E-42)
                        r8 = r8 | r9
                        int r9 = r7 >> 6
                        r9 = r9 & 7168(0x1c00, float:1.0045E-41)
                        r8 = r8 | r9
                        r9 = 57344(0xe000, float:8.0356E-41)
                        int r7 = r7 >> 6
                        r7 = r7 & r9
                        r12 = r8 | r7
                        r13 = 96
                        r7 = r19
                        r8 = 0
                        r9 = 0
                        r11 = r22
                        androidx.compose.material3.SurfaceKt.m26352a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
                        boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r1 == 0) goto L_0x0166
                        androidx.compose.runtime.ComposerKt.m29843v0()
                    L_0x0166:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2.C80481.mo11663a(androidx.compose.foundation.layout.i, androidx.compose.runtime.o, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo11663a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            }), oVar, 3078, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
