package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.i */
public final class C24803i {

    /* renamed from: f */
    public static final int f61533f = 0;
    @C12579k

    /* renamed from: a */
    public final String f61534a;
    @C12579k

    /* renamed from: b */
    public final String f61535b;
    @C12579k

    /* renamed from: c */
    public final String f61536c;
    @C12579k

    /* renamed from: d */
    public final String f61537d;
    @C12579k

    /* renamed from: e */
    public final OrderDetailParam f61538e;

    public C24803i(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k OrderDetailParam orderDetailParam) {
        Intrinsics.checkNotNullParameter(str, "orderStoreName");
        Intrinsics.checkNotNullParameter(str2, "orderStoreAddress");
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, "orderDate");
        Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
        this.f61534a = str;
        this.f61535b = str2;
        this.f61536c = str3;
        this.f61537d = str4;
        this.f61538e = orderDetailParam;
    }

    /* renamed from: g */
    public static /* synthetic */ C24803i m108113g(C24803i iVar, String str, String str2, String str3, String str4, OrderDetailParam orderDetailParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iVar.f61534a;
        }
        if ((i & 2) != 0) {
            str2 = iVar.f61535b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = iVar.f61536c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = iVar.f61537d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            orderDetailParam = iVar.f61538e;
        }
        return iVar.mo72479f(str, str5, str6, str7, orderDetailParam);
    }

    @C12579k
    /* renamed from: a */
    public final String mo72473a() {
        return this.f61534a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72474b() {
        return this.f61535b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo72475c() {
        return this.f61536c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo72476d() {
        return this.f61537d;
    }

    @C12579k
    /* renamed from: e */
    public final OrderDetailParam mo72477e() {
        return this.f61538e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24803i)) {
            return false;
        }
        C24803i iVar = (C24803i) obj;
        return Intrinsics.areEqual((Object) this.f61534a, (Object) iVar.f61534a) && Intrinsics.areEqual((Object) this.f61535b, (Object) iVar.f61535b) && Intrinsics.areEqual((Object) this.f61536c, (Object) iVar.f61536c) && Intrinsics.areEqual((Object) this.f61537d, (Object) iVar.f61537d) && Intrinsics.areEqual((Object) this.f61538e, (Object) iVar.f61538e);
    }

    @C12579k
    /* renamed from: f */
    public final C24803i mo72479f(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k OrderDetailParam orderDetailParam) {
        Intrinsics.checkNotNullParameter(str, "orderStoreName");
        Intrinsics.checkNotNullParameter(str2, "orderStoreAddress");
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, "orderDate");
        Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
        return new C24803i(str, str2, str3, str4, orderDetailParam);
    }

    @C12579k
    /* renamed from: h */
    public final String mo72480h() {
        return this.f61536c;
    }

    public int hashCode() {
        return (((((((this.f61534a.hashCode() * 31) + this.f61535b.hashCode()) * 31) + this.f61536c.hashCode()) * 31) + this.f61537d.hashCode()) * 31) + this.f61538e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo72482i() {
        return this.f61537d;
    }

    @C12579k
    /* renamed from: j */
    public final OrderDetailParam mo72483j() {
        return this.f61538e;
    }

    @C12579k
    /* renamed from: k */
    public final String mo72484k() {
        return this.f61535b;
    }

    @C12579k
    /* renamed from: l */
    public final String mo72485l() {
        return this.f61534a;
    }

    @C12579k
    public String toString() {
        String str = this.f61534a;
        String str2 = this.f61535b;
        String str3 = this.f61536c;
        String str4 = this.f61537d;
        OrderDetailParam orderDetailParam = this.f61538e;
        return "OrdersOfflineModel(orderStoreName=" + str + ", orderStoreAddress=" + str2 + ", orderAmount=" + str3 + ", orderDate=" + str4 + ", orderDetailParam=" + orderDetailParam + ")";
    }
}
