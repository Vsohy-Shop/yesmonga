package com.carrefour.fid.android.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.C38038h;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface GetDeliveryRateUseCase extends C37679f<C37872a, List<? extends C38038h>> {

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/interactors/user/GetDeliveryRateUseCase$DeliveryType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum DeliveryType {
        Clcv,
        H1h3
    }

    /* renamed from: com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase$a */
    public static final class C37872a {
        @C12579k

        /* renamed from: a */
        public final DeliveryType f94993a;

        public C37872a(@C12579k DeliveryType deliveryType) {
            Intrinsics.checkNotNullParameter(deliveryType, NavArgumentsKt.DELIVERY_TYPE);
            this.f94993a = deliveryType;
        }

        /* renamed from: c */
        public static /* synthetic */ C37872a m155122c(C37872a aVar, DeliveryType deliveryType, int i, Object obj) {
            if ((i & 1) != 0) {
                deliveryType = aVar.f94993a;
            }
            return aVar.mo115352b(deliveryType);
        }

        @C12579k
        /* renamed from: a */
        public final DeliveryType mo115351a() {
            return this.f94993a;
        }

        @C12579k
        /* renamed from: b */
        public final C37872a mo115352b(@C12579k DeliveryType deliveryType) {
            Intrinsics.checkNotNullParameter(deliveryType, NavArgumentsKt.DELIVERY_TYPE);
            return new C37872a(deliveryType);
        }

        @C12579k
        /* renamed from: d */
        public final DeliveryType mo115353d() {
            return this.f94993a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37872a) && this.f94993a == ((C37872a) obj).f94993a;
        }

        public int hashCode() {
            return this.f94993a.hashCode();
        }

        @C12579k
        public String toString() {
            DeliveryType deliveryType = this.f94993a;
            return "Params(deliveryType=" + deliveryType + ")";
        }
    }
}
