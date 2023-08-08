package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import androidx.work.impl.model.C21275z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.model.a0 */
public final class C21208a0 implements C21275z {

    /* renamed from: a */
    public final RoomDatabase f54734a;

    /* renamed from: b */
    public final C20361r<C21274y> f54735b;

    /* renamed from: c */
    public final SharedSQLiteStatement f54736c;

    /* renamed from: androidx.work.impl.model.a0$a */
    public class C21209a extends C20361r<C21274y> {
        public C21209a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21274y yVar) {
            if (yVar.mo63573a() == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, yVar.mo63573a());
            }
            if (yVar.mo63574b() == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, yVar.mo63574b());
            }
        }
    }

    /* renamed from: androidx.work.impl.model.a0$b */
    public class C21210b extends SharedSQLiteStatement {
        public C21210b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C21208a0(RoomDatabase roomDatabase) {
        this.f54734a = roomDatabase;
        this.f54735b = new C21209a(roomDatabase);
        this.f54736c = new C21210b(roomDatabase);
    }

    /* renamed from: f */
    public static List<Class<?>> m97993f() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public List<String> mo63383a(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54734a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54734a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: b */
    public void mo63384b(String str) {
        this.f54734a.mo60904d();
        C20492k b = this.f54736c.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54734a.mo60905e();
        try {
            b.mo60802y0();
            this.f54734a.mo60901O();
        } finally {
            this.f54734a.mo60908k();
            this.f54736c.mo60963h(b);
        }
    }

    /* renamed from: c */
    public void mo63385c(C21274y yVar) {
        this.f54734a.mo60904d();
        this.f54734a.mo60905e();
        try {
            this.f54735b.mo61158k(yVar);
            this.f54734a.mo60901O();
        } finally {
            this.f54734a.mo60908k();
        }
    }

    /* renamed from: d */
    public List<String> mo63386d(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54734a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54734a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                if (f.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = f.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: e */
    public void mo63387e(String str, Set<String> set) {
        C21275z.C21276a.m98288a(this, str, set);
    }
}
