package com.carrefour.fid.android.presentation.viewmodels.splash;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.util.environment.C28912a;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c */
public final class C27422c {
    @C12579k

    /* renamed from: a */
    public static final C27422c f66525a = new C27422c();

    /* renamed from: b */
    public static final int f66526b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a */
    public interface C27423a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a$a */
        public static final class C27424a implements C27423a {

            /* renamed from: b */
            public static final int f66527b = 0;
            @C12579k

            /* renamed from: a */
            public final String f66528a;

            public C27424a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "id");
                this.f66528a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C27424a m115477c(C27424a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f66528a;
                }
                return aVar.mo79754b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo79753a() {
                return this.f66528a;
            }

            @C12579k
            /* renamed from: b */
            public final C27424a mo79754b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "id");
                return new C27424a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo79755d() {
                return this.f66528a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27424a) && Intrinsics.areEqual((Object) this.f66528a, (Object) ((C27424a) obj).f66528a);
            }

            public int hashCode() {
                return this.f66528a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f66528a;
                return "AirshipGaid(id=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a$b */
        public static final class C27425b implements C27423a {

            /* renamed from: c */
            public static final int f66529c = C28912a.f70831e;
            @C12579k

            /* renamed from: a */
            public final C28912a f66530a;
            @C12579k

            /* renamed from: b */
            public final String f66531b;

            public C27425b(@C12579k C28912a aVar, @C12579k String str) {
                Intrinsics.checkNotNullParameter(aVar, "type");
                Intrinsics.checkNotNullParameter(str, "versionName");
                this.f66530a = aVar;
                this.f66531b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C27425b m115481d(C27425b bVar, C28912a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = bVar.f66530a;
                }
                if ((i & 2) != 0) {
                    str = bVar.f66531b;
                }
                return bVar.mo79761c(aVar, str);
            }

            @C12579k
            /* renamed from: a */
            public final C28912a mo79759a() {
                return this.f66530a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo79760b() {
                return this.f66531b;
            }

            @C12579k
            /* renamed from: c */
            public final C27425b mo79761c(@C12579k C28912a aVar, @C12579k String str) {
                Intrinsics.checkNotNullParameter(aVar, "type");
                Intrinsics.checkNotNullParameter(str, "versionName");
                return new C27425b(aVar, str);
            }

            @C12579k
            /* renamed from: e */
            public final C28912a mo79762e() {
                return this.f66530a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27425b)) {
                    return false;
                }
                C27425b bVar = (C27425b) obj;
                return Intrinsics.areEqual((Object) this.f66530a, (Object) bVar.f66530a) && Intrinsics.areEqual((Object) this.f66531b, (Object) bVar.f66531b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo79764f() {
                return this.f66531b;
            }

            public int hashCode() {
                return (this.f66530a.hashCode() * 31) + this.f66531b.hashCode();
            }

            @C12579k
            public String toString() {
                C28912a aVar = this.f66530a;
                String str = this.f66531b;
                return "AppInfo(type=" + aVar + ", versionName=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a$c */
        public static final class C27426c implements C27423a {

            /* renamed from: c */
            public static final int f66532c = 0;

            /* renamed from: a */
            public final boolean f66533a;

            /* renamed from: b */
            public final int f66534b;

            public C27426c(boolean z, int i) {
                this.f66533a = z;
                this.f66534b = i;
            }

            /* renamed from: d */
            public static /* synthetic */ C27426c m115487d(C27426c cVar, boolean z, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z = cVar.f66533a;
                }
                if ((i2 & 2) != 0) {
                    i = cVar.f66534b;
                }
                return cVar.mo79769c(z, i);
            }

            /* renamed from: a */
            public final boolean mo79767a() {
                return this.f66533a;
            }

            /* renamed from: b */
            public final int mo79768b() {
                return this.f66534b;
            }

            @C12579k
            /* renamed from: c */
            public final C27426c mo79769c(boolean z, int i) {
                return new C27426c(z, i);
            }

            /* renamed from: e */
            public final int mo79770e() {
                return this.f66534b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27426c)) {
                    return false;
                }
                C27426c cVar = (C27426c) obj;
                return this.f66533a == cVar.f66533a && this.f66534b == cVar.f66534b;
            }

            /* renamed from: f */
            public final boolean mo79772f() {
                return this.f66533a;
            }

            public int hashCode() {
                boolean z = this.f66533a;
                if (z) {
                    z = true;
                }
                return ((z ? 1 : 0) * true) + Integer.hashCode(this.f66534b);
            }

            @C12579k
            public String toString() {
                boolean z = this.f66533a;
                int i = this.f66534b;
                return "LaunchEvent(isFirstLaunch=" + z + ", launchCount=" + i + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a$d */
        public static final class C27427d implements C27423a {
            @C12579k

            /* renamed from: a */
            public static final C27427d f66535a = new C27427d();

            /* renamed from: b */
            public static final int f66536b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a$e */
        public static final class C27428e implements C27423a {
            @C12579k

            /* renamed from: a */
            public static final C27428e f66537a = new C27428e();

            /* renamed from: b */
            public static final int f66538b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$a$f */
        public static final class C27429f implements C27423a {
            @C12579k

            /* renamed from: a */
            public static final C27429f f66539a = new C27429f();

            /* renamed from: b */
            public static final int f66540b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$b */
    public interface C27430b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$b$a */
        public static final class C27431a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m115493a(@C12579k C27430b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$b$b */
        public static final class C27432b implements C27430b {

            /* renamed from: d */
            public static final int f66541d = 0;
            @C12580l

            /* renamed from: b */
            public final String f66542b;
            @C12580l

            /* renamed from: c */
            public final String f66543c;

            public C27432b(@C12580l String str, @C12580l String str2) {
                this.f66542b = str;
                this.f66543c = str2;
            }

            /* renamed from: h */
            public static /* synthetic */ C27432b m115494h(C27432b bVar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f66542b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.f66543c;
                }
                return bVar.mo79778g(str, str2);
            }

            @C12580l
            /* renamed from: e */
            public final String mo79775e() {
                return this.f66542b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27432b)) {
                    return false;
                }
                C27432b bVar = (C27432b) obj;
                return Intrinsics.areEqual((Object) this.f66542b, (Object) bVar.f66542b) && Intrinsics.areEqual((Object) this.f66543c, (Object) bVar.f66543c);
            }

            @C12580l
            /* renamed from: f */
            public final String mo79777f() {
                return this.f66543c;
            }

            @C12579k
            /* renamed from: g */
            public final C27432b mo79778g(@C12580l String str, @C12580l String str2) {
                return new C27432b(str, str2);
            }

            public int hashCode() {
                String str = this.f66542b;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f66543c;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            @C12580l
            /* renamed from: i */
            public final String mo79780i() {
                return this.f66542b;
            }

            @C12580l
            /* renamed from: j */
            public final String mo79781j() {
                return this.f66543c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27431a.m115493a(this);
            }

            @C12579k
            public String toString() {
                String str = this.f66542b;
                String str2 = this.f66543c;
                return "FidDetails(cardNumber=" + str + ", userFullName=" + str2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$b$c */
        public static final class C27433c implements C27430b {
            @C12579k

            /* renamed from: b */
            public static final C27433c f66544b = new C27433c();

            /* renamed from: c */
            public static final int f66545c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C27431a.m115493a(this);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$c */
    public interface C27434c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$c$a */
        public static final class C27435a implements C27434c {
            @C12579k

            /* renamed from: a */
            public static final C27435a f66546a = new C27435a();

            /* renamed from: b */
            public static final int f66547b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$c$b */
        public static final class C27436b implements C27434c {
            @C12579k

            /* renamed from: a */
            public static final C27436b f66548a = new C27436b();

            /* renamed from: b */
            public static final int f66549b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$c$c */
        public static final class C27437c implements C27434c {
            @C12579k

            /* renamed from: a */
            public static final C27437c f66550a = new C27437c();

            /* renamed from: b */
            public static final int f66551b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.c$c$d */
        public static final class C27438d implements C27434c {
            @C12579k

            /* renamed from: a */
            public static final C27438d f66552a = new C27438d();

            /* renamed from: b */
            public static final int f66553b = 0;
        }
    }
}
