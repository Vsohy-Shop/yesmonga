package androidx.work;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.work.x */
public abstract class C21417x {

    /* renamed from: a */
    public static final String f55171a = C21377l.m98584i("WorkerFactory");

    /* renamed from: androidx.work.x$a */
    public class C21418a extends C21417x {
        @C0363p0
        /* renamed from: a */
        public C21372k mo63190a(@C0359n0 Context context, @C0359n0 String str, @C0359n0 WorkerParameters workerParameters) {
            return null;
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public static C21417x m98758c() {
        return new C21418a();
    }

    @C0363p0
    /* renamed from: a */
    public abstract C21372k mo63190a(@C0359n0 Context context, @C0359n0 String str, @C0359n0 WorkerParameters workerParameters);

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public final C21372k mo63885b(@C0359n0 Context context, @C0359n0 String str, @C0359n0 WorkerParameters workerParameters) {
        Class<? extends U> cls;
        C21372k a = mo63190a(context, str, workerParameters);
        if (a == null) {
            try {
                cls = Class.forName(str).asSubclass(C21372k.class);
            } catch (Throwable th) {
                C21377l e = C21377l.m98582e();
                String str2 = f55171a;
                e.mo63777d(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a = (C21372k) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C21377l e2 = C21377l.m98582e();
                    String str3 = f55171a;
                    e2.mo63777d(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.mo63759p()) {
            return a;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
