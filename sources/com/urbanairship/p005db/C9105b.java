package com.urbanairship.p005db;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20466f;
import androidx.sqlite.p031db.C20481g;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.db.b */
public class C9105b implements C20481g {

    /* renamed from: c */
    public static final int f24610c = 3;

    /* renamed from: d */
    public static final long f24611d = 300;
    @C0359n0

    /* renamed from: a */
    public final C20481g f24612a;

    /* renamed from: b */
    public final boolean f24613b;

    /* renamed from: com.urbanairship.db.b$a */
    public static class C9106a implements C20481g.C20487c {
        @C0359n0

        /* renamed from: a */
        public final C20481g.C20487c f24614a;

        /* renamed from: b */
        public final boolean f24615b;

        public C9106a(@C0359n0 C20481g.C20487c cVar, boolean z) {
            this.f24614a = cVar;
            this.f24615b = z;
        }

        @C0359n0
        /* renamed from: a */
        public C20481g mo18120a(@C0359n0 C20481g.C20484b bVar) {
            return new C9105b(this.f24614a.mo18120a(bVar), this.f24615b);
        }
    }

    public C9105b(@C0359n0 C20481g gVar, boolean z) {
        this.f24612a = gVar;
        this.f24613b = z;
    }

    /* renamed from: Z2 */
    public C20466f mo18111Z2() {
        return mo18113b(false);
    }

    /* renamed from: a */
    public final C20466f mo18112a(boolean z) {
        if (z) {
            return this.f24612a.mo18117d3();
        }
        return this.f24612a.mo18111Z2();
    }

    /* renamed from: b */
    public final C20466f mo18113b(boolean z) {
        SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException;
        String message;
        File parentFile;
        String databaseName = getDatabaseName();
        if (!(databaseName == null || (parentFile = new File(getDatabaseName()).getParentFile()) == null || parentFile.exists())) {
            parentFile.mkdirs();
        }
        int i = 0;
        while (i < 2) {
            try {
                return mo18112a(z);
            } catch (Exception unused) {
                mo18114c();
                SystemClock.sleep(300);
                i++;
            }
        }
        try {
            return mo18112a(z);
        } catch (Exception e) {
            mo18114c();
            if (databaseName == null || !this.f24613b) {
                throw new RuntimeException(e);
            }
            if (e.getCause() instanceof SQLiteCantOpenDatabaseException) {
                sQLiteCantOpenDatabaseException = (SQLiteCantOpenDatabaseException) e.getCause();
            } else if (e instanceof SQLiteCantOpenDatabaseException) {
                sQLiteCantOpenDatabaseException = (SQLiteCantOpenDatabaseException) e;
            } else {
                sQLiteCantOpenDatabaseException = null;
            }
            if (!(sQLiteCantOpenDatabaseException == null || (message = sQLiteCantOpenDatabaseException.getMessage()) == null || !message.startsWith("unknown error (code 14 SQLITE_CANTOPEN)"))) {
                mo18116d();
            }
            return mo18112a(z);
        }
    }

    /* renamed from: c */
    public final void mo18114c() {
        try {
            close();
        } catch (Exception unused) {
        }
    }

    public void close() {
        this.f24612a.close();
    }

    /* renamed from: d */
    public final void mo18116d() {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            try {
                new File(databaseName).delete();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d3 */
    public C20466f mo18117d3() {
        return mo18113b(true);
    }

    @C0363p0
    public String getDatabaseName() {
        return this.f24612a.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f24612a.setWriteAheadLoggingEnabled(z);
    }
}
