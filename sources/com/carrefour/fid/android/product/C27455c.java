package com.carrefour.fid.android.product;

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
/* renamed from: com.carrefour.fid.android.product.c */
public final class C27455c implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C27456a f66574c = new C27456a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f66575d = 8;
    @C12579k

    /* renamed from: a */
    public final ProductCategory f66576a;
    @C12579k

    /* renamed from: b */
    public final String f66577b;

    /* renamed from: com.carrefour.fid.android.product.c$a */
    public static final class C27456a {
        public /* synthetic */ C27456a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C27455c mo79812a(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C27455c.class.getClassLoader());
            if (bundle.containsKey("productCategory")) {
                Class<ProductCategory> cls = ProductCategory.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductCategory productCategory = (ProductCategory) bundle.get("productCategory");
                    if (productCategory == null) {
                        throw new IllegalArgumentException("Argument \"productCategory\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("parentDepartment")) {
                        String string = bundle.getString("parentDepartment");
                        if (string != null) {
                            return new C27455c(productCategory, string);
                        }
                        throw new IllegalArgumentException("Argument \"parentDepartment\" is marked as non-null but was passed a null value.");
                    } else {
                        throw new IllegalArgumentException("Required argument \"parentDepartment\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"productCategory\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C27455c mo79813b(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("productCategory")) {
                Class<ProductCategory> cls = ProductCategory.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductCategory productCategory = (ProductCategory) p0Var.mo57648h("productCategory");
                    if (productCategory == null) {
                        throw new IllegalArgumentException("Argument \"productCategory\" is marked as non-null but was passed a null value");
                    } else if (p0Var.mo57647f("parentDepartment")) {
                        String str = (String) p0Var.mo57648h("parentDepartment");
                        if (str != null) {
                            return new C27455c(productCategory, str);
                        }
                        throw new IllegalArgumentException("Argument \"parentDepartment\" is marked as non-null but was passed a null value");
                    } else {
                        throw new IllegalArgumentException("Required argument \"parentDepartment\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name = cls.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"productCategory\" is missing and does not have an android:defaultValue");
            }
        }

        public C27456a() {
        }
    }

    public C27455c(@C12579k ProductCategory productCategory, @C12579k String str) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        Intrinsics.checkNotNullParameter(str, "parentDepartment");
        this.f66576a = productCategory;
        this.f66577b = str;
    }

    /* renamed from: d */
    public static /* synthetic */ C27455c m115532d(C27455c cVar, ProductCategory productCategory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productCategory = cVar.f66576a;
        }
        if ((i & 2) != 0) {
            str = cVar.f66577b;
        }
        return cVar.mo79804c(productCategory, str);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C27455c m115533e(@C12579k C19456p0 p0Var) {
        return f66574c.mo79813b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C27455c fromBundle(@C12579k Bundle bundle) {
        return f66574c.mo79812a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final ProductCategory mo79802a() {
        return this.f66576a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo79803b() {
        return this.f66577b;
    }

    @C12579k
    /* renamed from: c */
    public final C27455c mo79804c(@C12579k ProductCategory productCategory, @C12579k String str) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        Intrinsics.checkNotNullParameter(str, "parentDepartment");
        return new C27455c(productCategory, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27455c)) {
            return false;
        }
        C27455c cVar = (C27455c) obj;
        return Intrinsics.areEqual((Object) this.f66576a, (Object) cVar.f66576a) && Intrinsics.areEqual((Object) this.f66577b, (Object) cVar.f66577b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo79806f() {
        return this.f66577b;
    }

    @C12579k
    /* renamed from: g */
    public final ProductCategory mo79807g() {
        return this.f66576a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo79808h() {
        Bundle bundle = new Bundle();
        Class<ProductCategory> cls = ProductCategory.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory = this.f66576a;
            Intrinsics.checkNotNull(productCategory, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("productCategory", productCategory);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory2 = this.f66576a;
            Intrinsics.checkNotNull(productCategory2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("productCategory", (Serializable) productCategory2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putString("parentDepartment", this.f66577b);
        return bundle;
    }

    public int hashCode() {
        return (this.f66576a.hashCode() * 31) + this.f66577b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo79810i() {
        C19456p0 p0Var = new C19456p0();
        Class<ProductCategory> cls = ProductCategory.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory = this.f66576a;
            Intrinsics.checkNotNull(productCategory, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("productCategory", productCategory);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory2 = this.f66576a;
            Intrinsics.checkNotNull(productCategory2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("productCategory", (Serializable) productCategory2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("parentDepartment", this.f66577b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        ProductCategory productCategory = this.f66576a;
        String str = this.f66577b;
        return "ProductListDepartmentGraphArgs(productCategory=" + productCategory + ", parentDepartment=" + str + ")";
    }
}
