package com.usabilla.sdk.ubform.sdk.banner;

import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BannerConfigurableFragment$config$2 extends Lambda implements C11289a<BannerConfiguration> {
    final /* synthetic */ BannerConfigurableFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerConfigurableFragment$config$2(BannerConfigurableFragment bannerConfigurableFragment) {
        super(0);
        this.this$0 = bannerConfigurableFragment;
    }

    @C12579k
    /* renamed from: a */
    public final BannerConfiguration invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable(BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNull(parcelable);
        Intrinsics.checkNotNullExpressionValue(parcelable, "requireArguments().getParcelable(ARG_BANNER_CONFIGURATION)!!");
        return (BannerConfiguration) parcelable;
    }
}
