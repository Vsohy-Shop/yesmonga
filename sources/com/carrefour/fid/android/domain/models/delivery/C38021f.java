package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.f */
public final class C38021f extends C38017b {

    /* renamed from: e */
    public final int f95836e;
    @C12579k

    /* renamed from: f */
    public final DeliveryCode f95837f;
    @C12579k

    /* renamed from: g */
    public final C38016a f95838g;
    @C12579k

    /* renamed from: h */
    public final C38016a f95839h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38021f(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        super(i, deliveryCode, aVar, aVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        this.f95836e = i;
        this.f95837f = deliveryCode;
        this.f95838g = aVar;
        this.f95839h = aVar2;
    }

    /* renamed from: j */
    public static /* synthetic */ C38021f m156736j(C38021f fVar, int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fVar.f95836e;
        }
        if ((i2 & 2) != 0) {
            deliveryCode = fVar.f95837f;
        }
        if ((i2 & 4) != 0) {
            aVar = fVar.f95838g;
        }
        if ((i2 & 8) != 0) {
            aVar2 = fVar.f95839h;
        }
        return fVar.mo117659i(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public DeliveryCode mo117633a() {
        return this.f95837f;
    }

    @C12579k
    /* renamed from: b */
    public C38016a mo117634b() {
        return this.f95839h;
    }

    @C12579k
    /* renamed from: c */
    public C38016a mo117635c() {
        return this.f95838g;
    }

    /* renamed from: d */
    public int mo117636d() {
        return this.f95836e;
    }

    /* renamed from: e */
    public final int mo117653e() {
        return this.f95836e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38021f)) {
            return false;
        }
        C38021f fVar = (C38021f) obj;
        return this.f95836e == fVar.f95836e && this.f95837f == fVar.f95837f && Intrinsics.areEqual((Object) this.f95838g, (Object) fVar.f95838g) && Intrinsics.areEqual((Object) this.f95839h, (Object) fVar.f95839h);
    }

    @C12579k
    /* renamed from: f */
    public final DeliveryCode mo117655f() {
        return this.f95837f;
    }

    @C12579k
    /* renamed from: g */
    public final C38016a mo117656g() {
        return this.f95838g;
    }

    @C12579k
    /* renamed from: h */
    public final C38016a mo117657h() {
        return this.f95839h;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f95836e) * 31) + this.f95837f.hashCode()) * 31) + this.f95838g.hashCode()) * 31) + this.f95839h.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C38021f mo117659i(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        return new C38021f(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    public String toString() {
        int i = this.f95836e;
        DeliveryCode deliveryCode = this.f95837f;
        C38016a aVar = this.f95838g;
        C38016a aVar2 = this.f95839h;
        return "NonAlExpress(priceInCents=" + i + ", code=" + deliveryCode + ", minimumDuration=" + aVar + ", maximumDuration=" + aVar2 + ")";
    }
}
