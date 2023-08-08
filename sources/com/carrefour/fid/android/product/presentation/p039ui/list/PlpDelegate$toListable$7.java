package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$toListable$7 */
public final class PlpDelegate$toListable$7 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C27670g $this_toListable;
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$toListable$7(PlpDelegate plpDelegate, C27670g gVar) {
        super(0);
        this.this$0 = plpDelegate;
        this.$this_toListable = gVar;
    }

    public final void invoke() {
        this.this$0.mo81509o().sendIntent(new PlpViewModel.C28181c.C28185d(((C27670g.C27676f) this.$this_toListable).mo80412e()));
        this.this$0.f67867e.mo80230g();
    }
}
