package com.carrefour.fid.android.design.components.widgets.adapter;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.databinding.C37084w0;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.adapter.f */
public final class C37196f extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f93298b = 8;
    @C12579k

    /* renamed from: a */
    public final C37084w0 f93299a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37196f(@C12579k C37084w0 w0Var) {
        super(w0Var.getRoot());
        Intrinsics.checkNotNullParameter(w0Var, "binding");
        this.f93299a = w0Var;
    }

    @C12579k
    /* renamed from: c */
    public final C37084w0 mo113281c() {
        return this.f93299a;
    }

    /* renamed from: d */
    public final void mo113282d(@C12579k ServiceSlotDateComponent.C37173b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(bVar, "slotDate");
        ServiceSlotDateComponent b = this.f93299a.getRoot();
        b.setUpAccessibility(bVar, z);
        if (b.isActivated() != z) {
            b.setActivated(z);
        }
    }
}
