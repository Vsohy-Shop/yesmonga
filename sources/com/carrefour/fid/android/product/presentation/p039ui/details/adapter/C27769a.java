package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.databinding.C27496k;
import com.carrefour.fid.android.product.presentation.models.Advice;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27782a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.a */
public final class C27769a extends RecyclerView.Adapter<C27782a> {
    @C12579k

    /* renamed from: a */
    public final List<Advice> f67341a;

    public C27769a(@C12579k List<Advice> list) {
        Intrinsics.checkNotNullParameter(list, "adviceList");
        this.f67341a = list;
    }

    public int getItemCount() {
        return this.f67341a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C27782a aVar, int i) {
        Intrinsics.checkNotNullParameter(aVar, "holder");
        aVar.mo80726c(this.f67341a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C27782a onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27496k d = C27496k.m115707d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
        return new C27782a(d);
    }
}
