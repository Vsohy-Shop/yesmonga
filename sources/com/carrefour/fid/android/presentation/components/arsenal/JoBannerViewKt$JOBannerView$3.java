package com.carrefour.fid.android.presentation.components.arsenal;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.ArsenalJOBanner;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class JoBannerViewKt$JOBannerView$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ArsenalJOBanner $banner;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JoBannerViewKt$JOBannerView$3(C8767m mVar, ArsenalJOBanner arsenalJOBanner, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$banner = arsenalJOBanner;
        this.$onClick = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        JoBannerViewKt.m158848a(this.$modifier, this.$banner, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
