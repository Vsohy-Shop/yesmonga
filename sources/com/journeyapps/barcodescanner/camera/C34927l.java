package com.journeyapps.barcodescanner.camera;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.journeyapps.barcodescanner.camera.l */
public class C34927l {

    /* renamed from: e */
    public static final String f84971e = "l";

    /* renamed from: f */
    public static C34927l f84972f;

    /* renamed from: a */
    public Handler f84973a;

    /* renamed from: b */
    public HandlerThread f84974b;

    /* renamed from: c */
    public int f84975c = 0;

    /* renamed from: d */
    public final Object f84976d = new Object();

    /* renamed from: e */
    public static C34927l m142847e() {
        if (f84972f == null) {
            f84972f = new C34927l();
        }
        return f84972f;
    }

    /* renamed from: a */
    public final void mo103477a() {
        synchronized (this.f84976d) {
            if (this.f84973a == null) {
                if (this.f84975c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f84974b = handlerThread;
                    handlerThread.start();
                    this.f84973a = new Handler(this.f84974b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo103478b() {
        synchronized (this.f84976d) {
            int i = this.f84975c - 1;
            this.f84975c = i;
            if (i == 0) {
                mo103482g();
            }
        }
    }

    /* renamed from: c */
    public void mo103479c(Runnable runnable) {
        synchronized (this.f84976d) {
            mo103477a();
            this.f84973a.post(runnable);
        }
    }

    /* renamed from: d */
    public void mo103480d(Runnable runnable, long j) {
        synchronized (this.f84976d) {
            mo103477a();
            this.f84973a.postDelayed(runnable, j);
        }
    }

    /* renamed from: f */
    public void mo103481f(Runnable runnable) {
        synchronized (this.f84976d) {
            this.f84975c++;
            mo103479c(runnable);
        }
    }

    /* renamed from: g */
    public final void mo103482g() {
        synchronized (this.f84976d) {
            this.f84974b.quit();
            this.f84974b = null;
            this.f84973a = null;
        }
    }
}
