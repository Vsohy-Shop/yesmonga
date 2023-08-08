package com.carrefour.fid.android.product.presentation.p039ui.list;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.analytics.C27633c;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.models.extensions.C27661d;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$toListable$4 */
public final class PlpDelegate$toListable$4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ int $position;
    final /* synthetic */ C27670g $this_toListable;
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$toListable$4(C27670g gVar, PlpDelegate plpDelegate, int i) {
        super(0);
        this.$this_toListable = gVar;
        this.this$0 = plpDelegate;
        this.$position = i;
    }

    public final void invoke() {
        String k;
        PlpOffer i = C27662e.m116389i(((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j());
        if (i != null) {
            C38012n w = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118886w();
            if (!(w == null || (k = w.mo117555k()) == null)) {
                this.this$0.mo81509o().sendIntent(new PlpViewModel.C28181c.C28189h(k));
            }
            this.this$0.mo81509o().sendIntent(new PlpViewModel.C28181c.C28191j(i.mo118819v(), !((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118860K()));
            PlpProductAnalytics b = this.this$0.f67867e;
            String D = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118853D();
            String A = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118850A();
            ProductCategory v = ((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j().mo118885v();
            String q = v != null ? v.mo117297q() : null;
            if (q == null) {
                q = "";
            }
            String str = q;
            PlpOffer i2 = C27662e.m116389i(((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j());
            b.mo80238o(new C27633c(D, A, str, (String) null, String.valueOf(i2 != null ? (float) C27661d.m116376c(i2) : 0.0f), (Integer) null, C27662e.m116383c(((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j()), (String) null, (String) null, this.this$0.mo81506H(((C27670g.C27676f) this.$this_toListable).mo80412e().mo118842j(), i).mo32724a(), FirebaseProductDimension.CLASSIC.mo32726q(), C16717v.C16720c.f42235v, (DefaultConstructorMarker) null), this.$position);
        }
    }
}
