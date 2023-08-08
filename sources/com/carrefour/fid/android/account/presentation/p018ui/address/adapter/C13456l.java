package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13228o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.p018ui.address.adapter.C13454k;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.l */
public final class C13456l extends RecyclerView.Adapter<C13450i> {
    @C12579k

    /* renamed from: a */
    public final C13454k.C13455a f32898a;
    @C12579k

    /* renamed from: b */
    public final List<DQEAddressModel> f32899b;
    @C12579k

    /* renamed from: c */
    public final C13673b.C13683d f32900c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13456l(C13454k.C13455a aVar, List list, C13673b.C13683d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new ArrayList() : list, dVar);
    }

    public int getItemCount() {
        return this.f32899b.size();
    }

    public long getItemId(int i) {
        return (long) this.f32899b.get(i).hashCode();
    }

    /* renamed from: k */
    public void onBindViewHolder(@C12579k C13450i iVar, int i) {
        Intrinsics.checkNotNullParameter(iVar, "holder");
        iVar.mo31894d(this.f32899b.get(i), this.f32900c, this.f32898a);
    }

    @C12579k
    /* renamed from: l */
    public C13450i onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        C13228o d = C13228o.m57321d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …rent, false\n            )");
        return new C13450i(d);
    }

    public C13456l(@C12579k C13454k.C13455a aVar, @C12579k List<DQEAddressModel> list, @C12579k C13673b.C13683d dVar) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(dVar, "selectionChoice");
        this.f32898a = aVar;
        this.f32899b = list;
        this.f32900c = dVar;
        setHasStableIds(true);
    }
}
