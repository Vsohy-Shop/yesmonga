package com.carrefour.fid.android.categories.data.api.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class DriveOmrAvailabilityApiImpl implements DriveOmrAvailabilityApi {

    /* renamed from: c */
    public static final int f101379c = 8;
    @C12579k

    /* renamed from: a */
    public final BffStoresManagementApi f101380a;
    @C12579k

    /* renamed from: b */
    public final Exception f101381b = new Exception("Error while checking omr drive availability");

    @Inject
    public DriveOmrAvailabilityApiImpl(@C12579k BffStoresManagementApi bffStoresManagementApi) {
        Intrinsics.checkNotNullParameter(bffStoresManagementApi, "bffStoresManagementApi");
        this.f101380a = bffStoresManagementApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo131019a(@org.jetbrains.annotations.C12579k java.lang.String r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.category.C37992a>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl$getDriveOmrAvailability$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl$getDriveOmrAvailability$1 r0 = (com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl$getDriveOmrAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl$getDriveOmrAvailability$1 r0 = new com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl$getDriveOmrAvailability$1
            r0.<init>(r9, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r10 = r6.L$0
            com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl r10 = (com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl) r10
            kotlin.C11661u0.m45747n(r11)     // Catch:{ all -> 0x002e }
            goto L_0x005a
        L_0x002e:
            r11 = move-exception
            goto L_0x0063
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result$a r11 = kotlin.Result.f28060a     // Catch:{ all -> 0x0061 }
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi r1 = r9.f101380a     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = com.carrefour.fid.android.shared.extension.C28789y.m119125h(r10)     // Catch:{ all -> 0x0061 }
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r8 = 0
            r6.L$0 = r9     // Catch:{ all -> 0x0061 }
            r6.label = r2     // Catch:{ all -> 0x0061 }
            r2 = r10
            java.lang.Object r11 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi.DefaultImpls.getDriveAvailability$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0061 }
            if (r11 != r0) goto L_0x0059
            return r0
        L_0x0059:
            r10 = r9
        L_0x005a:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveOmrAvailability r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveOmrAvailability) r11     // Catch:{ all -> 0x002e }
            java.lang.Object r11 = kotlin.Result.m38702b(r11)     // Catch:{ all -> 0x002e }
            goto L_0x006d
        L_0x0061:
            r11 = move-exception
            r10 = r9
        L_0x0063:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x006d:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r11)
            if (r0 != 0) goto L_0x0092
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveOmrAvailability r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveOmrAvailability) r11
            com.carrefour.fid.android.domain.models.category.a r10 = com.carrefour.fid.android.categories.data.api.mapper.C39736a.m162170a(r11)
            if (r10 == 0) goto L_0x0082
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x00bc
        L_0x0082:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi$OmrDriveUnavailable r10 = new com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi$OmrDriveUnavailable
            r10.<init>()
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x00bc
        L_0x0092:
            boolean r11 = r0 instanceof retrofit2.HttpException
            if (r11 == 0) goto L_0x00b0
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r11 = r0.mo30431a()
            r0 = 404(0x194, float:5.66E-43)
            if (r11 != r0) goto L_0x00b0
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi$OmrDriveUnavailable r10 = new com.carrefour.fid.android.categories.domain.datasource.DriveOmrAvailabilityApi$OmrDriveUnavailable
            r10.<init>()
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x00bc
        L_0x00b0:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Exception r10 = r10.f101381b
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
        L_0x00bc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.data.api.datasource.DriveOmrAvailabilityApiImpl.mo131019a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
