package com.carrefour.fid.android.shared.extension;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11760r;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class TextViewKt$textEventChanges$1$listener$1 extends AdaptedFunctionReference implements C11300l<CharSequence, C11079d2> {
    public TextViewKt$textEventChanges$1$listener$1(Object obj) {
        super(1, obj, C11760r.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8);
    }

    /* renamed from: b */
    public final void mo83718b(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "p0");
        ((C11760r) this.receiver).mo23751L(charSequence);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo83718b((CharSequence) obj);
        return C11079d2.f28267a;
    }
}
