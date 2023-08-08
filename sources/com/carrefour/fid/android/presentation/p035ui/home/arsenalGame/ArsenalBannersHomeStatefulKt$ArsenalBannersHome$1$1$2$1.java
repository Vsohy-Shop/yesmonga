package com.carrefour.fid.android.presentation.p035ui.home.arsenalGame;

import com.carrefour.fid.android.domain.models.ArsenalGenericBanner;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$2$1 */
public final class ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$2$1 extends Lambda implements C11289a<String> {
    final /* synthetic */ ArsenalGenericBanner $banner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArsenalBannersHomeStatefulKt$ArsenalBannersHome$1$1$2$1(ArsenalGenericBanner arsenalGenericBanner) {
        super(0);
        this.$banner = arsenalGenericBanner;
    }

    @C12579k
    public final String invoke() {
        return this.$banner.getBannerUrl();
    }
}
