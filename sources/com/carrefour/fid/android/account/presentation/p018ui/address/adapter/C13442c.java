package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13225l;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.c */
public final class C13442c extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: a */
    public final C13225l f32873a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13442c(@C12579k C13225l lVar) {
        super(lVar.getRoot());
        Intrinsics.checkNotNullParameter(lVar, "binding");
        this.f32873a = lVar;
    }

    /* renamed from: c */
    public final void mo31884c(@C12579k DQEAddressModel dQEAddressModel) {
        Intrinsics.checkNotNullParameter(dQEAddressModel, "item");
        this.f32873a.f32532d.setText(dQEAddressModel.mo31628j());
        this.f32873a.f32533e.setText(dQEAddressModel.mo31634p() + " " + dQEAddressModel.mo31629k());
    }

    @C12579k
    /* renamed from: d */
    public final C13225l mo31885d() {
        return this.f32873a;
    }
}
