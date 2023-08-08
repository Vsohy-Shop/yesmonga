package com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a */
public final class C26522a {
    @C12579k

    /* renamed from: a */
    public static final C26522a f64821a = new C26522a();

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a */
    public interface C26523a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$a */
        public static final class C26524a implements C26523a {
            @C12579k

            /* renamed from: a */
            public static final C26524a f64822a = new C26524a();

            /* renamed from: b */
            public static final int f64823b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$b */
        public static final class C26525b implements C26523a {
            @C12579k

            /* renamed from: a */
            public static final C26525b f64824a = new C26525b();

            /* renamed from: b */
            public static final int f64825b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$c */
        public static final class C26526c implements C26523a {
            @C12579k

            /* renamed from: a */
            public static final C26526c f64826a = new C26526c();

            /* renamed from: b */
            public static final int f64827b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b */
    public interface C26527b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a */
        public static final class C26528a implements C26527b {

            /* renamed from: b */
            public static final int f64828b = 8;
            @C12579k

            /* renamed from: a */
            public final C26523a f64829a;

            public C26528a(@C12579k C26523a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                this.f64829a = aVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C26528a m112987c(C26528a aVar, C26523a aVar2, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar2 = aVar.f64829a;
                }
                return aVar.mo77129b(aVar2);
            }

            @C12579k
            /* renamed from: a */
            public final C26523a mo77128a() {
                return this.f64829a;
            }

            @C12579k
            /* renamed from: b */
            public final C26528a mo77129b(@C12579k C26523a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                return new C26528a(aVar);
            }

            @C12579k
            /* renamed from: d */
            public final C26523a mo77130d() {
                return this.f64829a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26528a) && Intrinsics.areEqual((Object) this.f64829a, (Object) ((C26528a) obj).f64829a);
            }

            public int hashCode() {
                return this.f64829a.hashCode();
            }

            @C12579k
            public String toString() {
                C26523a aVar = this.f64829a;
                return "Error(error=" + aVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$b */
        public static final class C26529b implements C26527b {
            @C12579k

            /* renamed from: a */
            public static final C26529b f64830a = new C26529b();

            /* renamed from: b */
            public static final int f64831b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$c */
        public static final class C26530c implements C26527b {

            /* renamed from: b */
            public static final int f64832b = 0;

            /* renamed from: a */
            public final boolean f64833a;

            public C26530c(boolean z) {
                this.f64833a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26530c m112991c(C26530c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f64833a;
                }
                return cVar.mo77135b(z);
            }

            /* renamed from: a */
            public final boolean mo77134a() {
                return this.f64833a;
            }

            @C12579k
            /* renamed from: b */
            public final C26530c mo77135b(boolean z) {
                return new C26530c(z);
            }

            /* renamed from: d */
            public final boolean mo77136d() {
                return this.f64833a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26530c) && this.f64833a == ((C26530c) obj).f64833a;
            }

            public int hashCode() {
                boolean z = this.f64833a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64833a;
                return "OnBackPressedEvent(selectionChanged=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$d */
        public static final class C26531d implements C26527b {

            /* renamed from: c */
            public static final int f64834c = 8;
            @C12579k

            /* renamed from: a */
            public final List<DataPrimeCmsResponse> f64835a;
            @C12579k

            /* renamed from: b */
            public final String f64836b;

            public C26531d(@C12579k List<DataPrimeCmsResponse> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "primes");
                Intrinsics.checkNotNullParameter(str, "accountName");
                this.f64835a = list;
                this.f64836b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C26531d m112995d(C26531d dVar, List<DataPrimeCmsResponse> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f64835a;
                }
                if ((i & 2) != 0) {
                    str = dVar.f64836b;
                }
                return dVar.mo77142c(list, str);
            }

            @C12579k
            /* renamed from: a */
            public final List<DataPrimeCmsResponse> mo77140a() {
                return this.f64835a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo77141b() {
                return this.f64836b;
            }

            @C12579k
            /* renamed from: c */
            public final C26531d mo77142c(@C12579k List<DataPrimeCmsResponse> list, @C12579k String str) {
                Intrinsics.checkNotNullParameter(list, "primes");
                Intrinsics.checkNotNullParameter(str, "accountName");
                return new C26531d(list, str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo77143e() {
                return this.f64836b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26531d)) {
                    return false;
                }
                C26531d dVar = (C26531d) obj;
                return Intrinsics.areEqual((Object) this.f64835a, (Object) dVar.f64835a) && Intrinsics.areEqual((Object) this.f64836b, (Object) dVar.f64836b);
            }

            @C12579k
            /* renamed from: f */
            public final List<DataPrimeCmsResponse> mo77145f() {
                return this.f64835a;
            }

            public int hashCode() {
                return (this.f64835a.hashCode() * 31) + this.f64836b.hashCode();
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f64835a;
                String str = this.f64836b;
                return "PrimeSubmitEvent(primes=" + list + ", accountName=" + str + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c */
    public static final class C26532c implements C28505u.C28509d {

        /* renamed from: f */
        public static final int f64837f = 8;

        /* renamed from: b */
        public final boolean f64838b;
        @C12579k

        /* renamed from: c */
        public final List<DataPrimeCmsResponse> f64839c;

        /* renamed from: d */
        public final boolean f64840d;

        /* renamed from: e */
        public final boolean f64841e;

        public C26532c() {
            this(false, (List) null, false, false, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: j */
        public static /* synthetic */ C26532c m113001j(C26532c cVar, boolean z, List<DataPrimeCmsResponse> list, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f64838b;
            }
            if ((i & 2) != 0) {
                list = cVar.f64839c;
            }
            if ((i & 4) != 0) {
                z2 = cVar.f64840d;
            }
            if ((i & 8) != 0) {
                z3 = cVar.f64841e;
            }
            return cVar.mo77154i(z, list, z2, z3);
        }

        /* renamed from: e */
        public final boolean mo77148e() {
            return this.f64838b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26532c)) {
                return false;
            }
            C26532c cVar = (C26532c) obj;
            return this.f64838b == cVar.f64838b && Intrinsics.areEqual((Object) this.f64839c, (Object) cVar.f64839c) && this.f64840d == cVar.f64840d && this.f64841e == cVar.f64841e;
        }

        @C12579k
        /* renamed from: f */
        public final List<DataPrimeCmsResponse> mo77150f() {
            return this.f64839c;
        }

        /* renamed from: g */
        public final boolean mo77151g() {
            return this.f64840d;
        }

        /* renamed from: h */
        public final boolean mo77152h() {
            return this.f64841e;
        }

        public int hashCode() {
            boolean z = this.f64838b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f64839c.hashCode()) * 31;
            boolean z3 = this.f64840d;
            if (z3) {
                z3 = true;
            }
            int i = (hashCode + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f64841e;
            if (!z4) {
                z2 = z4;
            }
            return i + (z2 ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final C26532c mo77154i(boolean z, @C12579k List<DataPrimeCmsResponse> list, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(list, "primes");
            return new C26532c(z, list, z2, z3);
        }

        public final boolean isLoading() {
            return this.f64838b;
        }

        @C12579k
        /* renamed from: k */
        public final List<DataPrimeCmsResponse> mo77156k() {
            return this.f64839c;
        }

        /* renamed from: l */
        public final boolean mo77157l() {
            return this.f64841e;
        }

        /* renamed from: m */
        public final boolean mo77158m() {
            return this.f64840d;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f64838b;
            List<DataPrimeCmsResponse> list = this.f64839c;
            boolean z2 = this.f64840d;
            boolean z3 = this.f64841e;
            return "UiState(isLoading=" + z + ", primes=" + list + ", isSubmitPending=" + z2 + ", submitEnabled=" + z3 + ")";
        }

        public C26532c(boolean z, @C12579k List<DataPrimeCmsResponse> list, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(list, "primes");
            this.f64838b = z;
            this.f64839c = list;
            this.f64840d = z2;
            this.f64841e = z3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26532c(boolean z, List list, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d */
    public interface C26533d extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$a */
        public static final class C26534a implements C26533d {

            /* renamed from: b */
            public static final int f64842b = 8;
            @C12579k

            /* renamed from: a */
            public final List<DataPrimeCmsResponse> f64843a;

            public C26534a(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                this.f64843a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C26534a m113010c(C26534a aVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f64843a;
                }
                return aVar.mo77161b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<DataPrimeCmsResponse> mo77160a() {
                return this.f64843a;
            }

            @C12579k
            /* renamed from: b */
            public final C26534a mo77161b(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                return new C26534a(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<DataPrimeCmsResponse> mo77162d() {
                return this.f64843a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26534a) && Intrinsics.areEqual((Object) this.f64843a, (Object) ((C26534a) obj).f64843a);
            }

            public int hashCode() {
                return this.f64843a.hashCode();
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f64843a;
                return "BackPressed(primes=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$b */
        public static final class C26535b implements C26533d {
            @C12579k

            /* renamed from: a */
            public static final C26535b f64844a = new C26535b();

            /* renamed from: b */
            public static final int f64845b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$c */
        public static final class C26536c implements C26533d {

            /* renamed from: b */
            public static final int f64846b = 0;

            /* renamed from: a */
            public final boolean f64847a;

            public C26536c(boolean z) {
                this.f64847a = z;
            }

            /* renamed from: c */
            public static /* synthetic */ C26536c m113014c(C26536c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f64847a;
                }
                return cVar.mo77167b(z);
            }

            /* renamed from: a */
            public final boolean mo77166a() {
                return this.f64847a;
            }

            @C12579k
            /* renamed from: b */
            public final C26536c mo77167b(boolean z) {
                return new C26536c(z);
            }

            /* renamed from: d */
            public final boolean mo77168d() {
                return this.f64847a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26536c) && this.f64847a == ((C26536c) obj).f64847a;
            }

            public int hashCode() {
                boolean z = this.f64847a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f64847a;
                return "FetchLoyaltyClub(withLoyaltyClub=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$d */
        public static final class C26537d implements C26533d {
            @C12579k

            /* renamed from: a */
            public static final C26537d f64848a = new C26537d();

            /* renamed from: b */
            public static final int f64849b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$e */
        public static final class C26538e implements C26533d {

            /* renamed from: b */
            public static final int f64850b = 8;
            @C12579k

            /* renamed from: a */
            public final List<DataPrimeCmsResponse> f64851a;

            public C26538e(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                this.f64851a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C26538e m113018c(C26538e eVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = eVar.f64851a;
                }
                return eVar.mo77173b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<DataPrimeCmsResponse> mo77172a() {
                return this.f64851a;
            }

            @C12579k
            /* renamed from: b */
            public final C26538e mo77173b(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                return new C26538e(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<DataPrimeCmsResponse> mo77174d() {
                return this.f64851a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26538e) && Intrinsics.areEqual((Object) this.f64851a, (Object) ((C26538e) obj).f64851a);
            }

            public int hashCode() {
                return this.f64851a.hashCode();
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f64851a;
                return "InitPrimes(primes=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$f */
        public static final class C26539f implements C26533d {

            /* renamed from: b */
            public static final int f64852b = 8;
            @C12579k

            /* renamed from: a */
            public final List<DataPrimeCmsResponse> f64853a;

            public C26539f(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                this.f64853a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C26539f m113022c(C26539f fVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = fVar.f64853a;
                }
                return fVar.mo77179b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<DataPrimeCmsResponse> mo77178a() {
                return this.f64853a;
            }

            @C12579k
            /* renamed from: b */
            public final C26539f mo77179b(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                return new C26539f(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<DataPrimeCmsResponse> mo77180d() {
                return this.f64853a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26539f) && Intrinsics.areEqual((Object) this.f64853a, (Object) ((C26539f) obj).f64853a);
            }

            public int hashCode() {
                return this.f64853a.hashCode();
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f64853a;
                return "SelectedPrimesChanged(primes=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$g */
        public static final class C26540g implements C26533d {

            /* renamed from: b */
            public static final int f64854b = 8;
            @C12579k

            /* renamed from: a */
            public final List<DataPrimeCmsResponse> f64855a;

            public C26540g(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                this.f64855a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C26540g m113026c(C26540g gVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = gVar.f64855a;
                }
                return gVar.mo77185b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<DataPrimeCmsResponse> mo77184a() {
                return this.f64855a;
            }

            @C12579k
            /* renamed from: b */
            public final C26540g mo77185b(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                return new C26540g(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<DataPrimeCmsResponse> mo77186d() {
                return this.f64855a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26540g) && Intrinsics.areEqual((Object) this.f64855a, (Object) ((C26540g) obj).f64855a);
            }

            public int hashCode() {
                return this.f64855a.hashCode();
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f64855a;
                return "SubmitPrimes(primes=" + list + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$d$h */
        public static final class C26541h implements C26533d {

            /* renamed from: b */
            public static final int f64856b = 8;
            @C12579k

            /* renamed from: a */
            public final List<DataPrimeCmsResponse> f64857a;

            public C26541h(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                this.f64857a = list;
            }

            /* renamed from: c */
            public static /* synthetic */ C26541h m113030c(C26541h hVar, List<DataPrimeCmsResponse> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.f64857a;
                }
                return hVar.mo77191b(list);
            }

            @C12579k
            /* renamed from: a */
            public final List<DataPrimeCmsResponse> mo77190a() {
                return this.f64857a;
            }

            @C12579k
            /* renamed from: b */
            public final C26541h mo77191b(@C12579k List<DataPrimeCmsResponse> list) {
                Intrinsics.checkNotNullParameter(list, "primes");
                return new C26541h(list);
            }

            @C12579k
            /* renamed from: d */
            public final List<DataPrimeCmsResponse> mo77192d() {
                return this.f64857a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C26541h) && Intrinsics.areEqual((Object) this.f64857a, (Object) ((C26541h) obj).f64857a);
            }

            public int hashCode() {
                return this.f64857a.hashCode();
            }

            @C12579k
            public String toString() {
                List<DataPrimeCmsResponse> list = this.f64857a;
                return "UpdatePrimes(primes=" + list + ")";
            }
        }
    }
}
