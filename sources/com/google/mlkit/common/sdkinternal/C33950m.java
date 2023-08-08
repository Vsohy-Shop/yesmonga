package com.google.mlkit.common.sdkinternal;

import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42582z7;
import com.google.android.gms.tasks.C31027a;
import com.google.android.gms.tasks.C31029b;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.m */
public abstract class C33950m {
    @RecentlyNonNull
    @C40473a

    /* renamed from: a */
    public final C33971p f82374a;

    /* renamed from: b */
    public final AtomicInteger f82375b;

    /* renamed from: c */
    public final AtomicBoolean f82376c;

    public C33950m() {
        this.f82375b = new AtomicInteger(0);
        this.f82376c = new AtomicBoolean(false);
        this.f82374a = new C33971p();
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public <T> C31047k<T> mo98726a(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<T> callable, @RecentlyNonNull C31027a aVar) {
        boolean z;
        if (this.f82375b.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166208r(z);
        if (aVar.mo87705a()) {
            return C31053n.m124523e();
        }
        C31029b bVar = new C31029b();
        C31049l lVar = new C31049l(bVar.mo87709b());
        this.f82374a.mo98827b(new C33934c0(executor, aVar, bVar, lVar), new C33932b0(this, aVar, bVar, callable, lVar));
        return lVar.mo87741a();
    }

    @C40473a
    /* renamed from: b */
    public boolean mo98727b() {
        return this.f82376c.get();
    }

    @C0348i1
    @C0344h1
    @C40473a
    /* renamed from: c */
    public abstract void mo98728c() throws MlKitException;

    @C40473a
    /* renamed from: d */
    public void mo98729d() {
        this.f82375b.incrementAndGet();
    }

    @C0348i1
    @C40473a
    /* renamed from: e */
    public abstract void mo98730e();

    @C40473a
    /* renamed from: f */
    public void mo98731f(@RecentlyNonNull Executor executor) {
        boolean z;
        if (this.f82375b.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166208r(z);
        this.f82374a.mo98827b(executor, new C33929a0(this));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo98732g(@RecentlyNonNull C31027a aVar, @RecentlyNonNull C31029b bVar, @RecentlyNonNull Callable callable, @RecentlyNonNull C31049l lVar) {
        if (aVar.mo87705a()) {
            bVar.mo87708a();
            return;
        }
        try {
            if (!this.f82376c.get()) {
                mo98728c();
                this.f82376c.set(true);
            }
            if (aVar.mo87705a()) {
                bVar.mo87708a();
                return;
            }
            Object call = callable.call();
            if (aVar.mo87705a()) {
                bVar.mo87708a();
            } else {
                lVar.mo87743c(call);
            }
        } catch (RuntimeException e) {
            throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
        } catch (Exception e2) {
            if (aVar.mo87705a()) {
                bVar.mo87708a();
            } else {
                lVar.mo87742b(e2);
            }
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo98733h() {
        boolean z;
        int decrementAndGet = this.f82375b.decrementAndGet();
        if (decrementAndGet >= 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166208r(z);
        if (decrementAndGet == 0) {
            mo98730e();
            this.f82376c.set(false);
        }
        C42582z7.m171757a();
    }

    @C40473a
    public C33950m(@RecentlyNonNull C33971p pVar) {
        this.f82375b = new AtomicInteger(0);
        this.f82376c = new AtomicBoolean(false);
        this.f82374a = pVar;
    }
}
