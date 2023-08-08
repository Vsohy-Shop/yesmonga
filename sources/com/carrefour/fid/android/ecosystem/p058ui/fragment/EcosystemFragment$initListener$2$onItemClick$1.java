package com.carrefour.fid.android.ecosystem.p058ui.fragment;

import android.content.Context;
import android.view.View;
import com.carrefour.fid.android.ecosystem.C38220a;
import com.carrefour.fid.android.ecosystem.contrat.C38221a;
import com.carrefour.fid.android.shared.util.C28951s;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.ecosystem.ui.fragment.EcosystemFragment$initListener$2$onItemClick$1 */
public final class EcosystemFragment$initListener$2$onItemClick$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ int $position;
    final /* synthetic */ View $view;
    final /* synthetic */ EcosystemFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EcosystemFragment$initListener$2$onItemClick$1(View view, EcosystemFragment ecosystemFragment, int i) {
        super(0);
        this.$view = view;
        this.this$0 = ecosystemFragment;
        this.$position = i;
    }

    public final void invoke() {
        C28951s sVar = C28951s.f70964a;
        Context context = this.$view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        C28951s.m119749l(sVar, context, ((C38220a) this.this$0.f96861v.get(this.$position)).mo119642b(), (C11289a) null, (C11289a) null, 12, (Object) null);
        C38221a T0 = this.this$0.f96862w;
        if (T0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            T0 = null;
        }
        T0.mo119647a(((C38220a) this.this$0.f96861v.get(this.$position)).mo119641a());
    }
}
