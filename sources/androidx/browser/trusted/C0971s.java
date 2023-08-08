package androidx.browser.trusted;

import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.browser.trusted.s */
public final class C0971s {

    /* renamed from: b */
    public static final String f3019b = "Token";
    @C0359n0

    /* renamed from: a */
    public final C0981u f3020a;

    public C0971s(@C0359n0 C0981u uVar) {
        this.f3020a = uVar;
    }

    @C0363p0
    /* renamed from: a */
    public static C0971s m4324a(@C0359n0 String str, @C0359n0 PackageManager packageManager) {
        List<byte[]> b = C0965q.m4315b(str, packageManager);
        if (b == null) {
            return null;
        }
        try {
            return new C0971s(C0981u.m4338c(str, b));
        } catch (IOException unused) {
            return null;
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C0971s m4325b(@C0359n0 byte[] bArr) {
        return new C0971s(C0981u.m4340e(bArr));
    }

    /* renamed from: c */
    public boolean mo4059c(@C0359n0 String str, @C0359n0 PackageManager packageManager) {
        return C0965q.m4317d(str, packageManager, this.f3020a);
    }

    @C0359n0
    /* renamed from: d */
    public byte[] mo4060d() {
        return this.f3020a.mo4072j();
    }
}
