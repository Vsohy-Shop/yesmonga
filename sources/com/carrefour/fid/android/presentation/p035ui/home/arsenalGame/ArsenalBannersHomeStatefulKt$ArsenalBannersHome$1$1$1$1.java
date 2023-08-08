package com.carrefour.fid.android.presentation.p035ui.home.arsenalGame;

import com.carrefour.fid.android.domain.models.ArsenalGenericBanner;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$1$1 */
public final class ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11305q<String, String, String, C11079d2> $OnArsenalBannerClicked;
    final /* synthetic */ ArsenalGenericBanner $banner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$1$1(C11305q<? super String, ? super String, ? super String, C11079d2> qVar, ArsenalGenericBanner arsenalGenericBanner) {
        super(0);
        this.$OnArsenalBannerClicked = qVar;
        this.$banner = arsenalGenericBanner;
    }

    public final void invoke() {
        this.$OnArsenalBannerClicked.invoke(this.$banner.getOpCode(), this.$banner.getGameUrl(), this.$banner.getOpName());
    }
}
