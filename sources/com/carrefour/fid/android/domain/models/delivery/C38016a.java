package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.a */
public final class C38016a {
    @C12579k

    /* renamed from: a */
    public final DeliveryTemporalUnit f95824a;

    /* renamed from: b */
    public final int f95825b;

    public C38016a(@C12579k DeliveryTemporalUnit deliveryTemporalUnit, int i) {
        Intrinsics.checkNotNullParameter(deliveryTemporalUnit, "temporalUnit");
        this.f95824a = deliveryTemporalUnit;
        this.f95825b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C38016a m156709d(C38016a aVar, DeliveryTemporalUnit deliveryTemporalUnit, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deliveryTemporalUnit = aVar.f95824a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.f95825b;
        }
        return aVar.mo117627c(deliveryTemporalUnit, i);
    }

    @C12579k
    /* renamed from: a */
    public final DeliveryTemporalUnit mo117625a() {
        return this.f95824a;
    }

    /* renamed from: b */
    public final int mo117626b() {
        return this.f95825b;
    }

    @C12579k
    /* renamed from: c */
    public final C38016a mo117627c(@C12579k DeliveryTemporalUnit deliveryTemporalUnit, int i) {
        Intrinsics.checkNotNullParameter(deliveryTemporalUnit, "temporalUnit");
        return new C38016a(deliveryTemporalUnit, i);
    }

    @C12579k
    /* renamed from: e */
    public final DeliveryTemporalUnit mo117628e() {
        return this.f95824a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38016a)) {
            return false;
        }
        C38016a aVar = (C38016a) obj;
        return this.f95824a == aVar.f95824a && this.f95825b == aVar.f95825b;
    }

    /* renamed from: f */
    public final int mo117630f() {
        return this.f95825b;
    }

    public int hashCode() {
        return (this.f95824a.hashCode() * 31) + Integer.hashCode(this.f95825b);
    }

    @C12579k
    public String toString() {
        DeliveryTemporalUnit deliveryTemporalUnit = this.f95824a;
        int i = this.f95825b;
        return "DeliveryDuration(temporalUnit=" + deliveryTemporalUnit + ", value=" + i + ")";
    }
}
