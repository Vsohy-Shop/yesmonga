package com.carrefour.fid.android.presentation.components.arsenal;

import com.carrefour.fid.android.domain.models.ArsenalJOBanner;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class JoBannerViewKt$JOBannerView$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ArsenalJOBanner $banner;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JoBannerViewKt$JOBannerView$2$1(C11305q<? super String, ? super String, ? super String, C11079d2> qVar, ArsenalJOBanner arsenalJOBanner) {
        super(0);
        this.$onClick = qVar;
        this.$banner = arsenalJOBanner;
    }

    public final void invoke() {
        this.$onClick.invoke(this.$banner.getOpCode(), this.$banner.getGameUrl(), this.$banner.getGameName());
    }
}
