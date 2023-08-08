package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.gtm.jd */
public final class C41355jd extends C41159b9 {

    /* renamed from: a */
    public static final Pattern f104708a = Pattern.compile("(.+)/(.+)/(.+)");

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length >= 3) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[1] instanceof C41599tg);
        String d = C41135a9.m167070d(hgVarArr[0]);
        String d2 = C41135a9.m167070d(hgVarArr[1]);
        String d3 = C41135a9.m167070d(hgVarArr[2]);
        if (length < 4) {
            str = "AES/CBC/NoPadding";
        } else {
            str = C41135a9.m167070d(hgVarArr[3]);
        }
        Matcher matcher = f104708a.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str4 = "Encrypt: invalid transformation:".concat(valueOf);
            } else {
                str4 = new String("Encrypt: invalid transformation:");
            }
            throw new RuntimeException(str4);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(d2.getBytes(), matcher.group(1));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d3.getBytes());
        try {
            Cipher instance = Cipher.getInstance(str);
            if (d == null || d.length() == 0) {
                throw new RuntimeException("Encrypt: empty input string");
            }
            try {
                instance.init(1, secretKeySpec, ivParameterSpec);
                return new C41599tg(C41323i5.m167694a(instance.doFinal(d.getBytes())));
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() != 0) {
                    str3 = "Encrypt: ".concat(valueOf2);
                } else {
                    str3 = new String("Encrypt: ");
                }
                throw new RuntimeException(str3);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str2 = "Encrypt: invalid transformation:".concat(valueOf3);
            } else {
                str2 = new String("Encrypt: invalid transformation:");
            }
            throw new RuntimeException(str2);
        }
    }
}
