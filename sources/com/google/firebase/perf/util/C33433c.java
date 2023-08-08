package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.perf.util.c */
public class C33433c implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a */
    public final Handler f81325a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final AtomicReference<View> f81326b;

    /* renamed from: c */
    public final Runnable f81327c;

    /* renamed from: com.google.firebase.perf.util.c$a */
    public class C33434a implements View.OnAttachStateChangeListener {
        public C33434a() {
        }

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(C33433c.this);
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C33433c(View view, Runnable runnable) {
        this.f81326b = new AtomicReference<>(view);
        this.f81327c = runnable;
    }

    /* renamed from: b */
    public static boolean m134816b(View view) {
        return view.getViewTreeObserver().isAlive() && m134817c(view);
    }

    /* renamed from: c */
    public static boolean m134817c(View view) {
        return view.isAttachedToWindow();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m134818d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m134819e(View view, Runnable runnable) {
        C33433c cVar = new C33433c(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || m134816b(view)) {
            view.getViewTreeObserver().addOnDrawListener(cVar);
        } else {
            view.addOnAttachStateChangeListener(new C33434a());
        }
    }

    public void onDraw() {
        View andSet = this.f81326b.getAndSet((Object) null);
        if (andSet != null) {
            andSet.getViewTreeObserver().addOnGlobalLayoutListener(new C33432b(this, andSet));
            this.f81325a.postAtFrontOfQueue(this.f81327c);
        }
    }
}
