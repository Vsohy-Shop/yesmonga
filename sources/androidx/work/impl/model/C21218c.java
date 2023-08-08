package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.model.c */
public final class C21218c implements C21211b {

    /* renamed from: a */
    public final RoomDatabase f54761a;

    /* renamed from: b */
    public final C20361r<C21207a> f54762b;

    /* renamed from: androidx.work.impl.model.c$a */
    public class C21219a extends C20361r<C21207a> {
        public C21219a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21207a aVar) {
            if (aVar.mo63382b() == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, aVar.mo63382b());
            }
            if (aVar.mo63381a() == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, aVar.mo63381a());
            }
        }
    }

    public C21218c(RoomDatabase roomDatabase) {
        this.f54761a = roomDatabase;
        this.f54762b = new C21219a(roomDatabase);
    }

    /* renamed from: f */
    public static List<Class<?>> m98018f() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo63389a(C21207a aVar) {
        this.f54761a.mo60904d();
        this.f54761a.mo60905e();
        try {
            this.f54762b.mo61158k(aVar);
            this.f54761a.mo60901O();
        } finally {
            this.f54761a.mo60908k();
        }
    }

    /* renamed from: b */
    public List<String> mo63390b(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54761a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54761a, d, false, (CancellationSignal) null);
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

    /* renamed from: c */
    public boolean mo63391c(String str) {
        boolean z = true;
        C20400v1 d = C20400v1.m95183d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54761a.mo60904d();
        boolean z2 = false;
        Cursor f = C20378b.m95145f(this.f54761a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (f.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: d */
    public boolean mo63392d(String str) {
        boolean z = true;
        C20400v1 d = C20400v1.m95183d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54761a.mo60904d();
        boolean z2 = false;
        Cursor f = C20378b.m95145f(this.f54761a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (f.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: e */
    public List<String> mo63393e(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54761a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54761a, d, false, (CancellationSignal) null);
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
}
