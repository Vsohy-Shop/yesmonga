package androidx.compose.material.pullrefresh;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PullRefreshStateKt$rememberPullRefreshState$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ Ref.FloatRef $refreshingOffsetPx;
    final /* synthetic */ PullRefreshState $state;
    final /* synthetic */ Ref.FloatRef $thresholdPx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshStateKt$rememberPullRefreshState$3(PullRefreshState pullRefreshState, boolean z, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(0);
        this.$state = pullRefreshState;
        this.$refreshing = z;
        this.$thresholdPx = floatRef;
        this.$refreshingOffsetPx = floatRef2;
    }

    public final void invoke() {
        this.$state.mo10944t(this.$refreshing);
        this.$state.mo10946v(this.$thresholdPx.element);
        this.$state.mo10945u(this.$refreshingOffsetPx.element);
    }
}
