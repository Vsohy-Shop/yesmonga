package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16494m;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/animation/EnterExitState;", "it", "Landroidx/compose/ui/unit/m;", "a", "(Landroidx/compose/animation/EnterExitState;)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ExpandShrinkModifier$measure$offsetDelta$2 extends Lambda implements C11300l<EnterExitState, C16494m> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$offsetDelta$2(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    /* renamed from: a */
    public final long mo6555a(@C12579k EnterExitState enterExitState) {
        Intrinsics.checkNotNullParameter(enterExitState, "it");
        return this.this$0.mo6551r(enterExitState, this.$measuredSize);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C16494m.m74570b(mo6555a((EnterExitState) obj));
    }
}
