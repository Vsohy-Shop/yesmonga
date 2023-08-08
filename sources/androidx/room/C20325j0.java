package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.C20295e0;
import androidx.room.C20410y;
import androidx.room.C20417z;
import com.urbanairship.iam.events.C9175a;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.room.j0 */
public final class C20325j0 {
    @C12579k

    /* renamed from: a */
    public final String f52473a;
    @C12579k

    /* renamed from: b */
    public final C20295e0 f52474b;
    @C12579k

    /* renamed from: c */
    public final Executor f52475c;

    /* renamed from: d */
    public final Context f52476d;

    /* renamed from: e */
    public int f52477e;

    /* renamed from: f */
    public C20295e0.C20299c f52478f;
    @C12580l

    /* renamed from: g */
    public C20417z f52479g;
    @C12579k

    /* renamed from: h */
    public final C20410y f52480h = new C20327b(this);
    @C12579k

    /* renamed from: i */
    public final AtomicBoolean f52481i = new AtomicBoolean(false);
    @C12579k

    /* renamed from: j */
    public final ServiceConnection f52482j;
    @C12579k

    /* renamed from: k */
    public final Runnable f52483k;
    @C12579k

    /* renamed from: l */
    public final Runnable f52484l;

    /* renamed from: androidx.room.j0$a */
    public static final class C20326a extends C20295e0.C20299c {

        /* renamed from: b */
        public final /* synthetic */ C20325j0 f52485b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20326a(C20325j0 j0Var, String[] strArr) {
            super(strArr);
            this.f52485b = j0Var;
        }

        /* renamed from: b */
        public boolean mo61046b() {
            return true;
        }

        /* renamed from: c */
        public void mo61047c(@C12579k Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "tables");
            if (!this.f52485b.mo61102m().get()) {
                try {
                    C20417z j = this.f52485b.mo61099j();
                    if (j != null) {
                        int d = this.f52485b.mo61093d();
                        Object[] array = set.toArray(new String[0]);
                        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        j.mo60884G4(d, (String[]) array);
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }

    /* renamed from: androidx.room.j0$b */
    public static final class C20327b extends C20410y.C20412b {

        /* renamed from: o */
        public final /* synthetic */ C20325j0 f52486o;

        public C20327b(C20325j0 j0Var) {
            this.f52486o = j0Var;
        }

        /* renamed from: O0 */
        public static final void m95048O0(C20325j0 j0Var, String[] strArr) {
            Intrinsics.checkNotNullParameter(j0Var, "this$0");
            Intrinsics.checkNotNullParameter(strArr, "$tables");
            j0Var.mo61095f().mo61024o((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: H1 */
        public void mo61107H1(@C12579k String[] strArr) {
            Intrinsics.checkNotNullParameter(strArr, "tables");
            this.f52486o.mo61094e().execute(new C20332k0(this.f52486o, strArr));
        }
    }

    /* renamed from: androidx.room.j0$c */
    public static final class C20328c implements ServiceConnection {

        /* renamed from: c */
        public final /* synthetic */ C20325j0 f52487c;

        public C20328c(C20325j0 j0Var) {
            this.f52487c = j0Var;
        }

        public void onServiceConnected(@C12579k ComponentName componentName, @C12579k IBinder iBinder) {
            Intrinsics.checkNotNullParameter(componentName, "name");
            Intrinsics.checkNotNullParameter(iBinder, "service");
            this.f52487c.mo61105q(C20417z.C20419b.m95242m0(iBinder));
            this.f52487c.mo61094e().execute(this.f52487c.mo61101l());
        }

        public void onServiceDisconnected(@C12579k ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "name");
            this.f52487c.mo61094e().execute(this.f52487c.mo61098i());
            this.f52487c.mo61105q((C20417z) null);
        }
    }

    public C20325j0(@C12579k Context context, @C12579k String str, @C12579k Intent intent, @C12579k C20295e0 e0Var, @C12579k Executor executor) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(intent, "serviceIntent");
        Intrinsics.checkNotNullParameter(e0Var, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f52473a = str;
        this.f52474b = e0Var;
        this.f52475c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f52476d = applicationContext;
        C20328c cVar = new C20328c(this);
        this.f52482j = cVar;
        this.f52483k = new C20317h0(this);
        this.f52484l = new C20321i0(this);
        Object[] array = e0Var.mo61021l().keySet().toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        mo61104p(new C20326a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* renamed from: n */
    public static final void m95028n(C20325j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "this$0");
        j0Var.f52474b.mo61028s(j0Var.mo61097h());
    }

    /* renamed from: r */
    public static final void m95029r(C20325j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "this$0");
        try {
            C20417z zVar = j0Var.f52479g;
            if (zVar != null) {
                j0Var.f52477e = zVar.mo60885c6(j0Var.f52480h, j0Var.f52473a);
                j0Var.f52474b.mo61012b(j0Var.mo61097h());
            }
        } catch (RemoteException unused) {
        }
    }

    @C12579k
    /* renamed from: c */
    public final C20410y mo61092c() {
        return this.f52480h;
    }

    /* renamed from: d */
    public final int mo61093d() {
        return this.f52477e;
    }

    @C12579k
    /* renamed from: e */
    public final Executor mo61094e() {
        return this.f52475c;
    }

    @C12579k
    /* renamed from: f */
    public final C20295e0 mo61095f() {
        return this.f52474b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo61096g() {
        return this.f52473a;
    }

    @C12579k
    /* renamed from: h */
    public final C20295e0.C20299c mo61097h() {
        C20295e0.C20299c cVar = this.f52478f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @C12579k
    /* renamed from: i */
    public final Runnable mo61098i() {
        return this.f52484l;
    }

    @C12580l
    /* renamed from: j */
    public final C20417z mo61099j() {
        return this.f52479g;
    }

    @C12579k
    /* renamed from: k */
    public final ServiceConnection mo61100k() {
        return this.f52482j;
    }

    @C12579k
    /* renamed from: l */
    public final Runnable mo61101l() {
        return this.f52483k;
    }

    @C12579k
    /* renamed from: m */
    public final AtomicBoolean mo61102m() {
        return this.f52481i;
    }

    /* renamed from: o */
    public final void mo61103o(int i) {
        this.f52477e = i;
    }

    /* renamed from: p */
    public final void mo61104p(@C12579k C20295e0.C20299c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f52478f = cVar;
    }

    /* renamed from: q */
    public final void mo61105q(@C12580l C20417z zVar) {
        this.f52479g = zVar;
    }

    /* renamed from: s */
    public final void mo61106s() {
        if (this.f52481i.compareAndSet(false, true)) {
            this.f52474b.mo61028s(mo61097h());
            try {
                C20417z zVar = this.f52479g;
                if (zVar != null) {
                    zVar.mo60886x8(this.f52480h, this.f52477e);
                }
            } catch (RemoteException unused) {
            }
            this.f52476d.unbindService(this.f52482j);
        }
    }
}
