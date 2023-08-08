package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.C0021b;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.browser.trusted.b */
public class C0937b implements ServiceConnection {

    /* renamed from: i */
    public static final int f2964i = 0;

    /* renamed from: j */
    public static final int f2965j = 1;

    /* renamed from: k */
    public static final int f2966k = 2;

    /* renamed from: l */
    public static final int f2967l = 3;
    @C0359n0

    /* renamed from: c */
    public final Runnable f2968c;
    @C0359n0

    /* renamed from: d */
    public final C0938a f2969d;

    /* renamed from: e */
    public int f2970e;
    @C0363p0

    /* renamed from: f */
    public C0942c0 f2971f;
    @C0359n0

    /* renamed from: g */
    public List<CallbackToFutureAdapter.C16559a<C0942c0>> f2972g;
    @C0363p0

    /* renamed from: h */
    public Exception f2973h;

    /* renamed from: androidx.browser.trusted.b$a */
    public static class C0938a {
        @C0359n0
        /* renamed from: a */
        public C0942c0 mo4021a(ComponentName componentName, IBinder iBinder) {
            return new C0942c0(C0021b.C0023b.m97m0(iBinder), componentName);
        }
    }

    @C0353k0
    public C0937b(@C0359n0 Runnable runnable) {
        this(runnable, new C0938a());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m4247d(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        int i = this.f2970e;
        if (i == 0) {
            this.f2972g.add(aVar);
        } else if (i == 1) {
            C0942c0 c0Var = this.f2971f;
            if (c0Var != null) {
                aVar.mo48125c(c0Var);
            } else {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
        } else if (i == 2) {
            throw new IllegalStateException("Service has been disconnected.");
        } else if (i != 3) {
            throw new IllegalStateException("Connection state is invalid");
        } else {
            throw this.f2973h;
        }
        return "ConnectionHolder, state = " + this.f2970e;
    }

    @C0353k0
    /* renamed from: b */
    public void mo4017b(@C0359n0 Exception exc) {
        for (CallbackToFutureAdapter.C16559a<C0942c0> f : this.f2972g) {
            f.mo48128f(exc);
        }
        this.f2972g.clear();
        this.f2968c.run();
        this.f2970e = 3;
        this.f2973h = exc;
    }

    @C0353k0
    @C0359n0
    /* renamed from: c */
    public C32487a<C0942c0> mo4018c() {
        return CallbackToFutureAdapter.m74987a(new C0935a(this));
    }

    @C0353k0
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2971f = this.f2969d.mo4021a(componentName, iBinder);
        for (CallbackToFutureAdapter.C16559a<C0942c0> c : this.f2972g) {
            c.mo48125c(this.f2971f);
        }
        this.f2972g.clear();
        this.f2970e = 1;
    }

    @C0353k0
    public void onServiceDisconnected(ComponentName componentName) {
        this.f2971f = null;
        this.f2968c.run();
        this.f2970e = 2;
    }

    @C0353k0
    public C0937b(@C0359n0 Runnable runnable, @C0359n0 C0938a aVar) {
        this.f2970e = 0;
        this.f2972g = new ArrayList();
        this.f2968c = runnable;
        this.f2969d = aVar;
    }
}
