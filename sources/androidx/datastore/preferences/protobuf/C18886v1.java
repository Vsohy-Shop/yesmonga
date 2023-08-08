package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18868t1;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.v1 */
public class C18886v1 implements C18881u1 {
    /* renamed from: i */
    public static <K, V> int m87584i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C18868t1 t1Var = (C18868t1) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += t1Var.mo55414a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> MapFieldLite<K, V> m87585j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.mo54094n()) {
                mapFieldLite = mapFieldLite.mo54100t();
            }
            mapFieldLite.mo54099s(mapFieldLite2);
        }
        return mapFieldLite;
    }

    /* renamed from: a */
    public Object mo55446a(Object obj, Object obj2) {
        return m87585j(obj, obj2);
    }

    /* renamed from: b */
    public C18868t1.C18870b<?, ?> mo55447b(Object obj) {
        return ((C18868t1) obj).mo55416d();
    }

    /* renamed from: c */
    public Map<?, ?> mo55448c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public Object mo55449d(Object obj) {
        return MapFieldLite.m85107i().mo54100t();
    }

    /* renamed from: e */
    public Map<?, ?> mo55450e(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: f */
    public Object mo55451f(Object obj) {
        ((MapFieldLite) obj).mo54095o();
        return obj;
    }

    /* renamed from: g */
    public int mo55452g(int i, Object obj, Object obj2) {
        return m87584i(i, obj, obj2);
    }

    /* renamed from: h */
    public boolean mo55453h(Object obj) {
        return !((MapFieldLite) obj).mo54094n();
    }
}
