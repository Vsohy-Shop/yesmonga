package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: com.journeyapps.barcodescanner.t */
public class C34957t {

    /* renamed from: a */
    public int f85041a;

    /* renamed from: b */
    public WindowManager f85042b;

    /* renamed from: c */
    public OrientationEventListener f85043c;

    /* renamed from: d */
    public C34956s f85044d;

    /* renamed from: com.journeyapps.barcodescanner.t$a */
    public class C34958a extends OrientationEventListener {
        public C34958a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager a = C34957t.this.f85042b;
            C34956s b = C34957t.this.f85044d;
            if (C34957t.this.f85042b != null && b != null && (rotation = a.getDefaultDisplay().getRotation()) != C34957t.this.f85041a) {
                int unused = C34957t.this.f85041a = rotation;
                b.mo103323a(rotation);
            }
        }
    }

    /* renamed from: e */
    public void mo103547e(Context context, C34956s sVar) {
        mo103548f();
        Context applicationContext = context.getApplicationContext();
        this.f85044d = sVar;
        this.f85042b = (WindowManager) applicationContext.getSystemService("window");
        C34958a aVar = new C34958a(applicationContext, 3);
        this.f85043c = aVar;
        aVar.enable();
        this.f85041a = this.f85042b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void mo103548f() {
        OrientationEventListener orientationEventListener = this.f85043c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f85043c = null;
        this.f85042b = null;
        this.f85044d = null;
    }
}
