package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36855v6;
import com.carrefour.fid.android.design.components.divider.C37094b;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.adapter.C24739b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/OrderLoyaltyCardsBottomSheetDialogFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/v6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "S0", "", "", "R0", "()Ljava/util/List;", "loyaltyCards", "<init>", "()V", "f", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrderLoyaltyCardsBottomSheetDialogFragment */
public final class OrderLoyaltyCardsBottomSheetDialogFragment extends C24737a<C36855v6> {
    @C12579k

    /* renamed from: f */
    public static final C24707a f61342f = new C24707a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f61343g = 0;
    @C12579k

    /* renamed from: v */
    public static final String f61344v = "onDismissLoyaltyCards";
    @C12579k

    /* renamed from: w */
    public static final String f61345w = "selectedLoyaltyCard";
    @C12579k

    /* renamed from: x */
    public static final String f61346x = "loyaltyCards";

    @C11363r0({"SMAP\nOrderLoyaltyCardsBottomSheetDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderLoyaltyCardsBottomSheetDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrderLoyaltyCardsBottomSheetDialogFragment$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,58:1\n37#2,2:59\n*S KotlinDebug\n*F\n+ 1 OrderLoyaltyCardsBottomSheetDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrderLoyaltyCardsBottomSheetDialogFragment$Companion\n*L\n27#1:59,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrderLoyaltyCardsBottomSheetDialogFragment$a */
    public static final class C24707a {
        public /* synthetic */ C24707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final OrderLoyaltyCardsBottomSheetDialogFragment mo72207a(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, OrderLoyaltyCardsBottomSheetDialogFragment.f61346x);
            OrderLoyaltyCardsBottomSheetDialogFragment orderLoyaltyCardsBottomSheetDialogFragment = new OrderLoyaltyCardsBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArray(OrderLoyaltyCardsBottomSheetDialogFragment.f61346x, (String[]) list.toArray(new String[0]));
            orderLoyaltyCardsBottomSheetDialogFragment.setArguments(bundle);
            return orderLoyaltyCardsBottomSheetDialogFragment;
        }

        public C24707a() {
        }
    }

    public OrderLoyaltyCardsBottomSheetDialogFragment() {
        super(C247051.f61347a, C247062.f61348a, true);
    }

    /* renamed from: R0 */
    public final List<String> mo72203R0() {
        String[] stringArray;
        List<String> kz;
        Bundle arguments = getArguments();
        if (arguments != null && (stringArray = arguments.getStringArray(f61346x)) != null && (kz = ArraysKt___ArraysKt.m39955kz(stringArray)) != null) {
            return kz;
        }
        throw new Throwable("loyaltyCards not found");
    }

    /* renamed from: S0 */
    public final void mo72204S0() {
        ((C36855v6) getBinding()).f91811b.setAdapter(new C24739b(mo72203R0(), new OrderLoyaltyCardsBottomSheetDialogFragment$initView$1(this)));
        ((C36855v6) getBinding()).f91811b.mo59589n(new C37094b(1, getResources().getDimensionPixelSize(R.dimen.ds_spacing_s), false));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72204S0();
    }
}
