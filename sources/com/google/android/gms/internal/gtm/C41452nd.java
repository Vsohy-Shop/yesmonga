package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.gtm.nd */
public final class C41452nd extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String str;
        byte[] bArr;
        String str2;
        String str3;
        C41431mg mgVar;
        C41431mg mgVar2;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41431mg mgVar3 = hgVarArr[0];
        C41431mg mgVar4 = C41431mg.f104800h;
        if (mgVar3 == mgVar4) {
            return mgVar4;
        }
        String d = C41135a9.m167070d(mgVar3);
        String str4 = "MD5";
        if (length > 1 && (mgVar2 = hgVarArr[1]) != mgVar4) {
            str4 = C41135a9.m167070d(mgVar2);
        }
        if (length <= 2 || (mgVar = hgVarArr[2]) == mgVar4) {
            str = "text";
        } else {
            str = C41135a9.m167070d(mgVar);
        }
        if ("text".equals(str)) {
            bArr = d.getBytes();
        } else if ("base16".equals(str)) {
            bArr = C41323i5.m167695b(d);
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Hash: Unknown input format: ".concat(valueOf);
            } else {
                str3 = new String("Hash: Unknown input format: ");
            }
            throw new RuntimeException(str3);
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str4);
            instance.update(bArr);
            return new C41599tg(C41323i5.m167694a(instance.digest()));
        } catch (NoSuchAlgorithmException e) {
            String valueOf2 = String.valueOf(str4);
            if (valueOf2.length() != 0) {
                str2 = "Hash: Unknown algorithm: ".concat(valueOf2);
            } else {
                str2 = new String("Hash: Unknown algorithm: ");
            }
            throw new RuntimeException(str2, e);
        }
    }
}
