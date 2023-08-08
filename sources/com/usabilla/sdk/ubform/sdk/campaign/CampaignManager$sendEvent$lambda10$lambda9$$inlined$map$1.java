package com.usabilla.sdk.ubform.sdk.campaign;

import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.EventResult;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1  reason: invalid class name */
public final class CampaignManager$sendEvent$lambda10$lambda9$$inlined$map$1 implements C11907e<EventResult> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f27358a;

    /* renamed from: b */
    public final /* synthetic */ C9831a f27359b;

    /* renamed from: c */
    public final /* synthetic */ boolean f27360c;

    /* renamed from: d */
    public final /* synthetic */ UbInternalTheme f27361d;

    public CampaignManager$sendEvent$lambda10$lambda9$$inlined$map$1(C11907e eVar, C9831a aVar, boolean z, UbInternalTheme ubInternalTheme) {
        this.f27358a = eVar;
        this.f27359b = aVar;
        this.f27360c = z;
        this.f27361d = ubInternalTheme;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f27358a.collect(new C11908f<FormModel>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r30, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r31) {
                /*
                    r29 = this;
                    r0 = r29
                    r1 = r31
                    boolean r2 = r1 instanceof com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda10$lambda9$$inlined$map$1.C99322.C99331
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1$2$1 r2 = (com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda10$lambda9$$inlined$map$1.C99322.C99331) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1$2$1 r2 = new com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1$2$1
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r4 = r2.label
                    r5 = 1
                    if (r4 == 0) goto L_0x0035
                    if (r4 != r5) goto L_0x002d
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x0092
                L_0x002d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0035:
                    kotlin.C11661u0.m45747n(r1)
                    kotlinx.coroutines.flow.f r1 = r3
                    r6 = r30
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r6 = (com.usabilla.sdk.ubform.sdk.form.model.FormModel) r6
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1 r4 = r2
                    com.usabilla.sdk.ubform.eventengine.a r4 = r4.f27359b
                    com.usabilla.sdk.ubform.sdk.banner.BannerPosition r11 = r4.mo20208l()
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
                    r23 = 0
                    r24 = 0
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1 r4 = r2
                    boolean r4 = r4.f27360c
                    r25 = r4
                    r26 = 0
                    r27 = 786415(0xbffef, float:1.102002E-39)
                    r28 = 0
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r4 = com.usabilla.sdk.ubform.sdk.form.model.FormModel.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1 r6 = r2
                    com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme r6 = r6.f27361d
                    if (r6 != 0) goto L_0x0078
                    goto L_0x007c
                L_0x0078:
                    com.usabilla.sdk.ubform.sdk.form.model.FormModel r4 = r4.mergeTheme(r6)
                L_0x007c:
                    com.usabilla.sdk.ubform.eventengine.EventResult r6 = new com.usabilla.sdk.ubform.eventengine.EventResult
                    com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda-10$lambda-9$$inlined$map$1 r7 = r2
                    com.usabilla.sdk.ubform.eventengine.a r7 = r7.f27359b
                    java.lang.String r7 = r7.mo20210n()
                    r6.<init>(r4, r7)
                    r2.label = r5
                    java.lang.Object r1 = r1.emit(r6, r2)
                    if (r1 != r3) goto L_0x0092
                    return r3
                L_0x0092:
                    kotlin.d2 r1 = kotlin.C11079d2.f28267a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.campaign.CampaignManager$sendEvent$lambda10$lambda9$$inlined$map$1.C99322.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
