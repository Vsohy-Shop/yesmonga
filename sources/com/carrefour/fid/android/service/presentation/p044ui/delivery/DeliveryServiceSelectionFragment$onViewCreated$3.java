package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment$onViewCreated$3", mo22502f = "DeliveryServiceSelectionFragment.kt", mo22503i = {}, mo22504l = {84}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment$onViewCreated$3 */
public final class DeliveryServiceSelectionFragment$onViewCreated$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ DeliveryServiceSelectionFragment this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment$onViewCreated$3$1", mo22502f = "DeliveryServiceSelectionFragment.kt", mo22503i = {}, mo22504l = {85}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragment$onViewCreated$3$1 */
    public static final class C283721 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C283721(deliveryServiceSelectionFragment, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<DeliveryServiceSelectionSideEffect> sideEffect = deliveryServiceSelectionFragment.getViewModel().getSideEffect();
                final DeliveryServiceSelectionFragment deliveryServiceSelectionFragment = deliveryServiceSelectionFragment;
                C283731 r3 = new Object() {
                    @C12580l
                    public final Object emit(@C12579k DeliveryServiceSelectionSideEffect deliveryServiceSelectionSideEffect, @C12579k C11045c<? super C11079d2> cVar) {
                        Object access$invokeSuspend$processSideEffects = DeliveryServiceSelectionFragment.this.processSideEffects(deliveryServiceSelectionSideEffect);
                        return access$invokeSuspend$processSideEffects == C11063b.m42612h() ? access$invokeSuspend$processSideEffects : C11079d2.f28267a;
                    }

                    public final boolean equals(@C12580l Object obj) {
                        if (!(obj instanceof C11908f) || !(obj instanceof C11379z)) {
                            return false;
                        }
                        return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
                    }

                    @C12579k
                    public final C11660u<?> getFunctionDelegate() {
                        return new AdaptedFunctionReference(2, DeliveryServiceSelectionFragment.this, DeliveryServiceSelectionFragment.class, "processSideEffects", "processSideEffects(Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                };
                this.label = 1;
                if (sideEffect.collect(r3, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C283721) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryServiceSelectionFragment$onViewCreated$3(DeliveryServiceSelectionFragment deliveryServiceSelectionFragment, C11045c<? super DeliveryServiceSelectionFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.this$0 = deliveryServiceSelectionFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DeliveryServiceSelectionFragment$onViewCreated$3(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.this$0.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final DeliveryServiceSelectionFragment deliveryServiceSelectionFragment = this.this$0;
            C283721 r3 = new C283721((C11045c<? super C283721>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m90581a(lifecycle, state, r3, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DeliveryServiceSelectionFragment$onViewCreated$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
