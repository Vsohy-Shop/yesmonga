package com.carrefour.fid.android.domain.models.loyalty;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.loyalty.a */
public final class C38044a {
    @C12579k

    /* renamed from: a */
    public final String f95917a;

    /* renamed from: b */
    public final boolean f95918b;
    @C12579k

    /* renamed from: c */
    public final String f95919c;

    public C38044a(@C12579k String str, boolean z, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "cardFidNumber");
        Intrinsics.checkNotNullParameter(str2, "cardFidBalance");
        this.f95917a = str;
        this.f95918b = z;
        this.f95919c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ C38044a m156896e(C38044a aVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f95917a;
        }
        if ((i & 2) != 0) {
            z = aVar.f95918b;
        }
        if ((i & 4) != 0) {
            str2 = aVar.f95919c;
        }
        return aVar.mo117860d(str, z, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117857a() {
        return this.f95917a;
    }

    /* renamed from: b */
    public final boolean mo117858b() {
        return this.f95918b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117859c() {
        return this.f95919c;
    }

    @C12579k
    /* renamed from: d */
    public final C38044a mo117860d(@C12579k String str, boolean z, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "cardFidNumber");
        Intrinsics.checkNotNullParameter(str2, "cardFidBalance");
        return new C38044a(str, z, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38044a)) {
            return false;
        }
        C38044a aVar = (C38044a) obj;
        return Intrinsics.areEqual((Object) this.f95917a, (Object) aVar.f95917a) && this.f95918b == aVar.f95918b && Intrinsics.areEqual((Object) this.f95919c, (Object) aVar.f95919c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117862f() {
        return this.f95919c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117863g() {
        return this.f95917a;
    }

    /* renamed from: h */
    public final boolean mo117864h() {
        return this.f95918b;
    }

    public int hashCode() {
        int hashCode = this.f95917a.hashCode() * 31;
        boolean z = this.f95918b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f95919c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95917a;
        boolean z = this.f95918b;
        String str2 = this.f95919c;
        return "FidelityCardAndBalance(cardFidNumber=" + str + ", hasCardFid=" + z + ", cardFidBalance=" + str2 + ")";
    }
}
