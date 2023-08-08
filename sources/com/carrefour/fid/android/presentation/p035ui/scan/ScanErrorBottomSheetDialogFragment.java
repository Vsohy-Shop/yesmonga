package com.carrefour.fid.android.presentation.p035ui.scan;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36742k3;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import com.carrefour.fid.android.presentation.p035ui.scan.C25711c;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/scan/ScanErrorBottomSheetDialogFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/k3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.scan.ScanErrorBottomSheetDialogFragment */
public final class ScanErrorBottomSheetDialogFragment extends C37185a<C36742k3> {

    /* renamed from: a */
    public static final int f62999a = 0;

    public ScanErrorBottomSheetDialogFragment() {
        super(C257041.f63000a, C257052.f63001a, true);
    }

    /* renamed from: S0 */
    public static final void m110385S0(ScanErrorBottomSheetDialogFragment scanErrorBottomSheetDialogFragment, View view) {
        Intrinsics.checkNotNullParameter(scanErrorBottomSheetDialogFragment, "this$0");
        FragmentKt.m118823k(scanErrorBottomSheetDialogFragment, C25711c.C25713b.m110410b(C25711c.f63010a, (Bundle) null, false, 3, (Object) null));
        scanErrorBottomSheetDialogFragment.dismiss();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C36742k3) getBinding()).f91136b.setOnClickListener(new C25718h(this));
    }
}
