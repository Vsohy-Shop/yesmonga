package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryStateful$2", mo22502f = "DeliverySummaryStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryStateful$2 */
public final class DeliverySummaryStatefulKt$DeliverySummaryStateful$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ DeliverySummaryAnalyticsReporter $analytics;
    final /* synthetic */ DeliveryType $deliveryType;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryStatefulKt$DeliverySummaryStateful$2(DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter, DeliveryType deliveryType, C11045c<? super DeliverySummaryStatefulKt$DeliverySummaryStateful$2> cVar) {
        super(2, cVar);
        this.$analytics = deliverySummaryAnalyticsReporter;
        this.$deliveryType = deliveryType;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DeliverySummaryStatefulKt$DeliverySummaryStateful$2(this.$analytics, this.$deliveryType, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.$analytics.tagScreenView(this.$deliveryType);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DeliverySummaryStatefulKt$DeliverySummaryStateful$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
