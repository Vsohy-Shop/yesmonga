package com.carrefour.fid.android.presentation.p035ui.coupons.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36768n;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.views.C23974a;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.adapter.a */
public final class C23785a extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: c */
    public static final int f59877c = 8;
    @C12580l

    /* renamed from: a */
    public List<CouponModel> f59878a;
    @C12579k

    /* renamed from: b */
    public Context f59879b;

    public C23785a(@C12580l List<CouponModel> list, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f59878a = list;
        this.f59879b = context;
    }

    public int getItemCount() {
        List<CouponModel> list = this.f59878a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @C12580l
    /* renamed from: k */
    public final CouponModel mo69670k(int i) {
        List<CouponModel> list = this.f59878a;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: l */
    public final void mo69671l(@C12580l List<CouponModel> list) {
        this.f59878a = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        CouponModel k = mo69670k(i);
        if (k != null) {
            ((C23974a) e0Var).mo70148f(k);
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36768n d = C36768n.m150801d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C23974a(d, this.f59879b);
    }
}
