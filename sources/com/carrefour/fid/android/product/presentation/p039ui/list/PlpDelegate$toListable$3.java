package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/utils/a;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/utils/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$toListable$3 */
public final class PlpDelegate$toListable$3 extends Lambda implements C11300l<C37133a, C11079d2> {
    final /* synthetic */ int $position;
    final /* synthetic */ C27670g $this_toListable;
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$toListable$3(PlpDelegate plpDelegate, C27670g gVar, int i) {
        super(1);
        this.this$0 = plpDelegate;
        this.$this_toListable = gVar;
        this.$position = i;
    }

    /* renamed from: a */
    public final void mo81536a(@C12579k C37133a aVar) {
        String str;
        Intrinsics.checkNotNullParameter(aVar, "it");
        this.this$0.f67872j.add(aVar);
        PlpViewModel h = this.this$0.mo81509o();
        C38115c j = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j();
        boolean n = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118846n();
        C38012n w = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118886w();
        if (w != null) {
            str = w.mo117558n();
        } else {
            str = null;
        }
        h.sendIntent(new PlpViewModel.C28181c.C28190i(j, n, str));
        this.this$0.f67867e.mo80231h(((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j(), this.$position, !((C27670g.C27676f) this.$this_toListable).mo80412e().mo118846n());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81536a((C37133a) obj);
        return C11079d2.f28267a;
    }
}
