package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import androidx.work.impl.model.C21230j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.model.k */
public final class C21232k implements C21230j {

    /* renamed from: a */
    public final RoomDatabase f54777a;

    /* renamed from: b */
    public final C20361r<C21229i> f54778b;

    /* renamed from: c */
    public final SharedSQLiteStatement f54779c;

    /* renamed from: d */
    public final SharedSQLiteStatement f54780d;

    /* renamed from: androidx.work.impl.model.k$a */
    public class C21233a extends C20361r<C21229i> {
        public C21233a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21229i iVar) {
            String str = iVar.f54774a;
            if (str == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, str);
            }
            kVar.mo60790S2(2, (long) iVar.mo63421f());
            kVar.mo60790S2(3, (long) iVar.f54776c);
        }
    }

    /* renamed from: androidx.work.impl.model.k$b */
    public class C21234b extends SharedSQLiteStatement {
        public C21234b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: androidx.work.impl.model.k$c */
    public class C21235c extends SharedSQLiteStatement {
        public C21235c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C21232k(RoomDatabase roomDatabase) {
        this.f54777a = roomDatabase;
        this.f54778b = new C21233a(roomDatabase);
        this.f54779c = new C21234b(roomDatabase);
        this.f54780d = new C21235c(roomDatabase);
    }

    /* renamed from: h */
    public static List<Class<?>> m98071h() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public C21229i mo63424a(C21237m mVar) {
        return C21230j.C21231a.m98069a(this, mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.work.impl.model.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.impl.model.C21229i mo63425b(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            androidx.room.v1 r0 = androidx.room.C20400v1.m95183d(r0, r1)
            r2 = 1
            if (r6 != 0) goto L_0x000e
            r0.mo60800u3(r2)
            goto L_0x0011
        L_0x000e:
            r0.mo60801v2(r2, r6)
        L_0x0011:
            long r6 = (long) r7
            r0.mo60790S2(r1, r6)
            androidx.room.RoomDatabase r6 = r5.f54777a
            r6.mo60904d()
            androidx.room.RoomDatabase r6 = r5.f54777a
            r7 = 0
            r1 = 0
            android.database.Cursor r6 = androidx.room.util.C20378b.m95145f(r6, r0, r7, r1)
            java.lang.String r7 = "work_spec_id"
            int r7 = androidx.room.util.C20376a.m95137e(r6, r7)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "generation"
            int r2 = androidx.room.util.C20376a.m95137e(r6, r2)     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "system_id"
            int r3 = androidx.room.util.C20376a.m95137e(r6, r3)     // Catch:{ all -> 0x005a }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0053
            boolean r4 = r6.isNull(r7)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.lang.String r1 = r6.getString(r7)     // Catch:{ all -> 0x005a }
        L_0x0045:
            int r7 = r6.getInt(r2)     // Catch:{ all -> 0x005a }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x005a }
            androidx.work.impl.model.i r3 = new androidx.work.impl.model.i     // Catch:{ all -> 0x005a }
            r3.<init>(r1, r7, r2)     // Catch:{ all -> 0x005a }
            r1 = r3
        L_0x0053:
            r6.close()
            r0.release()
            return r1
        L_0x005a:
            r7 = move-exception
            r6.close()
            r0.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21232k.mo63425b(java.lang.String, int):androidx.work.impl.model.i");
    }

    /* renamed from: c */
    public void mo63426c(C21237m mVar) {
        C21230j.C21231a.m98070b(this, mVar);
    }

    /* renamed from: d */
    public List<String> mo63427d() {
        String str;
        C20400v1 d = C20400v1.m95183d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f54777a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54777a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str = null;
                } else {
                    str = f.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: e */
    public void mo63428e(C21229i iVar) {
        this.f54777a.mo60904d();
        this.f54777a.mo60905e();
        try {
            this.f54778b.mo61158k(iVar);
            this.f54777a.mo60901O();
        } finally {
            this.f54777a.mo60908k();
        }
    }

    /* renamed from: f */
    public void mo63429f(String str, int i) {
        this.f54777a.mo60904d();
        C20492k b = this.f54779c.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        b.mo60790S2(2, (long) i);
        this.f54777a.mo60905e();
        try {
            b.mo60802y0();
            this.f54777a.mo60901O();
        } finally {
            this.f54777a.mo60908k();
            this.f54779c.mo60963h(b);
        }
    }

    /* renamed from: g */
    public void mo63430g(String str) {
        this.f54777a.mo60904d();
        C20492k b = this.f54780d.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54777a.mo60905e();
        try {
            b.mo60802y0();
            this.f54777a.mo60901O();
        } finally {
            this.f54777a.mo60908k();
            this.f54780d.mo60963h(b);
        }
    }
}
