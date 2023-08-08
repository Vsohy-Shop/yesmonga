package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.runtime.C8616s1;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.compose.C16602j;
import androidx.constraintlayout.core.state.C16769n;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ConstraintSetForInlineDsl implements C16602j, C8616s1 {
    @C12579k

    /* renamed from: a */
    public final ConstraintLayoutScope f41154a;
    @C12580l

    /* renamed from: b */
    public Handler f41155b;
    @C12579k

    /* renamed from: c */
    public final SnapshotStateObserver f41156c = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));

    /* renamed from: d */
    public boolean f41157d = true;
    @C12579k

    /* renamed from: e */
    public final C11300l<C11079d2, C11079d2> f41158e = new ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(this);
    @C12579k

    /* renamed from: f */
    public final List<C16595g> f41159f = new ArrayList();

    public ConstraintSetForInlineDsl(@C12579k ConstraintLayoutScope constraintLayoutScope) {
        Intrinsics.checkNotNullParameter(constraintLayoutScope, "scope");
        this.f41154a = constraintLayoutScope;
    }

    /* renamed from: a */
    public void mo48354a(@C12579k C16611l0 l0Var, @C12579k List<? extends C15557e0> list) {
        Intrinsics.checkNotNullParameter(l0Var, "state");
        Intrinsics.checkNotNullParameter(list, "measurables");
        this.f41154a.mo48259a(l0Var);
        this.f41159f.clear();
        this.f41156c.mo16505r(C11079d2.f28267a, this.f41158e, new ConstraintSetForInlineDsl$applyTo$1(list, l0Var, this));
        this.f41157d = false;
    }

    /* renamed from: b */
    public void mo48355b(@C12579k C16769n nVar, int i) {
        C16602j.C16603a.m75528a(this, nVar, i);
    }

    /* renamed from: c */
    public boolean mo48356c(@C12579k List<? extends C15557e0> list) {
        C16595g gVar;
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.f41157d || list.size() != this.f41159f.size()) {
            return true;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object c = ((C15557e0) list.get(i)).mo44319c();
                if (c instanceof C16595g) {
                    gVar = (C16595g) c;
                } else {
                    gVar = null;
                }
                if (!Intrinsics.areEqual((Object) gVar, (Object) this.f41159f.get(i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo8797d() {
        this.f41156c.mo16509v();
    }

    /* renamed from: e */
    public void mo8799e() {
    }

    /* renamed from: g */
    public void mo8800g() {
        this.f41156c.mo16510w();
        this.f41156c.mo16498k();
    }

    @C12579k
    /* renamed from: i */
    public C16602j mo48357i(@C12579k String str, float f) {
        return C16602j.C16603a.m75530c(this, str, f);
    }

    /* renamed from: m */
    public final boolean mo48358m() {
        return this.f41157d;
    }

    @C12579k
    /* renamed from: n */
    public final ConstraintLayoutScope mo48359n() {
        return this.f41154a;
    }

    /* renamed from: o */
    public final void mo48360o(boolean z) {
        this.f41157d = z;
    }
}
