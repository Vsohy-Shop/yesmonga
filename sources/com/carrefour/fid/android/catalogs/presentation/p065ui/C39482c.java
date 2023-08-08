package com.carrefour.fid.android.catalogs.presentation.p065ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.storelocator.configurations.C28958a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.c */
public final class C39482c {
    @C12579k

    /* renamed from: a */
    public static final C39485c f100988a = new C39485c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f100989b = 0;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.c$a */
    public static final class C39483a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final Catalog f100990a;

        /* renamed from: b */
        public final int f100991b = C39364b.C39374j.action_catalogs_to_catalogDetails;

        public C39483a(@C12579k Catalog catalog) {
            Intrinsics.checkNotNullParameter(catalog, "catalog");
            this.f100990a = catalog;
        }

        /* renamed from: c */
        public static /* synthetic */ C39483a m161738c(C39483a aVar, Catalog catalog, int i, Object obj) {
            if ((i & 1) != 0) {
                catalog = aVar.f100990a;
            }
            return aVar.mo130617b(catalog);
        }

        @C12579k
        /* renamed from: a */
        public final Catalog mo130616a() {
            return this.f100990a;
        }

        @C12579k
        /* renamed from: b */
        public final C39483a mo130617b(@C12579k Catalog catalog) {
            Intrinsics.checkNotNullParameter(catalog, "catalog");
            return new C39483a(catalog);
        }

        @C12579k
        /* renamed from: d */
        public final Catalog mo130618d() {
            return this.f100990a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39483a) && Intrinsics.areEqual((Object) this.f100990a, (Object) ((C39483a) obj).f100990a);
        }

        public int getActionId() {
            return this.f100991b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Catalog> cls = Catalog.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                Catalog catalog = this.f100990a;
                Intrinsics.checkNotNull(catalog, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("catalog", catalog);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                Catalog catalog2 = this.f100990a;
                Intrinsics.checkNotNull(catalog2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("catalog", (Serializable) catalog2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f100990a.hashCode();
        }

        @C12579k
        public String toString() {
            Catalog catalog = this.f100990a;
            return "ActionCatalogsToCatalogDetails(catalog=" + catalog + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.c$b */
    public static final class C39484b implements C19693b0 {

        /* renamed from: a */
        public final boolean f100992a;

        /* renamed from: b */
        public final int f100993b;

        public C39484b() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C39484b m161742c(C39484b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f100992a;
            }
            return bVar.mo130623b(z);
        }

        /* renamed from: a */
        public final boolean mo130622a() {
            return this.f100992a;
        }

        @C12579k
        /* renamed from: b */
        public final C39484b mo130623b(boolean z) {
            return new C39484b(z);
        }

        /* renamed from: d */
        public final boolean mo130624d() {
            return this.f100992a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39484b) && this.f100992a == ((C39484b) obj).f100992a;
        }

        public int getActionId() {
            return this.f100993b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C28958a.f70992g, this.f100992a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f100992a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f100992a;
            return "AllCatalogs(forceStoreIfExist=" + z + ")";
        }

        public C39484b(boolean z) {
            this.f100992a = z;
            this.f100993b = C39364b.C39374j.allCatalogs;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39484b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.c$c */
    public static final class C39485c {
        public /* synthetic */ C39485c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ C19693b0 m161746d(C39485c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return cVar.mo130630c(z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo130628a() {
            return new C19690a(C39364b.C39374j.action_allCatalogs_to_catalogFavoriteProductList);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo130629b(@C12579k Catalog catalog) {
            Intrinsics.checkNotNullParameter(catalog, "catalog");
            return new C39483a(catalog);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo130630c(boolean z) {
            return new C39484b(z);
        }

        public C39485c() {
        }
    }
}
