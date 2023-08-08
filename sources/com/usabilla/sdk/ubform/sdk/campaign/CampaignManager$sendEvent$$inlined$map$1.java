package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CampaignManager$sendEvent$$inlined$map$1 implements C11907e<EventResult> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27350a;

    /* renamed from: b */
    public final /* synthetic */ String f27351b;

    /* renamed from: c */
    public final /* synthetic */ ConcurrentMap f27352c;

    /* renamed from: d */
    public final /* synthetic */ CampaignManager f27353d;

    /* renamed from: e */
    public final /* synthetic */ boolean f27354e;

    /* renamed from: f */
    public final /* synthetic */ UbInternalTheme f27355f;

    public CampaignManager$sendEvent$$inlined$map$1(C11907e eVar, String str, ConcurrentMap concurrentMap, CampaignManager campaignManager, boolean z, UbInternalTheme ubInternalTheme) {
        this.f27350a = eVar;
        this.f27351b = str;
        this.f27352c = concurrentMap;
        this.f27353d = campaignManager;
        this.f27354e = z;
        this.f27355f = ubInternalTheme;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27350a.collect(new C11908f<List<? extends C9831a>>() {
            /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x0135  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x014a  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x017f A[LOOP:2: B:52:0x0179->B:54:0x017f, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x019e  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x01f9  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x023d  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x024f  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x0264 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r20, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r21
                    boolean r2 = r1 instanceof com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1.C99302.C99311
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1$2$1 r2 = (com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1.C99302.C99311) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1$2$1 r2 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1$2$1
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r4 = r2.label
                    r5 = 4
                    r6 = 2
                    r7 = 3
                    r8 = 1
                    r9 = 0
                    if (r4 == 0) goto L_0x006f
                    if (r4 == r8) goto L_0x0056
                    if (r4 == r6) goto L_0x0049
                    if (r4 == r7) goto L_0x0040
                    if (r4 != r5) goto L_0x0038
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x0265
                L_0x0038:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0040:
                    java.lang.Object r4 = r2.L$0
                    kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x024b
                L_0x0049:
                    java.lang.Object r4 = r2.L$1
                    kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.C11907e) r4
                    java.lang.Object r6 = r2.L$0
                    kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.C11908f) r6
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x0235
                L_0x0056:
                    java.lang.Object r4 = r2.L$4
                    java.util.Map r4 = (java.util.Map) r4
                    java.lang.Object r8 = r2.L$3
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Object r10 = r2.L$2
                    com.usabilla.sdk.ubform.eventengine.Event r10 = (com.usabilla.sdk.ubform.eventengine.C9827Event) r10
                    java.lang.Object r11 = r2.L$1
                    kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
                    java.lang.Object r12 = r2.L$0
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1$2 r12 = (com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1.C99302) r12
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x0131
                L_0x006f:
                    kotlin.C11661u0.m45747n(r1)
                    kotlinx.coroutines.flow.f r11 = r3
                    r1 = r20
                    java.util.List r1 = (java.util.List) r1
                    boolean r4 = r1.isEmpty()
                    if (r4 == 0) goto L_0x0081
                L_0x007e:
                    r1 = r9
                    goto L_0x0251
                L_0x0081:
                    com.usabilla.sdk.ubform.eventengine.Event r10 = new com.usabilla.sdk.ubform.eventengine.Event
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r4 = r2
                    java.lang.String r4 = r4.f27351b
                    r10.<init>(r4)
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r4 = r2
                    java.util.concurrent.ConcurrentMap r4 = r4.f27352c
                    java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
                    r12.<init>()
                    java.util.Set r4 = r4.entrySet()
                    java.util.Iterator r4 = r4.iterator()
                L_0x009b:
                    boolean r13 = r4.hasNext()
                    if (r13 == 0) goto L_0x00c6
                    java.lang.Object r13 = r4.next()
                    java.util.Map$Entry r13 = (java.util.Map.Entry) r13
                    java.lang.Object r14 = r13.getValue()
                    if (r14 == 0) goto L_0x00af
                    r14 = r8
                    goto L_0x00b0
                L_0x00af:
                    r14 = 0
                L_0x00b0:
                    java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r14)
                    boolean r14 = r14.booleanValue()
                    if (r14 == 0) goto L_0x009b
                    java.lang.Object r14 = r13.getKey()
                    java.lang.Object r13 = r13.getValue()
                    r12.put(r14, r13)
                    goto L_0x009b
                L_0x00c6:
                    com.usabilla.sdk.ubform.Logger$Companion r4 = com.usabilla.sdk.ubform.Logger.f26647a
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    java.lang.String r14 = "Event \""
                    r13.append(r14)
                    java.lang.String r14 = r10.mo20168d()
                    r13.append(r14)
                    java.lang.String r14 = "\" sent!"
                    r13.append(r14)
                    java.lang.String r13 = r13.toString()
                    r4.logInfo(r13)
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r4 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager r4 = r4.f27353d
                    com.usabilla.sdk.ubform.eventengine.b r4 = r4.f27340a
                    java.util.List r1 = r4.mo20221a(r10, r1)
                    boolean r4 = r1.isEmpty()
                    if (r4 == 0) goto L_0x00ff
                    java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                    r4 = r12
                    r12 = r0
                    goto L_0x01bc
                L_0x00ff:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r4 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager r4 = r4.f27353d
                    java.lang.String r4 = r4.f27343d
                    if (r4 != 0) goto L_0x010e
                    r8 = r1
                    r1 = r9
                    r4 = r12
                    r12 = r0
                    goto L_0x0133
                L_0x010e:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r13 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager r13 = r13.f27353d
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore r13 = r13.f27341b
                    kotlinx.coroutines.flow.e r4 = r13.mo20775k(r4)
                    r2.L$0 = r0
                    r2.L$1 = r11
                    r2.L$2 = r10
                    r2.L$3 = r1
                    r2.L$4 = r12
                    r2.label = r8
                    java.lang.Object r4 = kotlinx.coroutines.flow.C11909g.m47374I1(r4, r2)
                    if (r4 != r3) goto L_0x012d
                    return r3
                L_0x012d:
                    r8 = r1
                    r1 = r4
                    r4 = r12
                    r12 = r0
                L_0x0131:
                    java.util.List r1 = (java.util.List) r1
                L_0x0133:
                    if (r1 != 0) goto L_0x0139
                    java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
                L_0x0139:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.ArrayList r13 = new java.util.ArrayList
                    r13.<init>()
                    java.util.Iterator r1 = r1.iterator()
                L_0x0144:
                    boolean r14 = r1.hasNext()
                    if (r14 == 0) goto L_0x016a
                    java.lang.Object r14 = r1.next()
                    r15 = r14
                    com.usabilla.sdk.ubform.eventengine.a r15 = (com.usabilla.sdk.ubform.eventengine.C9831a) r15
                    java.lang.String r15 = r15.mo20211o()
                    java.lang.String r5 = "active"
                    boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r5)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x0168
                    r13.add(r14)
                L_0x0168:
                    r5 = 4
                    goto L_0x0144
                L_0x016a:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r5 = 10
                    int r5 = kotlin.collections.C10978t.m41495Y(r13, r5)
                    r1.<init>(r5)
                    java.util.Iterator r5 = r13.iterator()
                L_0x0179:
                    boolean r13 = r5.hasNext()
                    if (r13 == 0) goto L_0x018d
                    java.lang.Object r13 = r5.next()
                    com.usabilla.sdk.ubform.eventengine.a r13 = (com.usabilla.sdk.ubform.eventengine.C9831a) r13
                    java.lang.String r13 = r13.mo20210n()
                    r1.add(r13)
                    goto L_0x0179
                L_0x018d:
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0198:
                    boolean r13 = r8.hasNext()
                    if (r13 == 0) goto L_0x01bb
                    java.lang.Object r13 = r8.next()
                    r14 = r13
                    com.usabilla.sdk.ubform.eventengine.a r14 = (com.usabilla.sdk.ubform.eventengine.C9831a) r14
                    java.lang.String r14 = r14.mo20210n()
                    boolean r14 = r1.contains(r14)
                    java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r14)
                    boolean r14 = r14.booleanValue()
                    if (r14 == 0) goto L_0x0198
                    r5.add(r13)
                    goto L_0x0198
                L_0x01bb:
                    r1 = r5
                L_0x01bc:
                    com.usabilla.sdk.ubform.UsabillaInternal$a r5 = com.usabilla.sdk.ubform.UsabillaInternal.f26661z
                    com.usabilla.sdk.ubform.f r5 = com.usabilla.sdk.ubform.UsabillaInternal.C9721a.m36482b(r5, r9, r9, r7, r9)
                    com.usabilla.sdk.ubform.di.a r5 = r5.mo19845a()
                    java.lang.Class<kotlinx.coroutines.o0> r8 = kotlinx.coroutines.C12074o0.class
                    java.lang.Object r5 = r5.mo20109c(r8)
                    r13 = r5
                    kotlinx.coroutines.o0 r13 = (kotlinx.coroutines.C12074o0) r13
                    r14 = 0
                    r15 = 0
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$1$1 r5 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$1$1
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r8 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager r8 = r8.f27353d
                    r5.<init>(r8, r1, r9)
                    r17 = 3
                    r18 = 0
                    r16 = r5
                    kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r13, r14, r15, r16, r17, r18)
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r5 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager r5 = r5.f27353d
                    com.usabilla.sdk.ubform.eventengine.b r5 = r5.f27340a
                    java.util.List r1 = r5.mo20222b(r10, r1, r4)
                    java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r1)
                    com.usabilla.sdk.ubform.eventengine.a r1 = (com.usabilla.sdk.ubform.eventengine.C9831a) r1
                    if (r1 != 0) goto L_0x01f9
                    goto L_0x007e
                L_0x01f9:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r4 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager r4 = r4.f27353d
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore r4 = r4.f27341b
                    java.lang.String r5 = r1.mo20209m()
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r8 = r2
                    java.util.concurrent.ConcurrentMap r8 = r8.f27352c
                    kotlinx.coroutines.flow.e r4 = r4.mo20773i(r5, r8)
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1 r5 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1 r8 = r2
                    boolean r10 = r8.f27354e
                    com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme r8 = r8.f27355f
                    r5.<init>(r4, r1, r10, r8)
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$1$2$resultFlow$2 r1 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$1$2$resultFlow$2
                    r1.<init>(r9)
                    kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C11909g.m47494u(r5, r1)
                    r2.L$0 = r11
                    r2.L$1 = r4
                    r2.L$2 = r9
                    r2.L$3 = r9
                    r2.L$4 = r9
                    r2.label = r6
                    java.lang.Object r1 = kotlinx.coroutines.flow.C11909g.m47420Y(r4, r2)
                    if (r1 != r3) goto L_0x0234
                    return r3
                L_0x0234:
                    r6 = r11
                L_0x0235:
                    java.lang.Number r1 = (java.lang.Number) r1
                    int r1 = r1.intValue()
                    if (r1 <= 0) goto L_0x024f
                    r2.L$0 = r6
                    r2.L$1 = r9
                    r2.label = r7
                    java.lang.Object r1 = kotlinx.coroutines.flow.C11909g.m47495u0(r4, r2)
                    if (r1 != r3) goto L_0x024a
                    return r3
                L_0x024a:
                    r4 = r6
                L_0x024b:
                    com.usabilla.sdk.ubform.eventengine.EventResult r1 = (com.usabilla.sdk.ubform.eventengine.EventResult) r1
                    r6 = r4
                    goto L_0x0250
                L_0x024f:
                    r1 = r9
                L_0x0250:
                    r11 = r6
                L_0x0251:
                    r2.L$0 = r9
                    r2.L$1 = r9
                    r2.L$2 = r9
                    r2.L$3 = r9
                    r2.L$4 = r9
                    r4 = 4
                    r2.label = r4
                    java.lang.Object r1 = r11.emit(r1, r2)
                    if (r1 != r3) goto L_0x0265
                    return r3
                L_0x0265:
                    kotlin.d2 r1 = kotlin.C11079d2.f28267a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$$inlined$map$1.C99302.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
