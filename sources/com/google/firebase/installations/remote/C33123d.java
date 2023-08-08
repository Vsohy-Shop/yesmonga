package com.google.firebase.installations.remote;

import androidx.annotation.C0323b0;
import com.google.firebase.installations.C33124s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.remote.d */
public class C33123d {

    /* renamed from: d */
    public static final long f80349d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f80350e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C33124s f80351a;
    @C0323b0("this")

    /* renamed from: b */
    public long f80352b;
    @C0323b0("this")

    /* renamed from: c */
    public int f80353c;

    public C33123d(C33124s sVar) {
        this.f80351a = sVar;
    }

    /* renamed from: c */
    public static boolean m133611c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    public static boolean m133612d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: a */
    public final synchronized long mo95904a(int i) {
        if (!m133611c(i)) {
            return f80349d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f80353c) + ((double) this.f80351a.mo95910e()), (double) f80350e);
    }

    /* renamed from: b */
    public synchronized boolean mo95905b() {
        boolean z;
        if (this.f80353c == 0 || this.f80351a.mo95908a() > this.f80352b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public final synchronized void mo95906e() {
        this.f80353c = 0;
    }

    /* renamed from: f */
    public synchronized void mo95907f(int i) {
        if (m133612d(i)) {
            mo95906e();
            return;
        }
        this.f80353c++;
        this.f80352b = this.f80351a.mo95908a() + mo95904a(i);
    }

    public C33123d() {
        this.f80351a = C33124s.m133617c();
    }
}
