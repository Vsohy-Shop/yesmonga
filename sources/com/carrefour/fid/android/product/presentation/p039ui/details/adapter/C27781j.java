package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.product.Traceability;
import com.carrefour.fid.android.product.databinding.C27512y;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27798m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.j */
public final class C27781j extends RecyclerView.Adapter<C27798m> {

    /* renamed from: b */
    public static final int f67357b = 8;
    @C12579k

    /* renamed from: a */
    public final List<Traceability> f67358a;

    public C27781j(@C12579k List<Traceability> list) {
        Intrinsics.checkNotNullParameter(list, "traceAbilityList");
        this.f67358a = list;
    }

    public int getItemCount() {
        return this.f67358a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C27798m mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "holder");
        String string = mVar.itemView.getContext().getString(this.f67358a.get(i).mo118641e().mo118651q());
        Intrinsics.checkNotNullExpressionValue(string, "holder.itemView.context.…sition].type.stringResId)");
        String f = this.f67358a.get(i).mo118643f();
        if (f == null) {
            f = "";
        }
        mVar.mo80746c(string, f);
    }

    @C12579k
    /* renamed from: l */
    public C27798m onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27512y d = C27512y.m115769d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C27798m(d);
    }
}
