package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
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
public final class CardKt$Card$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C2223i $border;
    final /* synthetic */ C8271r $colors;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ CardElevation $elevation;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C15218g4 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardKt$Card$2(C8767m mVar, C15218g4 g4Var, C8271r rVar, CardElevation cardElevation, C2223i iVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$shape = g4Var;
        this.$colors = rVar;
        this.$elevation = cardElevation;
        this.$border = iVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CardKt.m25471a(this.$modifier, this.$shape, this.$colors, this.$elevation, this.$border, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}