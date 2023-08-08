package com.carrefour.fid.android.presentation.p035ui.home;

import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.LuckyCartBannerModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$handleLuckyCartProductsBanner$1 */
public final class HomePageFragment$handleLuckyCartProductsBanner$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ LuckyCartBannerModel $luckCardBanner;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$handleLuckyCartProductsBanner$1(HomePageFragment homePageFragment, LuckyCartBannerModel luckyCartBannerModel) {
        super(0);
        this.this$0 = homePageFragment;
        this.$luckCardBanner = luckyCartBannerModel;
    }

    public final void invoke() {
        this.this$0.mo70419t1().sendIntent(new C26406a.C26407a.C26435w(this.$luckCardBanner));
        C19232h activity = this.this$0.getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121125b2(this.$luckCardBanner.getQuery());
        }
    }
}
