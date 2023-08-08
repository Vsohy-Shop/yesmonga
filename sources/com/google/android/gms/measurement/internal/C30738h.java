package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C30738h {

    /* renamed from: b */
    public static final C30738h f73481b = new C30738h((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final EnumMap f73482a;

    public C30738h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f73482a = enumMap;
        enumMap.put(zzah.AD_STORAGE, bool);
        enumMap.put(zzah.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static C30738h m123794a(Bundle bundle) {
        if (bundle == null) {
            return f73481b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            enumMap.put(zzah, m123799n(bundle.getString(zzah.zzd)));
        }
        return new C30738h(enumMap);
    }

    /* renamed from: b */
    public static C30738h m123795b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahArr = zzah.f74160c;
                int length = zzahArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzah = zzahArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzah, bool);
                }
                i++;
            }
        }
        return new C30738h(enumMap);
    }

    /* renamed from: g */
    public static String m123796g(Bundle bundle) {
        String string;
        for (zzah zzah : zzah.values()) {
            if (bundle.containsKey(zzah.zzd) && (string = bundle.getString(zzah.zzd)) != null && m123799n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m123797j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    public static final int m123798m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    public static Boolean m123799n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C30738h mo87135c(C30738h hVar) {
        boolean z;
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f73482a.get(zzah);
            Boolean bool2 = (Boolean) hVar.f73482a.get(zzah);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (!bool.booleanValue() || !bool2.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            enumMap.put(zzah, bool);
        }
        return new C30738h(enumMap);
    }

    /* renamed from: d */
    public final C30738h mo87136d(C30738h hVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f73482a.get(zzah);
            if (bool == null) {
                bool = (Boolean) hVar.f73482a.get(zzah);
            }
            enumMap.put(zzah, bool);
        }
        return new C30738h(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo87137e() {
        return (Boolean) this.f73482a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30738h)) {
            return false;
        }
        C30738h hVar = (C30738h) obj;
        for (zzah zzah : zzah.values()) {
            if (m123798m((Boolean) this.f73482a.get(zzah)) != m123798m((Boolean) hVar.f73482a.get(zzah))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo87139f() {
        return (Boolean) this.f73482a.get(zzah.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo87140h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahArr = zzah.f74160c;
        int length = zzahArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f73482a.get(zzahArr[i]);
            if (bool == null) {
                c = '-';
            } else if (bool.booleanValue()) {
                c = '1';
            } else {
                c = '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f73482a.values()) {
            i = (i * 31) + m123798m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo87142i(zzah zzah) {
        Boolean bool = (Boolean) this.f73482a.get(zzah);
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo87143k(C30738h hVar) {
        return mo87144l(hVar, (zzah[]) this.f73482a.keySet().toArray(new zzah[0]));
    }

    /* renamed from: l */
    public final boolean mo87144l(C30738h hVar, zzah... zzahArr) {
        for (zzah zzah : zzahArr) {
            Boolean bool = (Boolean) this.f73482a.get(zzah);
            Boolean bool2 = (Boolean) hVar.f73482a.get(zzah);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzah zzah = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzah.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f73482a.get(zzah);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public C30738h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f73482a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
