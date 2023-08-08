package com.carrefour.fid.android.catalogs.presentation.p065ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.c */
public final class C39492c {
    @C12579k

    /* renamed from: a */
    public static final C39494b f101005a = new C39494b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f101006b = 0;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.c$a */
    public static final class C39493a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final CatalogProduct f101007a;

        /* renamed from: b */
        public final int f101008b = C39364b.C39374j.actionCatalogDetailsToCatalogProductDetails;

        public C39493a(@C12579k CatalogProduct catalogProduct) {
            Intrinsics.checkNotNullParameter(catalogProduct, "product");
            this.f101007a = catalogProduct;
        }

        /* renamed from: c */
        public static /* synthetic */ C39493a m161772c(C39493a aVar, CatalogProduct catalogProduct, int i, Object obj) {
            if ((i & 1) != 0) {
                catalogProduct = aVar.f101007a;
            }
            return aVar.mo130649b(catalogProduct);
        }

        @C12579k
        /* renamed from: a */
        public final CatalogProduct mo130648a() {
            return this.f101007a;
        }

        @C12579k
        /* renamed from: b */
        public final C39493a mo130649b(@C12579k CatalogProduct catalogProduct) {
            Intrinsics.checkNotNullParameter(catalogProduct, "product");
            return new C39493a(catalogProduct);
        }

        @C12579k
        /* renamed from: d */
        public final CatalogProduct mo130650d() {
            return this.f101007a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39493a) && Intrinsics.areEqual((Object) this.f101007a, (Object) ((C39493a) obj).f101007a);
        }

        public int getActionId() {
            return this.f101008b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<CatalogProduct> cls = CatalogProduct.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                CatalogProduct catalogProduct = this.f101007a;
                Intrinsics.checkNotNull(catalogProduct, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("product", catalogProduct);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                CatalogProduct catalogProduct2 = this.f101007a;
                Intrinsics.checkNotNull(catalogProduct2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("product", (Serializable) catalogProduct2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f101007a.hashCode();
        }

        @C12579k
        public String toString() {
            CatalogProduct catalogProduct = this.f101007a;
            return "ActionCatalogDetailsToCatalogProductDetails(product=" + catalogProduct + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.c$b */
    public static final class C39494b {
        public /* synthetic */ C39494b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo130654a(@C12579k CatalogProduct catalogProduct) {
            Intrinsics.checkNotNullParameter(catalogProduct, "product");
            return new C39493a(catalogProduct);
        }

        public C39494b() {
        }
    }
}
