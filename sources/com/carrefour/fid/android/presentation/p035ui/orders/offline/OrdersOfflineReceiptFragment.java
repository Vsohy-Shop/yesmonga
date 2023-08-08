package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36851v2;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.carrefour.fid.android.shared.base.C28494o;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineReceiptFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/v2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/m;", "a", "Landroidx/navigation/m;", "Q0", "()Lcom/carrefour/fid/android/presentation/ui/orders/offline/m;", "arguments", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineReceiptFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineReceiptFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineReceiptFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,43:1\n42#2,3:44\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineReceiptFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/OrdersOfflineReceiptFragment\n*L\n17#1:44,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineReceiptFragment */
public final class OrdersOfflineReceiptFragment extends C28494o<C36851v2> {

    /* renamed from: b */
    public static final int f61384b = 8;
    @C12579k

    /* renamed from: a */
    public final C19766m f61385a = new C19766m(C11342l0.m43547d(C24780m.class), new OrdersOfflineReceiptFragment$special$$inlined$navArgs$1(this));

    public OrdersOfflineReceiptFragment() {
        super(C247361.f61386a);
    }

    /* renamed from: Q0 */
    public final C24780m mo72256Q0() {
        return (C24780m) this.f61385a.getValue();
    }

    public void onDestroyView() {
        ((C36851v2) getBinding()).f91795b.mo67297W1();
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        String str;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            String string = bottomNavActivity.getString(R.string.order_details_subtitle, new Object[]{StringKt.m118939s(mo72256Q0().mo72330h().mo72369i())});
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …flineDate()\n            )");
            if (mo72256Q0().mo72332i() instanceof DownloadReceipt.BillReceipt) {
                str = bottomNavActivity.getString(R.string.order_details_bill_receipt_title);
            } else {
                str = bottomNavActivity.getString(R.string.order_details_bank_receipt_title);
            }
            String str2 = str;
            Intrinsics.checkNotNullExpressionValue(str2, "if (arguments.receipt is…eipt_title)\n            }");
            ToolBarDefaultView.m158942o0(bottomNavActivity.mo121107M1(), str2, string, 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
        ((C36851v2) getBinding()).f91795b.mo67298X1(mo72256Q0().mo72329g());
    }
}
