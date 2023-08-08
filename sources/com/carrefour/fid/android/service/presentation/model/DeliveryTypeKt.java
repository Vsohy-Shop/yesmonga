package com.carrefour.fid.android.service.presentation.model;

import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo22516d2 = {"toStoreServiceType", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeliveryTypeKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.service.presentation.model.DeliveryType[] r0 = com.carrefour.fid.android.service.presentation.model.DeliveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.H1h3     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.model.DeliveryTypeKt.WhenMappings.<clinit>():void");
        }
    }

    @C12579k
    public static final StoreServiceType toStoreServiceType(@C12579k DeliveryType deliveryType) {
        Intrinsics.checkNotNullParameter(deliveryType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[deliveryType.ordinal()];
        if (i == 1) {
            return StoreServiceType.Clcv.INSTANCE;
        }
        if (i == 2) {
            return StoreServiceType.H1h3.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
