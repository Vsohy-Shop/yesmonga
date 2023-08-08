package com.carrefour.fid.android.core.datastore;

import androidx.compose.runtime.internal.C8567o;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.datastore.a */
public final class C36193a {

    /* renamed from: p */
    public static final int f89372p = 8;

    /* renamed from: a */
    public final boolean f89373a;

    /* renamed from: b */
    public final int f89374b;

    /* renamed from: c */
    public final int f89375c;

    /* renamed from: d */
    public final int f89376d;

    /* renamed from: e */
    public final boolean f89377e;

    /* renamed from: f */
    public final int f89378f;

    /* renamed from: g */
    public final long f89379g;

    /* renamed from: h */
    public final boolean f89380h;
    @C12579k

    /* renamed from: i */
    public final Set<String> f89381i;
    @C12579k

    /* renamed from: j */
    public final Set<String> f89382j;
    @C12579k

    /* renamed from: k */
    public final Set<String> f89383k;

    /* renamed from: l */
    public final boolean f89384l;
    @C12579k

    /* renamed from: m */
    public final Set<String> f89385m;

    /* renamed from: n */
    public final long f89386n;

    /* renamed from: o */
    public final boolean f89387o;

    public C36193a(boolean z, int i, int i2, int i3, boolean z2, int i4, long j, boolean z3, @C12579k Set<String> set, @C12579k Set<String> set2, @C12579k Set<String> set3, boolean z4, @C12579k Set<String> set4, long j2, boolean z5) {
        Set<String> set5 = set;
        Set<String> set6 = set2;
        Set<String> set7 = set3;
        Set<String> set8 = set4;
        Intrinsics.checkNotNullParameter(set5, "memosChecked");
        Intrinsics.checkNotNullParameter(set6, "memosUnchecked");
        Intrinsics.checkNotNullParameter(set7, "searchList");
        Intrinsics.checkNotNullParameter(set8, "searchSuggestionsHistory");
        this.f89373a = z;
        this.f89374b = i;
        this.f89375c = i2;
        this.f89376d = i3;
        this.f89377e = z2;
        this.f89378f = i4;
        this.f89379g = j;
        this.f89380h = z3;
        this.f89381i = set5;
        this.f89382j = set6;
        this.f89383k = set7;
        this.f89384l = z4;
        this.f89385m = set8;
        this.f89386n = j2;
        this.f89387o = z5;
    }

    /* renamed from: q */
    public static /* synthetic */ C36193a m148615q(C36193a aVar, boolean z, int i, int i2, int i3, boolean z2, int i4, long j, boolean z3, Set set, Set set2, Set set3, boolean z4, Set set4, long j2, boolean z5, int i5, Object obj) {
        C36193a aVar2 = aVar;
        int i6 = i5;
        return aVar.mo108137p((i6 & 1) != 0 ? aVar2.f89373a : z, (i6 & 2) != 0 ? aVar2.f89374b : i, (i6 & 4) != 0 ? aVar2.f89375c : i2, (i6 & 8) != 0 ? aVar2.f89376d : i3, (i6 & 16) != 0 ? aVar2.f89377e : z2, (i6 & 32) != 0 ? aVar2.f89378f : i4, (i6 & 64) != 0 ? aVar2.f89379g : j, (i6 & 128) != 0 ? aVar2.f89380h : z3, (i6 & 256) != 0 ? aVar2.f89381i : set, (i6 & 512) != 0 ? aVar2.f89382j : set2, (i6 & 1024) != 0 ? aVar2.f89383k : set3, (i6 & 2048) != 0 ? aVar2.f89384l : z4, (i6 & 4096) != 0 ? aVar2.f89385m : set4, (i6 & 8192) != 0 ? aVar2.f89386n : j2, (i6 & 16384) != 0 ? aVar2.f89387o : z5);
    }

    @C12579k
    /* renamed from: A */
    public final Set<String> mo108114A() {
        return this.f89385m;
    }

    /* renamed from: B */
    public final long mo108115B() {
        return this.f89386n;
    }

    /* renamed from: C */
    public final int mo108116C() {
        return this.f89375c;
    }

    /* renamed from: D */
    public final int mo108117D() {
        return this.f89378f;
    }

    /* renamed from: E */
    public final long mo108118E() {
        return this.f89379g;
    }

    /* renamed from: F */
    public final boolean mo108119F() {
        return this.f89377e;
    }

    /* renamed from: a */
    public final boolean mo108120a() {
        return this.f89373a;
    }

    @C12579k
    /* renamed from: b */
    public final Set<String> mo108121b() {
        return this.f89382j;
    }

    @C12579k
    /* renamed from: c */
    public final Set<String> mo108122c() {
        return this.f89383k;
    }

    /* renamed from: d */
    public final boolean mo108123d() {
        return this.f89384l;
    }

    @C12579k
    /* renamed from: e */
    public final Set<String> mo108124e() {
        return this.f89385m;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36193a)) {
            return false;
        }
        C36193a aVar = (C36193a) obj;
        return this.f89373a == aVar.f89373a && this.f89374b == aVar.f89374b && this.f89375c == aVar.f89375c && this.f89376d == aVar.f89376d && this.f89377e == aVar.f89377e && this.f89378f == aVar.f89378f && this.f89379g == aVar.f89379g && this.f89380h == aVar.f89380h && Intrinsics.areEqual((Object) this.f89381i, (Object) aVar.f89381i) && Intrinsics.areEqual((Object) this.f89382j, (Object) aVar.f89382j) && Intrinsics.areEqual((Object) this.f89383k, (Object) aVar.f89383k) && this.f89384l == aVar.f89384l && Intrinsics.areEqual((Object) this.f89385m, (Object) aVar.f89385m) && this.f89386n == aVar.f89386n && this.f89387o == aVar.f89387o;
    }

    /* renamed from: f */
    public final long mo108126f() {
        return this.f89386n;
    }

    /* renamed from: g */
    public final boolean mo108127g() {
        return this.f89387o;
    }

    /* renamed from: h */
    public final int mo108128h() {
        return this.f89374b;
    }

    public int hashCode() {
        boolean z = this.f89373a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((((z ? 1 : 0) * true) + Integer.hashCode(this.f89374b)) * 31) + Integer.hashCode(this.f89375c)) * 31) + Integer.hashCode(this.f89376d)) * 31;
        boolean z3 = this.f89377e;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((((hashCode + (z3 ? 1 : 0)) * 31) + Integer.hashCode(this.f89378f)) * 31) + Long.hashCode(this.f89379g)) * 31;
        boolean z4 = this.f89380h;
        if (z4) {
            z4 = true;
        }
        int hashCode3 = (((((((hashCode2 + (z4 ? 1 : 0)) * 31) + this.f89381i.hashCode()) * 31) + this.f89382j.hashCode()) * 31) + this.f89383k.hashCode()) * 31;
        boolean z5 = this.f89384l;
        if (z5) {
            z5 = true;
        }
        int hashCode4 = (((((hashCode3 + (z5 ? 1 : 0)) * 31) + this.f89385m.hashCode()) * 31) + Long.hashCode(this.f89386n)) * 31;
        boolean z6 = this.f89387o;
        if (!z6) {
            z2 = z6;
        }
        return hashCode4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final int mo108130i() {
        return this.f89375c;
    }

    /* renamed from: j */
    public final int mo108131j() {
        return this.f89376d;
    }

    /* renamed from: k */
    public final boolean mo108132k() {
        return this.f89377e;
    }

    /* renamed from: l */
    public final int mo108133l() {
        return this.f89378f;
    }

    /* renamed from: m */
    public final long mo108134m() {
        return this.f89379g;
    }

    /* renamed from: n */
    public final boolean mo108135n() {
        return this.f89380h;
    }

    @C12579k
    /* renamed from: o */
    public final Set<String> mo108136o() {
        return this.f89381i;
    }

    @C12579k
    /* renamed from: p */
    public final C36193a mo108137p(boolean z, int i, int i2, int i3, boolean z2, int i4, long j, boolean z3, @C12579k Set<String> set, @C12579k Set<String> set2, @C12579k Set<String> set3, boolean z4, @C12579k Set<String> set4, long j2, boolean z5) {
        boolean z6 = z;
        Intrinsics.checkNotNullParameter(set, "memosChecked");
        Intrinsics.checkNotNullParameter(set2, "memosUnchecked");
        Intrinsics.checkNotNullParameter(set3, "searchList");
        Intrinsics.checkNotNullParameter(set4, "searchSuggestionsHistory");
        return new C36193a(z, i, i2, i3, z2, i4, j, z3, set, set2, set3, z4, set4, j2, z5);
    }

    /* renamed from: r */
    public final boolean mo108138r() {
        return this.f89373a;
    }

    /* renamed from: s */
    public final boolean mo108139s() {
        return this.f89380h;
    }

    /* renamed from: t */
    public final boolean mo108140t() {
        return this.f89387o;
    }

    @C12579k
    public String toString() {
        boolean z = this.f89373a;
        int i = this.f89374b;
        int i2 = this.f89375c;
        int i3 = this.f89376d;
        boolean z2 = this.f89377e;
        int i4 = this.f89378f;
        long j = this.f89379g;
        boolean z3 = this.f89380h;
        Set<String> set = this.f89381i;
        Set<String> set2 = this.f89382j;
        Set<String> set3 = this.f89383k;
        boolean z4 = this.f89384l;
        Set<String> set4 = this.f89385m;
        long j2 = this.f89386n;
        boolean z5 = this.f89387o;
        return "AppPreferences(alreadyLaunched=" + z + ", launchCount=" + i + ", sessionCount=" + i2 + ", ratingLaunchCount=" + i3 + ", isRatingDone=" + z2 + ", stationsLaunchCount=" + i4 + ", stationsStartDate=" + j + ", catalogLaunched=" + z3 + ", memosChecked=" + set + ", memosUnchecked=" + set2 + ", searchList=" + set3 + ", onBoardingSplashShown=" + z4 + ", searchSuggestionsHistory=" + set4 + ", securityAlertDisplayAt=" + j2 + ", couponScanProductBarCodeShown=" + z5 + ")";
    }

    /* renamed from: u */
    public final int mo108142u() {
        return this.f89374b;
    }

    @C12579k
    /* renamed from: v */
    public final Set<String> mo108143v() {
        return this.f89381i;
    }

    @C12579k
    /* renamed from: w */
    public final Set<String> mo108144w() {
        return this.f89382j;
    }

    /* renamed from: x */
    public final boolean mo108145x() {
        return this.f89384l;
    }

    /* renamed from: y */
    public final int mo108146y() {
        return this.f89376d;
    }

    @C12579k
    /* renamed from: z */
    public final Set<String> mo108147z() {
        return this.f89383k;
    }
}
