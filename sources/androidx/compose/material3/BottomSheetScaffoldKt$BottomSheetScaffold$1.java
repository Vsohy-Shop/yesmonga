package androidx.compose.material3;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements C11305q<Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C8213i $scaffoldState;
    final /* synthetic */ long $sheetContainerColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $sheetDragHandle;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ float $sheetShadowElevation;
    final /* synthetic */ C15218g4 $sheetShape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ float $sheetTonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(C8213i iVar, float f, boolean z, C15218g4 g4Var, long j, long j2, float f2, float f3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(3);
        this.$scaffoldState = iVar;
        this.$sheetPeekHeight = f;
        this.$sheetSwipeEnabled = z;
        this.$sheetShape = g4Var;
        this.$sheetContainerColor = j;
        this.$sheetContentColor = j2;
        this.$sheetTonalElevation = f2;
        this.$sheetShadowElevation = f3;
        this.$sheetDragHandle = pVar;
        this.$sheetContent = qVar;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11182a(int i, @C12580l C8592o oVar, int i2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        if ((i6 & 14) == 0) {
            if (oVar.mo14976f(i5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i6;
        } else {
            C8592o oVar2 = oVar;
            i3 = i6;
        }
        if ((i3 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(106433656, i6, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:126)");
            }
            SheetState a = this.$scaffoldState.mo12648a();
            float f = this.$sheetPeekHeight;
            boolean z = this.$sheetSwipeEnabled;
            float f2 = (float) i5;
            C15218g4 g4Var = this.$sheetShape;
            long j = this.$sheetContainerColor;
            long j2 = this.$sheetContentColor;
            float f3 = this.$sheetTonalElevation;
            float f4 = this.$sheetShadowElevation;
            C11304p<C8592o, Integer, C11079d2> pVar = this.$sheetDragHandle;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$sheetContent;
            int i7 = this.$$dirty;
            BottomSheetScaffoldKt.m25432d(a, f, z, f2, g4Var, j, j2, f3, f4, pVar, qVar, oVar, ((i7 >> 6) & 112) | ((this.$$dirty1 << 6) & 896) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), i7 & 14);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11182a(((Number) obj).intValue(), (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
