package com.carrefour.fid.android.presentation.viewmodels.coupons.mvi;

import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponGroup;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.shared.base.C28505u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c */
public final class C26258c {
    @C12579k

    /* renamed from: a */
    public static final C26258c f64206a = new C26258c();

    /* renamed from: b */
    public static final int f64207b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$a */
    public interface C26259a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$a$a */
        public static final class C26260a implements C26259a {

            /* renamed from: b */
            public static final int f64208b = 0;
            @C12579k

            /* renamed from: a */
            public final String f64209a;

            public C26260a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "date");
                this.f64209a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26260a m112186c(C26260a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f64209a;
                }
                return aVar.mo76374b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo76373a() {
                return this.f64209a;
            }

            @C12579k
            /* renamed from: b */
            public final C26260a mo76374b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "date");
                return new C26260a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo76375d() {
                return this.f64209a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26260a) && Intrinsics.areEqual((Object) this.f64209a, (Object) ((C26260a) obj).f64209a);
            }

            public int hashCode() {
                return this.f64209a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64209a;
                return "CouponsActivationStartsOn(date=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$a$b */
        public static final class C26261b implements C26259a {

            /* renamed from: b */
            public static final int f64210b = 0;

            /* renamed from: a */
            public final boolean f64211a;

            public C26261b(boolean z) {
                this.f64211a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26261b m112190c(C26261b bVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f64211a;
                }
                return bVar.mo76380b(z);
            }

            /* renamed from: a */
            public final boolean mo76379a() {
                return this.f64211a;
            }

            @C12579k
            /* renamed from: b */
            public final C26261b mo76380b(boolean z) {
                return new C26261b(z);
            }

            /* renamed from: d */
            public final boolean mo76381d() {
                return this.f64211a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26261b) && this.f64211a == ((C26261b) obj).f64211a;
            }

            public int hashCode() {
                boolean z = this.f64211a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64211a;
                return "CouponsEditionError(isActivation=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$a$c */
        public static final class C26262c implements C26259a {
            @C12579k

            /* renamed from: a */
            public static final C26262c f64212a = new C26262c();

            /* renamed from: b */
            public static final int f64213b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b */
    public interface C26263b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$a */
        public static final class C26264a implements C26263b {

            /* renamed from: b */
            public static final int f64214b = 8;
            @C12579k

            /* renamed from: a */
            public final C26259a f64215a;

            public C26264a(@C12579k C26259a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                this.f64215a = aVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C26264a m112194c(C26264a aVar, C26259a aVar2, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar2 = aVar.f64215a;
                }
                return aVar.mo76386b(aVar2);
            }

            @C12579k
            /* renamed from: a */
            public final C26259a mo76385a() {
                return this.f64215a;
            }

            @C12579k
            /* renamed from: b */
            public final C26264a mo76386b(@C12579k C26259a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                return new C26264a(aVar);
            }

            @C12579k
            /* renamed from: d */
            public final C26259a mo76387d() {
                return this.f64215a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26264a) && Intrinsics.areEqual((Object) this.f64215a, (Object) ((C26264a) obj).f64215a);
            }

            public int hashCode() {
                return this.f64215a.hashCode();
            }

            @C12579k
            public String toString() {
                C26259a aVar = this.f64215a;
                return "Error(error=" + aVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$b */
        public static final class C26265b implements C26263b {
            @C12579k

            /* renamed from: a */
            public static final C26265b f64216a = new C26265b();

            /* renamed from: b */
            public static final int f64217b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$c */
        public static final class C26266c implements C26263b {
            @C12579k

            /* renamed from: a */
            public static final C26266c f64218a = new C26266c();

            /* renamed from: b */
            public static final int f64219b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$d */
        public static final class C26267d implements C26263b {

            /* renamed from: c */
            public static final int f64220c = 8;
            @C12579k

            /* renamed from: a */
            public final CouponModel f64221a;

            /* renamed from: b */
            public final int f64222b;

            public C26267d(@C12579k CouponModel couponModel, int i) {
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                this.f64221a = couponModel;
                this.f64222b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C26267d m112198d(C26267d dVar, CouponModel couponModel, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    couponModel = dVar.f64221a;
                }
                if ((i2 & 2) != 0) {
                    i = dVar.f64222b;
                }
                return dVar.mo76393c(couponModel, i);
            }

            @C12579k
            /* renamed from: a */
            public final CouponModel mo76391a() {
                return this.f64221a;
            }

            /* renamed from: b */
            public final int mo76392b() {
                return this.f64222b;
            }

            @C12579k
            /* renamed from: c */
            public final C26267d mo76393c(@C12579k CouponModel couponModel, int i) {
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                return new C26267d(couponModel, i);
            }

            @C12579k
            /* renamed from: e */
            public final CouponModel mo76394e() {
                return this.f64221a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26267d)) {
                    return false;
                }
                C26267d dVar = (C26267d) obj;
                return Intrinsics.areEqual((Object) this.f64221a, (Object) dVar.f64221a) && this.f64222b == dVar.f64222b;
            }

            /* renamed from: f */
            public final int mo76396f() {
                return this.f64222b;
            }

            public int hashCode() {
                return (this.f64221a.hashCode() * 31) + Integer.hashCode(this.f64222b);
            }

            @C12579k
            public String toString() {
                CouponModel couponModel = this.f64221a;
                int i = this.f64222b;
                return "NavigateToCouponDetails(coupon=" + couponModel + ", couponSelected=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$e */
        public static final class C26268e implements C26263b {
            @C12579k

            /* renamed from: a */
            public static final C26268e f64223a = new C26268e();

            /* renamed from: b */
            public static final int f64224b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$f */
        public static final class C26269f implements C26263b {

            /* renamed from: d */
            public static final int f64225d = 8;
            @C12579k

            /* renamed from: a */
            public final List<CouponModel> f64226a;
            @C12580l

            /* renamed from: b */
            public final List<CouponsFilter> f64227b;

            /* renamed from: c */
            public final boolean f64228c;

            public C26269f(@C12579k List<CouponModel> list, @C12580l List<CouponsFilter> list2, boolean z) {
                Intrinsics.checkNotNullParameter(list, "coupons");
                this.f64226a = list;
                this.f64227b = list2;
                this.f64228c = z;
            }

            /* renamed from: e */
            public static /* synthetic */ C26269f m112204e(C26269f fVar, List<CouponModel> list, List<CouponsFilter> list2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = fVar.f64226a;
                }
                if ((i & 2) != 0) {
                    list2 = fVar.f64227b;
                }
                if ((i & 4) != 0) {
                    z = fVar.f64228c;
                }
                return fVar.mo76402d(list, list2, z);
            }

            @C12579k
            /* renamed from: a */
            public final List<CouponModel> mo76399a() {
                return this.f64226a;
            }

            @C12580l
            /* renamed from: b */
            public final List<CouponsFilter> mo76400b() {
                return this.f64227b;
            }

            /* renamed from: c */
            public final boolean mo76401c() {
                return this.f64228c;
            }

            @C12579k
            /* renamed from: d */
            public final C26269f mo76402d(@C12579k List<CouponModel> list, @C12580l List<CouponsFilter> list2, boolean z) {
                Intrinsics.checkNotNullParameter(list, "coupons");
                return new C26269f(list, list2, z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26269f)) {
                    return false;
                }
                C26269f fVar = (C26269f) obj;
                return Intrinsics.areEqual((Object) this.f64226a, (Object) fVar.f64226a) && Intrinsics.areEqual((Object) this.f64227b, (Object) fVar.f64227b) && this.f64228c == fVar.f64228c;
            }

            @C12579k
            /* renamed from: f */
            public final List<CouponModel> mo76404f() {
                return this.f64226a;
            }

            @C12580l
            /* renamed from: g */
            public final List<CouponsFilter> mo76405g() {
                return this.f64227b;
            }

            /* renamed from: h */
            public final boolean mo76406h() {
                return this.f64228c;
            }

            public int hashCode() {
                int hashCode = this.f64226a.hashCode() * 31;
                List<CouponsFilter> list = this.f64227b;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                boolean z = this.f64228c;
                if (z) {
                    z = true;
                }
                return hashCode2 + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                List<CouponModel> list = this.f64226a;
                List<CouponsFilter> list2 = this.f64227b;
                boolean z = this.f64228c;
                return "NavigateToFilters(coupons=" + list + ", filtersContent=" + list2 + ", isInStore=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$b$g */
        public static final class C26270g implements C26263b {
            @C12579k

            /* renamed from: a */
            public static final C26270g f64229a = new C26270g();

            /* renamed from: b */
            public static final int f64230b = 0;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$c */
    public static final class C26271c implements C28505u.C28509d {

        /* renamed from: o */
        public static final int f64231o = 8;

        /* renamed from: b */
        public final boolean f64232b;

        /* renamed from: c */
        public final boolean f64233c;
        @C12580l

        /* renamed from: d */
        public final List<CouponModel> f64234d;
        @C12580l

        /* renamed from: e */
        public final List<CouponModel> f64235e;
        @C12580l

        /* renamed from: f */
        public final List<CouponModel> f64236f;

        /* renamed from: g */
        public final boolean f64237g;
        @C12580l

        /* renamed from: h */
        public final Throwable f64238h;
        @C12580l

        /* renamed from: i */
        public final String f64239i;
        @C12580l

        /* renamed from: j */
        public final List<CouponsFilter> f64240j;
        @C12580l

        /* renamed from: k */
        public final List<CouponModel> f64241k;
        @C12579k

        /* renamed from: l */
        public final CouponGroup f64242l;
        @C12580l

        /* renamed from: m */
        public final String f64243m;

        /* renamed from: n */
        public final boolean f64244n;

        public C26271c() {
            this(false, false, (List) null, (List) null, (List) null, false, (Throwable) null, (String) null, (List) null, (List) null, (CouponGroup) null, (String) null, false, C16476b.f40864p, (DefaultConstructorMarker) null);
        }

        /* renamed from: s */
        public static /* synthetic */ C26271c m112212s(C26271c cVar, boolean z, boolean z2, List list, List list2, List list3, boolean z3, Throwable th, String str, List list4, List list5, CouponGroup couponGroup, String str2, boolean z4, int i, Object obj) {
            C26271c cVar2 = cVar;
            int i2 = i;
            return cVar.mo76430r((i2 & 1) != 0 ? cVar2.f64232b : z, (i2 & 2) != 0 ? cVar2.f64233c : z2, (i2 & 4) != 0 ? cVar2.f64234d : list, (i2 & 8) != 0 ? cVar2.f64235e : list2, (i2 & 16) != 0 ? cVar2.f64236f : list3, (i2 & 32) != 0 ? cVar2.f64237g : z3, (i2 & 64) != 0 ? cVar2.f64238h : th, (i2 & 128) != 0 ? cVar2.f64239i : str, (i2 & 256) != 0 ? cVar2.f64240j : list4, (i2 & 512) != 0 ? cVar2.f64241k : list5, (i2 & 1024) != 0 ? cVar2.f64242l : couponGroup, (i2 & 2048) != 0 ? cVar2.f64243m : str2, (i2 & 4096) != 0 ? cVar2.f64244n : z4);
        }

        @C12580l
        /* renamed from: A */
        public final String mo76409A() {
            return this.f64243m;
        }

        @C12580l
        /* renamed from: B */
        public final List<CouponModel> mo76410B() {
            return this.f64234d;
        }

        /* renamed from: C */
        public final boolean mo76411C() {
            return this.f64233c;
        }

        @C12579k
        /* renamed from: D */
        public final CouponGroup mo76412D() {
            return this.f64242l;
        }

        /* renamed from: E */
        public final boolean mo76413E() {
            return this.f64237g;
        }

        /* renamed from: e */
        public final boolean mo76414e() {
            return this.f64232b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26271c)) {
                return false;
            }
            C26271c cVar = (C26271c) obj;
            return this.f64232b == cVar.f64232b && this.f64233c == cVar.f64233c && Intrinsics.areEqual((Object) this.f64234d, (Object) cVar.f64234d) && Intrinsics.areEqual((Object) this.f64235e, (Object) cVar.f64235e) && Intrinsics.areEqual((Object) this.f64236f, (Object) cVar.f64236f) && this.f64237g == cVar.f64237g && Intrinsics.areEqual((Object) this.f64238h, (Object) cVar.f64238h) && Intrinsics.areEqual((Object) this.f64239i, (Object) cVar.f64239i) && Intrinsics.areEqual((Object) this.f64240j, (Object) cVar.f64240j) && Intrinsics.areEqual((Object) this.f64241k, (Object) cVar.f64241k) && this.f64242l == cVar.f64242l && Intrinsics.areEqual((Object) this.f64243m, (Object) cVar.f64243m) && this.f64244n == cVar.f64244n;
        }

        @C12580l
        /* renamed from: f */
        public final List<CouponModel> mo76416f() {
            return this.f64241k;
        }

        @C12579k
        /* renamed from: g */
        public final CouponGroup mo76417g() {
            return this.f64242l;
        }

        @C12580l
        /* renamed from: h */
        public final String mo76418h() {
            return this.f64243m;
        }

        public int hashCode() {
            boolean z = this.f64232b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f64233c;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            List<CouponModel> list = this.f64234d;
            int i3 = 0;
            int hashCode = (i2 + (list == null ? 0 : list.hashCode())) * 31;
            List<CouponModel> list2 = this.f64235e;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<CouponModel> list3 = this.f64236f;
            int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            boolean z4 = this.f64237g;
            if (z4) {
                z4 = true;
            }
            int i4 = (hashCode3 + (z4 ? 1 : 0)) * 31;
            Throwable th = this.f64238h;
            int hashCode4 = (i4 + (th == null ? 0 : th.hashCode())) * 31;
            String str = this.f64239i;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            List<CouponsFilter> list4 = this.f64240j;
            int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<CouponModel> list5 = this.f64241k;
            int hashCode7 = (((hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31) + this.f64242l.hashCode()) * 31;
            String str2 = this.f64243m;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            int i5 = (hashCode7 + i3) * 31;
            boolean z5 = this.f64244n;
            if (!z5) {
                z2 = z5;
            }
            return i5 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo76420i() {
            return this.f64244n;
        }

        public final boolean isLoading() {
            return this.f64232b;
        }

        /* renamed from: j */
        public final boolean mo76422j() {
            return this.f64233c;
        }

        @C12580l
        /* renamed from: k */
        public final List<CouponModel> mo76423k() {
            return this.f64234d;
        }

        @C12580l
        /* renamed from: l */
        public final List<CouponModel> mo76424l() {
            return this.f64235e;
        }

        @C12580l
        /* renamed from: m */
        public final List<CouponModel> mo76425m() {
            return this.f64236f;
        }

        /* renamed from: n */
        public final boolean mo76426n() {
            return this.f64237g;
        }

        @C12580l
        /* renamed from: o */
        public final Throwable mo76427o() {
            return this.f64238h;
        }

        @C12580l
        /* renamed from: p */
        public final String mo76428p() {
            return this.f64239i;
        }

        @C12580l
        /* renamed from: q */
        public final List<CouponsFilter> mo76429q() {
            return this.f64240j;
        }

        @C12579k
        /* renamed from: r */
        public final C26271c mo76430r(boolean z, boolean z2, @C12580l List<CouponModel> list, @C12580l List<CouponModel> list2, @C12580l List<CouponModel> list3, boolean z3, @C12580l Throwable th, @C12580l String str, @C12580l List<CouponsFilter> list4, @C12580l List<CouponModel> list5, @C12579k CouponGroup couponGroup, @C12580l String str2, boolean z4) {
            CouponGroup couponGroup2 = couponGroup;
            Intrinsics.checkNotNullParameter(couponGroup2, "selectedGroup");
            return new C26271c(z, z2, list, list2, list3, z3, th, str, list4, list5, couponGroup2, str2, z4);
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        /* renamed from: t */
        public final boolean mo76431t() {
            return this.f64244n;
        }

        @C12579k
        public String toString() {
            boolean z = this.f64232b;
            boolean z2 = this.f64233c;
            List<CouponModel> list = this.f64234d;
            List<CouponModel> list2 = this.f64235e;
            List<CouponModel> list3 = this.f64236f;
            boolean z3 = this.f64237g;
            Throwable th = this.f64238h;
            String str = this.f64239i;
            List<CouponsFilter> list4 = this.f64240j;
            List<CouponModel> list5 = this.f64241k;
            CouponGroup couponGroup = this.f64242l;
            String str2 = this.f64243m;
            boolean z4 = this.f64244n;
            return "UiState(isLoading=" + z + ", returnFromFidCard=" + z2 + ", onlineCoupons=" + list + ", inStoreCoupons=" + list2 + ", burnedCoupons=" + list3 + ", isActivateAllSwitchOn=" + z3 + ", errorState=" + th + ", loyaltyCardNumber=" + str + ", filtersContent=" + list4 + ", filteredCoupons=" + list5 + ", selectedGroup=" + couponGroup + ", numCard=" + str2 + ", appSettingsState=" + z4 + ")";
        }

        @C12580l
        /* renamed from: u */
        public final List<CouponModel> mo76433u() {
            return this.f64236f;
        }

        @C12580l
        /* renamed from: v */
        public final Throwable mo76434v() {
            return this.f64238h;
        }

        @C12580l
        /* renamed from: w */
        public final List<CouponModel> mo76435w() {
            return this.f64241k;
        }

        @C12580l
        /* renamed from: x */
        public final List<CouponsFilter> mo76436x() {
            return this.f64240j;
        }

        @C12580l
        /* renamed from: y */
        public final List<CouponModel> mo76437y() {
            return this.f64235e;
        }

        @C12580l
        /* renamed from: z */
        public final String mo76438z() {
            return this.f64239i;
        }

        public C26271c(boolean z, boolean z2, @C12580l List<CouponModel> list, @C12580l List<CouponModel> list2, @C12580l List<CouponModel> list3, boolean z3, @C12580l Throwable th, @C12580l String str, @C12580l List<CouponsFilter> list4, @C12580l List<CouponModel> list5, @C12579k CouponGroup couponGroup, @C12580l String str2, boolean z4) {
            Intrinsics.checkNotNullParameter(couponGroup, "selectedGroup");
            this.f64232b = z;
            this.f64233c = z2;
            this.f64234d = list;
            this.f64235e = list2;
            this.f64236f = list3;
            this.f64237g = z3;
            this.f64238h = th;
            this.f64239i = str;
            this.f64240j = list4;
            this.f64241k = list5;
            this.f64242l = couponGroup;
            this.f64243m = str2;
            this.f64244n = z4;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C26271c(boolean r16, boolean r17, java.util.List r18, java.util.List r19, java.util.List r20, boolean r21, java.lang.Throwable r22, java.lang.String r23, java.util.List r24, java.util.List r25, com.carrefour.fid.android.data.entities.coupons.CouponGroup r26, java.lang.String r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r15 = this;
                r0 = r29
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000b
            L_0x0009:
                r1 = r16
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0013
            L_0x0011:
                r3 = r17
            L_0x0013:
                r4 = r0 & 4
                r5 = 0
                if (r4 == 0) goto L_0x001a
                r4 = r5
                goto L_0x001c
            L_0x001a:
                r4 = r18
            L_0x001c:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x0022
                r6 = r5
                goto L_0x0024
            L_0x0022:
                r6 = r19
            L_0x0024:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x002a
                r7 = r5
                goto L_0x002c
            L_0x002a:
                r7 = r20
            L_0x002c:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x0032
                r8 = r2
                goto L_0x0034
            L_0x0032:
                r8 = r21
            L_0x0034:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x003a
                r9 = r5
                goto L_0x003c
            L_0x003a:
                r9 = r22
            L_0x003c:
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L_0x0042
                r10 = r5
                goto L_0x0044
            L_0x0042:
                r10 = r23
            L_0x0044:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x004a
                r11 = r5
                goto L_0x004c
            L_0x004a:
                r11 = r24
            L_0x004c:
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L_0x0052
                r12 = r5
                goto L_0x0054
            L_0x0052:
                r12 = r25
            L_0x0054:
                r13 = r0 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L_0x005b
                com.carrefour.fid.android.data.entities.coupons.CouponGroup r13 = com.carrefour.fid.android.data.entities.coupons.CouponGroup.IN_STORE
                goto L_0x005d
            L_0x005b:
                r13 = r26
            L_0x005d:
                r14 = r0 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L_0x0062
                goto L_0x0064
            L_0x0062:
                r5 = r27
            L_0x0064:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0069
                goto L_0x006b
            L_0x0069:
                r2 = r28
            L_0x006b:
                r16 = r15
                r17 = r1
                r18 = r3
                r19 = r4
                r20 = r6
                r21 = r7
                r22 = r8
                r23 = r9
                r24 = r10
                r25 = r11
                r26 = r12
                r27 = r13
                r28 = r5
                r29 = r2
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.C26258c.C26271c.<init>(boolean, boolean, java.util.List, java.util.List, java.util.List, boolean, java.lang.Throwable, java.lang.String, java.util.List, java.util.List, com.carrefour.fid.android.data.entities.coupons.CouponGroup, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d */
    public static abstract class C26272d implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f64245a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$a */
        public static final class C26273a extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26273a f64246b = new C26273a();

            /* renamed from: c */
            public static final int f64247c = 0;

            public C26273a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$b */
        public static final class C26274b extends C26272d {

            /* renamed from: d */
            public static final int f64248d = 8;
            @C12579k

            /* renamed from: b */
            public final CouponModel f64249b;
            @C12579k

            /* renamed from: c */
            public final CouponStatus f64250c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26274b(@C12579k CouponModel couponModel, @C12579k CouponStatus couponStatus) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                Intrinsics.checkNotNullParameter(couponStatus, "editAction");
                this.f64249b = couponModel;
                this.f64250c = couponStatus;
            }

            /* renamed from: d */
            public static /* synthetic */ C26274b m112239d(C26274b bVar, CouponModel couponModel, CouponStatus couponStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponModel = bVar.f64249b;
                }
                if ((i & 2) != 0) {
                    couponStatus = bVar.f64250c;
                }
                return bVar.mo76441c(couponModel, couponStatus);
            }

            @C12579k
            /* renamed from: a */
            public final CouponModel mo76439a() {
                return this.f64249b;
            }

            @C12579k
            /* renamed from: b */
            public final CouponStatus mo76440b() {
                return this.f64250c;
            }

            @C12579k
            /* renamed from: c */
            public final C26274b mo76441c(@C12579k CouponModel couponModel, @C12579k CouponStatus couponStatus) {
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                Intrinsics.checkNotNullParameter(couponStatus, "editAction");
                return new C26274b(couponModel, couponStatus);
            }

            @C12579k
            /* renamed from: e */
            public final CouponModel mo76442e() {
                return this.f64249b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26274b)) {
                    return false;
                }
                C26274b bVar = (C26274b) obj;
                return Intrinsics.areEqual((Object) this.f64249b, (Object) bVar.f64249b) && this.f64250c == bVar.f64250c;
            }

            @C12579k
            /* renamed from: f */
            public final CouponStatus mo76444f() {
                return this.f64250c;
            }

            public int hashCode() {
                return (this.f64249b.hashCode() * 31) + this.f64250c.hashCode();
            }

            @C12579k
            public String toString() {
                CouponModel couponModel = this.f64249b;
                CouponStatus couponStatus = this.f64250c;
                return "CouponEditAction(coupon=" + couponModel + ", editAction=" + couponStatus + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$c */
        public static final class C26275c extends C26272d {

            /* renamed from: d */
            public static final int f64251d = 0;
            @C12579k

            /* renamed from: b */
            public final CouponGroup f64252b;
            @C12579k

            /* renamed from: c */
            public final CouponStatus f64253c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26275c(@C12579k CouponGroup couponGroup, @C12579k CouponStatus couponStatus) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(couponGroup, "couponGroup");
                Intrinsics.checkNotNullParameter(couponStatus, "editAction");
                this.f64252b = couponGroup;
                this.f64253c = couponStatus;
            }

            /* renamed from: d */
            public static /* synthetic */ C26275c m112245d(C26275c cVar, CouponGroup couponGroup, CouponStatus couponStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponGroup = cVar.f64252b;
                }
                if ((i & 2) != 0) {
                    couponStatus = cVar.f64253c;
                }
                return cVar.mo76449c(couponGroup, couponStatus);
            }

            @C12579k
            /* renamed from: a */
            public final CouponGroup mo76447a() {
                return this.f64252b;
            }

            @C12579k
            /* renamed from: b */
            public final CouponStatus mo76448b() {
                return this.f64253c;
            }

            @C12579k
            /* renamed from: c */
            public final C26275c mo76449c(@C12579k CouponGroup couponGroup, @C12579k CouponStatus couponStatus) {
                Intrinsics.checkNotNullParameter(couponGroup, "couponGroup");
                Intrinsics.checkNotNullParameter(couponStatus, "editAction");
                return new C26275c(couponGroup, couponStatus);
            }

            @C12579k
            /* renamed from: e */
            public final CouponGroup mo76450e() {
                return this.f64252b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26275c)) {
                    return false;
                }
                C26275c cVar = (C26275c) obj;
                return this.f64252b == cVar.f64252b && this.f64253c == cVar.f64253c;
            }

            @C12579k
            /* renamed from: f */
            public final CouponStatus mo76452f() {
                return this.f64253c;
            }

            public int hashCode() {
                return (this.f64252b.hashCode() * 31) + this.f64253c.hashCode();
            }

            @C12579k
            public String toString() {
                CouponGroup couponGroup = this.f64252b;
                CouponStatus couponStatus = this.f64253c;
                return "CouponEditAllAction(couponGroup=" + couponGroup + ", editAction=" + couponStatus + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$d */
        public static final class C26276d extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26276d f64254b = new C26276d();

            /* renamed from: c */
            public static final int f64255c = 0;

            public C26276d() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$e */
        public static final class C26277e extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26277e f64256b = new C26277e();

            /* renamed from: c */
            public static final int f64257c = 0;

            public C26277e() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$f */
        public static final class C26278f extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26278f f64258b = new C26278f();

            /* renamed from: c */
            public static final int f64259c = 0;

            public C26278f() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$g */
        public static final class C26279g extends C26272d {

            /* renamed from: d */
            public static final int f64260d = 8;
            @C12579k

            /* renamed from: b */
            public final List<CouponModel> f64261b;
            @C12579k

            /* renamed from: c */
            public final List<CouponsFilter> f64262c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26279g(@C12579k List<CouponModel> list, @C12579k List<CouponsFilter> list2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(list, "coupons");
                Intrinsics.checkNotNullParameter(list2, "filter");
                this.f64261b = list;
                this.f64262c = list2;
            }

            /* renamed from: d */
            public static /* synthetic */ C26279g m112251d(C26279g gVar, List<CouponModel> list, List<CouponsFilter> list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = gVar.f64261b;
                }
                if ((i & 2) != 0) {
                    list2 = gVar.f64262c;
                }
                return gVar.mo76457c(list, list2);
            }

            @C12579k
            /* renamed from: a */
            public final List<CouponModel> mo76455a() {
                return this.f64261b;
            }

            @C12579k
            /* renamed from: b */
            public final List<CouponsFilter> mo76456b() {
                return this.f64262c;
            }

            @C12579k
            /* renamed from: c */
            public final C26279g mo76457c(@C12579k List<CouponModel> list, @C12579k List<CouponsFilter> list2) {
                Intrinsics.checkNotNullParameter(list, "coupons");
                Intrinsics.checkNotNullParameter(list2, "filter");
                return new C26279g(list, list2);
            }

            @C12579k
            /* renamed from: e */
            public final List<CouponModel> mo76458e() {
                return this.f64261b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26279g)) {
                    return false;
                }
                C26279g gVar = (C26279g) obj;
                return Intrinsics.areEqual((Object) this.f64261b, (Object) gVar.f64261b) && Intrinsics.areEqual((Object) this.f64262c, (Object) gVar.f64262c);
            }

            @C12579k
            /* renamed from: f */
            public final List<CouponsFilter> mo76460f() {
                return this.f64262c;
            }

            public int hashCode() {
                return (this.f64261b.hashCode() * 31) + this.f64262c.hashCode();
            }

            @C12579k
            public String toString() {
                List<CouponModel> list = this.f64261b;
                List<CouponsFilter> list2 = this.f64262c;
                return "FilterUpdated(coupons=" + list + ", filter=" + list2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$h */
        public static final class C26280h extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26280h f64263b = new C26280h();

            /* renamed from: c */
            public static final int f64264c = 0;

            public C26280h() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$i */
        public static final class C26281i extends C26272d {

            /* renamed from: c */
            public static final int f64265c = 0;
            @C12579k

            /* renamed from: b */
            public final CouponGroup f64266b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26281i(@C12579k CouponGroup couponGroup) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(couponGroup, "group");
                this.f64266b = couponGroup;
            }

            /* renamed from: c */
            public static /* synthetic */ C26281i m112257c(C26281i iVar, CouponGroup couponGroup, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponGroup = iVar.f64266b;
                }
                return iVar.mo76464b(couponGroup);
            }

            @C12579k
            /* renamed from: a */
            public final CouponGroup mo76463a() {
                return this.f64266b;
            }

            @C12579k
            /* renamed from: b */
            public final C26281i mo76464b(@C12579k CouponGroup couponGroup) {
                Intrinsics.checkNotNullParameter(couponGroup, "group");
                return new C26281i(couponGroup);
            }

            @C12579k
            /* renamed from: d */
            public final CouponGroup mo76465d() {
                return this.f64266b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26281i) && this.f64266b == ((C26281i) obj).f64266b;
            }

            public int hashCode() {
                return this.f64266b.hashCode();
            }

            @C12579k
            public String toString() {
                CouponGroup couponGroup = this.f64266b;
                return "SelectedGroupUpdated(group=" + couponGroup + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$j */
        public static final class C26282j extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26282j f64267b = new C26282j();

            /* renamed from: c */
            public static final int f64268c = 0;

            public C26282j() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$k */
        public static final class C26283k extends C26272d {

            /* renamed from: c */
            public static final int f64269c = 8;
            @C12579k

            /* renamed from: b */
            public final CouponModel f64270b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26283k(@C12579k CouponModel couponModel) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                this.f64270b = couponModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C26283k m112261c(C26283k kVar, CouponModel couponModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponModel = kVar.f64270b;
                }
                return kVar.mo76470b(couponModel);
            }

            @C12579k
            /* renamed from: a */
            public final CouponModel mo76469a() {
                return this.f64270b;
            }

            @C12579k
            /* renamed from: b */
            public final C26283k mo76470b(@C12579k CouponModel couponModel) {
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                return new C26283k(couponModel);
            }

            @C12579k
            /* renamed from: d */
            public final CouponModel mo76471d() {
                return this.f64270b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26283k) && Intrinsics.areEqual((Object) this.f64270b, (Object) ((C26283k) obj).f64270b);
            }

            public int hashCode() {
                return this.f64270b.hashCode();
            }

            @C12579k
            public String toString() {
                CouponModel couponModel = this.f64270b;
                return "ShowCouponDetailsAction(coupon=" + couponModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$l */
        public static final class C26284l extends C26272d {
            @C12579k

            /* renamed from: b */
            public static final C26284l f64271b = new C26284l();

            /* renamed from: c */
            public static final int f64272c = 0;

            public C26284l() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$m */
        public static final class C26285m extends C26272d {

            /* renamed from: c */
            public static final int f64273c = 0;

            /* renamed from: b */
            public final boolean f64274b;

            public C26285m(boolean z) {
                super((DefaultConstructorMarker) null);
                this.f64274b = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26285m m112265c(C26285m mVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = mVar.f64274b;
                }
                return mVar.mo76476b(z);
            }

            /* renamed from: a */
            public final boolean mo76475a() {
                return this.f64274b;
            }

            @C12579k
            /* renamed from: b */
            public final C26285m mo76476b(boolean z) {
                return new C26285m(z);
            }

            /* renamed from: d */
            public final boolean mo76477d() {
                return this.f64274b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26285m) && this.f64274b == ((C26285m) obj).f64274b;
            }

            public int hashCode() {
                boolean z = this.f64274b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64274b;
                return "TrackApplicationSettings(appSettings=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.c$d$n */
        public static final class C26286n extends C26272d {

            /* renamed from: c */
            public static final int f64275c = 0;
            @C12579k

            /* renamed from: b */
            public final CouponGroup f64276b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26286n(@C12579k CouponGroup couponGroup) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(couponGroup, "group");
                this.f64276b = couponGroup;
            }

            /* renamed from: c */
            public static /* synthetic */ C26286n m112269c(C26286n nVar, CouponGroup couponGroup, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponGroup = nVar.f64276b;
                }
                return nVar.mo76482b(couponGroup);
            }

            @C12579k
            /* renamed from: a */
            public final CouponGroup mo76481a() {
                return this.f64276b;
            }

            @C12579k
            /* renamed from: b */
            public final C26286n mo76482b(@C12579k CouponGroup couponGroup) {
                Intrinsics.checkNotNullParameter(couponGroup, "group");
                return new C26286n(couponGroup);
            }

            @C12579k
            /* renamed from: d */
            public final CouponGroup mo76483d() {
                return this.f64276b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26286n) && this.f64276b == ((C26286n) obj).f64276b;
            }

            public int hashCode() {
                return this.f64276b.hashCode();
            }

            @C12579k
            public String toString() {
                CouponGroup couponGroup = this.f64276b;
                return "TrackScreen(group=" + couponGroup + ")";
            }
        }

        public /* synthetic */ C26272d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26272d() {
        }
    }
}
