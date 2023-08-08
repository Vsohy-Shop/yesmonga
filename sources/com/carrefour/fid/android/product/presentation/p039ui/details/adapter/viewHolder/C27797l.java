package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.databinding.C27508u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.l */
public final class C27797l extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: a */
    public final C27508u f67381a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27797l(@C12579k C27508u uVar) {
        super(uVar.getRoot());
        Intrinsics.checkNotNullParameter(uVar, "binding");
        this.f67381a = uVar;
    }

    /* renamed from: c */
    public final void mo80744c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "path");
        C22038b.m100350E(this.f67381a.f66746b.getContext()).mo65605u(str).mo65688b(new C22561h().mo66763S0(C27609f.C27617h.ic_product_placeholder)).mo65675K1(this.f67381a.f66746b);
    }

    @C12579k
    /* renamed from: d */
    public final C27508u mo80745d() {
        return this.f67381a;
    }
}
