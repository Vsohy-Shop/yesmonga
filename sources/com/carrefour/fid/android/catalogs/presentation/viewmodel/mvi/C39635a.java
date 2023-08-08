package com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.C23948c;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a */
public final class C39635a {
    @C12579k

    /* renamed from: a */
    public static final C39635a f101236a = new C39635a();

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$a */
    public interface C39636a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$a$a */
        public static final class C39637a implements C39636a {
            @C12579k

            /* renamed from: a */
            public static final C39637a f101237a = new C39637a();

            /* renamed from: b */
            public static final int f101238b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c */
    public interface C39646c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$a */
        public static final class C39647a implements C39646c {

            /* renamed from: c */
            public static final int f101253c = 8;
            @C12579k

            /* renamed from: a */
            public final Catalog f101254a;
            @C12580l

            /* renamed from: b */
            public final String f101255b;

            public C39647a(@C12579k Catalog catalog, @C12580l String str) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                this.f101254a = catalog;
                this.f101255b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C39647a m162064d(C39647a aVar, Catalog catalog, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalog = aVar.f101254a;
                }
                if ((i & 2) != 0) {
                    str = aVar.f101255b;
                }
                return aVar.mo130894c(catalog, str);
            }

            @C12579k
            /* renamed from: a */
            public final Catalog mo130892a() {
                return this.f101254a;
            }

            @C12580l
            /* renamed from: b */
            public final String mo130893b() {
                return this.f101255b;
            }

            @C12579k
            /* renamed from: c */
            public final C39647a mo130894c(@C12579k Catalog catalog, @C12580l String str) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                return new C39647a(catalog, str);
            }

            @C12579k
            /* renamed from: e */
            public final Catalog mo130895e() {
                return this.f101254a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39647a)) {
                    return false;
                }
                C39647a aVar = (C39647a) obj;
                return Intrinsics.areEqual((Object) this.f101254a, (Object) aVar.f101254a) && Intrinsics.areEqual((Object) this.f101255b, (Object) aVar.f101255b);
            }

            @C12580l
            /* renamed from: f */
            public final String mo130897f() {
                return this.f101255b;
            }

            public int hashCode() {
                int hashCode = this.f101254a.hashCode() * 31;
                String str = this.f101255b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @C12579k
            public String toString() {
                Catalog catalog = this.f101254a;
                String str = this.f101255b;
                return "LoadCatalogProductList(catalog=" + catalog + ", searchContent=" + str + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39647a(Catalog catalog, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(catalog, (i & 2) != 0 ? null : str);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$b */
        public static final class C39648b implements C39646c {

            /* renamed from: b */
            public static final int f101256b = 8;
            @C12579k

            /* renamed from: a */
            public final Catalog f101257a;

            public C39648b(@C12579k Catalog catalog) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                this.f101257a = catalog;
            }

            /* renamed from: c */
            public static /* synthetic */ C39648b m162070c(C39648b bVar, Catalog catalog, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalog = bVar.f101257a;
                }
                return bVar.mo130901b(catalog);
            }

            @C12579k
            /* renamed from: a */
            public final Catalog mo130900a() {
                return this.f101257a;
            }

            @C12579k
            /* renamed from: b */
            public final C39648b mo130901b(@C12579k Catalog catalog) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                return new C39648b(catalog);
            }

            @C12579k
            /* renamed from: d */
            public final Catalog mo130902d() {
                return this.f101257a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39648b) && Intrinsics.areEqual((Object) this.f101257a, (Object) ((C39648b) obj).f101257a);
            }

            public int hashCode() {
                return this.f101257a.hashCode();
            }

            @C12579k
            public String toString() {
                Catalog catalog = this.f101257a;
                return "LoadCatalogStream(catalog=" + catalog + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$c */
        public static final class C39649c implements C39646c {

            /* renamed from: c */
            public static final int f101258c = 8;
            @C12579k

            /* renamed from: a */
            public final Catalog f101259a;
            @C12579k

            /* renamed from: b */
            public final String f101260b;

            public C39649c(@C12579k Catalog catalog, @C12579k String str) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                Intrinsics.checkNotNullParameter(str, "pageNumber");
                this.f101259a = catalog;
                this.f101260b = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C39649c m162074d(C39649c cVar, Catalog catalog, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalog = cVar.f101259a;
                }
                if ((i & 2) != 0) {
                    str = cVar.f101260b;
                }
                return cVar.mo130908c(catalog, str);
            }

            @C12579k
            /* renamed from: a */
            public final Catalog mo130906a() {
                return this.f101259a;
            }

            @C12579k
            /* renamed from: b */
            public final String mo130907b() {
                return this.f101260b;
            }

            @C12579k
            /* renamed from: c */
            public final C39649c mo130908c(@C12579k Catalog catalog, @C12579k String str) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                Intrinsics.checkNotNullParameter(str, "pageNumber");
                return new C39649c(catalog, str);
            }

            @C12579k
            /* renamed from: e */
            public final Catalog mo130909e() {
                return this.f101259a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39649c)) {
                    return false;
                }
                C39649c cVar = (C39649c) obj;
                return Intrinsics.areEqual((Object) this.f101259a, (Object) cVar.f101259a) && Intrinsics.areEqual((Object) this.f101260b, (Object) cVar.f101260b);
            }

            @C12579k
            /* renamed from: f */
            public final String mo130911f() {
                return this.f101260b;
            }

            public int hashCode() {
                return (this.f101259a.hashCode() * 31) + this.f101260b.hashCode();
            }

            @C12579k
            public String toString() {
                Catalog catalog = this.f101259a;
                String str = this.f101260b;
                return "PageSelected(catalog=" + catalog + ", pageNumber=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$d */
        public static final class C39650d implements C39646c {

            /* renamed from: b */
            public static final int f101261b = 8;
            @C12579k

            /* renamed from: a */
            public final Catalog f101262a;

            public C39650d(@C12579k Catalog catalog) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                this.f101262a = catalog;
            }

            /* renamed from: c */
            public static /* synthetic */ C39650d m162080c(C39650d dVar, Catalog catalog, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalog = dVar.f101262a;
                }
                return dVar.mo130915b(catalog);
            }

            @C12579k
            /* renamed from: a */
            public final Catalog mo130914a() {
                return this.f101262a;
            }

            @C12579k
            /* renamed from: b */
            public final C39650d mo130915b(@C12579k Catalog catalog) {
                Intrinsics.checkNotNullParameter(catalog, "catalog");
                return new C39650d(catalog);
            }

            @C12579k
            /* renamed from: d */
            public final Catalog mo130916d() {
                return this.f101262a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39650d) && Intrinsics.areEqual((Object) this.f101262a, (Object) ((C39650d) obj).f101262a);
            }

            public int hashCode() {
                return this.f101262a.hashCode();
            }

            @C12579k
            public String toString() {
                Catalog catalog = this.f101262a;
                return "SearchClicked(catalog=" + catalog + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$e */
        public static final class C39651e implements C39646c {
            @C12579k

            /* renamed from: a */
            public static final C39651e f101263a = new C39651e();

            /* renamed from: b */
            public static final int f101264b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$f */
        public static final class C39652f implements C39646c {

            /* renamed from: d */
            public static final int f101265d = 8;
            @C12579k

            /* renamed from: a */
            public final CatalogProduct f101266a;

            /* renamed from: b */
            public final boolean f101267b;
            @C12579k

            /* renamed from: c */
            public final String f101268c;

            public C39652f(@C12579k CatalogProduct catalogProduct, boolean z, @C12579k String str) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                Intrinsics.checkNotNullParameter(str, "slug");
                this.f101266a = catalogProduct;
                this.f101267b = z;
                this.f101268c = str;
            }

            /* renamed from: e */
            public static /* synthetic */ C39652f m162084e(C39652f fVar, CatalogProduct catalogProduct, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalogProduct = fVar.f101266a;
                }
                if ((i & 2) != 0) {
                    z = fVar.f101267b;
                }
                if ((i & 4) != 0) {
                    str = fVar.f101268c;
                }
                return fVar.mo130923d(catalogProduct, z, str);
            }

            @C12579k
            /* renamed from: a */
            public final CatalogProduct mo130920a() {
                return this.f101266a;
            }

            /* renamed from: b */
            public final boolean mo130921b() {
                return this.f101267b;
            }

            @C12579k
            /* renamed from: c */
            public final String mo130922c() {
                return this.f101268c;
            }

            @C12579k
            /* renamed from: d */
            public final C39652f mo130923d(@C12579k CatalogProduct catalogProduct, boolean z, @C12579k String str) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                Intrinsics.checkNotNullParameter(str, "slug");
                return new C39652f(catalogProduct, z, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39652f)) {
                    return false;
                }
                C39652f fVar = (C39652f) obj;
                return Intrinsics.areEqual((Object) this.f101266a, (Object) fVar.f101266a) && this.f101267b == fVar.f101267b && Intrinsics.areEqual((Object) this.f101268c, (Object) fVar.f101268c);
            }

            @C12579k
            /* renamed from: f */
            public final CatalogProduct mo130925f() {
                return this.f101266a;
            }

            @C12579k
            /* renamed from: g */
            public final String mo130926g() {
                return this.f101268c;
            }

            /* renamed from: h */
            public final boolean mo130927h() {
                return this.f101267b;
            }

            public int hashCode() {
                int hashCode = this.f101266a.hashCode() * 31;
                boolean z = this.f101267b;
                if (z) {
                    z = true;
                }
                return ((hashCode + (z ? 1 : 0)) * 31) + this.f101268c.hashCode();
            }

            @C12579k
            public String toString() {
                CatalogProduct catalogProduct = this.f101266a;
                boolean z = this.f101267b;
                String str = this.f101268c;
                return "ToggleFavorite(product=" + catalogProduct + ", isFavorite=" + z + ", slug=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$g */
        public static final class C39653g implements C39646c {
            @C12579k

            /* renamed from: a */
            public static final C39653g f101269a = new C39653g();

            /* renamed from: b */
            public static final int f101270b = 0;
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b */
    public interface C39638b extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$a */
        public static final class C39639a implements C39638b {
            @C12579k

            /* renamed from: b */
            public static final C39639a f101239b = new C39639a();

            /* renamed from: c */
            public static final int f101240c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39642d.m162060a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$b */
        public static final class C39640b implements C39638b {

            /* renamed from: c */
            public static final int f101241c = 8;
            @C12579k

            /* renamed from: b */
            public final List<C39452e> f101242b;

            public C39640b(@C12579k List<C39452e> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f101242b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C39640b m162048g(C39640b bVar, List<C39452e> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = bVar.f101242b;
                }
                return bVar.mo130872f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<C39452e> mo130870e() {
                return this.f101242b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39640b) && Intrinsics.areEqual((Object) this.f101242b, (Object) ((C39640b) obj).f101242b);
            }

            @C12579k
            /* renamed from: f */
            public final C39640b mo130872f(@C12579k List<C39452e> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                return new C39640b(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<C39452e> mo130873h() {
                return this.f101242b;
            }

            public int hashCode() {
                return this.f101242b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39642d.m162060a(this);
            }

            @C12579k
            public String toString() {
                List<C39452e> list = this.f101242b;
                return "CatalogProductListContent(list=" + list + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$d */
        public static final class C39642d {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m162060a(@C12579k C39638b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$e */
        public static final class C39643e implements C39638b {
            @C12579k

            /* renamed from: b */
            public static final C39643e f101247b = new C39643e();

            /* renamed from: c */
            public static final int f101248c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39642d.m162060a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$f */
        public static final class C39644f implements C39638b {

            /* renamed from: c */
            public static final int f101249c = 0;

            /* renamed from: b */
            public final boolean f101250b;

            public C39644f() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            /* renamed from: g */
            public static /* synthetic */ C39644f m162061g(C39644f fVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fVar.f101250b;
                }
                return fVar.mo130888f(z);
            }

            /* renamed from: e */
            public final boolean mo130886e() {
                return this.f101250b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39644f) && this.f101250b == ((C39644f) obj).f101250b;
            }

            @C12579k
            /* renamed from: f */
            public final C39644f mo130888f(boolean z) {
                return new C39644f(z);
            }

            public int hashCode() {
                boolean z = this.f101250b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final boolean isLoading() {
                return this.f101250b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39642d.m162060a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f101250b;
                return "Loading(isLoading=" + z + ")";
            }

            public C39644f(boolean z) {
                this.f101250b = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39644f(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$g */
        public static final class C39645g implements C39638b {
            @C12579k

            /* renamed from: b */
            public static final C39645g f101251b = new C39645g();

            /* renamed from: c */
            public static final int f101252c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39642d.m162060a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$b$c */
        public static final class C39641c implements C39638b {

            /* renamed from: e */
            public static final int f101243e = 8;
            @C12579k

            /* renamed from: b */
            public final CatalogFullDetails f101244b;
            @C12579k

            /* renamed from: c */
            public final String f101245c;
            @C12580l

            /* renamed from: d */
            public final C37999a f101246d;

            public C39641c(@C12579k CatalogFullDetails catalogFullDetails, @C12579k String str, @C12580l C37999a aVar) {
                Intrinsics.checkNotNullParameter(catalogFullDetails, C23948c.f60118a);
                Intrinsics.checkNotNullParameter(str, "pagesNumber");
                this.f101244b = catalogFullDetails;
                this.f101245c = str;
                this.f101246d = aVar;
            }

            /* renamed from: i */
            public static /* synthetic */ C39641c m162052i(C39641c cVar, CatalogFullDetails catalogFullDetails, String str, C37999a aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalogFullDetails = cVar.f101244b;
                }
                if ((i & 2) != 0) {
                    str = cVar.f101245c;
                }
                if ((i & 4) != 0) {
                    aVar = cVar.f101246d;
                }
                return cVar.mo130880h(catalogFullDetails, str, aVar);
            }

            @C12579k
            /* renamed from: e */
            public final CatalogFullDetails mo130876e() {
                return this.f101244b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39641c)) {
                    return false;
                }
                C39641c cVar = (C39641c) obj;
                return Intrinsics.areEqual((Object) this.f101244b, (Object) cVar.f101244b) && Intrinsics.areEqual((Object) this.f101245c, (Object) cVar.f101245c) && Intrinsics.areEqual((Object) this.f101246d, (Object) cVar.f101246d);
            }

            @C12579k
            /* renamed from: f */
            public final String mo130878f() {
                return this.f101245c;
            }

            @C12580l
            /* renamed from: g */
            public final C37999a mo130879g() {
                return this.f101246d;
            }

            @C12579k
            /* renamed from: h */
            public final C39641c mo130880h(@C12579k CatalogFullDetails catalogFullDetails, @C12579k String str, @C12580l C37999a aVar) {
                Intrinsics.checkNotNullParameter(catalogFullDetails, C23948c.f60118a);
                Intrinsics.checkNotNullParameter(str, "pagesNumber");
                return new C39641c(catalogFullDetails, str, aVar);
            }

            public int hashCode() {
                int hashCode = ((this.f101244b.hashCode() * 31) + this.f101245c.hashCode()) * 31;
                C37999a aVar = this.f101246d;
                return hashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @C12580l
            /* renamed from: j */
            public final C37999a mo130882j() {
                return this.f101246d;
            }

            @C12579k
            /* renamed from: k */
            public final CatalogFullDetails mo130883k() {
                return this.f101244b;
            }

            @C12579k
            /* renamed from: l */
            public final String mo130884l() {
                return this.f101245c;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39642d.m162060a(this);
            }

            @C12579k
            public String toString() {
                CatalogFullDetails catalogFullDetails = this.f101244b;
                String str = this.f101245c;
                C37999a aVar = this.f101246d;
                return "CatalogStreamContent(details=" + catalogFullDetails + ", pagesNumber=" + str + ", criteoBanner=" + aVar + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39641c(CatalogFullDetails catalogFullDetails, String str, C37999a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(catalogFullDetails, (i & 2) != 0 ? new String() : str, (i & 4) != 0 ? null : aVar);
            }
        }
    }
}
