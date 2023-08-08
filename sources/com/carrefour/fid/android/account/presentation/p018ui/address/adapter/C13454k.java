package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13226m;
import com.carrefour.fid.android.account.databinding.C13227n;
import com.carrefour.fid.android.account.databinding.C13229p;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13475a;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13476b;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13477c;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13478d;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.k */
public final class C13454k extends RecyclerView.Adapter<RecyclerView.C20061e0> {
    @C12579k

    /* renamed from: a */
    public final C13455a f32893a;

    /* renamed from: b */
    public final boolean f32894b;
    @C12579k

    /* renamed from: c */
    public final List<C13476b> f32895c;
    @C12580l

    /* renamed from: d */
    public DQEAddressModel f32896d;
    @C12579k

    /* renamed from: e */
    public C13673b.C13683d f32897e;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.k$a */
    public interface C13455a {
        /* renamed from: a */
        void mo31864a();

        /* renamed from: b */
        void mo31865b();

        /* renamed from: c */
        void mo31866c(@C12579k DQEAddressModel dQEAddressModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13454k(C13455a aVar, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new ArrayList() : list);
    }

    public int getItemCount() {
        return this.f32895c.size();
    }

    public long getItemId(int i) {
        return (long) this.f32895c.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        if (this.f32895c.get(i) instanceof C13478d) {
            return 0;
        }
        if (this.f32895c.get(i) instanceof C13475a) {
            return 1;
        }
        if (this.f32895c.get(i) instanceof C13477c) {
            return 2;
        }
        C13476b bVar = this.f32895c.get(i);
        throw new Throwable("Can't get viewType at " + i + ": " + bVar);
    }

    /* renamed from: k */
    public final void mo31899k() {
        this.f32896d = null;
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final void mo31900l(@C12580l DQEAddressModel dQEAddressModel) {
        this.f32896d = dQEAddressModel;
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final void mo31901m(@C12579k String str, @C12579k List<DQEAddressModel> list, @C12579k C13673b.C13683d dVar) {
        Intrinsics.checkNotNullParameter(str, "entryAddress");
        Intrinsics.checkNotNullParameter(list, "suggestions");
        Intrinsics.checkNotNullParameter(dVar, "choice");
        List<C13476b> list2 = this.f32895c;
        list2.clear();
        list2.add(new C13478d(0, str, 1, (DefaultConstructorMarker) null));
        if (!list.isEmpty()) {
            list2.add(new C13475a(0, list, 1, (DefaultConstructorMarker) null));
        }
        list2.add(new C13477c(0, list.isEmpty(), 1, (DefaultConstructorMarker) null));
        this.f32897e = dVar;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@C12579k RecyclerView.C20061e0 e0Var, int i) {
        Intrinsics.checkNotNullParameter(e0Var, "holder");
        if (e0Var instanceof C13447g) {
            C13476b bVar = this.f32895c.get(i);
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type com.carrefour.fid.android.account.presentation.ui.address.model.VerifyAddressHeaderModel");
            ((C13447g) e0Var).mo31891c((C13478d) bVar);
        } else if (e0Var instanceof C13452j) {
            C13476b bVar2 = this.f32895c.get(i);
            Intrinsics.checkNotNull(bVar2, "null cannot be cast to non-null type com.carrefour.fid.android.account.presentation.ui.address.model.AddressSuggestionsModel");
            ((C13452j) e0Var).mo31896c((C13475a) bVar2, this.f32897e, this.f32893a);
        } else if (e0Var instanceof C13445f) {
            C13476b bVar3 = this.f32895c.get(i);
            Intrinsics.checkNotNull(bVar3, "null cannot be cast to non-null type com.carrefour.fid.android.account.presentation.ui.address.model.VerifyAddressBottomModel");
            ((C13445f) e0Var).mo31889f((C13477c) bVar3, this.f32897e, this.f32893a);
        }
    }

    @C12579k
    public RecyclerView.C20061e0 onCreateViewHolder(@C12579k ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
        if (i == 0) {
            C13227n d = C13227n.m57317d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d, "inflate(\n               …, false\n                )");
            return new C13447g(d);
        } else if (i == 1) {
            C13229p d2 = C13229p.m57325d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(\n               …, false\n                )");
            return new C13452j(d2);
        } else if (i == 2) {
            C13226m d3 = C13226m.m57313d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(d3, "inflate(\n               …, false\n                )");
            return new C13445f(d3, this.f32894b);
        } else {
            throw new Throwable("Wrong viewType: " + i);
        }
    }

    public C13454k(@C12579k C13455a aVar, boolean z, @C12579k List<C13476b> list) {
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        Intrinsics.checkNotNullParameter(list, "list");
        this.f32893a = aVar;
        this.f32894b = z;
        this.f32895c = list;
        this.f32897e = C13673b.C13683d.C13685b.f33286a;
        setHasStableIds(true);
    }
}
