package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel;
import com.carrefour.fid.android.presentation.p035ui.orders.online.view.DisplayDigitalItemComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsProductViewHolder$bind$2$1 */
public final class OrdersOnlineDetailsProductViewHolder$bind$2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C24881i.C24882a $adapterCallback;
    final /* synthetic */ OrdersOnlineDetailsProductModel $product;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOnlineDetailsProductViewHolder$bind$2$1(C24881i.C24882a aVar, OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel) {
        super(2);
        this.$adapterCallback = aVar;
        this.$product = ordersOnlineDetailsProductModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-356905580, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsProductViewHolder.bind.<anonymous>.<anonymous> (OrdersOnlineDetailsViewHolder.kt:431)");
            }
            final C24881i.C24882a aVar = this.$adapterCallback;
            final OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel = this.$product;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 437996721, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(437996721, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsProductViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (OrdersOnlineDetailsViewHolder.kt:432)");
                        }
                        final C24881i.C24882a aVar = aVar;
                        final OrdersOnlineDetailsProductModel ordersOnlineDetailsProductModel = ordersOnlineDetailsProductModel;
                        DisplayDigitalItemComponentKt.m109282a((C8767m) null, new C11289a<C11079d2>() {
                            public final void invoke() {
                                C24881i.C24882a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo72534f(ordersOnlineDetailsProductModel.mo73412A());
                                }
                            }
                        }, oVar, 0, 1);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
