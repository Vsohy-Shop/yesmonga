package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.p031db.C20466f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21221d;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.utils.n */
public final class C21334n {

    /* renamed from: a */
    public static final int f55037a = 0;
    @C12579k

    /* renamed from: b */
    public static final String f55038b = "next_job_scheduler_id";
    @C12579k

    /* renamed from: c */
    public static final String f55039c = "next_alarm_manager_id";
    @C12579k

    /* renamed from: d */
    public static final String f55040d = "androidx.work.util.id";

    /* renamed from: c */
    public static final void m98448c(@C12579k Context context, @C12579k C20466f fVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences(f55040d, 0);
        if (sharedPreferences.contains(f55038b) || sharedPreferences.contains(f55038b)) {
            int i = sharedPreferences.getInt(f55038b, 0);
            int i2 = sharedPreferences.getInt(f55039c, 0);
            fVar.mo60775j0();
            try {
                fVar.mo60766f1(C21342t.f55049b, new Object[]{f55038b, Integer.valueOf(i)});
                fVar.mo60766f1(C21342t.f55049b, new Object[]{f55039c, Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                fVar.mo60764e1();
            } finally {
                fVar.mo60784t1();
            }
        }
    }

    /* renamed from: d */
    public static final int m98449d(WorkDatabase workDatabase, String str) {
        int i;
        Long c = workDatabase.mo63202S().mo63405c(str);
        int i2 = 0;
        if (c != null) {
            i = (int) c.longValue();
        } else {
            i = 0;
        }
        if (i != Integer.MAX_VALUE) {
            i2 = i + 1;
        }
        m98450e(workDatabase, str, i2);
        return i;
    }

    /* renamed from: e */
    public static final void m98450e(WorkDatabase workDatabase, String str, int i) {
        workDatabase.mo63202S().mo63404b(new C21221d(str, Long.valueOf((long) i)));
    }
}
