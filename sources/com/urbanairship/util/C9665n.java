package com.urbanairship.util;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.C36059m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.n */
public abstract class C9665n {

    /* renamed from: c */
    public static final String f26480c = "com.urbanairship.databases";

    /* renamed from: d */
    public static final int f26481d = 3;

    /* renamed from: a */
    public final SQLiteOpenHelper f26482a;

    /* renamed from: b */
    public final String f26483b;

    /* renamed from: com.urbanairship.util.n$a */
    public class C9666a extends SQLiteOpenHelper {
        public C9666a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        public void onConfigure(@C0359n0 SQLiteDatabase sQLiteDatabase) {
            super.onConfigure(sQLiteDatabase);
            C9665n.this.mo17671j(sQLiteDatabase);
        }

        public void onCreate(@C0359n0 SQLiteDatabase sQLiteDatabase) {
            C9665n.this.mo17672k(sQLiteDatabase);
        }

        public void onDowngrade(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C36059m.m148406b("Downgrading database %s from version %s to %s", sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2));
            C9665n.this.mo17673l(sQLiteDatabase, i, i2);
        }

        public void onOpen(@C0359n0 SQLiteDatabase sQLiteDatabase) {
            super.onOpen(sQLiteDatabase);
            C9665n.this.mo19637m(sQLiteDatabase);
        }

        public void onUpgrade(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C36059m.m148406b("Upgrading database %s from version %s to %s", sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2));
            C9665n.this.mo17674n(sQLiteDatabase, i, i2);
        }
    }

    public C9665n(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2, int i) {
        String i2 = m36198i(context, str, str2);
        this.f26483b = i2;
        this.f26482a = new C9666a(context, i2, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: i */
    public static String m36198i(@C0359n0 Context context, String str, String str2) {
        String str3 = str + C32920e.f79928l + str2;
        File file = new File(C17318d.m79730m(context), "com.urbanairship.databases");
        if (!file.exists() && !file.mkdirs()) {
            C36059m.m148409e("Failed to create UA no backup directory.", new Object[0]);
        }
        File file2 = new File(file, str3);
        File[] fileArr = {context.getDatabasePath(str3), new File(file, str2), context.getDatabasePath(str2)};
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        for (int i = 0; i < 3; i++) {
            File file3 = fileArr[i];
            if (file3.exists()) {
                if (!file3.renameTo(file2)) {
                    return file3.getAbsolutePath();
                }
                File file4 = new File(file3.getAbsolutePath() + "-journal");
                if (file4.exists()) {
                    if (!file4.renameTo(new File(file2.getAbsolutePath() + "-journal"))) {
                        C36059m.m148409e("Failed to move the journal file: " + file4, new Object[0]);
                    }
                }
            }
        }
        return file2.getAbsolutePath();
    }

    @C0359n0
    /* renamed from: a */
    public List<ContentValues> mo19629a(@C0359n0 String str, @C0359n0 ContentValues[] contentValuesArr) {
        SQLiteDatabase g = mo19635g();
        ArrayList arrayList = new ArrayList();
        if (g == null) {
            return arrayList;
        }
        g.beginTransaction();
        int length = contentValuesArr.length;
        int i = 0;
        while (i < length) {
            try {
                g.replaceOrThrow(str, (String) null, contentValuesArr[i]);
                i++;
            } catch (Exception e) {
                C36059m.m148411g(e, "Unable to insert into database", new Object[0]);
                g.endTransaction();
                return Collections.emptyList();
            }
        }
        g.setTransactionSuccessful();
        g.endTransaction();
        return arrayList;
    }

    /* renamed from: b */
    public void mo19630b() {
        try {
            this.f26482a.close();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to close the database.", new Object[0]);
        }
    }

    /* renamed from: c */
    public boolean mo19631c(@C0359n0 Context context) {
        return context.getDatabasePath(this.f26483b).exists();
    }

    /* renamed from: d */
    public int mo19632d(@C0359n0 String str, @C0363p0 String str2, @C0363p0 String[] strArr) {
        if (str2 == null) {
            str2 = "1";
        }
        SQLiteDatabase g = mo19635g();
        if (g == null) {
            return -1;
        }
        int i = 0;
        while (i < 3) {
            try {
                return g.delete(str, str2, strArr);
            } catch (Exception e) {
                C36059m.m148411g(e, "Unable to delete item from a database", new Object[0]);
                i++;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public boolean mo19633e(@C0359n0 Context context) {
        try {
            return context.getDatabasePath(this.f26483b).delete();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to delete database: " + this.f26483b, new Object[0]);
            return false;
        }
    }

    @C0363p0
    /* renamed from: f */
    public SQLiteDatabase mo19634f() {
        int i = 0;
        while (i < 3) {
            try {
                return this.f26482a.getReadableDatabase();
            } catch (SQLiteException e) {
                SystemClock.sleep(100);
                C36059m.m148411g(e, "DataManager - Error opening readable database. Retrying...", new Object[0]);
                i++;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: g */
    public SQLiteDatabase mo19635g() {
        int i = 0;
        while (i < 3) {
            try {
                return this.f26482a.getWritableDatabase();
            } catch (SQLiteException e) {
                SystemClock.sleep(100);
                C36059m.m148411g(e, "DataManager - Error opening writable database. Retrying...", new Object[0]);
                i++;
            }
        }
        return null;
    }

    /* renamed from: h */
    public long mo19636h(@C0359n0 String str, @C0363p0 ContentValues contentValues) {
        if (mo19635g() == null) {
            return -1;
        }
        int i = 0;
        while (i < 3) {
            try {
                return mo19635g().replaceOrThrow(str, (String) null, contentValues);
            } catch (Exception e) {
                C36059m.m148411g(e, "Unable to insert into database", new Object[0]);
                i++;
            }
        }
        return -1;
    }

    @TargetApi(16)
    /* renamed from: j */
    public void mo17671j(@C0359n0 SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: k */
    public abstract void mo17672k(@C0359n0 SQLiteDatabase sQLiteDatabase);

    /* renamed from: l */
    public void mo17673l(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Unable to downgrade database");
    }

    /* renamed from: m */
    public void mo19637m(@C0359n0 SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: n */
    public void mo17674n(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C36059m.m148406b("onUpgrade not implemented yet.", new Object[0]);
    }

    @C0363p0
    /* renamed from: o */
    public Cursor mo19638o(@C0359n0 String str, @C0363p0 String[] strArr, @C0363p0 String str2, @C0363p0 String[] strArr2, @C0363p0 String str3) {
        return mo19639p(str, strArr, str2, strArr2, str3, (String) null);
    }

    @C0363p0
    /* renamed from: p */
    public Cursor mo19639p(@C0359n0 String str, @C0363p0 String[] strArr, @C0363p0 String str2, @C0363p0 String[] strArr2, @C0363p0 String str3, @C0363p0 String str4) {
        SQLiteDatabase f = mo19634f();
        if (f == null) {
            return null;
        }
        int i = 0;
        while (i < 3) {
            try {
                return f.query(str, strArr, str2, strArr2, (String) null, (String) null, str3, str4);
            } catch (SQLException e) {
                C36059m.m148411g(e, "Query Failed", new Object[0]);
                i++;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: q */
    public Cursor mo19640q(@C0359n0 String str, @C0363p0 String[] strArr) {
        SQLiteDatabase f = mo19634f();
        if (f == null) {
            return null;
        }
        int i = 0;
        while (i < 3) {
            try {
                return f.rawQuery(str, strArr);
            } catch (SQLException e) {
                C36059m.m148411g(e, "Query failed", new Object[0]);
                i++;
            }
        }
        return null;
    }

    /* renamed from: r */
    public int mo19641r(@C0359n0 String str, @C0363p0 ContentValues contentValues, @C0363p0 String str2, @C0363p0 String[] strArr) {
        SQLiteDatabase g = mo19635g();
        if (g == null) {
            return -1;
        }
        int i = 0;
        while (i < 3) {
            try {
                return g.update(str, contentValues, str2, strArr);
            } catch (SQLException e) {
                C36059m.m148411g(e, "Update Failed", new Object[0]);
                i++;
            }
        }
        return -1;
    }
}
