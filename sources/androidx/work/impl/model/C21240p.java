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

/* renamed from: androidx.work.impl.model.p */
public final class C21240p implements C21239o {

    /* renamed from: a */
    public final RoomDatabase f54788a;

    /* renamed from: b */
    public final C20361r<C21238n> f54789b;

    /* renamed from: androidx.work.impl.model.p$a */
    public class C21241a extends C20361r<C21238n> {
        public C21241a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21238n nVar) {
            if (nVar.mo63440a() == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, nVar.mo63440a());
            }
            if (nVar.mo63441b() == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60801v2(2, nVar.mo63441b());
            }
        }
    }

    public C21240p(RoomDatabase roomDatabase) {
        this.f54788a = roomDatabase;
        this.f54789b = new C21241a(roomDatabase);
    }

    /* renamed from: d */
    public static List<Class<?>> m98096d() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo63442a(C21238n nVar) {
        this.f54788a.mo60904d();
        this.f54788a.mo60905e();
        try {
            this.f54789b.mo61158k(nVar);
            this.f54788a.mo60901O();
        } finally {
            this.f54788a.mo60908k();
        }
    }

    /* renamed from: b */
    public List<String> mo63443b(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54788a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54788a, d, false, (CancellationSignal) null);
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
    public List<String> mo63444c(String str) {
        String str2;
        C20400v1 d = C20400v1.m95183d("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54788a.mo60904d();
        Cursor f = C20378b.m95145f(this.f54788a, d, false, (CancellationSignal) null);
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
