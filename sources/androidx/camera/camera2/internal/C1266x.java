package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.C1127q;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C1647n;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.C1477m;
import androidx.camera.core.impl.C1568v;
import androidx.camera.core.impl.C1579w;
import androidx.camera.core.impl.CameraInternal;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.x */
public final class C1266x implements C1477m {

    /* renamed from: f */
    public static final int f3626f = 1;

    /* renamed from: a */
    public final C1579w f3627a;

    /* renamed from: b */
    public final C1568v f3628b;

    /* renamed from: c */
    public final C1127q f3629c;

    /* renamed from: d */
    public final List<String> f3630d;

    /* renamed from: e */
    public final Map<String, C1227q0> f3631e = new HashMap();

    public C1266x(@C0359n0 Context context, @C0359n0 C1579w wVar, @C0363p0 C1647n nVar) throws InitializationException {
        this.f3627a = wVar;
        this.f3628b = new C1568v(1);
        this.f3629c = C1127q.m4810b(context, wVar.mo5180c());
        this.f3630d = C1168d1.m4887b(this, nVar);
    }

    @C0359n0
    /* renamed from: b */
    public CameraInternal mo4717b(@C0359n0 String str) throws CameraUnavailableException {
        if (this.f3630d.contains(str)) {
            return new Camera2CameraImpl(this.f3629c, str, mo4719d(str), this.f3628b, this.f3627a.mo5179b(), this.f3627a.mo5180c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @C0359n0
    /* renamed from: c */
    public Set<String> mo4718c() {
        return new LinkedHashSet(this.f3630d);
    }

    /* renamed from: d */
    public C1227q0 mo4719d(@C0359n0 String str) throws CameraUnavailableException {
        try {
            C1227q0 q0Var = this.f3631e.get(str);
            if (q0Var != null) {
                return q0Var;
            }
            C1227q0 q0Var2 = new C1227q0(str, this.f3629c.mo4410d(str));
            this.f3631e.put(str, q0Var2);
            return q0Var2;
        } catch (CameraAccessExceptionCompat e) {
            throw C1172e1.m4889a(e);
        }
    }

    @C0359n0
    /* renamed from: e */
    public C1127q mo4716a() {
        return this.f3629c;
    }
}
