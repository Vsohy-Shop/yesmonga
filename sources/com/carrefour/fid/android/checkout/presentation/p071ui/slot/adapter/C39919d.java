package com.carrefour.fid.android.checkout.presentation.p071ui.slot.adapter;

import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.checkout.databinding.C39846f;
import com.carrefour.fid.android.checkout.presentation.p071ui.slot.model.C39937c;
import com.carrefour.fid.android.design.components.widgets.ServiceTimeSlotListComponent;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.d */
public final class C39919d extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: b */
    public static final C39920a f101784b = new C39920a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f101785c = 8;

    /* renamed from: d */
    public static final int f101786d = 1;
    @C12579k

    /* renamed from: a */
    public final C39846f f101787a;

    /* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.adapter.d$a */
    public static final class C39920a {
        public /* synthetic */ C39920a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39920a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39919d(@C12579k C39846f fVar) {
        super(fVar.getRoot());
        Intrinsics.checkNotNullParameter(fVar, "binding");
        this.f101787a = fVar;
    }

    /* renamed from: c */
    public final void mo131591c(@C12579k C39937c cVar, boolean z, boolean z2, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(cVar, "serviceSlotListModel");
        Intrinsics.checkNotNullParameter(lVar, "onSlotSelectedCallback");
        ServiceTimeSlotListComponent serviceTimeSlotListComponent = this.f101787a.f101641b;
        serviceTimeSlotListComponent.mo113176a(z, z2, lVar);
        serviceTimeSlotListComponent.mo113177b(cVar.mo131692e());
    }

    @C12579k
    /* renamed from: d */
    public final C39846f mo131592d() {
        return this.f101787a;
    }
}
