package com.carrefour.fid.android.presentation.p035ui.orders;

import android.content.Context;
import com.carrefour.fid.android.shared.base.BaseViewPagerAdapter;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;", "a", "()Lcom/carrefour/fid/android/shared/base/BaseViewPagerAdapter;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersFragment$viewPagerAdapter$2 */
public final class OrdersFragment$viewPagerAdapter$2 extends Lambda implements C11289a<BaseViewPagerAdapter> {
    final /* synthetic */ OrdersFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersFragment$viewPagerAdapter$2(OrdersFragment ordersFragment) {
        super(0);
        this.this$0 = ordersFragment;
    }

    @C12579k
    /* renamed from: a */
    public final BaseViewPagerAdapter invoke() {
        OrdersFragment ordersFragment = this.this$0;
        Context context = ordersFragment.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.content.Context");
        return new BaseViewPagerAdapter(ordersFragment, context);
    }
}
