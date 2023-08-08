package androidx.compose.material;

import androidx.compose.foundation.layout.C2373k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheet$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11304p<BottomSheetValue, C16500q, Float> $anchors;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ C15218g4 $sheetShape;
    final /* synthetic */ BottomSheetState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$3(BottomSheetState bottomSheetState, boolean z, C11304p<? super BottomSheetValue, ? super C16500q, Float> pVar, C15218g4 g4Var, float f, long j, long j2, C8767m mVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$state = bottomSheetState;
        this.$sheetGesturesEnabled = z;
        this.$anchors = pVar;
        this.$sheetShape = g4Var;
        this.$sheetElevation = f;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$modifier = mVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BottomSheetScaffoldKt.m13291a(this.$state, this.$sheetGesturesEnabled, this.$anchors, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$modifier, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
