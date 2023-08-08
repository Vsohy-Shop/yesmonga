package com.urbanairship.util;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.http.RequestException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.g0 */
public class C9651g0 {

    /* renamed from: a */
    public static final String f26458a = "amazon";

    /* renamed from: b */
    public static final String f26459b = "android";

    /* renamed from: c */
    public static final String f26460c = "unknown";

    @C0359n0
    /* renamed from: a */
    public static String m36156a(int i) {
        return i != 1 ? i != 2 ? "unknown" : "android" : "amazon";
    }

    @C0359n0
    /* renamed from: b */
    public static String m36157b(int i) throws RequestException {
        String a = m36156a(i);
        if (!a.equals("unknown")) {
            return a;
        }
        throw new RequestException("Invalid platform");
    }

    /* renamed from: c */
    public static boolean m36158c(int i) {
        return i == -1 || i == 1 || i == 2;
    }

    /* renamed from: d */
    public static int m36159d(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return -1;
            }
        }
        return i2;
    }
}
