package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.product.AllergenType;
import com.carrefour.fid.android.product.databinding.C27506s;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder.C27785c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.i */
public final class C27780i extends RecyclerView.Adapter<C27785c> {

    /* renamed from: b */
    public static final int f67355b = 8;
    @C12579k

    /* renamed from: a */
    public final List<AllergenType> f67356a;

    public C27780i(@C12579k List<? extends AllergenType> list) {
        Intrinsics.checkNotNullParameter(list, "allergenList");
        this.f67356a = list;
    }

    public int getItemCount() {
        return this.f67356a.size();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C27785c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "holder");
        cVar.mo80730c(this.f67356a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C27785c onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C27506s d = C27506s.m115745d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
        return new C27785c(d);
    }
}
