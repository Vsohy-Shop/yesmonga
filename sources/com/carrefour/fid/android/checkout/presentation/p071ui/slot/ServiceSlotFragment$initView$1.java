package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import com.carrefour.fid.android.domain.models.slot.Slot;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "datePosition", "Lkotlin/d2;", "a", "(I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment$initView$1 */
public final class ServiceSlotFragment$initView$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ ServiceSlotFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotFragment$initView$1(ServiceSlotFragment serviceSlotFragment) {
        super(1);
        this.this$0 = serviceSlotFragment;
    }

    /* renamed from: a */
    public final void mo131543a(int i) {
        this.this$0.mo131523n1((Slot) null);
        this.this$0.mo131508b1().sendIntent(new C39964a.C39977d.C39979b(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo131543a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
