package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36891z4;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsAllowanceModel;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.d0 */
public final class C24873d0 extends RecyclerView.Adapter<C24897w> {

    /* renamed from: b */
    public static final int f61656b = 8;
    @C12579k

    /* renamed from: a */
    public final List<OrdersOnlineDetailsAllowanceModel> f61657a;

    public C24873d0() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public int getItemCount() {
        return this.f61657a.size();
    }

    public long getItemId(int i) {
        return (long) this.f61657a.get(i).hashCode();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C24897w wVar, int i) {
        Intrinsics.checkNotNullParameter(wVar, "holder");
        wVar.mo72647c(this.f61657a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C24897w onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36891z4 d = C36891z4.m151279d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …      false\n            )");
        return new C24897w(d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24873d0(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }

    public C24873d0(@C12579k List<OrdersOnlineDetailsAllowanceModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f61657a = list;
        setHasStableIds(true);
    }
}
