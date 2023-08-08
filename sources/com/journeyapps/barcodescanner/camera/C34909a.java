package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.journeyapps.barcodescanner.camera.a */
public final class C34909a {

    /* renamed from: i */
    public static final String f84905i = "a";

    /* renamed from: j */
    public static final long f84906j = 2000;

    /* renamed from: k */
    public static final Collection<String> f84907k;

    /* renamed from: a */
    public boolean f84908a;

    /* renamed from: b */
    public boolean f84909b;

    /* renamed from: c */
    public final boolean f84910c;

    /* renamed from: d */
    public final Camera f84911d;

    /* renamed from: e */
    public Handler f84912e;

    /* renamed from: f */
    public int f84913f = 1;

    /* renamed from: g */
    public final Handler.Callback f84914g;

    /* renamed from: h */
    public final Camera.AutoFocusCallback f84915h;

    /* renamed from: com.journeyapps.barcodescanner.camera.a$a */
    public class C34910a implements Handler.Callback {
        public C34910a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != C34909a.this.f84913f) {
                return false;
            }
            C34909a.this.mo103407h();
            return true;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.camera.a$b */
    public class C34911b implements Camera.AutoFocusCallback {
        public C34911b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m142754b() {
            boolean unused = C34909a.this.f84909b = false;
            C34909a.this.mo103405f();
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C34909a.this.f84912e.post(new C34912b(this));
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f84907k = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C34909a(Camera camera, CameraSettings cameraSettings) {
        boolean z = true;
        C34910a aVar = new C34910a();
        this.f84914g = aVar;
        this.f84915h = new C34911b();
        this.f84912e = new Handler(aVar);
        this.f84911d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z = (!cameraSettings.mo103389c() || !f84907k.contains(focusMode)) ? false : z;
        this.f84910c = z;
        StringBuilder sb = new StringBuilder();
        sb.append("Current focus mode '");
        sb.append(focusMode);
        sb.append("'; use auto focus? ");
        sb.append(z);
        mo103408i();
    }

    /* renamed from: f */
    public final synchronized void mo103405f() {
        if (!this.f84908a && !this.f84912e.hasMessages(this.f84913f)) {
            Handler handler = this.f84912e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f84913f), 2000);
        }
    }

    /* renamed from: g */
    public final void mo103406g() {
        this.f84912e.removeMessages(this.f84913f);
    }

    /* renamed from: h */
    public final void mo103407h() {
        if (this.f84910c && !this.f84908a && !this.f84909b) {
            try {
                this.f84911d.autoFocus(this.f84915h);
                this.f84909b = true;
            } catch (RuntimeException unused) {
                mo103405f();
            }
        }
    }

    /* renamed from: i */
    public void mo103408i() {
        this.f84908a = false;
        mo103407h();
    }

    /* renamed from: j */
    public void mo103409j() {
        this.f84908a = true;
        this.f84909b = false;
        mo103406g();
        if (this.f84910c) {
            try {
                this.f84911d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}
