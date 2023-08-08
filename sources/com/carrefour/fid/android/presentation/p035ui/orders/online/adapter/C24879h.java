package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.databinding.C36754l5;
import com.carrefour.fid.android.databinding.C36764m5;
import com.carrefour.fid.android.presentation.p035ui.orders.online.extension.C25198c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.h */
public final class C24879h extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: c */
    public static final int f61667c = 8;
    @C12579k

    /* renamed from: a */
    public final C24880a f61668a;
    @C12579k

    /* renamed from: b */
    public final List<OrdersOnlineItemModel> f61669b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.h$a */
    public interface C24880a {
        /* renamed from: a */
        void mo72570a(@C12579k String str);

        /* renamed from: b */
        void mo72571b(@C12579k String str);

        /* renamed from: c */
        void mo72572c(@C12579k String str);

        /* renamed from: d */
        void mo72573d();

        /* renamed from: e */
        void mo72574e(@C12579k String str, @C12579k OrderType orderType, boolean z);

        /* renamed from: f */
        void mo72575f(@C12579k String str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24879h(C24880a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: p */
    public static final void m108287p(C24879h hVar, OrdersOnlineItemModel ordersOnlineItemModel, View view) {
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "$order");
        hVar.mo72629o(ordersOnlineItemModel);
    }

    /* renamed from: q */
    public static final void m108288q(C24879h hVar, OrdersOnlineItemModel ordersOnlineItemModel, View view) {
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "$order");
        hVar.f61668a.mo72572c(ordersOnlineItemModel.mo73495z());
    }

    /* renamed from: r */
    public static final void m108289r(C24879h hVar, OrdersOnlineItemModel ordersOnlineItemModel, View view) {
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        Intrinsics.checkNotNullParameter(ordersOnlineItemModel, "$order");
        hVar.f61668a.mo72570a(ordersOnlineItemModel.mo73495z());
    }

    /* renamed from: s */
    public static final void m108290s(C24879h hVar, View view) {
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        hVar.f61668a.mo72573d();
    }

    public int getItemCount() {
        return this.f61669b.size();
    }

    public int getItemViewType(int i) {
        return this.f61669b.get(i).mo73470C();
    }

    /* renamed from: o */
    public final void mo72629o(OrdersOnlineItemModel ordersOnlineItemModel) {
        if (Intrinsics.areEqual((Object) ordersOnlineItemModel.mo73378f(), (Object) OrderType.R2h.f70292e)) {
            this.f61668a.mo72575f(ordersOnlineItemModel.mo73471D());
        } else {
            this.f61668a.mo72574e(ordersOnlineItemModel.mo73495z(), ordersOnlineItemModel.mo73378f(), C25198c.m108899i(ordersOnlineItemModel));
        }
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        OrdersOnlineItemModel ordersOnlineItemModel = this.f61669b.get(i);
        if (e0Var instanceof C24875e0) {
            C24875e0 e0Var2 = (C24875e0) e0Var;
            e0Var2.mo72624c(ordersOnlineItemModel);
            e0Var2.itemView.setOnClickListener(new C24872d(this, ordersOnlineItemModel));
            C36764m5 e = e0Var2.mo72626e();
            e.f91305h.setOnClickListener(new C24874e(this, ordersOnlineItemModel));
            e.f91304g.setOnClickListener(new C24877f(this, ordersOnlineItemModel));
        } else if (e0Var instanceof C24865b) {
            ((C24865b) e0Var).mo72615c().setOnClickListener(new C24878g(this));
        } else if (e0Var instanceof OrdersOnlineHeaderViewHolder) {
            ((OrdersOnlineHeaderViewHolder) e0Var).mo72607c();
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 0) {
            C36764m5 d = C36764m5.m150785d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …  false\n                )");
            return new C24875e0(d);
        } else if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holder_orders_customer_service, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context)\n   …r_service, parent, false)");
            return new C24865b(inflate);
        } else if (i == 2) {
            C36754l5 d2 = C36754l5.m150745d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …  false\n                )");
            return new OrdersOnlineHeaderViewHolder(d2, this.f61668a);
        } else {
            throw new Throwable("Wrong viewType: " + i);
        }
    }

    /* renamed from: t */
    public final void mo72630t(@C12579k List<OrdersOnlineItemModel> list) {
        List<OrdersOnlineItemModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "list");
        List<OrdersOnlineItemModel> list3 = this.f61669b;
        list3.clear();
        list3.addAll(CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(new OrdersOnlineItemModel(false, (Long) null, (String) null, (OrderType) null, (OrderStatus) null, (String) null, 2, (String) null, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null, 16319, (DefaultConstructorMarker) null)), list2));
        notifyDataSetChanged();
    }

    public C24879h(@C12579k C24880a aVar, @C12579k List<OrdersOnlineItemModel> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f61668a = aVar;
        this.f61669b = list;
    }
}
