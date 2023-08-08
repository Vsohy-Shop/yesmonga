package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.C0363p0;
import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.installations.local.C33093b;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@C40974d0
/* renamed from: com.google.android.gms.analytics.s */
public abstract class C40407s<T extends C40407s> {
    /* renamed from: a */
    public static String m164503a(@C0363p0 Object obj) {
        return m164505d(obj, 0);
    }

    /* renamed from: b */
    public static String m164504b(@C0363p0 Map map) {
        return m164505d(map, 1);
    }

    /* renamed from: d */
    public static String m164505d(@C0363p0 Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object next : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(m164505d(next, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String d = m164505d(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(d)) {
                    if (i > 0 && !z) {
                        sb2.append(C33093b.f80281i);
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(d);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    /* renamed from: c */
    public abstract void mo133444c(T t);
}
