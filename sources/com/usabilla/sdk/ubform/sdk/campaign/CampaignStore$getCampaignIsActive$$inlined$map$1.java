package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CampaignStore$getCampaignIsActive$$inlined$map$1 implements C11907e<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27388a;

    /* renamed from: b */
    public final /* synthetic */ CampaignStore f27389b;

    public CampaignStore$getCampaignIsActive$$inlined$map$1(C11907e eVar, CampaignStore campaignStore) {
        this.f27388a = eVar;
        this.f27389b = campaignStore;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27388a.collect(new C11908f<C9831a>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1.C99362.C99371
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1$2$1 r0 = (com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1.C99362.C99371) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1$2$1 r0 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x0055
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r3
                    com.usabilla.sdk.ubform.eventengine.a r5 = (com.usabilla.sdk.ubform.eventengine.C9831a) r5
                    java.lang.String r5 = r5.mo20211o()
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1 r2 = r2
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignStore r2 = r2.f27389b
                    java.lang.String r2 = r2.f27382c
                    boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r2)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0055
                    return r1
                L_0x0055:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.CampaignStore$getCampaignIsActive$$inlined$map$1.C99362.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
