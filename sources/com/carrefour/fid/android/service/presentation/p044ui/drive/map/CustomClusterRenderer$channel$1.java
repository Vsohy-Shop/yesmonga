package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lkotlin/d2;", "it", "invoke", "(Lkotlin/d2;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.CustomClusterRenderer$channel$1 */
public final class CustomClusterRenderer$channel$1 extends Lambda implements C11300l<C11079d2, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onDrivesNotClusteredChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomClusterRenderer$channel$1(C11289a<C11079d2> aVar) {
        super(1);
        this.$onDrivesNotClusteredChanged = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11079d2) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C11079d2 d2Var) {
        Intrinsics.checkNotNullParameter(d2Var, "it");
        this.$onDrivesNotClusteredChanged.invoke();
    }
}
