package androidx.work;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.work.e */
public class C21093e extends C21417x {

    /* renamed from: c */
    public static final String f54444c = C21377l.m98584i("DelegatingWkrFctry");

    /* renamed from: b */
    public final List<C21417x> f54445b = new CopyOnWriteArrayList();

    @C0363p0
    /* renamed from: a */
    public final C21372k mo63190a(@C0359n0 Context context, @C0359n0 String str, @C0359n0 WorkerParameters workerParameters) {
        for (C21417x a : this.f54445b) {
            try {
                C21372k a2 = a.mo63190a(context, str, workerParameters);
                if (a2 != null) {
                    return a2;
                }
            } catch (Throwable th) {
                C21377l.m98582e().mo63777d(f54444c, "Unable to instantiate a ListenableWorker (" + str + ")", th);
                throw th;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo63191d(@C0359n0 C21417x xVar) {
        this.f54445b.add(xVar);
    }

    @C0344h1
    @C0359n0
    /* renamed from: e */
    public List<C21417x> mo63192e() {
        return this.f54445b;
    }
}
