package com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.domain.models.ArsenalJOBanner;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain;
import com.carrefour.fid.android.presentation.models.CurrentCampaignsModel;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a */
public final class C26562a {
    @C12579k

    /* renamed from: a */
    public static final C26562a f64913a = new C26562a();

    /* renamed from: b */
    public static final int f64914b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$a */
    public interface C26563a {
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$b */
    public static final class C26564b implements C26563a {
        @C12579k

        /* renamed from: a */
        public static final C26564b f64915a = new C26564b();

        /* renamed from: b */
        public static final int f64916b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$c */
    public static final class C26565c implements C26563a {
        @C12579k

        /* renamed from: a */
        public static final C26565c f64917a = new C26565c();

        /* renamed from: b */
        public static final int f64918b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$d */
    public static final class C26566d implements C26569g {

        /* renamed from: b */
        public static final int f64919b = 0;

        /* renamed from: a */
        public final int f64920a;

        public C26566d(int i) {
            this.f64920a = i;
        }

        /* renamed from: c */
        public static /* synthetic */ C26566d m113112c(C26566d dVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dVar.f64920a;
            }
            return dVar.mo77261b(i);
        }

        /* renamed from: a */
        public final int mo77260a() {
            return this.f64920a;
        }

        @C12579k
        /* renamed from: b */
        public final C26566d mo77261b(int i) {
            return new C26566d(i);
        }

        /* renamed from: d */
        public final int mo77262d() {
            return this.f64920a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26566d) && this.f64920a == ((C26566d) obj).f64920a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64920a);
        }

        @C12579k
        public String toString() {
            int i = this.f64920a;
            return "CouponsCountState(count=" + i + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$e */
    public static final class C26567e implements C26569g {
        @C12579k

        /* renamed from: a */
        public static final C26567e f64921a = new C26567e();

        /* renamed from: b */
        public static final int f64922b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$f */
    public static final class C26568f implements C26569g {
        @C12579k

        /* renamed from: a */
        public static final C26568f f64923a = new C26568f();

        /* renamed from: b */
        public static final int f64924b = 0;
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$g */
    public interface C26569g {
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h */
    public interface C26570h {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$a */
        public static final class C26571a implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26571a f64925a = new C26571a();

            /* renamed from: b */
            public static final int f64926b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$b */
        public static final class C26572b implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26572b f64927a = new C26572b();

            /* renamed from: b */
            public static final int f64928b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$c */
        public static final class C26573c implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26573c f64929a = new C26573c();

            /* renamed from: b */
            public static final int f64930b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$d */
        public static final class C26574d implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26574d f64931a = new C26574d();

            /* renamed from: b */
            public static final int f64932b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$e */
        public static final class C26575e implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26575e f64933a = new C26575e();

            /* renamed from: b */
            public static final int f64934b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$f */
        public static final class C26576f implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26576f f64935a = new C26576f();

            /* renamed from: b */
            public static final int f64936b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$g */
        public static final class C26577g implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26577g f64937a = new C26577g();

            /* renamed from: b */
            public static final int f64938b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$h */
        public static final class C26578h implements C26570h {
            @C12579k

            /* renamed from: a */
            public static final C26578h f64939a = new C26578h();

            /* renamed from: b */
            public static final int f64940b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i */
    public interface C26579i extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$a */
        public static final class C26580a implements C26579i {
            @C12579k

            /* renamed from: a */
            public static final C26580a f64941a = new C26580a();

            /* renamed from: b */
            public static final int f64942b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$b */
        public static final class C26581b implements C26579i {
            @C12579k

            /* renamed from: a */
            public static final C26581b f64943a = new C26581b();

            /* renamed from: b */
            public static final int f64944b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c */
        public static final class C26582c implements C26579i {

            /* renamed from: b */
            public static final int f64945b = 8;
            @C12579k

            /* renamed from: a */
            public final C26570h f64946a;

            public C26582c(@C12579k C26570h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "error");
                this.f64946a = hVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C26582c m113116c(C26582c cVar, C26570h hVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    hVar = cVar.f64946a;
                }
                return cVar.mo77267b(hVar);
            }

            @C12579k
            /* renamed from: a */
            public final C26570h mo77266a() {
                return this.f64946a;
            }

            @C12579k
            /* renamed from: b */
            public final C26582c mo77267b(@C12579k C26570h hVar) {
                Intrinsics.checkNotNullParameter(hVar, "error");
                return new C26582c(hVar);
            }

            @C12579k
            /* renamed from: d */
            public final C26570h mo77268d() {
                return this.f64946a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26582c) && Intrinsics.areEqual((Object) this.f64946a, (Object) ((C26582c) obj).f64946a);
            }

            public int hashCode() {
                return this.f64946a.hashCode();
            }

            @C12579k
            public String toString() {
                C26570h hVar = this.f64946a;
                return "Error(error=" + hVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$d */
        public static final class C26583d implements C26579i {
            @C12579k

            /* renamed from: a */
            public static final C26583d f64947a = new C26583d();

            /* renamed from: b */
            public static final int f64948b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$e */
        public static final class C26584e implements C26579i {
            @C12579k

            /* renamed from: a */
            public static final C26584e f64949a = new C26584e();

            /* renamed from: b */
            public static final int f64950b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$f */
        public static final class C26585f implements C26579i {

            /* renamed from: b */
            public static final int f64951b = 0;

            /* renamed from: a */
            public final boolean f64952a;

            public C26585f(boolean z) {
                this.f64952a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26585f m113120c(C26585f fVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fVar.f64952a;
                }
                return fVar.mo77273b(z);
            }

            /* renamed from: a */
            public final boolean mo77272a() {
                return this.f64952a;
            }

            @C12579k
            /* renamed from: b */
            public final C26585f mo77273b(boolean z) {
                return new C26585f(z);
            }

            /* renamed from: d */
            public final boolean mo77274d() {
                return this.f64952a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26585f) && this.f64952a == ((C26585f) obj).f64952a;
            }

            public int hashCode() {
                boolean z = this.f64952a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64952a;
                return "NavigateToCouponsDetail(isInStoreOnly=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$g */
        public static final class C26586g implements C26579i {
            @C12579k

            /* renamed from: a */
            public static final C26586g f64953a = new C26586g();

            /* renamed from: b */
            public static final int f64954b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$h */
        public static final class C26587h implements C26579i {

            /* renamed from: c */
            public static final int f64955c = 8;
            @C12579k

            /* renamed from: a */
            public final List<UserChannelsMediaDomain> f64956a;
            @C12579k

            /* renamed from: b */
            public final String f64957b;

            public C26587h(@C12579k List<UserChannelsMediaDomain> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "channels");
                Intrinsics.checkNotNullParameter(str, "cardNum");
                this.f64956a = list;
                this.f64957b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C26587h m113124d(C26587h hVar, List<UserChannelsMediaDomain> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.f64956a;
                }
                if ((i & 2) != 0) {
                    str = hVar.f64957b;
                }
                return hVar.mo77280c(list, str);
            }

            @C12579k
            /* renamed from: a */
            public final List<UserChannelsMediaDomain> mo77278a() {
                return this.f64956a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo77279b() {
                return this.f64957b;
            }

            @C12579k
            /* renamed from: c */
            public final C26587h mo77280c(@C12579k List<UserChannelsMediaDomain> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "channels");
                Intrinsics.checkNotNullParameter(str, "cardNum");
                return new C26587h(list, str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo77281e() {
                return this.f64957b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26587h)) {
                    return false;
                }
                C26587h hVar = (C26587h) obj;
                return Intrinsics.areEqual((Object) this.f64956a, (Object) hVar.f64956a) && Intrinsics.areEqual((Object) this.f64957b, (Object) hVar.f64957b);
            }

            @C12579k
            /* renamed from: f */
            public final List<UserChannelsMediaDomain> mo77283f() {
                return this.f64956a;
            }

            public int hashCode() {
                return (this.f64956a.hashCode() * 31) + this.f64957b.hashCode();
            }

            @C12579k
            public String toString() {
                List<UserChannelsMediaDomain> list = this.f64956a;
                String str = this.f64957b;
                return "NavigateToSecretCodeChange(channels=" + list + ", cardNum=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$i */
        public static final class C26588i implements C26579i {

            /* renamed from: d */
            public static final int f64958d = 0;
            @C12579k

            /* renamed from: a */
            public final String f64959a;
            @C12579k

            /* renamed from: b */
            public final String f64960b;
            @C12579k

            /* renamed from: c */
            public final String f64961c;

            public C26588i(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "secureTokenValue");
                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                Intrinsics.checkNotNullParameter(str3, "gameName");
                this.f64959a = str;
                this.f64960b = str2;
                this.f64961c = str3;
            }

            /* renamed from: e */
            public static /* synthetic */ C26588i m113130e(C26588i iVar, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = iVar.f64959a;
                }
                if ((i & 2) != 0) {
                    str2 = iVar.f64960b;
                }
                if ((i & 4) != 0) {
                    str3 = iVar.f64961c;
                }
                return iVar.mo77289d(str, str2, str3);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77286a() {
                return this.f64959a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo77287b() {
                return this.f64960b;
            }

            @C12579k
            /* renamed from: c */
            public final String mo77288c() {
                return this.f64961c;
            }

            @C12579k
            /* renamed from: d */
            public final C26588i mo77289d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "secureTokenValue");
                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                Intrinsics.checkNotNullParameter(str3, "gameName");
                return new C26588i(str, str2, str3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26588i)) {
                    return false;
                }
                C26588i iVar = (C26588i) obj;
                return Intrinsics.areEqual((Object) this.f64959a, (Object) iVar.f64959a) && Intrinsics.areEqual((Object) this.f64960b, (Object) iVar.f64960b) && Intrinsics.areEqual((Object) this.f64961c, (Object) iVar.f64961c);
            }

            @C12579k
            /* renamed from: f */
            public final String mo77291f() {
                return this.f64961c;
            }

            @C12579k
            /* renamed from: g */
            public final String mo77292g() {
                return this.f64960b;
            }

            @C12579k
            /* renamed from: h */
            public final String mo77293h() {
                return this.f64959a;
            }

            public int hashCode() {
                return (((this.f64959a.hashCode() * 31) + this.f64960b.hashCode()) * 31) + this.f64961c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64959a;
                String str2 = this.f64960b;
                String str3 = this.f64961c;
                return "OpenArsenalWebView(secureTokenValue=" + str + ", gameUrl=" + str2 + ", gameName=" + str3 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$j */
        public static final class C26589j implements C26579i {
            @C12579k

            /* renamed from: a */
            public static final C26589j f64962a = new C26589j();

            /* renamed from: b */
            public static final int f64963b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k */
    public interface C26601k extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$a */
        public static final class C26602a implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26602a f64987a = new C26602a();

            /* renamed from: b */
            public static final int f64988b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$b */
        public static final class C26603b implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26603b f64989a = new C26603b();

            /* renamed from: b */
            public static final int f64990b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$c */
        public static final class C26604c implements C26601k {

            /* renamed from: d */
            public static final int f64991d = 0;
            @C12579k

            /* renamed from: a */
            public final String f64992a;
            @C12579k

            /* renamed from: b */
            public final String f64993b;
            @C12579k

            /* renamed from: c */
            public final String f64994c;

            public C26604c(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "opCode");
                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                Intrinsics.checkNotNullParameter(str3, "gameName");
                this.f64992a = str;
                this.f64993b = str2;
                this.f64994c = str3;
            }

            /* renamed from: e */
            public static /* synthetic */ C26604c m113173e(C26604c cVar, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f64992a;
                }
                if ((i & 2) != 0) {
                    str2 = cVar.f64993b;
                }
                if ((i & 4) != 0) {
                    str3 = cVar.f64994c;
                }
                return cVar.mo77345d(str, str2, str3);
            }

            @C12579k
            /* renamed from: a */
            public final String mo77342a() {
                return this.f64992a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo77343b() {
                return this.f64993b;
            }

            @C12579k
            /* renamed from: c */
            public final String mo77344c() {
                return this.f64994c;
            }

            @C12579k
            /* renamed from: d */
            public final C26604c mo77345d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
                Intrinsics.checkNotNullParameter(str, "opCode");
                Intrinsics.checkNotNullParameter(str2, "gameUrl");
                Intrinsics.checkNotNullParameter(str3, "gameName");
                return new C26604c(str, str2, str3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26604c)) {
                    return false;
                }
                C26604c cVar = (C26604c) obj;
                return Intrinsics.areEqual((Object) this.f64992a, (Object) cVar.f64992a) && Intrinsics.areEqual((Object) this.f64993b, (Object) cVar.f64993b) && Intrinsics.areEqual((Object) this.f64994c, (Object) cVar.f64994c);
            }

            @C12579k
            /* renamed from: f */
            public final String mo77347f() {
                return this.f64994c;
            }

            @C12579k
            /* renamed from: g */
            public final String mo77348g() {
                return this.f64993b;
            }

            @C12579k
            /* renamed from: h */
            public final String mo77349h() {
                return this.f64992a;
            }

            public int hashCode() {
                return (((this.f64992a.hashCode() * 31) + this.f64993b.hashCode()) * 31) + this.f64994c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f64992a;
                String str2 = this.f64993b;
                String str3 = this.f64994c;
                return "ClickArsenalJO(opCode=" + str + ", gameUrl=" + str2 + ", gameName=" + str3 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$d */
        public static final class C26605d implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26605d f64995a = new C26605d();

            /* renamed from: b */
            public static final int f64996b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$e */
        public static final class C26606e implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26606e f64997a = new C26606e();

            /* renamed from: b */
            public static final int f64998b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$f */
        public static final class C26607f implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26607f f64999a = new C26607f();

            /* renamed from: b */
            public static final int f65000b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$g */
        public static final class C26608g implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26608g f65001a = new C26608g();

            /* renamed from: b */
            public static final int f65002b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$h */
        public static final class C26609h implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26609h f65003a = new C26609h();

            /* renamed from: b */
            public static final int f65004b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$i */
        public static final class C26610i implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26610i f65005a = new C26610i();

            /* renamed from: b */
            public static final int f65006b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$j */
        public static final class C26611j implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26611j f65007a = new C26611j();

            /* renamed from: b */
            public static final int f65008b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$k */
        public static final class C26612k implements C26601k {
            @C12579k

            /* renamed from: a */
            public static final C26612k f65009a = new C26612k();

            /* renamed from: b */
            public static final int f65010b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j */
    public interface C26590j extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$a */
        public static final class C26591a implements C26590j {

            /* renamed from: c */
            public static final int f64964c = 0;
            @C12580l

            /* renamed from: b */
            public final CurrentCampaignsModel f64965b;

            public C26591a() {
                this((CurrentCampaignsModel) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26591a m113138g(C26591a aVar, CurrentCampaignsModel currentCampaignsModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    currentCampaignsModel = aVar.f64965b;
                }
                return aVar.mo77298f(currentCampaignsModel);
            }

            @C12580l
            /* renamed from: e */
            public final CurrentCampaignsModel mo77296e() {
                return this.f64965b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26591a) && Intrinsics.areEqual((Object) this.f64965b, (Object) ((C26591a) obj).f64965b);
            }

            @C12579k
            /* renamed from: f */
            public final C26591a mo77298f(@C12580l CurrentCampaignsModel currentCampaignsModel) {
                return new C26591a(currentCampaignsModel);
            }

            @C12580l
            /* renamed from: h */
            public final CurrentCampaignsModel mo77299h() {
                return this.f64965b;
            }

            public int hashCode() {
                CurrentCampaignsModel currentCampaignsModel = this.f64965b;
                if (currentCampaignsModel == null) {
                    return 0;
                }
                return currentCampaignsModel.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }

            @C12579k
            public String toString() {
                CurrentCampaignsModel currentCampaignsModel = this.f64965b;
                return "Campaigns(campaigns=" + currentCampaignsModel + ")";
            }

            public C26591a(@C12580l CurrentCampaignsModel currentCampaignsModel) {
                this.f64965b = currentCampaignsModel;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26591a(CurrentCampaignsModel currentCampaignsModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : currentCampaignsModel);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b */
        public static final class C26592b implements C26590j {

            /* renamed from: e */
            public static final int f64966e = 0;
            @C12579k

            /* renamed from: b */
            public final String f64967b;
            @C12579k

            /* renamed from: c */
            public final CardType f64968c;

            /* renamed from: d */
            public final double f64969d;

            public C26592b(@C12579k String str, @C12579k CardType cardType, double d) {
                Intrinsics.checkNotNullParameter(str, "num");
                Intrinsics.checkNotNullParameter(cardType, "type");
                this.f64967b = str;
                this.f64968c = cardType;
                this.f64969d = d;
            }

            /* renamed from: i */
            public static /* synthetic */ C26592b m113142i(C26592b bVar, String str, CardType cardType, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f64967b;
                }
                if ((i & 2) != 0) {
                    cardType = bVar.f64968c;
                }
                if ((i & 4) != 0) {
                    d = bVar.f64969d;
                }
                return bVar.mo77306h(str, cardType, d);
            }

            @C12579k
            /* renamed from: e */
            public final String mo77302e() {
                return this.f64967b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26592b)) {
                    return false;
                }
                C26592b bVar = (C26592b) obj;
                return Intrinsics.areEqual((Object) this.f64967b, (Object) bVar.f64967b) && this.f64968c == bVar.f64968c && Double.compare(this.f64969d, bVar.f64969d) == 0;
            }

            @C12579k
            /* renamed from: f */
            public final CardType mo77304f() {
                return this.f64968c;
            }

            /* renamed from: g */
            public final double mo77305g() {
                return this.f64969d;
            }

            @C12579k
            /* renamed from: h */
            public final C26592b mo77306h(@C12579k String str, @C12579k CardType cardType, double d) {
                Intrinsics.checkNotNullParameter(str, "num");
                Intrinsics.checkNotNullParameter(cardType, "type");
                return new C26592b(str, cardType, d);
            }

            public int hashCode() {
                return (((this.f64967b.hashCode() * 31) + this.f64968c.hashCode()) * 31) + Double.hashCode(this.f64969d);
            }

            /* renamed from: j */
            public final double mo77308j() {
                return this.f64969d;
            }

            @C12579k
            /* renamed from: k */
            public final String mo77309k() {
                return this.f64967b;
            }

            @C12579k
            /* renamed from: l */
            public final CardType mo77310l() {
                return this.f64968c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }

            @C12579k
            public String toString() {
                String str = this.f64967b;
                CardType cardType = this.f64968c;
                double d = this.f64969d;
                return "CardInfo(num=" + str + ", type=" + cardType + ", balance=" + d + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26592b(String str, CardType cardType, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, cardType, (i & 4) != 0 ? 0.0d : d);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$c */
        public static final class C26593c implements C26590j {

            /* renamed from: c */
            public static final int f64970c = 8;
            @C12579k

            /* renamed from: b */
            public final C26563a f64971b;

            public C26593c() {
                this((C26563a) null, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C26593c m113150g(C26593c cVar, C26563a aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = cVar.f64971b;
                }
                return cVar.mo77314f(aVar);
            }

            @C12579k
            /* renamed from: e */
            public final C26563a mo77312e() {
                return this.f64971b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26593c) && Intrinsics.areEqual((Object) this.f64971b, (Object) ((C26593c) obj).f64971b);
            }

            @C12579k
            /* renamed from: f */
            public final C26593c mo77314f(@C12579k C26563a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "changeSecretCodeUiState");
                return new C26593c(aVar);
            }

            @C12579k
            /* renamed from: h */
            public final C26563a mo77315h() {
                return this.f64971b;
            }

            public int hashCode() {
                return this.f64971b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }

            @C12579k
            public String toString() {
                C26563a aVar = this.f64971b;
                return "ChangeSecretCodeUi(changeSecretCodeUiState=" + aVar + ")";
            }

            public C26593c(@C12579k C26563a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "changeSecretCodeUiState");
                this.f64971b = aVar;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26593c(C26563a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? C26564b.f64915a : aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$d */
        public static final class C26594d implements C26590j {

            /* renamed from: c */
            public static final int f64972c = 8;
            @C12579k

            /* renamed from: b */
            public final C26569g f64973b;

            public C26594d(@C12579k C26569g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "couponsUiState");
                this.f64973b = gVar;
            }

            /* renamed from: g */
            public static /* synthetic */ C26594d m113154g(C26594d dVar, C26569g gVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    gVar = dVar.f64973b;
                }
                return dVar.mo77320f(gVar);
            }

            @C12579k
            /* renamed from: e */
            public final C26569g mo77318e() {
                return this.f64973b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26594d) && Intrinsics.areEqual((Object) this.f64973b, (Object) ((C26594d) obj).f64973b);
            }

            @C12579k
            /* renamed from: f */
            public final C26594d mo77320f(@C12579k C26569g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "couponsUiState");
                return new C26594d(gVar);
            }

            @C12579k
            /* renamed from: h */
            public final C26569g mo77321h() {
                return this.f64973b;
            }

            public int hashCode() {
                return this.f64973b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }

            @C12579k
            public String toString() {
                C26569g gVar = this.f64973b;
                return "CouponsUi(couponsUiState=" + gVar + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$e */
        public static final class C26595e {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m113158a(@C12579k C26590j jVar) {
                return C28505u.C28509d.C28510a.m118428a(jVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$f */
        public static final class C26596f implements C26590j {
            @C12579k

            /* renamed from: b */
            public static final C26596f f64974b = new C26596f();

            /* renamed from: c */
            public static final int f64975c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$g */
        public static final class C26597g implements C26590j {
            @C12579k

            /* renamed from: b */
            public static final C26597g f64976b = new C26597g();

            /* renamed from: c */
            public static final int f64977c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$h */
        public static final class C26598h implements C26590j {

            /* renamed from: c */
            public static final int f64978c = 0;
            @C12579k

            /* renamed from: b */
            public final ArsenalJOBanner f64979b;

            public C26598h(@C12579k ArsenalJOBanner arsenalJOBanner) {
                Intrinsics.checkNotNullParameter(arsenalJOBanner, "banner");
                this.f64979b = arsenalJOBanner;
            }

            /* renamed from: g */
            public static /* synthetic */ C26598h m113159g(C26598h hVar, ArsenalJOBanner arsenalJOBanner, int i, Object obj) {
                if ((i & 1) != 0) {
                    arsenalJOBanner = hVar.f64979b;
                }
                return hVar.mo77326f(arsenalJOBanner);
            }

            @C12579k
            /* renamed from: e */
            public final ArsenalJOBanner mo77324e() {
                return this.f64979b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26598h) && Intrinsics.areEqual((Object) this.f64979b, (Object) ((C26598h) obj).f64979b);
            }

            @C12579k
            /* renamed from: f */
            public final C26598h mo77326f(@C12579k ArsenalJOBanner arsenalJOBanner) {
                Intrinsics.checkNotNullParameter(arsenalJOBanner, "banner");
                return new C26598h(arsenalJOBanner);
            }

            @C12579k
            /* renamed from: h */
            public final ArsenalJOBanner mo77327h() {
                return this.f64979b;
            }

            public int hashCode() {
                return this.f64979b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }

            @C12579k
            public String toString() {
                ArsenalJOBanner arsenalJOBanner = this.f64979b;
                return "JOBanner(banner=" + arsenalJOBanner + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$i */
        public static final class C26599i implements C26590j {
            @C12579k

            /* renamed from: b */
            public static final C26599i f64980b = new C26599i();

            /* renamed from: c */
            public static final int f64981c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$j */
        public static final class C26600j implements C26590j {

            /* renamed from: f */
            public static final int f64982f = 8;
            @C12579k

            /* renamed from: b */
            public final List<LoyaltyBonus> f64983b;

            /* renamed from: c */
            public final boolean f64984c;

            /* renamed from: d */
            public final boolean f64985d;

            /* renamed from: e */
            public final boolean f64986e;

            public C26600j(@C12579k List<LoyaltyBonus> list, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(list, "primeList");
                this.f64983b = list;
                this.f64984c = z;
                this.f64985d = z2;
                this.f64986e = z3;
            }

            /* renamed from: j */
            public static /* synthetic */ C26600j m113163j(C26600j jVar, List<LoyaltyBonus> list, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = jVar.f64983b;
                }
                if ((i & 2) != 0) {
                    z = jVar.f64984c;
                }
                if ((i & 4) != 0) {
                    z2 = jVar.f64985d;
                }
                if ((i & 8) != 0) {
                    z3 = jVar.f64986e;
                }
                return jVar.mo77336i(list, z, z2, z3);
            }

            @C12579k
            /* renamed from: e */
            public final List<LoyaltyBonus> mo77330e() {
                return this.f64983b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26600j)) {
                    return false;
                }
                C26600j jVar = (C26600j) obj;
                return Intrinsics.areEqual((Object) this.f64983b, (Object) jVar.f64983b) && this.f64984c == jVar.f64984c && this.f64985d == jVar.f64985d && this.f64986e == jVar.f64986e;
            }

            /* renamed from: f */
            public final boolean mo77332f() {
                return this.f64984c;
            }

            /* renamed from: g */
            public final boolean mo77333g() {
                return this.f64985d;
            }

            /* renamed from: h */
            public final boolean mo77334h() {
                return this.f64986e;
            }

            public int hashCode() {
                int hashCode = this.f64983b.hashCode() * 31;
                boolean z = this.f64984c;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (hashCode + (z ? 1 : 0)) * 31;
                boolean z3 = this.f64985d;
                if (z3) {
                    z3 = true;
                }
                int i2 = (i + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.f64986e;
                if (!z4) {
                    z2 = z4;
                }
                return i2 + (z2 ? 1 : 0);
            }

            @C12579k
            /* renamed from: i */
            public final C26600j mo77336i(@C12579k List<LoyaltyBonus> list, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(list, "primeList");
                return new C26600j(list, z, z2, z3);
            }

            /* renamed from: k */
            public final boolean mo77337k() {
                return this.f64984c;
            }

            /* renamed from: l */
            public final boolean mo77338l() {
                return this.f64985d;
            }

            /* renamed from: m */
            public final boolean mo77339m() {
                return this.f64986e;
            }

            @C12579k
            /* renamed from: n */
            public final List<LoyaltyBonus> mo77340n() {
                return this.f64983b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26595e.m113158a(this);
            }

            @C12579k
            public String toString() {
                List<LoyaltyBonus> list = this.f64983b;
                boolean z = this.f64984c;
                boolean z2 = this.f64985d;
                boolean z3 = this.f64986e;
                return "Primes(primeList=" + list + ", bioBonusAvailable=" + z + ", familyBonusAvailable=" + z2 + ", marketBonusAvailable=" + z3 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C26600j(List list, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, z2, z3);
            }
        }
    }
}
