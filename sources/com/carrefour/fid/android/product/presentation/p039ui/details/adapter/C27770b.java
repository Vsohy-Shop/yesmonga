package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.product.databinding.C27496k;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27786d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.b */
public final class C27770b extends RecyclerView.Adapter<C27786d> {
    @C12579k

    /* renamed from: a */
    public final List<OfferFlag> f67342a;

    public C27770b(@C12579k List<? extends OfferFlag> list) {
        Intrinsics.checkNotNullParameter(list, "adviceList");
        this.f67342a = list;
    }

    public int getItemCount() {
        return this.f67342a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C27786d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "holder");
        dVar.mo80732c(this.f67342a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C27786d onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27496k d = C27496k.m115707d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
        return new C27786d(d);
    }
}
