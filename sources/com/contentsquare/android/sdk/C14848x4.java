package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14880y2;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.x4 */
public class C14848x4 implements C14393h4 {
    /* renamed from: a */
    public static <K, V> int m63986a(int i, Object obj, Object obj2) {
        C14369g6 g6Var = (C14369g6) obj;
        C14880y2 y2Var = (C14880y2) obj2;
        int i2 = 0;
        if (g6Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : g6Var.entrySet()) {
            i2 += y2Var.mo36902a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> C14369g6<K, V> m63987j(Object obj, Object obj2) {
        C14369g6<K, V> g6Var = (C14369g6) obj;
        C14369g6 g6Var2 = (C14369g6) obj2;
        if (!g6Var2.isEmpty()) {
            if (!g6Var.mo35356m()) {
                g6Var = g6Var.mo35358o();
            }
            g6Var.mo35351e(g6Var2);
        }
        return g6Var;
    }

    /* renamed from: b */
    public Object mo35483b(Object obj) {
        return C14369g6.m61888i().mo35358o();
    }

    /* renamed from: c */
    public Object mo35484c(Object obj, Object obj2) {
        return m63987j(obj, obj2);
    }

    /* renamed from: d */
    public Map<?, ?> mo35485d(Object obj) {
        return (C14369g6) obj;
    }

    /* renamed from: e */
    public boolean mo35486e(Object obj) {
        return !((C14369g6) obj).mo35356m();
    }

    /* renamed from: f */
    public Object mo35487f(Object obj) {
        ((C14369g6) obj).mo35357n();
        return obj;
    }

    /* renamed from: g */
    public C14880y2.C14881a<?, ?> mo35488g(Object obj) {
        ((C14880y2) obj).mo36903c();
        return null;
    }

    /* renamed from: h */
    public Map<?, ?> mo35489h(Object obj) {
        return (C14369g6) obj;
    }

    /* renamed from: i */
    public int mo35490i(int i, Object obj, Object obj2) {
        return m63986a(i, obj, obj2);
    }
}
