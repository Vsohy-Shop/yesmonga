package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import androidx.core.p027os.C17781e;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* renamed from: androidx.core.hardware.fingerprint.a */
public class C17666a {

    /* renamed from: a */
    public final Context f46017a;

    /* renamed from: androidx.core.hardware.fingerprint.a$a */
    public class C17667a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        public final /* synthetic */ C17669c f46018a;

        public C17667a(C17669c cVar) {
            this.f46018a = cVar;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f46018a.mo52088a(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f46018a.mo52089b();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f46018a.mo52090c(i, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f46018a.mo52091d(new C17670d(C17666a.m80855f(C17668b.m80862b(authenticationResult))));
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.hardware.fingerprint.a$b */
    public static class C17668b {
        @C0380x0("android.permission.USE_FINGERPRINT")
        @C0373u
        /* renamed from: a */
        public static void m80861a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @C0373u
        /* renamed from: b */
        public static FingerprintManager.CryptoObject m80862b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @C0373u
        /* renamed from: c */
        public static FingerprintManager m80863c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @C0380x0("android.permission.USE_FINGERPRINT")
        @C0373u
        /* renamed from: d */
        public static boolean m80864d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @C0380x0("android.permission.USE_FINGERPRINT")
        @C0373u
        /* renamed from: e */
        public static boolean m80865e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @C0373u
        /* renamed from: f */
        public static C17671e m80866f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C17671e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C17671e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C17671e(cryptoObject.getMac());
            }
            return null;
        }

        @C0373u
        /* renamed from: g */
        public static FingerprintManager.CryptoObject m80867g(C17671e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.mo52093a() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo52093a());
            }
            if (eVar.mo52095c() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo52095c());
            }
            if (eVar.mo52094b() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo52094b());
            }
            return null;
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$c */
    public static abstract class C17669c {
        /* renamed from: a */
        public void mo52088a(int i, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo52089b() {
        }

        /* renamed from: c */
        public void mo52090c(int i, CharSequence charSequence) {
        }

        /* renamed from: d */
        public void mo52091d(C17670d dVar) {
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$d */
    public static final class C17670d {

        /* renamed from: a */
        public final C17671e f46019a;

        public C17670d(C17671e eVar) {
            this.f46019a = eVar;
        }

        /* renamed from: a */
        public C17671e mo52092a() {
            return this.f46019a;
        }
    }

    public C17666a(Context context) {
        this.f46017a = context;
    }

    @C0359n0
    /* renamed from: b */
    public static C17666a m80853b(@C0359n0 Context context) {
        return new C17666a(context);
    }

    @C0363p0
    @C0376v0(23)
    /* renamed from: c */
    public static FingerprintManager m80854c(@C0359n0 Context context) {
        return C17668b.m80863c(context);
    }

    @C0376v0(23)
    /* renamed from: f */
    public static C17671e m80855f(FingerprintManager.CryptoObject cryptoObject) {
        return C17668b.m80866f(cryptoObject);
    }

    @C0376v0(23)
    /* renamed from: g */
    public static FingerprintManager.AuthenticationCallback m80856g(C17669c cVar) {
        return new C17667a(cVar);
    }

    @C0376v0(23)
    /* renamed from: h */
    public static FingerprintManager.CryptoObject m80857h(C17671e eVar) {
        return C17668b.m80867g(eVar);
    }

    @C0380x0("android.permission.USE_FINGERPRINT")
    /* renamed from: a */
    public void mo52081a(@C0363p0 C17671e eVar, int i, @C0363p0 C17781e eVar2, @C0359n0 C17669c cVar, @C0363p0 Handler handler) {
        CancellationSignal cancellationSignal;
        FingerprintManager c = m80854c(this.f46017a);
        if (c != null) {
            if (eVar2 != null) {
                cancellationSignal = (CancellationSignal) eVar2.mo52220b();
            } else {
                cancellationSignal = null;
            }
            C17668b.m80861a(c, m80857h(eVar), cancellationSignal, i, m80856g(cVar), handler);
        }
    }

    @C0380x0("android.permission.USE_FINGERPRINT")
    /* renamed from: d */
    public boolean mo52082d() {
        FingerprintManager c = m80854c(this.f46017a);
        if (c == null || !C17668b.m80864d(c)) {
            return false;
        }
        return true;
    }

    @C0380x0("android.permission.USE_FINGERPRINT")
    /* renamed from: e */
    public boolean mo52083e() {
        FingerprintManager c = m80854c(this.f46017a);
        if (c == null || !C17668b.m80865e(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$e */
    public static class C17671e {

        /* renamed from: a */
        public final Signature f46020a;

        /* renamed from: b */
        public final Cipher f46021b;

        /* renamed from: c */
        public final Mac f46022c;

        public C17671e(@C0359n0 Signature signature) {
            this.f46020a = signature;
            this.f46021b = null;
            this.f46022c = null;
        }

        @C0363p0
        /* renamed from: a */
        public Cipher mo52093a() {
            return this.f46021b;
        }

        @C0363p0
        /* renamed from: b */
        public Mac mo52094b() {
            return this.f46022c;
        }

        @C0363p0
        /* renamed from: c */
        public Signature mo52095c() {
            return this.f46020a;
        }

        public C17671e(@C0359n0 Cipher cipher) {
            this.f46021b = cipher;
            this.f46020a = null;
            this.f46022c = null;
        }

        public C17671e(@C0359n0 Mac mac) {
            this.f46022c = mac;
            this.f46021b = null;
            this.f46020a = null;
        }
    }
}
