package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment$handleSlotError$1 */
public final class ServiceSlotOmrFragment$handleSlotError$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ServiceSlotOmrFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotOmrFragment$handleSlotError$1(ServiceSlotOmrFragment serviceSlotOmrFragment) {
        super(0);
        this.this$0 = serviceSlotOmrFragment;
    }

    public final void invoke() {
        ServiceSlotOmrViewModel T0 = this.this$0.mo131546Z0();
        String m = this.this$0.mo131545Y0().mo131662m();
        boolean q = this.this$0.mo131545Y0().mo131666q();
        BasketSlot k = this.this$0.mo131545Y0().mo131660k();
        String j = k != null ? k.mo116999j() : null;
        BasketSlot k2 = this.this$0.mo131545Y0().mo131660k();
        T0.sendIntent(new C39964a.C39977d.C39978a(m, (SlotArgsHome) null, false, q, j, k2 != null ? k2.mo117001l() : false));
    }
}
