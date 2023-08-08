package androidx.lifecycle;

import androidx.annotation.C0353k0;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;

@C0353k0
@C11363r0({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* renamed from: androidx.lifecycle.r */
public final class C19462r {
    @C12579k

    /* renamed from: a */
    public final Lifecycle f49846a;
    @C12579k

    /* renamed from: b */
    public final Lifecycle.State f49847b;
    @C12579k

    /* renamed from: c */
    public final C19431k f49848c;
    @C12579k

    /* renamed from: d */
    public final C19470t f49849d;

    public C19462r(@C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state, @C12579k C19431k kVar, @C12579k C11723c2 c2Var) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(state, "minState");
        Intrinsics.checkNotNullParameter(kVar, "dispatchQueue");
        Intrinsics.checkNotNullParameter(c2Var, "parentJob");
        this.f49846a = lifecycle;
        this.f49847b = state;
        this.f49848c = kVar;
        C19460q qVar = new C19460q(this, c2Var);
        this.f49849d = qVar;
        if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
            mo57662b();
            return;
        }
        lifecycle.mo57464a(qVar);
    }

    /* renamed from: d */
    public static final void m90782d(C19462r rVar, C11723c2 c2Var, C19499w wVar, Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(rVar, "this$0");
        Intrinsics.checkNotNullParameter(c2Var, "$parentJob");
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "<anonymous parameter 1>");
        if (wVar.getLifecycle().mo57465b() == Lifecycle.State.DESTROYED) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
            rVar.mo57662b();
        } else if (wVar.getLifecycle().mo57465b().compareTo(rVar.f49847b) < 0) {
            rVar.f49848c.mo57592h();
        } else {
            rVar.f49848c.mo57593i();
        }
    }

    @C0353k0
    /* renamed from: b */
    public final void mo57662b() {
        this.f49846a.mo57467d(this.f49849d);
        this.f49848c.mo57591g();
    }

    /* renamed from: c */
    public final void mo57663c(C11723c2 c2Var) {
        C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        mo57662b();
    }
}
