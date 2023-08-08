package com.carrefour.fid.android.presentation.p035ui.onboarding.component;

import com.carrefour.fid.android.design.libs.pager.PagerState;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.component.SplashOnBoardingKt$OnBoardingScreen$2$5 */
public final class SplashOnBoardingKt$OnBoardingScreen$2$5 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C27420a $analyticsViewModel;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onNavigateToAuth;
    final /* synthetic */ PagerState $pagerState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashOnBoardingKt$OnBoardingScreen$2$5(C27420a aVar, PagerState pagerState, C11300l<? super Boolean, C11079d2> lVar) {
        super(0);
        this.$analyticsViewModel = aVar;
        this.$pagerState = pagerState;
        this.$onNavigateToAuth = lVar;
    }

    public final void invoke() {
        this.$analyticsViewModel.mo79748g(this.$pagerState.mo114114s());
        this.$onNavigateToAuth.invoke(Boolean.FALSE);
    }
}
