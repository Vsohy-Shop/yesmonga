package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
public final class C41947f7 {
    /* renamed from: a */
    public static C42133q m169876a(C41892c6 c6Var) {
        if (c6Var == null) {
            return C42133q.f106351H;
        }
        int K = c6Var.mo136657K() - 1;
        if (K != 1) {
            if (K != 2) {
                if (K != 3) {
                    if (K == 4) {
                        List<C41892c6> F = c6Var.mo136652F();
                        ArrayList arrayList = new ArrayList();
                        for (C41892c6 a : F) {
                            arrayList.add(m169876a(a));
                        }
                        return new C42150r(c6Var.mo136650D(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (c6Var.mo136654H()) {
                    return new C41957g(Boolean.valueOf(c6Var.mo136653G()));
                } else {
                    return new C41957g((Boolean) null);
                }
            } else if (c6Var.mo136655I()) {
                return new C41993i(Double.valueOf(c6Var.mo136649B()));
            } else {
                return new C41993i((Double) null);
            }
        } else if (c6Var.mo136656J()) {
            return new C42201u(c6Var.mo136651E());
        } else {
            return C42133q.f106358O;
        }
    }

    /* renamed from: b */
    public static C42133q m169877b(Object obj) {
        if (obj == null) {
            return C42133q.f106352I;
        }
        if (obj instanceof String) {
            return new C42201u((String) obj);
        }
        if (obj instanceof Double) {
            return new C41993i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C41993i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C41993i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C41957g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C42082n nVar = new C42082n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C42133q b = m169877b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo136748w((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C41939f fVar = new C41939f();
            for (Object b2 : (List) obj) {
                fVar.mo136737f0(fVar.mo136726A(), m169877b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
