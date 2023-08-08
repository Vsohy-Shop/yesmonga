package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.h */
public final class C38023h extends C38017b {

    /* renamed from: e */
    public final int f95844e;
    @C12579k

    /* renamed from: f */
    public final DeliveryCode f95845f;
    @C12579k

    /* renamed from: g */
    public final C38016a f95846g;
    @C12579k

    /* renamed from: h */
    public final C38016a f95847h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38023h(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        super(i, deliveryCode, aVar, aVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        this.f95844e = i;
        this.f95845f = deliveryCode;
        this.f95846g = aVar;
        this.f95847h = aVar2;
    }

    /* renamed from: j */
    public static /* synthetic */ C38023h m156756j(C38023h hVar, int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hVar.f95844e;
        }
        if ((i2 & 2) != 0) {
            deliveryCode = hVar.f95845f;
        }
        if ((i2 & 4) != 0) {
            aVar = hVar.f95846g;
        }
        if ((i2 & 8) != 0) {
            aVar2 = hVar.f95847h;
        }
        return hVar.mo117675i(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public DeliveryCode mo117633a() {
        return this.f95845f;
    }

    @C12579k
    /* renamed from: b */
    public C38016a mo117634b() {
        return this.f95847h;
    }

    @C12579k
    /* renamed from: c */
    public C38016a mo117635c() {
        return this.f95846g;
    }

    /* renamed from: d */
    public int mo117636d() {
        return this.f95844e;
    }

    /* renamed from: e */
    public final int mo117669e() {
        return this.f95844e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38023h)) {
            return false;
        }
        C38023h hVar = (C38023h) obj;
        return this.f95844e == hVar.f95844e && this.f95845f == hVar.f95845f && Intrinsics.areEqual((Object) this.f95846g, (Object) hVar.f95846g) && Intrinsics.areEqual((Object) this.f95847h, (Object) hVar.f95847h);
    }

    @C12579k
    /* renamed from: f */
    public final DeliveryCode mo117671f() {
        return this.f95845f;
    }

    @C12579k
    /* renamed from: g */
    public final C38016a mo117672g() {
        return this.f95846g;
    }

    @C12579k
    /* renamed from: h */
    public final C38016a mo117673h() {
        return this.f95847h;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f95844e) * 31) + this.f95845f.hashCode()) * 31) + this.f95846g.hashCode()) * 31) + this.f95847h.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C38023h mo117675i(int i, @C12579k DeliveryCode deliveryCode, @C12579k C38016a aVar, @C12579k C38016a aVar2) {
        Intrinsics.checkNotNullParameter(deliveryCode, "code");
        Intrinsics.checkNotNullParameter(aVar, "minimumDuration");
        Intrinsics.checkNotNullParameter(aVar2, "maximumDuration");
        return new C38023h(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    public String toString() {
        int i = this.f95844e;
        DeliveryCode deliveryCode = this.f95845f;
        C38016a aVar = this.f95846g;
        C38016a aVar2 = this.f95847h;
        return "RelayPointExternal(priceInCents=" + i + ", code=" + deliveryCode + ", minimumDuration=" + aVar + ", maximumDuration=" + aVar2 + ")";
    }
}
