package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.k1 */
public class C1472k1 {

    /* renamed from: b */
    public static final C1472k1 f4230b = new C1472k1(new ArrayMap());

    /* renamed from: a */
    public final Map<String, Integer> f4231a;

    public C1472k1(@C0359n0 Map<String, Integer> map) {
        this.f4231a = map;
    }

    @C0359n0
    /* renamed from: a */
    public static C1472k1 m6167a(@C0359n0 Pair<String, Integer> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, (Integer) pair.second);
        return new C1472k1(arrayMap);
    }

    @C0359n0
    /* renamed from: b */
    public static C1472k1 m6168b() {
        return f4230b;
    }

    @C0359n0
    /* renamed from: c */
    public static C1472k1 m6169c(@C0359n0 C1472k1 k1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : k1Var.mo5240e()) {
            arrayMap.put(next, k1Var.mo5239d(next));
        }
        return new C1472k1(arrayMap);
    }

    @C0363p0
    /* renamed from: d */
    public Integer mo5239d(@C0359n0 String str) {
        return this.f4231a.get(str);
    }

    @C0359n0
    /* renamed from: e */
    public Set<String> mo5240e() {
        return this.f4231a.keySet();
    }
}
