package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.lazy.LazyListScope;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$LoadingScreen$1 */
public final class DeliverySummaryStatefulKt$LoadingScreen$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    public static final DeliverySummaryStatefulKt$LoadingScreen$1 INSTANCE = new DeliverySummaryStatefulKt$LoadingScreen$1();

    public DeliverySummaryStatefulKt$LoadingScreen$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        ComposableSingletons$DeliverySummaryStatefulKt composableSingletons$DeliverySummaryStatefulKt = ComposableSingletons$DeliverySummaryStatefulKt.INSTANCE;
        LazyListScope lazyListScope2 = lazyListScope;
        LazyListScope.m10824g(lazyListScope2, "address", (Object) null, composableSingletons$DeliverySummaryStatefulKt.m172889getLambda2$service_release(), 2, (Object) null);
        LazyListScope.m10824g(lazyListScope, "description", (Object) null, composableSingletons$DeliverySummaryStatefulKt.m172890getLambda3$service_release(), 2, (Object) null);
        LazyListScope.m10824g(lazyListScope2, "delivery_fee", (Object) null, composableSingletons$DeliverySummaryStatefulKt.m172891getLambda4$service_release(), 2, (Object) null);
    }
}
