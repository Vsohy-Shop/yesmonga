package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.compose.C19714d;
import com.carrefour.fid.android.databinding.C36681e2;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/ExpiredAdditionalOrderBottomSheetFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/e2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "R0", "<init>", "()V", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.ExpiredAdditionalOrderBottomSheetFragment */
public final class ExpiredAdditionalOrderBottomSheetFragment extends C37185a<C36681e2> {
    @C12579k

    /* renamed from: a */
    public static final C24976a f61781a = new C24976a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61782b = 0;
    @C12579k

    /* renamed from: c */
    public static final String f61783c = "isExpiredAdditionalOrderProcess";

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.ExpiredAdditionalOrderBottomSheetFragment$a */
    public static final class C24976a {
        public /* synthetic */ C24976a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24976a() {
        }
    }

    public ExpiredAdditionalOrderBottomSheetFragment() {
        super(C249741.f61784a, C249752.f61785a, true);
    }

    /* renamed from: R0 */
    public final void mo72769R0() {
        ((C36681e2) getBinding()).f90758b.setOnPrimaryButtonClickListener(new C24977x745fb2c6(this));
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        requireActivity().mo57175g0().mo56857a(AdditionalOrderFragment.f61744Y, new Bundle());
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72769R0();
    }
}
