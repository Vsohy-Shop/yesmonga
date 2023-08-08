package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.app.k */
public final class C17148k {

    @C0376v0(19)
    /* renamed from: androidx.core.app.k$a */
    public static class C17149a {
        @C0373u
        /* renamed from: a */
        public static void m79383a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.app.k$b */
    public static class C17150b {
        @C0373u
        /* renamed from: a */
        public static AlarmManager.AlarmClockInfo m79384a(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        @C0373u
        /* renamed from: b */
        public static void m79385b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.app.k$c */
    public static class C17151c {
        @C0373u
        /* renamed from: a */
        public static void m79386a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        @C0373u
        /* renamed from: b */
        public static void m79387b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static void m79379a(@C0359n0 AlarmManager alarmManager, long j, @C0359n0 PendingIntent pendingIntent, @C0359n0 PendingIntent pendingIntent2) {
        C17150b.m79385b(alarmManager, C17150b.m79384a(j, pendingIntent), pendingIntent2);
    }

    /* renamed from: b */
    public static void m79380b(@C0359n0 AlarmManager alarmManager, int i, long j, @C0359n0 PendingIntent pendingIntent) {
        C17151c.m79386a(alarmManager, i, j, pendingIntent);
    }

    /* renamed from: c */
    public static void m79381c(@C0359n0 AlarmManager alarmManager, int i, long j, @C0359n0 PendingIntent pendingIntent) {
        C17149a.m79383a(alarmManager, i, j, pendingIntent);
    }

    /* renamed from: d */
    public static void m79382d(@C0359n0 AlarmManager alarmManager, int i, long j, @C0359n0 PendingIntent pendingIntent) {
        C17151c.m79387b(alarmManager, i, j, pendingIntent);
    }
}
