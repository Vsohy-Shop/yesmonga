package com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.c */
public final class C39564c {
    @C12579k

    /* renamed from: a */
    public static final C39566b f101108a = new C39566b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f101109b = 0;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.c$a */
    public static final class C39565a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final CatalogProduct f101110a;

        /* renamed from: b */
        public final int f101111b = C39364b.C39374j.action_catalogProductList_to_catalogProductDetails;

        public C39565a(@C12579k CatalogProduct catalogProduct) {
            Intrinsics.checkNotNullParameter(catalogProduct, "product");
            this.f101110a = catalogProduct;
        }

        /* renamed from: c */
        public static /* synthetic */ C39565a m161889c(C39565a aVar, CatalogProduct catalogProduct, int i, Object obj) {
            if ((i & 1) != 0) {
                catalogProduct = aVar.f101110a;
            }
            return aVar.mo130753b(catalogProduct);
        }

        @C12579k
        /* renamed from: a */
        public final CatalogProduct mo130752a() {
            return this.f101110a;
        }

        @C12579k
        /* renamed from: b */
        public final C39565a mo130753b(@C12579k CatalogProduct catalogProduct) {
            Intrinsics.checkNotNullParameter(catalogProduct, "product");
            return new C39565a(catalogProduct);
        }

        @C12579k
        /* renamed from: d */
        public final CatalogProduct mo130754d() {
            return this.f101110a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39565a) && Intrinsics.areEqual((Object) this.f101110a, (Object) ((C39565a) obj).f101110a);
        }

        public int getActionId() {
            return this.f101111b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<CatalogProduct> cls = CatalogProduct.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                CatalogProduct catalogProduct = this.f101110a;
                Intrinsics.checkNotNull(catalogProduct, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("product", catalogProduct);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                CatalogProduct catalogProduct2 = this.f101110a;
                Intrinsics.checkNotNull(catalogProduct2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("product", (Serializable) catalogProduct2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f101110a.hashCode();
        }

        @C12579k
        public String toString() {
            CatalogProduct catalogProduct = this.f101110a;
            return "ActionCatalogProductListToCatalogProductDetails(product=" + catalogProduct + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.c$b */
    public static final class C39566b {
        public /* synthetic */ C39566b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo130758a() {
            return new C19690a(C39364b.C39374j.action_catalogProductList_to_allCatalogs);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo130759b(@C12579k CatalogProduct catalogProduct) {
            Intrinsics.checkNotNullParameter(catalogProduct, "product");
            return new C39565a(catalogProduct);
        }

        public C39566b() {
        }
    }
}
