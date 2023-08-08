package com.carrefour.fid.android.presentation.p035ui.coupons.filter;

import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.C26249b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "item", "Lkotlin/d2;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.filter.CouponsFilterFragment$renderFilterContent$1$5 */
public final class CouponsFilterFragment$renderFilterContent$1$5 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ CouponsFilter $it;
    final /* synthetic */ CouponsFilterFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsFilterFragment$renderFilterContent$1$5(CouponsFilterFragment couponsFilterFragment, CouponsFilter couponsFilter) {
        super(1);
        this.this$0 = couponsFilterFragment;
        this.$it = couponsFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "item");
        this.this$0.mo69709W0().sendIntent(new C26249b.C26253c.C26257d(this.$it.mo121452h(), str));
    }
}
