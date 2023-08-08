package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/animation/core/Transition$b;", "Landroidx/compose/animation/EnterExitState;", "Landroidx/compose/animation/core/d0;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/animation/core/Transition$b;)Landroidx/compose/animation/core/d0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ExpandShrinkModifier$sizeTransitionSpec$1 extends Lambda implements C11300l<Transition.C1927b<EnterExitState>, C1956d0<C16500q>> {
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.this$0 = expandShrinkModifier;
    }

    @C12579k
    /* renamed from: a */
    public final C1956d0<C16500q> invoke(@C12579k Transition.C1927b<EnterExitState> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        C1956d0<C16500q> d0Var = null;
        if (bVar.mo6729d(enterExitState, enterExitState2)) {
            ChangeSize value = this.this$0.mo6544e().getValue();
            if (value != null) {
                d0Var = value.mo6499h();
            }
        } else if (bVar.mo6729d(enterExitState2, EnterExitState.PostExit)) {
            ChangeSize value2 = this.this$0.mo6546l().getValue();
            if (value2 != null) {
                d0Var = value2.mo6499h();
            }
        } else {
            d0Var = EnterExitTransitionKt.f5233e;
        }
        if (d0Var == null) {
            return EnterExitTransitionKt.f5233e;
        }
        return d0Var;
    }
}
