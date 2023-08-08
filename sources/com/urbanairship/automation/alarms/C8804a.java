package com.urbanairship.automation.alarms;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.C8698y1;
import androidx.core.app.C17075f2;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9647e0;
import com.urbanairship.util.C9656j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.alarms.a */
public class C8804a implements C8809b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    public static C8804a f23567f;

    /* renamed from: a */
    public final Comparator<C8808d> f23568a;

    /* renamed from: b */
    public final List<C8808d> f23569b;

    /* renamed from: c */
    public final C9656j f23570c;

    /* renamed from: d */
    public final C8807c f23571d;

    /* renamed from: e */
    public final Context f23572e;

    /* renamed from: com.urbanairship.automation.alarms.a$a */
    public class C8805a implements Comparator<C8808d> {
        public C8805a() {
        }

        /* renamed from: a */
        public int compare(C8808d dVar, C8808d dVar2) {
            return Long.valueOf(dVar.f23576b).compareTo(Long.valueOf(dVar2.f23576b));
        }
    }

    /* renamed from: com.urbanairship.automation.alarms.a$b */
    public class C8806b implements C8807c {

        /* renamed from: a */
        public final /* synthetic */ Context f23574a;

        public C8806b(Context context) {
            this.f23574a = context;
        }

        /* renamed from: a */
        public void mo17319a(long j, @C0359n0 PendingIntent pendingIntent) {
            AlarmManager alarmManager = (AlarmManager) this.f23574a.getSystemService(C17075f2.f45116w0);
            if (alarmManager != null) {
                alarmManager.set(3, j, pendingIntent);
                return;
            }
            throw new IllegalStateException("AlarmManager unavailable");
        }
    }

    /* renamed from: com.urbanairship.automation.alarms.a$c */
    public interface C8807c {
        /* renamed from: a */
        void mo17319a(long j, @C0359n0 PendingIntent pendingIntent);
    }

    /* renamed from: com.urbanairship.automation.alarms.a$d */
    public static class C8808d {

        /* renamed from: a */
        public final Runnable f23575a;

        /* renamed from: b */
        public final long f23576b;

        public C8808d(long j, @C0359n0 Runnable runnable) {
            this.f23575a = runnable;
            this.f23576b = j;
        }
    }

    public C8804a(@C0359n0 Context context) {
        this(context, C9656j.f26468a, new C8806b(context));
    }

    @C0359n0
    /* renamed from: d */
    public static C8804a m32712d(@C0359n0 Context context) {
        synchronized (C8804a.class) {
            if (f23567f == null) {
                f23567f = new C8804a(context.getApplicationContext());
            }
        }
        return f23567f;
    }

    /* renamed from: a */
    public void mo17314a(long j, @C0359n0 Runnable runnable) {
        C8808d dVar = new C8808d(this.f23570c.mo19624b() + j, runnable);
        C36059m.m148419o("Operation scheduled with %d delay", Long.valueOf(j));
        synchronized (this.f23569b) {
            this.f23569b.add(dVar);
            Collections.sort(this.f23569b, this.f23568a);
            mo17316c();
        }
    }

    /* renamed from: b */
    public void mo17315b() {
        C36059m.m148419o("Alarm fired", new Object[0]);
        long b = this.f23570c.mo19624b();
        synchronized (this.f23569b) {
            for (C8808d dVar : new ArrayList(this.f23569b)) {
                if (dVar.f23576b <= b) {
                    dVar.f23575a.run();
                    this.f23569b.remove(dVar);
                }
            }
            mo17316c();
        }
    }

    /* renamed from: c */
    public final void mo17316c() {
        synchronized (this.f23569b) {
            if (!this.f23569b.isEmpty()) {
                long j = this.f23569b.get(0).f23576b;
                try {
                    this.f23571d.mo17319a(j, C9647e0.m36144c(this.f23572e, 0, new Intent(this.f23572e, AlarmOperationReceiver.class).setAction(AlarmOperationReceiver.f23566a), C8698y1.f23301m));
                    C36059m.m148419o("Next alarm set %d", Long.valueOf(j - this.f23570c.mo19624b()));
                } catch (Exception e) {
                    C36059m.m148411g(e, "AlarmOperationScheduler - Failed to schedule alarm.", new Object[0]);
                }
            }
        }
    }

    @C0344h1
    public C8804a(@C0359n0 Context context, @C0359n0 C9656j jVar, @C0359n0 C8807c cVar) {
        this.f23568a = new C8805a();
        this.f23569b = new ArrayList();
        this.f23572e = context;
        this.f23570c = jVar;
        this.f23571d = cVar;
    }
}
