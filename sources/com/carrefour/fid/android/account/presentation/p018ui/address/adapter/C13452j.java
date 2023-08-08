package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13229p;
import com.carrefour.fid.android.account.presentation.p018ui.address.adapter.C13454k;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13475a;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.j */
public final class C13452j extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C13453a f32890b = new C13453a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f32891c = 1;
    @C12579k

    /* renamed from: a */
    public final C13229p f32892a;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.j$a */
    public static final class C13453a {
        public /* synthetic */ C13453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13453a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13452j(@C12579k C13229p pVar) {
        super(pVar.getRoot());
        Intrinsics.checkNotNullParameter(pVar, "binding");
        this.f32892a = pVar;
    }

    /* renamed from: c */
    public final void mo31896c(@C12579k C13475a aVar, @C12579k C13673b.C13683d dVar, @C12579k C13454k.C13455a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "item");
        Intrinsics.checkNotNullParameter(dVar, "selectionChoice");
        Intrinsics.checkNotNullParameter(aVar2, "adapterCallback");
        RecyclerView recyclerView = this.f32892a.f32545b;
        recyclerView.setAdapter(new C13456l(aVar2, aVar.mo32001e(), dVar));
        recyclerView.setItemAnimator((RecyclerView.C20069l) null);
        RecyclerView recyclerView2 = this.f32892a.f32545b;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.holderAccountAdd…rificationSuggestionsList");
        C22757a.m102928b(recyclerView2);
    }

    @C12579k
    /* renamed from: d */
    public final C13229p mo31897d() {
        return this.f32892a;
    }
}
