package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DeliveryRatePojo;", "", "blocks", "", "Lcom/carrefour/fid/android/cms/data/entities/DeliveryRateBlocksPojo;", "(Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class DeliveryRatePojo {
    @C33608c("blocks")
    @C12580l
    private final List<DeliveryRateBlocksPojo> blocks;

    public DeliveryRatePojo(@C12580l List<DeliveryRateBlocksPojo> list) {
        this.blocks = list;
    }

    public static /* synthetic */ DeliveryRatePojo copy$default(DeliveryRatePojo deliveryRatePojo, List<DeliveryRateBlocksPojo> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deliveryRatePojo.blocks;
        }
        return deliveryRatePojo.copy(list);
    }

    @C12580l
    public final List<DeliveryRateBlocksPojo> component1() {
        return this.blocks;
    }

    @C12579k
    public final DeliveryRatePojo copy(@C12580l List<DeliveryRateBlocksPojo> list) {
        return new DeliveryRatePojo(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryRatePojo) && Intrinsics.areEqual((Object) this.blocks, (Object) ((DeliveryRatePojo) obj).blocks);
    }

    @C12580l
    public final List<DeliveryRateBlocksPojo> getBlocks() {
        return this.blocks;
    }

    public int hashCode() {
        List<DeliveryRateBlocksPojo> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @C12579k
    public String toString() {
        List<DeliveryRateBlocksPojo> list = this.blocks;
        return "DeliveryRatePojo(blocks=" + list + ")";
    }
}
