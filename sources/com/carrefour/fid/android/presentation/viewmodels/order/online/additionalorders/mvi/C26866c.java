package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c */
public final class C26866c {
    @C12579k

    /* renamed from: a */
    public static final C26866c f65481a = new C26866c();

    /* renamed from: b */
    public static final int f65482b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a */
    public interface C26867a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$a$a */
        public static final class C26868a implements C26867a {

            /* renamed from: b */
            public static final int f65483b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f65484a;

            public C26868a(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f65484a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C26868a m113913c(C26868a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f65484a;
                }
                return aVar.mo78012b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo78011a() {
                return this.f65484a;
            }

            @C12579k
            /* renamed from: b */
            public final C26868a mo78012b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C26868a(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo78013d() {
                return this.f65484a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26868a) && Intrinsics.areEqual((Object) this.f65484a, (Object) ((C26868a) obj).f65484a);
            }

            public int hashCode() {
                return this.f65484a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f65484a;
                return "Error(throwable=" + th + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$b */
    public static final class C26869b implements C28505u.C28509d {

        /* renamed from: d */
        public static final int f65485d = 8;

        /* renamed from: b */
        public final boolean f65486b;
        @C12580l

        /* renamed from: c */
        public final C38529u f65487c;

        public C26869b() {
            this(false, (C38529u) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public static /* synthetic */ C26869b m113917h(C26869b bVar, boolean z, C38529u uVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f65486b;
            }
            if ((i & 2) != 0) {
                uVar = bVar.f65487c;
            }
            return bVar.mo78020g(z, uVar);
        }

        /* renamed from: e */
        public final boolean mo78017e() {
            return this.f65486b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26869b)) {
                return false;
            }
            C26869b bVar = (C26869b) obj;
            return this.f65486b == bVar.f65486b && Intrinsics.areEqual((Object) this.f65487c, (Object) bVar.f65487c);
        }

        @C12580l
        /* renamed from: f */
        public final C38529u mo78019f() {
            return this.f65487c;
        }

        @C12579k
        /* renamed from: g */
        public final C26869b mo78020g(boolean z, @C12580l C38529u uVar) {
            return new C26869b(z, uVar);
        }

        public int hashCode() {
            boolean z = this.f65486b;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            C38529u uVar = this.f65487c;
            return i + (uVar == null ? 0 : uVar.hashCode());
        }

        /* renamed from: i */
        public final boolean mo78022i() {
            return this.f65486b;
        }

        @C12580l
        /* renamed from: j */
        public final C38529u mo78023j() {
            return this.f65487c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f65486b;
            C38529u uVar = this.f65487c;
            return "UiState(loading=" + z + ", suggestions=" + uVar + ")";
        }

        public C26869b(boolean z, @C12580l C38529u uVar) {
            this.f65486b = z;
            this.f65487c = uVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26869b(boolean z, C38529u uVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uVar);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$c */
    public interface C26870c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$c$a */
        public static final class C26871a implements C26870c {

            /* renamed from: b */
            public static final int f65488b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65489a;

            public C26871a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "terms");
                this.f65489a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26871a m113923c(C26871a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f65489a;
                }
                return aVar.mo78026b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78025a() {
                return this.f65489a;
            }

            @C12579k
            /* renamed from: b */
            public final C26871a mo78026b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "terms");
                return new C26871a(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo78027d() {
                return this.f65489a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26871a) && Intrinsics.areEqual((Object) this.f65489a, (Object) ((C26871a) obj).f65489a);
            }

            public int hashCode() {
                return this.f65489a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65489a;
                return "AddToSearchHistory(terms=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$c$b */
        public static final class C26872b implements C26870c {
            @C12579k

            /* renamed from: a */
            public static final C26872b f65490a = new C26872b();

            /* renamed from: b */
            public static final int f65491b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$c$c */
        public static final class C26873c implements C26870c {

            /* renamed from: b */
            public static final int f65492b = 0;
            @C12579k

            /* renamed from: a */
            public final String f65493a;

            public C26873c(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "terms");
                this.f65493a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C26873c m113927c(C26873c cVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f65493a;
                }
                return cVar.mo78032b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo78031a() {
                return this.f65493a;
            }

            @C12579k
            /* renamed from: b */
            public final C26873c mo78032b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "terms");
                return new C26873c(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo78033d() {
                return this.f65493a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26873c) && Intrinsics.areEqual((Object) this.f65493a, (Object) ((C26873c) obj).f65493a);
            }

            public int hashCode() {
                return this.f65493a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f65493a;
                return "GetSuggestionsFromTerms(terms=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.c$c$d */
        public static final class C26874d implements C26870c {
            @C12579k

            /* renamed from: a */
            public static final C26874d f65494a = new C26874d();

            /* renamed from: b */
            public static final int f65495b = 0;
        }
    }
}
