package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c */
public interface C23843c {

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$a */
    public interface C23844a extends C23843c {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$a$a */
        public static final class C23845a implements C23844a {

            /* renamed from: c */
            public static final int f59956c = 8;
            @C12579k

            /* renamed from: a */
            public final CouponModel f59957a;

            /* renamed from: b */
            public final boolean f59958b;

            public C23845a(@C12579k CouponModel couponModel, boolean z) {
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                this.f59957a = couponModel;
                this.f59958b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C23845a m105567d(C23845a aVar, CouponModel couponModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponModel = aVar.f59957a;
                }
                if ((i & 2) != 0) {
                    z = aVar.f59958b;
                }
                return aVar.mo69807c(couponModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final CouponModel mo69805a() {
                return this.f59957a;
            }

            /* renamed from: b */
            public final boolean mo69806b() {
                return this.f59958b;
            }

            @C12579k
            /* renamed from: c */
            public final C23845a mo69807c(@C12579k CouponModel couponModel, boolean z) {
                Intrinsics.checkNotNullParameter(couponModel, FirebaseAnalytics.C32532b.f78957j);
                return new C23845a(couponModel, z);
            }

            @C12579k
            /* renamed from: e */
            public final CouponModel mo69808e() {
                return this.f59957a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23845a)) {
                    return false;
                }
                C23845a aVar = (C23845a) obj;
                return Intrinsics.areEqual((Object) this.f59957a, (Object) aVar.f59957a) && this.f59958b == aVar.f59958b;
            }

            /* renamed from: f */
            public final boolean mo69810f() {
                return this.f59958b;
            }

            public int hashCode() {
                int hashCode = this.f59957a.hashCode() * 31;
                boolean z = this.f59958b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                CouponModel couponModel = this.f59957a;
                boolean z = this.f59958b;
                return "OnActivateCouponClicked(coupon=" + couponModel + ", isAnActivation=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$a$b */
        public static final class C23846b implements C23844a {

            /* renamed from: c */
            public static final int f59959c = 8;
            @C12579k

            /* renamed from: a */
            public final CouponModel f59960a;

            /* renamed from: b */
            public final boolean f59961b;

            public C23846b(@C12579k CouponModel couponModel, boolean z) {
                Intrinsics.checkNotNullParameter(couponModel, "couponModel");
                this.f59960a = couponModel;
                this.f59961b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C23846b m105573d(C23846b bVar, CouponModel couponModel, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponModel = bVar.f59960a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f59961b;
                }
                return bVar.mo69815c(couponModel, z);
            }

            @C12579k
            /* renamed from: a */
            public final CouponModel mo69813a() {
                return this.f59960a;
            }

            /* renamed from: b */
            public final boolean mo69814b() {
                return this.f59961b;
            }

            @C12579k
            /* renamed from: c */
            public final C23846b mo69815c(@C12579k CouponModel couponModel, boolean z) {
                Intrinsics.checkNotNullParameter(couponModel, "couponModel");
                return new C23846b(couponModel, z);
            }

            @C12579k
            /* renamed from: e */
            public final CouponModel mo69816e() {
                return this.f59960a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23846b)) {
                    return false;
                }
                C23846b bVar = (C23846b) obj;
                return Intrinsics.areEqual((Object) this.f59960a, (Object) bVar.f59960a) && this.f59961b == bVar.f59961b;
            }

            /* renamed from: f */
            public final boolean mo69818f() {
                return this.f59961b;
            }

            public int hashCode() {
                int hashCode = this.f59960a.hashCode() * 31;
                boolean z = this.f59961b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                CouponModel couponModel = this.f59960a;
                boolean z = this.f59961b;
                return "OnOpenCouponDetailClicked(couponModel=" + couponModel + ", isOnStore=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$a$c */
        public static final class C23847c implements C23844a {

            /* renamed from: b */
            public static final int f59962b = 8;
            @C12579k

            /* renamed from: a */
            public final CouponModel f59963a;

            public C23847c(@C12579k CouponModel couponModel) {
                Intrinsics.checkNotNullParameter(couponModel, "couponModel");
                this.f59963a = couponModel;
            }

            /* renamed from: c */
            public static /* synthetic */ C23847c m105579c(C23847c cVar, CouponModel couponModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    couponModel = cVar.f59963a;
                }
                return cVar.mo69822b(couponModel);
            }

            @C12579k
            /* renamed from: a */
            public final CouponModel mo69821a() {
                return this.f59963a;
            }

            @C12579k
            /* renamed from: b */
            public final C23847c mo69822b(@C12579k CouponModel couponModel) {
                Intrinsics.checkNotNullParameter(couponModel, "couponModel");
                return new C23847c(couponModel);
            }

            @C12579k
            /* renamed from: d */
            public final CouponModel mo69823d() {
                return this.f59963a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23847c) && Intrinsics.areEqual((Object) this.f59963a, (Object) ((C23847c) obj).f59963a);
            }

            public int hashCode() {
                return this.f59963a.hashCode();
            }

            @C12579k
            public String toString() {
                CouponModel couponModel = this.f59963a;
                return "OnScanBarCodeClicked(couponModel=" + couponModel + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$a$d */
        public static final class C23848d implements C23844a {

            /* renamed from: b */
            public static final int f59964b = 0;

            /* renamed from: a */
            public final boolean f59965a;

            public C23848d(boolean z) {
                this.f59965a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C23848d m105583c(C23848d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f59965a;
                }
                return dVar.mo69828b(z);
            }

            /* renamed from: a */
            public final boolean mo69827a() {
                return this.f59965a;
            }

            @C12579k
            /* renamed from: b */
            public final C23848d mo69828b(boolean z) {
                return new C23848d(z);
            }

            /* renamed from: d */
            public final boolean mo69829d() {
                return this.f59965a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23848d) && this.f59965a == ((C23848d) obj).f59965a;
            }

            public int hashCode() {
                boolean z = this.f59965a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f59965a;
                return "OnSelectAllInStoreCouponsSwitchClicked(isAnActivation=" + z + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$b */
    public interface C23849b extends C23843c {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$b$a */
        public static final class C23850a implements C23849b {
            @C12579k

            /* renamed from: a */
            public static final C23850a f59966a = new C23850a();

            /* renamed from: b */
            public static final int f59967b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$b$b */
        public static final class C23851b implements C23849b {
            @C12579k

            /* renamed from: a */
            public static final C23851b f59968a = new C23851b();

            /* renamed from: b */
            public static final int f59969b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$b$c */
        public static final class C23852c implements C23849b {
            @C12579k

            /* renamed from: a */
            public static final C23852c f59970a = new C23852c();

            /* renamed from: b */
            public static final int f59971b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$b$d */
        public static final class C23853d implements C23849b {

            /* renamed from: b */
            public static final int f59972b = 0;
            @C12579k

            /* renamed from: a */
            public final TabPage f59973a;

            public C23853d(@C12579k TabPage tabPage) {
                Intrinsics.checkNotNullParameter(tabPage, "tabSelected");
                this.f59973a = tabPage;
            }

            /* renamed from: c */
            public static /* synthetic */ C23853d m105587c(C23853d dVar, TabPage tabPage, int i, Object obj) {
                if ((i & 1) != 0) {
                    tabPage = dVar.f59973a;
                }
                return dVar.mo69834b(tabPage);
            }

            @C12579k
            /* renamed from: a */
            public final TabPage mo69833a() {
                return this.f59973a;
            }

            @C12579k
            /* renamed from: b */
            public final C23853d mo69834b(@C12579k TabPage tabPage) {
                Intrinsics.checkNotNullParameter(tabPage, "tabSelected");
                return new C23853d(tabPage);
            }

            @C12579k
            /* renamed from: d */
            public final TabPage mo69835d() {
                return this.f59973a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23853d) && this.f59973a == ((C23853d) obj).f59973a;
            }

            public int hashCode() {
                return this.f59973a.hashCode();
            }

            @C12579k
            public String toString() {
                TabPage tabPage = this.f59973a;
                return "OnTabRowClicked(tabSelected=" + tabPage + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$c */
    public static final class C23854c implements C23843c {
        @C12579k

        /* renamed from: a */
        public static final C23854c f59974a = new C23854c();

        /* renamed from: b */
        public static final int f59975b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$d */
    public static final class C23855d implements C23843c {
        @C12579k

        /* renamed from: a */
        public static final C23855d f59976a = new C23855d();

        /* renamed from: b */
        public static final int f59977b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$e */
    public static final class C23856e implements C23843c {
        @C12579k

        /* renamed from: a */
        public static final C23856e f59978a = new C23856e();

        /* renamed from: b */
        public static final int f59979b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$f */
    public static final class C23857f implements C23843c {
        @C12579k

        /* renamed from: a */
        public static final C23857f f59980a = new C23857f();

        /* renamed from: b */
        public static final int f59981b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$g */
    public static final class C23858g implements C23843c {
        @C12579k

        /* renamed from: a */
        public static final C23858g f59982a = new C23858g();

        /* renamed from: b */
        public static final int f59983b = 0;
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$h */
    public interface C23859h extends C23843c {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$h$a */
        public static final class C23860a implements C23859h {

            /* renamed from: c */
            public static final int f59984c = 0;
            @C12579k

            /* renamed from: a */
            public final String f59985a;

            /* renamed from: b */
            public final int f59986b;

            public C23860a(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                this.f59985a = str;
                this.f59986b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C23860a m105591d(C23860a aVar, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aVar.f59985a;
                }
                if ((i2 & 2) != 0) {
                    i = aVar.f59986b;
                }
                return aVar.mo69841c(str, i);
            }

            @C12579k
            /* renamed from: a */
            public final String mo69839a() {
                return this.f59985a;
            }

            /* renamed from: b */
            public final int mo69840b() {
                return this.f59986b;
            }

            @C12579k
            /* renamed from: c */
            public final C23860a mo69841c(@C12579k String str, int i) {
                Intrinsics.checkNotNullParameter(str, "traceName");
                return new C23860a(str, i);
            }

            /* renamed from: e */
            public final int mo69842e() {
                return this.f59986b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23860a)) {
                    return false;
                }
                C23860a aVar = (C23860a) obj;
                return Intrinsics.areEqual((Object) this.f59985a, (Object) aVar.f59985a) && this.f59986b == aVar.f59986b;
            }

            @C12579k
            /* renamed from: f */
            public final String mo69844f() {
                return this.f59985a;
            }

            public int hashCode() {
                return (this.f59985a.hashCode() * 31) + Integer.hashCode(this.f59986b);
            }

            @C12579k
            public String toString() {
                String str = this.f59985a;
                int i = this.f59986b;
                return "StartTrace(traceName=" + str + ", listSize=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.c$h$b */
        public static final class C23861b implements C23859h {
            @C12579k

            /* renamed from: a */
            public static final C23861b f59987a = new C23861b();

            /* renamed from: b */
            public static final int f59988b = 0;
        }
    }
}
