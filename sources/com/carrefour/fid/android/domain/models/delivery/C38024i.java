package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.i */
public final class C38024i extends C38017b {

    /* renamed from: e */
    public final int f95848e;
    @C12579k

    /* renamed from: f */
    public final DeliveryCode f95849f;
    @C12579k

    /* renamed from: g */
    public final C38016a f95850g;
    @C12579k

    /* renamed from: h */
    public final C38016a f95851h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38024i(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        super(i, deliveryCode, aVar, aVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        this.f95848e = i;
        this.f95849f = deliveryCode;
        this.f95850g = aVar;
        this.f95851h = aVar2;
    }

    /* renamed from: j */
    public static /* synthetic */ C38024i m156766j(C38024i iVar, int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iVar.f95848e;
        }
        if ((i2 & 2) != 0) {
            deliveryCode = iVar.f95849f;
        }
        if ((i2 & 4) != 0) {
            aVar = iVar.f95850g;
        }
        if ((i2 & 8) != 0) {
            aVar2 = iVar.f95851h;
        }
        return iVar.mo117683i(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public DeliveryCode mo117633a() {
        return this.f95849f;
    }

    @C12579k
    /* renamed from: b */
    public C38016a mo117634b() {
        return this.f95851h;
    }

    @C12579k
    /* renamed from: c */
    public C38016a mo117635c() {
        return this.f95850g;
    }

    /* renamed from: d */
    public int mo117636d() {
        return this.f95848e;
    }

    /* renamed from: e */
    public final int mo117677e() {
        return this.f95848e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38024i)) {
            return false;
        }
        C38024i iVar = (C38024i) obj;
        return this.f95848e == iVar.f95848e && this.f95849f == iVar.f95849f && Intrinsics.areEqual((Object) this.f95850g, (Object) iVar.f95850g) && Intrinsics.areEqual((Object) this.f95851h, (Object) iVar.f95851h);
    }

    @C12579k
    /* renamed from: f */
    public final DeliveryCode mo117679f() {
        return this.f95849f;
    }

    @C12579k
    /* renamed from: g */
    public final C38016a mo117680g() {
        return this.f95850g;
    }

    @C12579k
    /* renamed from: h */
    public final C38016a mo117681h() {
        return this.f95851h;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f95848e) * 31) + this.f95849f.hashCode()) * 31) + this.f95850g.hashCode()) * 31) + this.f95851h.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C38024i mo117683i(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        return new C38024i(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    public String toString() {
        int i = this.f95848e;
        DeliveryCode deliveryCode = this.f95849f;
        C38016a aVar = this.f95850g;
        C38016a aVar2 = this.f95851h;
        return "StandardDelivery(priceInCents=" + i + ", code=" + deliveryCode + ", minimumDuration=" + aVar + ", maximumDuration=" + aVar2 + ")";
    }
}
