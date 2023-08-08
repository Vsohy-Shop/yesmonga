package com.usabilla.sdk.ubform.p007db.campaign;

import android.database.sqlite.SQLiteDatabase;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$deleteAll$1 */
public final class CampaignDaoImpl$deleteAll$1 extends Lambda implements C11300l<SQLiteDatabase, Integer> {

    /* renamed from: f */
    public static final CampaignDaoImpl$deleteAll$1 f26801f = new CampaignDaoImpl$deleteAll$1();

    public CampaignDaoImpl$deleteAll$1() {
        super(1);
    }

    /* renamed from: a */
    public final int mo20029a(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "it");
        return sQLiteDatabase.delete("campaigns", (String) null, (String[]) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo20029a((SQLiteDatabase) obj));
    }
}
