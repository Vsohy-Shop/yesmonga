package com.carrefour.fid.android.presentation.p035ui.home.departments;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.a */
public interface C24137a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.a$a */
    public static final class C24138a implements C24137a {

        /* renamed from: b */
        public static final int f60376b = 8;
        @C12579k

        /* renamed from: a */
        public final ProductCategory f60377a;

        public C24138a(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "department");
            this.f60377a = productCategory;
        }

        /* renamed from: c */
        public static /* synthetic */ C24138a m106283c(C24138a aVar, ProductCategory productCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                productCategory = aVar.f60377a;
            }
            return aVar.mo70537b(productCategory);
        }

        @C12579k
        /* renamed from: a */
        public final ProductCategory mo70536a() {
            return this.f60377a;
        }

        @C12579k
        /* renamed from: b */
        public final C24138a mo70537b(@C12579k ProductCategory productCategory) {
            Intrinsics.checkNotNullParameter(productCategory, "department");
            return new C24138a(productCategory);
        }

        @C12579k
        /* renamed from: d */
        public final ProductCategory mo70538d() {
            return this.f60377a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24138a) && Intrinsics.areEqual((Object) this.f60377a, (Object) ((C24138a) obj).f60377a);
        }

        public int hashCode() {
            return this.f60377a.hashCode();
        }

        @C12579k
        public String toString() {
            ProductCategory productCategory = this.f60377a;
            return "OnDepartmentClick(department=" + productCategory + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.a$b */
    public static final class C24139b implements C24137a {
        @C12579k

        /* renamed from: a */
        public static final C24139b f60378a = new C24139b();

        /* renamed from: b */
        public static final int f60379b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.home.departments.a$c */
    public static final class C24140c implements C24137a {
        @C12579k

        /* renamed from: a */
        public static final C24140c f60380a = new C24140c();

        /* renamed from: b */
        public static final int f60381b = 0;
    }
}
