package com.carrefour.fid.android.categories.domain.interactors;

import com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository;
import com.carrefour.fid.android.domain.interactors.category.C37619a;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.performance.C38328d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class CategoriesGetCategoriesUseCase implements C37619a {
    @C12579k

    /* renamed from: a */
    public final CategoriesRepository f101444a;
    @C12579k

    /* renamed from: b */
    public final C37823k f101445b;
    @C12579k

    /* renamed from: c */
    public final C38328d f101446c;

    @Inject
    public CategoriesGetCategoriesUseCase(@C12579k CategoriesRepository categoriesRepository, @C12579k C37823k kVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(categoriesRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f101444a = categoriesRepository;
        this.f101445b = kVar;
        this.f101446c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173107invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.category.ProductCategory>>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase$invoke$1 r0 = (com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase$invoke$1 r0 = new com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase$invoke$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase r0 = (com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x00a4
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase r2 = (com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0064
        L_0x004c:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.performance.d r10 = r9.f101446c
            java.lang.String r2 = "get_categories"
            r10.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.service.k r10 = r9.f101445b
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r9
        L_0x0064:
            boolean r5 = kotlin.Result.m38709i(r10)
            if (r5 == 0) goto L_0x006b
            r10 = 0
        L_0x006b:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 != 0) goto L_0x0081
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "No service selection"
            r10.<init>(r0)
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        L_0x0081:
            com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository r5 = r2.f101444a
            java.lang.String r6 = com.carrefour.fid.android.shared.extension.C28762j0.m119069b(r10)
            java.lang.String[] r7 = new java.lang.String[r3]
            r8 = 0
            java.lang.String r10 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r10)
            r7[r8] = r10
            java.lang.String r10 = "A1QD-151-4000"
            r7[r4] = r10
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r7)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r10 = r5.mo131056a(r6, r10, r0)
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            com.carrefour.fid.android.performance.d r0 = r0.f101446c
            r0.mo121196e()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.domain.interactors.CategoriesGetCategoriesUseCase.m173107invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
