package com.carrefour.fid.android.presentation.p035ui.home;

import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.presentation.models.C38492i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.HomePageFragment$displayOrderStatus$4 */
public final class HomePageFragment$displayOrderStatus$4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C38492i $homeOrderModel;
    final /* synthetic */ HomePageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageFragment$displayOrderStatus$4(HomePageFragment homePageFragment, C38492i iVar) {
        super(0);
        this.this$0 = homePageFragment;
        this.$homeOrderModel = iVar;
    }

    public final void invoke() {
        String Z;
        this.this$0.mo70419t1().sendIntent(C26406a.C26407a.C26419g.f64623a);
        OrdersOnlineDetailsHeaderModel o = this.$homeOrderModel.mo122080o();
        if (o != null && (Z = o.mo73366Z()) != null) {
            FragmentExtensionKt.m58751b(this.this$0, Z);
        }
    }
}
