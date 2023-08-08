package com.usabilla.sdk.ubform.p007db.campaign;

import android.database.Cursor;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/Cursor;", "c", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$update$1$campaignsDb$1$2 */
public final class CampaignDaoImpl$update$1$campaignsDb$1$2 extends Lambda implements C11300l<Cursor, Pair<? extends String, ? extends String>> {

    /* renamed from: f */
    public static final CampaignDaoImpl$update$1$campaignsDb$1$2 f26803f = new CampaignDaoImpl$update$1$campaignsDb$1$2();

    public CampaignDaoImpl$update$1$campaignsDb$1$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Pair<String, String> invoke(@C12579k Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "c");
        return C11078d1.m42659a(cursor.getString(cursor.getColumnIndex("id")), cursor.getString(cursor.getColumnIndex(CampaignTable.f26812l)));
    }
}
