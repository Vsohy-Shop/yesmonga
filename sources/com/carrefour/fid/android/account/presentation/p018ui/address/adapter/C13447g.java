package com.carrefour.fid.android.account.presentation.p018ui.address.adapter;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.account.databinding.C13227n;
import com.carrefour.fid.android.account.presentation.p018ui.address.model.C13478d;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.g */
public final class C13447g extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C13448a f32882b = new C13448a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f32883c = 0;
    @C12579k

    /* renamed from: a */
    public final C13227n f32884a;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.adapter.g$a */
    public static final class C13448a {
        public /* synthetic */ C13448a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13448a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13447g(@C12579k C13227n nVar) {
        super(nVar.getRoot());
        Intrinsics.checkNotNullParameter(nVar, "binding");
        this.f32884a = nVar;
    }

    /* renamed from: c */
    public final void mo31891c(@C12579k C13478d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "item");
        this.f32884a.f32541c.setText(dVar.mo32017e());
        TextView textView = this.f32884a.f32541c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.holderAccountAdd…VerificationValueTextview");
        C22757a.m102928b(textView);
    }

    @C12579k
    /* renamed from: d */
    public final C13227n mo31892d() {
        return this.f32884a;
    }
}
