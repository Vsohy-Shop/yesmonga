package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.C40298u0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.r0 */
public final /* synthetic */ class C40292r0 implements C40298u0.C40299a {
    /* renamed from: a */
    public final void mo132966a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
