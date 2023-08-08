package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36654b5;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24802h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.n */
public final class C24759n extends RecyclerView.Adapter<C24762p> {

    /* renamed from: b */
    public static final int f61431b = 8;
    @C12579k

    /* renamed from: a */
    public final List<C24802h> f61432a;

    public C24759n() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public int getItemCount() {
        return this.f61432a.size();
    }

    public long getItemId(int i) {
        return (long) this.f61432a.get(i).hashCode();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C24762p pVar, int i) {
        Intrinsics.checkNotNullParameter(pVar, "holder");
        C24802h hVar = this.f61432a.get(i);
        boolean z = true;
        if (this.f61432a.size() != i + 1) {
            z = false;
        }
        pVar.mo72290c(hVar, z);
    }

    @C12579k
    /* renamed from: l */
    public C24762p onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36654b5 d = C36654b5.m150347d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C24762p(d);
    }

    /* renamed from: m */
    public final void mo72286m(@C12579k List<C24802h> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<C24802h> list2 = this.f61432a;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24759n(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    public C24759n(@C12579k List<C24802h> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f61432a = list;
        setHasStableIds(true);
    }
}
