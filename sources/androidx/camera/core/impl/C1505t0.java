package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.experimental.C0335b;
import androidx.camera.core.C1399f0;
import androidx.camera.core.C1635l;
import androidx.camera.core.C1641m;
import androidx.core.util.C18001r;
import java.util.ArrayList;
import java.util.List;

@C0335b(markerClass = C1399f0.class)
/* renamed from: androidx.camera.core.impl.t0 */
public class C1505t0 implements C1635l {

    /* renamed from: a */
    public int f4284a;

    public C1505t0(int i) {
        this.f4284a = i;
    }

    @C0359n0
    /* renamed from: a */
    public List<C1641m> mo4754a(@C0359n0 List<C1641m> list) {
        ArrayList arrayList = new ArrayList();
        for (C1641m next : list) {
            C18001r.m81765b(next instanceof C1496q, "The camera info doesn't contain internal implementation.");
            Integer d = ((C1496q) next).mo4594d();
            if (d != null && d.intValue() == this.f4284a) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public int mo5324b() {
        return this.f4284a;
    }
}
