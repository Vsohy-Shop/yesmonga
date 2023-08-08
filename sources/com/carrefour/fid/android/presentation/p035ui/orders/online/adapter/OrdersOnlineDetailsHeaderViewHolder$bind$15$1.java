package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1 */
public final class OrdersOnlineDetailsHeaderViewHolder$bind$15$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C24881i.C24882a $adapterCallback;
    final /* synthetic */ OrdersOnlineDetailsHeaderModel $item;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOnlineDetailsHeaderViewHolder$bind$15$1(OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel, C24881i.C24882a aVar) {
        super(2);
        this.$item = ordersOnlineDetailsHeaderModel;
        this.$adapterCallback = aVar;
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
                ComposerKt.m29845w0(1750737518, i, -1, "com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder.bind.<anonymous>.<anonymous> (OrdersOnlineDetailsViewHolder.kt:253)");
            }
            final OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel = this.$item;
            final C24881i.C24882a aVar = this.$adapterCallback;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 1238168715, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlin.jvm.functions.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                @androidx.compose.runtime.C8540g
                @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
                    /*
                        r11 = this;
                        r0 = r13 & 11
                        r1 = 2
                        if (r0 != r1) goto L_0x0011
                        boolean r0 = r12.mo15011p()
                        if (r0 != 0) goto L_0x000c
                        goto L_0x0011
                    L_0x000c:
                        r12.mo14958a0()
                        goto L_0x010d
                    L_0x0011:
                        boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r0 == 0) goto L_0x0020
                        r0 = -1
                        java.lang.String r1 = "com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (OrdersOnlineDetailsViewHolder.kt:254)"
                        r2 = 1238168715(0x49ccf48b, float:1678993.4)
                        androidx.compose.runtime.ComposerKt.m29845w0(r2, r13, r0, r1)
                    L_0x0020:
                        r13 = 0
                        java.lang.Object[] r0 = new java.lang.Object[r13]
                        r1 = 0
                        r2 = 0
                        com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1$1$isDisplayed$1 r3 = com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1$1$isDisplayed$1.f61623f
                        r5 = 3080(0xc08, float:4.316E-42)
                        r6 = 6
                        r4 = r12
                        java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
                        androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
                        java.lang.Object r1 = r0.getValue()
                        java.lang.Boolean r1 = (java.lang.Boolean) r1
                        boolean r1 = r1.booleanValue()
                        if (r1 == 0) goto L_0x0104
                        r2 = 0
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r1 = r0
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r1.mo73361U()
                        int r1 = r1.mo73311j()
                        java.lang.String r4 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r12, r13)
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r1 = r0
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r1.mo73361U()
                        java.lang.Integer r1 = r1.mo73310i()
                        r3 = -45670394(0xfffffffffd472006, float:-1.6542665E37)
                        r12.mo14918M(r3)
                        r10 = 0
                        if (r1 != 0) goto L_0x0061
                        r5 = r10
                        goto L_0x0077
                    L_0x0061:
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r3 = r0
                        r1.intValue()
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r3.mo73361U()
                        java.lang.Integer r1 = r1.mo73310i()
                        int r1 = r1.intValue()
                        java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r12, r13)
                        r5 = r1
                    L_0x0077:
                        r12.mo15002m0()
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r1 = r0
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r1.mo73361U()
                        boolean r6 = r1.mo73312k()
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r1 = r0
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r1.mo73361U()
                        java.lang.Integer r1 = r1.mo73308h()
                        r3 = -45670159(0xfffffffffd4720f1, float:-1.6542963E37)
                        r12.mo14918M(r3)
                        if (r1 != 0) goto L_0x0098
                        r7 = r10
                        goto L_0x00ae
                    L_0x0098:
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r3 = r0
                        r1.intValue()
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r3.mo73361U()
                        java.lang.Integer r1 = r1.mo73308h()
                        int r1 = r1.intValue()
                        java.lang.String r1 = androidx.compose.p004ui.res.C16018i.m71858d(r1, r12, r13)
                        r7 = r1
                    L_0x00ae:
                        r12.mo15002m0()
                        com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1$1$3 r8 = new com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1$1$3
                        com.carrefour.fid.android.presentation.ui.orders.online.adapter.i$a r1 = r1
                        r8.<init>(r1)
                        r1 = 1157296644(0x44faf204, float:2007.563)
                        r12.mo14918M(r1)
                        boolean r1 = r12.mo15006n0(r0)
                        java.lang.Object r3 = r12.mo14921N()
                        if (r1 != 0) goto L_0x00d0
                        androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
                        java.lang.Object r1 = r1.mo16277a()
                        if (r3 != r1) goto L_0x00d8
                    L_0x00d0:
                        com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1$1$4$1 r3 = new com.carrefour.fid.android.presentation.ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1$1$4$1
                        r3.<init>(r0)
                        r12.mo14893C(r3)
                    L_0x00d8:
                        r12.mo15002m0()
                        r9 = r3
                        kotlin.jvm.functions.a r9 = (kotlin.jvm.functions.C11289a) r9
                        com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationConfig r0 = new com.carrefour.fid.android.presentation.ui.orders.online.view.NotificationConfig
                        r3 = r0
                        r3.<init>(r4, r5, r6, r7, r8, r9)
                        com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel r1 = r0
                        com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel r1 = r1.mo73361U()
                        boolean r1 = r1.mo73313l()
                        r3 = 1
                        if (r1 == 0) goto L_0x00f7
                        com.carrefour.fid.android.presentation.ui.orders.online.view.a$b r1 = new com.carrefour.fid.android.presentation.ui.orders.online.view.a$b
                        r1.<init>(r13, r3, r10)
                        goto L_0x00fc
                    L_0x00f7:
                        com.carrefour.fid.android.presentation.ui.orders.online.view.a$d r1 = new com.carrefour.fid.android.presentation.ui.orders.online.view.a$d
                        r1.<init>(r13, r3, r10)
                    L_0x00fc:
                        r4 = r1
                        r6 = 0
                        r7 = 1
                        r3 = r0
                        r5 = r12
                        com.carrefour.fid.android.presentation.p035ui.orders.online.view.NotificationStaticBannerComponentKt.m109338f(r2, r3, r4, r5, r6, r7)
                    L_0x0104:
                        boolean r12 = androidx.compose.runtime.ComposerKt.m29813g0()
                        if (r12 == 0) goto L_0x010d
                        androidx.compose.runtime.ComposerKt.m29843v0()
                    L_0x010d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.OrdersOnlineDetailsHeaderViewHolder$bind$15$1.C248531.invoke(androidx.compose.runtime.o, int):void");
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
