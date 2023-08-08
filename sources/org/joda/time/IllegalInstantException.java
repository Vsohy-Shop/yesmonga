package org.joda.time;

import com.carrefour.fid.android.core.extension.C36306e;
import org.joda.time.format.C12671a;

public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    /* renamed from: a */
    public static String m51505a(long j, String str) {
        String str2;
        String v = C12671a.m54028f("yyyy-MM-dd'T'HH:mm:ss.SSS").mo29259v(new Instant(j));
        if (str != null) {
            str2 = C36306e.f89637a + str + ")";
        } else {
            str2 = "";
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + v + str2;
    }

    /* renamed from: b */
    public static boolean m51506b(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return m51506b(th.getCause());
    }

    public IllegalInstantException(long j, String str) {
        super(m51505a(j, str));
    }
}
