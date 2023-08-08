package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C20361r;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.C20378b;
import androidx.sqlite.p031db.C20492k;
import androidx.work.C21091d;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.model.s */
public final class C21244s implements C21243r {

    /* renamed from: a */
    public final RoomDatabase f54793a;

    /* renamed from: b */
    public final C20361r<C21242q> f54794b;

    /* renamed from: c */
    public final SharedSQLiteStatement f54795c;

    /* renamed from: d */
    public final SharedSQLiteStatement f54796d;

    /* renamed from: androidx.work.impl.model.s$a */
    public class C21245a extends C20361r<C21242q> {
        public C21245a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: t */
        public void mo17583i(C20492k kVar, C21242q qVar) {
            if (qVar.mo63447b() == null) {
                kVar.mo60800u3(1);
            } else {
                kVar.mo60801v2(1, qVar.mo63447b());
            }
            byte[] F = C21091d.m97574F(qVar.mo63446a());
            if (F == null) {
                kVar.mo60800u3(2);
            } else {
                kVar.mo60791a3(2, F);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.s$b */
    public class C21246b extends SharedSQLiteStatement {
        public C21246b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.s$c */
    public class C21247c extends SharedSQLiteStatement {
        public C21247c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: e */
        public String mo17582e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C21244s(RoomDatabase roomDatabase) {
        this.f54793a = roomDatabase;
        this.f54794b = new C21245a(roomDatabase);
        this.f54795c = new C21246b(roomDatabase);
        this.f54796d = new C21247c(roomDatabase);
    }

    /* renamed from: e */
    public static List<Class<?>> m98109e() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo63448a() {
        this.f54793a.mo60904d();
        C20492k b = this.f54796d.mo60958b();
        this.f54793a.mo60905e();
        try {
            b.mo60802y0();
            this.f54793a.mo60901O();
        } finally {
            this.f54793a.mo60908k();
            this.f54796d.mo60963h(b);
        }
    }

    /* renamed from: b */
    public void mo63449b(String str) {
        this.f54793a.mo60904d();
        C20492k b = this.f54795c.mo60958b();
        if (str == null) {
            b.mo60800u3(1);
        } else {
            b.mo60801v2(1, str);
        }
        this.f54793a.mo60905e();
        try {
            b.mo60802y0();
            this.f54793a.mo60901O();
        } finally {
            this.f54793a.mo60908k();
            this.f54795c.mo60963h(b);
        }
    }

    /* renamed from: c */
    public C21091d mo63450c(String str) {
        byte[] bArr;
        C20400v1 d = C20400v1.m95183d("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (str == null) {
            d.mo60800u3(1);
        } else {
            d.mo60801v2(1, str);
        }
        this.f54793a.mo60904d();
        C21091d dVar = null;
        Cursor f = C20378b.m95145f(this.f54793a, d, false, (CancellationSignal) null);
        try {
            if (f.moveToFirst()) {
                if (f.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = f.getBlob(0);
                }
                if (bArr != null) {
                    dVar = C21091d.m97587m(bArr);
                }
            }
            return dVar;
        } finally {
            f.close();
            d.release();
        }
    }

    /* renamed from: d */
    public void mo63451d(C21242q qVar) {
        this.f54793a.mo60904d();
        this.f54793a.mo60905e();
        try {
            this.f54794b.mo61158k(qVar);
            this.f54793a.mo60901O();
        } finally {
            this.f54793a.mo60908k();
        }
    }
}
