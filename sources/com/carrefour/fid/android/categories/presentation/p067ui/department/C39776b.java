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
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.b */
public final class C39776b implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C39777a f101501d = new C39777a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f101502e = 8;
    @C12579k

    /* renamed from: a */
    public final ProductCategory f101503a;
    @C12579k

    /* renamed from: b */
    public final String f101504b;

    /* renamed from: c */
    public final boolean f101505c;

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.b$a */
    public static final class C39777a {
        public /* synthetic */ C39777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39776b mo131147a(@C12579k Bundle bundle) {
            String str;
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39776b.class.getClassLoader());
            if (bundle.containsKey("productCategory")) {
                Class<ProductCategory> cls = ProductCategory.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductCategory productCategory = (ProductCategory) bundle.get("productCategory");
                    if (productCategory != null) {
                        if (bundle.containsKey("parentDepartment")) {
                            str = bundle.getString("parentDepartment");
                            if (str == null) {
                                throw new IllegalArgumentException("Argument \"parentDepartment\" is marked as non-null but was passed a null value.");
                            }
                        } else {
                            str = "";
                        }
                        if (bundle.containsKey("shouldSearchOnBack")) {
                            z = bundle.getBoolean("shouldSearchOnBack");
                        } else {
                            z = false;
                        }
                        return new C39776b(productCategory, str, z);
                    }
                    throw new IllegalArgumentException("Argument \"productCategory\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"productCategory\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C39776b mo131148b(@C12579k C19456p0 p0Var) {
            String str;
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("productCategory")) {
                Class<ProductCategory> cls = ProductCategory.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    ProductCategory productCategory = (ProductCategory) p0Var.mo57648h("productCategory");
                    if (productCategory != null) {
                        if (p0Var.mo57647f("parentDepartment")) {
                            str = (String) p0Var.mo57648h("parentDepartment");
                            if (str == null) {
                                throw new IllegalArgumentException("Argument \"parentDepartment\" is marked as non-null but was passed a null value");
                            }
                        } else {
                            str = "";
                        }
                        if (p0Var.mo57647f("shouldSearchOnBack")) {
                            bool = (Boolean) p0Var.mo57648h("shouldSearchOnBack");
                            if (bool == null) {
                                throw new IllegalArgumentException("Argument \"shouldSearchOnBack\" of type boolean does not support null values");
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                        return new C39776b(productCategory, str, bool.booleanValue());
                    }
                    throw new IllegalArgumentException("Argument \"productCategory\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"productCategory\" is missing and does not have an android:defaultValue");
        }

        public C39777a() {
        }
    }

    public C39776b(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        Intrinsics.checkNotNullParameter(str, "parentDepartment");
        this.f101503a = productCategory;
        this.f101504b = str;
        this.f101505c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C39776b m162292e(C39776b bVar, ProductCategory productCategory, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            productCategory = bVar.f101503a;
        }
        if ((i & 2) != 0) {
            str = bVar.f101504b;
        }
        if ((i & 4) != 0) {
            z = bVar.f101505c;
        }
        return bVar.mo131138d(productCategory, str, z);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C39776b m162293f(@C12579k C19456p0 p0Var) {
        return f101501d.mo131148b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C39776b fromBundle(@C12579k Bundle bundle) {
        return f101501d.mo131147a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final ProductCategory mo131135a() {
        return this.f101503a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo131136b() {
        return this.f101504b;
    }

    /* renamed from: c */
    public final boolean mo131137c() {
        return this.f101505c;
    }

    @C12579k
    /* renamed from: d */
    public final C39776b mo131138d(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        Intrinsics.checkNotNullParameter(str, "parentDepartment");
        return new C39776b(productCategory, str, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39776b)) {
            return false;
        }
        C39776b bVar = (C39776b) obj;
        return Intrinsics.areEqual((Object) this.f101503a, (Object) bVar.f101503a) && Intrinsics.areEqual((Object) this.f101504b, (Object) bVar.f101504b) && this.f101505c == bVar.f101505c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo131140g() {
        return this.f101504b;
    }

    @C12579k
    /* renamed from: h */
    public final ProductCategory mo131141h() {
        return this.f101503a;
    }

    public int hashCode() {
        int hashCode = ((this.f101503a.hashCode() * 31) + this.f101504b.hashCode()) * 31;
        boolean z = this.f101505c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo131143i() {
        return this.f101505c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo131144j() {
        Bundle bundle = new Bundle();
        Class<ProductCategory> cls = ProductCategory.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory = this.f101503a;
            Intrinsics.checkNotNull(productCategory, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("productCategory", productCategory);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory2 = this.f101503a;
            Intrinsics.checkNotNull(productCategory2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("productCategory", (Serializable) productCategory2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        bundle.putString("parentDepartment", this.f101504b);
        bundle.putBoolean("shouldSearchOnBack", this.f101505c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo131145k() {
        C19456p0 p0Var = new C19456p0();
        Class<ProductCategory> cls = ProductCategory.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory = this.f101503a;
            Intrinsics.checkNotNull(productCategory, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("productCategory", productCategory);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            ProductCategory productCategory2 = this.f101503a;
            Intrinsics.checkNotNull(productCategory2, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("productCategory", (Serializable) productCategory2);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("parentDepartment", this.f101504b);
        p0Var.mo57656q("shouldSearchOnBack", Boolean.valueOf(this.f101505c));
        return p0Var;
    }

    @C12579k
    public String toString() {
        ProductCategory productCategory = this.f101503a;
        String str = this.f101504b;
        boolean z = this.f101505c;
        return "DepartmentDetailsFragmentArgs(productCategory=" + productCategory + ", parentDepartment=" + str + ", shouldSearchOnBack=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39776b(ProductCategory productCategory, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(productCategory, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z);
    }
}
