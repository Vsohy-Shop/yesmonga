package androidx.camera.camera2.internal;

import android.content.Context;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.C1127q;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.C1473l;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.core.util.C18001r;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.v0 */
public final class C1258v0 implements C1473l {

    /* renamed from: c */
    public static final String f3602c = "Camera2DeviceSurfaceManager";

    /* renamed from: a */
    public final Map<String, C1179f2> f3603a;

    /* renamed from: b */
    public final C1170e f3604b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C1258v0(@C0359n0 Context context, @C0363p0 Object obj, @C0359n0 Set<String> set) throws CameraUnavailableException {
        this(context, new C1251u0(), obj, set);
    }

    @C0363p0
    /* renamed from: a */
    public SurfaceConfig mo4704a(@C0359n0 String str, int i, @C0359n0 Size size) {
        C1179f2 f2Var = this.f3603a.get(str);
        if (f2Var != null) {
            return f2Var.mo4480N(i, size);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo4705b(@C0359n0 String str, @C0363p0 List<SurfaceConfig> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        C1179f2 f2Var = this.f3603a.get(str);
        if (f2Var != null) {
            return f2Var.mo4482b(list);
        }
        return false;
    }

    @C0359n0
    /* renamed from: c */
    public Map<C1488o1<?>, Size> mo4706c(@C0359n0 String str, @C0359n0 List<SurfaceConfig> list, @C0359n0 List<C1488o1<?>> list2) {
        C18001r.m81765b(!list2.isEmpty(), "No new use cases to be bound.");
        ArrayList arrayList = new ArrayList(list);
        for (C1488o1<?> o : list2) {
            arrayList.add(mo4704a(str, o.mo5210o(), new Size(640, C14092c.f34573Y0)));
        }
        C1179f2 f2Var = this.f3603a.get(str);
        if (f2Var == null) {
            throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
        } else if (f2Var.mo4482b(arrayList)) {
            return f2Var.mo4503y(list, list2);
        } else {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + str + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
        }
    }

    /* renamed from: d */
    public final void mo4707d(@C0359n0 Context context, @C0359n0 C1127q qVar, @C0359n0 Set<String> set) throws CameraUnavailableException {
        C18001r.m81775l(context);
        for (String next : set) {
            this.f3603a.put(next, new C1179f2(context, next, qVar, this.f3604b));
        }
    }

    public C1258v0(@C0359n0 Context context, @C0359n0 C1170e eVar, @C0363p0 Object obj, @C0359n0 Set<String> set) throws CameraUnavailableException {
        C1127q qVar;
        this.f3603a = new HashMap();
        C18001r.m81775l(eVar);
        this.f3604b = eVar;
        if (obj instanceof C1127q) {
            qVar = (C1127q) obj;
        } else {
            qVar = C1127q.m4809a(context);
        }
        mo4707d(context, qVar, set);
    }
}
