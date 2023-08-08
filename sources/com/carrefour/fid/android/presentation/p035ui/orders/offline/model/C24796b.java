package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.b */
public final class C24796b implements C24798d {

    /* renamed from: d */
    public static final int f61501d = 0;

    /* renamed from: a */
    public final int f61502a;
    @C12579k

    /* renamed from: b */
    public final String f61503b;

    /* renamed from: c */
    public final double f61504c;

    public C24796b(int i, @C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        this.f61502a = i;
        this.f61503b = str;
        this.f61504c = d;
    }

    /* renamed from: e */
    public static /* synthetic */ C24796b m108045e(C24796b bVar, int i, String str, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f61502a;
        }
        if ((i2 & 2) != 0) {
            str = bVar.f61503b;
        }
        if ((i2 & 4) != 0) {
            d = bVar.f61504c;
        }
        return bVar.mo72396d(i, str, d);
    }

    /* renamed from: a */
    public final int mo72393a() {
        return this.f61502a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72394b() {
        return this.f61503b;
    }

    /* renamed from: c */
    public final double mo72395c() {
        return this.f61504c;
    }

    @C12579k
    /* renamed from: d */
    public final C24796b mo72396d(int i, @C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        return new C24796b(i, str, d);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24796b)) {
            return false;
        }
        C24796b bVar = (C24796b) obj;
        return this.f61502a == bVar.f61502a && Intrinsics.areEqual((Object) this.f61503b, (Object) bVar.f61503b) && Double.compare(this.f61504c, bVar.f61504c) == 0;
    }

    /* renamed from: f */
    public final double mo72398f() {
        return this.f61504c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo72399g() {
        return this.f61503b;
    }

    /* renamed from: h */
    public final int mo72400h() {
        return this.f61502a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f61502a) * 31) + this.f61503b.hashCode()) * 31) + Double.hashCode(this.f61504c);
    }

    @C12579k
    public String toString() {
        int i = this.f61502a;
        String str = this.f61503b;
        double d = this.f61504c;
        return "OrdersOfflineDetailsFidelityCardModel(viewType=" + i + ", loyaltyCardNumber=" + str + ", amountRewardedOnLoyalty=" + d + ")";
    }
}
