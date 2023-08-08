package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15327u2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/graphics/u2;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/graphics/u2;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2 */
public final class C7896xe053f547 extends Lambda implements C11300l<C15327u2, C11079d2> {
    final /* synthetic */ boolean $scale;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7896xe053f547(PullRefreshState pullRefreshState, boolean z) {
        super(1);
        this.$state = pullRefreshState;
        this.$scale = z;
    }

    /* renamed from: a */
    public final void mo10924a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "$this$graphicsLayer");
        u2Var.mo42479o(this.$state.mo10933i() - C15104m.m65016m(u2Var.mo42467b()));
        if (this.$scale && !this.$state.mo10935k()) {
            float H = C11479u.m44331H(C1947b0.m8292d().mo6791a(this.$state.mo10933i() / this.$state.mo10936l()), 0.0f, 1.0f);
            u2Var.mo42487x(H);
            u2Var.mo42457J(H);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10924a((C15327u2) obj);
        return C11079d2.f28267a;
    }
}
