package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsAnalyticsEvents$6 */
public final class C27704x487596cc extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C27631a $analytics;
    final /* synthetic */ String $initialProductGtin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27704x487596cc(C27631a aVar, String str) {
        super(0);
        this.$analytics = aVar;
        this.$initialProductGtin = str;
    }

    @C12579k
    public final Boolean invoke() {
        this.$analytics.mo80246g(this.$initialProductGtin);
        return Boolean.TRUE;
    }
}
