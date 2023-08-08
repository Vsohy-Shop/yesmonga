package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$1$5$1$1 */
public final class C23599x8a793822 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23599x8a793822(C11300l<? super C23617b, C11079d2> lVar) {
        super(1);
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        this.$actioner.invoke(new C23617b.C23623b.C23626c(str));
    }
}
