package androidx.compose.p004ui.node;

import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.p004ui.graphics.C15327u2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.u */
public final class C15736u {

    /* renamed from: a */
    public float f39075a = 1.0f;

    /* renamed from: b */
    public float f39076b = 1.0f;

    /* renamed from: c */
    public float f39077c;

    /* renamed from: d */
    public float f39078d;

    /* renamed from: e */
    public float f39079e;

    /* renamed from: f */
    public float f39080f;

    /* renamed from: g */
    public float f39081g;

    /* renamed from: h */
    public float f39082h = 8.0f;

    /* renamed from: i */
    public long f39083i = C15283o4.f37618b.mo42933a();

    /* renamed from: a */
    public final void mo45259a(@C12579k C15327u2 u2Var) {
        Intrinsics.checkNotNullParameter(u2Var, "scope");
        this.f39075a = u2Var.mo42454G();
        this.f39076b = u2Var.mo42466X();
        this.f39077c = u2Var.mo42459Q();
        this.f39078d = u2Var.mo42458P();
        this.f39079e = u2Var.mo42461R();
        this.f39080f = u2Var.mo42484s();
        this.f39081g = u2Var.mo42486v();
        this.f39082h = u2Var.mo42488z();
        this.f39083i = u2Var.mo42474g2();
    }

    /* renamed from: b */
    public final void mo45260b(@C12579k C15736u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "other");
        this.f39075a = uVar.f39075a;
        this.f39076b = uVar.f39076b;
        this.f39077c = uVar.f39077c;
        this.f39078d = uVar.f39078d;
        this.f39079e = uVar.f39079e;
        this.f39080f = uVar.f39080f;
        this.f39081g = uVar.f39081g;
        this.f39082h = uVar.f39082h;
        this.f39083i = uVar.f39083i;
    }

    /* renamed from: c */
    public final boolean mo45261c(@C12579k C15736u uVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(uVar, "other");
        if (this.f39075a == uVar.f39075a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f39076b == uVar.f39076b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f39077c == uVar.f39077c) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f39078d == uVar.f39078d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (this.f39079e == uVar.f39079e) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (this.f39080f == uVar.f39080f) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (this.f39081g == uVar.f39081g) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    if (this.f39082h == uVar.f39082h) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8 && C15283o4.m66377i(this.f39083i, uVar.f39083i)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
