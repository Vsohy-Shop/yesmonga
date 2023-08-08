package com.carrefour.fid.android.categories.domain.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
public final class CategoriesRepository {
    @C12579k

    /* renamed from: a */
    public final CategoriesDataSource f101464a;
    @C12579k

    /* renamed from: b */
    public final Map<C39750a, List<ProductCategory>> f101465b = new LinkedHashMap();

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$a */
    public static final class C39750a {

        /* renamed from: c */
        public static final int f101466c = 0;
        @C12579k

        /* renamed from: a */
        public final String f101467a;
        @C12579k

        /* renamed from: b */
        public final String f101468b;

        public C39750a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "store");
            Intrinsics.checkNotNullParameter(str2, "storeServiceId");
            this.f101467a = str;
            this.f101468b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C39750a m162218d(C39750a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f101467a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f101468b;
            }
            return aVar.mo131059c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo131057a() {
            return this.f101467a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo131058b() {
            return this.f101468b;
        }

        @C12579k
        /* renamed from: c */
        public final C39750a mo131059c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "store");
            Intrinsics.checkNotNullParameter(str2, "storeServiceId");
            return new C39750a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo131060e() {
            return this.f101467a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39750a)) {
                return false;
            }
            C39750a aVar = (C39750a) obj;
            return Intrinsics.areEqual((Object) this.f101467a, (Object) aVar.f101467a) && Intrinsics.areEqual((Object) this.f101468b, (Object) aVar.f101468b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo131062f() {
            return this.f101468b;
        }

        public int hashCode() {
            return (this.f101467a.hashCode() * 31) + this.f101468b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f101467a;
            String str2 = this.f101468b;
            return "Identifier(store=" + str + ", storeServiceId=" + str2 + ")";
        }
    }

    @Inject
    public CategoriesRepository(@C12579k CategoriesDataSource categoriesDataSource) {
        Intrinsics.checkNotNullParameter(categoriesDataSource, "apiSource");
        this.f101464a = categoriesDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131056a(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$getCategories$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$getCategories$1 r0 = (com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$getCategories$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$getCategories$1 r0 = new com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$getCategories$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$a r6 = (com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository.C39750a) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository r7 = (com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0071
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$a r8 = new com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$a
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r7)
            java.lang.String r2 = (java.lang.String) r2
            r8.<init>(r6, r2)
            java.util.Map<com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$a, java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>> r6 = r5.f101465b
            java.lang.Object r6 = r6.get(r8)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x005e
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x008e
        L_0x005e:
            com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource r6 = r5.f101464a
            r0.L$0 = r5
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r6 = r6.mo131018a(r7, r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r7 = r5
            r4 = r8
            r8 = r6
            r6 = r4
        L_0x0071:
            boolean r0 = kotlin.Result.m38710j(r8)
            if (r0 == 0) goto L_0x008d
            java.util.Map<com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository$a, java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>> r7 = r7.f101465b
            boolean r0 = kotlin.Result.m38709i(r8)
            if (r0 == 0) goto L_0x0081
            r0 = 0
            goto L_0x0082
        L_0x0081:
            r0 = r8
        L_0x0082:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x008a
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x008a:
            r7.put(r6, r0)
        L_0x008d:
            r6 = r8
        L_0x008e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository.mo131056a(java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
