package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import androidx.navigation.NavOptionsBuilder;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/d2;", "invoke", "(Landroidx/navigation/NavOptionsBuilder;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$navigateToNextDestination$1 */
public final class SecretCodeFragment$navigateToNextDestination$1 extends Lambda implements C11300l<NavOptionsBuilder, C11079d2> {

    /* renamed from: f */
    public static final SecretCodeFragment$navigateToNextDestination$1 f61123f = new SecretCodeFragment$navigateToNextDestination$1();

    public SecretCodeFragment$navigateToNextDestination$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "$this$navOptions");
        navOptionsBuilder.mo58302i(R.id.loyalty_graph, C245781.f61124f);
    }
}
