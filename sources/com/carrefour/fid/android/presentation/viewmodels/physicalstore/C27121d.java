package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.d */
public interface C27121d {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$a */
    public static final class C27122a implements C27121d {

        /* renamed from: b */
        public static final int f65959b = 0;

        /* renamed from: a */
        public final boolean f65960a;

        public C27122a(boolean z) {
            this.f65960a = z;
        }

        /* renamed from: c */
        public static /* synthetic */ C27122a m114640c(C27122a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f65960a;
            }
            return aVar.mo78852b(z);
        }

        /* renamed from: a */
        public final boolean mo78851a() {
            return this.f65960a;
        }

        @C12579k
        /* renamed from: b */
        public final C27122a mo78852b(boolean z) {
            return new C27122a(z);
        }

        /* renamed from: d */
        public final boolean mo78853d() {
            return this.f65960a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27122a) && this.f65960a == ((C27122a) obj).f65960a;
        }

        public int hashCode() {
            boolean z = this.f65960a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f65960a;
            return "NavigateToCouponPage(isInStoreOnly=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$b */
    public static final class C27123b implements C27121d {

        /* renamed from: d */
        public static final int f65961d = 0;
        @C12579k

        /* renamed from: a */
        public final String f65962a;
        @C12579k

        /* renamed from: b */
        public final String f65963b;
        @C12579k

        /* renamed from: c */
        public final String f65964c;

        public C27123b(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "gameUrl");
            Intrinsics.checkNotNullParameter(str2, "webViewTitle");
            Intrinsics.checkNotNullParameter(str3, "secureTokenValue");
            this.f65962a = str;
            this.f65963b = str2;
            this.f65964c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ C27123b m114644e(C27123b bVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f65962a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.f65963b;
            }
            if ((i & 4) != 0) {
                str3 = bVar.f65964c;
            }
            return bVar.mo78860d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78857a() {
            return this.f65962a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo78858b() {
            return this.f65963b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo78859c() {
            return this.f65964c;
        }

        @C12579k
        /* renamed from: d */
        public final C27123b mo78860d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "gameUrl");
            Intrinsics.checkNotNullParameter(str2, "webViewTitle");
            Intrinsics.checkNotNullParameter(str3, "secureTokenValue");
            return new C27123b(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27123b)) {
                return false;
            }
            C27123b bVar = (C27123b) obj;
            return Intrinsics.areEqual((Object) this.f65962a, (Object) bVar.f65962a) && Intrinsics.areEqual((Object) this.f65963b, (Object) bVar.f65963b) && Intrinsics.areEqual((Object) this.f65964c, (Object) bVar.f65964c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo78862f() {
            return this.f65962a;
        }

        @C12579k
        /* renamed from: g */
        public final String mo78863g() {
            return this.f65964c;
        }

        @C12579k
        /* renamed from: h */
        public final String mo78864h() {
            return this.f65963b;
        }

        public int hashCode() {
            return (((this.f65962a.hashCode() * 31) + this.f65963b.hashCode()) * 31) + this.f65964c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f65962a;
            String str2 = this.f65963b;
            String str3 = this.f65964c;
            return "OpenArsenalWebView(gameUrl=" + str + ", webViewTitle=" + str2 + ", secureTokenValue=" + str3 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$c */
    public static final class C27124c implements C27121d {

        /* renamed from: b */
        public static final int f65965b = 0;
        @C12579k

        /* renamed from: a */
        public final String f65966a;

        public C27124c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            this.f65966a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27124c m114652c(C27124c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f65966a;
            }
            return cVar.mo78868b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78867a() {
            return this.f65966a;
        }

        @C12579k
        /* renamed from: b */
        public final C27124c mo78868b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            return new C27124c(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo78869d() {
            return this.f65966a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27124c) && Intrinsics.areEqual((Object) this.f65966a, (Object) ((C27124c) obj).f65966a);
        }

        public int hashCode() {
            return this.f65966a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f65966a;
            return "OpenCatalogWebView(url=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$d */
    public static final class C27125d implements C27121d {
        @C12579k

        /* renamed from: a */
        public static final C27125d f65967a = new C27125d();

        /* renamed from: b */
        public static final int f65968b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$e */
    public static final class C27126e implements C27121d {
        @C12579k

        /* renamed from: a */
        public static final C27126e f65969a = new C27126e();

        /* renamed from: b */
        public static final int f65970b = 0;
    }
}
