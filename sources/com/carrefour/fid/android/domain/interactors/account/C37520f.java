package com.carrefour.fid.android.domain.interactors.account;

import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.account.f */
public final class C37520f {
    @C12579k

    /* renamed from: a */
    public final Address f94253a;
    @C12579k

    /* renamed from: b */
    public final String f94254b;

    public C37520f(@C12579k Address address, @C12579k String str) {
        Intrinsics.checkNotNullParameter(address, "addressModel");
        Intrinsics.checkNotNullParameter(str, "telephone");
        this.f94253a = address;
        this.f94254b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ C37520f m154000d(C37520f fVar, Address address, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            address = fVar.f94253a;
        }
        if ((i & 2) != 0) {
            str = fVar.f94254b;
        }
        return fVar.mo114279c(address, str);
    }

    @C12579k
    /* renamed from: a */
    public final Address mo114277a() {
        return this.f94253a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo114278b() {
        return this.f94254b;
    }

    @C12579k
    /* renamed from: c */
    public final C37520f mo114279c(@C12579k Address address, @C12579k String str) {
        Intrinsics.checkNotNullParameter(address, "addressModel");
        Intrinsics.checkNotNullParameter(str, "telephone");
        return new C37520f(address, str);
    }

    @C12579k
    /* renamed from: e */
    public final Address mo114280e() {
        return this.f94253a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37520f)) {
            return false;
        }
        C37520f fVar = (C37520f) obj;
        return Intrinsics.areEqual((Object) this.f94253a, (Object) fVar.f94253a) && Intrinsics.areEqual((Object) this.f94254b, (Object) fVar.f94254b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo114282f() {
        return this.f94254b;
    }

    public int hashCode() {
        return (this.f94253a.hashCode() * 31) + this.f94254b.hashCode();
    }

    @C12579k
    public String toString() {
        Address address = this.f94253a;
        String str = this.f94254b;
        return "Params(addressModel=" + address + ", telephone=" + str + ")";
    }
}
