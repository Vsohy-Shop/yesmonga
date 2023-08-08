package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40983i;
import com.google.android.gms.common.util.C40985k;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.t6 */
public final class C41589t6 implements C41300h6 {

    /* renamed from: i */
    public static final String f104995i = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", new Object[]{"gtm_hit_unique_ids", "hit_unique_id"});

    /* renamed from: j */
    public static final String f104996j = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"});

    /* renamed from: k */
    public static final String f104997k = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", new Object[]{"save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});

    /* renamed from: l */
    public static final String f104998l = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", new Object[]{"check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});

    /* renamed from: a */
    public final C41565s6 f104999a;

    /* renamed from: b */
    public volatile C41732z5 f105000b;

    /* renamed from: c */
    public final Context f105001c;

    /* renamed from: d */
    public final String f105002d = "gtm_urls.db";

    /* renamed from: e */
    public long f105003e;

    /* renamed from: f */
    public final C40979g f105004f;

    /* renamed from: g */
    public final int f105005g;

    /* renamed from: h */
    public final C41349j7 f105006h;

    public C41589t6(C41349j7 j7Var, Context context, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        this.f105001c = applicationContext;
        this.f105006h = j7Var;
        this.f105004f = C40985k.m166636d();
        this.f104999a = new C41565s6(this, applicationContext, "gtm_urls.db");
        this.f105000b = new C41566s7(applicationContext, new C41541r6(this));
        this.f105003e = 0;
        this.f105005g = 2000;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ void m168402k(C41589t6 t6Var, long j, long j2) {
        SQLiteDatabase m = t6Var.mo135850m("Error opening database for getNumStoredHits.");
        if (m != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                m.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 70);
                sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId ");
                sb.append(j);
                sb.append(": ");
                sb.append(message);
                C41493p6.m168153e(sb.toString());
                t6Var.mo135851n(j);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        if (r4 == null) goto L_0x00d8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135430a(long r18, java.lang.String r20, @androidx.annotation.C0363p0 java.lang.String r21, @androidx.annotation.C0363p0 java.lang.String r22, @androidx.annotation.C0363p0 java.util.Map<java.lang.String, java.lang.String> r23, @androidx.annotation.C0363p0 java.lang.String r24) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "hit_id"
            com.google.android.gms.common.util.g r2 = r1.f105004f
            long r2 = r2.mo134768a()
            long r4 = r1.f105003e
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r5 = "gtm_hits"
            r6 = 1
            r7 = 0
            if (r4 > 0) goto L_0x0019
            goto L_0x0066
        L_0x0019:
            r1.f105003e = r2
            java.lang.String r2 = "Error opening database for deleteStaleHits."
            android.database.sqlite.SQLiteDatabase r2 = r1.mo135850m(r2)
            if (r2 == 0) goto L_0x0066
            com.google.android.gms.common.util.g r3 = r1.f105004f
            long r3 = r3.mo134768a()
            java.lang.String[] r8 = new java.lang.String[r6]
            r9 = -2592000000(0xffffffff65813800, double:NaN)
            long r3 = r3 + r9
            java.lang.String r3 = java.lang.Long.toString(r3)
            r8[r7] = r3
            java.lang.String r3 = "HIT_TIME < ?"
            int r2 = r2.delete(r5, r3, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 31
            r3.<init>(r4)
            java.lang.String r4 = "Removed "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " stale hits."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r2)
            com.google.android.gms.internal.gtm.j7 r2 = r1.f105006h
            int r3 = r1.mo135848b(r5)
            if (r3 != 0) goto L_0x0062
            r3 = r6
            goto L_0x0063
        L_0x0062:
            r3 = r7
        L_0x0063:
            r2.mo135512a(r3)
        L_0x0066:
            int r2 = r1.mo135848b(r5)
            int r3 = r1.f105005g
            int r2 = r2 - r3
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0109
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r8 = r1.mo135850m(r4)
            if (r8 != 0) goto L_0x007e
            goto L_0x00d8
        L_0x007e:
            r4 = 0
            java.lang.String[] r10 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ SQLiteException -> 0x00b5 }
            r5[r7] = r0     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r9 = "gtm_hits"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r0 = "%s ASC"
            java.lang.String r15 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r16 = java.lang.Integer.toString(r2)     // Catch:{ SQLiteException -> 0x00b5 }
            android.database.Cursor r4 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00b5 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x00b5 }
            if (r0 == 0) goto L_0x00d5
        L_0x00a1:
            long r5 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00b5 }
            r3.add(r0)     // Catch:{ SQLiteException -> 0x00b5 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x00b5 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00d5
        L_0x00b3:
            r0 = move-exception
            goto L_0x0103
        L_0x00b5:
            r0 = move-exception
            java.lang.String r2 = "Error in peekHits fetching hitIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b3 }
            int r5 = r0.length()     // Catch:{ all -> 0x00b3 }
            if (r5 == 0) goto L_0x00cb
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00b3 }
            r0.<init>(r2)     // Catch:{ all -> 0x00b3 }
        L_0x00d0:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x00b3 }
            if (r4 == 0) goto L_0x00d8
        L_0x00d5:
            r4.close()
        L_0x00d8:
            int r0 = r3.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 51
            r2.<init>(r4)
            java.lang.String r4 = "Store full, deleting "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " hits to make room."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r0)
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.mo135849l(r0)
            goto L_0x0109
        L_0x0103:
            if (r4 == 0) goto L_0x0108
            r4.close()
        L_0x0108:
            throw r0
        L_0x0109:
            r17.mo135852o(r18, r20, r21, r22, r23, r24)
            com.google.android.gms.internal.gtm.w6 r0 = com.google.android.gms.internal.gtm.C41661w6.m168646a()
            boolean r0 = r0.mo136018d()
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "Sending hits immediately under preview."
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r0)
            r17.zza()
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41589t6.mo135430a(long, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: b */
    public final int mo135848b(String str) {
        String str2;
        SQLiteDatabase m = mo135850m("Error opening database for getNumRecords.");
        int i = 0;
        if (m == null) {
            return 0;
        }
        ? r2 = 0;
        try {
            Cursor rawQuery = m.rawQuery("SELECT COUNT(*) from gtm_hits", r2);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
            return i;
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str2 = "Error getting numStoredRecords: ".concat(valueOf);
            } else {
                str2 = new String("Error getting numStoredRecords: ");
            }
            C41493p6.m168153e(str2);
            if (r2 == 0) {
                return 0;
            }
            r2.close();
            return 0;
        } catch (Throwable th) {
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    public final void mo135849l(String[] strArr) {
        int length;
        SQLiteDatabase m;
        String str;
        if (strArr != null && (length = strArr.length) != 0 && (m = mo135850m("Error opening database for deleteHits.")) != null) {
            boolean z = true;
            try {
                m.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(length, "?"))}), strArr);
                C41349j7 j7Var = this.f105006h;
                if (mo135848b("gtm_hits") != 0) {
                    z = false;
                }
                j7Var.mo135512a(z);
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Error deleting hits: ".concat(valueOf);
                } else {
                    str = new String("Error deleting hits: ");
                }
                C41493p6.m168153e(str);
            }
        }
    }

    /* renamed from: m */
    public final SQLiteDatabase mo135850m(String str) {
        try {
            return this.f104999a.getWritableDatabase();
        } catch (SQLiteException e) {
            Context context = this.f105001c;
            C41493p6.m168154f(str, e);
            if (C40983i.m166633a(context, e)) {
                C41493p6.m168152d("Crash reported successfully.");
                return null;
            }
            C41493p6.m168152d("Failed to report crash");
            return null;
        }
    }

    /* renamed from: n */
    public final void mo135851n(long j) {
        mo135849l(new String[]{String.valueOf(j)});
    }

    /* renamed from: o */
    public final void mo135852o(long j, String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 Map<String, String> map, @C0363p0 String str4) {
        String str5;
        String str6;
        String str7;
        SQLiteDatabase m = mo135850m("Error opening database for putHit");
        if (m != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", 0);
            if (str2 == null) {
                str2 = "GET";
            }
            contentValues.put("hit_method", str2);
            contentValues.put("hit_unique_id", str3);
            if (map == null) {
                str5 = null;
            } else {
                str5 = new JSONObject(map).toString();
            }
            contentValues.put("hit_headers", str5);
            contentValues.put("hit_body", str4);
            try {
                m.insertOrThrow("gtm_hits", (String) null, contentValues);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
                sb.append("Hit stored (url = ");
                sb.append(str);
                sb.append(")");
                C41493p6.m168152d(sb.toString());
                this.f105006h.mo135512a(false);
            } catch (SQLiteConstraintException unused) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str6 = "Hit has already been sent: ".concat(valueOf);
                } else {
                    str6 = new String("Hit has already been sent: ");
                }
                C41493p6.m168152d(str6);
            } catch (SQLiteException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() != 0) {
                    str7 = "Error storing hit: ".concat(valueOf2);
                } else {
                    str7 = new String("Error storing hit: ");
                }
                C41493p6.m168153e(str7);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0204, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0280, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cd, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d0, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01de, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e3, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f5, code lost:
        r0 = "Error in peekHits fetching hitIds: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fa, code lost:
        r0 = new java.lang.String("Error in peekHits fetching hitIds: ");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0256 A[Catch:{ all -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025b A[Catch:{ all -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bf A[EDGE_INSN: B:144:0x01bf->B:75:0x01bf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018a A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018f A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a7 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01cf A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01de A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f5 A[Catch:{ all -> 0x027c }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01fa A[Catch:{ all -> 0x027c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r0 = "%s ASC"
            java.lang.String r2 = "GTM Dispatch running..."
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r2)
            com.google.android.gms.internal.gtm.z5 r2 = r1.f105000b
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L_0x0284
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "Error opening database for peekHits"
            android.database.sqlite.SQLiteDatabase r3 = r1.mo135850m(r3)
            java.lang.String r13 = "hit_first_send_time"
            java.lang.String r15 = "hit_id"
            r12 = 0
            r11 = 1
            if (r3 != 0) goto L_0x0027
            r14 = r12
            goto L_0x0207
        L_0x0027:
            java.lang.String r4 = "hit_time"
            java.lang.String[] r6 = new java.lang.String[]{r15, r4, r13}     // Catch:{ SQLiteException -> 0x01e2, all -> 0x01de }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ SQLiteException -> 0x01e2, all -> 0x01de }
            r4[r12] = r15     // Catch:{ SQLiteException -> 0x01e2, all -> 0x01de }
            java.lang.String r5 = "gtm_hits"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r16 = java.lang.String.format(r0, r4)     // Catch:{ SQLiteException -> 0x01e2, all -> 0x01de }
            r17 = 40
            java.lang.String r18 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x01e2, all -> 0x01de }
            r4 = r3
            r14 = r11
            r11 = r16
            r14 = r12
            r12 = r18
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01dc, all -> 0x01de }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01d6, all -> 0x01cf }
            r11.<init>()     // Catch:{ SQLiteException -> 0x01d6, all -> 0x01cf }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            r10 = 2
            if (r2 == 0) goto L_0x0075
        L_0x0058:
            com.google.android.gms.internal.gtm.c6 r2 = new com.google.android.gms.internal.gtm.c6     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            long r20 = r12.getLong(r14)     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            r4 = 1
            long r22 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            long r24 = r12.getLong(r10)     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            r19 = r2
            r19.<init>(r20, r22, r24)     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            r11.add(r2)     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01cc, all -> 0x01cf }
            if (r2 != 0) goto L_0x0058
        L_0x0075:
            r12.close()
            java.lang.String r2 = "hit_url"
            java.lang.String r4 = "hit_method"
            java.lang.String r5 = "hit_headers"
            java.lang.String r6 = "hit_body"
            java.lang.String[] r6 = new java.lang.String[]{r15, r2, r4, r5, r6}     // Catch:{ SQLiteException -> 0x0174, all -> 0x016e }
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x0174, all -> 0x016e }
            r4[r14] = r15     // Catch:{ SQLiteException -> 0x0174, all -> 0x016e }
            java.lang.String r5 = "gtm_hits"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = 0
            java.lang.String r0 = java.lang.String.format(r0, r4)     // Catch:{ SQLiteException -> 0x0174, all -> 0x016e }
            java.lang.String r17 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x0174, all -> 0x016e }
            r4 = r3
            r3 = r10
            r10 = r2
            r2 = r11
            r11 = r0
            r18 = r12
            r12 = r17
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x016c, all -> 0x016a }
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0168 }
            if (r0 == 0) goto L_0x0160
            r4 = r14
        L_0x00ab:
            r0 = r12
            android.database.sqlite.SQLiteCursor r0 = (android.database.sqlite.SQLiteCursor) r0     // Catch:{ SQLiteException -> 0x0168 }
            android.database.CursorWindow r0 = r0.getWindow()     // Catch:{ SQLiteException -> 0x0168 }
            int r0 = r0.getNumRows()     // Catch:{ SQLiteException -> 0x0168 }
            if (r0 <= 0) goto L_0x013c
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.c6 r0 = (com.google.android.gms.internal.gtm.C41180c6) r0     // Catch:{ SQLiteException -> 0x0168 }
            r5 = 1
            java.lang.String r6 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0168 }
            r0.mo135169j(r6)     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.c6 r0 = (com.google.android.gms.internal.gtm.C41180c6) r0     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.String r5 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0168 }
            r0.mo135168i(r5)     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.c6 r0 = (com.google.android.gms.internal.gtm.C41180c6) r0     // Catch:{ SQLiteException -> 0x0168 }
            r5 = 4
            java.lang.String r5 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0168 }
            r0.mo135166g(r5)     // Catch:{ SQLiteException -> 0x0168 }
            r0 = 3
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x0118 }
            if (r0 == 0) goto L_0x010d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0118 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x0118 }
            org.json.JSONArray r0 = r5.names()     // Catch:{ JSONException -> 0x0118 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ JSONException -> 0x0118 }
            r6.<init>()     // Catch:{ JSONException -> 0x0118 }
            r7 = r14
        L_0x00f7:
            int r8 = r0.length()     // Catch:{ JSONException -> 0x0118 }
            if (r7 >= r8) goto L_0x010e
            java.lang.String r8 = r0.getString(r7)     // Catch:{ JSONException -> 0x0118 }
            java.lang.Object r9 = r5.opt(r8)     // Catch:{ JSONException -> 0x0118 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0118 }
            r6.put(r8, r9)     // Catch:{ JSONException -> 0x0118 }
            int r7 = r7 + 1
            goto L_0x00f7
        L_0x010d:
            r6 = 0
        L_0x010e:
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.c6 r0 = (com.google.android.gms.internal.gtm.C41180c6) r0     // Catch:{ SQLiteException -> 0x0168 }
            r0.mo135167h(r6)     // Catch:{ SQLiteException -> 0x0168 }
            goto L_0x0158
        L_0x0118:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.Object r6 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.c6 r6 = (com.google.android.gms.internal.gtm.C41180c6) r6     // Catch:{ SQLiteException -> 0x0168 }
            long r6 = r6.mo135161b()     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x0168 }
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x0168 }
            r6 = 1
            r5[r6] = r0     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.String r0 = "Failed to read headers for hitId %d: %s"
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ SQLiteException -> 0x0168 }
            goto L_0x015a
        L_0x013c:
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.c6 r5 = (com.google.android.gms.internal.gtm.C41180c6) r5     // Catch:{ SQLiteException -> 0x0168 }
            long r5 = r5.mo135161b()     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0168 }
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x0168 }
            java.lang.String r5 = "HitString for hitId %d too large. Hit will be deleted."
            java.lang.String r0 = java.lang.String.format(r5, r0)     // Catch:{ SQLiteException -> 0x0168 }
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ SQLiteException -> 0x0168 }
        L_0x0158:
            int r4 = r4 + 1
        L_0x015a:
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0168 }
            if (r0 != 0) goto L_0x00ab
        L_0x0160:
            r12.close()
            goto L_0x0207
        L_0x0165:
            r0 = move-exception
            goto L_0x01c6
        L_0x0168:
            r0 = move-exception
            goto L_0x017a
        L_0x016a:
            r0 = move-exception
            goto L_0x0171
        L_0x016c:
            r0 = move-exception
            goto L_0x0178
        L_0x016e:
            r0 = move-exception
            r18 = r12
        L_0x0171:
            r12 = r18
            goto L_0x01c6
        L_0x0174:
            r0 = move-exception
            r2 = r11
            r18 = r12
        L_0x0178:
            r12 = r18
        L_0x017a:
            java.lang.String r3 = "Error in peekHits fetching hit url: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0165 }
            int r4 = r0.length()     // Catch:{ all -> 0x0165 }
            if (r4 == 0) goto L_0x018f
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x0194
        L_0x018f:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0165 }
            r0.<init>(r3)     // Catch:{ all -> 0x0165 }
        L_0x0194:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x0165 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0165 }
            r0.<init>()     // Catch:{ all -> 0x0165 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0165 }
            r3 = r14
        L_0x01a1:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0165 }
            if (r4 == 0) goto L_0x01bf
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0165 }
            com.google.android.gms.internal.gtm.c6 r4 = (com.google.android.gms.internal.gtm.C41180c6) r4     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = r4.mo135164e()     // Catch:{ all -> 0x0165 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0165 }
            if (r5 == 0) goto L_0x01bb
            if (r3 == 0) goto L_0x01ba
            goto L_0x01bf
        L_0x01ba:
            r3 = 1
        L_0x01bb:
            r0.add(r4)     // Catch:{ all -> 0x0165 }
            goto L_0x01a1
        L_0x01bf:
            if (r12 == 0) goto L_0x01c4
            r12.close()
        L_0x01c4:
            r2 = r0
            goto L_0x0207
        L_0x01c6:
            if (r12 == 0) goto L_0x01cb
            r12.close()
        L_0x01cb:
            throw r0
        L_0x01cc:
            r0 = move-exception
            r2 = r11
            goto L_0x01d7
        L_0x01cf:
            r0 = move-exception
            r18 = r12
            r14 = r18
            goto L_0x027e
        L_0x01d6:
            r0 = move-exception
        L_0x01d7:
            r18 = r12
            r12 = r18
            goto L_0x01e5
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e4
        L_0x01de:
            r0 = move-exception
            r14 = 0
            goto L_0x027e
        L_0x01e2:
            r0 = move-exception
            r14 = r12
        L_0x01e4:
            r12 = 0
        L_0x01e5:
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x027c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x027c }
            int r4 = r0.length()     // Catch:{ all -> 0x027c }
            if (r4 == 0) goto L_0x01fa
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x027c }
            goto L_0x01ff
        L_0x01fa:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x027c }
            r0.<init>(r3)     // Catch:{ all -> 0x027c }
        L_0x01ff:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x027c }
            if (r12 == 0) goto L_0x0207
            r12.close()
        L_0x0207:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = "...nothing to dispatch"
            com.google.android.gms.internal.gtm.C41493p6.m168152d(r0)
            com.google.android.gms.internal.gtm.j7 r0 = r1.f105006h
            r2 = 1
            r0.mo135512a(r2)
            return
        L_0x0219:
            com.google.android.gms.internal.gtm.z5 r0 = r1.f105000b
            r0.mo135823a(r2)
            java.lang.String r0 = "Error opening database for getNumStoredHits."
            android.database.sqlite.SQLiteDatabase r2 = r1.mo135850m(r0)
            if (r2 != 0) goto L_0x0227
            goto L_0x026f
        L_0x0227:
            java.lang.String[] r4 = new java.lang.String[]{r15, r13}     // Catch:{ SQLiteException -> 0x0244, all -> 0x0241 }
            java.lang.String r3 = "gtm_hits"
            java.lang.String r5 = "hit_first_send_time=0"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0244, all -> 0x0241 }
            int r12 = r2.getCount()     // Catch:{ SQLiteException -> 0x023f }
            r2.close()
            goto L_0x0266
        L_0x023f:
            r0 = move-exception
            goto L_0x0246
        L_0x0241:
            r0 = move-exception
            r14 = 0
            goto L_0x0276
        L_0x0244:
            r0 = move-exception
            r2 = 0
        L_0x0246:
            java.lang.String r3 = "Error getting num untried hits: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0274 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0274 }
            int r4 = r0.length()     // Catch:{ all -> 0x0274 }
            if (r4 == 0) goto L_0x025b
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0274 }
            goto L_0x0260
        L_0x025b:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0274 }
            r0.<init>(r3)     // Catch:{ all -> 0x0274 }
        L_0x0260:
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x0274 }
            if (r2 != 0) goto L_0x0270
            r12 = r14
        L_0x0266:
            if (r12 <= 0) goto L_0x026f
            com.google.android.gms.internal.gtm.p7 r0 = com.google.android.gms.internal.gtm.C41494p7.m168157f()
            r0.mo135711i()
        L_0x026f:
            return
        L_0x0270:
            r2.close()
            return
        L_0x0274:
            r0 = move-exception
            r14 = r2
        L_0x0276:
            if (r14 == 0) goto L_0x027b
            r14.close()
        L_0x027b:
            throw r0
        L_0x027c:
            r0 = move-exception
            r14 = r12
        L_0x027e:
            if (r14 == 0) goto L_0x0283
            r14.close()
        L_0x0283:
            throw r0
        L_0x0284:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41589t6.zza():void");
    }
}
