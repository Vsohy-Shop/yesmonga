package com.carrefour.fid.android.design.components.widgets.swipetorefresh;

import android.content.Context;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.carrefour.fid.android.design.components.type.ViewType;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/airbnb/lottie/LottieAnimationView;", "a", "()Lcom/airbnb/lottie/LottieAnimationView;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PullToRefreshLayout$lottieAnimationView$2 extends Lambda implements C11289a<LottieAnimationView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PullToRefreshLayout this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullToRefreshLayout$lottieAnimationView$2(Context context, PullToRefreshLayout pullToRefreshLayout) {
        super(0);
        this.$context = context;
        this.this$0 = pullToRefreshLayout;
    }

    @C12579k
    /* renamed from: a */
    public final LottieAnimationView invoke() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.$context);
        PullToRefreshLayout pullToRefreshLayout = this.this$0;
        if (pullToRefreshLayout.f94007J0 != -1) {
            lottieAnimationView.setAnimation(pullToRefreshLayout.f94007J0);
            lottieAnimationView.setRepeatCount(-1);
            C37408b bVar = new C37408b(new ViewGroup.LayoutParams(-2, pullToRefreshLayout.getTriggerOffSetTop()));
            bVar.mo114048b(ViewType.TOP_VIEW);
            lottieAnimationView.setLayoutParams(bVar);
            return lottieAnimationView;
        }
        throw new IllegalStateException("Could not resolve an animation for the layout");
    }
}
