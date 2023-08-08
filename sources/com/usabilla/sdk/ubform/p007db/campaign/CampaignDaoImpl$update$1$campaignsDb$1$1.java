package com.usabilla.sdk.ubform.p007db.campaign;

import android.database.Cursor;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, mo22516d2 = {"Landroid/database/Cursor;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl$update$1$campaignsDb$1$1 */
public final class CampaignDaoImpl$update$1$campaignsDb$1$1 extends Lambda implements C11289a<Cursor> {
    final /* synthetic */ Cursor $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignDaoImpl$update$1$campaignsDb$1$1(Cursor cursor) {
        super(0);
        this.$it = cursor;
    }

    @C12580l
    /* renamed from: a */
    public final Cursor invoke() {
        if (this.$it.moveToNext()) {
            return this.$it;
        }
        return null;
    }
}
