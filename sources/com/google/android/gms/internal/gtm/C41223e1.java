package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.C40372a0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40990p;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.e1 */
public final class C41223e1 extends C41535r0 implements Closeable {

    /* renamed from: f */
    public static final String f104553f = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});

    /* renamed from: g */
    public static final String f104554g = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});

    /* renamed from: c */
    public final C41199d1 f104555c;

    /* renamed from: d */
    public final C41515q4 f104556d = new C41515q4(mo135748j());

    /* renamed from: e */
    public final C41515q4 f104557e = new C41515q4(mo135748j());

    public C41223e1(C41607u0 u0Var) {
        super(u0Var);
        this.f104555c = new C41199d1(this, u0Var.mo135891a(), mo135325e0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.gtm.C41706y3> mo135313A0(long r17) {
        /*
            r16 = this;
            r11 = r16
            java.lang.String r0 = "hit_id"
            r1 = 0
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            r12 = 0
            r13 = 1
            if (r1 < 0) goto L_0x000e
            r1 = r13
            goto L_0x000f
        L_0x000e:
            r1 = r12
        L_0x000f:
            com.google.android.gms.common.internal.C40843u.m166191a(r1)
            com.google.android.gms.analytics.C40372a0.m164215h()
            r16.mo135794T()
            android.database.sqlite.SQLiteDatabase r2 = r16.mo135329p0()
            r1 = 0
            java.lang.String r3 = "hit_time"
            java.lang.String r4 = "hit_string"
            java.lang.String r5 = "hit_url"
            java.lang.String r6 = "hit_app_id"
            java.lang.String[] r4 = new java.lang.String[]{r0, r3, r4, r5, r6}     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x0098 }
            r3[r12] = r0     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.String r0 = "hits2"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            java.lang.String r9 = java.lang.String.format(r9, r3)     // Catch:{ SQLiteException -> 0x0098 }
            java.lang.String r10 = java.lang.Long.toString(r17)     // Catch:{ SQLiteException -> 0x0098 }
            r3 = r0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0098 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 == 0) goto L_0x008c
        L_0x004d:
            long r7 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            long r4 = r14.getLong(r13)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r1 = 2
            java.lang.String r1 = r14.getString(r1)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r2 = 3
            java.lang.String r2 = r14.getString(r2)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r3 = 4
            int r9 = r14.getInt(r3)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            java.util.Map r3 = r11.mo135314C0(r1)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 == 0) goto L_0x0070
        L_0x006e:
            r6 = r13
            goto L_0x007a
        L_0x0070:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 != 0) goto L_0x0079
            goto L_0x006e
        L_0x0079:
            r6 = r12
        L_0x007a:
            com.google.android.gms.internal.gtm.y3 r15 = new com.google.android.gms.internal.gtm.y3     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r10 = 0
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0093, all -> 0x0090 }
            if (r1 != 0) goto L_0x004d
        L_0x008c:
            r14.close()
            return r0
        L_0x0090:
            r0 = move-exception
            r1 = r14
            goto L_0x009f
        L_0x0093:
            r0 = move-exception
            r1 = r14
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            goto L_0x009f
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            java.lang.String r2 = "Error loading hits from the database"
            r11.mo135755r(r2, r0)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41223e1.mo135313A0(long):java.util.List");
    }

    @C40974d0
    /* renamed from: C0 */
    public final Map<String, String> mo135314C0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                if (str.length() != 0) {
                    str = "?".concat(str);
                } else {
                    str = new String("?");
                }
            }
            return C40990p.m166661a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            mo135755r("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @C40974d0
    /* renamed from: D0 */
    public final Map<String, String> mo135315D0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "?".concat(valueOf);
            } else {
                str2 = new String("?");
            }
            return C40990p.m166661a(new URI(str2), "UTF-8");
        } catch (URISyntaxException e) {
            mo135755r("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: E0 */
    public final void mo135316E0() {
        mo135794T();
        mo135329p0().beginTransaction();
    }

    /* renamed from: F0 */
    public final void mo135317F0(long j) {
        C40372a0.m164215h();
        mo135794T();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j);
        arrayList.add(valueOf);
        mo135760w("Deleting hit, id", valueOf);
        mo135318X(arrayList);
    }

    /* renamed from: W */
    public final void mo133294W() {
    }

    /* renamed from: X */
    public final void mo135318X(List<Long> list) {
        C40843u.m166202l(list);
        C40372a0.m164215h();
        mo135794T();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase p0 = mo135329p0();
                mo135760w("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = p0.delete("hits2", sb2, (String[]) null);
                if (delete != list.size()) {
                    mo135732C("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                mo135755r("Error deleting hits", e);
                throw e;
            }
        }
    }

    /* renamed from: Z */
    public final int mo135319Z() {
        C40372a0.m164215h();
        mo135794T();
        if (!this.f104556d.mo135771c(86400000)) {
            return 0;
        }
        this.f104556d.mo135770b();
        mo135759v("Deleting stale hits (if any)");
        int delete = mo135329p0().delete("hits2", "hit_time < ?", new String[]{Long.toString(mo135748j().mo134768a() - 2592000000L)});
        mo135760w("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: a0 */
    public final void mo135320a0() {
        mo135794T();
        mo135329p0().endTransaction();
    }

    /* renamed from: b0 */
    public final void mo135321b0() {
        mo135794T();
        mo135329p0().setTransactionSuccessful();
    }

    /* renamed from: c0 */
    public final boolean mo135322c0() {
        return mo135326f0() == 0;
    }

    public final void close() {
        try {
            this.f104555c.close();
        } catch (SQLiteException e) {
            mo135755r("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            mo135755r("Error closing database", e2);
        }
    }

    /* renamed from: d0 */
    public final long mo135324d0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo135329p0().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e) {
            mo135756s("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: e0 */
    public final String mo135325e0() {
        mo135742P();
        mo135742P();
        return "google_analytics_v4.db";
    }

    /* renamed from: f0 */
    public final long mo135326f0() {
        C40372a0.m164215h();
        mo135794T();
        Cursor cursor = null;
        try {
            cursor = mo135329p0().rawQuery("SELECT COUNT(*) FROM hits2", (String[]) null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo135756s("Database error", "SELECT COUNT(*) FROM hits2", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: g0 */
    public final long mo135327g0() {
        C40372a0.m164215h();
        mo135794T();
        return mo135324d0(f104554g, (String[]) null, 0);
    }

    /* renamed from: n0 */
    public final long mo135328n0(long j, String str, String str2) {
        C40843u.m166198h(str);
        C40843u.m166198h(str2);
        mo135794T();
        C40372a0.m164215h();
        return mo135324d0("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0);
    }

    @C40974d0
    /* renamed from: p0 */
    public final SQLiteDatabase mo135329p0() {
        try {
            return this.f104555c.getWritableDatabase();
        } catch (SQLiteException e) {
            mo135763z("Error opening database", e);
            throw e;
        }
    }
}
