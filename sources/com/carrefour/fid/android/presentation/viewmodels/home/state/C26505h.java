package com.carrefour.fid.android.presentation.viewmodels.home.state;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.h */
public interface C26505h {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.h$a */
    public static final class C26506a implements C26505h {

        /* renamed from: d */
        public static final int f64779d = 0;
        @C12579k

        /* renamed from: a */
        public final String f64780a;
        @C12579k

        /* renamed from: b */
        public final String f64781b;
        @C12579k

        /* renamed from: c */
        public final String f64782c;

        public C26506a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "stickersTitle");
            Intrinsics.checkNotNullParameter(str2, "stickersUrl");
            Intrinsics.checkNotNullParameter(str3, "stickersImageUrl");
            this.f64780a = str;
            this.f64781b = str2;
            this.f64782c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ C26506a m112914e(C26506a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f64780a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f64781b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f64782c;
            }
            return aVar.mo77070d(str, str2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo77067a() {
            return this.f64780a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo77068b() {
            return this.f64781b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo77069c() {
            return this.f64782c;
        }

        @C12579k
        /* renamed from: d */
        public final C26506a mo77070d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "stickersTitle");
            Intrinsics.checkNotNullParameter(str2, "stickersUrl");
            Intrinsics.checkNotNullParameter(str3, "stickersImageUrl");
            return new C26506a(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26506a)) {
                return false;
            }
            C26506a aVar = (C26506a) obj;
            return Intrinsics.areEqual((Object) this.f64780a, (Object) aVar.f64780a) && Intrinsics.areEqual((Object) this.f64781b, (Object) aVar.f64781b) && Intrinsics.areEqual((Object) this.f64782c, (Object) aVar.f64782c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo77072f() {
            return this.f64782c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo77073g() {
            return this.f64780a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo77074h() {
            return this.f64781b;
        }

        public int hashCode() {
            return (((this.f64780a.hashCode() * 31) + this.f64781b.hashCode()) * 31) + this.f64782c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f64780a;
            String str2 = this.f64781b;
            String str3 = this.f64782c;
            return "StickersInfo(stickersTitle=" + str + ", stickersUrl=" + str2 + ", stickersImageUrl=" + str3 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.h$b */
    public static final class C26507b implements C26505h {
        @C12579k

        /* renamed from: a */
        public static final C26507b f64783a = new C26507b();

        /* renamed from: b */
        public static final int f64784b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.state.h$c */
    public static final class C26508c implements C26505h {
        @C12579k

        /* renamed from: a */
        public static final C26508c f64785a = new C26508c();

        /* renamed from: b */
        public static final int f64786b = 0;
    }
}
