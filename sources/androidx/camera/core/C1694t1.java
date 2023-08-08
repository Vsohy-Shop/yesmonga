package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.C1475l0;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.core.t1 */
public final /* synthetic */ class C1694t1 implements SessionConfig.C1425c {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4703a;

    /* renamed from: b */
    public final /* synthetic */ String f4704b;

    /* renamed from: c */
    public final /* synthetic */ C1475l0 f4705c;

    /* renamed from: d */
    public final /* synthetic */ Size f4706d;

    public /* synthetic */ C1694t1(ImageCapture imageCapture, String str, C1475l0 l0Var, Size size) {
        this.f4703a = imageCapture;
        this.f4704b = str;
        this.f4705c = l0Var;
        this.f4706d = size;
    }

    /* renamed from: a */
    public final void mo5030a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f4703a.m5427y0(this.f4704b, this.f4705c, this.f4706d, sessionConfig, sessionError);
    }
}
