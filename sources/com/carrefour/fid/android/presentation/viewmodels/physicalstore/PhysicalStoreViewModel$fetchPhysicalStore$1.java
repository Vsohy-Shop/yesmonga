package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchPhysicalStore$1", mo22502f = "PhysicalStoreViewModel.kt", mo22503i = {1, 2}, mo22504l = {100, 112, 118}, mo22505m = "invokeSuspend", mo22506n = {"store", "storeWithServiceDetails"}, mo22507s = {"L$1", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPhysicalStoreViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel$fetchPhysicalStore$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,334:1\n230#2,5:335\n230#2,5:340\n230#2,5:345\n230#2,5:350\n230#2,5:355\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel$fetchPhysicalStore$1\n*L\n95#1:335,5\n106#1:340,5\n119#1:345,5\n132#1:350,5\n145#1:355,5\n*E\n"})
public final class PhysicalStoreViewModel$fetchPhysicalStore$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PhysicalStoreViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreViewModel$fetchPhysicalStore$1(PhysicalStoreViewModel physicalStoreViewModel, C11045c<? super PhysicalStoreViewModel$fetchPhysicalStore$1> cVar) {
        super(2, cVar);
        this.this$0 = physicalStoreViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PhysicalStoreViewModel$fetchPhysicalStore$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0152  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x004b
            if (r2 == r5) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r2
            kotlin.C11661u0.m45747n(r32)
            r3 = r32
            kotlin.Result r3 = (kotlin.Result) r3
            r3.mo21858l()
            goto L_0x0108
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r4
            kotlin.C11661u0.m45747n(r32)
            r7 = r32
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
        L_0x0043:
            r30 = r7
            r7 = r2
            r2 = r4
            r4 = r30
            goto L_0x00c4
        L_0x004b:
            kotlin.C11661u0.m45747n(r32)
            r2 = r32
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x0082
        L_0x0057:
            kotlin.C11661u0.m45747n(r32)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.j r2 = r2.mo78804w0()
        L_0x0060:
            java.lang.Object r7 = r2.getValue()
            r8 = r7
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r8 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r8
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$b r9 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c.C27118b.f65952a
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r8 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r8, r9, r6, r5, r6)
            boolean r7 = r2.mo24216e(r7, r8)
            if (r7 == 0) goto L_0x0060
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r2 = r0.this$0
            com.carrefour.fid.android.domain.interactors.service.physicalstore.c r2 = r2.f65905a
            r0.label = r4
            java.lang.Object r2 = r2.m172965invokeIoAF18A(r0)
            if (r2 != r1) goto L_0x0082
            return r1
        L_0x0082:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r4 = r0.this$0
            java.lang.Throwable r7 = kotlin.Result.m38705e(r2)
            if (r7 != 0) goto L_0x0152
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            if (r2 != 0) goto L_0x00a7
            kotlinx.coroutines.flow.j r7 = r4.mo78804w0()
        L_0x0092:
            java.lang.Object r1 = r7.getValue()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$d r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c.C27120d.f65957a
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r2, r3, r6, r5, r6)
            boolean r1 = r7.mo24216e(r1, r2)
            if (r1 == 0) goto L_0x0092
            goto L_0x0169
        L_0x00a7:
            com.carrefour.fid.android.domain.interactors.service.e r7 = r4.f65906b
            java.lang.String r8 = r2.mo119393w()
            java.lang.String r8 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r8)
            com.carrefour.fid.android.domain.models.service.models.a r8 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r8)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r7 = r7.m172966invokegIAlus(r8, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x00c4:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r4)
            if (r8 != 0) goto L_0x0129
            com.carrefour.fid.android.domain.models.service.models.l r4 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r4
            r9 = r4
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.util.List r20 = r4.mo119367K()
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 261119(0x3fbff, float:3.65906E-40)
            r29 = 0
            com.carrefour.fid.android.domain.models.service.models.l r4 = com.carrefour.fid.android.domain.models.service.models.C38163l.m158177u(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.carrefour.fid.android.domain.interactors.service.physicalstore.d r7 = r2.f65907c
            r0.L$0 = r2
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r3 = r7.m172966invokegIAlus(r4, r0)
            if (r3 != r1) goto L_0x0107
            return r1
        L_0x0107:
            r1 = r4
        L_0x0108:
            kotlinx.coroutines.flow.j r3 = r2.mo78804w0()
        L_0x010c:
            java.lang.Object r2 = r3.getValue()
            r4 = r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r4 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r4
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$c r7 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$c
            com.carrefour.fid.android.shared.util.ServiceUtil r8 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.design.components.widgets.r1 r8 = r8.mo84119a(r1)
            r7.<init>(r1, r8)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r4 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r4, r7, r6, r5, r6)
            boolean r2 = r3.mo24216e(r2, r4)
            if (r2 == 0) goto L_0x010c
            goto L_0x0169
        L_0x0129:
            kotlinx.coroutines.flow.j r1 = r2.mo78804w0()
        L_0x012d:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r3 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r3
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$c r4 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$c
            com.carrefour.fid.android.design.components.widgets.r1 r14 = new com.carrefour.fid.android.design.components.widgets.r1
            java.lang.String r9 = r7.mo119361E()
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r4.<init>(r7, r14)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r3, r4, r6, r5, r6)
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x012d
            goto L_0x0169
        L_0x0152:
            kotlinx.coroutines.flow.j r7 = r4.mo78804w0()
        L_0x0156:
            java.lang.Object r1 = r7.getValue()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.c$a r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27116c.C27117a.f65950a
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r2, r3, r6, r5, r6)
            boolean r1 = r7.mo24216e(r1, r2)
            if (r1 == 0) goto L_0x0156
        L_0x0169:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchPhysicalStore$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreViewModel$fetchPhysicalStore$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
