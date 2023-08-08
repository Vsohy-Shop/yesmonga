package com.carrefour.fid.android.cms.domain.extension;

import com.carrefour.fid.android.cms.data.entities.DeliveryRateBlocksPojo;
import com.carrefour.fid.android.domain.models.C38037g;
import com.carrefour.fid.android.domain.models.C38038h;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, mo22516d2 = {"com/carrefour/fid/android/cms/domain/extension/DeliveryRateKt$toDomain$1$1", "Lcom/carrefour/fid/android/domain/models/h;", "", "getTitle", "()Ljava/lang/String;", "title", "Lcom/carrefour/fid/android/domain/models/g;", "getDeliveryPrice", "()Lcom/carrefour/fid/android/domain/models/g;", "deliveryPrice", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class DeliveryRateKt$toDomain$1$1 implements C38038h {
    final /* synthetic */ DeliveryRateBlocksPojo $block;

    public DeliveryRateKt$toDomain$1$1(DeliveryRateBlocksPojo deliveryRateBlocksPojo) {
        this.$block = deliveryRateBlocksPojo;
    }

    @C12580l
    public C38037g getDeliveryPrice() {
        String description = this.$block.getDescription();
        if (description != null) {
            return DeliveryRateKt.toDeliveryPrice(description);
        }
        return null;
    }

    @C12580l
    public String getTitle() {
        return this.$block.getTitle();
    }
}
