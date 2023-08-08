package com.google.android.gms.internal.measurement;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.ya */
public final class C42280ya {

    /* renamed from: a */
    public static final char[] f106556a;

    static {
        char[] cArr = new char[80];
        f106556a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m171172a(C42246wa waVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m171175d(waVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m171173b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m171173b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m171173b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            m171174c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append(C32920e.f79928l);
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C42264xb.m171118a(new zzjx(((String) obj).getBytes(C41860aa.f105996b))));
                sb.append('\"');
            } else if (obj instanceof zzka) {
                sb.append(": \"");
                sb.append(C42264xb.m171118a((zzka) obj));
                sb.append('\"');
            } else if (obj instanceof C42177s9) {
                sb.append(" {");
                m171175d((C42177s9) obj, sb, i + 2);
                sb.append("\n");
                m171174c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                m171173b(sb, i3, "key", entry.getKey());
                m171173b(sb, i3, "value", entry.getValue());
                sb.append("\n");
                m171174c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m171174c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f106556a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m171175d(C42246wa waVar, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        C42246wa waVar2 = waVar;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = waVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m171173b(sb2, i3, substring.substring(0, substring.length() - 4), C42177s9.m170823s(method2, waVar2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m171173b(sb2, i3, substring.substring(0, substring.length() - 3), C42177s9.m170823s(method, waVar2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object s = C42177s9.m170823s(method4, waVar2, new Object[0]);
                    if (method5 == null) {
                        if (s instanceof Boolean) {
                            if (!((Boolean) s).booleanValue()) {
                            }
                        } else if (s instanceof Integer) {
                            if (((Integer) s).intValue() == 0) {
                            }
                        } else if (s instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) s).floatValue()) == 0) {
                            }
                        } else if (!(s instanceof Double)) {
                            if (s instanceof String) {
                                z = s.equals("");
                            } else if (s instanceof zzka) {
                                z = s.equals(zzka.f106708a);
                            } else if (s instanceof C42246wa) {
                                if (s == ((C42246wa) s).mo137176f()) {
                                }
                            } else if ((s instanceof Enum) && ((Enum) s).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) s).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C42177s9.m170823s(method5, waVar2, new Object[0])).booleanValue()) {
                    }
                    m171173b(sb2, i3, substring, s);
                }
            }
            i2 = 3;
        }
        if (!(waVar2 instanceof C42109o9)) {
            C42298zb zbVar = ((C42177s9) waVar2).zzc;
            if (zbVar != null) {
                zbVar.mo137530i(sb2, i3);
                return;
            }
            return;
        }
        C42109o9 o9Var = (C42109o9) waVar2;
        throw null;
    }
}
