package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.y0 */
public final class C1586y0 extends C1441c1 implements C1582x0 {
    @C0359n0

    /* renamed from: y */
    public static final Config.OptionPriority f4510y = Config.OptionPriority.OPTIONAL;

    public C1586y0(TreeMap<Config.C1421a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        super(treeMap);
    }

    @C0359n0
    /* renamed from: d0 */
    public static C1586y0 m6573d0() {
        return new C1586y0(new TreeMap(C1441c1.f4187w));
    }

    @C0359n0
    /* renamed from: e0 */
    public static C1586y0 m6574e0(@C0359n0 Config config) {
        TreeMap treeMap = new TreeMap(C1441c1.f4187w);
        for (Config.C1421a next : config.mo5129f()) {
            Set<Config.OptionPriority> g = config.mo5130g(next);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority next2 : g) {
                arrayMap.put(next2, config.mo5128e(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new C1586y0(treeMap);
    }

    /* renamed from: q */
    public <ValueT> void mo5544q(@C0359n0 Config.C1421a<ValueT> aVar, @C0359n0 Config.OptionPriority optionPriority, @C0363p0 ValueT valuet) {
        Map map = this.f4189v.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f4189v.put(aVar, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        Config.OptionPriority optionPriority2 = (Config.OptionPriority) Collections.min(map.keySet());
        if (map.get(optionPriority2).equals(valuet) || !Config.m5970B(optionPriority2, optionPriority)) {
            map.put(optionPriority, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.mo5133c() + ", existing value (" + optionPriority2 + ")=" + map.get(optionPriority2) + ", conflicting (" + optionPriority + ")=" + valuet);
    }

    /* renamed from: t */
    public <ValueT> void mo5545t(@C0359n0 Config.C1421a<ValueT> aVar, @C0363p0 ValueT valuet) {
        mo5544q(aVar, f4510y, valuet);
    }

    @C0363p0
    /* renamed from: z */
    public <ValueT> ValueT mo5546z(@C0359n0 Config.C1421a<ValueT> aVar) {
        return this.f4189v.remove(aVar);
    }
}
