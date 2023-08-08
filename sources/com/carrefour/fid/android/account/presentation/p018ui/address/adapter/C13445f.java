package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13226m;
import com.carrefour.fid.android.account.presentation.p018ui.address.adapter.C13454k;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13477c;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.f */
public final class C13445f extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: c */
    public static final C13446a f32878c = new C13446a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f32879d = 2;
    @C12579k

    /* renamed from: a */
    public final C13226m f32880a;

    /* renamed from: b */
    public final boolean f32881b;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.f$a */
    public static final class C13446a {
        public /* synthetic */ C13446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13446a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13445f(@C12579k C13226m mVar, boolean z) {
        super(mVar.getRoot());
        Intrinsics.checkNotNullParameter(mVar, "binding");
        this.f32880a = mVar;
        this.f32881b = z;
    }

    /* renamed from: g */
    public static final void m57868g(C13445f fVar, C13454k.C13455a aVar, View view) {
        Intrinsics.checkNotNullParameter(fVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$callback");
        fVar.mo31888e();
        aVar.mo31865b();
    }

    /* renamed from: h */
    public static final void m57869h(C13445f fVar, C13454k.C13455a aVar, View view) {
        Intrinsics.checkNotNullParameter(fVar, "this$0");
        Intrinsics.checkNotNullParameter(aVar, "$callback");
        fVar.mo31888e();
        aVar.mo31864a();
    }

    /* renamed from: e */
    public final void mo31888e() {
        this.f32880a.f32536c.jumpDrawablesToCurrentState();
        this.f32880a.f32537d.jumpDrawablesToCurrentState();
    }

    /* renamed from: f */
    public final void mo31889f(@C12579k C13477c cVar, @C12579k C13673b.C13683d dVar, @C12579k C13454k.C13455a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(cVar, "item");
        Intrinsics.checkNotNullParameter(dVar, "selectionChoice");
        Intrinsics.checkNotNullParameter(aVar, C10108c.f27778C);
        C13226m mVar = this.f32880a;
        if (!this.f32881b) {
            mVar.f32536c.setVisibility(8);
        } else {
            mVar.f32536c.setVisibility(0);
        }
        TextView textView = mVar.f32535b;
        Context context = this.itemView.getContext();
        if (cVar.mo32011f()) {
            i = C13144b.C13163s.address_verification_dqe_not_found;
        } else {
            i = C13144b.C13163s.address_verification_other_choices;
        }
        textView.setText(context.getString(i));
        mVar.f32536c.setOnClickListener(new C13443d(this, aVar));
        mVar.f32537d.setOnClickListener(new C13444e(this, aVar));
        if (Intrinsics.areEqual((Object) dVar, (Object) C13673b.C13683d.C13684a.f33284a)) {
            mVar.f32536c.setChecked(true);
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C13673b.C13683d.C13685b.f33286a)) {
            mVar.f32537d.setChecked(true);
        } else if (dVar instanceof C13673b.C13683d.C13686c) {
            mVar.f32538e.clearCheck();
            mo31888e();
        }
    }

    @C12579k
    /* renamed from: i */
    public final C13226m mo31890i() {
        return this.f32880a;
    }
}
