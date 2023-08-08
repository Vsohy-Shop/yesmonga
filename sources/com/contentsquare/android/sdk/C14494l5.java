package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.contentsquare.android.sdk.C14274db;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.l5 */
public class C14494l5 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public C14453jf f35845a = new C14453jf("DecorViewTreeObserver");

    /* renamed from: b */
    public WeakReference<Window> f35846b = new WeakReference<>((Object) null);

    /* renamed from: c */
    public final C14274db.C14276b f35847c;

    public C14494l5(C14274db.C14276b bVar) {
        this.f35847c = bVar;
    }

    /* renamed from: a */
    public final View mo35804a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView instanceof ViewGroup) {
            return decorView;
        }
        this.f35845a.mo35676e("Cannot get decor view from activity.");
        return null;
    }

    /* renamed from: b */
    public void mo35805b(List<WeakReference<C14552nd>> list) {
        this.f35847c.mo34970c(list);
    }

    /* renamed from: c */
    public void mo35806c(Activity activity) {
        View a = mo35804a(activity);
        if (a != null && a.getViewTreeObserver().isAlive()) {
            this.f35846b = new WeakReference<>(activity.getWindow());
            a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f35845a.mo35676e("Listen to DecorView global layout.");
        }
    }

    /* renamed from: d */
    public void mo35807d(Activity activity) {
        View a = mo35804a(activity);
        if (a != null) {
            ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                C14662r2.m63242a(viewTreeObserver, this);
                this.f35845a.mo35676e("Listener to DecorView global layout removed.");
            }
        }
    }

    public void onGlobalLayout() {
        Window window = this.f35846b.get();
        if (window != null) {
            this.f35847c.mo34969b(window, C14274db.f35235d);
        }
    }
}
