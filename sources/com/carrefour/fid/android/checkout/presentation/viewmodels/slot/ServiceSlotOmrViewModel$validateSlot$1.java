package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$validateSlot$1", mo22502f = "ServiceSlotOmrViewModel.kt", mo22503i = {0, 1, 1, 2, 3, 4, 5, 6, 7}, mo22504l = {281, 289, 298, 305, 313, 315, 318, 330}, mo22505m = "invokeSuspend", mo22506n = {"slot", "slot", "serviceType", "slot", "slot", "slot", "slot", "slot", "slot"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ServiceSlotOmrViewModel$validateSlot$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $facilityServiceId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ServiceSlotOmrViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotOmrViewModel$validateSlot$1(ServiceSlotOmrViewModel serviceSlotOmrViewModel, String str, C11045c<? super ServiceSlotOmrViewModel$validateSlot$1> cVar) {
        super(2, cVar);
        this.this$0 = serviceSlotOmrViewModel;
        this.$facilityServiceId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ServiceSlotOmrViewModel$validateSlot$1 serviceSlotOmrViewModel$validateSlot$1 = new ServiceSlotOmrViewModel$validateSlot$1(this.this$0, this.$facilityServiceId, cVar);
        serviceSlotOmrViewModel$validateSlot$1.L$0 = obj;
        return serviceSlotOmrViewModel$validateSlot$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bb, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bd, code lost:
        r8 = r4.f101867i;
        r9 = new com.carrefour.fid.android.domain.interactors.service.C37841v.C37842a((com.carrefour.fid.android.domain.models.service.models.StoreService) r0);
        r1.L$0 = r6;
        r1.L$1 = r5;
        r1.L$2 = r4;
        r1.L$3 = r0;
        r1.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d8, code lost:
        if (r8.m172966invokegIAlus(r9, r1) != r2) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02da, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02df, code lost:
        if (kotlin.Result.m38705e(r0) == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e1, code lost:
        r4.emitEvent(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39970b.C39972b(new java.lang.Throwable("Missing or wrong express promise")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f0, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f1, code lost:
        kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0383, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00fd, code lost:
        if (kotlin.Result.m38709i(r6) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ff, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0100, code lost:
        r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0102, code lost:
        if (r6 == null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0104, code lost:
        r6 = r6.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0109, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        if (r6 == null) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010c, code lost:
        r7 = r6.mo119176T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0110, code lost:
        if (r7 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6.mo119163G(), (java.lang.Object) r1.$facilityServiceId) != false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0126, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE) == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0132, code lost:
        if (r1.this$0.f101872n.mo131663n() != null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0136, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0137, code lost:
        r6 = r1.this$0.f101862d;
        r5 = r8;
        r8 = new com.carrefour.fid.android.domain.interactors.service.C37812b.C37813a(r1.this$0.f101872n.mo131663n().mo131772e().getLatitude(), r1.this$0.f101872n.mo131663n().mo131772e().getLongitude(), false, 0, 0, 0, true, false, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r1.L$0 = r0;
        r1.L$1 = r7;
        r1.label = 2;
        r5 = r6.m172966invokegIAlus(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x018d, code lost:
        if (r5 != r2) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x018f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0190, code lost:
        r6 = r5;
        r5 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0193, code lost:
        r7 = r1.this$0;
        r8 = r1.$facilityServiceId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x019b, code lost:
        if (kotlin.Result.m38710j(r6) == false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x019d, code lost:
        r10 = r7.f101863e;
        r11 = new com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a((com.carrefour.fid.android.domain.models.service.models.C38166m) r6, true, r0);
        r1.L$0 = r5;
        r1.L$1 = r6;
        r1.L$2 = r7;
        r1.L$3 = r8;
        r1.label = 3;
        r0 = r10.m172966invokegIAlus(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b8, code lost:
        if (r0 != r2) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ba, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01bb, code lost:
        r4 = r7;
        r22 = r8;
        r8 = r0;
        r0 = r22;
        r23 = r6;
        r6 = r5;
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ca, code lost:
        if (kotlin.Result.m38710j(r8) == false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r7 = kotlin.Result.f28060a;
        r8 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d2, code lost:
        if (r8 == null) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r9 = r8.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d8, code lost:
        if (r9 == null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01da, code lost:
        r9 = r9.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01df, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0) == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e6, code lost:
        r0 = r8.mo119352e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ea, code lost:
        if (r0 == null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ec, code lost:
        r8 = r8.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f0, code lost:
        if (r8 == null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f2, code lost:
        r7 = r4.f101866h;
        r9 = new com.carrefour.fid.android.domain.interactors.service.C37836s.C37837a(r0, r8);
        r1.L$0 = r6;
        r1.L$1 = r5;
        r1.L$2 = r4;
        r1.L$3 = null;
        r1.label = 4;
        r0 = r7.m172966invokegIAlus(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x020b, code lost:
        if (r0 != r2) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x020d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020e, code lost:
        r0 = kotlin.Result.m38702b(kotlin.Result.m38701a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0220, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022a, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0236, code lost:
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0240, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024c, code lost:
        r0 = kotlin.Result.m38702b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0269, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0272, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE) == false) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0274, code lost:
        r5 = r1.this$0.f101864f;
        r1.L$0 = r0;
        r1.label = 5;
        r5 = r5.m172965invokeIoAF18A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0283, code lost:
        if (r5 != r2) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0285, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0286, code lost:
        r6 = r1.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028c, code lost:
        if (kotlin.Result.m38710j(r5) == false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x028e, code lost:
        r7 = (com.carrefour.fid.android.domain.models.category.C37992a) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0297, code lost:
        if (r7.mo117312f() != com.carrefour.fid.android.domain.models.category.PromiseType.Express) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0299, code lost:
        r8 = r6.f101865g;
        r7 = r7.mo117310e();
        r1.L$0 = r0;
        r1.L$1 = r5;
        r1.L$2 = r6;
        r1.label = 6;
        r4 = r8.m173004invokeCkRE9Mk(r7, true, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ae, code lost:
        if (r4 != r2) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b0, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b1, code lost:
        r22 = r6;
        r6 = r0;
        r0 = r4;
        r4 = r22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r1.label
            java.lang.String r3 = "Missing or wrong express promise"
            r4 = 1
            switch(r0) {
                case 0: goto L_0x00c7;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0083;
                case 4: goto L_0x0069;
                case 5: goto L_0x0057;
                case 6: goto L_0x003d;
                case 7: goto L_0x0027;
                case 8: goto L_0x0016;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0016:
            java.lang.Object r0 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            kotlin.C11661u0.m45747n(r25)
            r2 = r25
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.mo21858l()
            goto L_0x0320
        L_0x0027:
            java.lang.Object r0 = r1.L$3
            java.lang.Object r4 = r1.L$2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r4 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r4
            java.lang.Object r6 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r6 = (com.carrefour.fid.android.domain.models.slot.Slot) r6
            kotlin.C11661u0.m45747n(r25)
            r7 = r25
            kotlin.Result r7 = (kotlin.Result) r7
            r7.mo21858l()
            goto L_0x02db
        L_0x003d:
            java.lang.Object r0 = r1.L$2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r0
            java.lang.Object r4 = r1.L$1
            java.lang.Object r6 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r6 = (com.carrefour.fid.android.domain.models.slot.Slot) r6
            kotlin.C11661u0.m45747n(r25)
            r7 = r25
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            r5 = r4
            r4 = r0
            r0 = r7
            goto L_0x02b7
        L_0x0057:
            java.lang.Object r0 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            kotlin.C11661u0.m45747n(r25)
            r6 = r25
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            r5 = r6
            goto L_0x0286
        L_0x0069:
            java.lang.Object r0 = r1.L$2
            r4 = r0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r4 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r4
            java.lang.Object r0 = r1.L$0
            r6 = r0
            com.carrefour.fid.android.domain.models.slot.Slot r6 = (com.carrefour.fid.android.domain.models.slot.Slot) r6
            kotlin.C11661u0.m45747n(r25)     // Catch:{ all -> 0x0080 }
            r0 = r25
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0080 }
            goto L_0x020e
        L_0x0080:
            r0 = move-exception
            goto L_0x0241
        L_0x0083:
            java.lang.Object r0 = r1.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r1.L$2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r4 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel) r4
            java.lang.Object r6 = r1.L$1
            java.lang.Object r7 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r7 = (com.carrefour.fid.android.domain.models.slot.Slot) r7
            kotlin.C11661u0.m45747n(r25)
            r8 = r25
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            r5 = r6
            r6 = r7
            goto L_0x01c6
        L_0x00a0:
            java.lang.Object r0 = r1.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r0 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r0
            java.lang.Object r6 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r6 = (com.carrefour.fid.android.domain.models.slot.Slot) r6
            kotlin.C11661u0.m45747n(r25)
            r7 = r25
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            r5 = r6
            r6 = r7
            goto L_0x0193
        L_0x00b7:
            java.lang.Object r0 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            kotlin.C11661u0.m45747n(r25)
            r6 = r25
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x00f9
        L_0x00c7:
            kotlin.C11661u0.m45747n(r25)
            java.lang.Object r0 = r1.L$0
            kotlinx.coroutines.o0 r0 = (kotlinx.coroutines.C12074o0) r0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r0 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c r0 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel.m162767h0(r0)
            com.carrefour.fid.android.domain.models.slot.Slot r0 = r0.mo131845p()
            if (r0 != 0) goto L_0x00e8
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r7 = "Not selected slot!"
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x00e8:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r6 = r1.this$0
            com.carrefour.fid.android.domain.interactors.service.k r6 = r6.f101860b
            r1.L$0 = r0
            r1.label = r4
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r1)
            if (r6 != r2) goto L_0x00f9
            return r2
        L_0x00f9:
            boolean r7 = kotlin.Result.m38709i(r6)
            if (r7 == 0) goto L_0x0100
            r6 = 0
        L_0x0100:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6
            if (r6 == 0) goto L_0x0109
            com.carrefour.fid.android.domain.models.service.models.StoreService r6 = r6.mo119354f()
            goto L_0x010a
        L_0x0109:
            r6 = 0
        L_0x010a:
            if (r6 == 0) goto L_0x0381
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r7 = r6.mo119176T()
            if (r7 != 0) goto L_0x0114
            goto L_0x0381
        L_0x0114:
            java.lang.String r6 = r6.mo119163G()
            java.lang.String r8 = r1.$facilityServiceId
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            if (r6 != 0) goto L_0x02f6
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r6 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x026c
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r6 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.ui.slot.i r6 = r6.f101872n
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r6 = r6.mo131663n()
            if (r6 != 0) goto L_0x0137
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0137:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r6 = r1.this$0
            com.carrefour.fid.android.domain.interactors.service.b r6 = r6.f101862d
            com.carrefour.fid.android.domain.interactors.service.b$a r15 = new com.carrefour.fid.android.domain.interactors.service.b$a
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r8 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.ui.slot.i r8 = r8.f101872n
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r8 = r8.mo131663n()
            com.carrefour.fid.android.domain.models.LatLon r8 = r8.mo131772e()
            double r9 = r8.getLatitude()
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r8 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.ui.slot.i r8 = r8.f101872n
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r8 = r8.mo131663n()
            com.carrefour.fid.android.domain.models.LatLon r8 = r8.mo131772e()
            double r11 = r8.getLongitude()
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 56
            r21 = 0
            r8 = r15
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.L$0 = r0
            r1.L$1 = r7
            r8 = 2
            r1.label = r8
            java.lang.Object r5 = r6.m172966invokegIAlus(r5, r1)
            if (r5 != r2) goto L_0x0190
            return r2
        L_0x0190:
            r6 = r5
            r5 = r0
            r0 = r7
        L_0x0193:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r7 = r1.this$0
            java.lang.String r8 = r1.$facilityServiceId
            boolean r9 = kotlin.Result.m38710j(r6)
            if (r9 == 0) goto L_0x0269
            r9 = r6
            com.carrefour.fid.android.domain.models.service.models.m r9 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r9
            com.carrefour.fid.android.domain.interactors.service.g r10 = r7.f101863e
            com.carrefour.fid.android.domain.interactors.service.g$a r11 = new com.carrefour.fid.android.domain.interactors.service.g$a
            r11.<init>(r9, r4, r0)
            r1.L$0 = r5
            r1.L$1 = r6
            r1.L$2 = r7
            r1.L$3 = r8
            r0 = 3
            r1.label = r0
            java.lang.Object r0 = r10.m172966invokegIAlus(r11, r1)
            if (r0 != r2) goto L_0x01bb
            return r2
        L_0x01bb:
            r4 = r7
            r22 = r8
            r8 = r0
            r0 = r22
            r23 = r6
            r6 = r5
            r5 = r23
        L_0x01c6:
            boolean r7 = kotlin.Result.m38710j(r8)
            if (r7 == 0) goto L_0x024c
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x0080 }
            com.carrefour.fid.android.domain.models.service.models.k r8 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r8     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = "Required value was null."
            if (r8 == 0) goto L_0x0237
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r8.mo119354f()     // Catch:{ all -> 0x0080 }
            if (r9 == 0) goto L_0x01df
            java.lang.String r9 = r9.mo119163G()     // Catch:{ all -> 0x0080 }
            goto L_0x01e0
        L_0x01df:
            r9 = 0
        L_0x01e0:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x022b
            com.carrefour.fid.android.domain.models.service.models.l r0 = r8.mo119352e()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0221
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = r8.mo119354f()     // Catch:{ all -> 0x0080 }
            if (r8 == 0) goto L_0x0217
            com.carrefour.fid.android.domain.interactors.service.s r7 = r4.f101866h     // Catch:{ all -> 0x0080 }
            com.carrefour.fid.android.domain.interactors.service.s$a r9 = new com.carrefour.fid.android.domain.interactors.service.s$a     // Catch:{ all -> 0x0080 }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x0080 }
            r1.L$0 = r6     // Catch:{ all -> 0x0080 }
            r1.L$1 = r5     // Catch:{ all -> 0x0080 }
            r1.L$2 = r4     // Catch:{ all -> 0x0080 }
            r5 = 0
            r1.L$3 = r5     // Catch:{ all -> 0x0080 }
            r0 = 4
            r1.label = r0     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r7.m172966invokegIAlus(r9, r1)     // Catch:{ all -> 0x0080 }
            if (r0 != r2) goto L_0x020e
            return r2
        L_0x020e:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x0250
        L_0x0217:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0080 }
            r0.<init>(r5)     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0221:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0080 }
            r0.<init>(r5)     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x022b:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0080 }
            r5.<init>(r0)     // Catch:{ all -> 0x0080 }
            throw r5     // Catch:{ all -> 0x0080 }
        L_0x0237:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0080 }
            r0.<init>(r5)     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0241:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x0250
        L_0x024c:
            java.lang.Object r0 = kotlin.Result.m38702b(r8)
        L_0x0250:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x0266
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r3)
            r0.<init>(r2)
            r4.emitEvent(r0)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0266:
            r0 = r6
            goto L_0x02f6
        L_0x0269:
            r0 = r5
            goto L_0x02f6
        L_0x026c:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r5 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x02f1
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r5 = r1.this$0
            com.carrefour.fid.android.domain.interactors.category.b r5 = r5.f101864f
            r1.L$0 = r0
            r6 = 5
            r1.label = r6
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r1)
            if (r5 != r2) goto L_0x0286
            return r2
        L_0x0286:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r6 = r1.this$0
            boolean r7 = kotlin.Result.m38710j(r5)
            if (r7 == 0) goto L_0x02f6
            r7 = r5
            com.carrefour.fid.android.domain.models.category.a r7 = (com.carrefour.fid.android.domain.models.category.C37992a) r7
            com.carrefour.fid.android.domain.models.category.PromiseType r8 = r7.mo117312f()
            com.carrefour.fid.android.domain.models.category.PromiseType r9 = com.carrefour.fid.android.domain.models.category.PromiseType.Express
            if (r8 != r9) goto L_0x02f6
            com.carrefour.fid.android.domain.interactors.service.f r8 = r6.f101865g
            java.lang.String r7 = r7.mo117310e()
            r1.L$0 = r0
            r1.L$1 = r5
            r1.L$2 = r6
            r9 = 6
            r1.label = r9
            java.lang.Object r4 = r8.m173004invokeCkRE9Mk(r7, r4, r1)
            if (r4 != r2) goto L_0x02b1
            return r2
        L_0x02b1:
            r22 = r6
            r6 = r0
            r0 = r4
            r4 = r22
        L_0x02b7:
            boolean r7 = kotlin.Result.m38710j(r0)
            if (r7 == 0) goto L_0x02db
            r7 = r0
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r7
            com.carrefour.fid.android.domain.interactors.service.v r8 = r4.f101867i
            com.carrefour.fid.android.domain.interactors.service.v$a r9 = new com.carrefour.fid.android.domain.interactors.service.v$a
            r9.<init>(r7)
            r1.L$0 = r6
            r1.L$1 = r5
            r1.L$2 = r4
            r1.L$3 = r0
            r5 = 7
            r1.label = r5
            java.lang.Object r5 = r8.m172966invokegIAlus(r9, r1)
            if (r5 != r2) goto L_0x02db
            return r2
        L_0x02db:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x0266
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r3)
            r0.<init>(r2)
            r4.emitEvent(r0)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x02f1:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$H1h3 r3 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE
            kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r3)
        L_0x02f6:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r3 = r1.this$0
            com.carrefour.fid.android.domain.interactors.basket.e r3 = r3.f101868j
            com.carrefour.fid.android.domain.interactors.basket.e$a r4 = new com.carrefour.fid.android.domain.interactors.basket.e$a
            java.lang.String r5 = r0.mo119508t()
            java.lang.String r6 = r1.$facilityServiceId
            java.lang.String r6 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r6)
            r7 = 0
            r4.<init>(r5, r6, r7)
            r1.L$0 = r0
            r1.L$1 = r7
            r1.L$2 = r7
            r1.L$3 = r7
            r5 = 8
            r1.label = r5
            java.lang.Object r3 = r3.m172966invokegIAlus(r4, r1)
            if (r3 != r2) goto L_0x031f
            return r2
        L_0x031f:
            r2 = r3
        L_0x0320:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r3 = r1.this$0
            boolean r4 = kotlin.Result.m38710j(r2)
            if (r4 == 0) goto L_0x0348
            r4 = r2
            com.carrefour.fid.android.domain.models.basket.Basket r4 = (com.carrefour.fid.android.domain.models.basket.Basket) r4
            boolean r5 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156173d(r4)
            if (r5 == 0) goto L_0x0340
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.shared.io.BasketSlotBookThrowable r4 = new com.carrefour.fid.android.shared.io.BasketSlotBookThrowable
            r5 = 0
            r4.<init>(r5)
            r0.<init>(r4)
            r3.emitEvent(r0)
            goto L_0x0348
        L_0x0340:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a r5 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a
            r5.<init>(r0, r4)
            r3.emitEvent(r5)
        L_0x0348:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel r0 = r1.this$0
            java.lang.Throwable r2 = kotlin.Result.m38705e(r2)
            if (r2 == 0) goto L_0x037e
            com.carrefour.fid.android.shared.util.i r3 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r4 = r2.getMessage()
            java.lang.String r9 = ""
            if (r4 != 0) goto L_0x035b
            r4 = r9
        L_0x035b:
            r6 = 0
            r7 = 4
            r8 = 0
            r5 = r2
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r3, r4, r5, r6, r7, r8)
            com.carrefour.fid.android.checkout.presentation.analytics.a r3 = r0.f101870l
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L_0x036d
            goto L_0x036e
        L_0x036d:
            r9 = r2
        L_0x036e:
            r3.mo131443e(r9)
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$BookSlotError r3 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$BookSlotError
            r3.<init>()
            r2.<init>(r3)
            r0.emitEvent(r2)
        L_0x037e:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0381:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel$validateSlot$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ServiceSlotOmrViewModel$validateSlot$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
