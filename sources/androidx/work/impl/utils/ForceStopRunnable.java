package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.compose.runtime.C8698y1;
import androidx.core.app.C17075f2;
import androidx.core.util.C17970d;
import androidx.work.C21082a;
import androidx.work.C21377l;
import androidx.work.WorkInfo;
import androidx.work.impl.C21103b0;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21290u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C21132g;
import androidx.work.impl.model.C21243r;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    public static final String f54936e = C21377l.m98584i("ForceStopRunnable");
    @C0344h1

    /* renamed from: f */
    public static final String f54937f = "ACTION_FORCE_STOP_RESCHEDULE";
    @C0344h1

    /* renamed from: g */
    public static final int f54938g = 3;

    /* renamed from: v */
    public static final int f54939v = -1;

    /* renamed from: w */
    public static final long f54940w = 300;

    /* renamed from: x */
    public static final long f54941x = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    public final Context f54942a;

    /* renamed from: b */
    public final C21191g0 f54943b;

    /* renamed from: c */
    public final C21342t f54944c;

    /* renamed from: d */
    public int f54945d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f54946a = C21377l.m98584i("ForceStopRunnable$Rcvr");

        public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
            if (intent != null && ForceStopRunnable.f54937f.equals(intent.getAction())) {
                C21377l.m98582e().mo63780j(f54946a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.m98348h(context);
            }
        }
    }

    public ForceStopRunnable(@C0359n0 Context context, @C0359n0 C21191g0 g0Var) {
        this.f54942a = context.getApplicationContext();
        this.f54943b = g0Var;
        this.f54944c = g0Var.mo63358K();
    }

    @C0344h1
    /* renamed from: d */
    public static Intent m98346d(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction(f54937f);
        return intent;
    }

    /* renamed from: e */
    public static PendingIntent m98347e(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m98346d(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: h */
    public static void m98348h(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(C17075f2.f45116w0);
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = C8698y1.f23301m;
        }
        PendingIntent e = m98347e(context, i);
        long currentTimeMillis = System.currentTimeMillis() + f54941x;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, e);
        }
    }

    @C0344h1
    /* renamed from: a */
    public boolean mo63619a() {
        boolean z;
        boolean i = C21132g.m97783i(this.f54942a, this.f54943b);
        WorkDatabase P = this.f54943b.mo63363P();
        C21253v X = P.mo63207X();
        C21243r W = P.mo63206W();
        P.mo60905e();
        try {
            List<C21249u> A = X.mo63518A();
            if (A == null || A.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                for (C21249u next : A) {
                    X.mo63550w(WorkInfo.State.ENQUEUED, next.f54804a);
                    X.mo63547t(next.f54804a, -1);
                }
            }
            W.mo63448a();
            P.mo60901O();
            if (z || i) {
                return true;
            }
            return false;
        } finally {
            P.mo60908k();
        }
    }

    @C0344h1
    /* renamed from: c */
    public void mo63620c() {
        boolean a = mo63619a();
        if (mo63623i()) {
            C21377l.m98582e().mo63774a(f54936e, "Rescheduling Workers.");
            this.f54943b.mo63368U();
            this.f54943b.mo63358K().mo63695h(false);
        } else if (mo63621f()) {
            C21377l.m98582e().mo63774a(f54936e, "Application was force-stopped, rescheduling.");
            this.f54943b.mo63368U();
            this.f54944c.mo63694g(System.currentTimeMillis());
        } else if (a) {
            C21377l.m98582e().mo63774a(f54936e, "Found unfinished work, scheduling it.");
            C21290u.m98344b(this.f54943b.mo63065o(), this.f54943b.mo63363P(), this.f54943b.mo63361N());
        }
    }

    @C0344h1
    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: f */
    public boolean mo63621f() {
        int i;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                i = 570425344;
            } else {
                i = 536870912;
            }
            PendingIntent e = m98347e(this.f54942a, i);
            if (i2 >= 30) {
                if (e != null) {
                    e.cancel();
                }
                List a = ((ActivityManager) this.f54942a.getSystemService(C0696c.f2306r)).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a != null && !a.isEmpty()) {
                    long c = this.f54944c.mo63691c();
                    for (int i3 = 0; i3 < a.size(); i3++) {
                        ApplicationExitInfo a2 = C21322h.m98431a(a.get(i3));
                        if (a2.getReason() == 10 && a2.getTimestamp() >= c) {
                            return true;
                        }
                    }
                }
            } else if (e == null) {
                m98348h(this.f54942a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e2) {
            C21377l.m98582e().mo63783m(f54936e, "Ignoring exception", e2);
            return true;
        }
    }

    @C0344h1
    /* renamed from: g */
    public boolean mo63622g() {
        C21082a o = this.f54943b.mo63065o();
        if (TextUtils.isEmpty(o.mo63097c())) {
            C21377l.m98582e().mo63774a(f54936e, "The default process name was not specified.");
            return true;
        }
        boolean b = C21349u.m98478b(this.f54942a, o);
        C21377l e = C21377l.m98582e();
        String str = f54936e;
        e.mo63774a(str, "Is default app process = " + b);
        return b;
    }

    @C0344h1
    /* renamed from: i */
    public boolean mo63623i() {
        return this.f54943b.mo63358K().mo63692d();
    }

    @C0344h1
    /* renamed from: j */
    public void mo63624j(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo63622g()) {
                this.f54943b.mo63367T();
                return;
            }
            while (true) {
                C21103b0.m97691d(this.f54942a);
                C21377l.m98582e().mo63774a(f54936e, "Performing cleanup operations.");
                mo63620c();
                break;
            }
            this.f54943b.mo63367T();
        } catch (SQLiteException e) {
            C21377l.m98582e().mo63776c(f54936e, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e);
            C17970d<Throwable> e2 = this.f54943b.mo63065o().mo63099e();
            if (e2 != null) {
                e2.accept(illegalStateException);
            } else {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e3) {
            int i = this.f54945d + 1;
            this.f54945d = i;
            if (i >= 3) {
                C21377l e4 = C21377l.m98582e();
                String str = f54936e;
                e4.mo63777d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e3);
                C17970d<Throwable> e5 = this.f54943b.mo63065o().mo63099e();
                if (e5 != null) {
                    C21377l.m98582e().mo63775b(str, "Routing exception to the specified exception handler", illegalStateException2);
                    e5.accept(illegalStateException2);
                } else {
                    throw illegalStateException2;
                }
            } else {
                C21377l e6 = C21377l.m98582e();
                String str2 = f54936e;
                e6.mo63775b(str2, "Retrying after " + (((long) i) * 300), e3);
                mo63624j(((long) this.f54945d) * 300);
            }
        } catch (Throwable th) {
            this.f54943b.mo63367T();
            throw th;
        }
    }
}
