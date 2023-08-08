package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.C37947a;
import com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11944n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2", mo22502f = "DriveMapViewModel.kt", mo22503i = {}, mo22504l = {186}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DriveMapViewModel$goToBillingAddress$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ C11300l<C11045c<? super C11079d2>, Object> $onAddressValidated;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DriveMapViewModel this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1", mo22502f = "DriveMapViewModel.kt", mo22503i = {}, mo22504l = {180}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1 */
    public static final class C284371 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C284371 r0 = new C284371(driveMapViewModel, lVar, cVar);
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
                C11944n<C37947a> a = driveMapViewModel.tunnelInputProvider.mo31415a();
                final C11300l<C11045c<? super C11079d2>, Object> lVar = lVar;
                C284381 r3 = new C11908f<C37947a>() {
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                    @org.jetbrains.annotations.C12580l
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.C37947a r4, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
                        /*
                            r3 = this;
                            boolean r4 = r5 instanceof com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1$1$emit$1
                            if (r4 == 0) goto L_0x0013
                            r4 = r5
                            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1$1$emit$1 r4 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1$1$emit$1) r4
                            int r0 = r4.label
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r2 = r0 & r1
                            if (r2 == 0) goto L_0x0013
                            int r0 = r0 - r1
                            r4.label = r0
                            goto L_0x0018
                        L_0x0013:
                            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1$1$emit$1 r4 = new com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1$1$emit$1
                            r4.<init>(r3, r5)
                        L_0x0018:
                            java.lang.Object r5 = r4.result
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                            int r1 = r4.label
                            r2 = 1
                            if (r1 == 0) goto L_0x0035
                            if (r1 != r2) goto L_0x002d
                            java.lang.Object r4 = r4.L$0
                            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2$1$1 r4 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2.C284371.C284381) r4
                            kotlin.C11661u0.m45747n(r5)
                            goto L_0x0046
                        L_0x002d:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L_0x0035:
                            kotlin.C11661u0.m45747n(r5)
                            kotlin.jvm.functions.l<kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r5 = r4
                            r4.L$0 = r3
                            r4.label = r2
                            java.lang.Object r4 = r5.invoke(r4)
                            if (r4 != r0) goto L_0x0045
                            return r0
                        L_0x0045:
                            r4 = r3
                        L_0x0046:
                            kotlinx.coroutines.o0 r4 = r6
                            r5 = 0
                            kotlinx.coroutines.C12079p0.m48265f(r4, r5, r2, r5)
                            kotlin.d2 r4 = kotlin.C11079d2.f28267a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$goToBillingAddress$2.C284371.C284381.emit(com.carrefour.fid.android.domain.models.account.a, kotlin.coroutines.c):java.lang.Object");
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
            return ((C284371) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapViewModel$goToBillingAddress$2(DriveMapViewModel driveMapViewModel, Address address, Address address2, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11045c<? super DriveMapViewModel$goToBillingAddress$2> cVar) {
        super(2, cVar);
        this.this$0 = driveMapViewModel;
        this.$billingAddress = address;
        this.$deliveryAddress = address2;
        this.$onAddressValidated = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DriveMapViewModel$goToBillingAddress$2 driveMapViewModel$goToBillingAddress$2 = new DriveMapViewModel$goToBillingAddress$2(this.this$0, this.$billingAddress, this.$deliveryAddress, this.$onAddressValidated, cVar);
        driveMapViewModel$goToBillingAddress$2.L$0 = obj;
        return driveMapViewModel$goToBillingAddress$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final DriveMapViewModel driveMapViewModel = this.this$0;
            final C11300l<C11045c<? super C11079d2>, Object> lVar = this.$onAddressValidated;
            C11723c2 unused = C12038j.m48061f((C12074o0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C284371((C11045c<? super C284371>) null), 3, (Object) null);
            C11744g access$get_eventChannel$p = this.this$0._eventChannel;
            DriveMapViewModel.C28436Event.NavigateToBillingAddress navigateToBillingAddress = new DriveMapViewModel.C28436Event.NavigateToBillingAddress(this.$billingAddress, this.$deliveryAddress);
            this.label = 1;
            if (access$get_eventChannel$p.mo23757h0(navigateToBillingAddress, this) == h) {
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
        return ((DriveMapViewModel$goToBillingAddress$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
