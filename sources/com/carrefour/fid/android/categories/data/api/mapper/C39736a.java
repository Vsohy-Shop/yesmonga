package com.carrefour.fid.android.categories.data.api.mapper;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveAvailabilityData;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveAvailabilityDetail;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveOmrAvailability;
import com.carrefour.fid.android.domain.models.category.C37992a;
import com.carrefour.fid.android.domain.models.category.PromiseType;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.categories.data.api.mapper.a */
public final class C39736a {

    /* renamed from: com.carrefour.fid.android.categories.data.api.mapper.a$a */
    public /* synthetic */ class C39737a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType.EXPRESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDrivePromiseType.STANDARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.data.api.mapper.C39736a.C39737a.<clinit>():void");
        }
    }

    @C12580l
    /* renamed from: a */
    public static final C37992a m162170a(@C12579k BffDriveOmrAvailability bffDriveOmrAvailability) {
        BffDriveAvailabilityDetail eligibility;
        PromiseType promiseType;
        Intrinsics.checkNotNullParameter(bffDriveOmrAvailability, "<this>");
        BffDriveAvailabilityData data = bffDriveOmrAvailability.getData();
        if (data == null || (eligibility = data.getEligibility()) == null) {
            return null;
        }
        int i = C39737a.$EnumSwitchMapping$0[eligibility.getPromise().ordinal()];
        if (i == 1) {
            promiseType = PromiseType.Express;
        } else if (i == 2) {
            promiseType = PromiseType.Standard;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new C37992a(promiseType, FacilityServiceId.m157958b(eligibility.getFacilityServiceId()), (DefaultConstructorMarker) null);
    }
}
