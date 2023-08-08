package com.carrefour.fid.android.design.components.compose;

import com.carrefour.fid.android.design.components.compose.C36965b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CodeDigitsFieldComponentKt$CodeInput$1$1$1$1$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C11300l<C36965b, C11079d2> $actioner;

    /* renamed from: $i */
    final /* synthetic */ int f92113$i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInput$1$1$1$1$1(C11300l<? super C36965b, C11079d2> lVar, int i) {
        super(1);
        this.$actioner = lVar;
        this.f92113$i = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        this.$actioner.invoke(new C36965b.C36966a(this.f92113$i, str));
    }
}
