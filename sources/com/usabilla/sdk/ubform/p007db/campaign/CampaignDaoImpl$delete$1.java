package com.usabilla.sdk.ubform.p007db.campaign;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$delete$1 */
public final class CampaignDaoImpl$delete$1 extends Lambda implements C11300l<SQLiteDatabase, Integer> {
    final /* synthetic */ List<String> $ids;
    final /* synthetic */ CampaignDaoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignDaoImpl$delete$1(List<String> list, CampaignDaoImpl campaignDaoImpl) {
        super(1);
        this.$ids = list;
        this.this$0 = campaignDaoImpl;
    }

    /* renamed from: a */
    public final int mo20028a(@C12579k SQLiteDatabase sQLiteDatabase) {
        Object obj;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "database");
        ArrayList arrayList = new ArrayList();
        for (Object next : this.$ids) {
            String str = (String) next;
            try {
                Result.C10852a aVar = Result.f28060a;
                obj = Result.m38702b(Integer.valueOf(sQLiteDatabase.delete("campaigns", "id = ?", new String[]{str})));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            if (Result.m38710j(obj)) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo20028a((SQLiteDatabase) obj));
    }
}
