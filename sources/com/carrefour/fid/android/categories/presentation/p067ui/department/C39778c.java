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
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.c */
public final class C39778c {
    @C12579k

    /* renamed from: a */
    public static final C39780b f101506a = new C39780b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f101507b = 0;

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.c$b */
    public static final class C39780b {
        public /* synthetic */ C39780b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m162313b(C39780b bVar, ProductCategory productCategory, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return bVar.mo131159a(productCategory, str, z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo131159a(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            Intrinsics.checkNotNullParameter(str, "parentDepartment");
            return new C39779a(productCategory, str, z);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo131160c() {
            return new C19690a(C39711b.C39721j.action_departmentDetailsFragment_to_searchFragment);
        }

        public C39780b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.c$a */
    public static final class C39779a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final ProductCategory f101508a;
        @C12579k

        /* renamed from: b */
        public final String f101509b;

        /* renamed from: c */
        public final boolean f101510c;

        /* renamed from: d */
        public final int f101511d;

        public C39779a(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            Intrinsics.checkNotNullParameter(str, "parentDepartment");
            this.f101508a = productCategory;
            this.f101509b = str;
            this.f101510c = z;
            this.f101511d = C39711b.C39721j.action_departmentDetailsFragment_to_departmentDetailsFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C39779a m162305e(C39779a aVar, ProductCategory productCategory, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategory = aVar.f101508a;
            }
            if ((i & 2) != 0) {
                str = aVar.f101509b;
            }
            if ((i & 4) != 0) {
                z = aVar.f101510c;
            }
            return aVar.mo131152d(productCategory, str, z);
        }

        @C12579k
        /* renamed from: a */
        public final ProductCategory mo131149a() {
            return this.f101508a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo131150b() {
            return this.f101509b;
        }

        /* renamed from: c */
        public final boolean mo131151c() {
            return this.f101510c;
        }

        @C12579k
        /* renamed from: d */
        public final C39779a mo131152d(@C12579k ProductCategory productCategory, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(productCategory, "productCategory");
            Intrinsics.checkNotNullParameter(str, "parentDepartment");
            return new C39779a(productCategory, str, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39779a)) {
                return false;
            }
            C39779a aVar = (C39779a) obj;
            return Intrinsics.areEqual((Object) this.f101508a, (Object) aVar.f101508a) && Intrinsics.areEqual((Object) this.f101509b, (Object) aVar.f101509b) && this.f101510c == aVar.f101510c;
        }

        @C12579k
        /* renamed from: f */
        public final String mo131154f() {
            return this.f101509b;
        }

        @C12579k
        /* renamed from: g */
        public final ProductCategory mo131155g() {
            return this.f101508a;
        }

        public int getActionId() {
            return this.f101511d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<ProductCategory> cls = ProductCategory.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                ProductCategory productCategory = this.f101508a;
                Intrinsics.checkNotNull(productCategory, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("productCategory", productCategory);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                ProductCategory productCategory2 = this.f101508a;
                Intrinsics.checkNotNull(productCategory2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("productCategory", (Serializable) productCategory2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("parentDepartment", this.f101509b);
            bundle.putBoolean("shouldSearchOnBack", this.f101510c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo131156h() {
            return this.f101510c;
        }

        public int hashCode() {
            int hashCode = ((this.f101508a.hashCode() * 31) + this.f101509b.hashCode()) * 31;
            boolean z = this.f101510c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            ProductCategory productCategory = this.f101508a;
            String str = this.f101509b;
            boolean z = this.f101510c;
            return "ActionDepartmentDetailsFragmentToDepartmentDetailsFragment(productCategory=" + productCategory + ", parentDepartment=" + str + ", shouldSearchOnBack=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C39779a(ProductCategory productCategory, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(productCategory, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z);
        }
    }
}
