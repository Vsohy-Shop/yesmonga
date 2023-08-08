package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@C40473a
@C40974d0
/* renamed from: com.google.android.gms.common.util.b0 */
public class C40966b0 {

    /* renamed from: a */
    public static final Pattern f104210a = Pattern.compile("\\$\\{(.*?)\\}");

    @C0363p0
    @C40473a
    /* renamed from: a */
    public static String m166591a(@C0363p0 String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @C40473a
    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: b */
    public static boolean m166592b(@C0363p0 String str) {
        return str == null || str.trim().isEmpty();
    }
}
