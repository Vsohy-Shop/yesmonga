package com.carrefour.fid.android.design.components.widgets.swipetorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import com.airbnb.lottie.LottieAnimationView;
import com.carrefour.fid.android.design.components.C36896b;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/PullToRefreshLayout;", "Lcom/carrefour/fid/android/design/components/widgets/swipetorefresh/BasePullToRefreshLayout;", "", "alpha", "Lkotlin/d2;", "w", "", "J0", "I", "animationFile", "Lcom/airbnb/lottie/LottieAnimationView;", "K0", "Lkotlin/z;", "getLottieAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class PullToRefreshLayout extends BasePullToRefreshLayout {

    /* renamed from: L0 */
    public static final int f94006L0 = 8;

    /* renamed from: J0 */
    public int f94007J0;
    @C12579k

    /* renamed from: K0 */
    public final C11677z f94008K0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PullToRefreshLayout(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* access modifiers changed from: private */
    public final LottieAnimationView getLottieAnimationView() {
        return (LottieAnimationView) this.f94008K0.getValue();
    }

    /* renamed from: w */
    public final void mo114043w(float f) {
        getLottieAnimationView().setAlpha(f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PullToRefreshLayout(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PullToRefreshLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public PullToRefreshLayout(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f94007J0 = -1;
        this.f94008K0 = C10864b0.m38748c(new PullToRefreshLayout$lottieAnimationView$2(context, this));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.PullToRefreshLottieLayout, i, 0);
        try {
            this.f94007J0 = obtainStyledAttributes.getResourceId(C36896b.C36914r.PullToRefreshLottieLayout_pull_to_refresh_lottieFile, -1);
            addView(getLottieAnimationView());
            obtainStyledAttributes.recycle();
            mo114009n(new C11300l<Float, C11079d2>(this) {
                final /* synthetic */ PullToRefreshLayout this$0;

                {
                    this.this$0 = r1;
                }

                /* renamed from: a */
                public final void mo114044a(float f) {
                    LottieAnimationView v = this.this$0.getLottieAnimationView();
                    if (f == 1.0f) {
                        f = 0.1f;
                    }
                    v.setProgress(f);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo114044a(((Number) obj).floatValue());
                    return C11079d2.f28267a;
                }
            });
            mo114010o(new C11289a<C11079d2>(this) {
                final /* synthetic */ PullToRefreshLayout this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.getLottieAnimationView().mo63923K();
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
