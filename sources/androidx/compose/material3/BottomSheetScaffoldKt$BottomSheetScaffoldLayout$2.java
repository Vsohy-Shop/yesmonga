package androidx.compose.material3;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11305q<C2366i0, C8592o, Integer, C11079d2> $body;
    final /* synthetic */ C11305q<Integer, C8592o, Integer, C11079d2> $bottomSheet;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $snackbarHost;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2366i0, ? super C8592o, ? super Integer, C11079d2> qVar, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, float f, C11289a<Float> aVar, SheetState sheetState, long j, long j2, int i) {
        super(2);
        this.$modifier = mVar;
        this.$topBar = pVar;
        this.$body = qVar;
        this.$bottomSheet = qVar2;
        this.$snackbarHost = pVar2;
        this.$sheetPeekHeight = f;
        this.$sheetOffset = aVar;
        this.$sheetState = sheetState;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BottomSheetScaffoldKt.m25431c(this.$modifier, this.$topBar, this.$body, this.$bottomSheet, this.$snackbarHost, this.$sheetPeekHeight, this.$sheetOffset, this.$sheetState, this.$containerColor, this.$contentColor, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
