package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodValidationErrorDialogFormatter$formatError$3 */
public final class NonFoodValidationErrorDialogFormatter$formatError$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ C11289a<C11079d2> $closeDialog;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodValidationErrorDialogFormatter$formatError$3(C11289a<C11079d2> aVar, C11300l<? super C23520c, C11079d2> lVar) {
        super(0);
        this.$closeDialog = aVar;
        this.$actioner = lVar;
    }

    public final void invoke() {
        this.$closeDialog.invoke();
        this.$actioner.invoke(new C23520c.C23528c(false));
    }
}
