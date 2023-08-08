package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nOrderLoyaltyCardsBottomSheetDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderLoyaltyCardsBottomSheetDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrderLoyaltyCardsBottomSheetDialogFragment$initView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrderLoyaltyCardsBottomSheetDialogFragment$initView$1 */
public final class OrderLoyaltyCardsBottomSheetDialogFragment$initView$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ OrderLoyaltyCardsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderLoyaltyCardsBottomSheetDialogFragment$initView$1(OrderLoyaltyCardsBottomSheetDialogFragment orderLoyaltyCardsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = orderLoyaltyCardsBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        FragmentManager childFragmentManager;
        Intrinsics.checkNotNullParameter(str, "it");
        Fragment parentFragment = this.this$0.getParentFragment();
        if (!(parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null)) {
            Bundle bundle = new Bundle();
            bundle.putString(OrderLoyaltyCardsBottomSheetDialogFragment.f61345w, str);
            C11079d2 d2Var = C11079d2.f28267a;
            childFragmentManager.mo56857a(OrderLoyaltyCardsBottomSheetDialogFragment.f61344v, bundle);
        }
        this.this$0.dismiss();
    }
}
