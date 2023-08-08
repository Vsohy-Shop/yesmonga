package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.contentsquare.android.sdk.zc */
public class C14930zc implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final C14453jf f37008a;

    /* renamed from: b */
    public C14531mc f37009b;

    /* renamed from: c */
    public C14931a f37010c;

    /* renamed from: d */
    public WeakReference<Window> f37011d;

    /* renamed from: com.contentsquare.android.sdk.zc$a */
    public static abstract class C14931a implements Runnable {

        /* renamed from: a */
        public WeakReference<Window> f37012a = new WeakReference<>((Object) null);

        /* renamed from: b */
        public abstract void mo34433b(Window window);

        /* renamed from: c */
        public void mo36985c(WeakReference<Window> weakReference) {
            this.f37012a = weakReference;
        }

        public void run() {
            Window window = this.f37012a.get();
            if (window != null) {
                mo34433b(window);
            }
        }
    }

    public C14930zc() {
        this(new C14453jf("OnDrawObserver"));
    }

    /* renamed from: a */
    public final View mo36978a() {
        Window window = this.f37011d.get();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView instanceof ViewGroup) {
            return decorView;
        }
        this.f37008a.mo35676e("Cannot get decor view from activity.");
        return null;
    }

    /* renamed from: b */
    public void mo36979b(Activity activity) {
        mo36983f();
        this.f37011d = new WeakReference<>(activity.getWindow());
        View a = mo36978a();
        if (a != null && a.getViewTreeObserver().isAlive()) {
            a.getViewTreeObserver().addOnPreDrawListener(this);
            this.f37008a.mo35676e("Listen to draws.");
        }
    }

    /* renamed from: c */
    public void mo36980c(C14531mc mcVar) {
        this.f37009b = mcVar;
    }

    /* renamed from: d */
    public void mo36981d(C14931a aVar) {
        this.f37010c = aVar;
    }

    /* renamed from: e */
    public void mo36982e() {
        onPreDraw();
    }

    /* renamed from: f */
    public void mo36983f() {
        View a = mo36978a();
        if (a != null) {
            ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
                this.f37008a.mo35676e("Listener to onDraw removed.");
            }
        }
    }

    public boolean onPreDraw() {
        try {
            C14931a aVar = this.f37010c;
            if (!(aVar == null || this.f37009b == null)) {
                aVar.mo36985c(this.f37011d);
                this.f37009b.mo35922b(this.f37010c);
            }
            this.f37008a.mo35676e("onPreDraw called.");
        } catch (Exception e) {
            this.f37008a.mo35676e("Something went wrong with onPreDraw.");
            this.f37008a.mo35674c("Exception message: %s ", e);
        }
        return true;
    }

    public C14930zc(C14453jf jfVar) {
        this.f37011d = new WeakReference<>((Object) null);
        this.f37008a = jfVar;
    }
}
