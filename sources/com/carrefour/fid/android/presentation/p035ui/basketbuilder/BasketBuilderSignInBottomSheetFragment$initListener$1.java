package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderSignInBottomSheetFragment$initListener$1 */
public final class BasketBuilderSignInBottomSheetFragment$initListener$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ BasketBuilderSignInBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketBuilderSignInBottomSheetFragment$initListener$1(BasketBuilderSignInBottomSheetFragment basketBuilderSignInBottomSheetFragment) {
        super(0);
        this.this$0 = basketBuilderSignInBottomSheetFragment;
    }

    public final void invoke() {
        this.this$0.mo68023R0().mo75395a();
        C19232h activity = this.this$0.getActivity();
        if (activity != null) {
            C13825a.m58795x(activity, false, R.anim.slide_in_up, R.anim.no_change, 994, (Bundle) null, 16, (Object) null);
        }
    }
}
