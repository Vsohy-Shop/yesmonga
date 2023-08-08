package com.usabilla.sdk.ubform.p007db.campaign;

import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$update$1 */
public final class CampaignDaoImpl$update$1 extends Lambda implements C11300l<SQLiteDatabase, Integer> {
    final /* synthetic */ List<C9831a> $campaigns;
    final /* synthetic */ CampaignDaoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignDaoImpl$update$1(CampaignDaoImpl campaignDaoImpl, List<C9831a> list) {
        super(1);
        this.this$0 = campaignDaoImpl;
        this.$campaigns = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20032a(@org.jetbrains.annotations.C12579k android.database.sqlite.SQLiteDatabase r9) {
        /*
            r8 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "SELECT * FROM campaigns"
            r1 = 0
            android.database.Cursor r0 = r9.rawQuery(r0, r1)
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$update$1$campaignsDb$1$1 r2 = new com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$update$1$campaignsDb$1$1     // Catch:{ all -> 0x00ab }
            r2.<init>(r0)     // Catch:{ all -> 0x00ab }
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt__SequencesKt.m44596m(r2)     // Catch:{ all -> 0x00ab }
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$update$1$campaignsDb$1$2 r3 = com.usabilla.sdk.ubform.p007db.campaign.CampaignDaoImpl$update$1$campaignsDb$1$2.f26803f     // Catch:{ all -> 0x00ab }
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt___SequencesKt.m44761k1(r2, r3)     // Catch:{ all -> 0x00ab }
            java.util.List r2 = kotlin.sequences.SequencesKt___SequencesKt.m44731c3(r2)     // Catch:{ all -> 0x00ab }
            kotlin.p010io.C11133b.m42950a(r0, r1)
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl r0 = r8.this$0
            java.util.List<com.usabilla.sdk.ubform.eventengine.a> r1 = r8.$campaigns
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r1, r4)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0037:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x004b
            java.lang.Object r5 = r1.next()
            com.usabilla.sdk.ubform.eventengine.a r5 = (com.usabilla.sdk.ubform.eventengine.C9831a) r5
            java.lang.String r5 = r5.mo20210n()
            r3.add(r5)
            goto L_0x0037
        L_0x004b:
            r1 = r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.C10978t.m41495Y(r1, r4)
            r5.<init>(r6)
            java.util.Iterator r6 = r1.iterator()
        L_0x005b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0071
            java.lang.Object r7 = r6.next()
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r7 = r7.mo21849e()
            java.lang.String r7 = (java.lang.String) r7
            r5.add(r7)
            goto L_0x005b
        L_0x0071:
            int r0 = r0.mo20026l(r9, r3, r5)
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl r3 = r8.this$0
            java.util.List<com.usabilla.sdk.ubform.eventengine.a> r5 = r8.$campaigns
            int r2 = r3.mo20027m(r9, r5, r2)
            com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl r3 = r8.this$0
            java.util.List<com.usabilla.sdk.ubform.eventengine.a> r5 = r8.$campaigns
            java.util.ArrayList r6 = new java.util.ArrayList
            int r4 = kotlin.collections.C10978t.m41495Y(r1, r4)
            r6.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x008e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r4 = r4.mo21849e()
            java.lang.String r4 = (java.lang.String) r4
            r6.add(r4)
            goto L_0x008e
        L_0x00a4:
            int r9 = r3.mo20025k(r9, r5, r6)
            int r0 = r0 + r9
            int r0 = r0 + r2
            return r0
        L_0x00ab:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.p007db.campaign.CampaignDaoImpl$update$1.mo20032a(android.database.sqlite.SQLiteDatabase):int");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo20032a((SQLiteDatabase) obj));
    }
}
