package com.carrefour.fid.android.presentation.p035ui.home.shop.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36755l6;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.adapter.a */
public final class C24203a extends RecyclerView.Adapter<C24204b> {

    /* renamed from: b */
    public static final int f60530b = 8;
    @C12579k

    /* renamed from: a */
    public final List<OfferProductModel> f60531a;

    public C24203a() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public int getItemCount() {
        return this.f60531a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C24204b bVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "holder");
        bVar.mo70825c(this.f60531a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C24204b onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36755l6 d = C36755l6.m150749d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C24204b(d);
    }

    /* renamed from: m */
    public final void mo70824m(@C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<OfferProductModel> list2 = this.f60531a;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24203a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    public C24203a(@C12579k List<OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f60531a = list;
    }
}
