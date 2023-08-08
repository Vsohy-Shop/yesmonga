package p073j$.time;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.carrefour.fid.android.shared.util.C28932h;
import com.google.android.material.badge.C31132a;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import p073j$.time.zone.C42683c;

/* renamed from: j$.time.ZoneId */
public abstract class ZoneId implements Serializable {

    /* renamed from: a */
    public static final Map f107739a;

    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f107739a = Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != C42660n.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* renamed from: o */
    public static ZoneId m171931o(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, C16717v.C16720c.f42211R);
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals(C28932h.f70913W) || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.mo138005q() != 0) {
                str = str.concat(zoneOffset.mo138002s());
            }
            return new C42660n(str, C42683c.m172571j(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
    }

    /* renamed from: of */
    public static ZoneId m171932of(String str) {
        int i;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith(C31132a.f74628J0) || str.startsWith("-")) {
            return ZoneOffset.m171935E(str);
        }
        if (str.startsWith("UTC") || str.startsWith(C28932h.f70913W)) {
            i = 3;
        } else if (!str.startsWith("UT")) {
            return C42660n.m172439q(str);
        } else {
            i = 2;
        }
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return m171931o(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C42660n.m172439q(str);
        }
        try {
            ZoneOffset E = ZoneOffset.m171935E(str.substring(i));
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            return m171931o(substring, E);
        } catch (C42586c e) {
            throw new C42586c("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = f107739a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return m171932of(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo138002s().equals(((ZoneId) obj).mo138002s());
        }
        return false;
    }

    public int hashCode() {
        return mo138002s().hashCode();
    }

    /* renamed from: n */
    public abstract C42683c mo138001n();

    /* renamed from: s */
    public abstract String mo138002s();

    public String toString() {
        return mo138002s();
    }
}
