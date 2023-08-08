package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.core.impl.C1450f1;
import java.util.ArrayList;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.d */
public class C1136d {
    @C0359n0
    /* renamed from: a */
    public static C1450f1 m4833a(@C0359n0 String str, @C0359n0 C1073h hVar) {
        ArrayList arrayList = new ArrayList();
        if (C1133a.m4826c(hVar)) {
            arrayList.add(new C1133a(hVar));
        }
        if (C1134b.m4830b(hVar)) {
            arrayList.add(new C1134b());
        }
        if (C1143k.m4848a(hVar)) {
            arrayList.add(new C1143k());
        }
        if (C1142j.m4847a(hVar)) {
            arrayList.add(new C1142j());
        }
        if (C1135c.m4832a(hVar)) {
            arrayList.add(new C1135c());
        }
        return new C1450f1(arrayList);
    }
}
