package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.p004ui.text.C16156d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ValidatePaymentComponentKt$ValidatePaymentComponent$1$1$1$1 */
public final class ValidatePaymentComponentKt$ValidatePaymentComponent$1$1$1$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C16156d $annotatedString;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidatePaymentComponentKt$ValidatePaymentComponent$1$1$1$1(C16156d dVar, C11289a<C11079d2> aVar) {
        super(1);
        this.$annotatedString = dVar;
        this.$onCgvClicked = aVar;
    }

    /* renamed from: a */
    public final void mo68848a(int i) {
        if (((C16156d.C16159b) CollectionsKt___CollectionsKt.m40479B2(this.$annotatedString.mo46682i("CGV", i, i))) != null) {
            this.$onCgvClicked.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68848a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
