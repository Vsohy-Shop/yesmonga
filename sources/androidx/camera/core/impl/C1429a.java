package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.a */
public final class C1429a extends C1579w {

    /* renamed from: a */
    public final Executor f4177a;

    /* renamed from: b */
    public final Handler f4178b;

    public C1429a(Executor executor, Handler handler) {
        if (executor != null) {
            this.f4177a = executor;
            if (handler != null) {
                this.f4178b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    @C0359n0
    /* renamed from: b */
    public Executor mo5179b() {
        return this.f4177a;
    }

    @C0359n0
    /* renamed from: c */
    public Handler mo5180c() {
        return this.f4178b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1579w)) {
            return false;
        }
        C1579w wVar = (C1579w) obj;
        if (!this.f4177a.equals(wVar.mo5179b()) || !this.f4178b.equals(wVar.mo5180c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f4177a.hashCode() ^ 1000003) * 1000003) ^ this.f4178b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f4177a + ", schedulerHandler=" + this.f4178b + "}";
    }
}
