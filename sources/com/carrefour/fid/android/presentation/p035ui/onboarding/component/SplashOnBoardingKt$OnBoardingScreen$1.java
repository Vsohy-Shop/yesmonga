package com.carrefour.fid.android.presentation.p035ui.onboarding.component;

import androidx.compose.runtime.C8415c2;
import com.carrefour.fid.android.design.libs.pager.PagerState;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt$OnBoardingScreen$1", mo22502f = "SplashOnBoarding.kt", mo22503i = {}, mo22504l = {83}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt$OnBoardingScreen$1 */
public final class SplashOnBoardingKt$OnBoardingScreen$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C27420a $analyticsViewModel;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt$OnBoardingScreen$1$a */
    public static final class C24661a implements C11908f<Integer> {

        /* renamed from: a */
        public final /* synthetic */ C27420a f61246a;

        public C24661a(C27420a aVar) {
            this.f61246a = aVar;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo72056c(int i, @C12579k C11045c<? super C11079d2> cVar) {
            this.f61246a.mo79745d(i);
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo72056c(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashOnBoardingKt$OnBoardingScreen$1(PagerState pagerState, C27420a aVar, C11045c<? super SplashOnBoardingKt$OnBoardingScreen$1> cVar) {
        super(2, cVar);
        this.$pagerState = pagerState;
        this.$analyticsViewModel = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SplashOnBoardingKt$OnBoardingScreen$1(this.$pagerState, this.$analyticsViewModel, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final PagerState pagerState = this.$pagerState;
            C11907e v = C8415c2.m30253v(new C11289a<Integer>() {
                @C12579k
                public final Integer invoke() {
                    return Integer.valueOf(pagerState.mo114114s());
                }
            });
            C24661a aVar = new C24661a(this.$analyticsViewModel);
            this.label = 1;
            if (v.collect(aVar, this) == h) {
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
        return ((SplashOnBoardingKt$OnBoardingScreen$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
