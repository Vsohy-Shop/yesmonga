package com.carrefour.fid.android.catalogs.presentation.p065ui.productdetails;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.productdetails.c */
public final class C39580c implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C39581a f101129b = new C39581a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f101130c = 8;
    @C12579k

    /* renamed from: a */
    public final CatalogProduct f101131a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.productdetails.c$a */
    public static final class C39581a {
        public /* synthetic */ C39581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39580c mo130786a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39580c.class.getClassLoader());
            if (bundle.containsKey("product")) {
                Class<CatalogProduct> cls = CatalogProduct.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    CatalogProduct catalogProduct = (CatalogProduct) bundle.get("product");
                    if (catalogProduct != null) {
                        return new C39580c(catalogProduct);
                    }
                    throw new IllegalArgumentException("Argument \"product\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"product\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C39580c mo130787b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("product")) {
                Class<CatalogProduct> cls = CatalogProduct.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    CatalogProduct catalogProduct = (CatalogProduct) p0Var.mo57648h("product");
                    if (catalogProduct != null) {
                        return new C39580c(catalogProduct);
                    }
                    throw new IllegalArgumentException("Argument \"product\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"product\" is missing and does not have an android:defaultValue");
        }

        public C39581a() {
        }
    }

    public C39580c(@C12579k CatalogProduct catalogProduct) {
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        this.f101131a = catalogProduct;
    }

    /* renamed from: c */
    public static /* synthetic */ C39580c m161910c(C39580c cVar, CatalogProduct catalogProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogProduct = cVar.f101131a;
        }
        return cVar.mo130779b(catalogProduct);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C39580c m161911d(@C12579k C19456p0 p0Var) {
        return f101129b.mo130787b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C39580c fromBundle(@C12579k Bundle bundle) {
        return f101129b.mo130786a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final CatalogProduct mo130778a() {
        return this.f101131a;
    }

    @C12579k
    /* renamed from: b */
    public final C39580c mo130779b(@C12579k CatalogProduct catalogProduct) {
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        return new C39580c(catalogProduct);
    }

    @C12579k
    /* renamed from: e */
    public final CatalogProduct mo130780e() {
        return this.f101131a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39580c) && Intrinsics.areEqual((Object) this.f101131a, (Object) ((C39580c) obj).f101131a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo130782f() {
        Bundle bundle = new Bundle();
        Class<CatalogProduct> cls = CatalogProduct.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            CatalogProduct catalogProduct = this.f101131a;
            Intrinsics.checkNotNull(catalogProduct, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("product", catalogProduct);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            CatalogProduct catalogProduct2 = this.f101131a;
            Intrinsics.checkNotNull(catalogProduct2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("product", (Serializable) catalogProduct2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo130783g() {
        C19456p0 p0Var = new C19456p0();
        Class<CatalogProduct> cls = CatalogProduct.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            CatalogProduct catalogProduct = this.f101131a;
            Intrinsics.checkNotNull(catalogProduct, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("product", catalogProduct);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            CatalogProduct catalogProduct2 = this.f101131a;
            Intrinsics.checkNotNull(catalogProduct2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("product", (Serializable) catalogProduct2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f101131a.hashCode();
    }

    @C12579k
    public String toString() {
        CatalogProduct catalogProduct = this.f101131a;
        return "CatalogProductDetailsFragmentArgs(product=" + catalogProduct + ")";
    }
}
