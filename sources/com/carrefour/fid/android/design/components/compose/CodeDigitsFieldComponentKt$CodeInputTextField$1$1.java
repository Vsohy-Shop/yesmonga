package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.focus.C15087z;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInputTextField$1$1 extends Lambda implements C11300l<C15087z, C11079d2> {
    final /* synthetic */ C11300l<Boolean, C11079d2> $onFocusChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputTextField$1$1(C11300l<? super Boolean, C11079d2> lVar) {
        super(1);
        this.$onFocusChange = lVar;
    }

    /* renamed from: a */
    public final void mo111998a(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "it");
        this.$onFocusChange.invoke(Boolean.valueOf(zVar.mo42156g()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo111998a((C15087z) obj);
        return C11079d2.f28267a;
    }
}
