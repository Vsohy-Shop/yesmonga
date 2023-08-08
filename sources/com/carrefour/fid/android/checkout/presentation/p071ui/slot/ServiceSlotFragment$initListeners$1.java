package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import com.carrefour.fid.android.checkout.domain.extension.C39854b;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent;
import com.carrefour.fid.android.domain.models.slot.Slot;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent$ServiceSlotPartOfDay;", "dayTimePosition", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/widgets/ServiceSlotDayTimeComponent$ServiceSlotPartOfDay;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$initListeners$1 */
public final class ServiceSlotFragment$initListeners$1 extends Lambda implements C11300l<ServiceSlotDayTimeComponent.ServiceSlotPartOfDay, C11079d2> {
    final /* synthetic */ ServiceSlotFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotFragment$initListeners$1(ServiceSlotFragment serviceSlotFragment) {
        super(1);
        this.this$0 = serviceSlotFragment;
    }

    /* renamed from: a */
    public final void mo131540a(@C12579k ServiceSlotDayTimeComponent.ServiceSlotPartOfDay serviceSlotPartOfDay) {
        Intrinsics.checkNotNullParameter(serviceSlotPartOfDay, "dayTimePosition");
        this.this$0.mo131523n1((Slot) null);
        this.this$0.mo131508b1().sendIntent(new C39964a.C39977d.C39982e(C39854b.m162474a(serviceSlotPartOfDay)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo131540a((ServiceSlotDayTimeComponent.ServiceSlotPartOfDay) obj);
        return C11079d2.f28267a;
    }
}
