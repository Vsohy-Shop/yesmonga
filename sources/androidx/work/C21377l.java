package androidx.work;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.l */
public abstract class C21377l {

    /* renamed from: a */
    public static final Object f55118a = new Object();

    /* renamed from: b */
    public static volatile C21377l f55119b = null;

    /* renamed from: c */
    public static final String f55120c = "WM-";

    /* renamed from: d */
    public static final int f55121d = 23;

    /* renamed from: e */
    public static final int f55122e = 20;

    /* renamed from: androidx.work.l$a */
    public static class C21378a extends C21377l {

        /* renamed from: f */
        public final int f55123f;

        public C21378a(int i) {
            super(i);
            this.f55123f = i;
        }

        /* renamed from: a */
        public void mo63774a(@C0359n0 String str, @C0359n0 String str2) {
        }

        /* renamed from: b */
        public void mo63775b(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        }

        /* renamed from: c */
        public void mo63776c(@C0359n0 String str, @C0359n0 String str2) {
        }

        /* renamed from: d */
        public void mo63777d(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        }

        /* renamed from: f */
        public void mo63778f(@C0359n0 String str, @C0359n0 String str2) {
        }

        /* renamed from: g */
        public void mo63779g(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        }

        /* renamed from: j */
        public void mo63780j(@C0359n0 String str, @C0359n0 String str2) {
        }

        /* renamed from: k */
        public void mo63781k(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        }

        /* renamed from: l */
        public void mo63782l(@C0359n0 String str, @C0359n0 String str2) {
        }

        /* renamed from: m */
        public void mo63783m(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        }
    }

    public C21377l(int i) {
    }

    @C0359n0
    /* renamed from: e */
    public static C21377l m98582e() {
        C21377l lVar;
        synchronized (f55118a) {
            if (f55119b == null) {
                f55119b = new C21378a(3);
            }
            lVar = f55119b;
        }
        return lVar;
    }

    /* renamed from: h */
    public static void m98583h(@C0359n0 C21377l lVar) {
        synchronized (f55118a) {
            f55119b = lVar;
        }
    }

    @C0359n0
    /* renamed from: i */
    public static String m98584i(@C0359n0 String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(f55120c);
        int i = f55122e;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo63774a(@C0359n0 String str, @C0359n0 String str2);

    /* renamed from: b */
    public abstract void mo63775b(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th);

    /* renamed from: c */
    public abstract void mo63776c(@C0359n0 String str, @C0359n0 String str2);

    /* renamed from: d */
    public abstract void mo63777d(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th);

    /* renamed from: f */
    public abstract void mo63778f(@C0359n0 String str, @C0359n0 String str2);

    /* renamed from: g */
    public abstract void mo63779g(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th);

    /* renamed from: j */
    public abstract void mo63780j(@C0359n0 String str, @C0359n0 String str2);

    /* renamed from: k */
    public abstract void mo63781k(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th);

    /* renamed from: l */
    public abstract void mo63782l(@C0359n0 String str, @C0359n0 String str2);

    /* renamed from: m */
    public abstract void mo63783m(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th);
}
