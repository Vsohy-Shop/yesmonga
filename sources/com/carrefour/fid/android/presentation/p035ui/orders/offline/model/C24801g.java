package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.g */
public final class C24801g implements C24798d {

    /* renamed from: d */
    public static final int f61525d = 8;
    @C12579k

    /* renamed from: a */
    public final List<C24802h> f61526a;

    /* renamed from: b */
    public final double f61527b;

    /* renamed from: c */
    public final double f61528c;

    public C24801g(@C12579k List<C24802h> list, double d, double d2) {
        Intrinsics.checkNotNullParameter(list, "vatList");
        this.f61526a = list;
        this.f61527b = d;
        this.f61528c = d2;
    }

    /* renamed from: e */
    public static /* synthetic */ C24801g m108097e(C24801g gVar, List<C24802h> list, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gVar.f61526a;
        }
        if ((i & 2) != 0) {
            d = gVar.f61527b;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = gVar.f61528c;
        }
        return gVar.mo72456d(list, d3, d2);
    }

    @C12579k
    /* renamed from: a */
    public final List<C24802h> mo72453a() {
        return this.f61526a;
    }

    /* renamed from: b */
    public final double mo72454b() {
        return this.f61527b;
    }

    /* renamed from: c */
    public final double mo72455c() {
        return this.f61528c;
    }

    @C12579k
    /* renamed from: d */
    public final C24801g mo72456d(@C12579k List<C24802h> list, double d, double d2) {
        Intrinsics.checkNotNullParameter(list, "vatList");
        return new C24801g(list, d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24801g)) {
            return false;
        }
        C24801g gVar = (C24801g) obj;
        return Intrinsics.areEqual((Object) this.f61526a, (Object) gVar.f61526a) && Double.compare(this.f61527b, gVar.f61527b) == 0 && Double.compare(this.f61528c, gVar.f61528c) == 0;
    }

    /* renamed from: f */
    public final double mo72458f() {
        return this.f61528c;
    }

    /* renamed from: g */
    public final double mo72459g() {
        return this.f61527b;
    }

    @C12579k
    /* renamed from: h */
    public final List<C24802h> mo72460h() {
        return this.f61526a;
    }

    public int hashCode() {
        return (((this.f61526a.hashCode() * 31) + Double.hashCode(this.f61527b)) * 31) + Double.hashCode(this.f61528c);
    }

    @C12579k
    public String toString() {
        List<C24802h> list = this.f61526a;
        double d = this.f61527b;
        double d2 = this.f61528c;
        return "OrdersOfflineDetailsVATListModel(vatList=" + list + ", totalAmount=" + d + ", orderTotalAmount=" + d2 + ")";
    }
}
