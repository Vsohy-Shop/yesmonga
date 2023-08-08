package androidx.compose.material3;

import androidx.compose.foundation.layout.C2373k;
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
public final class BottomSheetScaffoldKt$StandardBottomSheet$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dragHandle;
    final /* synthetic */ float $layoutHeight;
    final /* synthetic */ float $peekHeight;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$4(SheetState sheetState, float f, boolean z, float f2, C15218g4 g4Var, long j, long j2, float f3, float f4, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$state = sheetState;
        this.$peekHeight = f;
        this.$sheetSwipeEnabled = z;
        this.$layoutHeight = f2;
        this.$shape = g4Var;
        this.$containerColor = j;
        this.$contentColor = j2;
        this.$tonalElevation = f3;
        this.$shadowElevation = f4;
        this.$dragHandle = pVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        BottomSheetScaffoldKt.m25432d(this.$state, this.$peekHeight, this.$sheetSwipeEnabled, this.$layoutHeight, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$shadowElevation, this.$dragHandle, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
