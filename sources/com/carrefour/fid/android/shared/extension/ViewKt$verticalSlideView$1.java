package com.carrefour.fid.android.shared.extension;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.ViewKt$verticalSlideView$1", mo22502f = "View.kt", mo22503i = {}, mo22504l = {156}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ViewKt$verticalSlideView$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ View $currentView;
    final /* synthetic */ long $duration;
    final /* synthetic */ int $newHeight;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewKt$verticalSlideView$1(View view, int i, long j, C11045c<? super ViewKt$verticalSlideView$1> cVar) {
        super(2, cVar);
        this.$currentView = view;
        this.$newHeight = i;
        this.$duration = j;
    }

    /* renamed from: h */
    public static final void m119027h(View view, ValueAnimator valueAnimator) {
        Integer num;
        int i;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            i = num.intValue();
        } else {
            i = view.getLayoutParams().height;
        }
        layoutParams.height = i;
        ViewKt.m118980E(view);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ViewKt$verticalSlideView$1(this.$currentView, this.$newHeight, this.$duration, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.$currentView.getLayoutParams().height, this.$newHeight});
            long j = this.$duration;
            View view = this.$currentView;
            ofInt.setDuration(j);
            ofInt.addUpdateListener(new C28781s0(view));
            ofInt.start();
            Intrinsics.checkNotNullExpressionValue(ofInt, "invokeSuspend$lambda$1");
            this.label = 1;
            if (AnimationKt.m118727a(ofInt, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ViewKt$verticalSlideView$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
