package androidx.activity.compose;

import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0266a;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17125i;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.activity.compose.d */
public final class C0228d<I, O> extends C0302g<I> {

    /* renamed from: c */
    public static final int f727c = 8;
    @C12579k

    /* renamed from: a */
    public final C0226b<I> f728a;
    @C12579k

    /* renamed from: b */
    public final C8578k2<C0266a<I, O>> f729b;

    public C0228d(@C12579k C0226b<I> bVar, @C12579k C8578k2<? extends C0266a<I, O>> k2Var) {
        Intrinsics.checkNotNullParameter(bVar, "launcher");
        Intrinsics.checkNotNullParameter(k2Var, "contract");
        this.f728a = bVar;
        this.f729b = k2Var;
    }

    @C12579k
    /* renamed from: a */
    public C0266a<I, ?> mo820a() {
        return this.f729b.getValue();
    }

    /* renamed from: c */
    public void mo821c(I i, @C12580l C17125i iVar) {
        this.f728a.mo817b(i, iVar);
    }

    @C11395k(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    /* renamed from: d */
    public void mo822d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
