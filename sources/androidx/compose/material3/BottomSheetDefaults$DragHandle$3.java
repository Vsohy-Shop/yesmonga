package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetDefaults$DragHandle$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ float $height;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ BottomSheetDefaults $tmp0_rcvr;
    final /* synthetic */ float $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetDefaults$DragHandle$3(BottomSheetDefaults bottomSheetDefaults, C8767m mVar, float f, float f2, C15218g4 g4Var, long j, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = bottomSheetDefaults;
        this.$modifier = mVar;
        this.$width = f;
        this.$height = f2;
        this.$shape = g4Var;
        this.$color = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo11170a(this.$modifier, this.$width, this.$height, this.$shape, this.$color, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
