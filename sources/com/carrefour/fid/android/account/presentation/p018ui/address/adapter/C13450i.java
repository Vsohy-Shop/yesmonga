package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13228o;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.p018ui.address.adapter.C13454k;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.carrefour.fid.android.design.components.widgets.AddressRadioButtonComponent;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.i */
public final class C13450i extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C13451a f32887b = new C13451a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f32888c = 5;
    @C12579k

    /* renamed from: a */
    public final C13228o f32889a;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.i$a */
    public static final class C13451a {
        public /* synthetic */ C13451a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13451a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13450i(@C12579k C13228o oVar) {
        super(oVar.getRoot());
        Intrinsics.checkNotNullParameter(oVar, "binding");
        this.f32889a = oVar;
    }

    /* renamed from: e */
    public static final void m57876e(C13454k.C13455a aVar, DQEAddressModel dQEAddressModel, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$callback");
        Intrinsics.checkNotNullParameter(dQEAddressModel, "$item");
        aVar.mo31866c(dQEAddressModel);
    }

    /* renamed from: d */
    public final void mo31894d(@C12579k DQEAddressModel dQEAddressModel, @C12579k C13673b.C13683d dVar, @C12579k C13454k.C13455a aVar) {
        C13673b.C13683d.C13686c cVar;
        boolean z;
        Intrinsics.checkNotNullParameter(dQEAddressModel, "item");
        Intrinsics.checkNotNullParameter(dVar, "selectionChoice");
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        String str = dQEAddressModel.mo31634p() + " " + dQEAddressModel.mo31629k();
        AddressRadioButtonComponent addressRadioButtonComponent = this.f32889a.f32543b;
        Intrinsics.checkNotNullExpressionValue(addressRadioButtonComponent, "fillView$lambda$1");
        AddressRadioButtonComponent.setText$default(addressRadioButtonComponent, true, StringsKt__StringsKt.trim(dQEAddressModel.mo31628j()).toString() + ",", StringsKt__StringsKt.trim(str).toString(), (TextView.BufferType) null, 8, (Object) null);
        DQEAddressModel dQEAddressModel2 = null;
        if (dVar instanceof C13673b.C13683d.C13686c) {
            cVar = (C13673b.C13683d.C13686c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            dQEAddressModel2 = cVar.mo32576d();
        }
        if (dQEAddressModel == dQEAddressModel2) {
            z = true;
        } else {
            z = false;
        }
        addressRadioButtonComponent.setChecked(z);
        addressRadioButtonComponent.setOnClickListener(new C13449h(aVar, dQEAddressModel));
    }

    @C12579k
    /* renamed from: f */
    public final C13228o mo31895f() {
        return this.f32889a;
    }
}
