package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3 */
public final class VectorPainter$RenderVector$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11306r<Float, Float, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ String $name;
    final /* synthetic */ VectorPainter $tmp0_rcvr;
    final /* synthetic */ float $viewportHeight;
    final /* synthetic */ float $viewportWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainter$RenderVector$3(VectorPainter vectorPainter, String str, float f, float f2, C11306r<? super Float, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, int i) {
        super(2);
        this.$tmp0_rcvr = vectorPainter;
        this.$name = str;
        this.$viewportWidth = f;
        this.$viewportHeight = f2;
        this.$content = rVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo43121o(this.$name, this.$viewportWidth, this.$viewportHeight, this.$content, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
