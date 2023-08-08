package com.urbanairship.remotedata;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9665n;
import com.urbanairship.util.C9669o0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.remotedata.n */
public class C9628n extends C9665n {

    /* renamed from: e */
    public static final String f26375e = "payloads";

    /* renamed from: f */
    public static final String f26376f = "id";

    /* renamed from: g */
    public static final String f26377g = "type";

    /* renamed from: h */
    public static final String f26378h = "time";

    /* renamed from: i */
    public static final String f26379i = "data";

    /* renamed from: j */
    public static final String f26380j = "metadata";

    /* renamed from: k */
    public static final int f26381k = 2;

    public C9628n(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        super(context, str, str2, 2);
    }

    /* renamed from: k */
    public void mo17672k(@C0359n0 SQLiteDatabase sQLiteDatabase) {
        C36059m.m148406b("Creating database", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS payloads (id INTEGER PRIMARY KEY AUTOINCREMENT,type TEXT,time INTEGER,data TEXT,metadata TEXT);");
    }

    /* renamed from: l */
    public void mo17673l(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.mo17673l(sQLiteDatabase, i, i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS payloads");
        mo17672k(sQLiteDatabase);
    }

    /* renamed from: n */
    public void mo17674n(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 1) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS payloads");
            mo17672k(sQLiteDatabase);
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE payloads ADD COLUMN metadata TEXT;");
    }

    /* renamed from: s */
    public boolean mo19576s() {
        boolean z;
        if (mo19632d(f26375e, (String) null, (String[]) null) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C36059m.m148409e("RemoteDataStore - failed to delete payloads", new Object[0]);
        }
        return z;
    }

    @C0359n0
    /* renamed from: t */
    public final Set<C9625m> mo19577t(@C0359n0 Cursor cursor) {
        cursor.moveToFirst();
        HashSet hashSet = new HashSet();
        while (!cursor.isAfterLast()) {
            try {
                hashSet.add(C9625m.m36054f().mo19575i(cursor.getString(cursor.getColumnIndex("type"))).mo19574h(cursor.getLong(cursor.getColumnIndex("time"))).mo19573g(JsonValue.m34960C(cursor.getString(cursor.getColumnIndex("metadata"))).mo18749A()).mo19572f(JsonValue.m34960C(cursor.getString(cursor.getColumnIndex("data"))).mo18749A()).mo19571e());
            } catch (JsonException | IllegalArgumentException e) {
                C36059m.m148411g(e, "RemoteDataStore - failed to retrieve payload", new Object[0]);
            }
            cursor.moveToNext();
        }
        return hashSet;
    }

    @C0359n0
    /* renamed from: u */
    public Set<C9625m> mo19578u() {
        return mo19579v((Collection<String>) null);
    }

    @C0359n0
    /* renamed from: v */
    public Set<C9625m> mo19579v(@C0363p0 Collection<String> collection) {
        Cursor o;
        Cursor cursor = null;
        if (collection == null) {
            try {
                o = mo19638o(f26375e, (String[]) null, (String) null, (String[]) null, (String) null);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            o = mo19638o(f26375e, (String[]) null, "type IN ( " + C9669o0.m36228i("?", collection.size(), ", ") + " )", (String[]) collection.toArray(new String[0]), (String) null);
        }
        cursor = o;
        if (cursor == null) {
            Set<C9625m> emptySet = Collections.emptySet();
            if (cursor != null) {
                cursor.close();
            }
            return emptySet;
        }
        Set<C9625m> t = mo19577t(cursor);
        cursor.close();
        return t;
    }

    /* renamed from: w */
    public boolean mo19580w(@C0359n0 Set<C9625m> set) {
        if (set.isEmpty()) {
            return true;
        }
        SQLiteDatabase g = mo19635g();
        if (g == null) {
            C36059m.m148409e("RemoteDataStore - Unable to save remote data payloads.", new Object[0]);
            return false;
        }
        try {
            g.beginTransaction();
            for (C9625m next : set) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("type", next.mo19567e());
                contentValues.put("time", Long.valueOf(next.mo19566d()));
                contentValues.put("data", next.mo19564b().toString());
                contentValues.put("metadata", next.mo19565c().toString());
                try {
                    if (g.insert(f26375e, (String) null, contentValues) == -1) {
                        g.endTransaction();
                        return false;
                    }
                } catch (SQLException e) {
                    C36059m.m148411g(e, "RemoteDataStore - Unable to save remote data payload.", new Object[0]);
                }
            }
            g.setTransactionSuccessful();
            g.endTransaction();
            return true;
        } catch (SQLException e2) {
            C36059m.m148411g(e2, "RemoteDataStore - Unable to save remote data payloads.", new Object[0]);
            return false;
        }
    }
}
