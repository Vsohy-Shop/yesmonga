package com.carrefour.fid.android.design.components.compose;

import com.carrefour.fid.android.design.components.compose.BackHandlerComponentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BackHandlerComponentKt$BackHandler$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ BackHandlerComponentKt.C36916a $onBackPressedCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerComponentKt$BackHandler$1$1(BackHandlerComponentKt.C36916a aVar, boolean z) {
        super(0);
        this.$onBackPressedCallback = aVar;
        this.$enabled = z;
    }

    public final void invoke() {
        this.$onBackPressedCallback.mo970j(this.$enabled);
    }
}
