package com.carrefour.fid.android.domain.models.pickup;

import androidx.autofill.C0861a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.pickup.a */
public final class C38080a {
    @C12579k

    /* renamed from: a */
    public final String f96204a;

    /* renamed from: b */
    public final double f96205b;

    /* renamed from: c */
    public final double f96206c;
    @C12579k

    /* renamed from: d */
    public final List<C38083d> f96207d;
    @C12579k

    /* renamed from: e */
    public final String f96208e;

    /* renamed from: f */
    public final float f96209f;
    @C12579k

    /* renamed from: g */
    public final String f96210g;
    @C12579k

    /* renamed from: h */
    public final String f96211h;
    @C12579k

    /* renamed from: i */
    public final String f96212i;

    /* renamed from: j */
    public final boolean f96213j;

    public C38080a(@C12579k String str, double d, double d2, @C12579k List<C38083d> list, @C12579k String str2, float f, @C12579k String str3, @C12579k String str4, @C12579k String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "openingPattern");
        Intrinsics.checkNotNullParameter(str2, "providerId");
        Intrinsics.checkNotNullParameter(str3, "address1");
        Intrinsics.checkNotNullParameter(str4, "address2");
        Intrinsics.checkNotNullParameter(str5, C0861a.f2707g);
        this.f96204a = str;
        this.f96205b = d;
        this.f96206c = d2;
        this.f96207d = list;
        this.f96208e = str2;
        this.f96209f = f;
        this.f96210g = str3;
        this.f96211h = str4;
        this.f96212i = str5;
        this.f96213j = z;
    }

    /* renamed from: l */
    public static /* synthetic */ C38080a m157222l(C38080a aVar, String str, double d, double d2, List list, String str2, float f, String str3, String str4, String str5, boolean z, int i, Object obj) {
        C38080a aVar2 = aVar;
        int i2 = i;
        return aVar.mo118284k((i2 & 1) != 0 ? aVar2.f96204a : str, (i2 & 2) != 0 ? aVar2.f96205b : d, (i2 & 4) != 0 ? aVar2.f96206c : d2, (i2 & 8) != 0 ? aVar2.f96207d : list, (i2 & 16) != 0 ? aVar2.f96208e : str2, (i2 & 32) != 0 ? aVar2.f96209f : f, (i2 & 64) != 0 ? aVar2.f96210g : str3, (i2 & 128) != 0 ? aVar2.f96211h : str4, (i2 & 256) != 0 ? aVar2.f96212i : str5, (i2 & 512) != 0 ? aVar2.f96213j : z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo118272a() {
        return this.f96204a;
    }

    /* renamed from: b */
    public final boolean mo118273b() {
        return this.f96213j;
    }

    /* renamed from: c */
    public final double mo118274c() {
        return this.f96205b;
    }

    /* renamed from: d */
    public final double mo118275d() {
        return this.f96206c;
    }

    @C12579k
    /* renamed from: e */
    public final List<C38083d> mo118276e() {
        return this.f96207d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38080a)) {
            return false;
        }
        C38080a aVar = (C38080a) obj;
        return Intrinsics.areEqual((Object) this.f96204a, (Object) aVar.f96204a) && Double.compare(this.f96205b, aVar.f96205b) == 0 && Double.compare(this.f96206c, aVar.f96206c) == 0 && Intrinsics.areEqual((Object) this.f96207d, (Object) aVar.f96207d) && Intrinsics.areEqual((Object) this.f96208e, (Object) aVar.f96208e) && Float.compare(this.f96209f, aVar.f96209f) == 0 && Intrinsics.areEqual((Object) this.f96210g, (Object) aVar.f96210g) && Intrinsics.areEqual((Object) this.f96211h, (Object) aVar.f96211h) && Intrinsics.areEqual((Object) this.f96212i, (Object) aVar.f96212i) && this.f96213j == aVar.f96213j;
    }

    @C12579k
    /* renamed from: f */
    public final String mo118278f() {
        return this.f96208e;
    }

    /* renamed from: g */
    public final float mo118279g() {
        return this.f96209f;
    }

    @C12579k
    /* renamed from: h */
    public final String mo118280h() {
        return this.f96210g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f96204a.hashCode() * 31) + Double.hashCode(this.f96205b)) * 31) + Double.hashCode(this.f96206c)) * 31) + this.f96207d.hashCode()) * 31) + this.f96208e.hashCode()) * 31) + Float.hashCode(this.f96209f)) * 31) + this.f96210g.hashCode()) * 31) + this.f96211h.hashCode()) * 31) + this.f96212i.hashCode()) * 31;
        boolean z = this.f96213j;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final String mo118282i() {
        return this.f96211h;
    }

    @C12579k
    /* renamed from: j */
    public final String mo118283j() {
        return this.f96212i;
    }

    @C12579k
    /* renamed from: k */
    public final C38080a mo118284k(@C12579k String str, double d, double d2, @C12579k List<C38083d> list, @C12579k String str2, float f, @C12579k String str3, @C12579k String str4, @C12579k String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        List<C38083d> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "openingPattern");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, "providerId");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "address1");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "address2");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, C0861a.f2707g);
        return new C38080a(str, d, d2, list2, str6, f, str7, str8, str9, z);
    }

    @C12579k
    /* renamed from: m */
    public final String mo118285m() {
        return this.f96210g;
    }

    @C12579k
    /* renamed from: n */
    public final String mo118286n() {
        return this.f96211h;
    }

    /* renamed from: o */
    public final float mo118287o() {
        return this.f96209f;
    }

    /* renamed from: p */
    public final double mo118288p() {
        return this.f96205b;
    }

    /* renamed from: q */
    public final double mo118289q() {
        return this.f96206c;
    }

    @C12579k
    /* renamed from: r */
    public final String mo118290r() {
        return this.f96204a;
    }

    @C12579k
    /* renamed from: s */
    public final List<C38083d> mo118291s() {
        return this.f96207d;
    }

    @C12579k
    /* renamed from: t */
    public final String mo118292t() {
        return this.f96212i;
    }

    @C12579k
    public String toString() {
        String str = this.f96204a;
        double d = this.f96205b;
        double d2 = this.f96206c;
        List<C38083d> list = this.f96207d;
        String str2 = this.f96208e;
        float f = this.f96209f;
        String str3 = this.f96210g;
        String str4 = this.f96211h;
        String str5 = this.f96212i;
        boolean z = this.f96213j;
        return "PickupPoint(name=" + str + ", latitude=" + d + ", longitude=" + d2 + ", openingPattern=" + list + ", providerId=" + str2 + ", distance=" + f + ", address1=" + str3 + ", address2=" + str4 + ", postalCode=" + str5 + ", isCarrefour=" + z + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo118294u() {
        return this.f96208e;
    }

    /* renamed from: v */
    public final boolean mo118295v() {
        return this.f96213j;
    }
}
