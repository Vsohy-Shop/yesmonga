package com.carrefour.fid.android.product.presentation.p039ui.details.adapter.viewHolder;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.domain.models.product.AllergenType;
import com.carrefour.fid.android.product.databinding.C27506s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.viewHolder.c */
public final class C27785c extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f67364b = 8;
    @C12579k

    /* renamed from: a */
    public final C27506s f67365a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27785c(@C12579k C27506s sVar) {
        super(sVar.getRoot());
        Intrinsics.checkNotNullParameter(sVar, "binding");
        this.f67365a = sVar;
    }

    /* renamed from: c */
    public final void mo80730c(@C12579k AllergenType allergenType) {
        Intrinsics.checkNotNullParameter(allergenType, "allergenType");
        C27506s sVar = this.f67365a;
        sVar.f66739b.setText(sVar.getRoot().getContext().getString(allergenType.mo118334q()));
    }

    @C12579k
    /* renamed from: d */
    public final C27506s mo80731d() {
        return this.f67365a;
    }
}
