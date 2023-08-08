package com.google.zxing.client.result;

import androidx.core.net.C17767c;
import java.util.List;

/* renamed from: com.google.zxing.client.result.f0 */
public final class C34684f0 extends C34702t {
    /* renamed from: q */
    public static String m141424q(CharSequence charSequence, String str, boolean z) {
        List<String> t = C34682e0.m141414t(charSequence, str, z, false);
        if (t == null || t.isEmpty()) {
            return null;
        }
        return t.get(0);
    }

    /* renamed from: r */
    public static String[] m141425r(CharSequence charSequence, String str, boolean z) {
        List<List<String>> u = C34682e0.m141415u(charSequence, str, z, false);
        if (u == null || u.isEmpty()) {
            return null;
        }
        int size = u.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) u.get(i).get(0);
        }
        return strArr;
    }

    /* renamed from: t */
    public static String m141426t(String str) {
        if (str == null) {
            return str;
        }
        if (str.startsWith(C17767c.f46167b) || str.startsWith("MAILTO:")) {
            return str.substring(7);
        }
        return str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.client.result.C34685g mo102518k(com.google.zxing.C34761k r18) {
        /*
            r17 = this;
            java.lang.String r0 = com.google.zxing.client.result.C34702t.m141532c(r18)
            java.lang.String r1 = "BEGIN:VEVENT"
            int r1 = r0.indexOf(r1)
            r2 = 0
            if (r1 >= 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r1 = "SUMMARY"
            r3 = 1
            java.lang.String r5 = m141424q(r1, r0, r3)
            java.lang.String r1 = "DTSTART"
            java.lang.String r6 = m141424q(r1, r0, r3)
            if (r6 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.String r1 = "DTEND"
            java.lang.String r7 = m141424q(r1, r0, r3)
            java.lang.String r1 = "DURATION"
            java.lang.String r8 = m141424q(r1, r0, r3)
            java.lang.String r1 = "LOCATION"
            java.lang.String r9 = m141424q(r1, r0, r3)
            java.lang.String r1 = "ORGANIZER"
            java.lang.String r1 = m141424q(r1, r0, r3)
            java.lang.String r10 = m141426t(r1)
            java.lang.String r1 = "ATTENDEE"
            java.lang.String[] r11 = m141425r(r1, r0, r3)
            r1 = 0
            if (r11 == 0) goto L_0x0052
            r4 = r1
        L_0x0044:
            int r12 = r11.length
            if (r4 >= r12) goto L_0x0052
            r12 = r11[r4]
            java.lang.String r12 = m141426t(r12)
            r11[r4] = r12
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0052:
            java.lang.String r4 = "DESCRIPTION"
            java.lang.String r12 = m141424q(r4, r0, r3)
            java.lang.String r4 = "GEO"
            java.lang.String r0 = m141424q(r4, r0, r3)
            if (r0 != 0) goto L_0x0065
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r13 = r0
            r15 = r13
            goto L_0x0080
        L_0x0065:
            r4 = 59
            int r4 = r0.indexOf(r4)
            if (r4 >= 0) goto L_0x006e
            return r2
        L_0x006e:
            java.lang.String r1 = r0.substring(r1, r4)     // Catch:{ NumberFormatException -> 0x0087 }
            double r13 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0087 }
            int r4 = r4 + r3
            java.lang.String r0 = r0.substring(r4)     // Catch:{ NumberFormatException -> 0x0087 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0087 }
            r15 = r0
        L_0x0080:
            com.google.zxing.client.result.g r0 = new com.google.zxing.client.result.g     // Catch:{  }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)     // Catch:{  }
            return r0
        L_0x0087:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.C34684f0.mo102518k(com.google.zxing.k):com.google.zxing.client.result.g");
    }
}
