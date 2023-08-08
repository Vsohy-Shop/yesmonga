package com.google.android.gms.internal.gtm;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.installations.C33124s;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.d4 */
public final class C41202d4 extends C41535r0 {

    /* renamed from: c */
    public static C41202d4 f104515c;

    public C41202d4(C41607u0 u0Var) {
        super(u0Var);
    }

    /* renamed from: X */
    public static C41202d4 m167313X() {
        return f104515c;
    }

    @C40974d0
    /* renamed from: c0 */
    public static final String m167314c0(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))) + "..." + str + Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                return obj.getClass().getCanonicalName();
            }
            return str;
        }
    }

    /* renamed from: W */
    public final void mo133294W() {
        synchronized (C41202d4.class) {
            f104515c = this;
        }
    }

    /* renamed from: Z */
    public final void mo135211Z(C41706y3 y3Var, String str) {
        String str2;
        String str3;
        if (y3Var != null) {
            str2 = y3Var.toString();
        } else {
            str2 = "no hit data";
        }
        if (str.length() != 0) {
            str3 = "Discarding hit. ".concat(str);
        } else {
            str3 = new String("Discarding hit. ");
        }
        mo135763z(str3, str2);
    }

    /* renamed from: a0 */
    public final void mo135212a0(Map<String, String> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) next.getKey());
            sb.append('=');
            sb.append((String) next.getValue());
        }
        String sb2 = sb.toString();
        if (str.length() != 0) {
            str2 = "Discarding hit. ".concat(str);
        } else {
            str2 = new String("Discarding hit. ");
        }
        mo135763z(str2, sb2);
    }

    /* renamed from: b0 */
    public final synchronized void mo135213b0(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        C40843u.m166202l(str);
        if (mo135742P().mo135816b()) {
            mo135742P();
            c = C15369g.f37986l;
        } else {
            mo135742P();
            c = C15369g.f37985k;
        }
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = C41559s0.f104933a;
        String k = C41511q0.m168202k(str, m167314c0(obj), m167314c0(obj2), m167314c0(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(k).length());
        sb.append("3");
        sb.append(charAt);
        sb.append(c);
        sb.append(str2);
        sb.append(C33124s.f80355c);
        sb.append(k);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, 1024);
        }
        C41346j4 p = mo135739M().mo135905p();
        if (p != null) {
            p.mo135506b0().mo135483c(sb2);
        }
    }
}
