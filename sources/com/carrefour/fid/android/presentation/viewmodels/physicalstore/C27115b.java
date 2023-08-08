package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.b */
public final class C27115b {

    /* renamed from: e */
    public static final int f65945e = 0;
    @C12579k

    /* renamed from: a */
    public final C26501g f65946a;
    @C12579k

    /* renamed from: b */
    public final C26497f f65947b;
    @C12579k

    /* renamed from: c */
    public final C26487c f65948c;
    @C12579k

    /* renamed from: d */
    public final C26505h f65949d;

    public C27115b() {
        this((C26501g) null, (C26497f) null, (C26487c) null, (C26505h) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C27115b m114624f(C27115b bVar, C26501g gVar, C26497f fVar, C26487c cVar, C26505h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = bVar.f65946a;
        }
        if ((i & 2) != 0) {
            fVar = bVar.f65947b;
        }
        if ((i & 4) != 0) {
            cVar = bVar.f65948c;
        }
        if ((i & 8) != 0) {
            hVar = bVar.f65949d;
        }
        return bVar.mo78835e(gVar, fVar, cVar, hVar);
    }

    @C12579k
    /* renamed from: a */
    public final C26501g mo78831a() {
        return this.f65946a;
    }

    @C12579k
    /* renamed from: b */
    public final C26497f mo78832b() {
        return this.f65947b;
    }

    @C12579k
    /* renamed from: c */
    public final C26487c mo78833c() {
        return this.f65948c;
    }

    @C12579k
    /* renamed from: d */
    public final C26505h mo78834d() {
        return this.f65949d;
    }

    @C12579k
    /* renamed from: e */
    public final C27115b mo78835e(@C12579k C26501g gVar, @C12579k C26497f fVar, @C12579k C26487c cVar, @C12579k C26505h hVar) {
        Intrinsics.checkNotNullParameter(gVar, "loyaltyCardState");
        Intrinsics.checkNotNullParameter(fVar, "loyaltyBalanceState");
        Intrinsics.checkNotNullParameter(cVar, "couponsInfoState");
        Intrinsics.checkNotNullParameter(hVar, "stickersInfoState");
        return new C27115b(gVar, fVar, cVar, hVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27115b)) {
            return false;
        }
        C27115b bVar = (C27115b) obj;
        return Intrinsics.areEqual((Object) this.f65946a, (Object) bVar.f65946a) && Intrinsics.areEqual((Object) this.f65947b, (Object) bVar.f65947b) && Intrinsics.areEqual((Object) this.f65948c, (Object) bVar.f65948c) && Intrinsics.areEqual((Object) this.f65949d, (Object) bVar.f65949d);
    }

    @C12579k
    /* renamed from: g */
    public final C26487c mo78837g() {
        return this.f65948c;
    }

    @C12579k
    /* renamed from: h */
    public final C26497f mo78838h() {
        return this.f65947b;
    }

    public int hashCode() {
        return (((((this.f65946a.hashCode() * 31) + this.f65947b.hashCode()) * 31) + this.f65948c.hashCode()) * 31) + this.f65949d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C26501g mo78840i() {
        return this.f65946a;
    }

    @C12579k
    /* renamed from: j */
    public final C26505h mo78841j() {
        return this.f65949d;
    }

    @C12579k
    public String toString() {
        C26501g gVar = this.f65946a;
        C26497f fVar = this.f65947b;
        C26487c cVar = this.f65948c;
        C26505h hVar = this.f65949d;
        return "PhysicalStoreLoyaltyState(loyaltyCardState=" + gVar + ", loyaltyBalanceState=" + fVar + ", couponsInfoState=" + cVar + ", stickersInfoState=" + hVar + ")";
    }

    public C27115b(@C12579k C26501g gVar, @C12579k C26497f fVar, @C12579k C26487c cVar, @C12579k C26505h hVar) {
        Intrinsics.checkNotNullParameter(gVar, "loyaltyCardState");
        Intrinsics.checkNotNullParameter(fVar, "loyaltyBalanceState");
        Intrinsics.checkNotNullParameter(cVar, "couponsInfoState");
        Intrinsics.checkNotNullParameter(hVar, "stickersInfoState");
        this.f65946a = gVar;
        this.f65947b = fVar;
        this.f65948c = cVar;
        this.f65949d = hVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27115b(C26501g gVar, C26497f fVar, C26487c cVar, C26505h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C26501g.C26503b.f64775a : gVar, (i & 2) != 0 ? C26497f.C26500c.f64771a : fVar, (i & 4) != 0 ? C26487c.C26490c.f64756a : cVar, (i & 8) != 0 ? C26505h.C26508c.f64785a : hVar);
    }
}
