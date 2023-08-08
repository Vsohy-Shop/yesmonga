package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.wrappers.C41008d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.common.util.a */
public class C40963a {

    /* renamed from: a */
    public static volatile int f104209a = -1;

    @C0363p0
    @C40473a
    @Deprecated
    /* renamed from: a */
    public static byte[] m166572a(@C0359n0 Context context, @C0359n0 String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo f = C41008d.m166715a(context).mo134784f(str, 64);
        Signature[] signatureArr = f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m166573b("SHA1")) == null) {
            return null;
        }
        return b.digest(f.signatures[0].toByteArray());
    }

    @C0363p0
    /* renamed from: b */
    public static MessageDigest m166573b(@C0359n0 String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
