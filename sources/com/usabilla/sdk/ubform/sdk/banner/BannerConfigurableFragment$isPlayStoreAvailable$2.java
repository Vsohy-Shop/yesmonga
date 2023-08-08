package com.usabilla.sdk.ubform.sdk.banner;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BannerConfigurableFragment$isPlayStoreAvailable$2 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ BannerConfigurableFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerConfigurableFragment$isPlayStoreAvailable$2(BannerConfigurableFragment bannerConfigurableFragment) {
        super(0);
        this.this$0 = bannerConfigurableFragment;
    }

    /* renamed from: a */
    public final boolean mo20656a() {
        return this.this$0.requireArguments().getBoolean(BannerConfigurableFragment.f27260Y);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(mo20656a());
    }
}
