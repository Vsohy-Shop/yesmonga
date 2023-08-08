package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class z00 {
    /* renamed from: a */
    public static String m121428a(x00 x00, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m121431d(x00, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m121429b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m121429b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m121429b(sb, i, str, b2);
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
                sb.append(C29319i.m120492a(zbwp.m121497Q((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zbwp) {
                sb.append(": \"");
                sb.append(C29319i.m120492a((zbwp) obj));
                sb.append('\"');
            } else if (obj instanceof C29502mz) {
                sb.append(" {");
                m121431d((C29502mz) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m121429b(sb, i4, "key", entry.getKey());
                m121429b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    public static final String m121430c(String str) {
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

    /* renamed from: d */
    public static void m121431d(x00 x00, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : x00.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str9 : treeSet) {
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String valueOf = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf2.length() != 0) {
                    str8 = valueOf.concat(valueOf2);
                } else {
                    str8 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m121429b(sb, i, m121430c(str8), C29502mz.m120761u(method2, x00, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String valueOf3 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf4.length() != 0) {
                    str7 = valueOf3.concat(valueOf4);
                } else {
                    str7 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m121429b(sb, i, m121430c(str7), C29502mz.m120761u(method3, x00, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf5.length() != 0) {
                        str6 = "get".concat(valueOf5);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String valueOf6 = String.valueOf(str.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(str.substring(1));
                if (valueOf7.length() != 0) {
                    str3 = valueOf6.concat(valueOf7);
                } else {
                    str3 = new String(valueOf6);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object u = C29502mz.m120761u(method4, x00, new Object[0]);
                    if (method5 == null) {
                        if (u instanceof Boolean) {
                            if (!((Boolean) u).booleanValue()) {
                            }
                        } else if (u instanceof Integer) {
                            if (((Integer) u).intValue() == 0) {
                            }
                        } else if (u instanceof Float) {
                            if (((Float) u).floatValue() == 0.0f) {
                            }
                        } else if (!(u instanceof Double)) {
                            if (u instanceof String) {
                                z = u.equals("");
                            } else if (u instanceof zbwp) {
                                z = u.equals(zbwp.f71626a);
                            } else if (u instanceof x00) {
                                if (u == ((x00) u).mo84649i()) {
                                }
                            } else if ((u instanceof Enum) && ((Enum) u).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) u).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) C29502mz.m120761u(method5, x00, new Object[0])).booleanValue()) {
                    }
                    m121429b(sb, i, m121430c(str3), u);
                }
            }
        }
        if (x00 instanceof C29354iz) {
            Iterator<Map.Entry<C29391jz, Object>> h = ((C29354iz) x00).zbb.mo84566h();
            if (h.hasNext()) {
                C29391jz jzVar = (C29391jz) h.next().getKey();
                throw null;
            }
        }
        C29392k kVar = ((C29502mz) x00).zbc;
        if (kVar != null) {
            kVar.mo84697g(sb, i);
        }
    }
}
