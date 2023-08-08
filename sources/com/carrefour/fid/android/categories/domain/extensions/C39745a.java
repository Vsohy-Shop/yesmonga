package com.carrefour.fid.android.categories.domain.extensions;

import com.carrefour.fid.android.categories.domain.models.DepartmentModel;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductCategoryExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductCategoryExtensions.kt\ncom/carrefour/fid/android/categories/domain/extensions/ProductCategoryExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1549#2:34\n1620#2,3:35\n1855#2:38\n1856#2:40\n1#3:39\n*S KotlinDebug\n*F\n+ 1 ProductCategoryExtensions.kt\ncom/carrefour/fid/android/categories/domain/extensions/ProductCategoryExtensionsKt\n*L\n10#1:34\n10#1:35,3\n17#1:38\n17#1:40\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.domain.extensions.a */
public final class C39745a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.carrefour.fid.android.domain.models.category.ProductCategory} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.category.ProductCategory m162191a(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory> r6, @org.jetbrains.annotations.C12580l java.lang.String r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r0 = r6.iterator()
        L_0x000b:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.domain.models.category.ProductCategory r1 = (com.carrefour.fid.android.domain.models.category.ProductCategory) r1
            java.util.List r3 = r1.mo117293m()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.carrefour.fid.android.domain.models.category.ProductCategory r5 = (com.carrefour.fid.android.domain.models.category.ProductCategory) r5
            java.lang.String r5 = r5.mo117294n()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x0022
            r2 = r4
        L_0x003a:
            com.carrefour.fid.android.domain.models.category.ProductCategory r2 = (com.carrefour.fid.android.domain.models.category.ProductCategory) r2
            if (r2 == 0) goto L_0x003f
            return r2
        L_0x003f:
            java.util.List r1 = r1.mo117293m()
            m162191a(r1, r7)
            goto L_0x000b
        L_0x0047:
            java.util.Iterator r6 = r6.iterator()
        L_0x004b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.category.ProductCategory r1 = (com.carrefour.fid.android.domain.models.category.ProductCategory) r1
            java.lang.String r1 = r1.mo117294n()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            if (r1 == 0) goto L_0x004b
            goto L_0x0064
        L_0x0063:
            r0 = r2
        L_0x0064:
            com.carrefour.fid.android.domain.models.category.ProductCategory r0 = (com.carrefour.fid.android.domain.models.category.ProductCategory) r0
            if (r0 == 0) goto L_0x0069
            return r0
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.domain.extensions.C39745a.m162191a(java.util.List, java.lang.String):com.carrefour.fid.android.domain.models.category.ProductCategory");
    }

    @C12579k
    /* renamed from: b */
    public static final DepartmentModel m162192b(@C12579k ProductCategory productCategory) {
        Intrinsics.checkNotNullParameter(productCategory, "<this>");
        String n = productCategory.mo117294n();
        String q = productCategory.mo117297q();
        String o = productCategory.mo117295o();
        Iterable<ProductCategory> m = productCategory.mo117293m();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(m, 10));
        for (ProductCategory b : m) {
            arrayList.add(m162192b(b));
        }
        return new DepartmentModel(n, q, o, arrayList, productCategory.mo117300t(), productCategory.mo117299s(), productCategory.mo117298r());
    }
}
