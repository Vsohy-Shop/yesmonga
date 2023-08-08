package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterStatefulKt$CheckoutStep1FooterScreenForXML$3$2 */
public final class C23267x8566151c extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ BottomSheetBehavior<ViewGroup> $bottomSheetBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23267x8566151c(BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
        super(0);
        this.$bottomSheetBehavior = bottomSheetBehavior;
    }

    public final void invoke() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.$bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            int i = 3;
            if (bottomSheetBehavior.mo88454u0() == 3) {
                i = 4;
            }
            bottomSheetBehavior.mo88418W0(i);
        }
    }
}
