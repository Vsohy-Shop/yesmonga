package androidx.work;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.work.j */
public abstract class C21370j {

    /* renamed from: androidx.work.j$a */
    public class C21371a extends C21370j {
        @C0363p0
        /* renamed from: a */
        public C21097i mo63745a(@C0359n0 String str) {
            return null;
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static C21370j m98549c() {
        return new C21371a();
    }

    @C0363p0
    /* renamed from: a */
    public abstract C21097i mo63745a(@C0359n0 String str);

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public final C21097i mo63746b(@C0359n0 String str) {
        C21097i a = mo63745a(str);
        if (a == null) {
            return C21097i.m97632a(str);
        }
        return a;
    }
}
