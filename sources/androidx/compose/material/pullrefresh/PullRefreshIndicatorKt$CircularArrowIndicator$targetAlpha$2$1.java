package androidx.compose.material.pullrefresh;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1 extends Lambda implements C11289a<Float> {
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(PullRefreshState pullRefreshState) {
        super(0);
        this.$state = pullRefreshState;
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke() {
        float f = 1.0f;
        if (this.$state.mo10934j() < 1.0f) {
            f = 0.3f;
        }
        return Float.valueOf(f);
    }
}
