package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreContactComponentKt$PhysicalStoreContactComponent$3$1$5$1 */
public final class C25357x63fd796d extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<String, C11079d2> $onPhoneClicked;
    final /* synthetic */ String $phoneNumber;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25357x63fd796d(C11300l<? super String, C11079d2> lVar, String str) {
        super(0);
        this.$onPhoneClicked = lVar;
        this.$phoneNumber = str;
    }

    public final void invoke() {
        this.$onPhoneClicked.invoke(this.$phoneNumber);
    }
}
