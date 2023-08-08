package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import com.carrefour.fid.android.shared.util.C28951s;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p009io.github.aakira.napier.C10848c;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment$adapterCallback$1 */
public final class OrdersOnlineDetailsFragment$adapterCallback$1 implements C24881i.C24882a {

    /* renamed from: a */
    public final /* synthetic */ OrdersOnlineDetailsFragment f61570a;

    public OrdersOnlineDetailsFragment$adapterCallback$1(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
        this.f61570a = ordersOnlineDetailsFragment;
    }

    /* renamed from: a */
    public void mo72529a(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "downloadUrl");
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        String string = ordersOnlineDetailsFragment.getString(R.string.general_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        String string2 = this.f61570a.getString(R.string.order_dialog_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.order_dialog_message)");
        FragmentKt.m118838z(ordersOnlineDetailsFragment, string, string2, this.f61570a.getString(R.string.general_see), new OrdersOnlineDetailsFragment$adapterCallback$1$onDownloadEBill$1(this.f61570a, str2), this.f61570a.getString(R.string.general_cancel), false, OrdersOnlineDetailsFragment$adapterCallback$1$onDownloadEBill$2.f61574f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: b */
    public void mo72530b(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "type");
        FragmentKt.m118823k(this.f61570a, C25204i.f62079a.mo73265c(str, ordersOnlineDetailType));
    }

    /* renamed from: c */
    public void mo72531c(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "refundUrl");
        this.f61570a.mo72506d1().mo78403f();
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        String string = ordersOnlineDetailsFragment.getString(R.string.general_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        String string2 = this.f61570a.getString(R.string.demande_remboursement_popup_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.deman…boursement_popup_message)");
        FragmentKt.m118838z(ordersOnlineDetailsFragment, string, string2, this.f61570a.getString(R.string.general_see), new OrdersOnlineDetailsFragment$adapterCallback$1$onAskRefund$1(this.f61570a, str2), this.f61570a.getString(R.string.general_cancel), false, OrdersOnlineDetailsFragment$adapterCallback$1$onAskRefund$2.f61571f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: d */
    public void mo72532d() {
        this.f61570a.mo72506d1().mo78402e();
        this.f61570a.mo72508f1().sendIntent(C27012a.C27021c.C27024c.f65718a);
    }

    /* renamed from: e */
    public void mo72533e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.f61570a.mo72506d1().mo78411n();
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        FragmentKt.m118823k(ordersOnlineDetailsFragment, C25204i.f62079a.mo73268h(ordersOnlineDetailsFragment.mo72505c1(), this.f61570a.mo72507e1(), str));
        FragmentExtensionKt.m58757h(this.f61570a);
    }

    /* renamed from: f */
    public void mo72534f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        FragmentKt.m118829q(ordersOnlineDetailsFragment, (String) null, (String) null, new OrdersOnlineDetailsFragment$adapterCallback$1$onRedirectToLink$1(ordersOnlineDetailsFragment, str), 3, (Object) null);
    }

    /* renamed from: g */
    public void mo72535g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f61570a.mo72506d1().mo78413p();
        mo72534f(str);
    }

    /* renamed from: h */
    public void mo72536h(int i) {
        RecyclerView recyclerView = OrdersOnlineDetailsFragment.m108138R0(this.f61570a).f91898c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerFragmentOrdersDetails");
        RecyclerViewKt.m118878q(recyclerView, i, 0, 2, (Object) null);
    }

    /* renamed from: i */
    public void mo72537i(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.f61570a.mo72506d1().mo78407j();
        FragmentKt.m118823k(this.f61570a, C25204i.f62079a.mo73269i(str));
    }

    /* renamed from: j */
    public void mo72538j(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f61570a.mo72506d1().mo78410m();
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        FragmentKt.m118829q(ordersOnlineDetailsFragment, (String) null, (String) null, new OrdersOnlineDetailsFragment$adapterCallback$1$onFollowCommand$1(ordersOnlineDetailsFragment, str), 3, (Object) null);
    }

    /* renamed from: k */
    public void mo72539k(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.f61570a.mo72506d1().mo78404g();
        C28951s sVar = C28951s.f70964a;
        Context requireContext = this.f61570a.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (sVar.mo84281g(requireContext)) {
            OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
            String string = ordersOnlineDetailsFragment.getString(R.string.general_information);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
            String string2 = this.f61570a.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(cancelMessage)");
            FragmentKt.m118838z(ordersOnlineDetailsFragment, string, string2, this.f61570a.getString(R.string.yes), new OrdersOnlineDetailsFragment$adapterCallback$1$onCancelOrder$1(this.f61570a), this.f61570a.getString(R.string.no), false, OrdersOnlineDetailsFragment$adapterCallback$1$onCancelOrder$2.f61572f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
            return;
        }
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment2 = this.f61570a;
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string3 = ordersOnlineDetailsFragment2.getString(R.string.general_error_no_network_message);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.gener…error_no_network_message)");
        FragmentKt.m118811B(ordersOnlineDetailsFragment2, variant, string3, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: l */
    public void mo72540l() {
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        FragmentKt.m118829q(ordersOnlineDetailsFragment, (String) null, (String) null, new C24833x1a99596d(ordersOnlineDetailsFragment), 3, (Object) null);
    }

    /* renamed from: m */
    public void mo72541m() {
        this.f61570a.mo72506d1().mo78403f();
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        FragmentKt.m118829q(ordersOnlineDetailsFragment, (String) null, (String) null, new OrdersOnlineDetailsFragment$adapterCallback$1$onAskNalRefund$1(ordersOnlineDetailsFragment), 3, (Object) null);
    }

    /* renamed from: n */
    public void mo72542n(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "downloadUrl");
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        String string = ordersOnlineDetailsFragment.getString(R.string.general_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        String string2 = this.f61570a.getString(R.string.order_dialog_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.order_dialog_message)");
        FragmentKt.m118838z(ordersOnlineDetailsFragment, string, string2, this.f61570a.getString(R.string.general_see), new OrdersOnlineDetailsFragment$adapterCallback$1$onDownloadBill$1(this.f61570a, str2), this.f61570a.getString(R.string.general_cancel), false, OrdersOnlineDetailsFragment$adapterCallback$1$onDownloadBill$2.f61573f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: o */
    public void mo72543o() {
        this.f61570a.mo72506d1().mo78404g();
        OrdersOnlineDetailsFragment ordersOnlineDetailsFragment = this.f61570a;
        FragmentKt.m118829q(ordersOnlineDetailsFragment, (String) null, (String) null, new OrdersOnlineDetailsFragment$adapterCallback$1$onCancelLadOrder$1(ordersOnlineDetailsFragment), 3, (Object) null);
    }
}
