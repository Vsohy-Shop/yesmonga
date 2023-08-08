package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17075f2;
import androidx.work.C21377l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21229i;
import androidx.work.impl.model.C21230j;
import androidx.work.impl.model.C21236l;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.utils.C21333m;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.a */
public class C21109a {

    /* renamed from: a */
    public static final String f54507a = C21377l.m98584i("Alarms");

    @C0376v0(19)
    /* renamed from: androidx.work.impl.background.systemalarm.a$a */
    public static class C21110a {
        @C0373u
        /* renamed from: a */
        public static void m97716a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m97712a(@C0359n0 Context context, @C0359n0 WorkDatabase workDatabase, @C0359n0 C21237m mVar) {
        C21230j U = workDatabase.mo63204U();
        C21229i a = U.mo63424a(mVar);
        if (a != null) {
            m97713b(context, mVar, a.f54776c);
            C21377l e = C21377l.m98582e();
            String str = f54507a;
            e.mo63774a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            U.mo63426c(mVar);
        }
    }

    /* renamed from: b */
    public static void m97713b(@C0359n0 Context context, @C0359n0 C21237m mVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C17075f2.f45116w0);
        PendingIntent service = PendingIntent.getService(context, i, C21111b.m97718b(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            C21377l e = C21377l.m98582e();
            String str = f54507a;
            e.mo63774a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m97714c(@C0359n0 Context context, @C0359n0 WorkDatabase workDatabase, @C0359n0 C21237m mVar, long j) {
        C21230j U = workDatabase.mo63204U();
        C21229i a = U.mo63424a(mVar);
        if (a != null) {
            m97713b(context, mVar, a.f54776c);
            m97715d(context, mVar, a.f54776c, j);
            return;
        }
        int c = new C21333m(workDatabase).mo63686c();
        U.mo63428e(C21236l.m98084a(mVar, c));
        m97715d(context, mVar, c, j);
    }

    /* renamed from: d */
    public static void m97715d(@C0359n0 Context context, @C0359n0 C21237m mVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C17075f2.f45116w0);
        PendingIntent service = PendingIntent.getService(context, i, C21111b.m97718b(context, mVar), 201326592);
        if (alarmManager != null) {
            C21110a.m97716a(alarmManager, 0, j, service);
        }
    }
}
