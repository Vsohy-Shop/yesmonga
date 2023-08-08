package com.carrefour.fid.android.account.presentation.viewmodels.account.mvi;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.core.util.SecurityRule;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UpdateUserPassword {
    @C12579k

    /* renamed from: a */
    public static final UpdateUserPassword f33132a = new UpdateUserPassword();

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$Password;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Password {
        NEW,
        OLD
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$a */
    public interface C13612a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$a$a */
        public static final class C13613a implements C13612a {

            /* renamed from: b */
            public static final int f33136b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f33137a;

            public C13613a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f33137a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C13613a m58270c(C13613a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f33137a;
                }
                return aVar.mo32310b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo32309a() {
                return this.f33137a;
            }

            @C12579k
            /* renamed from: b */
            public final C13613a mo32310b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C13613a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo32311d() {
                return this.f33137a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13613a) && Intrinsics.areEqual((Object) this.f33137a, (Object) ((C13613a) obj).f33137a);
            }

            public int hashCode() {
                return this.f33137a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f33137a;
                return "Error(throwable=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$a$b */
        public static final class C13614b implements C13612a {
            @C12579k

            /* renamed from: a */
            public static final C13614b f33138a = new C13614b();

            /* renamed from: b */
            public static final int f33139b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b */
    public interface C13615b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$a */
        public static final class C13616a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m58274a(@C12579k C13615b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$b */
        public static final class C13617b implements C13615b {
            @C12579k

            /* renamed from: b */
            public static final C13617b f33140b = new C13617b();

            /* renamed from: c */
            public static final int f33141c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13616a.m58274a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$c */
        public static final class C13618c implements C13615b {

            /* renamed from: c */
            public static final int f33142c = 0;

            /* renamed from: b */
            public final boolean f33143b;

            public C13618c() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C13618c m58275g(C13618c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f33143b;
                }
                return cVar.mo32317f(z);
            }

            /* renamed from: e */
            public final boolean mo32315e() {
                return this.f33143b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13618c) && this.f33143b == ((C13618c) obj).f33143b;
            }

            @C12579k
            /* renamed from: f */
            public final C13618c mo32317f(boolean z) {
                return new C13618c(z);
            }

            public int hashCode() {
                boolean z = this.f33143b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f33143b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13616a.m58274a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f33143b;
                return "Loading(isLoading=" + z + ")";
            }

            public C13618c(boolean z) {
                this.f33143b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C13618c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$d */
        public static final class C13619d implements C13615b {

            /* renamed from: e */
            public static final int f33144e = 8;

            /* renamed from: b */
            public final boolean f33145b;

            /* renamed from: c */
            public final boolean f33146c;
            @C12579k

            /* renamed from: d */
            public final Set<SecurityRule> f33147d;

            public C13619d() {
                this(false, false, (Set) null, 7, (DefaultConstructorMarker) null);
            }

            /* renamed from: i */
            public static /* synthetic */ C13619d m58278i(C13619d dVar, boolean z, boolean z2, Set<SecurityRule> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f33145b;
                }
                if ((i & 2) != 0) {
                    z2 = dVar.f33146c;
                }
                if ((i & 4) != 0) {
                    set = dVar.f33147d;
                }
                return dVar.mo32325h(z, z2, set);
            }

            /* renamed from: e */
            public final boolean mo32321e() {
                return this.f33145b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13619d)) {
                    return false;
                }
                C13619d dVar = (C13619d) obj;
                return this.f33145b == dVar.f33145b && this.f33146c == dVar.f33146c && Intrinsics.areEqual((Object) this.f33147d, (Object) dVar.f33147d);
            }

            /* renamed from: f */
            public final boolean mo32323f() {
                return this.f33146c;
            }

            @C12579k
            /* renamed from: g */
            public final Set<SecurityRule> mo32324g() {
                return this.f33147d;
            }

            @C12579k
            /* renamed from: h */
            public final C13619d mo32325h(boolean z, boolean z2, @C12579k Set<? extends SecurityRule> set) {
                Intrinsics.checkNotNullParameter(set, "validatedRules");
                return new C13619d(z, z2, set);
            }

            public int hashCode() {
                boolean z = this.f33145b;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (z ? 1 : 0) * true;
                boolean z3 = this.f33146c;
                if (!z3) {
                    z2 = z3;
                }
                return ((i + (z2 ? 1 : 0)) * 31) + this.f33147d.hashCode();
            }

            @C12579k
            /* renamed from: j */
            public final Set<SecurityRule> mo32327j() {
                return this.f33147d;
            }

            /* renamed from: k */
            public final boolean mo32328k() {
                return this.f33146c;
            }

            /* renamed from: l */
            public final boolean mo32329l() {
                return this.f33145b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C13616a.m58274a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f33145b;
                boolean z2 = this.f33146c;
                Set<SecurityRule> set = this.f33147d;
                return "PasswordValidation(isValidPassword=" + z + ", isValidOldPassword=" + z2 + ", validatedRules=" + set + ")";
            }

            public C13619d(boolean z, boolean z2, @C12579k Set<? extends SecurityRule> set) {
                Intrinsics.checkNotNullParameter(set, "validatedRules");
                this.f33145b = z;
                this.f33146c = z2;
                this.f33147d = set;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C13619d(boolean z, boolean z2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C10930d1.m40892k() : set);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$c */
    public interface C13620c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$c$a */
        public static final class C13621a implements C13620c {

            /* renamed from: c */
            public static final int f33148c = 0;
            @C12579k

            /* renamed from: a */
            public final String f33149a;
            @C12579k

            /* renamed from: b */
            public final String f33150b;

            public C13621a(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "oldPassword");
                Intrinsics.checkNotNullParameter(str2, C0861a.f2694F);
                this.f33149a = str;
                this.f33150b = str2;
            }

            /* renamed from: d */
            public static /* synthetic */ C13621a m58286d(C13621a aVar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f33149a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.f33150b;
                }
                return aVar.mo32333c(str, str2);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32331a() {
                return this.f33149a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo32332b() {
                return this.f33150b;
            }

            @C12579k
            /* renamed from: c */
            public final C13621a mo32333c(@C12579k String str, @C12579k String str2) {
                Intrinsics.checkNotNullParameter(str, "oldPassword");
                Intrinsics.checkNotNullParameter(str2, C0861a.f2694F);
                return new C13621a(str, str2);
            }

            @C12579k
            /* renamed from: e */
            public final String mo32334e() {
                return this.f33150b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13621a)) {
                    return false;
                }
                C13621a aVar = (C13621a) obj;
                return Intrinsics.areEqual((Object) this.f33149a, (Object) aVar.f33149a) && Intrinsics.areEqual((Object) this.f33150b, (Object) aVar.f33150b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo32336f() {
                return this.f33149a;
            }

            public int hashCode() {
                return (this.f33149a.hashCode() * 31) + this.f33150b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33149a;
                String str2 = this.f33150b;
                return "UpdatePassword(oldPassword=" + str + ", newPassword=" + str2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$c$b */
        public static final class C13622b implements C13620c {

            /* renamed from: c */
            public static final int f33151c = 0;
            @C12579k

            /* renamed from: a */
            public final String f33152a;
            @C12579k

            /* renamed from: b */
            public final Password f33153b;

            public C13622b(@C12579k String str, @C12579k Password password) {
                Intrinsics.checkNotNullParameter(str, "password");
                Intrinsics.checkNotNullParameter(password, "type");
                this.f33152a = str;
                this.f33153b = password;
            }

            /* renamed from: d */
            public static /* synthetic */ C13622b m58292d(C13622b bVar, String str, Password password, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f33152a;
                }
                if ((i & 2) != 0) {
                    password = bVar.f33153b;
                }
                return bVar.mo32341c(str, password);
            }

            @C12579k
            /* renamed from: a */
            public final String mo32339a() {
                return this.f33152a;
            }

            @C12579k
            /* renamed from: b */
            public final Password mo32340b() {
                return this.f33153b;
            }

            @C12579k
            /* renamed from: c */
            public final C13622b mo32341c(@C12579k String str, @C12579k Password password) {
                Intrinsics.checkNotNullParameter(str, "password");
                Intrinsics.checkNotNullParameter(password, "type");
                return new C13622b(str, password);
            }

            @C12579k
            /* renamed from: e */
            public final String mo32342e() {
                return this.f33152a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13622b)) {
                    return false;
                }
                C13622b bVar = (C13622b) obj;
                return Intrinsics.areEqual((Object) this.f33152a, (Object) bVar.f33152a) && this.f33153b == bVar.f33153b;
            }

            @C12579k
            /* renamed from: f */
            public final Password mo32344f() {
                return this.f33153b;
            }

            public int hashCode() {
                return (this.f33152a.hashCode() * 31) + this.f33153b.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f33152a;
                Password password = this.f33153b;
                return "ValidatePassword(password=" + str + ", type=" + password + ")";
            }
        }
    }
}
