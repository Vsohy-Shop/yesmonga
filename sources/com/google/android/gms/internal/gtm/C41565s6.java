package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.gms.common.util.C40974d0;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.s6 */
public final class C41565s6 extends SQLiteOpenHelper {

    /* renamed from: a */
    public boolean f104943a;

    /* renamed from: b */
    public long f104944b = 0;

    /* renamed from: c */
    public final /* synthetic */ C41589t6 f104945c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41565s6(C41589t6 t6Var, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f104945c = t6Var;
    }

    /* renamed from: a */
    public static final boolean m168328a(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException unused) {
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

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final void m168329b(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" WHERE 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        HashSet hashSet = new HashSet();
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            rawQuery.close();
            for (String next : list) {
                if (!hashSet.remove(next)) {
                    throw new SQLiteException(String.format("Database column %s missing in table %s.", new Object[]{next, str}));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(String.format("Database has extra columns in table %s.", new Object[]{str}));
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        if (!this.f104943a || this.f104944b + 3600000 <= this.f104945c.f105004f.mo134768a()) {
            this.f104943a = true;
            this.f104944b = this.f104945c.f105004f.mo134768a();
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f104945c.f105001c.getDatabasePath(this.f104945c.f105002d).delete();
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase == null) {
                sQLiteDatabase = super.getWritableDatabase();
            }
            this.f104943a = false;
            return sQLiteDatabase;
        }
        throw new SQLiteException("Database creation failed");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str;
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
            String valueOf = String.valueOf(Build.VERSION.SDK);
            if (valueOf.length() != 0) {
                str = "Invalid version number: ".concat(valueOf);
            } else {
                str = new String("Invalid version number: ");
            }
            C41493p6.m168149a(str);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!m168328a("gtm_hit_unique_ids", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(C41589t6.f104995i);
        } else {
            m168329b(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList(new String[]{"hit_unique_id"}));
        }
        if (!m168328a("gtm_hits", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(C41589t6.f104996j);
        } else {
            m168329b(sQLiteDatabase, "gtm_hits", Arrays.asList(new String[]{"hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"}));
        }
        sQLiteDatabase.execSQL(C41589t6.f104997k);
        sQLiteDatabase.execSQL(C41589t6.f104998l);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
