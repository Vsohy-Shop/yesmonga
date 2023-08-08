package com.carrefour.fid.android.design.libs.pager;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerStateKt$rememberPagerState$1$1 extends Lambda implements C11289a<PagerState> {
    final /* synthetic */ int $initialPage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerStateKt$rememberPagerState$1$1(int i) {
        super(0);
        this.$initialPage = i;
    }

    @C12579k
    /* renamed from: a */
    public final PagerState invoke() {
        return new PagerState(this.$initialPage);
    }
}
