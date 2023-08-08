package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.g */
public final class C39785g {
    @C12579k

    /* renamed from: a */
    public static final C39788c f101518a = new C39788c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f101519b = 0;

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.g$b */
    public static final class C39787b implements C19693b0 {

        /* renamed from: a */
        public final boolean f101524a;

        /* renamed from: b */
        public final int f101525b;

        public C39787b() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C39787b m162339c(C39787b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f101524a;
            }
            return bVar.mo131183b(z);
        }

        /* renamed from: a */
        public final boolean mo131182a() {
            return this.f101524a;
        }

        @C12579k
        /* renamed from: b */
        public final C39787b mo131183b(boolean z) {
            return new C39787b(z);
        }

        /* renamed from: d */
        public final boolean mo131184d() {
            return this.f101524a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39787b) && this.f101524a == ((C39787b) obj).f101524a;
        }

        public int getActionId() {
            return this.f101525b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_animate_transition", this.f101524a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f101524a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f101524a;
            return "ActionDepartmentFragmentToProductSearchFragment(shouldAnimateTransition=" + z + ")";
        }

        public C39787b(boolean z) {
            this.f101524a = z;
            this.f101525b = C39711b.C39721j.action_departmentFragment_to_productSearchFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39787b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.g$c */
    public static final class C39788c {
        public /* synthetic */ C39788c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m162343b(C39788c cVar, ProductCategory productCategory, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return cVar.mo131188a(productCategory, str, z);
        }

        /* renamed from: e */
        public static /* synthetic */ C19693b0 m162344e(C39788c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return cVar.mo131190d(z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo131188a(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            Intrinsics.checkNotNullParameter(str, "parentDepartment");
            return new C39786a(productCategory, str, z);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo131189c() {
            return new C19690a(C39711b.C39721j.action_departmentFragment_to_productListFragment);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo131190d(boolean z) {
            return new C39787b(z);
        }

        @C12579k
        /* renamed from: f */
        public final C19693b0 mo131191f() {
            return new C19690a(C39711b.C39721j.action_departmentFragment_to_scanBarCodeFragment);
        }

        public C39788c() {
        }
    }

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.g$a */
    public static final class C39786a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final ProductCategory f101520a;
        @C12579k

        /* renamed from: b */
        public final String f101521b;

        /* renamed from: c */
        public final boolean f101522c;

        /* renamed from: d */
        public final int f101523d;

        public C39786a(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            Intrinsics.checkNotNullParameter(str, "parentDepartment");
            this.f101520a = productCategory;
            this.f101521b = str;
            this.f101522c = z;
            this.f101523d = C39711b.C39721j.action_departmentFragment_to_departmentDetailsFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C39786a m162331e(C39786a aVar, ProductCategory productCategory, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategory = aVar.f101520a;
            }
            if ((i & 2) != 0) {
                str = aVar.f101521b;
            }
            if ((i & 4) != 0) {
                z = aVar.f101522c;
            }
            return aVar.mo131175d(productCategory, str, z);
        }

        @C12579k
        /* renamed from: a */
        public final ProductCategory mo131172a() {
            return this.f101520a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo131173b() {
            return this.f101521b;
        }

        /* renamed from: c */
        public final boolean mo131174c() {
            return this.f101522c;
        }

        @C12579k
        /* renamed from: d */
        public final C39786a mo131175d(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            Intrinsics.checkNotNullParameter(str, "parentDepartment");
            return new C39786a(productCategory, str, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39786a)) {
                return false;
            }
            C39786a aVar = (C39786a) obj;
            return Intrinsics.areEqual((Object) this.f101520a, (Object) aVar.f101520a) && Intrinsics.areEqual((Object) this.f101521b, (Object) aVar.f101521b) && this.f101522c == aVar.f101522c;
        }

        @C12579k
        /* renamed from: f */
        public final String mo131177f() {
            return this.f101521b;
        }

        @C12579k
        /* renamed from: g */
        public final ProductCategory mo131178g() {
            return this.f101520a;
        }

        public int getActionId() {
            return this.f101523d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<ProductCategory> cls = ProductCategory.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                ProductCategory productCategory = this.f101520a;
                Intrinsics.checkNotNull(productCategory, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("productCategory", productCategory);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                ProductCategory productCategory2 = this.f101520a;
                Intrinsics.checkNotNull(productCategory2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("productCategory", (Serializable) productCategory2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("parentDepartment", this.f101521b);
            bundle.putBoolean("shouldSearchOnBack", this.f101522c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo131179h() {
            return this.f101522c;
        }

        public int hashCode() {
            int hashCode = ((this.f101520a.hashCode() * 31) + this.f101521b.hashCode()) * 31;
            boolean z = this.f101522c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            ProductCategory productCategory = this.f101520a;
            String str = this.f101521b;
            boolean z = this.f101522c;
            return "ActionDepartmentFragmentToDepartmentDetailsFragment(productCategory=" + productCategory + ", parentDepartment=" + str + ", shouldSearchOnBack=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39786a(ProductCategory productCategory, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(productCategory, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z);
        }
    }
}
