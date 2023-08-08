package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.a */
public final class C27092a {

    /* renamed from: c */
    public static final int f65883c = OrderType.f70277d;
    @C12579k

    /* renamed from: a */
    public final String f65884a;
    @C12579k

    /* renamed from: b */
    public final OrderType f65885b;

    public C27092a(@C12579k String str, @C12579k OrderType orderType) {
        Intrinsics.checkNotNullParameter(str, "orderID");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f65884a = str;
        this.f65885b = orderType;
    }

    /* renamed from: d */
    public static /* synthetic */ C27092a m114551d(C27092a aVar, String str, OrderType orderType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f65884a;
        }
        if ((i & 2) != 0) {
            orderType = aVar.f65885b;
        }
        return aVar.mo78764c(str, orderType);
    }

    @C12579k
    /* renamed from: a */
    public final String mo78762a() {
        return this.f65884a;
    }

    @C12579k
    /* renamed from: b */
    public final OrderType mo78763b() {
        return this.f65885b;
    }

    @C12579k
    /* renamed from: c */
    public final C27092a mo78764c(@C12579k String str, @C12579k OrderType orderType) {
        Intrinsics.checkNotNullParameter(str, "orderID");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new C27092a(str, orderType);
    }

    @C12579k
    /* renamed from: e */
    public final String mo78765e() {
        return this.f65884a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27092a)) {
            return false;
        }
        C27092a aVar = (C27092a) obj;
        return Intrinsics.areEqual((Object) this.f65884a, (Object) aVar.f65884a) && Intrinsics.areEqual((Object) this.f65885b, (Object) aVar.f65885b);
    }

    @C12579k
    /* renamed from: f */
    public final OrderType mo78767f() {
        return this.f65885b;
    }

    public int hashCode() {
        return (this.f65884a.hashCode() * 31) + this.f65885b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f65884a;
        OrderType orderType = this.f65885b;
        return "CancelDialogModel(orderID=" + str + ", orderType=" + orderType + ")";
    }
}
