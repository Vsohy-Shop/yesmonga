package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.perf.util.f */
public class C33437f implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a */
    public final Handler f81332a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference<View> f81333b;

    /* renamed from: c */
    public final Runnable f81334c;

    /* renamed from: d */
    public final Runnable f81335d;

    public C33437f(View view, Runnable runnable, Runnable runnable2) {
        this.f81333b = new AtomicReference<>(view);
        this.f81334c = runnable;
        this.f81335d = runnable2;
    }

    /* renamed from: a */
    public static void m134830a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new C33437f(view, runnable, runnable2));
    }

    public boolean onPreDraw() {
        View andSet = this.f81333b.getAndSet((Object) null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f81332a.post(this.f81334c);
        this.f81332a.postAtFrontOfQueue(this.f81335d);
        return true;
    }
}
