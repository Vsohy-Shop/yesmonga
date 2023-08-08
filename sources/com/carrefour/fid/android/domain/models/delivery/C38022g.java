package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.g */
public final class C38022g extends C38017b {

    /* renamed from: e */
    public final int f95840e;
    @C12579k

    /* renamed from: f */
    public final DeliveryCode f95841f;
    @C12579k

    /* renamed from: g */
    public final C38016a f95842g;
    @C12579k

    /* renamed from: h */
    public final C38016a f95843h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38022g(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        super(i, deliveryCode, aVar, aVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        this.f95840e = i;
        this.f95841f = deliveryCode;
        this.f95842g = aVar;
        this.f95843h = aVar2;
    }

    /* renamed from: j */
    public static /* synthetic */ C38022g m156746j(C38022g gVar, int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gVar.f95840e;
        }
        if ((i2 & 2) != 0) {
            deliveryCode = gVar.f95841f;
        }
        if ((i2 & 4) != 0) {
            aVar = gVar.f95842g;
        }
        if ((i2 & 8) != 0) {
            aVar2 = gVar.f95843h;
        }
        return gVar.mo117667i(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public DeliveryCode mo117633a() {
        return this.f95841f;
    }

    @C12579k
    /* renamed from: b */
    public C38016a mo117634b() {
        return this.f95843h;
    }

    @C12579k
    /* renamed from: c */
    public C38016a mo117635c() {
        return this.f95842g;
    }

    /* renamed from: d */
    public int mo117636d() {
        return this.f95840e;
    }

    /* renamed from: e */
    public final int mo117661e() {
        return this.f95840e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38022g)) {
            return false;
        }
        C38022g gVar = (C38022g) obj;
        return this.f95840e == gVar.f95840e && this.f95841f == gVar.f95841f && Intrinsics.areEqual((Object) this.f95842g, (Object) gVar.f95842g) && Intrinsics.areEqual((Object) this.f95843h, (Object) gVar.f95843h);
    }

    @C12579k
    /* renamed from: f */
    public final DeliveryCode mo117663f() {
        return this.f95841f;
    }

    @C12579k
    /* renamed from: g */
    public final C38016a mo117664g() {
        return this.f95842g;
    }

    @C12579k
    /* renamed from: h */
    public final C38016a mo117665h() {
        return this.f95843h;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f95840e) * 31) + this.f95841f.hashCode()) * 31) + this.f95842g.hashCode()) * 31) + this.f95843h.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C38022g mo117667i(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        return new C38022g(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    public String toString() {
        int i = this.f95840e;
        DeliveryCode deliveryCode = this.f95841f;
        C38016a aVar = this.f95842g;
        C38016a aVar2 = this.f95843h;
        return "RelayPointCrf(priceInCents=" + i + ", code=" + deliveryCode + ", minimumDuration=" + aVar + ", maximumDuration=" + aVar2 + ")";
    }
}
