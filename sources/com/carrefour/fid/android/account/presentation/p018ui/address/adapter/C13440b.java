package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13225l;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.b */
public final class C13440b extends RecyclerView.Adapter<C13442c> {
    @C12579k

    /* renamed from: a */
    public final C13441a f32871a;
    @C12579k

    /* renamed from: b */
    public final List<DQEAddressModel> f32872b;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.b$a */
    public interface C13441a {
        /* renamed from: a */
        void mo31835a(@C12579k DQEAddressModel dQEAddressModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13440b(C13441a aVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: m */
    public static final void m57859m(C13440b bVar, DQEAddressModel dQEAddressModel, View view) {
        Intrinsics.checkNotNullParameter(bVar, "this$0");
        Intrinsics.checkNotNullParameter(dQEAddressModel, "$address");
        bVar.f32871a.mo31835a(dQEAddressModel);
    }

    public int getItemCount() {
        return this.f32872b.size();
    }

    public long getItemId(int i) {
        return (long) this.f32872b.get(i).hashCode();
    }

    /* renamed from: l */
    public void onBindViewHolder(@C12579k C13442c cVar, int i) {
        Intrinsics.checkNotNullParameter(cVar, "holder");
        DQEAddressModel dQEAddressModel = this.f32872b.get(i);
        cVar.mo31884c(dQEAddressModel);
        cVar.itemView.setOnClickListener(new C13439a(this, dQEAddressModel));
    }

    @C12579k
    /* renamed from: n */
    public C13442c onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C13225l d = C13225l.m57309d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
        return new C13442c(d);
    }

    /* renamed from: o */
    public final void mo31881o(@C12579k List<DQEAddressModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<DQEAddressModel> list2 = this.f32872b;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public C13440b(@C12579k C13441a aVar, @C12579k List<DQEAddressModel> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f32871a = aVar;
        this.f32872b = list;
        setHasStableIds(true);
    }
}
