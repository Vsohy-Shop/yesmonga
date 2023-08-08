package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.crashlytics.C32648f;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.d1 */
public final class C41199d1 extends SQLiteOpenHelper {

    /* renamed from: a */
    public final /* synthetic */ C41223e1 f104512a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41199d1(C41223e1 e1Var, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f104512a = e1Var;
    }

    /* renamed from: b */
    public static final Set<String> m167311b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: a */
    public final boolean mo135205a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException e) {
            this.f104512a.mo135731B("Error querying for table", str, e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.f104512a.f104557e.mo135771c(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f104512a.f104557e.mo135770b();
                this.f104512a.mo135754q("Opening the database failed, dropping the table and recreating it");
                this.f104512a.mo135734G().getDatabasePath(this.f104512a.mo135325e0()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f104512a.f104557e.mo135769a();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f104512a.mo135755r("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            C41178c4.m167248b("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        if (!mo135205a(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(C41223e1.f104553f);
        } else {
            Set<String> b = m167311b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (!b.remove(str3)) {
                    String valueOf = String.valueOf(str3);
                    if (valueOf.length() != 0) {
                        str2 = "Database hits2 is missing required column: ".concat(valueOf);
                    } else {
                        str2 = new String("Database hits2 is missing required column: ");
                    }
                    throw new SQLiteException(str2);
                }
            }
            boolean z = !b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (mo135205a(sQLiteDatabase, "properties")) {
            Set<String> b2 = m167311b(sQLiteDatabase, "properties");
            String[] strArr2 = {ActivityKt.f70308d, "cid", "tid", C32648f.f79206e, "adid", "hits_count"};
            for (int i2 = 0; i2 < 6; i2++) {
                String str4 = strArr2[i2];
                if (!b2.remove(str4)) {
                    String valueOf2 = String.valueOf(str4);
                    if (valueOf2.length() != 0) {
                        str = "Database properties is missing required column: ".concat(valueOf2);
                    } else {
                        str = new String("Database properties is missing required column: ");
                    }
                    throw new SQLiteException(str);
                }
            }
            if (!b2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
