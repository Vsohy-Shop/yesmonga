package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.c1 */
public class C1441c1 implements Config {

    /* renamed from: w */
    public static final Comparator<Config.C1421a<?>> f4187w;

    /* renamed from: x */
    public static final C1441c1 f4188x;

    /* renamed from: v */
    public final TreeMap<Config.C1421a<?>, Map<Config.OptionPriority, Object>> f4189v;

    static {
        C1438b1 b1Var = new C1438b1();
        f4187w = b1Var;
        f4188x = new C1441c1(new TreeMap(b1Var));
    }

    public C1441c1(TreeMap<Config.C1421a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.f4189v = treeMap;
    }

    @C0359n0
    /* renamed from: a0 */
    public static C1441c1 m6058a0() {
        return f4188x;
    }

    @C0359n0
    /* renamed from: b0 */
    public static C1441c1 m6059b0(@C0359n0 Config config) {
        if (C1441c1.class.equals(config.getClass())) {
            return (C1441c1) config;
        }
        TreeMap treeMap = new TreeMap(f4187w);
        for (Config.C1421a next : config.mo5129f()) {
            Set<Config.OptionPriority> g = config.mo5130g(next);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority next2 : g) {
                arrayMap.put(next2, config.mo5128e(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new C1441c1(treeMap);
    }

    @C0363p0
    /* renamed from: b */
    public <ValueT> ValueT mo5125b(@C0359n0 Config.C1421a<ValueT> aVar) {
        Map map = this.f4189v.get(aVar);
        if (map != null) {
            return map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    /* renamed from: c */
    public boolean mo5126c(@C0359n0 Config.C1421a<?> aVar) {
        return this.f4189v.containsKey(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5127d(@androidx.annotation.C0359n0 java.lang.String r4, @androidx.annotation.C0359n0 androidx.camera.core.impl.Config.C1422b r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            androidx.camera.core.impl.Config$a r0 = androidx.camera.core.impl.Config.C1421a.m5980a(r4, r0)
            java.util.TreeMap<androidx.camera.core.impl.Config$a<?>, java.util.Map<androidx.camera.core.impl.Config$OptionPriority, java.lang.Object>> r1 = r3.f4189v
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.camera.core.impl.Config$a r2 = (androidx.camera.core.impl.Config.C1421a) r2
            java.lang.String r2 = r2.mo5133c()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            java.lang.Object r1 = r1.getKey()
            androidx.camera.core.impl.Config$a r1 = (androidx.camera.core.impl.Config.C1421a) r1
            boolean r1 = r5.mo4763a(r1)
            if (r1 != 0) goto L_0x0014
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C1441c1.mo5127d(java.lang.String, androidx.camera.core.impl.Config$b):void");
    }

    @C0363p0
    /* renamed from: e */
    public <ValueT> ValueT mo5128e(@C0359n0 Config.C1421a<ValueT> aVar, @C0359n0 Config.OptionPriority optionPriority) {
        Map map = this.f4189v.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(optionPriority)) {
            return map.get(optionPriority);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + optionPriority);
        }
    }

    @C0359n0
    /* renamed from: f */
    public Set<Config.C1421a<?>> mo5129f() {
        return Collections.unmodifiableSet(this.f4189v.keySet());
    }

    @C0359n0
    /* renamed from: g */
    public Set<Config.OptionPriority> mo5130g(@C0359n0 Config.C1421a<?> aVar) {
        Map map = this.f4189v.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @C0363p0
    /* renamed from: h */
    public <ValueT> ValueT mo5131h(@C0359n0 Config.C1421a<ValueT> aVar, @C0363p0 ValueT valuet) {
        try {
            return mo5125b(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @C0359n0
    /* renamed from: i */
    public Config.OptionPriority mo5132i(@C0359n0 Config.C1421a<?> aVar) {
        Map map = this.f4189v.get(aVar);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
