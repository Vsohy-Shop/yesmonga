package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36784o5;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.b */
public final class C25431b extends RecyclerView.Adapter<C25436f> {

    /* renamed from: c */
    public static final int f62578c = 8;
    @C12579k

    /* renamed from: a */
    public C25432a f62579a;
    @C12579k

    /* renamed from: b */
    public final List<FacetModel> f62580b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.b$a */
    public interface C25432a {
        /* renamed from: a */
        void mo74100a(@C12579k FacetModel facetModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25431b(C25432a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: m */
    public static final void m109773m(FacetModel facetModel, C25431b bVar, int i, View view) {
        Intrinsics.checkNotNullParameter(facetModel, "$facet");
        Intrinsics.checkNotNullParameter(bVar, "this$0");
        if (Intrinsics.areEqual((Object) facetModel.mo121582h0(), (Object) "checkbox") && facetModel.mo121580f0() <= 0) {
            facetModel.mo121584i0(!facetModel.mo121574Z());
            bVar.notifyItemChanged(i);
        }
        bVar.f62579a.mo74100a(facetModel);
    }

    public int getItemCount() {
        return this.f62580b.size();
    }

    public long getItemId(int i) {
        return (long) this.f62580b.get(i).hashCode();
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C25436f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "holder");
        FacetModel facetModel = this.f62580b.get(i);
        fVar.mo74130c(facetModel);
        fVar.itemView.setOnClickListener(new C25430a(facetModel, this, i));
    }

    @C12579k
    /* renamed from: n */
    public C25436f onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36784o5 d = C36784o5.m150865d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C25436f(d);
    }

    /* renamed from: o */
    public final void mo74123o(@C12579k List<FacetModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<FacetModel> list2 = this.f62580b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C25431b(@C12579k C25432a aVar, @C12579k List<FacetModel> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f62579a = aVar;
        this.f62580b = list;
        setHasStableIds(true);
    }
}
