package com.carrefour.fid.android.account.presentation.p018ui.address;

import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "isChecked", "Lkotlin/d2;", "a", "(Z)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$initView$4 */
public final class UpdateUserAddressFragment$initView$4 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ UpdateUserAddressFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserAddressFragment$initView$4(UpdateUserAddressFragment updateUserAddressFragment) {
        super(1);
        this.this$0 = updateUserAddressFragment;
    }

    /* renamed from: a */
    public final void mo31852a(boolean z) {
        if (z) {
            this.this$0.mo31821n1().sendIntent(C13645a.C13665d.C13670e.f33257a);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo31852a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
