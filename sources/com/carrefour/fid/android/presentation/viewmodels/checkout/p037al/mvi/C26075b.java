package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b */
public final class C26075b {
    @C12579k

    /* renamed from: a */
    public static final C26075b f63709a = new C26075b();
    @C12579k

    /* renamed from: b */
    public static final C28505u.C28508c<C26080b, C26076a> f63710b = C26085e.f63723a;

    /* renamed from: c */
    public static final int f63711c = 8;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a */
    public interface C26076a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$a */
        public static final class C26077a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m111506a(@C12579k C26076a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$b */
        public static final class C26078b implements C26076a {

            /* renamed from: c */
            public static final int f63712c = 0;
            @C12579k

            /* renamed from: b */
            public final String f63713b;

            public C26078b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "checkoutCGV");
                this.f63713b = str;
            }

            /* renamed from: g */
            public static /* synthetic */ C26078b m111507g(C26078b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f63713b;
                }
                return bVar.mo75721f(str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo75719e() {
                return this.f63713b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26078b) && Intrinsics.areEqual((Object) this.f63713b, (Object) ((C26078b) obj).f63713b);
            }

            @C12579k
            /* renamed from: f */
            public final C26078b mo75721f(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "checkoutCGV");
                return new C26078b(str);
            }

            @C12579k
            /* renamed from: h */
            public final String mo75722h() {
                return this.f63713b;
            }

            public int hashCode() {
                return this.f63713b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26077a.m111506a(this);
            }

            @C12579k
            public String toString() {
                String str = this.f63713b;
                return "GetCgvData(checkoutCGV=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$a$c */
        public static final class C26079c implements C26076a {

            /* renamed from: c */
            public static final int f63714c = 0;

            /* renamed from: b */
            public final boolean f63715b;

            public C26079c(boolean z) {
                this.f63715b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C26079c m111511g(C26079c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f63715b;
                }
                return cVar.mo75727f(z);
            }

            /* renamed from: e */
            public final boolean mo75725e() {
                return this.f63715b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26079c) && this.f63715b == ((C26079c) obj).f63715b;
            }

            @C12579k
            /* renamed from: f */
            public final C26079c mo75727f(boolean z) {
                return new C26079c(z);
            }

            /* renamed from: h */
            public final boolean mo75728h() {
                return this.f63715b;
            }

            public int hashCode() {
                boolean z = this.f63715b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C26077a.m111506a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f63715b;
                return "LoadingCgv(isLoadingCgv=" + z + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$b */
    public static final class C26080b implements C28505u.C28509d {

        /* renamed from: d */
        public static final int f63716d = 0;

        /* renamed from: b */
        public final boolean f63717b;
        @C12579k

        /* renamed from: c */
        public final String f63718c;

        public C26080b() {
            this(false, (String) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public static /* synthetic */ C26080b m111515h(C26080b bVar, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f63717b;
            }
            if ((i & 2) != 0) {
                str = bVar.f63718c;
            }
            return bVar.mo75734g(z, str);
        }

        /* renamed from: e */
        public final boolean mo75731e() {
            return this.f63717b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26080b)) {
                return false;
            }
            C26080b bVar = (C26080b) obj;
            return this.f63717b == bVar.f63717b && Intrinsics.areEqual((Object) this.f63718c, (Object) bVar.f63718c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo75733f() {
            return this.f63718c;
        }

        @C12579k
        /* renamed from: g */
        public final C26080b mo75734g(boolean z, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "checkoutCGV");
            return new C26080b(z, str);
        }

        public int hashCode() {
            boolean z = this.f63717b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f63718c.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo75736i() {
            return this.f63718c;
        }

        /* renamed from: j */
        public final boolean mo75737j() {
            return this.f63717b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f63717b;
            String str = this.f63718c;
            return "UIState(isLoadingCgv=" + z + ", checkoutCGV=" + str + ")";
        }

        public C26080b(boolean z, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "checkoutCGV");
            this.f63717b = z;
            this.f63718c = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26080b(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new String() : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$c */
    public interface C26081c extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$c$a */
        public static final class C26082a implements C26081c {

            /* renamed from: b */
            public static final int f63719b = 8;
            @C12580l

            /* renamed from: a */
            public final Throwable f63720a;

            public C26082a(@C12580l Throwable th) {
                this.f63720a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26082a m111521c(C26082a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f63720a;
                }
                return aVar.mo75740b(th);
            }

            @C12580l
            /* renamed from: a */
            public final Throwable mo75739a() {
                return this.f63720a;
            }

            @C12579k
            /* renamed from: b */
            public final C26082a mo75740b(@C12580l Throwable th) {
                return new C26082a(th);
            }

            @C12580l
            /* renamed from: d */
            public final Throwable mo75741d() {
                return this.f63720a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26082a) && Intrinsics.areEqual((Object) this.f63720a, (Object) ((C26082a) obj).f63720a);
            }

            public int hashCode() {
                Throwable th = this.f63720a;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f63720a;
                return "CheckoutError(throwable=" + th + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$d */
    public interface C26083d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$d$a */
        public static final class C26084a implements C26083d {
            @C12579k

            /* renamed from: a */
            public static final C26084a f63721a = new C26084a();

            /* renamed from: b */
            public static final int f63722b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.b$e */
    public static final class C26085e implements C28505u.C28508c<C26080b, C26076a> {

        /* renamed from: a */
        public static final C26085e f63723a = new C26085e();

        @C12579k
        /* renamed from: b */
        public final C26080b mo32307a(@C12579k C26080b bVar, @C12579k C26076a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "state");
            Intrinsics.checkNotNullParameter(aVar, "partialState");
            if (aVar instanceof C26076a.C26079c) {
                return C26080b.m111515h(bVar, ((C26076a.C26079c) aVar).mo75728h(), (String) null, 2, (Object) null);
            }
            if (aVar instanceof C26076a.C26078b) {
                return bVar.mo75734g(false, ((C26076a.C26078b) aVar).mo75722h());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: a */
    public final C28505u.C28508c<C26080b, C26076a> mo75718a() {
        return f63710b;
    }
}
