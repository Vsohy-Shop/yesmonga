package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;

@C0376v0(28)
/* renamed from: androidx.camera.camera2.internal.compat.params.m */
public class C1108m extends C1103i {
    public C1108m(@C0359n0 Surface surface) {
        super((Object) new OutputConfiguration(surface));
    }

    @C0376v0(28)
    /* renamed from: p */
    public static C1108m m4739p(@C0359n0 OutputConfiguration outputConfiguration) {
        return new C1108m((Object) outputConfiguration);
    }

    /* renamed from: c */
    public void mo4369c(@C0359n0 Surface surface) {
        ((OutputConfiguration) mo4376j()).removeSurface(surface);
    }

    /* renamed from: d */
    public void mo4370d(@C0363p0 String str) {
        ((OutputConfiguration) mo4376j()).setPhysicalCameraId(str);
    }

    /* renamed from: e */
    public int mo4371e() {
        return ((OutputConfiguration) mo4376j()).getMaxSharedSurfaceCount();
    }

    @C0363p0
    /* renamed from: h */
    public String mo4374h() {
        return null;
    }

    /* renamed from: j */
    public Object mo4376j() {
        C18001r.m81764a(this.f3319a instanceof OutputConfiguration);
        return this.f3319a;
    }

    public C1108m(@C0359n0 Object obj) {
        super(obj);
    }
}
