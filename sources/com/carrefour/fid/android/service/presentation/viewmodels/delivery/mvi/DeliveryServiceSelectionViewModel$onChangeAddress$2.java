package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.C37947a;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionSideEffect;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2", mo22502f = "DeliveryServiceSelectionViewModel.kt", mo22503i = {}, mo22504l = {103}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DeliveryServiceSelectionViewModel$onChangeAddress$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ DeliveryType $deliveryType;
    final /* synthetic */ C11289a<C11079d2> $onAddressValidated;
    final /* synthetic */ String $phone;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeliveryServiceSelectionViewModel this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1", mo22502f = "DeliveryServiceSelectionViewModel.kt", mo22503i = {}, mo22504l = {85}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1 */
    public static final class C284321 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C284321 r0 = new C284321(deliveryServiceSelectionViewModel, deliveryType, aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final C12074o0 o0Var = (C12074o0) this.L$0;
                C11944n<C37947a> a = deliveryServiceSelectionViewModel.userAddressProvider.mo31415a();
                final DeliveryServiceSelectionViewModel deliveryServiceSelectionViewModel = deliveryServiceSelectionViewModel;
                final DeliveryType deliveryType = deliveryType;
                final C11289a<C11079d2> aVar = aVar;
                C284331 r3 = new C11908f<C37947a>() {
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
                    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
                    @org.jetbrains.annotations.C12580l
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.C37947a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
                        /*
                            r7 = this;
                            boolean r0 = r9 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1$emit$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r9
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1$emit$1 r0 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1$emit$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1$emit$1 r0 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1$emit$1
                            r0.<init>(r7, r9)
                        L_0x0018:
                            java.lang.Object r9 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r2 = r0.label
                            r3 = 3
                            r4 = 2
                            r5 = 0
                            r6 = 1
                            if (r2 == 0) goto L_0x0045
                            if (r2 == r6) goto L_0x003d
                            if (r2 == r4) goto L_0x0035
                            if (r2 != r3) goto L_0x002d
                            goto L_0x0035
                        L_0x002d:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L_0x0035:
                            java.lang.Object r8 = r0.L$0
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1 r8 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2.C284321.C284331) r8
                            kotlin.C11661u0.m45747n(r9)
                            goto L_0x0097
                        L_0x003d:
                            java.lang.Object r8 = r0.L$0
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2$1$1 r8 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2.C284321.C284331) r8
                            kotlin.C11661u0.m45747n(r9)
                            goto L_0x0069
                        L_0x0045:
                            kotlin.C11661u0.m45747n(r9)
                            com.carrefour.fid.android.domain.models.account.Address r9 = r8.mo116774e()
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r2 = r4
                            r2.addressTunnelData = r8
                            com.carrefour.fid.android.domain.models.AddressCategory r8 = r9.mo116683H()
                            com.carrefour.fid.android.domain.models.AddressCategory r2 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
                            if (r8 != r2) goto L_0x006c
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r8 = r4
                            com.carrefour.fid.android.service.presentation.model.DeliveryType r2 = r5
                            r0.L$0 = r7
                            r0.label = r6
                            java.lang.Object r9 = r8.getStoreFacilityAtAddress(r9, r2, r0)
                            if (r9 != r1) goto L_0x0068
                            return r1
                        L_0x0068:
                            r8 = r7
                        L_0x0069:
                            com.carrefour.fid.android.domain.models.service.models.m r9 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r9
                            goto L_0x006e
                        L_0x006c:
                            r8 = r7
                            r9 = r5
                        L_0x006e:
                            kotlin.jvm.functions.a<kotlin.d2> r2 = r6
                            r2.invoke()
                            if (r9 == 0) goto L_0x0084
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r2 = r4
                            com.carrefour.fid.android.service.presentation.model.DeliveryType r3 = r5
                            r0.L$0 = r8
                            r0.label = r4
                            java.lang.Object r9 = r2.handleServices(r9, r3, r0)
                            if (r9 != r1) goto L_0x0097
                            return r1
                        L_0x0084:
                            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r9 = r4
                            kotlinx.coroutines.channels.g r9 = r9._sideEffect
                            com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NetworkError r2 = com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionSideEffect.NetworkError.INSTANCE
                            r0.L$0 = r8
                            r0.label = r3
                            java.lang.Object r9 = r9.mo23757h0(r2, r0)
                            if (r9 != r1) goto L_0x0097
                            return r1
                        L_0x0097:
                            kotlinx.coroutines.o0 r8 = r8
                            kotlinx.coroutines.C12079p0.m48265f(r8, r5, r6, r5)
                            kotlin.d2 r8 = kotlin.C11079d2.f28267a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$onChangeAddress$2.C284321.C284331.emit(com.carrefour.fid.android.domain.models.account.a, kotlin.coroutines.c):java.lang.Object");
                    }
                };
                this.label = 1;
                if (a.collect(r3, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C11661u0.m45747n(obj);
            }
            throw new KotlinNothingValueException();
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C284321) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryServiceSelectionViewModel$onChangeAddress$2(DeliveryServiceSelectionViewModel deliveryServiceSelectionViewModel, Address address, Address address2, String str, DeliveryType deliveryType, C11289a<C11079d2> aVar, C11045c<? super DeliveryServiceSelectionViewModel$onChangeAddress$2> cVar) {
        super(2, cVar);
        this.this$0 = deliveryServiceSelectionViewModel;
        this.$billingAddress = address;
        this.$deliveryAddress = address2;
        this.$phone = str;
        this.$deliveryType = deliveryType;
        this.$onAddressValidated = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DeliveryServiceSelectionViewModel$onChangeAddress$2 deliveryServiceSelectionViewModel$onChangeAddress$2 = new DeliveryServiceSelectionViewModel$onChangeAddress$2(this.this$0, this.$billingAddress, this.$deliveryAddress, this.$phone, this.$deliveryType, this.$onAddressValidated, cVar);
        deliveryServiceSelectionViewModel$onChangeAddress$2.L$0 = obj;
        return deliveryServiceSelectionViewModel$onChangeAddress$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final DeliveryServiceSelectionViewModel deliveryServiceSelectionViewModel = this.this$0;
            final DeliveryType deliveryType = this.$deliveryType;
            final C11289a<C11079d2> aVar = this.$onAddressValidated;
            C11723c2 unused = C12038j.m48061f((C12074o0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C284321((C11045c<? super C284321>) null), 3, (Object) null);
            C11744g access$get_sideEffect$p = this.this$0._sideEffect;
            DeliveryServiceSelectionSideEffect.NavigateToAddressInput navigateToAddressInput = new DeliveryServiceSelectionSideEffect.NavigateToAddressInput(this.$billingAddress, this.$deliveryAddress, this.$phone);
            this.label = 1;
            if (access$get_sideEffect$p.mo23757h0(navigateToAddressInput, this) == h) {
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
        return ((DeliveryServiceSelectionViewModel$onChangeAddress$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
