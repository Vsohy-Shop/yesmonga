package com.carrefour.fid.android.presentation.p035ui.scan;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36732j3;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/scan/ScanOnBoardingFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/j3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.scan.ScanOnBoardingFragment */
public final class ScanOnBoardingFragment extends C25717g<C36732j3> {

    /* renamed from: f */
    public static final int f63002f = 0;

    public ScanOnBoardingFragment() {
        super(C257061.f63003a, C257072.f63004a, true);
    }

    /* renamed from: S0 */
    public static final void m110389S0(ScanOnBoardingFragment scanOnBoardingFragment, View view) {
        Intrinsics.checkNotNullParameter(scanOnBoardingFragment, "this$0");
        scanOnBoardingFragment.dismissAllowingStateLoss();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C36732j3) getBinding()).f91064c.setOnClickListener(new C25719i(this));
    }
}
