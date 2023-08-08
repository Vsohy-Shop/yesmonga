package com.carrefour.fid.android.product;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.product.b */
public final class C27453b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C27454a f66571b = new C27454a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f66572c = 8;
    @C12579k

    /* renamed from: a */
    public final ProductListSource f66573a;

    /* renamed from: com.carrefour.fid.android.product.b$a */
    public static final class C27454a {
        public /* synthetic */ C27454a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27453b mo79800a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27453b.class.getClassLoader());
            if (bundle.containsKey("source")) {
                Class<ProductListSource> cls = ProductListSource.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductListSource productListSource = (ProductListSource) bundle.get("source");
                    if (productListSource != null) {
                        return new C27453b(productListSource);
                    }
                    throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27453b mo79801b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("source")) {
                Class<ProductListSource> cls = ProductListSource.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductListSource productListSource = (ProductListSource) p0Var.mo57648h("source");
                    if (productListSource != null) {
                        return new C27453b(productListSource);
                    }
                    throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }

        public C27454a() {
        }
    }

    public C27453b(@C12579k ProductListSource productListSource) {
        Intrinsics.checkNotNullParameter(productListSource, "source");
        this.f66573a = productListSource;
    }

    /* renamed from: c */
    public static /* synthetic */ C27453b m115523c(C27453b bVar, ProductListSource productListSource, int i, Object obj) {
        if ((i & 1) != 0) {
            productListSource = bVar.f66573a;
        }
        return bVar.mo79793b(productListSource);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C27453b m115524d(@C12579k C19456p0 p0Var) {
        return f66571b.mo79801b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27453b fromBundle(@C12579k Bundle bundle) {
        return f66571b.mo79800a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final ProductListSource mo79792a() {
        return this.f66573a;
    }

    @C12579k
    /* renamed from: b */
    public final C27453b mo79793b(@C12579k ProductListSource productListSource) {
        Intrinsics.checkNotNullParameter(productListSource, "source");
        return new C27453b(productListSource);
    }

    @C12579k
    /* renamed from: e */
    public final ProductListSource mo79794e() {
        return this.f66573a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27453b) && Intrinsics.areEqual((Object) this.f66573a, (Object) ((C27453b) obj).f66573a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo79796f() {
        Bundle bundle = new Bundle();
        Class<ProductListSource> cls = ProductListSource.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource = this.f66573a;
            Intrinsics.checkNotNull(productListSource, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("source", productListSource);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource2 = this.f66573a;
            Intrinsics.checkNotNull(productListSource2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("source", (Serializable) productListSource2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo79797g() {
        C19456p0 p0Var = new C19456p0();
        Class<ProductListSource> cls = ProductListSource.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource = this.f66573a;
            Intrinsics.checkNotNull(productListSource, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("source", productListSource);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource2 = this.f66573a;
            Intrinsics.checkNotNull(productListSource2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("source", (Serializable) productListSource2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f66573a.hashCode();
    }

    @C12579k
    public String toString() {
        ProductListSource productListSource = this.f66573a;
        return "ProductFacetGraphArgs(source=" + productListSource + ")";
    }
}
