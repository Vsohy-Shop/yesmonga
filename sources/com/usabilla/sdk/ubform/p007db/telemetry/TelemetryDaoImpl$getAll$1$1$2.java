package com.usabilla.sdk.ubform.p007db.telemetry;

import android.database.Cursor;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/Cursor;", "cursor", "", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$getAll$1$1$2 */
public final class TelemetryDaoImpl$getAll$1$1$2 extends Lambda implements C11300l<Cursor, String> {

    /* renamed from: f */
    public static final TelemetryDaoImpl$getAll$1$1$2 f26831f = new TelemetryDaoImpl$getAll$1$1$2();

    public TelemetryDaoImpl$getAll$1$1$2() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(@C12579k Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        return cursor.getString(0);
    }
}
