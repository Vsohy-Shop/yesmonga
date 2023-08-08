package com.carrefour.fid.android.domain.models.account;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.account.a */
public final class C37947a {
    @C12579k

    /* renamed from: a */
    public final Address f95436a;
    @C12579k

    /* renamed from: b */
    public final String f95437b;

    public /* synthetic */ C37947a(Address address, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, str);
    }

    /* renamed from: d */
    public static /* synthetic */ C37947a m155941d(C37947a aVar, Address address, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            address = aVar.f95436a;
        }
        if ((i & 2) != 0) {
            str = aVar.f95437b;
        }
        return aVar.mo116773c(address, str);
    }

    @C12579k
    /* renamed from: a */
    public final Address mo116771a() {
        return this.f95436a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116772b() {
        return this.f95437b;
    }

    @C12579k
    /* renamed from: c */
    public final C37947a mo116773c(@C12579k Address address, @C12579k String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(str, "telephone");
        return new C37947a(address, str, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public final Address mo116774e() {
        return this.f95436a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37947a)) {
            return false;
        }
        C37947a aVar = (C37947a) obj;
        return Intrinsics.areEqual((Object) this.f95436a, (Object) aVar.f95436a) && C37948b.m155950d(this.f95437b, aVar.f95437b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo116776f() {
        return this.f95437b;
    }

    public int hashCode() {
        return (this.f95436a.hashCode() * 31) + C37948b.m155951f(this.f95437b);
    }

    @C12579k
    public String toString() {
        Address address = this.f95436a;
        String g = C37948b.m155952g(this.f95437b);
        return "AddressTunnelData(address=" + address + ", telephone=" + g + ")";
    }

    public C37947a(Address address, String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(str, "telephone");
        this.f95436a = address;
        this.f95437b = str;
    }
}
