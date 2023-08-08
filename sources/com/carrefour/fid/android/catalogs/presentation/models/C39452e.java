package com.carrefour.fid.android.catalogs.presentation.models;

import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.models.e */
public final class C39452e {
    @C12579k

    /* renamed from: a */
    public final CatalogProduct f100940a;

    /* renamed from: b */
    public final boolean f100941b;

    public C39452e(@C12579k CatalogProduct catalogProduct, boolean z) {
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        this.f100940a = catalogProduct;
        this.f100941b = z;
    }

    /* renamed from: d */
    public static /* synthetic */ C39452e m161665d(C39452e eVar, CatalogProduct catalogProduct, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogProduct = eVar.f100940a;
        }
        if ((i & 2) != 0) {
            z = eVar.f100941b;
        }
        return eVar.mo130544c(catalogProduct, z);
    }

    @C12579k
    /* renamed from: a */
    public final CatalogProduct mo130542a() {
        return this.f100940a;
    }

    /* renamed from: b */
    public final boolean mo130543b() {
        return this.f100941b;
    }

    @C12579k
    /* renamed from: c */
    public final C39452e mo130544c(@C12579k CatalogProduct catalogProduct, boolean z) {
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        return new C39452e(catalogProduct, z);
    }

    @C12579k
    /* renamed from: e */
    public final CatalogProduct mo130545e() {
        return this.f100940a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39452e)) {
            return false;
        }
        C39452e eVar = (C39452e) obj;
        return Intrinsics.areEqual((Object) this.f100940a, (Object) eVar.f100940a) && this.f100941b == eVar.f100941b;
    }

    /* renamed from: f */
    public final boolean mo130547f() {
        return this.f100941b;
    }

    public int hashCode() {
        int hashCode = this.f100940a.hashCode() * 31;
        boolean z = this.f100941b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    public String toString() {
        CatalogProduct catalogProduct = this.f100940a;
        boolean z = this.f100941b;
        return "ListCatalogProductItem(product=" + catalogProduct + ", isFavorite=" + z + ")";
    }
}
