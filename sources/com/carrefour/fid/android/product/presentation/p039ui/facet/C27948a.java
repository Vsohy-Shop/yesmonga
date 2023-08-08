package com.carrefour.fid.android.product.presentation.p039ui.facet;

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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.a */
public final class C27948a implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C27949a f67780b = new C27949a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f67781c = 8;
    @C12579k

    /* renamed from: a */
    public final ProductListSource f67782a;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.a$a */
    public static final class C27949a {
        public /* synthetic */ C27949a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27948a mo81375a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27948a.class.getClassLoader());
            if (bundle.containsKey("source")) {
                Class<ProductListSource> cls = ProductListSource.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductListSource productListSource = (ProductListSource) bundle.get("source");
                    if (productListSource != null) {
                        return new C27948a(productListSource);
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
        public final C27948a mo81376b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("source")) {
                Class<ProductListSource> cls = ProductListSource.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductListSource productListSource = (ProductListSource) p0Var.mo57648h("source");
                    if (productListSource != null) {
                        return new C27948a(productListSource);
                    }
                    throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }

        public C27949a() {
        }
    }

    public C27948a(@C12579k ProductListSource productListSource) {
        Intrinsics.checkNotNullParameter(productListSource, "source");
        this.f67782a = productListSource;
    }

    /* renamed from: c */
    public static /* synthetic */ C27948a m117316c(C27948a aVar, ProductListSource productListSource, int i, Object obj) {
        if ((i & 1) != 0) {
            productListSource = aVar.f67782a;
        }
        return aVar.mo81368b(productListSource);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C27948a m117317d(@C12579k C19456p0 p0Var) {
        return f67780b.mo81376b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27948a fromBundle(@C12579k Bundle bundle) {
        return f67780b.mo81375a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final ProductListSource mo81367a() {
        return this.f67782a;
    }

    @C12579k
    /* renamed from: b */
    public final C27948a mo81368b(@C12579k ProductListSource productListSource) {
        Intrinsics.checkNotNullParameter(productListSource, "source");
        return new C27948a(productListSource);
    }

    @C12579k
    /* renamed from: e */
    public final ProductListSource mo81369e() {
        return this.f67782a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27948a) && Intrinsics.areEqual((Object) this.f67782a, (Object) ((C27948a) obj).f67782a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo81371f() {
        Bundle bundle = new Bundle();
        Class<ProductListSource> cls = ProductListSource.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource = this.f67782a;
            Intrinsics.checkNotNull(productListSource, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("source", productListSource);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource2 = this.f67782a;
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
    public final C19456p0 mo81372g() {
        C19456p0 p0Var = new C19456p0();
        Class<ProductListSource> cls = ProductListSource.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource = this.f67782a;
            Intrinsics.checkNotNull(productListSource, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("source", productListSource);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductListSource productListSource2 = this.f67782a;
            Intrinsics.checkNotNull(productListSource2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("source", (Serializable) productListSource2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    public int hashCode() {
        return this.f67782a.hashCode();
    }

    @C12579k
    public String toString() {
        ProductListSource productListSource = this.f67782a;
        return "FacetFragmentArgs(source=" + productListSource + ")";
    }
}
