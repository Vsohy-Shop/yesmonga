package com.contentsquare.android.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.core.view.C18196h2;
import com.contentsquare.android.sdk.C14681rb;

/* renamed from: com.contentsquare.android.sdk.t9 */
public class C14742t9 {

    /* renamed from: b */
    public static float f36498b = 2.0f;

    /* renamed from: a */
    public final C14747e f36499a;

    /* renamed from: com.contentsquare.android.sdk.t9$a */
    public static class C14743a extends C14747e {
        public C14743a(Context context) {
            super(context);
        }

        /* renamed from: b */
        public void mo36509b(Window window, C14745c cVar) {
            C14746d d = mo36518d();
            d.mo36514d(window);
            View decorView = window.getDecorView();
            if (C18196h2.m82539U0(decorView)) {
                d.mo36513c(decorView);
                cVar.mo34432a(d);
            }
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t9$b */
    public static class C14744b extends C14747e implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: c */
        public final C14453jf f36500c = new C14453jf("PixelCopyCapture");

        /* renamed from: d */
        public final C14438j2 f36501d;

        /* renamed from: e */
        public C14746d f36502e;

        /* renamed from: f */
        public C14745c f36503f;

        public C14744b(C14438j2 j2Var, Context context) {
            super(context);
            this.f36501d = j2Var;
        }

        /* renamed from: b */
        public void mo36509b(Window window, C14745c cVar) {
            if (this.f36503f == null) {
                this.f36503f = cVar;
                C14746d d = mo36518d();
                this.f36502e = d;
                d.mo36514d(window);
                try {
                    this.f36501d.mo35584b(window, this.f36502e.f36505b.mo36618a(), this, window.getDecorView().getHandler());
                } catch (IllegalArgumentException e) {
                    this.f36500c.mo35675d(e, "Window not draw yet.", new Object[0]);
                }
            }
        }

        public void onPixelCopyFinished(int i) {
            C14745c cVar;
            C14746d dVar;
            if (!(i != 0 || (cVar = this.f36503f) == null || (dVar = this.f36502e) == null)) {
                cVar.mo34432a(dVar);
            }
            this.f36503f = null;
            this.f36502e = null;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t9$c */
    public interface C14745c {
        /* renamed from: a */
        void mo34432a(C14746d dVar);
    }

    /* renamed from: com.contentsquare.android.sdk.t9$d */
    public static class C14746d {

        /* renamed from: a */
        public C14681rb<C14746d> f36504a;

        /* renamed from: b */
        public final C14855x9 f36505b = new C14855x9(1, 1);

        /* renamed from: c */
        public final C14792v5 f36506c = new C14792v5(1, 1);

        /* renamed from: d */
        public float f36507d;

        /* renamed from: e */
        public final Context f36508e;

        public C14746d(C14681rb<C14746d> rbVar, Context context) {
            this.f36504a = rbVar;
            this.f36508e = context;
        }

        /* renamed from: a */
        public Bitmap mo36511a(C14507le leVar) {
            int round = Math.round(((float) leVar.mo35835F()) / this.f36507d);
            int round2 = Math.round(((float) leVar.mo35836G()) / this.f36507d);
            int round3 = Math.round(((float) leVar.mo35842M()) / this.f36507d);
            int round4 = Math.round(((float) leVar.mo35832C()) / this.f36507d);
            this.f36506c.mo36622e(this.f36505b.mo36618a(), round, round2, round3, round4);
            this.f36505b.mo36818k(round, round2, round3, round4);
            return this.f36506c.mo36618a();
        }

        /* renamed from: b */
        public C14855x9 mo36512b() {
            return this.f36505b;
        }

        /* renamed from: c */
        public void mo36513c(View view) {
            this.f36505b.mo36624g(view, this.f36507d);
        }

        /* renamed from: d */
        public void mo36514d(Window window) {
            this.f36507d = window.getContext().getResources().getDisplayMetrics().density * C14742t9.f36498b;
            View decorView = window.getDecorView();
            int round = Math.round(((float) decorView.getWidth()) / this.f36507d);
            int round2 = Math.round(((float) decorView.getHeight()) / this.f36507d);
            this.f36505b.mo36619b(round, round2);
            this.f36506c.mo36619b(round, round2);
        }

        /* renamed from: e */
        public float mo36515e() {
            return this.f36507d;
        }

        /* renamed from: f */
        public void mo36516f() {
            this.f36504a.mo36347b(this);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t9$e */
    public static abstract class C14747e implements C14681rb.C14682a<C14746d> {

        /* renamed from: a */
        public final C14681rb<C14746d> f36509a = new C14681rb<>();

        /* renamed from: b */
        public final Context f36510b;

        public C14747e(Context context) {
            this.f36510b = context;
        }

        /* renamed from: b */
        public abstract void mo36509b(Window window, C14745c cVar);

        /* renamed from: c */
        public C14746d mo35875a() {
            return new C14746d(this.f36509a, this.f36510b);
        }

        /* renamed from: d */
        public C14746d mo36518d() {
            return this.f36509a.mo36346a(this);
        }
    }

    public C14742t9(int i, C14438j2 j2Var, Context context) {
        this.f36499a = i >= 26 ? new C14744b(j2Var, context) : new C14743a(context);
    }

    /* renamed from: a */
    public void mo36507a(float f) {
        f36498b = f;
    }

    /* renamed from: b */
    public void mo36508b(Window window, C14745c cVar) {
        this.f36499a.mo36509b(window, cVar);
    }

    public C14742t9(Context context) {
        this(Build.VERSION.SDK_INT, new C14438j2(), context);
    }
}
