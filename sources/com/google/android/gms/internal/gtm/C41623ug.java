package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.ug */
public final class C41623ug {
    /* renamed from: a */
    public static Bundle m168489a(Map<String, C41310hg<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() instanceof C41599tg) {
                bundle.putString((String) next.getKey(), ((C41599tg) next.getValue()).mo135863k());
            } else if (next.getValue() instanceof C41334ig) {
                bundle.putBoolean((String) next.getKey(), ((C41334ig) next.getValue()).mo135499i().booleanValue());
            } else if (next.getValue() instanceof C41358jg) {
                bundle.putDouble((String) next.getKey(), ((C41358jg) next.getValue()).mo135515i().doubleValue());
            } else if (next.getValue() instanceof C41527qg) {
                bundle.putBundle((String) next.getKey(), m168489a(((C41527qg) next.getValue()).f104661a));
            } else {
                throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", new Object[]{next.getKey()}));
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static C41310hg<?> m168490b(@C0363p0 Object obj) {
        if (obj == null) {
            return C41431mg.f104799g;
        }
        if (obj instanceof C41310hg) {
            return (C41310hg) obj;
        }
        if (obj instanceof Boolean) {
            return new C41334ig((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new C41358jg(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C41358jg(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new C41358jg(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new C41358jg(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new C41358jg((Double) obj);
        }
        if (obj instanceof Byte) {
            return new C41599tg(obj.toString());
        }
        if (obj instanceof Character) {
            return new C41599tg(obj.toString());
        }
        if (obj instanceof String) {
            return new C41599tg((String) obj);
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object b : (List) obj) {
                arrayList.add(m168490b(b));
            }
            return new C41503pg(arrayList);
        } else if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                C40843u.m166191a(entry.getKey() instanceof String);
                hashMap.put((String) entry.getKey(), m168490b(entry.getValue()));
            }
            return new C41527qg(hashMap);
        } else if (obj instanceof Bundle) {
            HashMap hashMap2 = new HashMap();
            Bundle bundle = (Bundle) obj;
            for (String next : bundle.keySet()) {
                hashMap2.put(next, m168490b(bundle.get(next)));
            }
            return new C41527qg(hashMap2);
        } else {
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Type not supported: ");
            sb.append(valueOf);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: c */
    public static C41310hg m168491c(C41277g7 g7Var, C41310hg hgVar) {
        C40843u.m166202l(hgVar);
        if (!m168498j(hgVar) && !(hgVar instanceof C41383kg) && !(hgVar instanceof C41503pg) && !(hgVar instanceof C41527qg)) {
            if (hgVar instanceof C41551rg) {
                hgVar = m168492d(g7Var, (C41551rg) hgVar);
            } else {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
        }
        if (hgVar == null) {
            throw new IllegalArgumentException("AbstractType evaluated to Java null");
        } else if (!(hgVar instanceof C41551rg)) {
            return hgVar;
        } else {
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
    }

    /* renamed from: d */
    public static C41310hg m168492d(C41277g7 g7Var, C41551rg rgVar) {
        String i = rgVar.mo135807i();
        List<C41310hg<?>> j = rgVar.mo135808j();
        C41310hg<?> b = g7Var.mo135407b(i);
        if (b == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
            sb.append("Function '");
            sb.append(i);
            sb.append("' is not supported");
            throw new UnsupportedOperationException(sb.toString());
        } else if (b instanceof C41383kg) {
            return ((C41383kg) b).mo135582i().mo135005a(g7Var, (C41310hg[]) j.toArray(new C41310hg[j.size()]));
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 29);
            sb2.append("Function '");
            sb2.append(i);
            sb2.append("' is not a function");
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: e */
    public static C41310hg m168493e(C41310hg<?> hgVar) {
        if (!(hgVar instanceof C41527qg)) {
            return hgVar;
        }
        HashSet<String> hashSet = new HashSet<>();
        Map<String, C41310hg<?>> map = ((C41527qg) hgVar).f104661a;
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() == C41431mg.f104800h) {
                hashSet.add((String) next.getKey());
            }
        }
        for (String remove : hashSet) {
            map.remove(remove);
        }
        return hgVar;
    }

    /* renamed from: f */
    public static C41431mg m168494f(C41277g7 g7Var, List<C41310hg<?>> list) {
        for (C41310hg next : list) {
            C40843u.m166191a(next instanceof C41551rg);
            C41310hg c = m168491c(g7Var, next);
            if (m168497i(c)) {
                return (C41431mg) c;
            }
        }
        return C41431mg.f104800h;
    }

    /* renamed from: g */
    public static Object m168495g(C41310hg<?> hgVar) {
        if (hgVar == null || hgVar == C41431mg.f104799g) {
            return null;
        }
        if (hgVar instanceof C41334ig) {
            return ((C41334ig) hgVar).mo135499i();
        }
        if (hgVar instanceof C41358jg) {
            C41358jg jgVar = (C41358jg) hgVar;
            double doubleValue = jgVar.mo135515i().doubleValue();
            if (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) {
                return jgVar.mo135515i().toString();
            }
            return Integer.valueOf((int) doubleValue);
        } else if (hgVar instanceof C41599tg) {
            return ((C41599tg) hgVar).mo135863k();
        } else {
            if (hgVar instanceof C41503pg) {
                ArrayList arrayList = new ArrayList();
                for (C41310hg next : ((C41503pg) hgVar).mo135719k()) {
                    Object g = m168495g(next);
                    if (g == null) {
                        C41493p6.m168149a(String.format("Failure to convert a list element to object: %s (%s)", new Object[]{next, next.getClass().getCanonicalName()}));
                        return null;
                    }
                    arrayList.add(g);
                }
                return arrayList;
            } else if (hgVar instanceof C41527qg) {
                HashMap hashMap = new HashMap();
                for (Map.Entry next2 : ((C41527qg) hgVar).f104661a.entrySet()) {
                    Object g2 = m168495g((C41310hg) next2.getValue());
                    if (g2 == null) {
                        C41493p6.m168149a(String.format("Failure to convert a map's value to object: %s (%s)", new Object[]{next2.getValue(), ((C41310hg) next2.getValue()).getClass().getCanonicalName()}));
                        return null;
                    }
                    hashMap.put((String) next2.getKey(), g2);
                }
                return hashMap;
            } else {
                String valueOf = String.valueOf(hgVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Converting to Object from unknown abstract type: ");
                sb.append(valueOf);
                C41493p6.m168149a(sb.toString());
                return null;
            }
        }
    }

    /* renamed from: h */
    public static Map<String, Object> m168496h(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                hashMap.put(next, m168496h((Bundle) obj));
            } else if (obj instanceof List) {
                hashMap.put(next, m168499k((List) obj));
            } else {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    public static boolean m168497i(C41310hg hgVar) {
        if (hgVar == C41431mg.f104798f || hgVar == C41431mg.f104797e) {
            return true;
        }
        if (!(hgVar instanceof C41431mg)) {
            return false;
        }
        if (((C41431mg) hgVar).mo135643j()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m168498j(C41310hg hgVar) {
        return (hgVar instanceof C41334ig) || (hgVar instanceof C41358jg) || (hgVar instanceof C41599tg) || hgVar == C41431mg.f104799g || hgVar == C41431mg.f104800h;
    }

    /* renamed from: k */
    public static List<Object> m168499k(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Bundle) {
                arrayList.add(m168496h((Bundle) next));
            } else if (next instanceof List) {
                arrayList.add(m168499k((List) next));
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
