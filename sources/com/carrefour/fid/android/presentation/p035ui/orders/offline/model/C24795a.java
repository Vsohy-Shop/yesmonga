package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.a */
public final class C24795a implements C24798d {

    /* renamed from: f */
    public static final int f61495f = 0;

    /* renamed from: a */
    public final int f61496a;
    @C12579k

    /* renamed from: b */
    public final String f61497b;

    /* renamed from: c */
    public final double f61498c;
    @C12579k

    /* renamed from: d */
    public final String f61499d;

    /* renamed from: e */
    public final boolean f61500e;

    public C24795a(int i, @C12579k String str, double d, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "amountBeforeDiscount");
        Intrinsics.checkNotNullParameter(str2, "orderAmount");
        this.f61496a = i;
        this.f61497b = str;
        this.f61498c = d;
        this.f61499d = str2;
        this.f61500e = z;
    }

    /* renamed from: g */
    public static /* synthetic */ C24795a m108033g(C24795a aVar, int i, String str, double d, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f61496a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f61497b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            d = aVar.f61498c;
        }
        double d2 = d;
        if ((i2 & 8) != 0) {
            str2 = aVar.f61499d;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            z = aVar.f61500e;
        }
        return aVar.mo72385f(i, str3, d2, str4, z);
    }

    /* renamed from: a */
    public final int mo72379a() {
        return this.f61496a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72380b() {
        return this.f61497b;
    }

    /* renamed from: c */
    public final double mo72381c() {
        return this.f61498c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo72382d() {
        return this.f61499d;
    }

    /* renamed from: e */
    public final boolean mo72383e() {
        return this.f61500e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24795a)) {
            return false;
        }
        C24795a aVar = (C24795a) obj;
        return this.f61496a == aVar.f61496a && Intrinsics.areEqual((Object) this.f61497b, (Object) aVar.f61497b) && Double.compare(this.f61498c, aVar.f61498c) == 0 && Intrinsics.areEqual((Object) this.f61499d, (Object) aVar.f61499d) && this.f61500e == aVar.f61500e;
    }

    @C12579k
    /* renamed from: f */
    public final C24795a mo72385f(int i, @C12579k String str, double d, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "amountBeforeDiscount");
        Intrinsics.checkNotNullParameter(str2, "orderAmount");
        return new C24795a(i, str, d, str2, z);
    }

    @C12579k
    /* renamed from: h */
    public final String mo72386h() {
        return this.f61497b;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f61496a) * 31) + this.f61497b.hashCode()) * 31) + Double.hashCode(this.f61498c)) * 31) + this.f61499d.hashCode()) * 31;
        boolean z = this.f61500e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final double mo72388i() {
        return this.f61498c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo72389j() {
        return this.f61499d;
    }

    /* renamed from: k */
    public final boolean mo72390k() {
        return this.f61500e;
    }

    /* renamed from: l */
    public final int mo72391l() {
        return this.f61496a;
    }

    @C12579k
    public String toString() {
        int i = this.f61496a;
        String str = this.f61497b;
        double d = this.f61498c;
        String str2 = this.f61499d;
        boolean z = this.f61500e;
        return "OrdersOfflineDetailsBottomModel(viewType=" + i + ", amountBeforeDiscount=" + str + ", amountImmediateDiscount=" + d + ", orderAmount=" + str2 + ", showPaidBy=" + z + ")";
    }
}
