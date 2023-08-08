package com.carrefour.fid.android.design.components.compose;

import com.carrefour.fid.android.design.components.compose.C36965b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInput$1$1$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C36965b, C11079d2> $actioner;
    final /* synthetic */ boolean $passwordVisibilityState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInput$1$1$2$1(C11300l<? super C36965b, C11079d2> lVar, boolean z) {
        super(0);
        this.$actioner = lVar;
        this.$passwordVisibilityState = z;
    }

    public final void invoke() {
        this.$actioner.invoke(new C36965b.C36969d(!this.$passwordVisibilityState));
    }
}
