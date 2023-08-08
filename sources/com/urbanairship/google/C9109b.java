package com.urbanairship.google;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.google.b */
public class C9109b {

    /* renamed from: a */
    public static Boolean f24619a = null;

    /* renamed from: b */
    public static final int f24620b = 0;

    /* renamed from: c */
    public static final int f24621c = 1;

    /* renamed from: d */
    public static final int f24622d = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.google.b$a */
    public @interface C9110a {
    }

    @C0348i1
    /* renamed from: a */
    public static int m34010a(@C0359n0 Context context) {
        if (!m34011b()) {
            return 2;
        }
        return C9112d.m34019a(context);
    }

    /* renamed from: b */
    public static boolean m34011b() {
        if (f24619a == null) {
            if (!C9111c.m34016e()) {
                f24619a = Boolean.FALSE;
            } else {
                try {
                    Class.forName("com.google.android.gms.security.a");
                    f24619a = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f24619a = Boolean.FALSE;
                }
            }
        }
        return f24619a.booleanValue();
    }
}
