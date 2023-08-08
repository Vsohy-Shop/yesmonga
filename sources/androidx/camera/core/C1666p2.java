package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.C1444d1;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: androidx.camera.core.p2 */
public final /* synthetic */ class C1666p2 implements SessionConfig.C1425c {

    /* renamed from: a */
    public final /* synthetic */ C1677r2 f4639a;

    /* renamed from: b */
    public final /* synthetic */ String f4640b;

    /* renamed from: c */
    public final /* synthetic */ C1444d1 f4641c;

    /* renamed from: d */
    public final /* synthetic */ Size f4642d;

    public /* synthetic */ C1666p2(C1677r2 r2Var, String str, C1444d1 d1Var, Size size) {
        this.f4639a = r2Var;
        this.f4640b = str;
        this.f4641c = d1Var;
        this.f4642d = size;
    }

    /* renamed from: a */
    public final void mo5030a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.f4639a.m6774O(this.f4640b, this.f4641c, this.f4642d, sessionConfig, sessionError);
    }
}
