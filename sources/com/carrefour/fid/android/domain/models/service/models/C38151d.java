package com.carrefour.fid.android.domain.models.service.models;

import com.urbanairship.util.C9650g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.service.models.d */
public final class C38151d {
    @C12579k

    /* renamed from: a */
    public final String f96631a;
    @C12580l

    /* renamed from: b */
    public final String f96632b;
    @C12579k

    /* renamed from: c */
    public final String f96633c;

    public C38151d(@C12579k String str, @C12580l String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
        this.f96631a = str;
        this.f96632b = str2;
        this.f96633c = str3;
    }

    /* renamed from: e */
    public static /* synthetic */ C38151d m158088e(C38151d dVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f96631a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.f96632b;
        }
        if ((i & 4) != 0) {
            str3 = dVar.f96633c;
        }
        return dVar.mo119265d(str, str2, str3);
    }

    @C12579k
    /* renamed from: a */
    public final String mo119262a() {
        return this.f96631a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo119263b() {
        return this.f96632b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo119264c() {
        return this.f96633c;
    }

    @C12579k
    /* renamed from: d */
    public final C38151d mo119265d(@C12579k String str, @C12580l String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
        return new C38151d(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38151d)) {
            return false;
        }
        C38151d dVar = (C38151d) obj;
        return Intrinsics.areEqual((Object) this.f96631a, (Object) dVar.f96631a) && Intrinsics.areEqual((Object) this.f96632b, (Object) dVar.f96632b) && Intrinsics.areEqual((Object) this.f96633c, (Object) dVar.f96633c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo119267f() {
        return this.f96633c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo119268g() {
        return this.f96631a;
    }

    @C12580l
    /* renamed from: h */
    public final String mo119269h() {
        return this.f96632b;
    }

    public int hashCode() {
        int hashCode = this.f96631a.hashCode() * 31;
        String str = this.f96632b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96633c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f96631a;
        String str2 = this.f96632b;
        String str3 = this.f96633c;
        return "FacilityAddress(streetAddressOne=" + str + ", streetAddressTwo=" + str2 + ", city=" + str3 + ")";
    }
}
