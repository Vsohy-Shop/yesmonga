package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.C1471k0;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.core.r0 */
public final /* synthetic */ class C1675r0 implements SessionConfig.C1425c {

    /* renamed from: a */
    public final /* synthetic */ C1689t0 f4658a;

    /* renamed from: b */
    public final /* synthetic */ String f4659b;

    /* renamed from: c */
    public final /* synthetic */ C1471k0 f4660c;

    /* renamed from: d */
    public final /* synthetic */ Size f4661d;

    public /* synthetic */ C1675r0(C1689t0 t0Var, String str, C1471k0 k0Var, Size size) {
        this.f4658a = t0Var;
        this.f4659b = str;
        this.f4660c = k0Var;
        this.f4661d = size;
    }

    /* renamed from: a */
    public final void mo5030a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f4658a.m6842R(this.f4659b, this.f4660c, this.f4661d, sessionConfig, sessionError);
    }
}
