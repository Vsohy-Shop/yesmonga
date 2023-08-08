package androidx.compose.foundation.text;

import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.focus.C15068j;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.input.C16331y0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.i */
public final class C2774i implements C2775j {

    /* renamed from: a */
    public C2776k f7282a;

    /* renamed from: b */
    public C15068j f7283b;
    @C12580l

    /* renamed from: c */
    public C16331y0 f7284c;

    /* renamed from: a */
    public void mo9515a(int i) {
        boolean z;
        boolean z2;
        C16310p.C16311a aVar = C16310p.f40516b;
        if (C16310p.m73495l(i, aVar.mo47282g())) {
            mo9516b().mo42077g(C15059d.f37228b.mo42189i());
        } else if (C16310p.m73495l(i, aVar.mo47284k())) {
            mo9516b().mo42077g(C15059d.f37228b.mo42191l());
        } else if (C16310p.m73495l(i, aVar.mo47280c())) {
            C16331y0 y0Var = this.f7284c;
            if (y0Var != null) {
                y0Var.mo47329c();
            }
        } else {
            boolean z3 = true;
            if (C16310p.m73495l(i, aVar.mo47281e())) {
                z = true;
            } else {
                z = C16310p.m73495l(i, aVar.mo47285m());
            }
            if (z) {
                z2 = true;
            } else {
                z2 = C16310p.m73495l(i, aVar.mo47286o());
            }
            if (!z2) {
                z3 = C16310p.m73495l(i, aVar.mo47279a());
            }
            if (!z3) {
                C16310p.m73495l(i, aVar.mo47283i());
            }
        }
    }

    @C12579k
    /* renamed from: b */
    public final C15068j mo9516b() {
        C15068j jVar = this.f7283b;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @C12580l
    /* renamed from: c */
    public final C16331y0 mo9517c() {
        return this.f7284c;
    }

    @C12579k
    /* renamed from: d */
    public final C2776k mo9518d() {
        C2776k kVar = this.f7282a;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* renamed from: e */
    public final void mo9519e(int i) {
        C11300l<C2775j, C11079d2> lVar;
        boolean z;
        C16310p.C16311a aVar = C16310p.f40516b;
        C11079d2 d2Var = null;
        if (C16310p.m73495l(i, aVar.mo47280c())) {
            lVar = mo9518d().mo9523b();
        } else if (C16310p.m73495l(i, aVar.mo47281e())) {
            lVar = mo9518d().mo9524c();
        } else if (C16310p.m73495l(i, aVar.mo47282g())) {
            lVar = mo9518d().mo9525d();
        } else if (C16310p.m73495l(i, aVar.mo47284k())) {
            lVar = mo9518d().mo9526e();
        } else if (C16310p.m73495l(i, aVar.mo47285m())) {
            lVar = mo9518d().mo9528f();
        } else if (C16310p.m73495l(i, aVar.mo47286o())) {
            lVar = mo9518d().mo9529g();
        } else {
            if (C16310p.m73495l(i, aVar.mo47279a())) {
                z = true;
            } else {
                z = C16310p.m73495l(i, aVar.mo47283i());
            }
            if (z) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            mo9515a(i);
        }
    }

    /* renamed from: f */
    public final void mo9520f(@C12579k C15068j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f7283b = jVar;
    }

    /* renamed from: g */
    public final void mo9521g(@C12580l C16331y0 y0Var) {
        this.f7284c = y0Var;
    }

    /* renamed from: h */
    public final void mo9522h(@C12579k C2776k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f7282a = kVar;
    }
}
