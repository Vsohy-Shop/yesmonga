package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a */
public interface C39769a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a$a */
    public static final class C39770a implements C39769a {

        /* renamed from: b */
        public static final int f101489b = 8;
        @C12579k

        /* renamed from: a */
        public final ProductCategory f101490a;

        public C39770a(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "category");
            this.f101490a = productCategory;
        }

        /* renamed from: c */
        public static /* synthetic */ C39770a m162284c(C39770a aVar, ProductCategory productCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategory = aVar.f101490a;
            }
            return aVar.mo131124b(productCategory);
        }

        @C12579k
        /* renamed from: a */
        public final ProductCategory mo131123a() {
            return this.f101490a;
        }

        @C12579k
        /* renamed from: b */
        public final C39770a mo131124b(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "category");
            return new C39770a(productCategory);
        }

        @C12579k
        /* renamed from: d */
        public final ProductCategory mo131125d() {
            return this.f101490a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39770a) && Intrinsics.areEqual((Object) this.f101490a, (Object) ((C39770a) obj).f101490a);
        }

        public int hashCode() {
            return this.f101490a.hashCode();
        }

        @C12579k
        public String toString() {
            ProductCategory productCategory = this.f101490a;
            return "OnDepartmentWithChildrenClick(category=" + productCategory + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a$b */
    public static final class C39771b implements C39769a {

        /* renamed from: b */
        public static final int f101491b = 8;
        @C12579k

        /* renamed from: a */
        public final ProductCategory f101492a;

        public C39771b(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "category");
            this.f101492a = productCategory;
        }

        /* renamed from: c */
        public static /* synthetic */ C39771b m162288c(C39771b bVar, ProductCategory productCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategory = bVar.f101492a;
            }
            return bVar.mo131130b(productCategory);
        }

        @C12579k
        /* renamed from: a */
        public final ProductCategory mo131129a() {
            return this.f101492a;
        }

        @C12579k
        /* renamed from: b */
        public final C39771b mo131130b(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "category");
            return new C39771b(productCategory);
        }

        @C12579k
        /* renamed from: d */
        public final ProductCategory mo131131d() {
            return this.f101492a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39771b) && Intrinsics.areEqual((Object) this.f101492a, (Object) ((C39771b) obj).f101492a);
        }

        public int hashCode() {
            return this.f101492a.hashCode();
        }

        @C12579k
        public String toString() {
            ProductCategory productCategory = this.f101492a;
            return "OnDepartmentWithoutChildrenClick(category=" + productCategory + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a$c */
    public static final class C39772c implements C39769a {
        @C12579k

        /* renamed from: a */
        public static final C39772c f101493a = new C39772c();

        /* renamed from: b */
        public static final int f101494b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a$d */
    public static final class C39773d implements C39769a {
        @C12579k

        /* renamed from: a */
        public static final C39773d f101495a = new C39773d();

        /* renamed from: b */
        public static final int f101496b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a$e */
    public static final class C39774e implements C39769a {
        @C12579k

        /* renamed from: a */
        public static final C39774e f101497a = new C39774e();

        /* renamed from: b */
        public static final int f101498b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.a$f */
    public static final class C39775f implements C39769a {
        @C12579k

        /* renamed from: a */
        public static final C39775f f101499a = new C39775f();

        /* renamed from: b */
        public static final int f101500b = 0;
    }
}
