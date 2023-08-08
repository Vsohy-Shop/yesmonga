package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$3$1 */
public final class CouponsListStatefulKt$CouponsListStateful$3$1 extends Lambda implements C11304p<Boolean, Pair<? extends String, ? extends String>, C11079d2> {
    final /* synthetic */ C11304p<Boolean, Pair<String, String>, C11079d2> $displaySnackbar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsListStateful$3$1(C11304p<? super Boolean, ? super Pair<String, String>, C11079d2> pVar) {
        super(2);
        this.$displaySnackbar = pVar;
    }

    /* renamed from: a */
    public final void mo69776a(boolean z, @C12579k Pair<String, String> pair) {
        Intrinsics.checkNotNullParameter(pair, "data");
        this.$displaySnackbar.invoke(Boolean.valueOf(z), pair);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo69776a(((Boolean) obj).booleanValue(), (Pair) obj2);
        return C11079d2.f28267a;
    }
}
