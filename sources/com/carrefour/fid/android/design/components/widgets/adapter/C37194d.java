package com.carrefour.fid.android.design.components.widgets.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.databinding.C37030a1;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.widgets.adapter.d */
public final class C37194d extends RecyclerView.Adapter<C37195e> {
    @C12579k

    /* renamed from: a */
    public final List<ServiceSlotComponent.C37171b> f93293a;

    /* renamed from: b */
    public final boolean f93294b;

    /* renamed from: c */
    public final boolean f93295c;
    @C12579k

    /* renamed from: d */
    public final C11300l<Integer, C11079d2> f93296d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37194d(List list, boolean z, boolean z2, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, lVar);
    }

    /* renamed from: m */
    public static final void m152745m(C37194d dVar, int i, View view) {
        Intrinsics.checkNotNullParameter(dVar, "this$0");
        dVar.f93296d.invoke(Integer.valueOf(i));
    }

    public int getItemCount() {
        return this.f93293a.size();
    }

    public long getItemId(int i) {
        return (long) this.f93293a.get(i).hashCode();
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C37195e eVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "holder");
        ServiceSlotComponent.C37171b bVar = this.f93293a.get(i);
        C37030a1 c = eVar.mo113280c();
        c.f92562b.mo113107u(bVar, this.f93294b, this.f93295c);
        if (bVar.mo113134u() || (!bVar.mo113138y() && (bVar.mo113135v() || !bVar.mo113137x()))) {
            c.getRoot().setOnClickListener((View.OnClickListener) null);
        } else {
            c.getRoot().setOnClickListener(new C37193c(this, i));
        }
    }

    @C12579k
    /* renamed from: n */
    public C37195e onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C37030a1 d = C37030a1.m151933d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C37195e(d);
    }

    /* renamed from: o */
    public final void mo113279o(@C12579k List<ServiceSlotComponent.C37171b> list) {
        Intrinsics.checkNotNullParameter(list, "slotList");
        List<ServiceSlotComponent.C37171b> list2 = this.f93293a;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C37194d(@C12579k List<ServiceSlotComponent.C37171b> list, boolean z, boolean z2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(lVar, "onSlotSelectedCallback");
        this.f93293a = list;
        this.f93294b = z;
        this.f93295c = z2;
        this.f93296d = lVar;
        setHasStableIds(true);
    }
}
