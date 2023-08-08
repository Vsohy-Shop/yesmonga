package com.carrefour.fid.android.presentation.viewmodels.product.search.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c */
public final class C27323c {
    @C12579k

    /* renamed from: a */
    public static final C27323c f66360a = new C27323c();

    /* renamed from: b */
    public static final int f66361b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$a */
    public interface C27324a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$a$a */
        public static final class C27325a implements C27324a {
            @C12579k

            /* renamed from: a */
            public static final C27325a f66362a = new C27325a();

            /* renamed from: b */
            public static final int f66363b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$a$b */
        public static final class C27326b implements C27324a {
            @C12579k

            /* renamed from: a */
            public static final C27326b f66364a = new C27326b();

            /* renamed from: b */
            public static final int f66365b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b */
    public interface C27327b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$a */
        public static final class C27328a implements C27327b {

            /* renamed from: b */
            public static final int f66366b = 8;
            @C12579k

            /* renamed from: a */
            public final Set<String> f66367a;

            public C27328a(@C12579k Set<String> set) {
                Intrinsics.checkNotNullParameter(set, "searchListItems");
                this.f66367a = set;
            }

            /* renamed from: c */
            public static /* synthetic */ C27328a m115254c(C27328a aVar, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = aVar.f66367a;
                }
                return aVar.mo79522b(set);
            }

            @C12579k
            /* renamed from: a */
            public final Set<String> mo79521a() {
                return this.f66367a;
            }

            @C12579k
            /* renamed from: b */
            public final C27328a mo79522b(@C12579k Set<String> set) {
                Intrinsics.checkNotNullParameter(set, "searchListItems");
                return new C27328a(set);
            }

            @C12579k
            /* renamed from: d */
            public final Set<String> mo79523d() {
                return this.f66367a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27328a) && Intrinsics.areEqual((Object) this.f66367a, (Object) ((C27328a) obj).f66367a);
            }

            public int hashCode() {
                return this.f66367a.hashCode();
            }

            @C12579k
            public String toString() {
                Set<String> set = this.f66367a;
                return "ApplySavedSearchList(searchListItems=" + set + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$b */
        public static final class C27329b implements C27327b {

            /* renamed from: b */
            public static final int f66368b = 8;
            @C12579k

            /* renamed from: a */
            public final C27324a f66369a;

            public C27329b(@C12579k C27324a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                this.f66369a = aVar;
            }

            /* renamed from: c */
            public static /* synthetic */ C27329b m115258c(C27329b bVar, C27324a aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = bVar.f66369a;
                }
                return bVar.mo79528b(aVar);
            }

            @C12579k
            /* renamed from: a */
            public final C27324a mo79527a() {
                return this.f66369a;
            }

            @C12579k
            /* renamed from: b */
            public final C27329b mo79528b(@C12579k C27324a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "error");
                return new C27329b(aVar);
            }

            @C12579k
            /* renamed from: d */
            public final C27324a mo79529d() {
                return this.f66369a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27329b) && Intrinsics.areEqual((Object) this.f66369a, (Object) ((C27329b) obj).f66369a);
            }

            public int hashCode() {
                return this.f66369a.hashCode();
            }

            @C12579k
            public String toString() {
                C27324a aVar = this.f66369a;
                return "Error(error=" + aVar + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$b$c */
        public static final class C27330c implements C27327b {

            /* renamed from: b */
            public static final int f66370b = 8;
            @C12579k

            /* renamed from: a */
            public final HashMap<String, List<String>> f66371a;

            public C27330c(@C12579k HashMap<String, List<String>> hashMap) {
                Intrinsics.checkNotNullParameter(hashMap, "offers");
                this.f66371a = hashMap;
            }

            /* renamed from: c */
            public static /* synthetic */ C27330c m115262c(C27330c cVar, HashMap<String, List<String>> hashMap, int i, Object obj) {
                if ((i & 1) != 0) {
                    hashMap = cVar.f66371a;
                }
                return cVar.mo79534b(hashMap);
            }

            @C12579k
            /* renamed from: a */
            public final HashMap<String, List<String>> mo79533a() {
                return this.f66371a;
            }

            @C12579k
            /* renamed from: b */
            public final C27330c mo79534b(@C12579k HashMap<String, List<String>> hashMap) {
                Intrinsics.checkNotNullParameter(hashMap, "offers");
                return new C27330c(hashMap);
            }

            @C12579k
            /* renamed from: d */
            public final HashMap<String, List<String>> mo79535d() {
                return this.f66371a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27330c) && Intrinsics.areEqual((Object) this.f66371a, (Object) ((C27330c) obj).f66371a);
            }

            public int hashCode() {
                return this.f66371a.hashCode();
            }

            @C12579k
            public String toString() {
                HashMap<String, List<String>> hashMap = this.f66371a;
                return "NavigateToSearchWithListResultsPage(offers=" + hashMap + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$c */
    public static final class C27331c implements C28505u.C28509d {

        /* renamed from: c */
        public static final int f66372c = 0;

        /* renamed from: b */
        public final boolean f66373b;

        public C27331c() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C27331c m115266g(C27331c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cVar.f66373b;
            }
            return cVar.mo79541f(z);
        }

        /* renamed from: e */
        public final boolean mo79539e() {
            return this.f66373b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27331c) && this.f66373b == ((C27331c) obj).f66373b;
        }

        @C12579k
        /* renamed from: f */
        public final C27331c mo79541f(boolean z) {
            return new C27331c(z);
        }

        public int hashCode() {
            boolean z = this.f66373b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isLoading() {
            return this.f66373b;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            boolean z = this.f66373b;
            return "UiState(isLoading=" + z + ")";
        }

        public C27331c(boolean z) {
            this.f66373b = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27331c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$d */
    public static abstract class C27332d implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f66374a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$d$a */
        public static final class C27333a extends C27332d {
            @C12579k

            /* renamed from: b */
            public static final C27333a f66375b = new C27333a();

            /* renamed from: c */
            public static final int f66376c = 0;

            public C27333a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$d$b */
        public static final class C27334b extends C27332d {

            /* renamed from: c */
            public static final int f66377c = 8;
            @C12579k

            /* renamed from: b */
            public final Set<String> f66378b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27334b(@C12579k Set<String> set) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(set, "searchListItems");
                this.f66378b = set;
            }

            /* renamed from: c */
            public static /* synthetic */ C27334b m115269c(C27334b bVar, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = bVar.f66378b;
                }
                return bVar.mo79546b(set);
            }

            @C12579k
            /* renamed from: a */
            public final Set<String> mo79545a() {
                return this.f66378b;
            }

            @C12579k
            /* renamed from: b */
            public final C27334b mo79546b(@C12579k Set<String> set) {
                Intrinsics.checkNotNullParameter(set, "searchListItems");
                return new C27334b(set);
            }

            @C12579k
            /* renamed from: d */
            public final Set<String> mo79547d() {
                return this.f66378b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27334b) && Intrinsics.areEqual((Object) this.f66378b, (Object) ((C27334b) obj).f66378b);
            }

            public int hashCode() {
                return this.f66378b.hashCode();
            }

            @C12579k
            public String toString() {
                Set<String> set = this.f66378b;
                return "SaveSearchList(searchListItems=" + set + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.mvi.c$d$c */
        public static final class C27335c extends C27332d {

            /* renamed from: c */
            public static final int f66379c = 8;
            @C12579k

            /* renamed from: b */
            public final Set<String> f66380b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27335c(@C12579k Set<String> set) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(set, "searchListItems");
                this.f66380b = set;
            }

            /* renamed from: c */
            public static /* synthetic */ C27335c m115273c(C27335c cVar, Set<String> set, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = cVar.f66380b;
                }
                return cVar.mo79552b(set);
            }

            @C12579k
            /* renamed from: a */
            public final Set<String> mo79551a() {
                return this.f66380b;
            }

            @C12579k
            /* renamed from: b */
            public final C27335c mo79552b(@C12579k Set<String> set) {
                Intrinsics.checkNotNullParameter(set, "searchListItems");
                return new C27335c(set);
            }

            @C12579k
            /* renamed from: d */
            public final Set<String> mo79553d() {
                return this.f66380b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27335c) && Intrinsics.areEqual((Object) this.f66380b, (Object) ((C27335c) obj).f66380b);
            }

            public int hashCode() {
                return this.f66380b.hashCode();
            }

            @C12579k
            public String toString() {
                Set<String> set = this.f66380b;
                return "SeeResults(searchListItems=" + set + ")";
            }
        }

        public /* synthetic */ C27332d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C27332d() {
        }
    }
}
