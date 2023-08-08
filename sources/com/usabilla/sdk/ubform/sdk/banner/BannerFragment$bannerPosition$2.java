package com.usabilla.sdk.ubform.sdk.banner;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerPosition;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BannerFragment$bannerPosition$2 extends Lambda implements C11289a<BannerPosition> {
    final /* synthetic */ BannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerFragment$bannerPosition$2(BannerFragment bannerFragment) {
        super(0);
        this.this$0 = bannerFragment;
    }

    @C12579k
    /* renamed from: a */
    public final BannerPosition invoke() {
        return BannerPosition.f27325a.mo20708a(this.this$0.mo20689S0().getCampaignBannerPosition().mo20707q());
    }
}
