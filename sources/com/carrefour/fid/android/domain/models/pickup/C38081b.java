package com.carrefour.fid.android.domain.models.pickup;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.pickup.b */
public final class C38081b {
    @C12579k

    /* renamed from: a */
    public final List<C38080a> f96214a;

    /* renamed from: b */
    public final boolean f96215b;

    public C38081b(@C12579k List<C38080a> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "pickupPointList");
        this.f96214a = list;
        this.f96215b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ C38081b m157244d(C38081b bVar, List<C38080a> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bVar.f96214a;
        }
        if ((i & 2) != 0) {
            z = bVar.f96215b;
        }
        return bVar.mo118298c(list, z);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38080a> mo118296a() {
        return this.f96214a;
    }

    /* renamed from: b */
    public final boolean mo118297b() {
        return this.f96215b;
    }

    @C12579k
    /* renamed from: c */
    public final C38081b mo118298c(@C12579k List<C38080a> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "pickupPointList");
        return new C38081b(list, z);
    }

    /* renamed from: e */
    public final boolean mo118299e() {
        return this.f96215b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38081b)) {
            return false;
        }
        C38081b bVar = (C38081b) obj;
        return Intrinsics.areEqual((Object) this.f96214a, (Object) bVar.f96214a) && this.f96215b == bVar.f96215b;
    }

    @C12579k
    /* renamed from: f */
    public final List<C38080a> mo118301f() {
        return this.f96214a;
    }

    public int hashCode() {
        int hashCode = this.f96214a.hashCode() * 31;
        boolean z = this.f96215b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        List<C38080a> list = this.f96214a;
        boolean z = this.f96215b;
        return "PickupPoints(pickupPointList=" + list + ", navigateToPickups=" + z + ")";
    }
}
