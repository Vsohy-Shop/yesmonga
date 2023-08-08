package com.google.android.gms.internal.gtm;

import android.util.Base64;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.id */
public final class C41331id extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        String str4;
        String str5;
        String str6;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        String d = C41135a9.m167070d(hgVarArr[0]);
        if (length > 1) {
            str = C41135a9.m167070d(hgVarArr[1]);
        } else {
            str = "text";
        }
        int i = 2;
        if (length > 2) {
            str2 = C41135a9.m167070d(hgVarArr[2]);
        } else {
            str2 = "base16";
        }
        if (length > 3 && C41135a9.m167073g(hgVarArr[3])) {
            i = 3;
        }
        try {
            if ("text".equals(str)) {
                bArr = d.getBytes();
            } else if ("base16".equals(str)) {
                bArr = C41323i5.m167695b(d);
            } else if ("base64".equals(str)) {
                bArr = Base64.decode(d, i);
            } else if ("base64url".equals(str)) {
                bArr = Base64.decode(d, i | 8);
            } else {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str6 = "Encode: unknown input format: ".concat(valueOf);
                } else {
                    str6 = new String("Encode: unknown input format: ");
                }
                throw new UnsupportedOperationException(str6);
            }
            if ("base16".equals(str2)) {
                str4 = C41323i5.m167694a(bArr);
            } else if ("base64".equals(str2)) {
                str4 = Base64.encodeToString(bArr, i);
            } else if ("base64url".equals(str2)) {
                str4 = Base64.encodeToString(bArr, i | 8);
            } else {
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    str5 = "Encode: unknown output format: ".concat(valueOf2);
                } else {
                    str5 = new String("Encode: unknown output format: ");
                }
                throw new RuntimeException(str5);
            }
            return new C41599tg(str4);
        } catch (IllegalArgumentException unused) {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str3 = "Encode: invalid input:".concat(valueOf3);
            } else {
                str3 = new String("Encode: invalid input:");
            }
            throw new RuntimeException(str3);
        }
    }
}
