package com.urbanairship;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20376a;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.t */
public final class C36067t extends C36066s {

    /* renamed from: a */
    public final RoomDatabase f89119a;

    /* renamed from: b */
    public final C20361r<C36065r> f89120b;

    /* renamed from: c */
    public final SharedSQLiteStatement f89121c;

    /* renamed from: d */
    public final SharedSQLiteStatement f89122d;

    /* renamed from: com.urbanairship.t$a */
    public class C36068a extends C20361r<C36065r> {
        public C36068a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `preferences` (`_id`,`value`) VALUES (?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C36065r rVar) {
            String str = rVar.f89117a;
            if (str == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, str);
            }
            String str2 = rVar.f89118b;
            if (str2 == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, str2);
            }
        }
    }

    /* renamed from: com.urbanairship.t$b */
    public class C36069b extends SharedSQLiteStatement {
        public C36069b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM preferences WHERE (`_id` == ?)";
        }
    }

    /* renamed from: com.urbanairship.t$c */
    public class C36070c extends SharedSQLiteStatement {
        public C36070c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM preferences";
        }
    }

    public C36067t(RoomDatabase roomDatabase) {
        this.f89119a = roomDatabase;
        this.f89120b = new C36068a(roomDatabase);
        this.f89121c = new C36069b(roomDatabase);
        this.f89122d = new C36070c(roomDatabase);
    }

    /* renamed from: g */
    public static List<Class<?>> m148450g() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo107833a(String str) {
        this.f89119a.mo60904d();
        C20492k b = this.f89121c.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f89119a.mo60905e();
        try {
            b.mo60802y0();
            this.f89119a.mo60901O();
        } finally {
            this.f89119a.mo60908k();
            this.f89121c.mo60963h(b);
        }
    }

    /* renamed from: b */
    public void mo107834b() {
        this.f89119a.mo60904d();
        C20492k b = this.f89122d.mo60958b();
        this.f89119a.mo60905e();
        try {
            b.mo60802y0();
            this.f89119a.mo60901O();
        } finally {
            this.f89119a.mo60908k();
            this.f89122d.mo60963h(b);
        }
    }

    /* renamed from: c */
    public List<C36065r> mo107835c() {
        Cursor f;
        String str;
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT * FROM preferences", 0);
        this.f89119a.mo60904d();
        this.f89119a.mo60905e();
        try {
            f = C20378b.m95145f(this.f89119a, d, false, (CancellationSignal) null);
            int e = C20376a.m95137e(f, "_id");
            int e2 = C20376a.m95137e(f, "value");
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(e)) {
                    str = null;
                } else {
                    str = f.getString(e);
                }
                if (f.isNull(e2)) {
                    str2 = null;
                } else {
                    str2 = f.getString(e2);
                }
                arrayList.add(new C36065r(str, str2));
            }
            this.f89119a.mo60901O();
            f.close();
            d.release();
            this.f89119a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f89119a.mo60908k();
            throw th;
        }
    }

    /* renamed from: d */
    public List<String> mo107836d() {
        Cursor f;
        String str;
        C20400v1 d = C20400v1.m95183d("SELECT _id FROM preferences", 0);
        this.f89119a.mo60904d();
        this.f89119a.mo60905e();
        try {
            f = C20378b.m95145f(this.f89119a, d, false, (CancellationSignal) null);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str = null;
                } else {
                    str = f.getString(0);
                }
                arrayList.add(str);
            }
            this.f89119a.mo60901O();
            f.close();
            d.release();
            this.f89119a.mo60908k();
            return arrayList;
        } catch (Throwable th) {
            this.f89119a.mo60908k();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.urbanairship.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.urbanairship.C36065r mo107837e(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM preferences WHERE (`_id` == ?)"
            r1 = 1
            androidx.room.v1 r0 = androidx.room.C20400v1.m95183d(r0, r1)
            if (r6 != 0) goto L_0x000d
            r0.mo60800u3(r1)
            goto L_0x0010
        L_0x000d:
            r0.mo60801v2(r1, r6)
        L_0x0010:
            androidx.room.RoomDatabase r6 = r5.f89119a
            r6.mo60904d()
            androidx.room.RoomDatabase r6 = r5.f89119a
            r6.mo60905e()
            androidx.room.RoomDatabase r6 = r5.f89119a     // Catch:{ all -> 0x006a }
            r1 = 0
            r2 = 0
            android.database.Cursor r6 = androidx.room.util.C20378b.m95145f(r6, r0, r1, r2)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "_id"
            int r1 = androidx.room.util.C20376a.m95137e(r6, r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "value"
            int r3 = androidx.room.util.C20376a.m95137e(r6, r3)     // Catch:{ all -> 0x0062 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r6.isNull(r1)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x003c
            r1 = r2
            goto L_0x0040
        L_0x003c:
            java.lang.String r1 = r6.getString(r1)     // Catch:{ all -> 0x0062 }
        L_0x0040:
            boolean r4 = r6.isNull(r3)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            java.lang.String r2 = r6.getString(r3)     // Catch:{ all -> 0x0062 }
        L_0x004b:
            com.urbanairship.r r3 = new com.urbanairship.r     // Catch:{ all -> 0x0062 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0062 }
            r2 = r3
        L_0x0051:
            androidx.room.RoomDatabase r1 = r5.f89119a     // Catch:{ all -> 0x0062 }
            r1.mo60901O()     // Catch:{ all -> 0x0062 }
            r6.close()     // Catch:{ all -> 0x006a }
            r0.release()     // Catch:{ all -> 0x006a }
            androidx.room.RoomDatabase r6 = r5.f89119a
            r6.mo60908k()
            return r2
        L_0x0062:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x006a }
            r0.release()     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x006a:
            r6 = move-exception
            androidx.room.RoomDatabase r0 = r5.f89119a
            r0.mo60908k()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.C36067t.mo107837e(java.lang.String):com.urbanairship.r");
    }

    /* renamed from: f */
    public void mo107838f(C36065r rVar) {
        this.f89119a.mo60904d();
        this.f89119a.mo60905e();
        try {
            this.f89120b.mo61158k(rVar);
            this.f89119a.mo60901O();
        } finally {
            this.f89119a.mo60908k();
        }
    }
}
