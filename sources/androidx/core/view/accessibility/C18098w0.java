package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.accessibility.w0 */
public interface C18098w0 {

    /* renamed from: androidx.core.view.accessibility.w0$a */
    public static abstract class C18099a {

        /* renamed from: a */
        public Bundle f46708a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public void mo52756a(@C0363p0 Bundle bundle) {
            this.f46708a = bundle;
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$b */
    public static final class C18100b extends C18099a {
        /* renamed from: b */
        public boolean mo52757b() {
            return this.f46708a.getBoolean(C18065l0.f46598R);
        }

        /* renamed from: c */
        public int mo52758c() {
            return this.f46708a.getInt(C18065l0.f46596P);
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$c */
    public static final class C18101c extends C18099a {
        @C0363p0
        /* renamed from: b */
        public String mo52759b() {
            return this.f46708a.getString(C18065l0.f46597Q);
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$d */
    public static final class C18102d extends C18099a {
        /* renamed from: b */
        public int mo52760b() {
            return this.f46708a.getInt(C18065l0.f46605Y);
        }

        /* renamed from: c */
        public int mo52761c() {
            return this.f46708a.getInt(C18065l0.f46606Z);
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$e */
    public static final class C18103e extends C18099a {
        /* renamed from: b */
        public int mo52762b() {
            return this.f46708a.getInt(C18065l0.f46603W);
        }

        /* renamed from: c */
        public int mo52763c() {
            return this.f46708a.getInt(C18065l0.f46602V);
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$f */
    public static final class C18104f extends C18099a {
        /* renamed from: b */
        public float mo52764b() {
            return this.f46708a.getFloat(C18065l0.f46604X);
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$g */
    public static final class C18105g extends C18099a {
        /* renamed from: b */
        public int mo52765b() {
            return this.f46708a.getInt(C18065l0.f46600T);
        }

        /* renamed from: c */
        public int mo52766c() {
            return this.f46708a.getInt(C18065l0.f46599S);
        }
    }

    /* renamed from: androidx.core.view.accessibility.w0$h */
    public static final class C18106h extends C18099a {
        @C0363p0
        /* renamed from: b */
        public CharSequence mo52767b() {
            return this.f46708a.getCharSequence(C18065l0.f46601U);
        }
    }

    /* renamed from: a */
    boolean mo19056a(@C0359n0 View view, @C0363p0 C18099a aVar);
}
