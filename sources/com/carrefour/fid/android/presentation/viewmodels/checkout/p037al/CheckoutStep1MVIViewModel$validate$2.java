package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$validate$2", mo22502f = "CheckoutStep1MVIViewModel.kt", mo22503i = {}, mo22504l = {829, 832, 833, 834}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$validate$2 */
public final class CheckoutStep1MVIViewModel$validate$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11079d2> $onCheckDone;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CheckoutStep1MVIViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1MVIViewModel$validate$2(CheckoutStep1MVIViewModel checkoutStep1MVIViewModel, C11289a<C11079d2> aVar, C11045c<? super CheckoutStep1MVIViewModel$validate$2> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep1MVIViewModel;
        this.$onCheckDone = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CheckoutStep1MVIViewModel$validate$2 checkoutStep1MVIViewModel$validate$2 = new CheckoutStep1MVIViewModel$validate$2(this.this$0, this.$onCheckDone, cVar);
        checkoutStep1MVIViewModel$validate$2.L$0 = obj;
        return checkoutStep1MVIViewModel$validate$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r8) goto L_0x006c
            if (r2 == r5) goto L_0x0056
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            int r1 = r0.I$2
            int r2 = r0.I$1
            int r3 = r0.I$0
            java.lang.Object r4 = r0.L$2
            com.carrefour.fid.android.domain.models.account.Address r4 = (com.carrefour.fid.android.domain.models.account.Address) r4
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.l r5 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r5
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r9 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel) r9
            kotlin.C11661u0.m45747n(r18)
            r15 = r4
            r11 = r5
            r4 = r9
            r9 = r3
            r3 = r18
            goto L_0x0108
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            int r2 = r0.I$2
            int r4 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.l r9 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel) r10
            kotlin.C11661u0.m45747n(r18)
            r11 = r10
            r10 = r9
            r9 = r5
            r5 = r4
            r4 = r18
            goto L_0x00e2
        L_0x0056:
            int r2 = r0.I$1
            int r5 = r0.I$0
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.l r9 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r10 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel) r10
            kotlin.C11661u0.m45747n(r18)
            r11 = r10
            r10 = r9
            r9 = r5
            r5 = r2
            r2 = r18
            goto L_0x00be
        L_0x006c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel) r2
            kotlin.C11661u0.m45747n(r18)
            r9 = r18
            goto L_0x009b
        L_0x0076:
            kotlin.C11661u0.m45747n(r18)
            java.lang.Object r2 = r0.L$0
            r9 = r2
            kotlinx.coroutines.o0 r9 = (kotlinx.coroutines.C12074o0) r9
            r10 = 0
            r11 = 0
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$validate$2$1 r12 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$validate$2$1
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r2 = r0.this$0
            kotlin.jvm.functions.a<kotlin.d2> r13 = r0.$onCheckDone
            r12.<init>(r2, r13, r7)
            r13 = 3
            r14 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r2 = r0.this$0
            r0.L$0 = r2
            r0.label = r8
            java.lang.Object r9 = r2.mo75452q1(r0)
            if (r9 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r10 = r2
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x00a6
            com.carrefour.fid.android.domain.models.service.models.l r2 = r9.mo119352e()
            r9 = r2
            goto L_0x00a7
        L_0x00a6:
            r9 = r7
        L_0x00a7:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r2 = r0.this$0
            r0.L$0 = r10
            r0.L$1 = r9
            r0.I$0 = r6
            r0.I$1 = r8
            r0.label = r5
            java.lang.Object r2 = r2.mo75444i1(r0)
            if (r2 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            r5 = r8
            r11 = r10
            r10 = r9
            r9 = r6
        L_0x00be:
            com.carrefour.fid.android.domain.models.account.AccountInfo r2 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r2
            if (r2 == 0) goto L_0x00c7
            com.carrefour.fid.android.domain.models.account.Phone r2 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57649h(r2)
            goto L_0x00c8
        L_0x00c7:
            r2 = r7
        L_0x00c8:
            if (r2 != 0) goto L_0x00cc
            r2 = r8
            goto L_0x00cd
        L_0x00cc:
            r2 = r6
        L_0x00cd:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r12 = r0.this$0
            r0.L$0 = r11
            r0.L$1 = r10
            r0.I$0 = r9
            r0.I$1 = r5
            r0.I$2 = r2
            r0.label = r4
            java.lang.Object r4 = r12.mo75444i1(r0)
            if (r4 != r1) goto L_0x00e2
            return r1
        L_0x00e2:
            com.carrefour.fid.android.domain.models.account.AccountInfo r4 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r4
            if (r4 == 0) goto L_0x00eb
            com.carrefour.fid.android.domain.models.account.Address r4 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57643b(r4)
            goto L_0x00ec
        L_0x00eb:
            r4 = r7
        L_0x00ec:
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel r12 = r0.this$0
            r0.L$0 = r11
            r0.L$1 = r10
            r0.L$2 = r4
            r0.I$0 = r9
            r0.I$1 = r5
            r0.I$2 = r2
            r0.label = r3
            java.lang.Object r3 = r12.mo75444i1(r0)
            if (r3 != r1) goto L_0x0103
            return r1
        L_0x0103:
            r1 = r2
            r15 = r4
            r2 = r5
            r4 = r11
            r11 = r10
        L_0x0108:
            com.carrefour.fid.android.domain.models.account.AccountInfo r3 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r3
            if (r3 == 0) goto L_0x0110
            com.carrefour.fid.android.domain.models.account.Phone r7 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57649h(r3)
        L_0x0110:
            r16 = r7
            com.carrefour.fid.android.core.io.BasketValidationForAddressThrowable r3 = new com.carrefour.fid.android.core.io.BasketValidationForAddressThrowable
            if (r9 == 0) goto L_0x0118
            r12 = r8
            goto L_0x0119
        L_0x0118:
            r12 = r6
        L_0x0119:
            if (r2 == 0) goto L_0x011d
            r13 = r8
            goto L_0x011e
        L_0x011d:
            r13 = r6
        L_0x011e:
            if (r1 == 0) goto L_0x0122
            r14 = r8
            goto L_0x0123
        L_0x0122:
            r14 = r6
        L_0x0123:
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$c r1 = new com.carrefour.fid.android.presentation.viewmodels.checkout.al.mvi.a$c$c
            r1.<init>(r3)
            r4.emitEvent(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel$validate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep1MVIViewModel$validate$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
