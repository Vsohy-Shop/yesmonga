package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23879f;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.nav.C23954a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$requestPermission$1 */
public final class CouponsListFragment$requestPermission$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ CouponsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListFragment$requestPermission$1(CouponsListFragment couponsListFragment) {
        super(0);
        this.this$0 = couponsListFragment;
    }

    public final void invoke() {
        if (this.this$0.f59947v != null) {
            CouponsListFragment couponsListFragment = this.this$0;
            C23879f.C23883d dVar = C23879f.f60042a;
            CouponModel J0 = couponsListFragment.f59947v;
            if (J0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C23954a.f60133a);
                J0 = null;
            }
            FragmentKt.m118823k(couponsListFragment, dVar.mo69959e(J0));
            return;
        }
        CouponsListFragment couponsListFragment2 = this.this$0;
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = couponsListFragment2.getString(R.string.general_an_error_occurred);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_an_error_occurred)");
        FragmentKt.m118811B(couponsListFragment2, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }
}
