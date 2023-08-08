package com.carrefour.fid.android.checkout.presentation.p071ui.slot.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.model.c */
public final class C39937c implements C39938d {

    /* renamed from: c */
    public static final int f101843c = 8;

    /* renamed from: a */
    public final int f101844a;
    @C12579k

    /* renamed from: b */
    public final List<ServiceSlotComponent.C37171b> f101845b;

    public C39937c(int i, @C12579k List<ServiceSlotComponent.C37171b> list) {
        Intrinsics.checkNotNullParameter(list, "slots");
        this.f101844a = i;
        this.f101845b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C39937c m162736d(C39937c cVar, int i, List<ServiceSlotComponent.C37171b> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f101844a;
        }
        if ((i2 & 2) != 0) {
            list = cVar.f101845b;
        }
        return cVar.mo131691c(i, list);
    }

    /* renamed from: a */
    public final int mo131689a() {
        return this.f101844a;
    }

    @C12579k
    /* renamed from: b */
    public final List<ServiceSlotComponent.C37171b> mo131690b() {
        return this.f101845b;
    }

    @C12579k
    /* renamed from: c */
    public final C39937c mo131691c(int i, @C12579k List<ServiceSlotComponent.C37171b> list) {
        Intrinsics.checkNotNullParameter(list, "slots");
        return new C39937c(i, list);
    }

    @C12579k
    /* renamed from: e */
    public final List<ServiceSlotComponent.C37171b> mo131692e() {
        return this.f101845b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39937c)) {
            return false;
        }
        C39937c cVar = (C39937c) obj;
        return this.f101844a == cVar.f101844a && Intrinsics.areEqual((Object) this.f101845b, (Object) cVar.f101845b);
    }

    /* renamed from: f */
    public final int mo131694f() {
        return this.f101844a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101844a) * 31) + this.f101845b.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.f101844a;
        List<ServiceSlotComponent.C37171b> list = this.f101845b;
        return "ServiceSlotListModel(viewType=" + i + ", slots=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39937c(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, list);
    }
}
