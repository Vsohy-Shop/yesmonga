package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.compose.runtime.C8698y1;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.browser.trusted.q */
public class C0965q {

    /* renamed from: a */
    public static final String f3009a = "PackageIdentity";

    @C0376v0(28)
    /* renamed from: androidx.browser.trusted.q$a */
    public static class C0966a implements C0968c {
        @C0363p0
        /* renamed from: a */
        public List<byte[]> mo4057a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, C8698y1.f23301m);
            ArrayList arrayList = new ArrayList();
            SigningInfo a = packageInfo.signingInfo;
            if (a.hasMultipleSigners()) {
                for (Signature a2 : a.getApkContentsSigners()) {
                    arrayList.add(C0965q.m4314a(a2));
                }
            } else {
                arrayList.add(C0965q.m4314a(a.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        /* renamed from: b */
        public boolean mo4058b(String str, PackageManager packageManager, C0981u uVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> a;
            if (!uVar.mo4069h().equals(str) || (a = mo4057a(str, packageManager)) == null) {
                return false;
            }
            if (a.size() == 1) {
                return packageManager.hasSigningCertificate(str, uVar.mo4067f(0), 1);
            }
            return uVar.equals(C0981u.m4338c(str, a));
        }
    }

    /* renamed from: androidx.browser.trusted.q$b */
    public static class C0967b implements C0968c {
        @C0363p0
        @SuppressLint({"PackageManagerGetSignatures"})
        /* renamed from: a */
        public List<byte[]> mo4057a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature a : packageInfo.signatures) {
                byte[] a2 = C0965q.m4314a(a);
                if (a2 == null) {
                    return null;
                }
                arrayList.add(a2);
            }
            return arrayList;
        }

        /* renamed from: b */
        public boolean mo4058b(String str, PackageManager packageManager, C0981u uVar) throws IOException, PackageManager.NameNotFoundException {
            List<byte[]> a;
            if (str.equals(uVar.mo4069h()) && (a = mo4057a(str, packageManager)) != null) {
                return uVar.equals(C0981u.m4338c(str, a));
            }
            return false;
        }
    }

    /* renamed from: androidx.browser.trusted.q$c */
    public interface C0968c {
        @C0363p0
        /* renamed from: a */
        List<byte[]> mo4057a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        /* renamed from: b */
        boolean mo4058b(String str, PackageManager packageManager, C0981u uVar) throws IOException, PackageManager.NameNotFoundException;
    }

    @C0363p0
    /* renamed from: a */
    public static byte[] m4314a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: b */
    public static List<byte[]> m4315b(String str, PackageManager packageManager) {
        try {
            return m4316c().mo4057a(str, packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C0968c m4316c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0966a();
        }
        return new C0967b();
    }

    /* renamed from: d */
    public static boolean m4317d(String str, PackageManager packageManager, C0981u uVar) {
        try {
            return m4316c().mo4058b(str, packageManager, uVar);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}
