package com.carrefour.fid.android.presentation.viewmodels.physicalstore.info;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a */
public interface C27136a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$a */
    public static final class C27137a implements C27136a {
        @C12579k

        /* renamed from: a */
        public static final C27137a f65996a = new C27137a();

        /* renamed from: b */
        public static final int f65997b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$b */
    public static final class C27138b implements C27136a {

        /* renamed from: b */
        public static final int f65998b = 0;
        @C12579k

        /* renamed from: a */
        public final String f65999a;

        public C27138b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            this.f65999a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27138b m114687c(C27138b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f65999a;
            }
            return bVar.mo78896b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78895a() {
            return this.f65999a;
        }

        @C12579k
        /* renamed from: b */
        public final C27138b mo78896b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            return new C27138b(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo78897d() {
            return this.f65999a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27138b) && Intrinsics.areEqual((Object) this.f65999a, (Object) ((C27138b) obj).f65999a);
        }

        public int hashCode() {
            return this.f65999a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f65999a;
            return "OnFirstReviewClicked(storeRef=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$c */
    public static final class C27139c implements C27136a {

        /* renamed from: b */
        public static final int f66000b = 0;
        @C12579k

        /* renamed from: a */
        public final String f66001a;

        public C27139c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            this.f66001a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27139c m114691c(C27139c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f66001a;
            }
            return cVar.mo78902b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78901a() {
            return this.f66001a;
        }

        @C12579k
        /* renamed from: b */
        public final C27139c mo78902b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            return new C27139c(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo78903d() {
            return this.f66001a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27139c) && Intrinsics.areEqual((Object) this.f66001a, (Object) ((C27139c) obj).f66001a);
        }

        public int hashCode() {
            return this.f66001a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f66001a;
            return "OnItineraryClicked(storeRef=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$d */
    public static final class C27140d implements C27136a {

        /* renamed from: c */
        public static final int f66002c = 0;
        @C12579k

        /* renamed from: a */
        public final String f66003a;
        @C12579k

        /* renamed from: b */
        public final String f66004b;

        public C27140d(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            Intrinsics.checkNotNullParameter(str2, C0861a.f2689A);
            this.f66003a = str;
            this.f66004b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C27140d m114695d(C27140d dVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f66003a;
            }
            if ((i & 2) != 0) {
                str2 = dVar.f66004b;
            }
            return dVar.mo78909c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78907a() {
            return this.f66003a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo78908b() {
            return this.f66004b;
        }

        @C12579k
        /* renamed from: c */
        public final C27140d mo78909c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            Intrinsics.checkNotNullParameter(str2, C0861a.f2689A);
            return new C27140d(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo78910e() {
            return this.f66004b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27140d)) {
                return false;
            }
            C27140d dVar = (C27140d) obj;
            return Intrinsics.areEqual((Object) this.f66003a, (Object) dVar.f66003a) && Intrinsics.areEqual((Object) this.f66004b, (Object) dVar.f66004b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo78912f() {
            return this.f66003a;
        }

        public int hashCode() {
            return (this.f66003a.hashCode() * 31) + this.f66004b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f66003a;
            String str2 = this.f66004b;
            return "OnPhoneClicked(storeRef=" + str + ", phoneNumber=" + str2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$e */
    public static final class C27141e implements C27136a {

        /* renamed from: b */
        public static final int f66005b = 0;
        @C12579k

        /* renamed from: a */
        public final String f66006a;

        public C27141e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            this.f66006a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C27141e m114701c(C27141e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f66006a;
            }
            return eVar.mo78916b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo78915a() {
            return this.f66006a;
        }

        @C12579k
        /* renamed from: b */
        public final C27141e mo78916b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "storeRef");
            return new C27141e(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo78917d() {
            return this.f66006a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27141e) && Intrinsics.areEqual((Object) this.f66006a, (Object) ((C27141e) obj).f66006a);
        }

        public int hashCode() {
            return this.f66006a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f66006a;
            return "OnReviewClicked(storeRef=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$f */
    public static final class C27142f implements C27136a {
        @C12579k

        /* renamed from: a */
        public static final C27142f f66007a = new C27142f();

        /* renamed from: b */
        public static final int f66008b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a$g */
    public static final class C27143g implements C27136a {
        @C12579k

        /* renamed from: a */
        public static final C27143g f66009a = new C27143g();

        /* renamed from: b */
        public static final int f66010b = 0;
    }
}
