package com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.catalogs.core.type.CatalogsType;
import com.carrefour.fid.android.catalogs.presentation.models.C39449b;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d */
public final class C39675d {
    @C12579k

    /* renamed from: a */
    public static final C39675d f101297a = new C39675d();

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$a */
    public interface C39676a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$a$a */
        public static final class C39677a implements C39676a {
            @C12579k

            /* renamed from: a */
            public static final C39677a f101298a = new C39677a();

            /* renamed from: b */
            public static final int f101299b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$a$b */
        public static final class C39678b implements C39676a {

            /* renamed from: b */
            public static final int f101300b = 0;
            @C12579k

            /* renamed from: a */
            public final String f101301a;

            public C39678b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                this.f101301a = str;
            }

            /* renamed from: c */
            public static /* synthetic */ C39678b m162118c(C39678b bVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f101301a;
                }
                return bVar.mo130965b(str);
            }

            @C12579k
            /* renamed from: a */
            public final String mo130964a() {
                return this.f101301a;
            }

            @C12579k
            /* renamed from: b */
            public final C39678b mo130965b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "url");
                return new C39678b(str);
            }

            @C12579k
            /* renamed from: d */
            public final String mo130966d() {
                return this.f101301a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39678b) && Intrinsics.areEqual((Object) this.f101301a, (Object) ((C39678b) obj).f101301a);
            }

            public int hashCode() {
                return this.f101301a.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f101301a;
                return "LaunchCriteo(url=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$a$c */
        public static final class C39679c implements C39676a {

            /* renamed from: b */
            public static final int f101302b = 8;
            @C12579k

            /* renamed from: a */
            public final Catalog f101303a;

            public C39679c(@C12579k Catalog catalog) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                this.f101303a = catalog;
            }

            /* renamed from: c */
            public static /* synthetic */ C39679c m162122c(C39679c cVar, Catalog catalog, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalog = cVar.f101303a;
                }
                return cVar.mo130971b(catalog);
            }

            @C12579k
            /* renamed from: a */
            public final Catalog mo130970a() {
                return this.f101303a;
            }

            @C12579k
            /* renamed from: b */
            public final C39679c mo130971b(@C12579k Catalog catalog) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                return new C39679c(catalog);
            }

            @C12579k
            /* renamed from: d */
            public final Catalog mo130972d() {
                return this.f101303a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39679c) && Intrinsics.areEqual((Object) this.f101303a, (Object) ((C39679c) obj).f101303a);
            }

            public int hashCode() {
                return this.f101303a.hashCode();
            }

            @C12579k
            public String toString() {
                Catalog catalog = this.f101303a;
                return "ShowCatalogDetails(catalog=" + catalog + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$a$d */
        public static final class C39680d implements C39676a {
            @C12579k

            /* renamed from: a */
            public static final C39680d f101304a = new C39680d();

            /* renamed from: b */
            public static final int f101305b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b */
    public interface C39681b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$a */
        public static final class C39682a implements C39681b {

            /* renamed from: e */
            public static final int f101306e = 8;
            @C12580l

            /* renamed from: b */
            public final C38163l f101307b;
            @C12580l

            /* renamed from: c */
            public final List<C39449b> f101308c;
            @C12579k

            /* renamed from: d */
            public final List<CatalogsType> f101309d;

            public C39682a() {
                this((C38163l) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
            }

            /* renamed from: i */
            public static /* synthetic */ C39682a m162126i(C39682a aVar, C38163l lVar, List<C39449b> list, List<CatalogsType> list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    lVar = aVar.f101307b;
                }
                if ((i & 2) != 0) {
                    list = aVar.f101308c;
                }
                if ((i & 4) != 0) {
                    list2 = aVar.f101309d;
                }
                return aVar.mo130980h(lVar, list, list2);
            }

            @C12580l
            /* renamed from: e */
            public final C38163l mo130976e() {
                return this.f101307b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39682a)) {
                    return false;
                }
                C39682a aVar = (C39682a) obj;
                return Intrinsics.areEqual((Object) this.f101307b, (Object) aVar.f101307b) && Intrinsics.areEqual((Object) this.f101308c, (Object) aVar.f101308c) && Intrinsics.areEqual((Object) this.f101309d, (Object) aVar.f101309d);
            }

            @C12580l
            /* renamed from: f */
            public final List<C39449b> mo130978f() {
                return this.f101308c;
            }

            @C12579k
            /* renamed from: g */
            public final List<CatalogsType> mo130979g() {
                return this.f101309d;
            }

            @C12579k
            /* renamed from: h */
            public final C39682a mo130980h(@C12580l C38163l lVar, @C12580l List<? extends C39449b> list, @C12579k List<? extends CatalogsType> list2) {
                Intrinsics.checkNotNullParameter(list2, "catalogTabList");
                return new C39682a(lVar, list, list2);
            }

            public int hashCode() {
                C38163l lVar = this.f101307b;
                int i = 0;
                int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
                List<C39449b> list = this.f101308c;
                if (list != null) {
                    i = list.hashCode();
                }
                return ((hashCode + i) * 31) + this.f101309d.hashCode();
            }

            @C12580l
            /* renamed from: j */
            public final List<C39449b> mo130982j() {
                return this.f101308c;
            }

            @C12579k
            /* renamed from: k */
            public final List<CatalogsType> mo130983k() {
                return this.f101309d;
            }

            @C12580l
            /* renamed from: l */
            public final C38163l mo130984l() {
                return this.f101307b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39683b.m162134a(this);
            }

            @C12579k
            public String toString() {
                C38163l lVar = this.f101307b;
                List<C39449b> list = this.f101308c;
                List<CatalogsType> list2 = this.f101309d;
                return "CatalogsContentPage(store=" + lVar + ", catalogList=" + list + ", catalogTabList=" + list2 + ")";
            }

            public C39682a(@C12580l C38163l lVar, @C12580l List<? extends C39449b> list, @C12579k List<? extends CatalogsType> list2) {
                Intrinsics.checkNotNullParameter(list2, "catalogTabList");
                this.f101307b = lVar;
                this.f101308c = list;
                this.f101309d = list2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39682a(C38163l lVar, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2);
            }
        }

        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$b */
        public static final class C39683b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m162134a(@C12579k C39681b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$c */
        public static final class C39684c implements C39681b {
            @C12579k

            /* renamed from: b */
            public static final C39684c f101310b = new C39684c();

            /* renamed from: c */
            public static final int f101311c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39683b.m162134a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$b$d */
        public static final class C39685d implements C39681b {

            /* renamed from: c */
            public static final int f101312c = 0;

            /* renamed from: b */
            public final boolean f101313b;

            public C39685d() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C39685d m162135g(C39685d dVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = dVar.f101313b;
                }
                return dVar.mo130988f(z);
            }

            /* renamed from: e */
            public final boolean mo130986e() {
                return this.f101313b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39685d) && this.f101313b == ((C39685d) obj).f101313b;
            }

            @C12579k
            /* renamed from: f */
            public final C39685d mo130988f(boolean z) {
                return new C39685d(z);
            }

            public int hashCode() {
                boolean z = this.f101313b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f101313b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39683b.m162134a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f101313b;
                return "Loading(isLoading=" + z + ")";
            }

            public C39685d(boolean z) {
                this.f101313b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39685d(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c */
    public interface C39686c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$a */
        public static final class C39687a implements C39686c {
            @C12579k

            /* renamed from: a */
            public static final C39687a f101314a = new C39687a();

            /* renamed from: b */
            public static final int f101315b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$b */
        public static final class C39688b implements C39686c {
            @C12579k

            /* renamed from: a */
            public static final C39688b f101316a = new C39688b();

            /* renamed from: b */
            public static final int f101317b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$c */
        public static final class C39689c implements C39686c {

            /* renamed from: b */
            public static final int f101318b = 0;

            /* renamed from: a */
            public final boolean f101319a;

            public C39689c() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: c */
            public static /* synthetic */ C39689c m162138c(C39689c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f101319a;
                }
                return cVar.mo130993b(z);
            }

            /* renamed from: a */
            public final boolean mo130992a() {
                return this.f101319a;
            }

            @C12579k
            /* renamed from: b */
            public final C39689c mo130993b(boolean z) {
                return new C39689c(z);
            }

            /* renamed from: d */
            public final boolean mo130994d() {
                return this.f101319a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39689c) && this.f101319a == ((C39689c) obj).f101319a;
            }

            public int hashCode() {
                boolean z = this.f101319a;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C12579k
            public String toString() {
                boolean z = this.f101319a;
                return "InitContent(forceStoreDisplayIfAvailable=" + z + ")";
            }

            public C39689c(boolean z) {
                this.f101319a = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39689c(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$d */
        public static final class C39690d implements C39686c {
            @C12579k

            /* renamed from: a */
            public static final C39690d f101320a = new C39690d();

            /* renamed from: b */
            public static final int f101321b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.d$c$e */
        public static final class C39691e implements C39686c {
            @C12579k

            /* renamed from: a */
            public static final C39691e f101322a = new C39691e();

            /* renamed from: b */
            public static final int f101323b = 0;
        }
    }
}
