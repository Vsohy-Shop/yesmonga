package com.urbanairship.push.notifications;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9665n;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.push.notifications.l */
public class C9522l extends C9665n {

    /* renamed from: e */
    public static final String f26019e = "notification_channels";

    /* renamed from: f */
    public static final String f26020f = "id";

    /* renamed from: g */
    public static final String f26021g = "channel_id";

    /* renamed from: h */
    public static final String f26022h = "data";

    /* renamed from: i */
    public static final int f26023i = 2;

    public C9522l(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        super(context, str, str2, 2);
    }

    /* renamed from: k */
    public void mo17672k(@C0359n0 SQLiteDatabase sQLiteDatabase) {
        C36059m.m148406b("Creating database", new Object[0]);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notification_channels (id INTEGER PRIMARY KEY AUTOINCREMENT,channel_id TEXT UNIQUE,data TEXT);");
    }

    /* renamed from: l */
    public void mo17673l(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notification_channels");
        mo17672k(sQLiteDatabase);
    }

    /* renamed from: n */
    public void mo17674n(@C0359n0 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL("DELETE FROM notification_channels WHERE rowid NOT IN ( SELECT max(rowid) FROM notification_channels GROUP BY channel_id);");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX notification_channels_channel_id ON notification_channels(channel_id);");
        } else if (i != 2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notification_channels");
            mo17672k(sQLiteDatabase);
        }
    }

    @C0348i1
    /* renamed from: s */
    public boolean mo19363s(@C0359n0 C9515j jVar) {
        SQLiteDatabase g = mo19635g();
        if (g == null) {
            C36059m.m148409e("NotificationChannelRegistryDataManager - Unable to save notification channel.", new Object[0]);
            return false;
        }
        mo19369y(jVar, g);
        return true;
    }

    @C0348i1
    /* renamed from: t */
    public boolean mo19364t(@C0359n0 String str) {
        if (mo19632d(f26019e, "channel_id = ?", new String[]{str}) != -1) {
            return true;
        }
        C36059m.m148409e("Unable to remove notification channel: %s", str);
        return false;
    }

    @C0348i1
    /* renamed from: u */
    public boolean mo19365u() {
        boolean z;
        if (mo19632d(f26019e, (String) null, (String[]) null) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C36059m.m148409e("NotificationChannelRegistryDatamanager - failed to delete channels", new Object[0]);
        }
        return z;
    }

    @C0348i1
    @C0363p0
    /* renamed from: v */
    public final C9515j mo19366v(@C0359n0 Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("data"));
        try {
            return C9515j.m35673c(JsonValue.m34960C(string));
        } catch (JsonException unused) {
            C36059m.m148409e("Unable to parse notification channel: %s", string);
            return null;
        }
    }

    @C0348i1
    @C0363p0
    /* renamed from: w */
    public C9515j mo19367w(@C0359n0 String str) {
        Cursor o = mo19638o(f26019e, (String[]) null, "channel_id = ?", new String[]{str}, (String) null);
        C9515j jVar = null;
        if (o == null) {
            return null;
        }
        o.moveToFirst();
        if (!o.isAfterLast()) {
            jVar = mo19366v(o);
        }
        o.close();
        return jVar;
    }

    @C0348i1
    @C0359n0
    /* renamed from: x */
    public Set<C9515j> mo19368x() {
        Cursor o = mo19638o(f26019e, (String[]) null, (String) null, (String[]) null, (String) null);
        HashSet hashSet = new HashSet();
        if (o == null) {
            return hashSet;
        }
        o.moveToFirst();
        while (!o.isAfterLast()) {
            hashSet.add(mo19366v(o));
            o.moveToNext();
        }
        return hashSet;
    }

    @C0348i1
    /* renamed from: y */
    public final void mo19369y(C9515j jVar, @C0359n0 SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel_id", jVar.mo19332h());
        contentValues.put("data", jVar.mo17264q().toString());
        sQLiteDatabase.insertWithOnConflict(f26019e, (String) null, contentValues, 5);
    }
}
