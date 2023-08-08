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

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateSlot$1", mo22502f = "ServiceSlotViewModel.kt", mo22503i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 11, 11}, mo22504l = {395, 409, 414, 421, 428, 435, 442, 444, 447, 459, 468, 475}, mo22505m = "invokeSuspend", mo22506n = {"$this$launch", "facilityServiceId", "slot", "facilityServiceId", "slot", "facilityServiceId", "slot", "facilityServiceId", "slot", "facilityServiceId", "slot", "facilityServiceId", "slot", "facilityServiceId", "slot", "facilityServiceId", "slot", "slot", "slot", "basket"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$3"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ServiceSlotViewModel$validateSlot$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ServiceSlotViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotViewModel$validateSlot$1(ServiceSlotViewModel serviceSlotViewModel, C11045c<? super ServiceSlotViewModel$validateSlot$1> cVar) {
        super(2, cVar);
        this.this$0 = serviceSlotViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ServiceSlotViewModel$validateSlot$1 serviceSlotViewModel$validateSlot$1 = new ServiceSlotViewModel$validateSlot$1(this.this$0, cVar);
        serviceSlotViewModel$validateSlot$1.L$0 = obj;
        return serviceSlotViewModel$validateSlot$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0293, code lost:
        r3 = r5;
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a2, code lost:
        r0 = kotlin.Result.m38702b(r0);
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02af, code lost:
        r3.emitEvent(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39970b.C39972b(new java.lang.Throwable("Missing or wrong express promise")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02be, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c5, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE) == false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c7, code lost:
        r5 = r1.this$0.f101884i;
        r10 = new com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a(r1.this$0.f101897v, true, r11);
        r1.L$0 = r9;
        r1.L$1 = r0;
        r1.label = 5;
        r5 = r5.m172966invokegIAlus(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e3, code lost:
        if (r5 != r2) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e5, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e6, code lost:
        r17 = r5;
        r5 = r0;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02eb, code lost:
        r10 = r1.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f1, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r11 = kotlin.Result.f28060a;
        r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f7, code lost:
        if (r0 == null) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f9, code lost:
        r11 = r0.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02fd, code lost:
        if (r11 == null) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ff, code lost:
        r11 = r11.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0304, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0309, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r9) == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x030b, code lost:
        r3 = r0.mo119352e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x030f, code lost:
        if (r3 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0311, code lost:
        r0 = r0.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0315, code lost:
        if (r0 == null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0317, code lost:
        r7 = r10.f101887l;
        r10 = new com.carrefour.fid.android.domain.interactors.service.C37836s.C37837a(r3, r0);
        r1.L$0 = r9;
        r1.L$1 = r5;
        r1.label = 6;
        r0 = r7.m172966invokegIAlus(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032b, code lost:
        if (r0 != r2) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x032d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x032e, code lost:
        r3 = r5;
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r0 = kotlin.Result.m38702b(kotlin.Result.m38701a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0342, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x034c, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0356, code lost:
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0360, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0361, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0362, code lost:
        r3 = r5;
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0371, code lost:
        r0 = kotlin.Result.m38702b(r0);
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0394, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE) == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0396, code lost:
        r3 = r1.this$0.f101885j;
        r1.L$0 = r9;
        r1.L$1 = r0;
        r1.label = 7;
        r3 = r3.m172965invokeIoAF18A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a7, code lost:
        if (r3 != r2) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03aa, code lost:
        r4 = r1.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b0, code lost:
        if (kotlin.Result.m38710j(r3) == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b2, code lost:
        r7 = (com.carrefour.fid.android.domain.models.category.C37992a) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03bb, code lost:
        if (r7.mo117312f() != com.carrefour.fid.android.domain.models.category.PromiseType.Standard) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03bd, code lost:
        r10 = r4.f101886k;
        r7 = r7.mo117310e();
        r1.L$0 = r9;
        r1.L$1 = r0;
        r1.L$2 = r3;
        r1.L$3 = r4;
        r1.label = 8;
        r5 = r10.m173004invokeCkRE9Mk(r7, false, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d5, code lost:
        if (r5 != r2) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d7, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d8, code lost:
        r17 = r5;
        r5 = r0;
        r0 = r17;
        r18 = r4;
        r4 = r3;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e6, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e8, code lost:
        r10 = r3.f101888m;
        r11 = new com.carrefour.fid.android.domain.interactors.service.C37841v.C37842a((com.carrefour.fid.android.domain.models.service.models.StoreService) r0);
        r1.L$0 = r9;
        r1.L$1 = r5;
        r1.L$2 = r4;
        r1.L$3 = r3;
        r1.L$4 = r0;
        r1.label = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0406, code lost:
        if (r10.m172966invokegIAlus(r11, r1) != r2) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0408, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0409, code lost:
        r4 = r5;
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x040b, code lost:
        r9 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0411, code lost:
        if (kotlin.Result.m38705e(r0) == null) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0413, code lost:
        r3.emitEvent(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39970b.C39972b(new java.lang.Throwable("Missing or wrong standard promise")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0424, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0425, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0427, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x042b, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0144, code lost:
        if (kotlin.Result.m38709i(r0) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0146, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0147, code lost:
        r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0;
        r9 = r1.this$0.f101894s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014f, code lost:
        if (r9 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0153, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0154, code lost:
        r10 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.m162805h0(r1.this$0).mo131845p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015e, code lost:
        if (r10 != null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0160, code lost:
        com.carrefour.fid.android.shared.util.C28935i.m119705e(com.carrefour.fid.android.shared.util.C28935i.f70940a, "Not selected slot!", (java.lang.Throwable) null, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016e, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x016f, code lost:
        if (r0 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0181, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0.mo116826K().mo116999j(), (java.lang.Object) r10.mo119508t()) == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018b, code lost:
        if (r0.mo116826K().mo117001l() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0197, code lost:
        if (r1.this$0.f101893r.mo131623s() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0199, code lost:
        r1.this$0.emitEvent(new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a.C39970b.C39971a(r10, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a5, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b0, code lost:
        if (r1.this$0.f101893r.mo131623s() == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b2, code lost:
        r0 = r1.this$0.f101877b;
        r1.L$0 = r9;
        r1.L$1 = r10;
        r1.label = 2;
        r0 = r0.m172965invokeIoAF18A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01c3, code lost:
        if (r0 != r2) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c5, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c6, code lost:
        r17 = r10;
        r10 = r0;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01cf, code lost:
        if (kotlin.Result.m38709i(r10) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d1, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d2, code lost:
        r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d4, code lost:
        if (r10 == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d6, code lost:
        r10 = r10.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01db, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01dc, code lost:
        if (r10 == null) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01de, code lost:
        r11 = r10.mo119176T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e2, code lost:
        if (r11 != null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ee, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10.mo119163G(), (java.lang.Object) r9) != false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f6, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE) == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f8, code lost:
        r10 = r1.this$0.f101884i;
        r12 = new com.carrefour.fid.android.domain.interactors.service.C37818g.C37819a(r1.this$0.f101897v, false, r11);
        r1.L$0 = r9;
        r1.L$1 = r0;
        r1.label = 3;
        r5 = r10.m172966invokegIAlus(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0214, code lost:
        if (r5 != r2) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0216, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0217, code lost:
        r17 = r5;
        r5 = r0;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021c, code lost:
        r10 = r1.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0222, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r11 = kotlin.Result.f28060a;
        r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0228, code lost:
        if (r0 == null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022a, code lost:
        r11 = r0.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x022e, code lost:
        if (r11 == null) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0230, code lost:
        r11 = r11.mo119163G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0235, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r9) == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023c, code lost:
        r3 = r0.mo119352e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0240, code lost:
        if (r3 == null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0242, code lost:
        r0 = r0.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0246, code lost:
        if (r0 == null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0248, code lost:
        r7 = r10.f101887l;
        r10 = new com.carrefour.fid.android.domain.interactors.service.C37836s.C37837a(r3, r0);
        r1.L$0 = r9;
        r1.L$1 = r5;
        r1.label = 4;
        r0 = r7.m172966invokegIAlus(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025c, code lost:
        if (r0 != r2) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x025f, code lost:
        r3 = r5;
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r0 = kotlin.Result.m38702b(kotlin.Result.m38701a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0273, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027d, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0287, code lost:
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0291, code lost:
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0292, code lost:
        r0 = th;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x044f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0450  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r1.label
            java.lang.String r3 = "Failed requirement."
            java.lang.String r4 = "Missing or wrong express promise"
            r5 = 0
            r6 = 1
            java.lang.String r7 = "Required value was null."
            r8 = 0
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0118;
                case 2: goto L_0x0103;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00b3;
                case 6: goto L_0x0099;
                case 7: goto L_0x0082;
                case 8: goto L_0x0062;
                case 9: goto L_0x0048;
                case 10: goto L_0x0036;
                case 11: goto L_0x002f;
                case 12: goto L_0x001c;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001c:
            java.lang.Object r0 = r1.L$3
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
            java.lang.Object r2 = r1.L$2
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r2
            java.lang.Object r3 = r1.L$1
            java.lang.Object r4 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r4 = (com.carrefour.fid.android.domain.models.slot.Slot) r4
            kotlin.C11661u0.m45747n(r20)
            goto L_0x04c8
        L_0x002f:
            java.lang.Object r0 = r1.L$0
            kotlin.C11661u0.m45747n(r20)
            goto L_0x049d
        L_0x0036:
            java.lang.Object r0 = r1.L$0
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            kotlin.C11661u0.m45747n(r20)
            r3 = r20
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r3 = r3.mo21858l()
            r4 = r0
            goto L_0x0452
        L_0x0048:
            java.lang.Object r0 = r1.L$4
            java.lang.Object r3 = r1.L$3
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r3 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r3
            java.lang.Object r4 = r1.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r4 = (com.carrefour.fid.android.domain.models.slot.Slot) r4
            java.lang.Object r5 = r1.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r20)
            r7 = r20
            kotlin.Result r7 = (kotlin.Result) r7
            r7.mo21858l()
            goto L_0x040b
        L_0x0062:
            java.lang.Object r0 = r1.L$3
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel) r0
            java.lang.Object r3 = r1.L$2
            java.lang.Object r4 = r1.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r4 = (com.carrefour.fid.android.domain.models.slot.Slot) r4
            java.lang.Object r5 = r1.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r20)
            r7 = r20
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            r9 = r5
            r5 = r4
            r4 = r3
            r3 = r0
            r0 = r7
            goto L_0x03e2
        L_0x0082:
            java.lang.Object r0 = r1.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            java.lang.Object r3 = r1.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.C11661u0.m45747n(r20)
            r4 = r20
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.mo21858l()
            r9 = r3
            r3 = r4
            goto L_0x03aa
        L_0x0099:
            java.lang.Object r0 = r1.L$1
            r3 = r0
            com.carrefour.fid.android.domain.models.slot.Slot r3 = (com.carrefour.fid.android.domain.models.slot.Slot) r3
            java.lang.Object r0 = r1.L$0
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r20)     // Catch:{ all -> 0x00b0 }
            r0 = r20
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x00b0 }
            goto L_0x0330
        L_0x00b0:
            r0 = move-exception
            goto L_0x0364
        L_0x00b3:
            java.lang.Object r0 = r1.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            java.lang.Object r5 = r1.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r20)
            r9 = r20
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            r17 = r5
            r5 = r0
            r0 = r9
            r9 = r17
            goto L_0x02eb
        L_0x00ce:
            java.lang.Object r0 = r1.L$1
            r3 = r0
            com.carrefour.fid.android.domain.models.slot.Slot r3 = (com.carrefour.fid.android.domain.models.slot.Slot) r3
            java.lang.Object r0 = r1.L$0
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r20)     // Catch:{ all -> 0x00e5 }
            r0 = r20
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x00e5 }
            goto L_0x0261
        L_0x00e5:
            r0 = move-exception
            goto L_0x0295
        L_0x00e8:
            java.lang.Object r0 = r1.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            java.lang.Object r5 = r1.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r20)
            r9 = r20
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            r17 = r5
            r5 = r0
            r0 = r9
            r9 = r17
            goto L_0x021c
        L_0x0103:
            java.lang.Object r0 = r1.L$1
            com.carrefour.fid.android.domain.models.slot.Slot r0 = (com.carrefour.fid.android.domain.models.slot.Slot) r0
            java.lang.Object r9 = r1.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.C11661u0.m45747n(r20)
            r10 = r20
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x01cb
        L_0x0118:
            java.lang.Object r0 = r1.L$0
            kotlinx.coroutines.o0 r0 = (kotlinx.coroutines.C12074o0) r0
            kotlin.C11661u0.m45747n(r20)
            r0 = r20
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0140
        L_0x0128:
            kotlin.C11661u0.m45747n(r20)
            java.lang.Object r0 = r1.L$0
            kotlinx.coroutines.o0 r0 = (kotlinx.coroutines.C12074o0) r0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r9 = r1.this$0
            com.carrefour.fid.android.domain.interactors.basket.e0 r9 = r9.f101879d
            r1.L$0 = r0
            r1.label = r6
            java.lang.Object r0 = r9.m172965invokeIoAF18A(r1)
            if (r0 != r2) goto L_0x0140
            return r2
        L_0x0140:
            boolean r9 = kotlin.Result.m38709i(r0)
            if (r9 == 0) goto L_0x0147
            r0 = r8
        L_0x0147:
            com.carrefour.fid.android.domain.models.basket.Basket r0 = (com.carrefour.fid.android.domain.models.basket.Basket) r0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r9 = r1.this$0
            java.lang.String r9 = r9.f101894s
            if (r9 != 0) goto L_0x0154
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0154:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r10 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$c r10 = com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel.m162805h0(r10)
            com.carrefour.fid.android.domain.models.slot.Slot r10 = r10.mo131845p()
            if (r10 != 0) goto L_0x016f
            com.carrefour.fid.android.shared.util.i r11 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r12 = "Not selected slot!"
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r11, r12, r13, r14, r15, r16)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x016f:
            if (r0 == 0) goto L_0x01a6
            com.carrefour.fid.android.domain.models.basket.BasketSlot r11 = r0.mo116826K()
            java.lang.String r11 = r11.mo116999j()
            java.lang.String r12 = r10.mo119508t()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x01a6
            com.carrefour.fid.android.domain.models.basket.BasketSlot r11 = r0.mo116826K()
            boolean r11 = r11.mo117001l()
            if (r11 == 0) goto L_0x01a6
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r11 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.ui.slot.d r11 = r11.f101893r
            boolean r11 = r11.mo131623s()
            if (r11 == 0) goto L_0x01a6
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r2 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a r3 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a
            r3.<init>(r10, r0)
            r2.emitEvent(r3)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x01a6:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = r1.this$0
            com.carrefour.fid.android.checkout.presentation.ui.slot.d r0 = r0.f101893r
            boolean r0 = r0.mo131623s()
            if (r0 == 0) goto L_0x042c
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = r1.this$0
            com.carrefour.fid.android.domain.interactors.service.k r0 = r0.f101877b
            r1.L$0 = r9
            r1.L$1 = r10
            r11 = 2
            r1.label = r11
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r1)
            if (r0 != r2) goto L_0x01c6
            return r2
        L_0x01c6:
            r17 = r10
            r10 = r0
            r0 = r17
        L_0x01cb:
            boolean r11 = kotlin.Result.m38709i(r10)
            if (r11 == 0) goto L_0x01d2
            r10 = r8
        L_0x01d2:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x01db
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            goto L_0x01dc
        L_0x01db:
            r10 = r8
        L_0x01dc:
            if (r10 == 0) goto L_0x0429
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r11 = r10.mo119176T()
            if (r11 != 0) goto L_0x01e6
            goto L_0x0429
        L_0x01e6:
            java.lang.String r10 = r10.mo119163G()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r9)
            if (r10 != 0) goto L_0x0427
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r10 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x02bf
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r10 = r1.this$0
            com.carrefour.fid.android.domain.interactors.service.g r10 = r10.f101884i
            com.carrefour.fid.android.domain.interactors.service.g$a r12 = new com.carrefour.fid.android.domain.interactors.service.g$a
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r13 = r1.this$0
            com.carrefour.fid.android.domain.models.service.models.m r13 = r13.f101897v
            r12.<init>(r13, r5, r11)
            r1.L$0 = r9
            r1.L$1 = r0
            r5 = 3
            r1.label = r5
            java.lang.Object r5 = r10.m172966invokegIAlus(r12, r1)
            if (r5 != r2) goto L_0x0217
            return r2
        L_0x0217:
            r17 = r5
            r5 = r0
            r0 = r17
        L_0x021c:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r10 = r1.this$0
            boolean r11 = kotlin.Result.m38710j(r0)
            if (r11 == 0) goto L_0x02a2
            kotlin.Result$a r11 = kotlin.Result.f28060a     // Catch:{ all -> 0x0292 }
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x0288
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = r0.mo119354f()     // Catch:{ all -> 0x0292 }
            if (r11 == 0) goto L_0x0235
            java.lang.String r11 = r11.mo119163G()     // Catch:{ all -> 0x0292 }
            goto L_0x0236
        L_0x0235:
            r11 = r8
        L_0x0236:
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r9)     // Catch:{ all -> 0x0292 }
            if (r11 == 0) goto L_0x027e
            com.carrefour.fid.android.domain.models.service.models.l r3 = r0.mo119352e()     // Catch:{ all -> 0x0292 }
            if (r3 == 0) goto L_0x0274
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x026a
            com.carrefour.fid.android.domain.interactors.service.s r7 = r10.f101887l     // Catch:{ all -> 0x0292 }
            com.carrefour.fid.android.domain.interactors.service.s$a r10 = new com.carrefour.fid.android.domain.interactors.service.s$a     // Catch:{ all -> 0x0292 }
            r10.<init>(r3, r0)     // Catch:{ all -> 0x0292 }
            r1.L$0 = r9     // Catch:{ all -> 0x0292 }
            r1.L$1 = r5     // Catch:{ all -> 0x0292 }
            r0 = 4
            r1.label = r0     // Catch:{ all -> 0x0292 }
            java.lang.Object r0 = r7.m172966invokegIAlus(r10, r1)     // Catch:{ all -> 0x0292 }
            if (r0 != r2) goto L_0x025f
            return r2
        L_0x025f:
            r3 = r5
            r5 = r9
        L_0x0261:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x029f
        L_0x026a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0292 }
            r0.<init>(r3)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0274:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0292 }
            r0.<init>(r3)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x027e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0292 }
            r0.<init>(r3)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0288:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0292 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0292 }
            r0.<init>(r3)     // Catch:{ all -> 0x0292 }
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0292:
            r0 = move-exception
            r3 = r5
            r5 = r9
        L_0x0295:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x029f:
            r10 = r3
            r9 = r5
            goto L_0x02a7
        L_0x02a2:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            r10 = r5
        L_0x02a7:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r3 = r1.this$0
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x042c
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r4)
            r0.<init>(r2)
            r3.emitEvent(r0)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x02bf:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$H1h3 r10 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x038e
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r5 = r1.this$0
            com.carrefour.fid.android.domain.interactors.service.g r5 = r5.f101884i
            com.carrefour.fid.android.domain.interactors.service.g$a r10 = new com.carrefour.fid.android.domain.interactors.service.g$a
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r12 = r1.this$0
            com.carrefour.fid.android.domain.models.service.models.m r12 = r12.f101897v
            r10.<init>(r12, r6, r11)
            r1.L$0 = r9
            r1.L$1 = r0
            r11 = 5
            r1.label = r11
            java.lang.Object r5 = r5.m172966invokegIAlus(r10, r1)
            if (r5 != r2) goto L_0x02e6
            return r2
        L_0x02e6:
            r17 = r5
            r5 = r0
            r0 = r17
        L_0x02eb:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r10 = r1.this$0
            boolean r11 = kotlin.Result.m38710j(r0)
            if (r11 == 0) goto L_0x0371
            kotlin.Result$a r11 = kotlin.Result.f28060a     // Catch:{ all -> 0x0361 }
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0     // Catch:{ all -> 0x0361 }
            if (r0 == 0) goto L_0x0357
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = r0.mo119354f()     // Catch:{ all -> 0x0361 }
            if (r11 == 0) goto L_0x0304
            java.lang.String r11 = r11.mo119163G()     // Catch:{ all -> 0x0361 }
            goto L_0x0305
        L_0x0304:
            r11 = r8
        L_0x0305:
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r9)     // Catch:{ all -> 0x0361 }
            if (r11 == 0) goto L_0x034d
            com.carrefour.fid.android.domain.models.service.models.l r3 = r0.mo119352e()     // Catch:{ all -> 0x0361 }
            if (r3 == 0) goto L_0x0343
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()     // Catch:{ all -> 0x0361 }
            if (r0 == 0) goto L_0x0339
            com.carrefour.fid.android.domain.interactors.service.s r7 = r10.f101887l     // Catch:{ all -> 0x0361 }
            com.carrefour.fid.android.domain.interactors.service.s$a r10 = new com.carrefour.fid.android.domain.interactors.service.s$a     // Catch:{ all -> 0x0361 }
            r10.<init>(r3, r0)     // Catch:{ all -> 0x0361 }
            r1.L$0 = r9     // Catch:{ all -> 0x0361 }
            r1.L$1 = r5     // Catch:{ all -> 0x0361 }
            r0 = 6
            r1.label = r0     // Catch:{ all -> 0x0361 }
            java.lang.Object r0 = r7.m172966invokegIAlus(r10, r1)     // Catch:{ all -> 0x0361 }
            if (r0 != r2) goto L_0x032e
            return r2
        L_0x032e:
            r3 = r5
            r5 = r9
        L_0x0330:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x036e
        L_0x0339:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0361 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0361 }
            r0.<init>(r3)     // Catch:{ all -> 0x0361 }
            throw r0     // Catch:{ all -> 0x0361 }
        L_0x0343:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0361 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0361 }
            r0.<init>(r3)     // Catch:{ all -> 0x0361 }
            throw r0     // Catch:{ all -> 0x0361 }
        L_0x034d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0361 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0361 }
            r0.<init>(r3)     // Catch:{ all -> 0x0361 }
            throw r0     // Catch:{ all -> 0x0361 }
        L_0x0357:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0361 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0361 }
            r0.<init>(r3)     // Catch:{ all -> 0x0361 }
            throw r0     // Catch:{ all -> 0x0361 }
        L_0x0361:
            r0 = move-exception
            r3 = r5
            r5 = r9
        L_0x0364:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x036e:
            r10 = r3
            r9 = r5
            goto L_0x0376
        L_0x0371:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            r10 = r5
        L_0x0376:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r3 = r1.this$0
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x042c
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r4)
            r0.<init>(r2)
            r3.emitEvent(r0)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x038e:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r3 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0427
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r3 = r1.this$0
            com.carrefour.fid.android.domain.interactors.category.b r3 = r3.f101885j
            r1.L$0 = r9
            r1.L$1 = r0
            r4 = 7
            r1.label = r4
            java.lang.Object r3 = r3.m172965invokeIoAF18A(r1)
            if (r3 != r2) goto L_0x03aa
            return r2
        L_0x03aa:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r4 = r1.this$0
            boolean r7 = kotlin.Result.m38710j(r3)
            if (r7 == 0) goto L_0x0427
            r7 = r3
            com.carrefour.fid.android.domain.models.category.a r7 = (com.carrefour.fid.android.domain.models.category.C37992a) r7
            com.carrefour.fid.android.domain.models.category.PromiseType r10 = r7.mo117312f()
            com.carrefour.fid.android.domain.models.category.PromiseType r11 = com.carrefour.fid.android.domain.models.category.PromiseType.Standard
            if (r10 != r11) goto L_0x0427
            com.carrefour.fid.android.domain.interactors.service.f r10 = r4.f101886k
            java.lang.String r7 = r7.mo117310e()
            r1.L$0 = r9
            r1.L$1 = r0
            r1.L$2 = r3
            r1.L$3 = r4
            r11 = 8
            r1.label = r11
            java.lang.Object r5 = r10.m173004invokeCkRE9Mk(r7, r5, r1)
            if (r5 != r2) goto L_0x03d8
            return r2
        L_0x03d8:
            r17 = r5
            r5 = r0
            r0 = r17
            r18 = r4
            r4 = r3
            r3 = r18
        L_0x03e2:
            boolean r7 = kotlin.Result.m38710j(r0)
            if (r7 == 0) goto L_0x040d
            r7 = r0
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r7
            com.carrefour.fid.android.domain.interactors.service.v r10 = r3.f101888m
            com.carrefour.fid.android.domain.interactors.service.v$a r11 = new com.carrefour.fid.android.domain.interactors.service.v$a
            r11.<init>(r7)
            r1.L$0 = r9
            r1.L$1 = r5
            r1.L$2 = r4
            r1.L$3 = r3
            r1.L$4 = r0
            r4 = 9
            r1.label = r4
            java.lang.Object r4 = r10.m172966invokegIAlus(r11, r1)
            if (r4 != r2) goto L_0x0409
            return r2
        L_0x0409:
            r4 = r5
            r5 = r9
        L_0x040b:
            r9 = r5
            r5 = r4
        L_0x040d:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r0)
            if (r0 == 0) goto L_0x0425
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r4 = "Missing or wrong standard promise"
            r2.<init>(r4)
            r0.<init>(r2)
            r3.emitEvent(r0)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0425:
            r10 = r5
            goto L_0x042c
        L_0x0427:
            r10 = r0
            goto L_0x042c
        L_0x0429:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x042c:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = r1.this$0
            com.carrefour.fid.android.domain.interactors.basket.e r0 = r0.f101881f
            com.carrefour.fid.android.domain.interactors.basket.e$a r3 = new com.carrefour.fid.android.domain.interactors.basket.e$a
            java.lang.String r4 = r10.mo119508t()
            r3.<init>(r4, r9, r8)
            r1.L$0 = r10
            r1.L$1 = r8
            r1.L$2 = r8
            r1.L$3 = r8
            r1.L$4 = r8
            r4 = 10
            r1.label = r4
            java.lang.Object r0 = r0.m172966invokegIAlus(r3, r1)
            if (r0 != r2) goto L_0x0450
            return r2
        L_0x0450:
            r3 = r0
            r4 = r10
        L_0x0452:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = r1.this$0
            boolean r5 = kotlin.Result.m38710j(r3)
            if (r5 == 0) goto L_0x04d0
            r5 = r3
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            com.carrefour.fid.android.checkout.presentation.ui.slot.d r7 = r0.f101893r
            boolean r7 = r7.mo131623s()
            if (r7 != 0) goto L_0x049f
            boolean r6 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156172c(r5)
            if (r6 == 0) goto L_0x047b
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$SlotUnavailableError r5 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$SlotUnavailableError
            r5.<init>(r4)
            r2.<init>(r5)
            r0.emitEvent(r2)
            goto L_0x04d0
        L_0x047b:
            boolean r5 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156173d(r5)
            if (r5 == 0) goto L_0x048f
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.shared.io.BasketSlotBookThrowable r4 = new com.carrefour.fid.android.shared.io.BasketSlotBookThrowable
            r4.<init>(r8)
            r2.<init>(r4)
            r0.emitEvent(r2)
            goto L_0x04d0
        L_0x048f:
            r1.L$0 = r3
            r5 = 11
            r1.label = r5
            java.lang.Object r0 = r0.mo131755V0(r4, r1)
            if (r0 != r2) goto L_0x049c
            return r2
        L_0x049c:
            r0 = r3
        L_0x049d:
            r3 = r0
            goto L_0x04d0
        L_0x049f:
            boolean r7 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156173d(r5)
            if (r7 == 0) goto L_0x04b3
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.shared.io.BasketSlotBookThrowable r4 = new com.carrefour.fid.android.shared.io.BasketSlotBookThrowable
            r4.<init>(r8)
            r2.<init>(r4)
            r0.emitEvent(r2)
            goto L_0x04d0
        L_0x04b3:
            r1.L$0 = r4
            r1.L$1 = r3
            r1.L$2 = r0
            r1.L$3 = r5
            r7 = 12
            r1.label = r7
            java.lang.Object r6 = r0.mo131753T0(r5, r6, r1)
            if (r6 != r2) goto L_0x04c6
            return r2
        L_0x04c6:
            r2 = r0
            r0 = r5
        L_0x04c8:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a r5 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$a
            r5.<init>(r4, r0)
            r2.emitEvent(r5)
        L_0x04d0:
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel r0 = r1.this$0
            java.lang.Throwable r2 = kotlin.Result.m38705e(r3)
            if (r2 == 0) goto L_0x0508
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r3 = r2.getMessage()
            java.lang.String r10 = ""
            if (r3 != 0) goto L_0x04e4
            r5 = r10
            goto L_0x04e5
        L_0x04e4:
            r5 = r3
        L_0x04e5:
            r7 = 0
            r8 = 4
            r9 = 0
            r6 = r2
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            com.carrefour.fid.android.checkout.presentation.analytics.a r3 = r0.f101891p
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L_0x04f7
            goto L_0x04f8
        L_0x04f7:
            r10 = r2
        L_0x04f8:
            r3.mo131443e(r10)
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.a$b$b
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$BookSlotError r3 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$BookSlotError
            r3.<init>()
            r2.<init>(r3)
            r0.emitEvent(r2)
        L_0x0508:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel$validateSlot$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ServiceSlotViewModel$validateSlot$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
