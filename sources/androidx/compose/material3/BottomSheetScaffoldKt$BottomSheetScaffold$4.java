package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheetScaffold$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C8767m $modifier;
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
    final /* synthetic */ C11305q<SnackbarHostState, C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$4(C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C8767m mVar, C8213i iVar, float f, C15218g4 g4Var, long j, long j2, float f2, float f3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar2, long j3, long j4, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar3, int i, int i2, int i3) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = mVar;
        this.$scaffoldState = iVar;
        this.$sheetPeekHeight = f;
        this.$sheetShape = g4Var;
        this.$sheetContainerColor = j;
        this.$sheetContentColor = j2;
        this.$sheetTonalElevation = f2;
        this.$sheetShadowElevation = f3;
        this.$sheetDragHandle = pVar;
        this.$sheetSwipeEnabled = z;
        this.$topBar = pVar2;
        this.$snackbarHost = qVar2;
        this.$containerColor = j3;
        this.$contentColor = j4;
        this.$content = qVar3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$sheetContent;
        C11305q<C2373k, C8592o, Integer, C11079d2> qVar2 = qVar;
        BottomSheetScaffoldKt.m25429a(qVar2, this.$modifier, this.$scaffoldState, this.$sheetPeekHeight, this.$sheetShape, this.$sheetContainerColor, this.$sheetContentColor, this.$sheetTonalElevation, this.$sheetShadowElevation, this.$sheetDragHandle, this.$sheetSwipeEnabled, this.$topBar, this.$snackbarHost, this.$containerColor, this.$contentColor, this.$content, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
