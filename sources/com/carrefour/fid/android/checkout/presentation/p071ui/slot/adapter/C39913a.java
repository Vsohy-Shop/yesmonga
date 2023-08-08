package com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.checkout.databinding.C39844d;
import com.carrefour.fid.android.checkout.databinding.C39845e;
import com.carrefour.fid.android.checkout.databinding.C39846f;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.model.C39935a;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.model.C39936b;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.model.C39937c;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.model.C39938d;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.a */
public final class C39913a extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: f */
    public static final int f101770f = 8;
    @C12579k

    /* renamed from: a */
    public final List<C39938d> f101771a;
    @C12579k

    /* renamed from: b */
    public final C39936b f101772b;

    /* renamed from: c */
    public final boolean f101773c;

    /* renamed from: d */
    public final boolean f101774d;
    @C12579k

    /* renamed from: e */
    public final C11300l<Integer, C11079d2> f101775e;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.a$a */
    public interface C39914a {
        /* renamed from: a */
        void mo131586a(int i);

        /* renamed from: b */
        void mo131587b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39913a(List list, C39936b bVar, boolean z, boolean z2, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, lVar);
    }

    public int getItemCount() {
        return this.f101771a.size();
    }

    public long getItemId(int i) {
        return (long) this.f101771a.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        if (this.f101771a.get(i) instanceof C39936b) {
            return 0;
        }
        if (this.f101771a.get(i) instanceof C39937c) {
            return 1;
        }
        if (this.f101771a.get(i) instanceof C39935a) {
            return 2;
        }
        C39938d dVar = this.f101771a.get(i);
        throw new Throwable("Can't get viewType at " + i + ": " + dVar);
    }

    /* renamed from: k */
    public final void mo131585k(@C12579k List<ServiceSlotComponent.C37171b> list) {
        Intrinsics.checkNotNullParameter(list, "slots");
        List<C39938d> list2 = this.f101771a;
        list2.clear();
        if (this.f101772b.mo131686h()) {
            list2.add(this.f101772b);
        }
        list2.add(new C39937c(0, list, 1, (DefaultConstructorMarker) null));
        if (this.f101773c) {
            list2.add(new C39935a(0, 1, (DefaultConstructorMarker) null));
        }
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        if (e0Var instanceof C39917c) {
            C39938d dVar = this.f101771a.get(i);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type com.carrefour.fid.android.checkout.presentation.ui.slot.model.ServiceSlotHeaderModel");
            ((C39917c) e0Var).mo131589c(((C39936b) dVar).mo131684f());
        } else if (e0Var instanceof C39919d) {
            C39938d dVar2 = this.f101771a.get(i);
            Intrinsics.checkNotNull(dVar2, "null cannot be cast to non-null type com.carrefour.fid.android.checkout.presentation.ui.slot.model.ServiceSlotListModel");
            ((C39919d) e0Var).mo131591c((C39937c) dVar2, this.f101773c, this.f101774d, this.f101775e);
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 0) {
            C39845e d = C39845e.m162447d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C39917c(d);
        } else if (i == 1) {
            C39846f d2 = C39846f.m162451d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
            return new C39919d(d2);
        } else if (i == 2) {
            C39844d d3 = C39844d.m162443d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …, false\n                )");
            return new C39915b(d3);
        } else {
            throw new Throwable("Wrong viewType: " + i);
        }
    }

    public C39913a(@C12579k List<C39938d> list, @C12579k C39936b bVar, boolean z, boolean z2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(bVar, "serviceSlotHeaderModel");
        Intrinsics.checkNotNullParameter(lVar, "onSlotSelectedCallback");
        this.f101771a = list;
        this.f101772b = bVar;
        this.f101773c = z;
        this.f101774d = z2;
        this.f101775e = lVar;
        setHasStableIds(true);
    }
}
