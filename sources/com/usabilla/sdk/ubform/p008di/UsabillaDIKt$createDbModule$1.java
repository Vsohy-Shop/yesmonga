package com.usabilla.sdk.ubform.p008di;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.p007db.DatabaseHelper;
import com.usabilla.sdk.ubform.p007db.campaign.C9779a;
import com.usabilla.sdk.ubform.p007db.form.C9781a;
import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import com.usabilla.sdk.ubform.p007db.unsent.C9785a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/di/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt$createDbModule$1 */
public final class UsabillaDIKt$createDbModule$1 extends Lambda implements C11300l<C9822e, C11079d2> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaDIKt$createDbModule$1(Context context) {
        super(1);
        this.$context = context;
    }

    /* renamed from: a */
    public final void mo20084a(@C12579k C9822e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$module");
        final Context context = this.$context;
        C97981 r0 = new C11300l<C9818a, SQLiteDatabase>() {
            /* renamed from: a */
            public final SQLiteDatabase invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return DatabaseHelper.f26787b.mo20007b(context).getWritableDatabase();
            }
        };
        eVar.mo20153b().put(SQLiteDatabase.class, new C9824g(r0));
        C97992 r02 = C97992.f26857f;
        eVar.mo20153b().put(C9783a.class, new C9824g(r02));
        C98003 r03 = C98003.f26858f;
        eVar.mo20153b().put(C9781a.class, new C9824g(r03));
        C98014 r04 = C98014.f26859f;
        eVar.mo20153b().put(C9779a.class, new C9824g(r04));
        C98025 r05 = C98025.f26860f;
        eVar.mo20153b().put(C9785a.class, new C9824g(r05));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20084a((C9822e) obj);
        return C11079d2.f28267a;
    }
}
