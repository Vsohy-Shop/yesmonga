package androidx.core.content.p026pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0386z0;
import androidx.compose.runtime.C8698y1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.content.pm.c */
public final class C17372c {

    @C0376v0(28)
    /* renamed from: androidx.core.content.pm.c$a */
    public static class C17373a {
        @C0363p0
        @C0373u
        /* renamed from: a */
        public static Signature[] m79913a(@C0359n0 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @C0373u
        /* renamed from: b */
        public static long m79914b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @C0363p0
        @C0373u
        /* renamed from: c */
        public static Signature[] m79915c(@C0359n0 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @C0373u
        /* renamed from: d */
        public static boolean m79916d(@C0359n0 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @C0373u
        /* renamed from: e */
        public static boolean m79917e(@C0359n0 PackageManager packageManager, @C0359n0 String str, @C0359n0 byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* renamed from: a */
    public static boolean m79908a(@C0359n0 byte[][] bArr, @C0359n0 byte[] bArr2) {
        for (byte[] equals : bArr) {
            if (Arrays.equals(bArr2, equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static byte[] m79909b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    /* renamed from: c */
    public static long m79910c(@C0359n0 PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17373a.m79914b(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }

    @C0359n0
    /* renamed from: d */
    public static List<Signature> m79911d(@C0359n0 PackageManager packageManager, @C0359n0 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo a = packageManager.getPackageInfo(str, C8698y1.f23301m).signingInfo;
            if (C17373a.m79916d(a)) {
                signatureArr = C17373a.m79913a(a);
            } else {
                signatureArr = C17373a.m79915c(a);
            }
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signatureArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(signatureArr);
    }

    /* renamed from: e */
    public static boolean m79912e(@C0359n0 PackageManager packageManager, @C0359n0 String str, @C0359n0 @C0386z0(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] next : keySet) {
            if (next != null) {
                Integer num = map.get(next);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
                }
            } else {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
        }
        List<Signature> d = m79911d(packageManager, str);
        if (z || Build.VERSION.SDK_INT < 28) {
            if (d.size() != 0 && map.size() <= d.size() && (!z || map.size() == d.size())) {
                if (map.containsValue(1)) {
                    bArr = new byte[d.size()][];
                    for (int i = 0; i < d.size(); i++) {
                        bArr[i] = m79909b(d.get(i).toByteArray());
                    }
                } else {
                    bArr = null;
                }
                Iterator<byte[]> it = keySet.iterator();
                if (it.hasNext()) {
                    byte[] next2 = it.next();
                    Integer num2 = map.get(next2);
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            throw new IllegalArgumentException("Unsupported certificate type " + num2);
                        } else if (!m79908a(bArr, next2)) {
                            return false;
                        }
                    } else if (!d.contains(new Signature(next2))) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        for (byte[] next3 : keySet) {
            if (!C17373a.m79917e(packageManager, str, next3, map.get(next3).intValue())) {
                return false;
            }
        }
        return true;
    }
}
