package androidx.compose.material;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2411u0;
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
public final class AppBarKt$BottomAppBar$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C15218g4 $cutoutShape;
    final /* synthetic */ float $elevation;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$1(C8767m mVar, long j, long j2, C15218g4 g4Var, float f, C2366i0 i0Var, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$cutoutShape = g4Var;
        this.$elevation = f;
        this.$contentPadding = i0Var;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AppBarKt.m13206b(this.$modifier, this.$backgroundColor, this.$contentColor, this.$cutoutShape, this.$elevation, this.$contentPadding, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
