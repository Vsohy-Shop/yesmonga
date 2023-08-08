package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.C2362h;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class MotionMeasurer$drawDebug$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C2362h $this_drawDebug;
    final /* synthetic */ MotionMeasurer $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MotionMeasurer$drawDebug$2(MotionMeasurer motionMeasurer, C2362h hVar, int i) {
        super(2);
        this.$tmp0_rcvr = motionMeasurer;
        this.$this_drawDebug = hVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        this.$tmp0_rcvr.mo48427J(this.$this_drawDebug, oVar, this.$$changed | 1);
    }
}
