package com.journeyapps.barcodescanner.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import com.google.zxing.client.android.C34647b;
import com.google.zxing.client.android.camera.open.C34649a;
import com.journeyapps.barcodescanner.C34959u;
import com.journeyapps.barcodescanner.C34960v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C12085q0;

/* renamed from: com.journeyapps.barcodescanner.camera.i */
public final class C34923i {

    /* renamed from: n */
    public static final String f84952n = "i";

    /* renamed from: a */
    public Camera f84953a;

    /* renamed from: b */
    public Camera.CameraInfo f84954b;

    /* renamed from: c */
    public C34909a f84955c;

    /* renamed from: d */
    public C34647b f84956d;

    /* renamed from: e */
    public boolean f84957e;

    /* renamed from: f */
    public String f84958f;

    /* renamed from: g */
    public CameraSettings f84959g = new CameraSettings();

    /* renamed from: h */
    public C34929n f84960h;

    /* renamed from: i */
    public C34959u f84961i;

    /* renamed from: j */
    public C34959u f84962j;

    /* renamed from: k */
    public int f84963k = -1;

    /* renamed from: l */
    public Context f84964l;

    /* renamed from: m */
    public final C34924a f84965m;

    /* renamed from: com.journeyapps.barcodescanner.camera.i$a */
    public final class C34924a implements Camera.PreviewCallback {

        /* renamed from: a */
        public C34934r f84966a;

        /* renamed from: b */
        public C34959u f84967b;

        public C34924a() {
        }

        /* renamed from: a */
        public void mo103470a(C34934r rVar) {
            this.f84966a = rVar;
        }

        /* renamed from: b */
        public void mo103471b(C34959u uVar) {
            this.f84967b = uVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            C34959u uVar = this.f84967b;
            C34934r rVar = this.f84966a;
            if (uVar == null || rVar == null) {
                String unused = C34923i.f84952n;
                if (rVar != null) {
                    rVar.mo103496b(new Exception("No resolution available"));
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    C34960v vVar = new C34960v(bArr2, uVar.f85046a, uVar.f85047b, camera.getParameters().getPreviewFormat(), C34923i.this.mo103452h());
                    if (C34923i.this.f84954b.facing == 1) {
                        vVar.mo103573n(true);
                    }
                    rVar.mo103495a(vVar);
                } catch (RuntimeException e) {
                    String unused2 = C34923i.f84952n;
                    rVar.mo103496b(e);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
        }
    }

    public C34923i(Context context) {
        this.f84964l = context;
        this.f84965m = new C34924a();
    }

    /* renamed from: n */
    public static List<C34959u> m142814n(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new C34959u(previewSize.width, previewSize.height);
                arrayList.add(new C34959u(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new C34959u(next.width, next.height));
        }
        return arrayList;
    }

    /* renamed from: A */
    public void mo103444A(boolean z) {
        if (this.f84953a != null) {
            try {
                if (z != mo103460q()) {
                    C34909a aVar = this.f84955c;
                    if (aVar != null) {
                        aVar.mo103409j();
                    }
                    Camera.Parameters parameters = this.f84953a.getParameters();
                    C34913c.m142768n(parameters, z);
                    if (this.f84959g.mo103393g()) {
                        C34913c.m142761g(parameters, z);
                    }
                    this.f84953a.setParameters(parameters);
                    C34909a aVar2 = this.f84955c;
                    if (aVar2 != null) {
                        aVar2.mo103408i();
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: B */
    public void mo103445B() {
        Camera camera = this.f84953a;
        if (camera != null && !this.f84957e) {
            camera.startPreview();
            this.f84957e = true;
            this.f84955c = new C34909a(this.f84953a, this.f84959g);
            C34647b bVar = new C34647b(this.f84964l, this, this.f84959g);
            this.f84956d = bVar;
            bVar.mo102494d();
        }
    }

    /* renamed from: C */
    public void mo103446C() {
        C34909a aVar = this.f84955c;
        if (aVar != null) {
            aVar.mo103409j();
            this.f84955c = null;
        }
        C34647b bVar = this.f84956d;
        if (bVar != null) {
            bVar.mo102495e();
            this.f84956d = null;
        }
        Camera camera = this.f84953a;
        if (camera != null && this.f84957e) {
            camera.stopPreview();
            this.f84965m.mo103470a((C34934r) null);
            this.f84957e = false;
        }
    }

    /* renamed from: c */
    public final int mo103447c() {
        int i;
        int d = this.f84960h.mo103488d();
        int i2 = 0;
        if (d != 0) {
            if (d == 1) {
                i2 = 90;
            } else if (d == 2) {
                i2 = 180;
            } else if (d == 3) {
                i2 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f84954b;
        if (cameraInfo.facing == 1) {
            i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Camera Display Orientation: ");
        sb.append(i);
        return i;
    }

    /* renamed from: d */
    public void mo103448d(C34925j jVar) {
        Camera camera = this.f84953a;
        if (camera != null) {
            try {
                camera.setParameters(jVar.mo103473a(camera.getParameters()));
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: e */
    public void mo103449e() {
        Camera camera = this.f84953a;
        if (camera != null) {
            camera.release();
            this.f84953a = null;
        }
    }

    /* renamed from: f */
    public void mo103450f() {
        if (this.f84953a != null) {
            mo103467x();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: g */
    public Camera mo103451g() {
        return this.f84953a;
    }

    /* renamed from: h */
    public int mo103452h() {
        return this.f84963k;
    }

    /* renamed from: i */
    public CameraSettings mo103453i() {
        return this.f84959g;
    }

    /* renamed from: j */
    public final Camera.Parameters mo103454j() {
        Camera.Parameters parameters = this.f84953a.getParameters();
        String str = this.f84958f;
        if (str == null) {
            this.f84958f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: k */
    public C34929n mo103455k() {
        return this.f84960h;
    }

    /* renamed from: l */
    public C34959u mo103456l() {
        return this.f84962j;
    }

    /* renamed from: m */
    public C34959u mo103457m() {
        if (this.f84962j == null) {
            return null;
        }
        if (mo103458o()) {
            return this.f84962j.mo103555q();
        }
        return this.f84962j;
    }

    /* renamed from: o */
    public boolean mo103458o() {
        int i = this.f84963k;
        if (i == -1) {
            throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
        } else if (i % 180 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: p */
    public boolean mo103459p() {
        return this.f84953a != null;
    }

    /* renamed from: q */
    public boolean mo103460q() {
        String flashMode;
        Camera.Parameters parameters = this.f84953a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        if (C12085q0.f29740d.equals(flashMode) || "torch".equals(flashMode)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo103461r() {
        Camera b = C34649a.m141339b(this.f84959g.mo103388b());
        this.f84953a = b;
        if (b != null) {
            int a = C34649a.m141338a(this.f84959g.mo103388b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f84954b = cameraInfo;
            Camera.getCameraInfo(a, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: s */
    public void mo103462s(C34934r rVar) {
        Camera camera = this.f84953a;
        if (camera != null && this.f84957e) {
            this.f84965m.mo103470a(rVar);
            camera.setOneShotPreviewCallback(this.f84965m);
        }
    }

    /* renamed from: t */
    public final void mo103463t(int i) {
        this.f84953a.setDisplayOrientation(i);
    }

    /* renamed from: u */
    public void mo103464u(CameraSettings cameraSettings) {
        this.f84959g = cameraSettings;
    }

    /* renamed from: v */
    public final void mo103465v(boolean z) {
        Camera.Parameters j = mo103454j();
        if (j != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Initial camera parameters: ");
            sb.append(j.flatten());
            C34913c.m142764j(j, this.f84959g.mo103387a(), z);
            if (!z) {
                C34913c.m142768n(j, false);
                if (this.f84959g.mo103395i()) {
                    C34913c.m142766l(j);
                }
                if (this.f84959g.mo103391e()) {
                    C34913c.m142760f(j);
                }
                if (this.f84959g.mo103394h()) {
                    C34913c.m142769o(j);
                    C34913c.m142765k(j);
                    C34913c.m142767m(j);
                }
            }
            List<C34959u> n = m142814n(j);
            if (n.size() == 0) {
                this.f84961i = null;
            } else {
                C34959u a = this.f84960h.mo103485a(n, mo103458o());
                this.f84961i = a;
                j.setPreviewSize(a.f85046a, a.f85047b);
            }
            if (Build.DEVICE.equals("glass-1")) {
                C34913c.m142762h(j);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Final camera parameters: ");
            sb2.append(j.flatten());
            this.f84953a.setParameters(j);
        }
    }

    /* renamed from: w */
    public void mo103466w(C34929n nVar) {
        this.f84960h = nVar;
    }

    /* renamed from: x */
    public final void mo103467x() {
        try {
            int c = mo103447c();
            this.f84963k = c;
            mo103463t(c);
        } catch (Exception unused) {
        }
        try {
            mo103465v(false);
        } catch (Exception unused2) {
            try {
                mo103465v(true);
            } catch (Exception unused3) {
            }
        }
        Camera.Size previewSize = this.f84953a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f84962j = this.f84961i;
        } else {
            this.f84962j = new C34959u(previewSize.width, previewSize.height);
        }
        this.f84965m.mo103471b(this.f84962j);
    }

    /* renamed from: y */
    public void mo103468y(SurfaceHolder surfaceHolder) throws IOException {
        mo103469z(new C34926k(surfaceHolder));
    }

    /* renamed from: z */
    public void mo103469z(C34926k kVar) throws IOException {
        kVar.mo103476c(this.f84953a);
    }
}
