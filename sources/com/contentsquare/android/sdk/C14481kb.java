package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.contentsquare.android.sdk.kb */
public final class C14481kb {
    /* renamed from: a */
    public static String m62420a(C14218ba baVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m62422c(baVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m62421b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(C32920e.f79928l);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m62422c(C14218ba baVar, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : baVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m62423d(sb, i, m62421b(str2), C14359g4.m61821v(method2, baVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m62423d(sb, i, m62421b(str3), C14359g4.m61821v(method3, baVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object v = C14359g4.m61821v(method4, baVar, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) C14359g4.m61821v(method5, baVar, new Object[0])).booleanValue();
                    } else if (m62424e(v)) {
                        z = false;
                    }
                    if (z) {
                        m62423d(sb, i, m62421b(str4), v);
                    }
                }
            }
        }
        if (baVar instanceof C14359g4.C14362c) {
            Iterator<Map.Entry<C14359g4.C14363d, Object>> w = ((C14359g4.C14362c) baVar).f35522e.mo34874w();
            while (w.hasNext()) {
                Map.Entry next = w.next();
                m62423d(sb, i, "[" + ((C14359g4.C14363d) next.getKey()).mo34877a() + "]", next.getValue());
            }
        }
        C14197b1 b1Var = ((C14359g4) baVar).f35516b;
        if (b1Var != null) {
            b1Var.mo34622h(sb, i);
        }
    }

    /* renamed from: d */
    public static final void m62423d(StringBuilder sb, int i, String str, Object obj) {
        String b;
        if (obj instanceof List) {
            for (Object d : (List) obj) {
                m62423d(sb, i, str, d);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d2 : ((Map) obj).entrySet()) {
                m62423d(sb, i, str, d2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                b = C14701s9.m63397c((String) obj);
            } else if (obj instanceof C14719t0) {
                sb.append(": \"");
                b = C14701s9.m63396b((C14719t0) obj);
            } else {
                if (obj instanceof C14359g4) {
                    sb.append(" {");
                    m62422c((C14359g4) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    m62423d(sb, i4, "key", entry.getKey());
                    m62423d(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(b);
            sb.append('\"');
        }
    }

    /* renamed from: e */
    public static boolean m62424e(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof C14719t0) {
            return obj.equals(C14719t0.f36442b);
        }
        if (obj instanceof C14218ba) {
            return obj == ((C14218ba) obj).mo35313Y();
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal() == 0;
        }
        return false;
    }
}
