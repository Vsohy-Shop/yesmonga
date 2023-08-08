package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.f */
public final class C39783f implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C39784a f101515b = new C39784a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f101516c = 8;
    @C12580l

    /* renamed from: a */
    public final ProductCategory f101517a;

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.f$a */
    public static final class C39784a {
        public /* synthetic */ C39784a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39783f mo131170a(@C12579k Bundle bundle) {
            ProductCategory productCategory;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39783f.class.getClassLoader());
            if (bundle.containsKey("goToDepartment")) {
                Class<ProductCategory> cls = ProductCategory.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    productCategory = (ProductCategory) bundle.get("goToDepartment");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                productCategory = null;
            }
            return new C39783f(productCategory);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C39783f mo131171b(@C12579k C19456p0 p0Var) {
            ProductCategory productCategory;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("goToDepartment")) {
                Class<ProductCategory> cls = ProductCategory.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    productCategory = (ProductCategory) p0Var.mo57648h("goToDepartment");
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                productCategory = null;
            }
            return new C39783f(productCategory);
        }

        public C39784a() {
        }
    }

    public C39783f() {
        this((ProductCategory) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C39783f m162322c(C39783f fVar, ProductCategory productCategory, int i, Object obj) {
        if ((i & 1) != 0) {
            productCategory = fVar.f101517a;
        }
        return fVar.mo131163b(productCategory);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C39783f m162323d(@C12579k C19456p0 p0Var) {
        return f101515b.mo131171b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C39783f fromBundle(@C12579k Bundle bundle) {
        return f101515b.mo131170a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final ProductCategory mo131162a() {
        return this.f101517a;
    }

    @C12579k
    /* renamed from: b */
    public final C39783f mo131163b(@C12580l ProductCategory productCategory) {
        return new C39783f(productCategory);
    }

    @C12580l
    /* renamed from: e */
    public final ProductCategory mo131164e() {
        return this.f101517a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39783f) && Intrinsics.areEqual((Object) this.f101517a, (Object) ((C39783f) obj).f101517a);
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo131166f() {
        Bundle bundle = new Bundle();
        Class<ProductCategory> cls = ProductCategory.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("goToDepartment", this.f101517a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("goToDepartment", (Serializable) this.f101517a);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo131167g() {
        C19456p0 p0Var = new C19456p0();
        Class<ProductCategory> cls = ProductCategory.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("goToDepartment", this.f101517a);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("goToDepartment", (Serializable) this.f101517a);
        }
        return p0Var;
    }

    public int hashCode() {
        ProductCategory productCategory = this.f101517a;
        if (productCategory == null) {
            return 0;
        }
        return productCategory.hashCode();
    }

    @C12579k
    public String toString() {
        ProductCategory productCategory = this.f101517a;
        return "DepartmentFragmentArgs(goToDepartment=" + productCategory + ")";
    }

    public C39783f(@C12580l ProductCategory productCategory) {
        this.f101517a = productCategory;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39783f(ProductCategory productCategory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productCategory);
    }
}
