package androidx.compose.material;

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
public final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ C15218g4 $drawerShape;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ C8767m $modifier;
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
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C8767m mVar, C3043g gVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super SnackbarHostState, ? super C8592o, ? super Integer, C11079d2> qVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, int i, boolean z, C15218g4 g4Var, float f, long j, long j2, float f2, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar3, boolean z2, C15218g4 g4Var2, float f3, long j3, long j4, long j5, long j6, long j7, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar4, int i2, int i3, int i4, int i5) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = mVar;
        this.$scaffoldState = gVar;
        this.$topBar = pVar;
        this.$snackbarHost = qVar2;
        this.$floatingActionButton = pVar2;
        this.$floatingActionButtonPosition = i;
        this.$sheetGesturesEnabled = z;
        this.$sheetShape = g4Var;
        this.$sheetElevation = f;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetPeekHeight = f2;
        this.$drawerContent = qVar3;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = g4Var2;
        this.$drawerElevation = f3;
        this.$drawerBackgroundColor = j3;
        this.$drawerContentColor = j4;
        this.$drawerScrimColor = j5;
        this.$backgroundColor = j6;
        this.$contentColor = j7;
        this.$content = qVar4;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$changed2 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$sheetContent;
        C11305q<C2373k, C8592o, Integer, C11079d2> qVar2 = qVar;
        BottomSheetScaffoldKt.m13292b(qVar2, this.$modifier, this.$scaffoldState, this.$topBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$sheetGesturesEnabled, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetPeekHeight, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), C8590n1.m31123a(this.$$changed2), this.$$default);
    }
}
