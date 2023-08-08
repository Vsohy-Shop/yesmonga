package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.camera2.internal.i0 */
public final /* synthetic */ class C1192i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SessionConfig.C1425c f3433a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f3434b;

    public /* synthetic */ C1192i0(SessionConfig.C1425c cVar, SessionConfig sessionConfig) {
        this.f3433a = cVar;
        this.f3434b = sessionConfig;
    }

    public final void run() {
        this.f3433a.mo5030a(this.f3434b, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }
}
