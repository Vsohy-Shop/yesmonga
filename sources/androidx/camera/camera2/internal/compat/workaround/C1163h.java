package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.camera2.internal.compat.quirk.C1134b;
import androidx.camera.camera2.internal.compat.quirk.C1136d;
import androidx.camera.camera2.internal.compat.quirk.C1138f;
import androidx.camera.camera2.internal.compat.quirk.C1144l;
import androidx.camera.camera2.internal.compat.quirk.C1146n;
import androidx.camera.core.impl.C1491p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.h */
public class C1163h {

    /* renamed from: a */
    public static final int f3369a = 0;

    /* renamed from: b */
    public static final int f3370b = 1;

    /* renamed from: c */
    public static final int f3371c = 2;

    /* renamed from: d */
    public static final int f3372d = 3;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.camera2.internal.compat.workaround.h$a */
    public @interface C1164a {
    }

    /* renamed from: a */
    public int mo4445a(@C0359n0 C1491p0 p0Var, @C0359n0 String str, @C0359n0 C1073h hVar) {
        C1146n nVar = (C1146n) C1138f.m4835a(C1146n.class);
        if (nVar != null && nVar.mo4437b(p0Var)) {
            return 1;
        }
        C1144l lVar = (C1144l) C1138f.m4835a(C1144l.class);
        if (lVar != null) {
            return lVar.mo4436a();
        }
        C1134b bVar = (C1134b) C1136d.m4833a(str, hVar).mo5220b(C1134b.class);
        if (bVar != null) {
            return bVar.mo4432a();
        }
        return 3;
    }
}
