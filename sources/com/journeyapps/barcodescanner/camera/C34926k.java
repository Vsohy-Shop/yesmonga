package com.journeyapps.barcodescanner.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: com.journeyapps.barcodescanner.camera.k */
public class C34926k {

    /* renamed from: a */
    public SurfaceHolder f84969a;

    /* renamed from: b */
    public SurfaceTexture f84970b;

    public C34926k(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f84969a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    /* renamed from: a */
    public SurfaceHolder mo103474a() {
        return this.f84969a;
    }

    /* renamed from: b */
    public SurfaceTexture mo103475b() {
        return this.f84970b;
    }

    /* renamed from: c */
    public void mo103476c(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f84969a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f84970b);
        }
    }

    public C34926k(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f84970b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
