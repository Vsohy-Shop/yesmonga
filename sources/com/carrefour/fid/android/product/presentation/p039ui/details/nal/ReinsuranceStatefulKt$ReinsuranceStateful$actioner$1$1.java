package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27900p;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceStatefulKt$ReinsuranceStateful$actioner$1$1 */
public final class ReinsuranceStatefulKt$ReinsuranceStateful$actioner$1$1 extends Lambda implements C11300l<C27900p, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReinsuranceStatefulKt$ReinsuranceStateful$actioner$1$1(C11289a<C11079d2> aVar) {
        super(1);
        this.$onBackPressed = aVar;
    }

    /* renamed from: a */
    public final void mo80914a(@C12579k C27900p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "it");
        if (Intrinsics.areEqual((Object) pVar, (Object) C27900p.C27901a.f67557a)) {
            this.$onBackPressed.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80914a((C27900p) obj);
        return C11079d2.f28267a;
    }
}
