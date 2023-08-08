package com.urbanairship.util;

import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.k */
public class C9658k {
    @C0359n0
    /* renamed from: a */
    public static String m36180a(@C0354l int i) {
        StringBuilder sb = new StringBuilder("#");
        sb.append(Integer.toHexString(i));
        while (sb.length() < 9) {
            sb.append("0");
        }
        return sb.toString();
    }
}
