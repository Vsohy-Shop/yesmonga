package com.usabilla.sdk.ubform.sdk.banner;

import com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/presenter/BannerPresenter;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BannerConfigurableFragment$bannerPresenter$2 extends Lambda implements C11289a<BannerPresenter> {
    final /* synthetic */ BannerConfigurableFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerConfigurableFragment$bannerPresenter$2(BannerConfigurableFragment bannerConfigurableFragment) {
        super(0);
        this.this$0 = bannerConfigurableFragment;
    }

    @C12579k
    /* renamed from: a */
    public final BannerPresenter invoke() {
        FormModel M0 = this.this$0.mo20638X0();
        BannerConfigurableFragment bannerConfigurableFragment = this.this$0;
        return new BannerPresenter(M0, bannerConfigurableFragment, bannerConfigurableFragment.mo20645e1());
    }
}
