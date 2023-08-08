package com.google.android.gms.internal.gtm;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.gtm.wk */
public final class C41675wk {
    /* renamed from: a */
    public static String m168683a(C41627uk ukVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m168686d(ukVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m168684b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m168684b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m168684b(sb, i, str, b2);
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
                sb.append(C41700xl.m168831a(zztd.m168980X((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zztd) {
                sb.append(": \"");
                sb.append(C41700xl.m168831a((zztd) obj));
                sb.append('\"');
            } else if (obj instanceof C41410lj) {
                sb.append(" {");
                m168686d((C41410lj) obj, sb, i + 2);
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
                m168684b(sb, i4, "key", entry.getKey());
                m168684b(sb, i4, "value", entry.getValue());
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
    public static final String m168685c(String str) {
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
    public static void m168686d(C41627uk ukVar, StringBuilder sb, int i) {
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
        for (Method method : ukVar.getClass().getDeclaredMethods()) {
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
                    m168684b(sb, i, m168685c(str8), C41410lj.m168021v(method2, ukVar, new Object[0]));
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
                    m168684b(sb, i, m168685c(str7), C41410lj.m168021v(method3, ukVar, new Object[0]));
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
                    Object v = C41410lj.m168021v(method4, ukVar, new Object[0]);
                    if (method5 == null) {
                        if (v instanceof Boolean) {
                            if (!((Boolean) v).booleanValue()) {
                            }
                        } else if (v instanceof Integer) {
                            if (((Integer) v).intValue() == 0) {
                            }
                        } else if (v instanceof Float) {
                            if (((Float) v).floatValue() == 0.0f) {
                            }
                        } else if (!(v instanceof Double)) {
                            if (v instanceof String) {
                                z = v.equals("");
                            } else if (v instanceof zztd) {
                                z = v.equals(zztd.f105744a);
                            } else if (v instanceof C41627uk) {
                                if (v == ((C41627uk) v).mo135365h()) {
                                }
                            } else if ((v instanceof Enum) && ((Enum) v).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) v).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) C41410lj.m168021v(method5, ukVar, new Object[0])).booleanValue()) {
                    }
                    m168684b(sb, i, m168685c(str3), v);
                }
            }
        }
        if (ukVar instanceof C41313hj) {
            Iterator<Map.Entry<C41337ij, Object>> f = ((C41313hj) ukVar).zza.mo135112f();
            while (f.hasNext()) {
                Map.Entry next = f.next();
                int i2 = ((C41337ij) next.getKey()).f104680b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                m168684b(sb, i, sb2.toString(), next.getValue());
            }
        }
        C41748zl zlVar = ((C41410lj) ukVar).zzc;
        if (zlVar != null) {
            zlVar.mo136130g(sb, i);
        }
    }
}
