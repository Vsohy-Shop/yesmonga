package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import com.carrefour.fid.android.domain.models.account.Address;
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

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$validate$1", mo22502f = "DeliverySummaryViewModel.kt", mo22503i = {1, 3, 5}, mo22504l = {108, 110, 117, 118, 125, 127, 128, 130}, mo22505m = "invokeSuspend", mo22506n = {"currentAddress", "error", "storeService"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliverySummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel$validate$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n230#2,5:155\n230#2,5:160\n230#2,5:166\n1#3:165\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel$validate$1\n*L\n106#1:155,5\n119#1:160,5\n131#1:166,5\n*E\n"})
public final class DeliverySummaryViewModel$validate$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Address $address;
    final /* synthetic */ String $telephone;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DeliverySummaryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryViewModel$validate$1(DeliverySummaryViewModel deliverySummaryViewModel, Address address, String str, C11045c<? super DeliverySummaryViewModel$validate$1> cVar) {
        super(2, cVar);
        this.this$0 = deliverySummaryViewModel;
        this.$address = address;
        this.$telephone = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DeliverySummaryViewModel$validate$1(this.this$0, this.$address, this.$telephone, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        r5 = r0.this$0.getUserPhoneUseCase;
        r0.L$0 = r2;
        r0.label = 2;
        r5 = r5.m172965invokeIoAF18A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cc, code lost:
        if (r5 != r1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ce, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
        if (kotlin.Result.m38709i(r2) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d6, code lost:
        r6 = (com.carrefour.fid.android.domain.models.account.Address) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        if (r6 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dc, code lost:
        r6 = com.carrefour.fid.android.domain.models.account.Address.m155867v(r6, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.carrefour.fid.android.domain.models.AddressCategory) null, 0, true, 0.0d, 0.0d, (java.lang.Boolean) null, (java.lang.String) null, 1015807, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0104, code lost:
        if (r6 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0135, code lost:
        if (r6.equals(com.carrefour.fid.android.domain.models.account.Address.m155867v(r0.$address, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.carrefour.fid.android.domain.models.AddressCategory) null, 0, true, 0.0d, 0.0d, (java.lang.Boolean) null, (java.lang.String) null, 1015807, (java.lang.Object) null)) != true) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0137, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0139, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013a, code lost:
        if (r6 == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0140, code lost:
        if (kotlin.Result.m38709i(r5) == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0142, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0143, code lost:
        r5 = (java.lang.String) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0145, code lost:
        if (r5 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014d, code lost:
        if (r5.equals(r0.$telephone) != true) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0150, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0151, code lost:
        if (r3 != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0153, code lost:
        r2 = r0.this$0.updateUserAddressUseCase;
        r3 = new com.carrefour.fid.android.domain.interactors.account.C37520f(r0.$address, r0.$telephone);
        r0.L$0 = null;
        r0.label = 3;
        r2 = r2.m172966invokegIAlus(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016b, code lost:
        if (r2 != r1) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016e, code lost:
        r3 = r0.this$0;
        r2 = kotlin.Result.m38705e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0174, code lost:
        if (r2 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0176, code lost:
        r4 = r3._sideEffect;
        r5 = new com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect.ValidationError(r2);
        r0.L$0 = r3;
        r0.L$1 = r2;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018a, code lost:
        if (r4.mo23757h0(r5, r0) != r1) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018d, code lost:
        r3 = r3._validateState;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0191, code lost:
        r1 = r3.getValue();
        r4 = (com.carrefour.fid.android.shared.type.C28892e) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        if (r3.mo24216e(r1, new com.carrefour.fid.android.shared.type.C28892e.C28893a(r2)) == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a5, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a6, code lost:
        r2 = r0.this$0.getPendingServiceSelectionUseCase;
        r0.L$0 = null;
        r0.label = 5;
        r2 = r2.m172838invokeIoAF18A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b5, code lost:
        if (r2 != r1) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b8, code lost:
        r3 = r0.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01be, code lost:
        if (kotlin.Result.m38710j(r2) == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c0, code lost:
        r5 = ((com.carrefour.fid.android.domain.models.service.models.C38162k) r2).mo119350b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c7, code lost:
        if (r5 == null) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c9, code lost:
        r6 = r3.applyPendingServiceSelectionUseCase;
        r0.L$0 = r2;
        r0.L$1 = r3;
        r0.L$2 = r5;
        r0.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01da, code lost:
        if (r6.m172833invokeIoAF18A(r0) != r1) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01dc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01dd, code lost:
        r32 = r3;
        r3 = r2;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e2, code lost:
        r6 = r2.switchFacilityServiceInBasketUseCase;
        r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r5.mo119163G()));
        r0.L$0 = r3;
        r0.L$1 = r2;
        r0.L$2 = null;
        r0.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ff, code lost:
        if (r6.m172966invokegIAlus(r5, r0) != r1) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0201, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0202, code lost:
        r32 = r3;
        r3 = r2;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0207, code lost:
        r4 = r2._sideEffect;
        r5 = com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect.ValidationSuccess.INSTANCE;
        r0.L$0 = r3;
        r0.L$1 = r2;
        r0.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0219, code lost:
        if (r4.mo23757h0(r5, r0) != r1) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x021b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021c, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021d, code lost:
        r1 = r1._validateState;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0221, code lost:
        r2 = r1.getValue();
        r3 = (com.carrefour.fid.android.shared.type.C28892e) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0233, code lost:
        if (r1.mo24216e(r2, new com.carrefour.fid.android.shared.type.C28892e.C28895c(kotlin.C11079d2.f28267a)) == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0237, code lost:
        return kotlin.C11079d2.f28267a;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r34) {
        /*
            r33 = this;
            r0 = r33
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0083;
                case 2: goto L_0x0075;
                case 3: goto L_0x0068;
                case 4: goto L_0x0059;
                case 5: goto L_0x004c;
                case 6: goto L_0x0030;
                case 7: goto L_0x001e;
                case 8: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0015:
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r1 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel) r1
            kotlin.C11661u0.m45747n(r34)
            goto L_0x021d
        L_0x001e:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r2 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel) r2
            java.lang.Object r3 = r0.L$0
            kotlin.C11661u0.m45747n(r34)
            r4 = r34
            kotlin.Result r4 = (kotlin.Result) r4
            r4.mo21858l()
            goto L_0x0207
        L_0x0030:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            java.lang.Object r3 = r0.L$1
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r3 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel) r3
            java.lang.Object r5 = r0.L$0
            kotlin.C11661u0.m45747n(r34)
            r6 = r34
            kotlin.Result r6 = (kotlin.Result) r6
            r6.mo21858l()
            r32 = r5
            r5 = r2
            r2 = r3
            r3 = r32
            goto L_0x01e2
        L_0x004c:
            kotlin.C11661u0.m45747n(r34)
            r2 = r34
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x01b8
        L_0x0059:
            java.lang.Object r1 = r0.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r2 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel) r2
            kotlin.C11661u0.m45747n(r34)
            r3 = r2
            r2 = r1
            goto L_0x018d
        L_0x0068:
            kotlin.C11661u0.m45747n(r34)
            r2 = r34
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x016e
        L_0x0075:
            java.lang.Object r2 = r0.L$0
            kotlin.C11661u0.m45747n(r34)
            r5 = r34
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x00cf
        L_0x0083:
            kotlin.C11661u0.m45747n(r34)
            r2 = r34
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x00bd
        L_0x008f:
            kotlin.C11661u0.m45747n(r34)
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r2 = r0.this$0
            kotlinx.coroutines.flow.j r2 = r2._validateState
        L_0x0098:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            com.carrefour.fid.android.shared.type.e r6 = (com.carrefour.fid.android.shared.type.C28892e) r6
            com.carrefour.fid.android.shared.type.e$b r6 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r5 = r2.mo24216e(r5, r6)
            if (r5 == 0) goto L_0x0098
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r2 = r0.this$0
            com.carrefour.fid.android.domain.interactors.user.c r2 = r2.getUserAddressUseCase
            com.carrefour.fid.android.domain.interactors.user.c$a r5 = new com.carrefour.fid.android.domain.interactors.user.c$a
            com.carrefour.fid.android.domain.models.AddressCategory r6 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            r5.<init>(r6)
            r0.label = r3
            java.lang.Object r2 = r2.m172966invokegIAlus(r5, r0)
            if (r2 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r5 = r0.this$0
            com.carrefour.fid.android.domain.interactors.user.g r5 = r5.getUserPhoneUseCase
            r0.L$0 = r2
            r6 = 2
            r0.label = r6
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            boolean r6 = kotlin.Result.m38709i(r2)
            if (r6 == 0) goto L_0x00d6
            r2 = r4
        L_0x00d6:
            r6 = r2
            com.carrefour.fid.android.domain.models.account.Address r6 = (com.carrefour.fid.android.domain.models.account.Address) r6
            r2 = 0
            if (r6 == 0) goto L_0x0139
            r7 = 0
            r8 = 0
            r9 = 0
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
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 1015807(0xf7fff, float:1.423449E-39)
            r30 = 0
            com.carrefour.fid.android.domain.models.account.Address r6 = com.carrefour.fid.android.domain.models.account.Address.m155867v(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28, r29, r30)
            if (r6 == 0) goto L_0x0139
            com.carrefour.fid.android.domain.models.account.Address r7 = r0.$address
            r8 = 0
            r9 = 0
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
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 1015807(0xf7fff, float:1.423449E-39)
            r31 = 0
            com.carrefour.fid.android.domain.models.account.Address r7 = com.carrefour.fid.android.domain.models.account.Address.m155867v(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31)
            boolean r6 = r6.equals(r7)
            if (r6 != r3) goto L_0x0139
            r6 = r3
            goto L_0x013a
        L_0x0139:
            r6 = r2
        L_0x013a:
            if (r6 == 0) goto L_0x0153
            boolean r6 = kotlin.Result.m38709i(r5)
            if (r6 == 0) goto L_0x0143
            r5 = r4
        L_0x0143:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0150
            java.lang.String r6 = r0.$telephone
            boolean r5 = r5.equals(r6)
            if (r5 != r3) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r3 = r2
        L_0x0151:
            if (r3 != 0) goto L_0x01a6
        L_0x0153:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r2 = r0.this$0
            com.carrefour.fid.android.domain.interactors.account.i r2 = r2.updateUserAddressUseCase
            com.carrefour.fid.android.domain.interactors.account.f r3 = new com.carrefour.fid.android.domain.interactors.account.f
            com.carrefour.fid.android.domain.models.account.Address r5 = r0.$address
            java.lang.String r6 = r0.$telephone
            r3.<init>(r5, r6)
            r0.L$0 = r4
            r5 = 3
            r0.label = r5
            java.lang.Object r2 = r2.m172966invokegIAlus(r3, r0)
            if (r2 != r1) goto L_0x016e
            return r1
        L_0x016e:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r3 = r0.this$0
            java.lang.Throwable r2 = kotlin.Result.m38705e(r2)
            if (r2 == 0) goto L_0x01a6
            kotlinx.coroutines.channels.g r4 = r3._sideEffect
            com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummarySideEffect$ValidationError r5 = new com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummarySideEffect$ValidationError
            r5.<init>(r2)
            r0.L$0 = r3
            r0.L$1 = r2
            r6 = 4
            r0.label = r6
            java.lang.Object r4 = r4.mo23757h0(r5, r0)
            if (r4 != r1) goto L_0x018d
            return r1
        L_0x018d:
            kotlinx.coroutines.flow.j r3 = r3._validateState
        L_0x0191:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            com.carrefour.fid.android.shared.type.e r4 = (com.carrefour.fid.android.shared.type.C28892e) r4
            com.carrefour.fid.android.shared.type.e$a r4 = new com.carrefour.fid.android.shared.type.e$a
            r4.<init>(r2)
            boolean r1 = r3.mo24216e(r1, r4)
            if (r1 == 0) goto L_0x0191
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x01a6:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r2 = r0.this$0
            com.carrefour.fid.android.service.domain.interactors.GetPendingServiceSelectionUseCase r2 = r2.getPendingServiceSelectionUseCase
            r0.L$0 = r4
            r3 = 5
            r0.label = r3
            java.lang.Object r2 = r2.m172838invokeIoAF18A(r0)
            if (r2 != r1) goto L_0x01b8
            return r1
        L_0x01b8:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r3 = r0.this$0
            boolean r5 = kotlin.Result.m38710j(r2)
            if (r5 == 0) goto L_0x0235
            r5 = r2
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r5.mo119350b()
            if (r5 == 0) goto L_0x0202
            com.carrefour.fid.android.service.domain.interactors.ApplyPendingServiceSelectionUseCase r6 = r3.applyPendingServiceSelectionUseCase
            r0.L$0 = r2
            r0.L$1 = r3
            r0.L$2 = r5
            r7 = 6
            r0.label = r7
            java.lang.Object r6 = r6.m172833invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x01dd
            return r1
        L_0x01dd:
            r32 = r3
            r3 = r2
            r2 = r32
        L_0x01e2:
            com.carrefour.fid.android.domain.interactors.basket.j0 r6 = r2.switchFacilityServiceInBasketUseCase
            java.lang.String r5 = r5.mo119163G()
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r5)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r5)
            r0.L$0 = r3
            r0.L$1 = r2
            r0.L$2 = r4
            r4 = 7
            r0.label = r4
            java.lang.Object r4 = r6.m172966invokegIAlus(r5, r0)
            if (r4 != r1) goto L_0x0207
            return r1
        L_0x0202:
            r32 = r3
            r3 = r2
            r2 = r32
        L_0x0207:
            kotlinx.coroutines.channels.g r4 = r2._sideEffect
            com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummarySideEffect$ValidationSuccess r5 = com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect.ValidationSuccess.INSTANCE
            r0.L$0 = r3
            r0.L$1 = r2
            r3 = 8
            r0.label = r3
            java.lang.Object r3 = r4.mo23757h0(r5, r0)
            if (r3 != r1) goto L_0x021c
            return r1
        L_0x021c:
            r1 = r2
        L_0x021d:
            kotlinx.coroutines.flow.j r1 = r1._validateState
        L_0x0221:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.carrefour.fid.android.shared.type.e r3 = (com.carrefour.fid.android.shared.type.C28892e) r3
            com.carrefour.fid.android.shared.type.e$c r3 = new com.carrefour.fid.android.shared.type.e$c
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            r3.<init>(r4)
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x0221
        L_0x0235:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$validate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DeliverySummaryViewModel$validate$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
