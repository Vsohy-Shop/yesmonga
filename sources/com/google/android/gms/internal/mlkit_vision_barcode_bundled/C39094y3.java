package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y3 */
public final class C39094y3 {
    /* renamed from: a */
    public static String m160984a(C39076w3 w3Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m160987d(w3Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m160985b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m160985b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m160985b(sb, i, str, b2);
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
                sb.append(C38908e5.m160482a(zzdc.m161079k0((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzdc) {
                sb.append(": \"");
                sb.append(C38908e5.m160482a((zzdc) obj));
                sb.append('\"');
            } else if (obj instanceof C39003o2) {
                sb.append(" {");
                m160987d((C39003o2) obj, sb, i + 2);
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
                m160985b(sb, i4, "key", entry.getKey());
                m160985b(sb, i4, "value", entry.getValue());
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
    public static final String m160986c(String str) {
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
    public static void m160987d(C39076w3 w3Var, StringBuilder sb, int i) {
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
        for (Method method : w3Var.getClass().getDeclaredMethods()) {
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
                    m160985b(sb, i, m160986c(str8), C39003o2.m160638u(method2, w3Var, new Object[0]));
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
                    m160985b(sb, i, m160986c(str7), C39003o2.m160638u(method3, w3Var, new Object[0]));
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
                    Object u = C39003o2.m160638u(method4, w3Var, new Object[0]);
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
                            } else if (u instanceof zzdc) {
                                z = u.equals(zzdc.f99077a);
                            } else if (u instanceof C39076w3) {
                                if (u == ((C39076w3) u).mo122909c()) {
                                }
                            } else if ((u instanceof Enum) && ((Enum) u).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) u).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) C39003o2.m160638u(method5, w3Var, new Object[0])).booleanValue()) {
                    }
                    m160985b(sb, i, m160986c(str3), u);
                }
            }
        }
        if (w3Var instanceof C38965k2) {
            Iterator<Map.Entry<C38975l2, Object>> f = ((C38965k2) w3Var).zza.mo122864f();
            while (f.hasNext()) {
                Map.Entry next = f.next();
                int i2 = ((C38975l2) next.getKey()).f98885a;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                m160985b(sb, i, sb2.toString(), next.getValue());
            }
        }
        C38938h5 h5Var = ((C39003o2) w3Var).zzc;
        if (h5Var != null) {
            h5Var.mo122924g(sb, i);
        }
    }
}
