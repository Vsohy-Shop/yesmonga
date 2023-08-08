package androidx.activity.result;

import androidx.activity.result.contract.C0266a;
import androidx.core.app.C17125i;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ActivityResultCallerLauncher<I, O> extends C0302g<C11079d2> {
    @C12579k

    /* renamed from: a */
    public final C0302g<I> f755a;
    @C12579k

    /* renamed from: b */
    public final C0266a<I, O> f756b;

    /* renamed from: c */
    public final I f757c;
    @C12579k

    /* renamed from: d */
    public final C11677z f758d = C10864b0.m38748c(new ActivityResultCallerLauncher$resultContract$2(this));

    public ActivityResultCallerLauncher(@C12579k C0302g<I> gVar, @C12579k C0266a<I, O> aVar, I i) {
        Intrinsics.checkNotNullParameter(gVar, "launcher");
        Intrinsics.checkNotNullParameter(aVar, "callerContract");
        this.f755a = gVar;
        this.f756b = aVar;
        this.f757c = i;
    }

    @C12579k
    /* renamed from: a */
    public C0266a<C11079d2, O> mo820a() {
        return mo866h();
    }

    /* renamed from: d */
    public void mo822d() {
        this.f755a.mo822d();
    }

    @C12579k
    /* renamed from: e */
    public final C0266a<I, O> mo863e() {
        return this.f756b;
    }

    /* renamed from: f */
    public final I mo864f() {
        return this.f757c;
    }

    @C12579k
    /* renamed from: g */
    public final C0302g<I> mo865g() {
        return this.f755a;
    }

    @C12579k
    /* renamed from: h */
    public final C0266a<C11079d2, O> mo866h() {
        return (C0266a) this.f758d.getValue();
    }

    /* renamed from: i */
    public void mo821c(@C12579k C11079d2 d2Var, @C12580l C17125i iVar) {
        Intrinsics.checkNotNullParameter(d2Var, "input");
        this.f755a.mo821c(this.f757c, iVar);
    }
}
