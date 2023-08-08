package com.carrefour.fid.android.product.presentation.p039ui.list;

import androidx.fragment.app.Fragment;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$criteoTrackingCallbacks$1$handleButterFlyClick$1$3$1 */
public final class PlpDelegate$criteoTrackingCallbacks$1$handleButterFlyClick$1$3$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$criteoTrackingCallbacks$1$handleButterFlyClick$1$3$1(PlpDelegate plpDelegate) {
        super(1);
        this.this$0 = plpDelegate;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "it");
        Fragment d = this.this$0.f67863a;
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = this.this$0.f67863a.getString(C27609f.C27627r.fec_basket_module_basket_undefined_error);
        Intrinsics.checkNotNullExpressionValue(string, "fragment.getString(R.str…e_basket_undefined_error)");
        FragmentKt.m118811B(d, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }
}
