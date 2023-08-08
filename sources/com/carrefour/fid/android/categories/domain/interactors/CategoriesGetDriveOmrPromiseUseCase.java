package com.carrefour.fid.android.categories.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class CategoriesGetDriveOmrPromiseUseCase implements C37620b {

    /* renamed from: c */
    public static final int f101447c = 8;
    @C12579k

    /* renamed from: a */
    public final C37823k f101448a;
    @C12579k

    /* renamed from: b */
    public final DriveOmrAvailabilityApi f101449b;

    @Inject
    public CategoriesGetDriveOmrPromiseUseCase(@C12579k C37823k kVar, @C12579k DriveOmrAvailabilityApi driveOmrAvailabilityApi) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(driveOmrAvailabilityApi, "driveOmrAvailabilityApi");
        this.f101448a = kVar;
        this.f101449b = driveOmrAvailabilityApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173108invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.category.C37992a>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase$invoke$1 r0 = (com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase$invoke$1 r0 = new com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x007f
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase r2 = (com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0059
        L_0x0048:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.service.k r7 = r6.f101448a
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r6
        L_0x0059:
            boolean r4 = kotlin.Result.m38709i(r7)
            r5 = 0
            if (r4 == 0) goto L_0x0061
            r7 = r5
        L_0x0061:
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            if (r7 == 0) goto L_0x0092
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = r7.mo119354f()
            if (r7 == 0) goto L_0x0080
            java.lang.String r7 = r7.mo119163G()
            if (r7 != 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi r2 = r2.f101449b
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r2.mo131019a(r7, r0)
            if (r7 != r1) goto L_0x007f
            return r1
        L_0x007f:
            return r7
        L_0x0080:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r0 = "No facility service id"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x0092:
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r7 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.domain.interactors.CategoriesGetDriveOmrPromiseUseCase.m173108invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
