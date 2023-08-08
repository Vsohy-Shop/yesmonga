package com.carrefour.fid.android.design.components.widgets.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37084w0;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent;
import com.urbanairship.remotedata.C9628n;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.adapter.h */
public final class C37198h extends RecyclerView.Adapter<C37196f> {

    /* renamed from: e */
    public static final int f93304e = 8;
    @C12579k

    /* renamed from: a */
    public final C11300l<Integer, C11079d2> f93305a;
    @C12579k

    /* renamed from: b */
    public final List<ServiceSlotDateComponent.C37173b> f93306b;
    @C12580l

    /* renamed from: c */
    public ServiceSlotDateComponent.C37173b f93307c;

    /* renamed from: d */
    public int f93308d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37198h(C11300l lVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: o */
    public static final void m152753o(C37198h hVar, int i, ServiceSlotDateComponent.C37173b bVar, C37084w0 w0Var, View view) {
        Intrinsics.checkNotNullParameter(hVar, "this$0");
        Intrinsics.checkNotNullParameter(bVar, "$slotDate");
        Intrinsics.checkNotNullParameter(w0Var, "$this_apply");
        hVar.f93305a.invoke(Integer.valueOf(i));
        hVar.f93307c = bVar;
        w0Var.f92840b.setUpAccessibility(bVar, true);
        view.announceForAccessibility(view.getContext().getString(C36896b.C36912p.accessibility_slot_selected));
        hVar.notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f93306b.size();
    }

    public long getItemId(int i) {
        return (long) this.f93306b.get(i).hashCode();
    }

    /* renamed from: l */
    public final int mo113284l() {
        return this.f93308d;
    }

    /* renamed from: m */
    public void onBindViewHolder(@C12579k C37196f fVar, int i) {
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(fVar, "holder");
        ServiceSlotDateComponent.C37173b bVar = this.f93306b.get(i);
        C37084w0 c = fVar.mo113281c();
        boolean f = bVar.mo113150f();
        c.f92840b.mo113141u(bVar);
        if (f) {
            i2 = C36896b.C36904h.se_service_slot_date_item_available;
        } else {
            i2 = C36896b.C36904h.background_service_slot_item_unavailable;
        }
        ServiceSlotDateComponent b = c.getRoot();
        b.setBackgroundResource(i2);
        boolean z2 = true;
        if (!Intrinsics.areEqual((Object) bVar, (Object) this.f93307c) || !f) {
            z = false;
        } else {
            z = true;
        }
        b.setActivated(z);
        c.f92840b.setUpAccessibility(bVar, b.isActivated());
        if (bVar.mo113150f()) {
            c.getRoot().setOnClickListener(new C37197g(this, i, bVar, c));
        }
        if (this.f93308d != i) {
            z2 = false;
        }
        fVar.mo113282d(bVar, z2);
    }

    /* renamed from: n */
    public void onBindViewHolder(@C12579k C37196f fVar, int i, @C12579k List<Object> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(fVar, "holder");
        Intrinsics.checkNotNullParameter(list, C9628n.f26375e);
        if (list.isEmpty()) {
            onBindViewHolder(fVar, i);
            return;
        }
        ServiceSlotDateComponent.C37173b bVar = this.f93306b.get(i);
        if (this.f93308d == i) {
            z = true;
        } else {
            z = false;
        }
        fVar.mo113282d(bVar, z);
    }

    @C12579k
    /* renamed from: p */
    public C37196f onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C37084w0 d = C37084w0.m152077d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C37196f(d);
    }

    /* renamed from: q */
    public final void mo113288q(int i) {
        this.f93308d = i;
    }

    /* renamed from: r */
    public final boolean mo113289r(int i) {
        if (this.f93308d == i || i < 0) {
            return false;
        }
        this.f93308d = i;
        notifyItemRangeChanged(0, getItemCount(), Integer.valueOf(this.f93308d));
        return true;
    }

    /* renamed from: s */
    public final void mo113290s(@C12579k List<ServiceSlotDateComponent.C37173b> list) {
        Intrinsics.checkNotNullParameter(list, "dateList");
        this.f93306b.clear();
        this.f93306b.addAll(list);
        notifyDataSetChanged();
    }

    public C37198h(@C12579k C11300l<? super Integer, C11079d2> lVar, @C12579k List<ServiceSlotDateComponent.C37173b> list) {
        Intrinsics.checkNotNullParameter(lVar, "onDateSelectedCallback");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f93305a = lVar;
        this.f93306b = list;
        this.f93308d = -1;
        setHasStableIds(true);
    }
}
