package androidx.camera.lifecycle;

import androidx.annotation.C0359n0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.C19499w;

/* renamed from: androidx.camera.lifecycle.a */
public final class C1745a extends LifecycleCameraRepository.C1744a {

    /* renamed from: a */
    public final C19499w f4825a;

    /* renamed from: b */
    public final CameraUseCaseAdapter.C1589a f4826b;

    public C1745a(C19499w wVar, CameraUseCaseAdapter.C1589a aVar) {
        if (wVar != null) {
            this.f4825a = wVar;
            if (aVar != null) {
                this.f4826b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    @C0359n0
    /* renamed from: b */
    public CameraUseCaseAdapter.C1589a mo5805b() {
        return this.f4826b;
    }

    @C0359n0
    /* renamed from: c */
    public C19499w mo5806c() {
        return this.f4825a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.C1744a)) {
            return false;
        }
        LifecycleCameraRepository.C1744a aVar = (LifecycleCameraRepository.C1744a) obj;
        if (!this.f4825a.equals(aVar.mo5806c()) || !this.f4826b.equals(aVar.mo5805b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f4825a.hashCode() ^ 1000003) * 1000003) ^ this.f4826b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f4825a + ", cameraId=" + this.f4826b + "}";
    }
}
