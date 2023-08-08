package androidx.work.impl.utils;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21361v;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.a0 */
public class C21292a0 implements Runnable {

    /* renamed from: d */
    public static final String f54947d = C21377l.m98584i("StopWorkRunnable");

    /* renamed from: a */
    public final C21191g0 f54948a;

    /* renamed from: b */
    public final C21361v f54949b;

    /* renamed from: c */
    public final boolean f54950c;

    public C21292a0(@C0359n0 C21191g0 g0Var, @C0359n0 C21361v vVar, boolean z) {
        this.f54948a = g0Var;
        this.f54949b = vVar;
        this.f54950c = z;
    }

    public void run() {
        boolean z;
        if (this.f54950c) {
            z = this.f54948a.mo63359L().mo63615u(this.f54949b);
        } else {
            z = this.f54948a.mo63359L().mo63616v(this.f54949b);
        }
        C21377l e = C21377l.m98582e();
        String str = f54947d;
        e.mo63774a(str, "StopWorkRunnable for " + this.f54949b.mo63718a().mo63437f() + "; Processor.stopWork = " + z);
    }
}
