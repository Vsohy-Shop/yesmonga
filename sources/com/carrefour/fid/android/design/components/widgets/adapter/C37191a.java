package com.carrefour.fid.android.design.components.widgets.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.databinding.C37057j1;
import com.carrefour.fid.android.design.components.widgets.C37409t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.widgets.adapter.a */
public final class C37191a extends RecyclerView.Adapter<C37192b> {
    @C12579k

    /* renamed from: a */
    public final List<C37409t> f93289a;

    public C37191a(@C12579k List<C37409t> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f93289a = list;
    }

    public int getItemCount() {
        return Math.min(this.f93289a.size(), 6);
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C37192b bVar, int i) {
        Intrinsics.checkNotNullParameter(bVar, "holder");
        bVar.mo113272c(this.f93289a.get(i));
    }

    @C12579k
    /* renamed from: l */
    public C37192b onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C37057j1 d = C37057j1.m152007d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C37192b(d);
    }
}
