package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.camera2.internal.compat.h */
public class C1073h {
    @C0323b0("this")
    @C0359n0

    /* renamed from: a */
    public final Map<CameraCharacteristics.Key<?>, Object> f3285a = new HashMap();
    @C0359n0

    /* renamed from: b */
    public final CameraCharacteristics f3286b;

    public C1073h(@C0359n0 CameraCharacteristics cameraCharacteristics) {
        this.f3286b = cameraCharacteristics;
    }

    @C0344h1(otherwise = 3)
    @C0359n0
    /* renamed from: c */
    public static C1073h m4657c(@C0359n0 CameraCharacteristics cameraCharacteristics) {
        return new C1073h(cameraCharacteristics);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return r0;
     */
    @androidx.annotation.C0363p0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo4323a(@androidx.annotation.C0359n0 android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r0 = r2.f3285a     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return r0
        L_0x000b:
            android.hardware.camera2.CameraCharacteristics r0 = r2.f3286b     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0018
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r1 = r2.f3285a     // Catch:{ all -> 0x001a }
            r1.put(r3, r0)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return r0
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.compat.C1073h.mo4323a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    @C0359n0
    /* renamed from: b */
    public CameraCharacteristics mo4324b() {
        return this.f3286b;
    }
}
