package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000XT¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00038À\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo22516d2 = {"", "DELIVERY_TYPE", "Ljava/lang/String;", "Landroidx/lifecycle/p0;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "getDeliveryType", "(Landroidx/lifecycle/p0;)Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "deliveryType", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
public final class NavArgumentsKt {
    @C12579k
    public static final String DELIVERY_TYPE = "deliveryType";

    @C12579k
    public static final DeliveryType getDeliveryType(@C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Object h = p0Var.mo57648h(DELIVERY_TYPE);
        Intrinsics.checkNotNull(h);
        return (DeliveryType) h;
    }
}
