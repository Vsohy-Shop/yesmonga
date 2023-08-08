package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import com.usabilla.sdk.ubform.eventengine.decorators.PercentageDecorator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.h */
public final class C24802h {

    /* renamed from: d */
    public static final int f61529d = 0;
    @C12579k

    /* renamed from: a */
    public final String f61530a;

    /* renamed from: b */
    public final double f61531b;
    @C12580l

    /* renamed from: c */
    public final Double f61532c;

    public C24802h(@C12579k String str, double d, @C12580l Double d2) {
        Intrinsics.checkNotNullParameter(str, PercentageDecorator.f26902e);
        this.f61530a = str;
        this.f61531b = d;
        this.f61532c = d2;
    }

    /* renamed from: e */
    public static /* synthetic */ C24802h m108105e(C24802h hVar, String str, double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.f61530a;
        }
        if ((i & 2) != 0) {
            d = hVar.f61531b;
        }
        if ((i & 4) != 0) {
            d2 = hVar.f61532c;
        }
        return hVar.mo72466d(str, d, d2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo72463a() {
        return this.f61530a;
    }

    /* renamed from: b */
    public final double mo72464b() {
        return this.f61531b;
    }

    @C12580l
    /* renamed from: c */
    public final Double mo72465c() {
        return this.f61532c;
    }

    @C12579k
    /* renamed from: d */
    public final C24802h mo72466d(@C12579k String str, double d, @C12580l Double d2) {
        Intrinsics.checkNotNullParameter(str, PercentageDecorator.f26902e);
        return new C24802h(str, d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24802h)) {
            return false;
        }
        C24802h hVar = (C24802h) obj;
        return Intrinsics.areEqual((Object) this.f61530a, (Object) hVar.f61530a) && Double.compare(this.f61531b, hVar.f61531b) == 0 && Intrinsics.areEqual((Object) this.f61532c, (Object) hVar.f61532c);
    }

    /* renamed from: f */
    public final double mo72468f() {
        return this.f61531b;
    }

    @C12580l
    /* renamed from: g */
    public final Double mo72469g() {
        return this.f61532c;
    }

    @C12579k
    /* renamed from: h */
    public final String mo72470h() {
        return this.f61530a;
    }

    public int hashCode() {
        int hashCode = ((this.f61530a.hashCode() * 31) + Double.hashCode(this.f61531b)) * 31;
        Double d = this.f61532c;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f61530a;
        double d = this.f61531b;
        Double d2 = this.f61532c;
        return "OrdersOfflineDetailsVATModel(percentage=" + str + ", amount=" + d + ", amountWithTax=" + d2 + ")";
    }
}
