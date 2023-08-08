package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.preference.Preference;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.model.f */
public final class C21223f implements C21222e {

    /* renamed from: a */
    public final RoomDatabase f54766a;

    /* renamed from: b */
    public final C20361r<C21221d> f54767b;

    /* renamed from: androidx.work.impl.model.f$a */
    public class C21224a extends C20361r<C21221d> {
        public C21224a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21221d dVar) {
            if (dVar.mo63398e() == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, dVar.mo63398e());
            }
            if (dVar.mo63400f() == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60790S2(2, dVar.mo63400f().longValue());
            }
        }
    }

    /* renamed from: androidx.work.impl.model.f$b */
    public class C21225b implements Callable<Long> {

        /* renamed from: a */
        public final /* synthetic */ C20400v1 f54769a;

        public C21225b(C20400v1 v1Var) {
            this.f54769a = v1Var;
        }

        /* renamed from: a */
        public Long call() throws Exception {
            Long l = null;
            Cursor f = C20378b.m95145f(C21223f.this.f54766a, this.f54769a, false, (CancellationSignal) null);
            try {
                if (f.moveToFirst()) {
                    if (!f.isNull(0)) {
                        l = Long.valueOf(f.getLong(0));
                    }
                }
                return l;
            } finally {
                f.close();
            }
        }

        public void finalize() {
            this.f54769a.release();
        }
    }

    public C21223f(RoomDatabase roomDatabase) {
        this.f54766a = roomDatabase;
        this.f54767b = new C21224a(roomDatabase);
    }

    /* renamed from: e */
    public static List<Class<?>> m98037e() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public LiveData<Long> mo63403a(String str) {
        C20400v1 d = C20400v1.m95183d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        return this.f54766a.mo60912p().mo61015e(new String[]{Preference.f50843h1}, false, new C21225b(d));
    }

    /* renamed from: b */
    public void mo63404b(C21221d dVar) {
        this.f54766a.mo60904d();
        this.f54766a.mo60905e();
        try {
            this.f54767b.mo61158k(dVar);
            this.f54766a.mo60901O();
        } finally {
            this.f54766a.mo60908k();
        }
    }

    /* renamed from: c */
    public Long mo63405c(String str) {
        C20400v1 d = C20400v1.m95183d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54766a.mo60904d();
        Long l = null;
        Cursor f = C20378b.m95145f(this.f54766a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (!f.isNull(0)) {
                    l = Long.valueOf(f.getLong(0));
                }
            }
            return l;
        } finally {
            f.close();
            d.release();
        }
    }
}
