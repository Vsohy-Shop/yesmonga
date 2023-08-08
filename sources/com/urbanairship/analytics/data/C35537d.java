package com.urbanairship.analytics.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20357q;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import com.urbanairship.analytics.data.AnalyticsDatabase;
import com.urbanairship.analytics.data.C35543e;
import com.urbanairship.json.C9334f;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.analytics.data.d */
public final class C35537d extends C35536c {

    /* renamed from: a */
    public final RoomDatabase f87664a;

    /* renamed from: b */
    public final C20361r<C35543e> f87665b;

    /* renamed from: c */
    public final C9334f f87666c = new C9334f();

    /* renamed from: d */
    public final C20357q<C35543e> f87667d;

    /* renamed from: e */
    public final SharedSQLiteStatement f87668e;

    /* renamed from: f */
    public final SharedSQLiteStatement f87669f;

    /* renamed from: g */
    public final SharedSQLiteStatement f87670g;

    /* renamed from: com.urbanairship.analytics.data.d$a */
    public class C35538a extends C20361r<C35543e> {
        public C35538a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `events` (`id`,`type`,`eventId`,`time`,`data`,`sessionId`,`eventSize`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C35543e eVar) {
            kVar.mo60790S2(1, (long) eVar.f87676a);
            String str = eVar.f87677b;
            if (str == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str);
            }
            String str2 = eVar.f87678c;
            if (str2 == null) {
                kVar.mo60800u3(3);
            } else {
                kVar.mo60801v2(3, str2);
            }
            String str3 = eVar.f87679d;
            if (str3 == null) {
                kVar.mo60800u3(4);
            } else {
                kVar.mo60801v2(4, str3);
            }
            String f = C35537d.this.f87666c.mo18848f(eVar.f87680e);
            if (f == null) {
                kVar.mo60800u3(5);
            } else {
                kVar.mo60801v2(5, f);
            }
            String str4 = eVar.f87681f;
            if (str4 == null) {
                kVar.mo60800u3(6);
            } else {
                kVar.mo60801v2(6, str4);
            }
            kVar.mo60790S2(7, (long) eVar.f87682g);
        }
    }

    /* renamed from: com.urbanairship.analytics.data.d$b */
    public class C35539b extends C20357q<C35543e> {
        public C35539b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM `events` WHERE `id` = ?";
        }

        /* renamed from: m */
        public void mo17586i(C20492k kVar, C35543e eVar) {
            kVar.mo60790S2(1, (long) eVar.f87676a);
        }
    }

    /* renamed from: com.urbanairship.analytics.data.d$c */
    public class C35540c extends SharedSQLiteStatement {
        public C35540c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM events WHERE eventId = ?";
        }
    }

    /* renamed from: com.urbanairship.analytics.data.d$d */
    public class C35541d extends SharedSQLiteStatement {
        public C35541d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM events";
        }
    }

    /* renamed from: com.urbanairship.analytics.data.d$e */
    public class C35542e extends SharedSQLiteStatement {
        public C35542e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM events WHERE sessionId = ?";
        }
    }

    public C35537d(RoomDatabase roomDatabase) {
        this.f87664a = roomDatabase;
        this.f87665b = new C35538a(roomDatabase);
        this.f87667d = new C35539b(roomDatabase);
        this.f87668e = new C35540c(roomDatabase);
        this.f87669f = new C35541d(roomDatabase);
        this.f87670g = new C35542e(roomDatabase);
    }

    /* renamed from: p */
    public static List<Class<?>> m146636p() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public int mo106455a() {
        int i = 0;
        C20400v1 d = C20400v1.m95183d("SELECT COUNT(*) FROM events", 0);
        this.f87664a.mo60904d();
        Cursor f = C20378b.m95145f(this.f87664a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                i = f.getInt(0);
            }
            return i;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: b */
    public int mo106456b() {
        int i = 0;
        C20400v1 d = C20400v1.m95183d("SELECT SUM(eventSize) FROM events", 0);
        this.f87664a.mo60904d();
        Cursor f = C20378b.m95145f(this.f87664a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                i = f.getInt(0);
            }
            return i;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: c */
    public void mo106457c(String str) {
        this.f87664a.mo60904d();
        C20492k b = this.f87668e.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f87664a.mo60905e();
        try {
            b.mo60802y0();
            this.f87664a.mo60901O();
        } finally {
            this.f87664a.mo60908k();
            this.f87668e.mo60963h(b);
        }
    }

    /* renamed from: d */
    public void mo106458d(C35543e... eVarArr) {
        this.f87664a.mo60904d();
        this.f87664a.mo60905e();
        try {
            this.f87667d.mo61152l(eVarArr);
            this.f87664a.mo60901O();
        } finally {
            this.f87664a.mo60908k();
        }
    }

    /* renamed from: e */
    public void mo106459e() {
        this.f87664a.mo60904d();
        C20492k b = this.f87669f.mo60958b();
        this.f87664a.mo60905e();
        try {
            b.mo60802y0();
            this.f87664a.mo60901O();
        } finally {
            this.f87664a.mo60908k();
            this.f87669f.mo60963h(b);
        }
    }

    /* renamed from: f */
    public void mo106460f(List<C35543e.C35544a> list) {
        this.f87664a.mo60905e();
        try {
            super.mo106460f(list);
            this.f87664a.mo60901O();
        } finally {
            this.f87664a.mo60908k();
        }
    }

    /* renamed from: g */
    public int mo106461g(String str) {
        this.f87664a.mo60904d();
        C20492k b = this.f87670g.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f87664a.mo60905e();
        try {
            int y0 = b.mo60802y0();
            this.f87664a.mo60901O();
            return y0;
        } finally {
            this.f87664a.mo60908k();
            this.f87670g.mo60963h(b);
        }
    }

    /* renamed from: h */
    public List<C35543e> mo106462h() {
        Cursor f;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM events ORDER BY id ASC", 0);
        this.f87664a.mo60904d();
        this.f87664a.mo60905e();
        try {
            f = C20378b.m95145f(this.f87664a, d, false, (CancellationSignal) null);
            int e = C20376a.m95137e(f, "id");
            int e2 = C20376a.m95137e(f, "type");
            int e3 = C20376a.m95137e(f, "eventId");
            int e4 = C20376a.m95137e(f, "time");
            int e5 = C20376a.m95137e(f, "data");
            int e6 = C20376a.m95137e(f, "sessionId");
            int e7 = C20376a.m95137e(f, AnalyticsDatabase.C35530a.f87652r);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(e2)) {
                    str = null;
                } else {
                    str = f.getString(e2);
                }
                if (f.isNull(e3)) {
                    str2 = null;
                } else {
                    str2 = f.getString(e3);
                }
                if (f.isNull(e4)) {
                    str3 = null;
                } else {
                    str3 = f.getString(e4);
                }
                if (f.isNull(e5)) {
                    str4 = null;
                } else {
                    str4 = f.getString(e5);
                }
                JsonValue e8 = this.f87666c.mo18847e(str4);
                if (f.isNull(e6)) {
                    str5 = null;
                } else {
                    str5 = f.getString(e6);
                }
                C35543e eVar = new C35543e(str, str2, str3, e8, str5, f.getInt(e7));
                eVar.f87676a = f.getInt(e);
                arrayList.add(eVar);
            }
            this.f87664a.mo60901O();
            f.close();
            d.release();
            this.f87664a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f87664a.mo60908k();
            throw th;
        }
    }

    /* renamed from: i */
    public List<C35543e.C35544a> mo106463i(int i) {
        Cursor f;
        String str;
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT id, eventId, data FROM events ORDER BY id ASC LIMIT ?", 1);
        d.mo60790S2(1, (long) i);
        this.f87664a.mo60904d();
        this.f87664a.mo60905e();
        try {
            f = C20378b.m95145f(this.f87664a, d, false, (CancellationSignal) null);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                int i2 = f.getInt(0);
                if (f.isNull(1)) {
                    str = null;
                } else {
                    str = f.getString(1);
                }
                if (f.isNull(2)) {
                    str2 = null;
                } else {
                    str2 = f.getString(2);
                }
                arrayList.add(new C35543e.C35544a(i2, str, this.f87666c.mo18847e(str2)));
            }
            this.f87664a.mo60901O();
            f.close();
            d.release();
            this.f87664a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f87664a.mo60908k();
            throw th;
        }
    }

    /* renamed from: j */
    public void mo106464j(C35543e eVar) {
        this.f87664a.mo60904d();
        this.f87664a.mo60905e();
        try {
            this.f87665b.mo61158k(eVar);
            this.f87664a.mo60901O();
        } finally {
            this.f87664a.mo60908k();
        }
    }

    /* renamed from: k */
    public String mo106465k() {
        C20400v1 d = C20400v1.m95183d("SELECT sessionId FROM events ORDER BY id ASC LIMIT 1", 0);
        this.f87664a.mo60904d();
        String str = null;
        Cursor f = C20378b.m95145f(this.f87664a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (!f.isNull(0)) {
                    str = f.getString(0);
                }
            }
            return str;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: l */
    public void mo106466l(int i) {
        this.f87664a.mo60905e();
        try {
            super.mo106466l(i);
            this.f87664a.mo60901O();
        } finally {
            this.f87664a.mo60908k();
        }
    }
}
