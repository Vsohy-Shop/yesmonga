package com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c */
public final class C39666c {
    @C12579k

    /* renamed from: a */
    public static final C39666c f101287a = new C39666c();

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$a */
    public interface C39667a extends C28505u.C28506a {
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$b */
    public interface C39668b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$b$a */
        public static final class C39669a {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m162103a(@C12579k C39668b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$b$b */
        public static final class C39670b implements C39668b {
            @C12579k

            /* renamed from: b */
            public static final C39670b f101288b = new C39670b();

            /* renamed from: c */
            public static final int f101289c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39669a.m162103a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$b$c */
        public static final class C39671c implements C39668b {

            /* renamed from: c */
            public static final int f101290c = 0;

            /* renamed from: b */
            public final boolean f101291b;

            public C39671c(boolean z) {
                this.f101291b = z;
            }

            /* renamed from: g */
            public static /* synthetic */ C39671c m162104g(C39671c cVar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = cVar.f101291b;
                }
                return cVar.mo130946f(z);
            }

            /* renamed from: e */
            public final boolean mo130944e() {
                return this.f101291b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39671c) && this.f101291b == ((C39671c) obj).f101291b;
            }

            @C12579k
            /* renamed from: f */
            public final C39671c mo130946f(boolean z) {
                return new C39671c(z);
            }

            /* renamed from: h */
            public final boolean mo130947h() {
                return this.f101291b;
            }

            public int hashCode() {
                boolean z = this.f101291b;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39669a.m162103a(this);
            }

            @C12579k
            public String toString() {
                boolean z = this.f101291b;
                return "IsFavoriteState(isFavorite=" + z + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$c */
    public interface C39672c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$c$a */
        public static final class C39673a implements C39672c {

            /* renamed from: b */
            public static final int f101292b = 8;
            @C12579k

            /* renamed from: a */
            public final CatalogProduct f101293a;

            public C39673a(@C12579k CatalogProduct catalogProduct) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                this.f101293a = catalogProduct;
            }

            /* renamed from: c */
            public static /* synthetic */ C39673a m162108c(C39673a aVar, CatalogProduct catalogProduct, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalogProduct = aVar.f101293a;
                }
                return aVar.mo130951b(catalogProduct);
            }

            @C12579k
            /* renamed from: a */
            public final CatalogProduct mo130950a() {
                return this.f101293a;
            }

            @C12579k
            /* renamed from: b */
            public final C39673a mo130951b(@C12579k CatalogProduct catalogProduct) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                return new C39673a(catalogProduct);
            }

            @C12579k
            /* renamed from: d */
            public final CatalogProduct mo130952d() {
                return this.f101293a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39673a) && Intrinsics.areEqual((Object) this.f101293a, (Object) ((C39673a) obj).f101293a);
            }

            public int hashCode() {
                return this.f101293a.hashCode();
            }

            @C12579k
            public String toString() {
                CatalogProduct catalogProduct = this.f101293a;
                return "CheckIfProductIsFavorite(product=" + catalogProduct + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.c$c$b */
        public static final class C39674b implements C39672c {

            /* renamed from: c */
            public static final int f101294c = 8;
            @C12579k

            /* renamed from: a */
            public final CatalogProduct f101295a;

            /* renamed from: b */
            public final boolean f101296b;

            public C39674b(@C12579k CatalogProduct catalogProduct, boolean z) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                this.f101295a = catalogProduct;
                this.f101296b = z;
            }

            /* renamed from: d */
            public static /* synthetic */ C39674b m162112d(C39674b bVar, CatalogProduct catalogProduct, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalogProduct = bVar.f101295a;
                }
                if ((i & 2) != 0) {
                    z = bVar.f101296b;
                }
                return bVar.mo130958c(catalogProduct, z);
            }

            @C12579k
            /* renamed from: a */
            public final CatalogProduct mo130956a() {
                return this.f101295a;
            }

            /* renamed from: b */
            public final boolean mo130957b() {
                return this.f101296b;
            }

            @C12579k
            /* renamed from: c */
            public final C39674b mo130958c(@C12579k CatalogProduct catalogProduct, boolean z) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                return new C39674b(catalogProduct, z);
            }

            @C12579k
            /* renamed from: e */
            public final CatalogProduct mo130959e() {
                return this.f101295a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39674b)) {
                    return false;
                }
                C39674b bVar = (C39674b) obj;
                return Intrinsics.areEqual((Object) this.f101295a, (Object) bVar.f101295a) && this.f101296b == bVar.f101296b;
            }

            /* renamed from: f */
            public final boolean mo130961f() {
                return this.f101296b;
            }

            public int hashCode() {
                int hashCode = this.f101295a.hashCode() * 31;
                boolean z = this.f101296b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                CatalogProduct catalogProduct = this.f101295a;
                boolean z = this.f101296b;
                return "ToggleFavorite(product=" + catalogProduct + ", isFavorite=" + z + ")";
            }
        }
    }
}
