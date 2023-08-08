package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/ClcvService;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "isAvailable", "", "minOrderAmount", "", "freeOrderThreshold", "(ZDLjava/lang/Double;)V", "getFreeOrderThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "getMinOrderAmount", "()D", "component1", "component2", "component3", "copy", "(ZDLjava/lang/Double;)Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/ClcvService;", "equals", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public final class ClcvService implements DeliveryService {
    public static final int $stable = 0;
    @C12580l
    private final Double freeOrderThreshold;
    private final boolean isAvailable;
    private final double minOrderAmount;

    public ClcvService(boolean z, double d, @C12580l Double d2) {
        this.isAvailable = z;
        this.minOrderAmount = d;
        this.freeOrderThreshold = d2;
    }

    public static /* synthetic */ ClcvService copy$default(ClcvService clcvService, boolean z, double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = clcvService.isAvailable;
        }
        if ((i & 2) != 0) {
            d = clcvService.minOrderAmount;
        }
        if ((i & 4) != 0) {
            d2 = clcvService.freeOrderThreshold;
        }
        return clcvService.copy(z, d, d2);
    }

    public final boolean component1() {
        return this.isAvailable;
    }

    public final double component2() {
        return this.minOrderAmount;
    }

    @C12580l
    public final Double component3() {
        return this.freeOrderThreshold;
    }

    @C12579k
    public final ClcvService copy(boolean z, double d, @C12580l Double d2) {
        return new ClcvService(z, d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClcvService)) {
            return false;
        }
        ClcvService clcvService = (ClcvService) obj;
        return this.isAvailable == clcvService.isAvailable && Double.compare(this.minOrderAmount, clcvService.minOrderAmount) == 0 && Intrinsics.areEqual((Object) this.freeOrderThreshold, (Object) clcvService.freeOrderThreshold);
    }

    @C12580l
    public final Double getFreeOrderThreshold() {
        return this.freeOrderThreshold;
    }

    public final double getMinOrderAmount() {
        return this.minOrderAmount;
    }

    public int hashCode() {
        boolean z = this.isAvailable;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + Double.hashCode(this.minOrderAmount)) * 31;
        Double d = this.freeOrderThreshold;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @C12579k
    public String toString() {
        boolean z = this.isAvailable;
        double d = this.minOrderAmount;
        Double d2 = this.freeOrderThreshold;
        return "ClcvService(isAvailable=" + z + ", minOrderAmount=" + d + ", freeOrderThreshold=" + d2 + ")";
    }
}
