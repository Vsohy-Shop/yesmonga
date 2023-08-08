package com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi;

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
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a */
public final class C13706a {
    @C12579k

    /* renamed from: a */
    public static final C13706a f33321a = new C13706a();
    @C12579k

    /* renamed from: b */
    public static final C28505u.C28508c<C13711b, C13707a> f33322b = C13717e.f33344a;

    /* renamed from: c */
    public static final int f33323c = 8;

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a */
    public interface C13707a extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$a */
        public static final class C13708a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m58564a(@C12579k C13707a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$b */
        public static final class C13709b implements C13707a {

            /* renamed from: d */
            public static final int f33324d = 0;

            /* renamed from: b */
            public final boolean f33325b;

            /* renamed from: c */
            public final boolean f33326c;

            public C13709b(boolean z, boolean z2) {
                this.f33325b = z;
                this.f33326c = z2;
            }

            /* renamed from: h */
            public static /* synthetic */ C13709b m58565h(C13709b bVar, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = bVar.f33325b;
                }
                if ((i & 2) != 0) {
                    z2 = bVar.f33326c;
                }
                return bVar.mo32614g(z, z2);
            }

            /* renamed from: e */
            public final boolean mo32611e() {
                return this.f33325b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13709b)) {
                    return false;
                }
                C13709b bVar = (C13709b) obj;
                return this.f33325b == bVar.f33325b && this.f33326c == bVar.f33326c;
            }

            /* renamed from: f */
            public final boolean mo32613f() {
                return this.f33326c;
            }

            @C12579k
            /* renamed from: g */
            public final C13709b mo32614g(boolean z, boolean z2) {
                return new C13709b(z, z2);
            }

            public int hashCode() {
                boolean z = this.f33325b;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.f33326c;
                if (!z3) {
                    z2 = z3;
                }
                return i + (z2 ? 1 : 0);
            }

            /* renamed from: i */
            public final boolean mo32616i() {
                return this.f33325b;
            }

            /* renamed from: j */
            public final boolean mo32617j() {
                return this.f33326c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13708a.m58564a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f33325b;
                boolean z2 = this.f33326c;
                return "EmailAndPasswordFormat(mailMatches=" + z + ", passwordMatches=" + z2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$c */
        public static final class C13710c implements C13707a {

            /* renamed from: e */
            public static final int f33327e = 0;

            /* renamed from: b */
            public final boolean f33328b;

            /* renamed from: c */
            public final boolean f33329c;

            /* renamed from: d */
            public final boolean f33330d;

            public C13710c(boolean z, boolean z2, boolean z3) {
                this.f33328b = z;
                this.f33329c = z2;
                this.f33330d = z3;
            }

            /* renamed from: i */
            public static /* synthetic */ C13710c m58571i(C13710c cVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f33328b;
                }
                if ((i & 2) != 0) {
                    z2 = cVar.f33329c;
                }
                if ((i & 4) != 0) {
                    z3 = cVar.f33330d;
                }
                return cVar.mo32623h(z, z2, z3);
            }

            /* renamed from: e */
            public final boolean mo32619e() {
                return this.f33328b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13710c)) {
                    return false;
                }
                C13710c cVar = (C13710c) obj;
                return this.f33328b == cVar.f33328b && this.f33329c == cVar.f33329c && this.f33330d == cVar.f33330d;
            }

            /* renamed from: f */
            public final boolean mo32621f() {
                return this.f33329c;
            }

            /* renamed from: g */
            public final boolean mo32622g() {
                return this.f33330d;
            }

            @C12579k
            /* renamed from: h */
            public final C13710c mo32623h(boolean z, boolean z2, boolean z3) {
                return new C13710c(z, z2, z3);
            }

            public int hashCode() {
                boolean z = this.f33328b;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.f33329c;
                if (z3) {
                    z3 = true;
                }
                int i2 = (i + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.f33330d;
                if (!z4) {
                    z2 = z4;
                }
                return i2 + (z2 ? 1 : 0);
            }

            public final boolean isLoading() {
                return this.f33328b;
            }

            /* renamed from: j */
            public final boolean mo32626j() {
                return this.f33329c;
            }

            /* renamed from: k */
            public final boolean mo32627k() {
                return this.f33330d;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13708a.m58564a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f33328b;
                boolean z2 = this.f33329c;
                boolean z3 = this.f33330d;
                return "Loading(isLoading=" + z + ", mailMatches=" + z2 + ", passwordMatches=" + z3 + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b */
    public static final class C13711b implements C28505u.C28509d {

        /* renamed from: e */
        public static final int f33331e = 0;

        /* renamed from: b */
        public final boolean f33332b;

        /* renamed from: c */
        public final boolean f33333c;

        /* renamed from: d */
        public final boolean f33334d;

        public C13711b() {
            this(false, false, false, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: i */
        public static /* synthetic */ C13711b m58578i(C13711b bVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f33332b;
            }
            if ((i & 2) != 0) {
                z2 = bVar.f33333c;
            }
            if ((i & 4) != 0) {
                z3 = bVar.f33334d;
            }
            return bVar.mo32633h(z, z2, z3);
        }

        /* renamed from: e */
        public final boolean mo32629e() {
            return this.f33332b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13711b)) {
                return false;
            }
            C13711b bVar = (C13711b) obj;
            return this.f33332b == bVar.f33332b && this.f33333c == bVar.f33333c && this.f33334d == bVar.f33334d;
        }

        /* renamed from: f */
        public final boolean mo32631f() {
            return this.f33333c;
        }

        /* renamed from: g */
        public final boolean mo32632g() {
            return this.f33334d;
        }

        @C12579k
        /* renamed from: h */
        public final C13711b mo32633h(boolean z, boolean z2, boolean z3) {
            return new C13711b(z, z2, z3);
        }

        public int hashCode() {
            boolean z = this.f33332b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f33333c;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f33334d;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public final boolean isLoading() {
            return this.f33332b;
        }

        /* renamed from: j */
        public final boolean mo32636j() {
            return this.f33333c;
        }

        /* renamed from: k */
        public final boolean mo32637k() {
            return this.f33334d;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f33332b;
            boolean z2 = this.f33333c;
            boolean z3 = this.f33334d;
            return "UIState(isLoading=" + z + ", emailFormatMatches=" + z2 + ", passwordFormatMatches=" + z3 + ")";
        }

        public C13711b(boolean z, boolean z2, boolean z3) {
            this.f33332b = z;
            this.f33333c = z2;
            this.f33334d = z3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13711b(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c */
    public interface C13712c extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$a */
        public static final class C13713a implements C13712c {

            /* renamed from: d */
            public static final int f33335d = 0;

            /* renamed from: a */
            public final boolean f33336a;

            /* renamed from: b */
            public final boolean f33337b;

            /* renamed from: c */
            public final boolean f33338c;

            public C13713a(boolean z, boolean z2, boolean z3) {
                this.f33336a = z;
                this.f33337b = z2;
                this.f33338c = z3;
            }

            /* renamed from: e */
            public static /* synthetic */ C13713a m58585e(C13713a aVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = aVar.f33336a;
                }
                if ((i & 2) != 0) {
                    z2 = aVar.f33337b;
                }
                if ((i & 4) != 0) {
                    z3 = aVar.f33338c;
                }
                return aVar.mo32642d(z, z2, z3);
            }

            /* renamed from: a */
            public final boolean mo32639a() {
                return this.f33336a;
            }

            /* renamed from: b */
            public final boolean mo32640b() {
                return this.f33337b;
            }

            /* renamed from: c */
            public final boolean mo32641c() {
                return this.f33338c;
            }

            @C12579k
            /* renamed from: d */
            public final C13713a mo32642d(boolean z, boolean z2, boolean z3) {
                return new C13713a(z, z2, z3);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13713a)) {
                    return false;
                }
                C13713a aVar = (C13713a) obj;
                return this.f33336a == aVar.f33336a && this.f33337b == aVar.f33337b && this.f33338c == aVar.f33338c;
            }

            /* renamed from: f */
            public final boolean mo32644f() {
                return this.f33338c;
            }

            /* renamed from: g */
            public final boolean mo32645g() {
                return this.f33336a;
            }

            /* renamed from: h */
            public final boolean mo32646h() {
                return this.f33337b;
            }

            public int hashCode() {
                boolean z = this.f33336a;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.f33337b;
                if (z3) {
                    z3 = true;
                }
                int i2 = (i + (z3 ? 1 : 0)) * 31;
                boolean z4 = this.f33338c;
                if (!z4) {
                    z2 = z4;
                }
                return i2 + (z2 ? 1 : 0);
            }

            @C12579k
            public String toString() {
                boolean z = this.f33336a;
                boolean z2 = this.f33337b;
                boolean z3 = this.f33338c;
                return "AccountConnected(userProfiling=" + z + ", userProfilingPartner=" + z2 + ", userHasFidCard=" + z3 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$b */
        public static final class C13714b implements C13712c {

            /* renamed from: b */
            public static final int f33339b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f33340a;

            public C13714b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f33340a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C13714b m58593c(C13714b bVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = bVar.f33340a;
                }
                return bVar.mo32650b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo32649a() {
                return this.f33340a;
            }

            @C12579k
            /* renamed from: b */
            public final C13714b mo32650b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C13714b(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo32651d() {
                return this.f33340a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13714b) && Intrinsics.areEqual((Object) this.f33340a, (Object) ((C13714b) obj).f33340a);
            }

            public int hashCode() {
                return this.f33340a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f33340a;
                return "ErrorSignIn(throwable=" + th + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$d */
    public interface C13715d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$d$a */
        public static final class C13716a implements C13715d {

            /* renamed from: c */
            public static final int f33341c = 0;
            @C12579k

            /* renamed from: a */
            public final String f33342a;
            @C12579k

            /* renamed from: b */
            public final String f33343b;

            public C13716a(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "userName");
                Intrinsics.checkNotNullParameter(str2, "password");
                this.f33342a = str;
                this.f33343b = str2;
            }

            /* renamed from: d */
            public static /* synthetic */ C13716a m58597d(C13716a aVar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f33342a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.f33343b;
                }
                return aVar.mo32657c(str, str2);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32655a() {
                return this.f33342a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32656b() {
                return this.f33343b;
            }

            @C12579k
            /* renamed from: c */
            public final C13716a mo32657c(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "userName");
                Intrinsics.checkNotNullParameter(str2, "password");
                return new C13716a(str, str2);
            }

            @C12579k
            /* renamed from: e */
            public final String mo32658e() {
                return this.f33343b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13716a)) {
                    return false;
                }
                C13716a aVar = (C13716a) obj;
                return Intrinsics.areEqual((Object) this.f33342a, (Object) aVar.f33342a) && Intrinsics.areEqual((Object) this.f33343b, (Object) aVar.f33343b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32660f() {
                return this.f33342a;
            }

            public int hashCode() {
                return (this.f33342a.hashCode() * 31) + this.f33343b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33342a;
                String str2 = this.f33343b;
                return "SignIn(userName=" + str + ", password=" + str2 + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$e */
    public static final class C13717e implements C28505u.C28508c<C13711b, C13707a> {

        /* renamed from: a */
        public static final C13717e f33344a = new C13717e();

        @C12579k
        /* renamed from: b */
        public final C13711b mo32307a(@C12579k C13711b bVar, @C12579k C13707a aVar) {
            Intrinsics.checkNotNullParameter(bVar, "state");
            Intrinsics.checkNotNullParameter(aVar, "partialState");
            if (aVar instanceof C13707a.C13709b) {
                C13707a.C13709b bVar2 = (C13707a.C13709b) aVar;
                return C13711b.m58578i(bVar, false, bVar2.mo32616i(), bVar2.mo32617j(), 1, (Object) null);
            } else if (aVar instanceof C13707a.C13710c) {
                C13707a.C13710c cVar = (C13707a.C13710c) aVar;
                return bVar.mo32633h(cVar.isLoading(), cVar.mo32626j(), cVar.mo32627k());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @C12579k
    /* renamed from: a */
    public final C28505u.C28508c<C13711b, C13707a> mo32610a() {
        return f33322b;
    }
}
