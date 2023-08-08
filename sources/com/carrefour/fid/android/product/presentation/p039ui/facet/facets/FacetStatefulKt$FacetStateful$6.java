package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetStateful$6 */
public final class FacetStatefulKt$FacetStateful$6 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C27950a $analytics;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$FacetStateful$6(C27950a aVar) {
        super(0);
        this.$analytics = aVar;
    }

    @C12579k
    public final Boolean invoke() {
        this.$analytics.sendScreenView();
        return Boolean.TRUE;
    }
}
