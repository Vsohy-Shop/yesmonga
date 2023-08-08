package androidx.work.impl;

import android.content.ContentValues;
import androidx.room.C20353p1;
import androidx.room.migration.C20342a;
import androidx.sqlite.p031db.C20466f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C20353p1(fromColumnName = "period_start_time", tableName = "WorkSpec", toColumnName = "last_enqueue_time")
/* renamed from: androidx.work.impl.b */
public final class C21102b implements C20342a {
    /* renamed from: a */
    public void mo61121a(@C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "db");
        fVar.mo60782s0(C21101a0.f54474m);
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        fVar.mo60760V2("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
