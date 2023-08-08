package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36664c5;
import com.carrefour.fid.android.databinding.C36674d5;
import com.carrefour.fid.android.databinding.C36684e5;
import com.carrefour.fid.android.databinding.C36694f5;
import com.carrefour.fid.android.databinding.C36704g5;
import com.carrefour.fid.android.databinding.C36724i5;
import com.carrefour.fid.android.databinding.C36793p4;
import com.carrefour.fid.android.databinding.C36803q4;
import com.carrefour.fid.android.databinding.C36813r4;
import com.carrefour.fid.android.databinding.C36823s4;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25235c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25236d;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25237e;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25240h;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25241i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25242j;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsProductModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.i */
public final class C24881i extends RecyclerView.Adapter<C24896v> {

    /* renamed from: c */
    public static final int f61670c = 8;
    @C12580l

    /* renamed from: a */
    public final C24882a f61671a;
    @C12579k

    /* renamed from: b */
    public final List<C25237e> f61672b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.i$a */
    public interface C24882a {
        /* renamed from: a */
        void mo72529a(@C12579k String str);

        /* renamed from: b */
        void mo72530b(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType);

        /* renamed from: c */
        void mo72531c(@C12579k String str);

        /* renamed from: d */
        void mo72532d();

        /* renamed from: e */
        void mo72533e(@C12579k String str);

        /* renamed from: f */
        void mo72534f(@C12579k String str);

        /* renamed from: g */
        void mo72535g(@C12579k String str);

        /* renamed from: h */
        void mo72536h(int i);

        /* renamed from: i */
        void mo72537i(@C12579k String str);

        /* renamed from: j */
        void mo72538j(@C12579k String str);

        /* renamed from: k */
        void mo72539k(int i, @C12579k String str);

        /* renamed from: l */
        void mo72540l();

        /* renamed from: m */
        void mo72541m();

        /* renamed from: n */
        void mo72542n(@C12579k String str);

        /* renamed from: o */
        void mo72543o();
    }

    public C24881i() {
        this((C24882a) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public int getItemCount() {
        return this.f61672b.size();
    }

    public long getItemId(int i) {
        return (long) this.f61672b.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        C25237e eVar = this.f61672b.get(i);
        if (eVar instanceof OrdersOnlineDetailsHeaderModel) {
            return 0;
        }
        if (eVar instanceof C25240h) {
            return 1;
        }
        if (eVar instanceof C25242j) {
            return 9;
        }
        if (eVar instanceof C25235c) {
            return 2;
        }
        if (eVar instanceof OrdersOnlineDetailsProductModel) {
            return 3;
        }
        if (eVar instanceof C25236d) {
            return 4;
        }
        if (eVar instanceof C25241i) {
            return 5;
        }
        if (eVar instanceof C25230a.C25232b) {
            return 6;
        }
        if (eVar instanceof C25230a.C25233c) {
            return 7;
        }
        if (eVar instanceof C25230a.C25231a) {
            return 8;
        }
        throw new Throwable("Can't find type for list[position]");
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C24896v vVar, int i) {
        Intrinsics.checkNotNullParameter(vVar, "holder");
        if (vVar instanceof OrdersOnlineDetailsHeaderViewHolder) {
            C25237e eVar = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsHeaderModel");
            ((OrdersOnlineDetailsHeaderViewHolder) vVar).mo72594n((OrdersOnlineDetailsHeaderModel) eVar, this.f61671a);
        } else if (vVar instanceof OrdersOnlineDetailsReplacementInfoViewHolder) {
            ((OrdersOnlineDetailsReplacementInfoViewHolder) vVar).mo72605d(this.f61671a);
        } else if (vVar instanceof C24867b0) {
            C25237e eVar2 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsReturnableBagModel");
            ((C24867b0) vVar).mo72616d((C25242j) eVar2, this.f61671a);
        } else if (vVar instanceof C24883j) {
            C25237e eVar3 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar3, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsDepartmentModel");
            ((C24883j) vVar).mo72634c((C25235c) eVar3);
        } else if (vVar instanceof OrdersOnlineDetailsProductViewHolder) {
            C25237e eVar4 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar4, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsProductModel");
            ((OrdersOnlineDetailsProductViewHolder) vVar).mo72600c((OrdersOnlineDetailsProductModel) eVar4, this.f61671a);
        } else if (vVar instanceof C24869c) {
            C25237e eVar5 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar5, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsMissingProductModel");
            ((C24869c) vVar).mo72618c((C25236d) eVar5);
        } else if (vVar instanceof C24900z) {
            C25237e eVar6 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar6, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.OrdersOnlineDetailsReplacementProductModel");
            ((C24900z) vVar).mo72651d((C25241i) eVar6);
        } else if (vVar instanceof AdditionalOrderDetailsMissingProductListViewHolder) {
            C25237e eVar7 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar7, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.AdditionalOrderDetails.MissingProductModel");
            ((AdditionalOrderDetailsMissingProductListViewHolder) vVar).mo72583c((C25230a.C25232b) eVar7, this.f61671a);
        } else if (vVar instanceof AdditionalOrderDetailsOriginalOrderProductListViewHolder) {
            C25237e eVar8 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar8, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.AdditionalOrderDetails.OriginalOrderProductModel");
            ((AdditionalOrderDetailsOriginalOrderProductListViewHolder) vVar).mo72585c((C25230a.C25233c) eVar8, this.f61671a);
        } else if (vVar instanceof AdditionalOrderDetailsAdditionalOrderProductListViewHolder) {
            C25237e eVar9 = this.f61672b.get(i);
            Intrinsics.checkNotNull(eVar9, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.online.model.AdditionalOrderDetails.AdditionalOrderProductModel");
            ((AdditionalOrderDetailsAdditionalOrderProductListViewHolder) vVar).mo72581c((C25230a.C25231a) eVar9, this.f61671a);
        }
    }

    @C12579k
    /* renamed from: l */
    public C24896v onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 0:
                C36664c5 d = C36664c5.m150387d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d, "inflate(layoutInflater, parent, false)");
                return new OrdersOnlineDetailsHeaderViewHolder(d);
            case 1:
                C36674d5 d2 = C36674d5.m150427d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …lse\n                    )");
                return new OrdersOnlineDetailsReplacementInfoViewHolder(d2);
            case 2:
                C36803q4 d3 = C36803q4.m150939d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d3, "inflate(layoutInflater, parent, false)");
                return new C24883j(d3);
            case 3:
                C36694f5 d4 = C36694f5.m150505d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d4, "inflate(layoutInflater, parent, false)");
                return new OrdersOnlineDetailsProductViewHolder(d4);
            case 4:
                C36813r4 d5 = C36813r4.m150977d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d5, "inflate(layoutInflater, parent, false)");
                return new C24869c(d5);
            case 5:
                C36704g5 d6 = C36704g5.m150545d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d6, "inflate(layoutInflater, parent, false)");
                return new C24900z(d6);
            case 6:
                C36823s4 d7 = C36823s4.m151015d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d7, "inflate(layoutInflater, parent, false)");
                return new AdditionalOrderDetailsMissingProductListViewHolder(d7);
            case 7:
                C36684e5 d8 = C36684e5.m150467d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d8, "inflate(layoutInflater, parent, false)");
                return new AdditionalOrderDetailsOriginalOrderProductListViewHolder(d8);
            case 8:
                C36793p4 d9 = C36793p4.m150901d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d9, "inflate(layoutInflater, parent, false)");
                return new AdditionalOrderDetailsAdditionalOrderProductListViewHolder(d9);
            case 9:
                C36724i5 d10 = C36724i5.m150625d(from, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(d10, "inflate(layoutInflater, parent, false)");
                return new C24867b0(d10);
            default:
                throw new Throwable("Wrong viewType: " + i);
        }
    }

    /* renamed from: m */
    public final void mo72633m(@C12579k List<? extends C25237e> list) {
        Intrinsics.checkNotNullParameter(list, "items");
        if (!Intrinsics.areEqual((Object) list, (Object) this.f61672b)) {
            List<C25237e> list2 = this.f61672b;
            list2.clear();
            list2.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24881i(C24882a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    public C24881i(@C12580l C24882a aVar, @C12579k List<C25237e> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f61671a = aVar;
        this.f61672b = list;
        setHasStableIds(true);
    }
}
