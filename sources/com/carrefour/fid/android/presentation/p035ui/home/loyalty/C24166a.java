package com.carrefour.fid.android.presentation.p035ui.home.loyalty;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a */
public interface C24166a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$a */
    public static final class C24167a implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24167a f60448a = new C24167a();

        /* renamed from: b */
        public static final int f60449b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$b */
    public static final class C24168b implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24168b f60450a = new C24168b();

        /* renamed from: b */
        public static final int f60451b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$c */
    public static final class C24169c implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24169c f60452a = new C24169c();

        /* renamed from: b */
        public static final int f60453b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$d */
    public static final class C24170d implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24170d f60454a = new C24170d();

        /* renamed from: b */
        public static final int f60455b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$e */
    public static final class C24171e implements C24166a {

        /* renamed from: d */
        public static final int f60456d = 0;
        @C12579k

        /* renamed from: a */
        public final String f60457a;
        @C12579k

        /* renamed from: b */
        public final String f60458b;
        @C12579k

        /* renamed from: c */
        public final String f60459c;

        public C24171e(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "opCode");
            Intrinsics.checkNotNullParameter(str2, "webViewUrl");
            Intrinsics.checkNotNullParameter(str3, "webViewTitle");
            this.f60457a = str;
            this.f60458b = str2;
            this.f60459c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ C24171e m106460e(C24171e eVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f60457a;
            }
            if ((i & 2) != 0) {
                str2 = eVar.f60458b;
            }
            if ((i & 4) != 0) {
                str3 = eVar.f60459c;
            }
            return eVar.mo70722d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo70719a() {
            return this.f60457a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo70720b() {
            return this.f60458b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo70721c() {
            return this.f60459c;
        }

        @C12579k
        /* renamed from: d */
        public final C24171e mo70722d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "opCode");
            Intrinsics.checkNotNullParameter(str2, "webViewUrl");
            Intrinsics.checkNotNullParameter(str3, "webViewTitle");
            return new C24171e(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24171e)) {
                return false;
            }
            C24171e eVar = (C24171e) obj;
            return Intrinsics.areEqual((Object) this.f60457a, (Object) eVar.f60457a) && Intrinsics.areEqual((Object) this.f60458b, (Object) eVar.f60458b) && Intrinsics.areEqual((Object) this.f60459c, (Object) eVar.f60459c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo70724f() {
            return this.f60457a;
        }

        @C12579k
        /* renamed from: g */
        public final String mo70725g() {
            return this.f60459c;
        }

        @C12579k
        /* renamed from: h */
        public final String mo70726h() {
            return this.f60458b;
        }

        public int hashCode() {
            return (((this.f60457a.hashCode() * 31) + this.f60458b.hashCode()) * 31) + this.f60459c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f60457a;
            String str2 = this.f60458b;
            String str3 = this.f60459c;
            return "OnJOTeamBannerClick(opCode=" + str + ", webViewUrl=" + str2 + ", webViewTitle=" + str3 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$f */
    public static final class C24172f implements C24166a {

        /* renamed from: b */
        public static final int f60460b = 0;

        /* renamed from: a */
        public final double f60461a;

        public C24172f(double d) {
            this.f60461a = d;
        }

        /* renamed from: c */
        public static /* synthetic */ C24172f m106468c(C24172f fVar, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = fVar.f60461a;
            }
            return fVar.mo70730b(d);
        }

        /* renamed from: a */
        public final double mo70729a() {
            return this.f60461a;
        }

        @C12579k
        /* renamed from: b */
        public final C24172f mo70730b(double d) {
            return new C24172f(d);
        }

        /* renamed from: d */
        public final double mo70731d() {
            return this.f60461a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24172f) && Double.compare(this.f60461a, ((C24172f) obj).f60461a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f60461a);
        }

        @C12579k
        public String toString() {
            double d = this.f60461a;
            return "OnLoyaltyBalanceClick(balanceInEuros=" + d + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$g */
    public static final class C24173g implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24173g f60462a = new C24173g();

        /* renamed from: b */
        public static final int f60463b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$h */
    public static final class C24174h implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24174h f60464a = new C24174h();

        /* renamed from: b */
        public static final int f60465b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.loyalty.a$i */
    public static final class C24175i implements C24166a {
        @C12579k

        /* renamed from: a */
        public static final C24175i f60466a = new C24175i();

        /* renamed from: b */
        public static final int f60467b = 0;
    }
}
