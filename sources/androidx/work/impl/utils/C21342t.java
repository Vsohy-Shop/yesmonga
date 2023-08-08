package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.p031db.C20466f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21221d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.t */
public class C21342t {

    /* renamed from: b */
    public static final String f55049b = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";

    /* renamed from: c */
    public static final String f55050c = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";

    /* renamed from: d */
    public static final String f55051d = "androidx.work.util.preferences";

    /* renamed from: e */
    public static final String f55052e = "last_cancel_all_time_ms";

    /* renamed from: f */
    public static final String f55053f = "reschedule_needed";

    /* renamed from: g */
    public static final String f55054g = "last_force_stop_ms";

    /* renamed from: a */
    public final WorkDatabase f55055a;

    /* renamed from: androidx.work.impl.utils.t$a */
    public class C21343a implements C0843a<Long, Long> {
        public C21343a() {
        }

        /* renamed from: a */
        public Long apply(Long l) {
            return Long.valueOf(l != null ? l.longValue() : 0);
        }
    }

    public C21342t(@C0359n0 WorkDatabase workDatabase) {
        this.f55055a = workDatabase;
    }

    /* renamed from: e */
    public static void m98461e(@C0359n0 Context context, @C0359n0 C20466f fVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f55051d, 0);
        if (sharedPreferences.contains(f55053f) || sharedPreferences.contains(f55052e)) {
            long j = 0;
            long j2 = sharedPreferences.getLong(f55052e, 0);
            if (sharedPreferences.getBoolean(f55053f, false)) {
                j = 1;
            }
            fVar.mo60775j0();
            try {
                fVar.mo60766f1(f55049b, new Object[]{f55052e, Long.valueOf(j2)});
                fVar.mo60766f1(f55049b, new Object[]{f55053f, Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                fVar.mo60764e1();
            } finally {
                fVar.mo60784t1();
            }
        }
    }

    /* renamed from: a */
    public long mo63689a() {
        Long c = this.f55055a.mo63202S().mo63405c(f55052e);
        if (c != null) {
            return c.longValue();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: b */
    public LiveData<Long> mo63690b() {
        return Transformations.m90602b(this.f55055a.mo63202S().mo63403a(f55052e), new C21343a());
    }

    /* renamed from: c */
    public long mo63691c() {
        Long c = this.f55055a.mo63202S().mo63405c(f55054g);
        if (c != null) {
            return c.longValue();
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo63692d() {
        Long c = this.f55055a.mo63202S().mo63405c(f55053f);
        if (c == null || c.longValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo63693f(long j) {
        this.f55055a.mo63202S().mo63404b(new C21221d(f55052e, Long.valueOf(j)));
    }

    /* renamed from: g */
    public void mo63694g(long j) {
        this.f55055a.mo63202S().mo63404b(new C21221d(f55054g, Long.valueOf(j)));
    }

    /* renamed from: h */
    public void mo63695h(boolean z) {
        this.f55055a.mo63202S().mo63404b(new C21221d(f55053f, z));
    }
}
