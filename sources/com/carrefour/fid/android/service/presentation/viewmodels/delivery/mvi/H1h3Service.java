package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/H1h3Service;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "isAvailable", "", "minOrderAmount", "", "deliveryCost", "(ZDD)V", "getDeliveryCost", "()D", "()Z", "getMinOrderAmount", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public final class H1h3Service implements DeliveryService {
    public static final int $stable = 0;
    private final double deliveryCost;
    private final boolean isAvailable;
    private final double minOrderAmount;

    public H1h3Service(boolean z, double d, double d2) {
        this.isAvailable = z;
        this.minOrderAmount = d;
        this.deliveryCost = d2;
    }

    public static /* synthetic */ H1h3Service copy$default(H1h3Service h1h3Service, boolean z, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = h1h3Service.isAvailable;
        }
        if ((i & 2) != 0) {
            d = h1h3Service.minOrderAmount;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = h1h3Service.deliveryCost;
        }
        return h1h3Service.copy(z, d3, d2);
    }

    public final boolean component1() {
        return this.isAvailable;
    }

    public final double component2() {
        return this.minOrderAmount;
    }

    public final double component3() {
        return this.deliveryCost;
    }

    @C12579k
    public final H1h3Service copy(boolean z, double d, double d2) {
        return new H1h3Service(z, d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H1h3Service)) {
            return false;
        }
        H1h3Service h1h3Service = (H1h3Service) obj;
        return this.isAvailable == h1h3Service.isAvailable && Double.compare(this.minOrderAmount, h1h3Service.minOrderAmount) == 0 && Double.compare(this.deliveryCost, h1h3Service.deliveryCost) == 0;
    }

    public final double getDeliveryCost() {
        return this.deliveryCost;
    }

    public final double getMinOrderAmount() {
        return this.minOrderAmount;
    }

    public int hashCode() {
        boolean z = this.isAvailable;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Double.hashCode(this.minOrderAmount)) * 31) + Double.hashCode(this.deliveryCost);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @C12579k
    public String toString() {
        boolean z = this.isAvailable;
        double d = this.minOrderAmount;
        double d2 = this.deliveryCost;
        return "H1h3Service(isAvailable=" + z + ", minOrderAmount=" + d + ", deliveryCost=" + d2 + ")";
    }
}
