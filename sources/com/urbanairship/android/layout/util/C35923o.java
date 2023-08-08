package com.urbanairship.android.layout.util;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.urbanairship.android.layout.util.o */
public abstract class C35923o {

    /* renamed from: a */
    public boolean f88824a;

    /* renamed from: b */
    public long f88825b;

    /* renamed from: c */
    public long f88826c;

    /* renamed from: d */
    public long f88827d;

    /* renamed from: e */
    public final Handler f88828e = new Handler();

    /* renamed from: f */
    public final Runnable f88829f = new C35924a();

    /* renamed from: com.urbanairship.android.layout.util.o$a */
    public class C35924a implements Runnable {
        public C35924a() {
        }

        public void run() {
            if (C35923o.this.f88824a) {
                C35923o.this.mo107584e();
                C35923o.this.mo18316c();
            }
        }
    }

    public C35923o(long j) {
        this.f88826c = j;
    }

    /* renamed from: b */
    public long mo107582b() {
        if (this.f88824a) {
            return (this.f88827d + SystemClock.elapsedRealtime()) - this.f88825b;
        }
        return this.f88827d;
    }

    /* renamed from: c */
    public abstract void mo18316c();

    /* renamed from: d */
    public void mo107583d() {
        if (!this.f88824a) {
            this.f88824a = true;
            this.f88825b = SystemClock.elapsedRealtime();
            long j = this.f88826c;
            if (j > 0) {
                this.f88828e.postDelayed(this.f88829f, j);
            } else {
                this.f88828e.post(this.f88829f);
            }
        }
    }

    /* renamed from: e */
    public void mo107584e() {
        if (this.f88824a) {
            this.f88827d = SystemClock.elapsedRealtime() - this.f88825b;
            this.f88824a = false;
            this.f88828e.removeCallbacks(this.f88829f);
            this.f88826c = Math.max(0, this.f88826c - (SystemClock.elapsedRealtime() - this.f88825b));
        }
    }
}
