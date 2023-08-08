package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import androidx.camera.camera2.internal.compat.C1074i;
import androidx.camera.camera2.internal.compat.C1127q;
import androidx.core.util.C18001r;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.v */
public class C1153v implements C1127q.C1132b {

    /* renamed from: a */
    public final CameraManager f3362a;

    /* renamed from: b */
    public final Object f3363b;

    /* renamed from: androidx.camera.camera2.internal.compat.v$a */
    public static final class C1154a {
        @C0323b0("mWrapperMap")

        /* renamed from: a */
        public final Map<CameraManager.AvailabilityCallback, C1127q.C1128a> f3364a = new HashMap();

        /* renamed from: b */
        public final Handler f3365b;

        public C1154a(@C0359n0 Handler handler) {
            this.f3365b = handler;
        }
    }

    public C1153v(@C0359n0 Context context, @C0363p0 Object obj) {
        this.f3362a = (CameraManager) context.getSystemService("camera");
        this.f3363b = obj;
    }

    /* renamed from: h */
    public static C1153v m4867h(@C0359n0 Context context, @C0359n0 Handler handler) {
        return new C1153v(context, new C1154a(handler));
    }

    @C0359n0
    /* renamed from: a */
    public CameraManager mo4423a() {
        return this.f3362a;
    }

    /* renamed from: b */
    public void mo4424b(@C0359n0 Executor executor, @C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
        C1127q.C1128a aVar;
        if (executor != null) {
            C1154a aVar2 = (C1154a) this.f3363b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f3364a) {
                    aVar = aVar2.f3364a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C1127q.C1128a(executor, availabilityCallback);
                        aVar2.f3364a.put(availabilityCallback, aVar);
                    }
                }
            } else {
                aVar = null;
            }
            this.f3362a.registerAvailabilityCallback(aVar, aVar2.f3365b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @C0359n0
    /* renamed from: c */
    public CameraCharacteristics mo4425c(@C0359n0 String str) throws CameraAccessExceptionCompat {
        try {
            return this.f3362a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m4628f(e);
        }
    }

    @C0380x0("android.permission.CAMERA")
    /* renamed from: d */
    public void mo4426d(@C0359n0 String str, @C0359n0 Executor executor, @C0359n0 CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        C18001r.m81775l(executor);
        C18001r.m81775l(stateCallback);
        try {
            this.f3362a.openCamera(str, new C1074i.C1076b(executor, stateCallback), ((C1154a) this.f3363b).f3365b);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m4628f(e);
        }
    }

    @C0359n0
    /* renamed from: e */
    public String[] mo4427e() throws CameraAccessExceptionCompat {
        try {
            return this.f3362a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m4628f(e);
        }
    }

    /* renamed from: f */
    public void mo4428f(@C0359n0 CameraManager.AvailabilityCallback availabilityCallback) {
        C1127q.C1128a aVar;
        if (availabilityCallback != null) {
            C1154a aVar2 = (C1154a) this.f3363b;
            synchronized (aVar2.f3364a) {
                aVar = aVar2.f3364a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo4416a();
        }
        this.f3362a.unregisterAvailabilityCallback(aVar);
    }
}
