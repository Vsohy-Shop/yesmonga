package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.C0359n0;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.z0 */
public class C1588z0 extends C1472k1 {
    public C1588z0(Map<String, Integer> map) {
        super(map);
    }

    @C0359n0
    /* renamed from: g */
    public static C1588z0 m6581g() {
        return new C1588z0(new ArrayMap());
    }

    @C0359n0
    /* renamed from: h */
    public static C1588z0 m6582h(@C0359n0 C1472k1 k1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : k1Var.mo5240e()) {
            arrayMap.put(next, k1Var.mo5239d(next));
        }
        return new C1588z0(arrayMap);
    }

    /* renamed from: f */
    public void mo5574f(@C0359n0 C1472k1 k1Var) {
        Map<String, Integer> map;
        Map<String, Integer> map2 = this.f4231a;
        if (map2 != null && (map = k1Var.f4231a) != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: i */
    public void mo5575i(@C0359n0 String str, @C0359n0 Integer num) {
        this.f4231a.put(str, num);
    }
}
