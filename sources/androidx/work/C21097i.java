package androidx.work;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.List;

/* renamed from: androidx.work.i */
public abstract class C21097i {

    /* renamed from: a */
    public static final String f54449a = C21377l.m98584i("InputMerger");

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static C21097i m97632a(@C0359n0 String str) {
        try {
            return (C21097i) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            C21377l e2 = C21377l.m98582e();
            String str2 = f54449a;
            e2.mo63777d(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    @C0359n0
    /* renamed from: b */
    public abstract C21091d mo63033b(@C0359n0 List<C21091d> list);
}
