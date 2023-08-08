package com.carrefour.fid.android.presentation.p035ui.account.list.store.adapter.memo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36890z3;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.store.adapter.memo.c */
public final class C23085c extends RecyclerView.Adapter<C23087d> {

    /* renamed from: c */
    public static final int f58754c = 8;
    @C12579k

    /* renamed from: a */
    public final C23086a f58755a;
    @C12579k

    /* renamed from: b */
    public final List<C38495l> f58756b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.store.adapter.memo.c$a */
    public interface C23086a {
        /* renamed from: a */
        void mo67809a(@C12579k C38495l lVar);

        /* renamed from: b */
        void mo67810b(@C12579k C38495l lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23085c(C23086a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: o */
    public static final void m103627o(C23085c cVar, int i, View view) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        cVar.f58755a.mo67809a(cVar.f58756b.get(i));
    }

    /* renamed from: p */
    public static final void m103628p(C23085c cVar, int i, View view) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        cVar.f58755a.mo67810b(cVar.f58756b.get(i));
    }

    public int getItemCount() {
        return this.f58756b.size();
    }

    public long getItemId(int i) {
        return (long) this.f58756b.get(i).mo122102Z().hashCode();
    }

    /* renamed from: m */
    public final void mo67805m() {
        if (!this.f58756b.isEmpty()) {
            this.f58756b.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: n */
    public void onBindViewHolder(@C12579k C23087d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "holder");
        dVar.mo67811c(this.f58756b.get(i));
        dVar.itemView.setOnClickListener(new C23083a(this, i));
        dVar.mo67812d().f92020b.setOnClickListener(new C23084b(this, i));
    }

    @C12579k
    /* renamed from: q */
    public C23087d onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C36890z3 d = C36890z3.m151275d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C23087d(d);
    }

    /* renamed from: r */
    public final void mo67808r(@C12579k List<C38495l> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<C38495l> list2 = this.f58756b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C23085c(@C12579k C23086a aVar, @C12579k List<C38495l> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f58755a = aVar;
        this.f58756b = list;
        setHasStableIds(true);
    }
}
