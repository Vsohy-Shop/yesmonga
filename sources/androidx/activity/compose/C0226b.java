package androidx.activity.compose;

import androidx.activity.result.C0302g;
import androidx.core.app.C17125i;
import kotlin.C11079d2;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.activity.compose.b */
public final class C0226b<I> {
    @C12580l

    /* renamed from: a */
    public C0302g<I> f725a;

    @C12580l
    /* renamed from: a */
    public final C0302g<I> mo816a() {
        return this.f725a;
    }

    /* renamed from: b */
    public final void mo817b(@C12580l I i, @C12580l C17125i iVar) {
        C11079d2 d2Var;
        C0302g<I> gVar = this.f725a;
        if (gVar != null) {
            gVar.mo821c(i, iVar);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    /* renamed from: c */
    public final void mo818c(@C12580l C0302g<I> gVar) {
        this.f725a = gVar;
    }

    /* renamed from: d */
    public final void mo819d() {
        C11079d2 d2Var;
        C0302g<I> gVar = this.f725a;
        if (gVar != null) {
            gVar.mo822d();
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
