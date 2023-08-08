package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryErrorMessageFormatter;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummaryAction;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$1", mo22502f = "DeliverySummaryStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$1 */
public final class DeliverySummaryStatefulKt$DeliverySummaryScreen$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<DeliverySummaryAction, C11079d2> $actioner;
    final /* synthetic */ DeliveryErrorMessageFormatter $errorMessageFormatter;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ C11907e<DeliverySummarySideEffect> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$1$1", mo22502f = "DeliverySummaryStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.DeliverySummaryStatefulKt$DeliverySummaryScreen$1$1 */
    public static final class C283891 extends SuspendLambda implements C11304p<DeliverySummarySideEffect, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C283891 r0 = new C283891(o0Var, lVar, deliveryErrorMessageFormatter, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invoke(@C12579k DeliverySummarySideEffect deliverySummarySideEffect, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C283891) create(deliverySummarySideEffect, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                final DeliverySummarySideEffect deliverySummarySideEffect = (DeliverySummarySideEffect) this.L$0;
                if (deliverySummarySideEffect instanceof DeliverySummarySideEffect.ValidationError) {
                    C12074o0 o0Var = o0Var;
                    final C11300l<DeliverySummaryAction, C11079d2> lVar = lVar;
                    final DeliveryErrorMessageFormatter deliveryErrorMessageFormatter = deliveryErrorMessageFormatter;
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C11304p<C12074o0, C11045c<? super C11079d2>, Object>((C11045c<? super C283901>) null) {
                        int label;

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            return 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public DeliverySummaryStatefulKt$DeliverySummaryScreen$1(C11907e<? extends DeliverySummarySideEffect> eVar, C12074o0 o0Var, C11300l<? super DeliverySummaryAction, C11079d2> lVar, DeliveryErrorMessageFormatter deliveryErrorMessageFormatter, C11045c<? super DeliverySummaryStatefulKt$DeliverySummaryScreen$1> cVar) {
                                super(2, cVar);
                                this.$sideEffect = eVar;
                                this.$scope = o0Var;
                                this.$actioner = lVar;
                                this.$errorMessageFormatter = deliveryErrorMessageFormatter;
                            }

                            @C12579k
                            public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                                DeliverySummaryStatefulKt$DeliverySummaryScreen$1 deliverySummaryStatefulKt$DeliverySummaryScreen$1 = new DeliverySummaryStatefulKt$DeliverySummaryScreen$1(this.$sideEffect, this.$scope, this.$actioner, this.$errorMessageFormatter, cVar);
                                deliverySummaryStatefulKt$DeliverySummaryScreen$1.L$0 = obj;
                                return deliverySummaryStatefulKt$DeliverySummaryScreen$1;
                            }

                            @C12580l
                            public final Object invokeSuspend(@C12579k Object obj) {
                                C11063b.m42612h();
                                if (this.label == 0) {
                                    C11661u0.m45747n(obj);
                                    C11907e<DeliverySummarySideEffect> eVar = this.$sideEffect;
                                    final C12074o0 o0Var = this.$scope;
                                    final C11300l<DeliverySummaryAction, C11079d2> lVar = this.$actioner;
                                    final DeliveryErrorMessageFormatter deliveryErrorMessageFormatter = this.$errorMessageFormatter;
                                    C11909g.m47412V0(C11909g.m47448f1(eVar, new C283891((C11045c<? super C283891>) null)), (C12074o0) this.L$0);
                                    return C11079d2.f28267a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            @C12580l
                            public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                                return ((DeliverySummaryStatefulKt$DeliverySummaryScreen$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                            }
                        }
