package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21094f;
import androidx.work.C21095g;
import androidx.work.C21372k;
import androidx.work.C21377l;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.utils.futures.C21317a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.google.common.util.concurrent.C32487a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.f0 */
public class C21306f0 implements Runnable {

    /* renamed from: g */
    public static final String f54969g = C21377l.m98584i("WorkForegroundRunnable");

    /* renamed from: a */
    public final C21317a<Void> f54970a = C21317a.m98425v();

    /* renamed from: b */
    public final Context f54971b;

    /* renamed from: c */
    public final C21249u f54972c;

    /* renamed from: d */
    public final C21372k f54973d;

    /* renamed from: e */
    public final C21095g f54974e;

    /* renamed from: f */
    public final C21345b f54975f;

    /* renamed from: androidx.work.impl.utils.f0$a */
    public class C21307a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C21317a f54976a;

        public C21307a(C21317a aVar) {
            this.f54976a = aVar;
        }

        public void run() {
            if (!C21306f0.this.f54970a.isCancelled()) {
                try {
                    C21094f fVar = (C21094f) this.f54976a.get();
                    if (fVar != null) {
                        C21377l e = C21377l.m98582e();
                        String str = C21306f0.f54969g;
                        e.mo63774a(str, "Updating notification for " + C21306f0.this.f54972c.f54806c);
                        C21306f0 f0Var = C21306f0.this;
                        f0Var.f54970a.mo63661s(f0Var.f54974e.mo63199a(f0Var.f54971b, f0Var.f54973d.mo63749e(), fVar));
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + C21306f0.this.f54972c.f54806c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    C21306f0.this.f54970a.mo63660r(th);
                }
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public C21306f0(@C0359n0 Context context, @C0359n0 C21249u uVar, @C0359n0 C21372k kVar, @C0359n0 C21095g gVar, @C0359n0 C21345b bVar) {
        this.f54971b = context;
        this.f54972c = uVar;
        this.f54973d = kVar;
        this.f54974e = gVar;
        this.f54975f = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m98384d(C21317a aVar) {
        if (!this.f54970a.isCancelled()) {
            aVar.mo63661s(this.f54973d.mo63076d());
        } else {
            aVar.cancel(true);
        }
    }

    @C0359n0
    /* renamed from: c */
    public C32487a<Void> mo63642c() {
        return this.f54970a;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f54972c.f54820q || Build.VERSION.SDK_INT >= 31) {
            this.f54970a.mo63659p(null);
            return;
        }
        C21317a v = C21317a.m98425v();
        this.f54975f.mo63698a().execute(new C21304e0(this, v));
        v.mo5489q(new C21307a(v), this.f54975f.mo63698a());
    }
}
