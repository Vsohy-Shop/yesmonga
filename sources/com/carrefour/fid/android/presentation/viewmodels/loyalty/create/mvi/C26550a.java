package com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a */
public final class C26550a {
    @C12579k

    /* renamed from: a */
    public static final C26550a f64865a = new C26550a();

    /* renamed from: b */
    public static final int f64866b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$a */
    public static final class C26551a implements C26555e {
        @C12579k

        /* renamed from: a */
        public static final C26551a f64867a = new C26551a();

        /* renamed from: b */
        public static final int f64868b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$b */
    public static final class C26552b implements C26554d {

        /* renamed from: b */
        public static final int f64869b = 8;
        @C12580l

        /* renamed from: a */
        public final Throwable f64870a;

        public C26552b(@C12580l Throwable th) {
            this.f64870a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C26552b m113050c(C26552b bVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = bVar.f64870a;
            }
            return bVar.mo77206b(th);
        }

        @C12580l
        /* renamed from: a */
        public final Throwable mo77205a() {
            return this.f64870a;
        }

        @C12579k
        /* renamed from: b */
        public final C26552b mo77206b(@C12580l Throwable th) {
            return new C26552b(th);
        }

        @C12580l
        /* renamed from: d */
        public final Throwable mo77207d() {
            return this.f64870a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26552b) && Intrinsics.areEqual((Object) this.f64870a, (Object) ((C26552b) obj).f64870a);
        }

        public int hashCode() {
            Throwable th = this.f64870a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f64870a;
            return "LoyaltyError(throwable=" + th + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$c */
    public static final class C26553c implements C28505u.C28509d {

        /* renamed from: d */
        public static final int f64871d = 0;

        /* renamed from: b */
        public final boolean f64872b;
        @C12579k

        /* renamed from: c */
        public final String f64873c;

        public C26553c() {
            this(false, (String) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public static /* synthetic */ C26553c m113054h(C26553c cVar, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f64872b;
            }
            if ((i & 2) != 0) {
                str = cVar.f64873c;
            }
            return cVar.mo77214g(z, str);
        }

        /* renamed from: e */
        public final boolean mo77211e() {
            return this.f64872b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26553c)) {
                return false;
            }
            C26553c cVar = (C26553c) obj;
            return this.f64872b == cVar.f64872b && Intrinsics.areEqual((Object) this.f64873c, (Object) cVar.f64873c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo77213f() {
            return this.f64873c;
        }

        @C12579k
        /* renamed from: g */
        public final C26553c mo77214g(boolean z, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyCGU");
            return new C26553c(z, str);
        }

        public int hashCode() {
            boolean z = this.f64872b;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f64873c.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo77216i() {
            return this.f64873c;
        }

        public final boolean isLoading() {
            return this.f64872b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f64872b;
            String str = this.f64873c;
            return "UIState(isLoading=" + z + ", loyaltyCGU=" + str + ")";
        }

        public C26553c(boolean z, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyCGU");
            this.f64872b = z;
            this.f64873c = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26553c(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new String() : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$d */
    public interface C26554d extends C28505u.C28506a {
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.a$e */
    public interface C26555e extends C28505u.C28507b {
    }
}
