package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.C40715h;

/* renamed from: com.google.android.gms.internal.gtm.s0 */
public final class C41559s0 {

    /* renamed from: a */
    public static final String f104933a;

    /* renamed from: b */
    public static final String f104934b;

    static {
        String str;
        String replaceAll = String.valueOf(C40715h.f103695a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        f104933a = replaceAll;
        String valueOf = String.valueOf(replaceAll);
        if (valueOf.length() != 0) {
            str = "ma".concat(valueOf);
        } else {
            str = new String("ma");
        }
        f104934b = str;
    }
}
