package com.usabilla.sdk.ubform.sdk.banner;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, mo22516d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BannerFragment$campaignId$2 extends Lambda implements C11289a<String> {
    final /* synthetic */ BannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerFragment$campaignId$2(BannerFragment bannerFragment) {
        super(0);
        this.this$0 = bannerFragment;
    }

    public final String invoke() {
        return this.this$0.requireArguments().getString("campaign ID", "");
    }
}
