package androidx.work.impl.utils;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.C21191g0;
import androidx.work.impl.C21361v;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.y */
public class C21354y implements Runnable {

    /* renamed from: a */
    public C21191g0 f55070a;

    /* renamed from: b */
    public C21361v f55071b;

    /* renamed from: c */
    public WorkerParameters.C21081a f55072c;

    public C21354y(@C0359n0 C21191g0 g0Var, @C0359n0 C21361v vVar, @C0363p0 WorkerParameters.C21081a aVar) {
        this.f55070a = g0Var;
        this.f55071b = vVar;
        this.f55072c = aVar;
    }

    public void run() {
        this.f55070a.mo63359L().mo63612r(this.f55071b, this.f55072c);
    }
}
