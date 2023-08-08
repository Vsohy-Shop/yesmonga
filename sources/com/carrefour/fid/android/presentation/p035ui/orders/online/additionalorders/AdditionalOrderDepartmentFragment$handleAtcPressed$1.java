package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.os.Bundle;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26847b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment$handleAtcPressed$1 */
public final class AdditionalOrderDepartmentFragment$handleAtcPressed$1 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ AdditionalOrderDepartmentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdditionalOrderDepartmentFragment$handleAtcPressed$1(AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment) {
        super(1);
        this.this$0 = additionalOrderDepartmentFragment;
    }

    /* renamed from: a */
    public final void mo72700a(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        this.this$0.mo72676d1().sendIntent(new C26847b.C26857c.C26864g(false));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo72700a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
