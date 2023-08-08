package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.product.databinding.C27508u;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27797l;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.e */
public final class C27774e extends RecyclerView.Adapter<C27797l> {
    @C12579k

    /* renamed from: a */
    public List<ProductPicture> f67346a = CollectionsKt__CollectionsKt.m40441E();

    /* renamed from: b */
    public C27775a f67347b;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.e$a */
    public interface C27775a {
        /* renamed from: a */
        void mo80596a(int i);
    }

    /* renamed from: o */
    public static final void m116714o(C27774e eVar, int i, View view) {
        Intrinsics.checkNotNullParameter(eVar, "this$0");
        eVar.mo80706l().mo80596a(i);
    }

    public int getItemCount() {
        return this.f67346a.size();
    }

    @C12579k
    /* renamed from: l */
    public final C27775a mo80706l() {
        C27775a aVar = this.f67347b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listenerImage");
        return null;
    }

    @C12579k
    /* renamed from: m */
    public final List<ProductPicture> mo80707m() {
        return this.f67346a;
    }

    /* renamed from: n */
    public void onBindViewHolder(@C12579k C27797l lVar, int i) {
        Intrinsics.checkNotNullParameter(lVar, "holder");
        lVar.mo80744c(this.f67346a.get(i).mo118573e());
        lVar.itemView.setOnClickListener(new C27773d(this, i));
    }

    @C12579k
    /* renamed from: p */
    public C27797l onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27508u d = C27508u.m115753d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C27797l(d);
    }

    /* renamed from: q */
    public final void mo80710q(@C12579k C27775a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f67347b = aVar;
    }

    /* renamed from: r */
    public final void mo80711r(@C12579k List<ProductPicture> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f67346a = list;
        notifyDataSetChanged();
    }
}
