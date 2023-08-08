package com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.databinding.C36744k5;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24803i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.adapter.q */
public final class C24764q extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f61441b = 8;
    @C12579k

    /* renamed from: a */
    public final C36744k5 f61442a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24764q(@C12579k C36744k5 k5Var) {
        super(k5Var.getRoot());
        Intrinsics.checkNotNullParameter(k5Var, "binding");
        this.f61442a = k5Var;
    }

    /* renamed from: c */
    public final void mo72292c(@C12579k C24803i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "item");
        this.f61442a.f91146f.setText(iVar.mo72485l());
        this.f61442a.f91145e.setText(iVar.mo72484k());
        this.f61442a.f91142b.setText(iVar.mo72480h());
        this.f61442a.f91143c.setText(iVar.mo72482i());
    }

    @C12579k
    /* renamed from: d */
    public final C36744k5 mo72293d() {
        return this.f61442a;
    }
}
