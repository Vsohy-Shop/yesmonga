package com.carrefour.fid.android.account.presentation.viewmodels.account.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a */
public final class C13623a {
    @C12579k

    /* renamed from: a */
    public static final C13623a f33154a = new C13623a();

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$a */
    public static final class C13624a implements C28505u.C28509d {

        /* renamed from: d */
        public static final int f33155d = 0;

        /* renamed from: b */
        public final boolean f33156b;

        /* renamed from: c */
        public final boolean f33157c;

        public C13624a() {
            this(false, false, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public static /* synthetic */ C13624a m58298h(C13624a aVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f33156b;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f33157c;
            }
            return aVar.mo32350g(z, z2);
        }

        /* renamed from: e */
        public final boolean mo32347e() {
            return this.f33156b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13624a)) {
                return false;
            }
            C13624a aVar = (C13624a) obj;
            return this.f33156b == aVar.f33156b && this.f33157c == aVar.f33157c;
        }

        /* renamed from: f */
        public final boolean mo32349f() {
            return this.f33157c;
        }

        @C12579k
        /* renamed from: g */
        public final C13624a mo32350g(boolean z, boolean z2) {
            return new C13624a(z, z2);
        }

        public int hashCode() {
            boolean z = this.f33156b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f33157c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo32352i() {
            return this.f33156b;
        }

        public final boolean isLoading() {
            return this.f33157c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f33156b;
            boolean z2 = this.f33157c;
            return "UIState(emailFormatMatches=" + z + ", isLoading=" + z2 + ")";
        }

        public C13624a(boolean z, boolean z2) {
            this.f33156b = z;
            this.f33157c = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13624a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b */
    public interface C13625b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b$a */
        public static final class C13626a implements C13625b {

            /* renamed from: b */
            public static final int f33158b = 0;
            @C12579k

            /* renamed from: a */
            public final String f33159a;

            public C13626a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                this.f33159a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C13626a m58303c(C13626a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f33159a;
                }
                return aVar.mo32356b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32355a() {
                return this.f33159a;
            }

            @C12579k
            /* renamed from: b */
            public final C13626a mo32356b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                return new C13626a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo32357d() {
                return this.f33159a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13626a) && Intrinsics.areEqual((Object) this.f33159a, (Object) ((C13626a) obj).f33159a);
            }

            public int hashCode() {
                return this.f33159a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33159a;
                return "EmailSaved(email=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b$b */
        public static final class C13627b implements C13625b {

            /* renamed from: b */
            public static final int f33160b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f33161a;

            public C13627b(@C12580l Throwable th) {
                this.f33161a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C13627b m58307c(C13627b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f33161a;
                }
                return bVar.mo32362b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo32361a() {
                return this.f33161a;
            }

            @C12579k
            /* renamed from: b */
            public final C13627b mo32362b(@C12580l Throwable th) {
                return new C13627b(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo32363d() {
                return this.f33161a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13627b) && Intrinsics.areEqual((Object) this.f33161a, (Object) ((C13627b) obj).f33161a);
            }

            public int hashCode() {
                Throwable th = this.f33161a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f33161a;
                return "Error(throwable=" + th + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$c */
    public interface C13628c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$c$a */
        public static final class C13629a implements C13628c {

            /* renamed from: b */
            public static final int f33162b = 0;
            @C12579k

            /* renamed from: a */
            public final String f33163a;

            public C13629a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                this.f33163a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C13629a m58311c(C13629a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f33163a;
                }
                return aVar.mo32368b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32367a() {
                return this.f33163a;
            }

            @C12579k
            /* renamed from: b */
            public final C13629a mo32368b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                return new C13629a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo32369d() {
                return this.f33163a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13629a) && Intrinsics.areEqual((Object) this.f33163a, (Object) ((C13629a) obj).f33163a);
            }

            public int hashCode() {
                return this.f33163a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33163a;
                return "CheckEmailFormat(email=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$c$b */
        public static final class C13630b implements C13628c {

            /* renamed from: b */
            public static final int f33164b = 0;
            @C12579k

            /* renamed from: a */
            public final String f33165a;

            public C13630b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                this.f33165a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C13630b m58315c(C13630b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f33165a;
                }
                return bVar.mo32374b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32373a() {
                return this.f33165a;
            }

            @C12579k
            /* renamed from: b */
            public final C13630b mo32374b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "email");
                return new C13630b(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo32375d() {
                return this.f33165a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13630b) && Intrinsics.areEqual((Object) this.f33165a, (Object) ((C13630b) obj).f33165a);
            }

            public int hashCode() {
                return this.f33165a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33165a;
                return "SaveEmail(email=" + str + ")";
            }
        }
    }
}
