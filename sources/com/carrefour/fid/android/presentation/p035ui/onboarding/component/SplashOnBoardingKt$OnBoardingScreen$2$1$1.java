package com.carrefour.fid.android.presentation.p035ui.onboarding.component;

import com.carrefour.fid.android.design.libs.pager.PagerState;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt$OnBoardingScreen$2$1$1 */
public final class SplashOnBoardingKt$OnBoardingScreen$2$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C27420a $analyticsViewModel;
    final /* synthetic */ C11289a<C11079d2> $onNavigateHome;
    final /* synthetic */ PagerState $pagerState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashOnBoardingKt$OnBoardingScreen$2$1$1(C27420a aVar, PagerState pagerState, C11289a<C11079d2> aVar2) {
        super(0);
        this.$analyticsViewModel = aVar;
        this.$pagerState = pagerState;
        this.$onNavigateHome = aVar2;
    }

    public final void invoke() {
        this.$analyticsViewModel.mo79749h(this.$pagerState.mo114114s());
        this.$onNavigateHome.invoke();
    }
}
