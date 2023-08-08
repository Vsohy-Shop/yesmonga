package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.d */
public final class C38019d extends C38017b {

    /* renamed from: e */
    public final int f95830e;
    @C12579k

    /* renamed from: f */
    public final DeliveryCode f95831f;
    @C12579k

    /* renamed from: g */
    public final C38016a f95832g;
    @C12579k

    /* renamed from: h */
    public final C38016a f95833h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38019d(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        super(i, deliveryCode, aVar, aVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        this.f95830e = i;
        this.f95831f = deliveryCode;
        this.f95832g = aVar;
        this.f95833h = aVar2;
    }

    /* renamed from: j */
    public static /* synthetic */ C38019d m156720j(C38019d dVar, int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dVar.f95830e;
        }
        if ((i2 & 2) != 0) {
            deliveryCode = dVar.f95831f;
        }
        if ((i2 & 4) != 0) {
            aVar = dVar.f95832g;
        }
        if ((i2 & 8) != 0) {
            aVar2 = dVar.f95833h;
        }
        return dVar.mo117643i(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public DeliveryCode mo117633a() {
        return this.f95831f;
    }

    @C12579k
    /* renamed from: b */
    public C38016a mo117634b() {
        return this.f95833h;
    }

    @C12579k
    /* renamed from: c */
    public C38016a mo117635c() {
        return this.f95832g;
    }

    /* renamed from: d */
    public int mo117636d() {
        return this.f95830e;
    }

    /* renamed from: e */
    public final int mo117637e() {
        return this.f95830e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38019d)) {
            return false;
        }
        C38019d dVar = (C38019d) obj;
        return this.f95830e == dVar.f95830e && this.f95831f == dVar.f95831f && Intrinsics.areEqual((Object) this.f95832g, (Object) dVar.f95832g) && Intrinsics.areEqual((Object) this.f95833h, (Object) dVar.f95833h);
    }

    @C12579k
    /* renamed from: f */
    public final DeliveryCode mo117639f() {
        return this.f95831f;
    }

    @C12579k
    /* renamed from: g */
    public final C38016a mo117640g() {
        return this.f95832g;
    }

    @C12579k
    /* renamed from: h */
    public final C38016a mo117641h() {
        return this.f95833h;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f95830e) * 31) + this.f95831f.hashCode()) * 31) + this.f95832g.hashCode()) * 31) + this.f95833h.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C38019d mo117643i(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        return new C38019d(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    public String toString() {
        int i = this.f95830e;
        DeliveryCode deliveryCode = this.f95831f;
        C38016a aVar = this.f95832g;
        C38016a aVar2 = this.f95833h;
        return "EcoDelivery(priceInCents=" + i + ", code=" + deliveryCode + ", minimumDuration=" + aVar + ", maximumDuration=" + aVar2 + ")";
    }
}
