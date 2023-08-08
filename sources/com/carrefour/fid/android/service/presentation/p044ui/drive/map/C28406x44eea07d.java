package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import com.google.accompanist.pager.PagerState;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$currentPageFlow$1$1 */
public final class C28406x44eea07d extends Lambda implements C11289a<Integer> {
    final /* synthetic */ PagerState $pagerState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28406x44eea07d(PagerState pagerState) {
        super(0);
        this.$pagerState = pagerState;
    }

    @C12579k
    public final Integer invoke() {
        return Integer.valueOf(this.$pagerState.mo42010p());
    }
}
