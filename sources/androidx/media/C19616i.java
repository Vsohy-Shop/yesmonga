package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.media.C19628r;
import androidx.media.C19630s;

/* renamed from: androidx.media.i */
public final class C19616i {

    /* renamed from: b */
    public static final String f50240b = "MediaSessionManager";

    /* renamed from: c */
    public static final boolean f50241c = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: d */
    public static final Object f50242d = new Object();

    /* renamed from: e */
    public static volatile C19616i f50243e;

    /* renamed from: a */
    public C19617a f50244a;

    /* renamed from: androidx.media.i$a */
    public interface C19617a {
        /* renamed from: a */
        boolean mo57991a(C19619c cVar);

        Context getContext();
    }

    /* renamed from: androidx.media.i$c */
    public interface C19619c {
        /* renamed from: a */
        int mo57998a();

        /* renamed from: b */
        int mo57999b();

        String getPackageName();
    }

    public C19616i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f50244a = new C19628r(context);
        } else {
            this.f50244a = new C19620j(context);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C19616i m91229b(@C0359n0 Context context) {
        C19616i iVar = f50243e;
        if (iVar == null) {
            synchronized (f50242d) {
                iVar = f50243e;
                if (iVar == null) {
                    f50243e = new C19616i(context.getApplicationContext());
                    iVar = f50243e;
                }
            }
        }
        return iVar;
    }

    /* renamed from: a */
    public Context mo57989a() {
        return this.f50244a.getContext();
    }

    /* renamed from: c */
    public boolean mo57990c(@C0359n0 C19618b bVar) {
        if (bVar != null) {
            return this.f50244a.mo57991a(bVar.f50246a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* renamed from: androidx.media.i$b */
    public static final class C19618b {

        /* renamed from: b */
        public static final String f50245b = "android.media.session.MediaController";

        /* renamed from: a */
        public C19619c f50246a;

        public C19618b(@C0359n0 String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f50246a = new C19628r.C19629a(str, i, i2);
            } else {
                this.f50246a = new C19630s.C19631a(str, i, i2);
            }
        }

        @C0359n0
        /* renamed from: a */
        public String mo57993a() {
            return this.f50246a.getPackageName();
        }

        /* renamed from: b */
        public int mo57994b() {
            return this.f50246a.mo57999b();
        }

        /* renamed from: c */
        public int mo57995c() {
            return this.f50246a.mo57998a();
        }

        public boolean equals(@C0363p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19618b)) {
                return false;
            }
            return this.f50246a.equals(((C19618b) obj).f50246a);
        }

        public int hashCode() {
            return this.f50246a.hashCode();
        }

        @C0376v0(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public C19618b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f50246a = new C19628r.C19629a(remoteUserInfo);
        }
    }
}
