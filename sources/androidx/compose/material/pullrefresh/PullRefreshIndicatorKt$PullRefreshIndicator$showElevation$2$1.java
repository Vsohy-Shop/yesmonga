package androidx.compose.material.pullrefresh;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(boolean z, PullRefreshState pullRefreshState) {
        super(0);
        this.$refreshing = z;
        this.$state = pullRefreshState;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$refreshing || this.$state.mo10933i() > 0.5f);
    }
}
