package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.AlternativeProductsBottomSheetFragment;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$toListable$8 */
public final class PlpDelegate$toListable$8 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C27670g $this_toListable;
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$toListable$8(C27670g gVar, PlpDelegate plpDelegate) {
        super(0);
        this.$this_toListable = gVar;
        this.this$0 = plpDelegate;
    }

    public final void invoke() {
        AlternativeProductsBottomSheetFragment.f67217v.mo80464a(((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118850A()).show(this.this$0.f67863a.requireActivity().mo57175g0(), (String) null);
    }
}
