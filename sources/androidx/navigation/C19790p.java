package androidx.navigation;

import androidx.navigation.C19787o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19691a0
/* renamed from: androidx.navigation.p */
public final class C19790p {
    @C12579k

    /* renamed from: a */
    public final C19787o.C19788a f50637a = new C19787o.C19788a();
    @C12580l

    /* renamed from: b */
    public C19769n0<?> f50638b;

    /* renamed from: c */
    public boolean f50639c;
    @C12580l

    /* renamed from: d */
    public Object f50640d;

    @C12579k
    /* renamed from: a */
    public final C19787o mo58550a() {
        return this.f50637a.mo58545a();
    }

    @C12580l
    /* renamed from: b */
    public final Object mo58551b() {
        return this.f50640d;
    }

    /* renamed from: c */
    public final boolean mo58552c() {
        return this.f50639c;
    }

    @C12579k
    /* renamed from: d */
    public final C19769n0<?> mo58553d() {
        C19769n0<?> n0Var = this.f50638b;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    /* renamed from: e */
    public final void mo58554e(@C12580l Object obj) {
        this.f50640d = obj;
        this.f50637a.mo58546b(obj);
    }

    /* renamed from: f */
    public final void mo58555f(boolean z) {
        this.f50639c = z;
        this.f50637a.mo58547c(z);
    }

    /* renamed from: g */
    public final void mo58556g(@C12579k C19769n0<?> n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "value");
        this.f50638b = n0Var;
        this.f50637a.mo58548d(n0Var);
    }
}
