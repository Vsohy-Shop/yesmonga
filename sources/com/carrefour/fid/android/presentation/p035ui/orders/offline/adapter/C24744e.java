package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36644a5;
import com.carrefour.fid.android.databinding.C36843u4;
import com.carrefour.fid.android.databinding.C36853v4;
import com.carrefour.fid.android.databinding.C36863w4;
import com.carrefour.fid.android.databinding.C36873x4;
import com.carrefour.fid.android.databinding.C36882y4;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24795a;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24796b;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24797c;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24798d;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24799e;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24800f;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24801g;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsAdapter.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/adapter/OrdersOfflineDetailsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.e */
public final class C24744e extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: c */
    public static final int f61404c = 8;
    @C12579k

    /* renamed from: a */
    public final C24745a f61405a;
    @C12579k

    /* renamed from: b */
    public final List<C24798d> f61406b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.e$a */
    public interface C24745a {
        /* renamed from: a */
        void mo72228a(@C12579k DownloadReceipt downloadReceipt);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24744e(C24745a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    public int getItemCount() {
        return this.f61406b.size();
    }

    public long getItemId(int i) {
        return (long) this.f61406b.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        if (this.f61406b.get(i) instanceof C24797c) {
            return 0;
        }
        if (this.f61406b.get(i) instanceof C24800f) {
            return 1;
        }
        if (this.f61406b.get(i) instanceof C24795a) {
            return 2;
        }
        if (this.f61406b.get(i) instanceof C24799e) {
            return 3;
        }
        if (this.f61406b.get(i) instanceof C24796b) {
            return 4;
        }
        if (this.f61406b.get(i) instanceof C24801g) {
            return 5;
        }
        C24798d dVar = this.f61406b.get(i);
        throw new Throwable("Can't get viewType at " + i + ": " + dVar);
    }

    /* renamed from: k */
    public final void mo72270k(@C12579k List<? extends C24798d> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<C24798d> list2 = this.f61406b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        C24799e eVar;
        Object obj;
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        if (e0Var instanceof C24752j) {
            C24798d dVar = this.f61406b.get(i);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsHeaderModel");
            C24797c cVar = (C24797c) dVar;
            Iterator it = this.f61406b.iterator();
            while (true) {
                eVar = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C24798d) obj) instanceof C24799e) {
                    break;
                }
            }
            if (obj instanceof C24799e) {
                eVar = (C24799e) obj;
            }
            ((C24752j) e0Var).mo72277f(cVar, eVar, this.f61405a);
        } else if (e0Var instanceof C24756l) {
            C24798d dVar2 = this.f61406b.get(i);
            Intrinsics.checkNotNull(dVar2, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsProductModel");
            ((C24756l) e0Var).mo72282c((C24800f) dVar2);
        } else if (e0Var instanceof C24746f) {
            C24798d dVar3 = this.f61406b.get(i);
            Intrinsics.checkNotNull(dVar3, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsBottomModel");
            ((C24746f) e0Var).mo72271c((C24795a) dVar3);
        } else if (e0Var instanceof C24754k) {
            C24798d dVar4 = this.f61406b.get(i);
            Intrinsics.checkNotNull(dVar4, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsPaymentModel");
            ((C24754k) e0Var).mo72280c((C24799e) dVar4);
        } else if (e0Var instanceof C24748g) {
            C24798d dVar5 = this.f61406b.get(i);
            Intrinsics.checkNotNull(dVar5, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsFidelityCardModel");
            C24796b bVar = (C24796b) dVar5;
            ((C24748g) e0Var).mo72273c(bVar.mo72399g(), bVar.mo72398f());
        } else if (e0Var instanceof C24760o) {
            C24798d dVar6 = this.f61406b.get(i);
            Intrinsics.checkNotNull(dVar6, "null cannot be cast to non-null type com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsVATListModel");
            ((C24760o) e0Var).mo72287c((C24801g) dVar6);
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 0) {
            C36863w4 d = C36863w4.m151171d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C24752j(d);
        } else if (i == 1) {
            C36882y4 d2 = C36882y4.m151245d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
            return new C24756l(d2);
        } else if (i == 2) {
            C36843u4 d3 = C36843u4.m151095d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …, false\n                )");
            return new C24746f(d3);
        } else if (i == 3) {
            C36873x4 d4 = C36873x4.m151209d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d4, "inflate(\n               …, false\n                )");
            return new C24754k(d4);
        } else if (i == 4) {
            C36853v4 d5 = C36853v4.m151131d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d5, "inflate(\n               …, false\n                )");
            return new C24748g(d5);
        } else if (i == 5) {
            C36644a5 d6 = C36644a5.m150307d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d6, "inflate(\n               …, false\n                )");
            return new C24760o(d6);
        } else {
            throw new Throwable("Wrong viewType: " + i);
        }
    }

    public C24744e(@C12579k C24745a aVar, @C12579k List<C24798d> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f61405a = aVar;
        this.f61406b = list;
        setHasStableIds(true);
    }
}
