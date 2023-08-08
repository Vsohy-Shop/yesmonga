package com.usabilla.sdk.ubform.p007db.campaign;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.net.parser.C9876c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$updateTargetingOptions$1 */
public final class CampaignDaoImpl$updateTargetingOptions$1 extends Lambda implements C11300l<SQLiteDatabase, Integer> {
    final /* synthetic */ List<C9831a> $campaigns;
    final /* synthetic */ CampaignDaoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignDaoImpl$updateTargetingOptions$1(List<C9831a> list, CampaignDaoImpl campaignDaoImpl) {
        super(1);
        this.$campaigns = list;
        this.this$0 = campaignDaoImpl;
    }

    /* renamed from: a */
    public final int mo20035a(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "database");
        ArrayList<C9831a> arrayList = new ArrayList<>();
        Iterator it = this.$campaigns.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C9831a) next).mo20216t() == null) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        CampaignDaoImpl campaignDaoImpl = this.this$0;
        int i = 0;
        for (C9831a aVar : arrayList) {
            ContentValues contentValues = new ContentValues();
            C9876c g = campaignDaoImpl.f26793b;
            TargetingOptionsModel t = aVar.mo20216t();
            Intrinsics.checkNotNull(t);
            contentValues.put(CampaignTable.f26814n, g.mo20341c(t).toString());
            i += sQLiteDatabase.update("campaigns", contentValues, "id = ? ", new String[]{aVar.mo20210n()});
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo20035a((SQLiteDatabase) obj));
    }
}
