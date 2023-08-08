package com.carrefour.fid.android.service.domain.extension;

import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11621s;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0002¨\u0006\b"}, mo22516d2 = {"getDriveType", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "isDataValid", "", "isDelivery", "isDrive", "isH1h3", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreServiceKt {
    @C12580l
    public static final DriveType getDriveType(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "<this>");
        Integer intOrNull = C11621s.toIntOrNull(storeService.mo119175S());
        if (intOrNull == null) {
            return null;
        }
        return DriveType.f96568a.mo119106a(intOrNull.intValue());
    }

    public static final boolean isDataValid(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "<this>");
        if (!(!C11622t.isBlank(storeService.mo119163G())) || !(!C11622t.isBlank(storeService.mo119167K()))) {
            return false;
        }
        return true;
    }

    public static final boolean isDelivery(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "<this>");
        String S = storeService.mo119175S();
        if (Intrinsics.areEqual((Object) S, (Object) "151")) {
            return true;
        }
        return Intrinsics.areEqual((Object) S, (Object) "288");
    }

    public static final boolean isDrive(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "<this>");
        if (getDriveType(storeService) != null) {
            return true;
        }
        return false;
    }

    public static final boolean isH1h3(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "<this>");
        return Intrinsics.areEqual((Object) storeService.mo119175S(), (Object) "288");
    }
}
