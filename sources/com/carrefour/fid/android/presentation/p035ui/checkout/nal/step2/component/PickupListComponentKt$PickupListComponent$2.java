package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import com.carrefour.fid.android.domain.models.pickup.C38080a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.PickupListComponentKt$PickupListComponent$2 */
public final class PickupListComponentKt$PickupListComponent$2 extends Lambda implements C11300l<Integer, Object> {
    final /* synthetic */ List<C38080a> $pickupList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickupListComponentKt$PickupListComponent$2(List<C38080a> list) {
        super(1);
        this.$pickupList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @C12579k
    public final Object invoke(int i) {
        return this.$pickupList.get(i).mo118294u();
    }
}
