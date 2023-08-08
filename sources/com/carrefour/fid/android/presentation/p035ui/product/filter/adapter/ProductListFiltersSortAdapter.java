package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36804q5;
import com.carrefour.fid.android.presentation.models.SortModel;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.ProductListFiltersSortAdapter */
public final class ProductListFiltersSortAdapter extends RecyclerView.Adapter<C25438h> {

    /* renamed from: c */
    public static final int f62571c = 8;
    @C12579k

    /* renamed from: a */
    public final C25429a f62572a;
    @C12579k

    /* renamed from: b */
    public final C11677z f62573b = C10864b0.m38748c(ProductListFiltersSortAdapter$list$2.f62574f);

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.ProductListFiltersSortAdapter$a */
    public interface C25429a {
        @C12579k
        /* renamed from: a */
        SortModel mo74110a();

        /* renamed from: b */
        void mo74111b(@C12579k SortModel sortModel);
    }

    public ProductListFiltersSortAdapter(@C12579k C25429a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "dispatcher");
        this.f62572a = aVar;
        setHasStableIds(true);
    }

    /* renamed from: n */
    public static final void m109765n(ProductListFiltersSortAdapter productListFiltersSortAdapter, SortModel sortModel, View view) {
        Intrinsics.checkNotNullParameter(productListFiltersSortAdapter, "this$0");
        Intrinsics.checkNotNullParameter(sortModel, "$sort");
        productListFiltersSortAdapter.mo74119p(sortModel);
        productListFiltersSortAdapter.notifyDataSetChanged();
    }

    public int getItemCount() {
        return getList().size();
    }

    public long getItemId(int i) {
        return (long) getList().get(i).hashCode();
    }

    public final List<SortModel> getList() {
        return (List) this.f62573b.getValue();
    }

    /* renamed from: l */
    public final SortModel mo74116l() {
        return this.f62572a.mo74110a();
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C25438h hVar, int i) {
        Intrinsics.checkNotNullParameter(hVar, "holder");
        SortModel sortModel = getList().get(i);
        hVar.mo74133c(sortModel, Intrinsics.areEqual((Object) mo74116l(), (Object) sortModel));
        View view = hVar.itemView;
        view.setActivated(Intrinsics.areEqual((Object) mo74116l(), (Object) sortModel));
        view.setEnabled(!view.isActivated());
        view.setOnClickListener(new C25437g(this, sortModel));
    }

    @C12579k
    /* renamed from: o */
    public C25438h onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36804q5 d = C36804q5.m150943d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C25438h(d);
    }

    /* renamed from: p */
    public final void mo74119p(SortModel sortModel) {
        this.f62572a.mo74111b(sortModel);
    }
}
