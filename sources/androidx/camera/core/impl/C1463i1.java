package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.i1 */
public final class C1463i1 {

    /* renamed from: a */
    public final List<SurfaceConfig> f4220a = new ArrayList();

    /* renamed from: b */
    public static void m6137b(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (i3 == iArr[i4]) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m6137b(list, i, iArr, i2 + 1);
            }
        }
    }

    /* renamed from: a */
    public boolean mo5225a(@C0359n0 SurfaceConfig surfaceConfig) {
        return this.f4220a.add(surfaceConfig);
    }

    /* renamed from: c */
    public final List<int[]> mo5226c(int i) {
        ArrayList arrayList = new ArrayList();
        m6137b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    @C0359n0
    /* renamed from: d */
    public List<SurfaceConfig> mo5227d() {
        return this.f4220a;
    }

    /* renamed from: e */
    public boolean mo5228e(@C0359n0 List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f4220a.size()) {
            return false;
        }
        Iterator<int[]> it = mo5226c(this.f4220a.size()).iterator();
        while (it.hasNext()) {
            int[] next = it.next();
            boolean z = true;
            int i = 0;
            while (i < this.f4220a.size() && (next[i] >= list.size() || ((z = z & this.f4220a.get(i).mo5177d(list.get(next[i])))))) {
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5229f(@C0359n0 SurfaceConfig surfaceConfig) {
        return this.f4220a.remove(surfaceConfig);
    }
}
