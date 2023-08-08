package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.e */
public final class C24799e implements C24798d {

    /* renamed from: e */
    public static final int f61512e = 8;

    /* renamed from: a */
    public final int f61513a;
    @C12579k

    /* renamed from: b */
    public final String f61514b;
    @C12579k

    /* renamed from: c */
    public final String f61515c;

    /* renamed from: d */
    public double f61516d;

    public C24799e(int i, @C12579k String str, @C12579k String str2, double d) {
        Intrinsics.checkNotNullParameter(str, "paymentCode");
        Intrinsics.checkNotNullParameter(str2, "paymentName");
        this.f61513a = i;
        this.f61514b = str;
        this.f61515c = str2;
        this.f61516d = d;
    }

    /* renamed from: f */
    public static /* synthetic */ C24799e m108067f(C24799e eVar, int i, String str, String str2, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eVar.f61513a;
        }
        if ((i2 & 2) != 0) {
            str = eVar.f61514b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = eVar.f61515c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            d = eVar.f61516d;
        }
        return eVar.mo72423e(i, str3, str4, d);
    }

    /* renamed from: a */
    public final int mo72419a() {
        return this.f61513a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72420b() {
        return this.f61514b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo72421c() {
        return this.f61515c;
    }

    /* renamed from: d */
    public final double mo72422d() {
        return this.f61516d;
    }

    @C12579k
    /* renamed from: e */
    public final C24799e mo72423e(int i, @C12579k String str, @C12579k String str2, double d) {
        Intrinsics.checkNotNullParameter(str, "paymentCode");
        Intrinsics.checkNotNullParameter(str2, "paymentName");
        return new C24799e(i, str, str2, d);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24799e)) {
            return false;
        }
        C24799e eVar = (C24799e) obj;
        return this.f61513a == eVar.f61513a && Intrinsics.areEqual((Object) this.f61514b, (Object) eVar.f61514b) && Intrinsics.areEqual((Object) this.f61515c, (Object) eVar.f61515c) && Double.compare(this.f61516d, eVar.f61516d) == 0;
    }

    /* renamed from: g */
    public final double mo72425g() {
        return this.f61516d;
    }

    @C12579k
    /* renamed from: h */
    public final String mo72426h() {
        return this.f61514b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f61513a) * 31) + this.f61514b.hashCode()) * 31) + this.f61515c.hashCode()) * 31) + Double.hashCode(this.f61516d);
    }

    @C12579k
    /* renamed from: i */
    public final String mo72428i() {
        return this.f61515c;
    }

    /* renamed from: j */
    public final int mo72429j() {
        return this.f61513a;
    }

    /* renamed from: k */
    public final void mo72430k(double d) {
        this.f61516d = d;
    }

    @C12579k
    public String toString() {
        int i = this.f61513a;
        String str = this.f61514b;
        String str2 = this.f61515c;
        double d = this.f61516d;
        return "OrdersOfflineDetailsPaymentModel(viewType=" + i + ", paymentCode=" + str + ", paymentName=" + str2 + ", paymentAmount=" + d + ")";
    }
}
