package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.C2362h;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class Measurer$drawDebugBounds$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $forcedScaleFactor;
    final /* synthetic */ C2362h $this_drawDebugBounds;
    final /* synthetic */ Measurer $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Measurer$drawDebugBounds$2(Measurer measurer, C2362h hVar, float f, int i) {
        super(2);
        this.$tmp0_rcvr = measurer;
        this.$this_drawDebugBounds = hVar;
        this.$forcedScaleFactor = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo48394i(this.$this_drawDebugBounds, this.$forcedScaleFactor, oVar, this.$$changed | 1);
    }
}
