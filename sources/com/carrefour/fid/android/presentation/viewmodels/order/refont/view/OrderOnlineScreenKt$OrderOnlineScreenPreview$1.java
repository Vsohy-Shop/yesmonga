package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.C27077a;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineScreenPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ LazyListState $lazyState;
    final /* synthetic */ PullRefreshState $pullRefreshState;
    final /* synthetic */ C27077a $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineScreenPreview$1(C27077a aVar, LazyListState lazyListState, PullRefreshState pullRefreshState) {
        super(2);
        this.$state = aVar;
        this.$lazyState = lazyListState;
        this.$pullRefreshState = pullRefreshState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1925176915, i2, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenPreview.<anonymous> (OrderOnlineScreen.kt:521)");
            }
            final C27077a aVar = this.$state;
            final LazyListState lazyListState = this.$lazyState;
            final PullRefreshState pullRefreshState = this.$pullRefreshState;
            SurfaceKt.m13879b((C8767m) null, (C15218g4) null, 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(oVar, 2144492175, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(2144492175, i, -1, "com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderOnlineScreenPreview.<anonymous>.<anonymous> (OrderOnlineScreen.kt:522)");
                        }
                        OrderOnlineScreenKt.m114520i((C8767m) null, aVar, (C27093b) null, (C27092a) null, lazyListState, pullRefreshState, C270901.f65868f, oVar, (C28892e.f70778a << 3) | 1576320 | (PullRefreshState.f18930j << 15), 1);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 1572864, 63);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
