package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.product.NutritionalItem;
import com.carrefour.fid.android.product.databinding.C27512y;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27798m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.f */
public final class C27776f extends RecyclerView.Adapter<C27798m> {

    /* renamed from: b */
    public static final int f67348b = 8;
    @C12579k

    /* renamed from: a */
    public List<NutritionalItem> f67349a;

    public C27776f(@C12579k List<NutritionalItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f67349a = list;
    }

    public int getItemCount() {
        return this.f67349a.size();
    }

    @C12579k
    public final List<NutritionalItem> getList() {
        return this.f67349a;
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C27798m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "holder");
        mVar.mo80746c(this.f67349a.get(i).mo118391e(), this.f67349a.get(i).mo118393f());
    }

    @C12579k
    /* renamed from: l */
    public C27798m onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27512y d = C27512y.m115769d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C27798m(d);
    }

    public final void setList(@C12579k List<NutritionalItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f67349a = list;
    }
}
