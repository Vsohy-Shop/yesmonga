package com.usabilla.sdk.ubform.p007db.unsent;

import android.database.Cursor;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/Cursor;", "cursor", "Lcom/usabilla/sdk/ubform/net/c;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.unsent.UnsentFeedbackDaoImpl$getAll$1$1$2 */
public final class UnsentFeedbackDaoImpl$getAll$1$1$2 extends Lambda implements C11300l<Cursor, C9851c> {

    /* renamed from: f */
    public static final UnsentFeedbackDaoImpl$getAll$1$1$2 f26841f = new UnsentFeedbackDaoImpl$getAll$1$1$2();

    public UnsentFeedbackDaoImpl$getAll$1$1$2() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C9851c invoke(@C12579k Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        C9851c.C9852a aVar = C9851c.f26936g;
        String string = cursor.getString(0);
        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(0)");
        return aVar.mo20273a(string);
    }
}
