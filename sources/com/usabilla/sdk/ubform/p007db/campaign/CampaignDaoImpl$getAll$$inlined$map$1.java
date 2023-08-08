package com.usabilla.sdk.ubform.p007db.campaign;

import android.database.Cursor;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$$inlined$map$1 */
public final class CampaignDaoImpl$getAll$$inlined$map$1 implements C11907e<List<? extends C9831a>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f26794a;

    /* renamed from: b */
    public final /* synthetic */ CampaignDaoImpl f26795b;

    public CampaignDaoImpl$getAll$$inlined$map$1(C11907e eVar, CampaignDaoImpl campaignDaoImpl) {
        this.f26794a = eVar;
        this.f26795b = campaignDaoImpl;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f26794a.collect(new C11908f<Cursor>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r20) {
                /*
                    r18 = this;
                    r1 = r18
                    r0 = r20
                    boolean r2 = r0 instanceof com.usabilla.sdk.ubform.p007db.campaign.CampaignDaoImpl$getAll$$inlined$map$1.C97742.C97751
                    if (r2 == 0) goto L_0x0017
                    r2 = r0
                    com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$$inlined$map$1$2$1 r2 = (com.usabilla.sdk.ubform.p007db.campaign.CampaignDaoImpl$getAll$$inlined$map$1.C97742.C97751) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$$inlined$map$1$2$1 r2 = new com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$$inlined$map$1$2$1
                    r2.<init>(r1, r0)
                L_0x001c:
                    java.lang.Object r0 = r2.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r4 = r2.label
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    kotlin.C11661u0.m45747n(r0)
                    goto L_0x0101
                L_0x002e:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x0036:
                    kotlin.C11661u0.m45747n(r0)
                    kotlinx.coroutines.flow.f r0 = r3
                    r4 = r19
                    android.database.Cursor r4 = (android.database.Cursor) r4
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    int r7 = r4.getCount()     // Catch:{ all -> 0x0104 }
                    if (r7 == 0) goto L_0x00ed
                L_0x004a:
                    boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x0104 }
                    if (r7 == 0) goto L_0x00ed
                    com.usabilla.sdk.ubform.eventengine.a r7 = new com.usabilla.sdk.ubform.eventengine.a     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "id"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r9 = r4.getString(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "it.getString(it.getColumnIndex(CampaignTable.COLUMN_CAMPAIGN_ID))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "status"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r10 = r4.getString(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "it.getString(it.getColumnIndex(CampaignTable.COLUMN_CAMPAIGN_STATUS))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "timesShown"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    int r11 = r4.getInt(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "targetingId"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r12 = r4.getString(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "it.getString(it.getColumnIndex(CampaignTable.COLUMN_TARGETING_ID))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "formId"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r13 = r4.getString(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "it.getString(it.getColumnIndex(CampaignTable.COLUMN_FORM_ID))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "createdAt"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r14 = r4.getString(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "it.getString(it.getColumnIndex(CampaignTable.COLUMN_CREATED_AT))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "lastModified"
                    int r8 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r15 = r4.getString(r8)     // Catch:{ all -> 0x0104 }
                    java.lang.String r8 = "it.getString(it.getColumnIndex(CampaignTable.COLUMN_LAST_MODIFIED))"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r8)     // Catch:{ all -> 0x0104 }
                    com.usabilla.sdk.ubform.sdk.banner.BannerPosition$a r8 = com.usabilla.sdk.ubform.sdk.banner.BannerPosition.f27325a     // Catch:{ all -> 0x0104 }
                    java.lang.String r5 = "bannerPosition"
                    int r5 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0104 }
                    java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0104 }
                    com.usabilla.sdk.ubform.sdk.banner.BannerPosition r16 = r8.mo20708a(r5)     // Catch:{ all -> 0x0104 }
                    com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$getAll$$inlined$map$1 r5 = r2     // Catch:{ all -> 0x0104 }
                    com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl r5 = r5.f26795b     // Catch:{ all -> 0x0104 }
                    com.usabilla.sdk.ubform.net.parser.c r5 = r5.f26793b     // Catch:{ all -> 0x0104 }
                    org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x0104 }
                    java.lang.String r1 = "targetingRuleByteArray"
                    int r1 = r4.getColumnIndex(r1)     // Catch:{ all -> 0x0104 }
                    java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x0104 }
                    r8.<init>(r1)     // Catch:{ all -> 0x0104 }
                    com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel r17 = r5.mo20320a(r8)     // Catch:{ all -> 0x0104 }
                    r8 = r7
                    r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0104 }
                    r6.add(r7)     // Catch:{ all -> 0x0104 }
                    r1 = r18
                    r5 = 1
                    goto L_0x004a
                L_0x00ed:
                    kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0104 }
                    r1 = 0
                    kotlin.p010io.C11133b.m42950a(r4, r1)
                    java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40557Q5(r6)
                    r4 = 1
                    r2.label = r4
                    java.lang.Object r0 = r0.emit(r1, r2)
                    if (r0 != r3) goto L_0x0101
                    return r3
                L_0x0101:
                    kotlin.d2 r0 = kotlin.C11079d2.f28267a
                    return r0
                L_0x0104:
                    r0 = move-exception
                    r1 = r0
                    throw r1     // Catch:{ all -> 0x0107 }
                L_0x0107:
                    r0 = move-exception
                    r2 = r0
                    kotlin.p010io.C11133b.m42950a(r4, r1)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.p007db.campaign.CampaignDaoImpl$getAll$$inlined$map$1.C97742.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
