package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,555:1\n76#2:556\n102#2,2:557\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n120#1:556\n120#1:557,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorComponent */
public final class VectorComponent extends C15373i {
    @C12579k

    /* renamed from: c */
    public final C15339b f37760c;

    /* renamed from: d */
    public boolean f37761d = true;
    @C12579k

    /* renamed from: e */
    public final C15338a f37762e = new C15338a();
    @C12579k

    /* renamed from: f */
    public C11289a<C11079d2> f37763f = VectorComponent$invalidateCallback$1.f37769f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f37764g = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    /* renamed from: h */
    public float f37765h;

    /* renamed from: i */
    public float f37766i;

    /* renamed from: j */
    public long f37767j = C15104m.f37280b.mo42316a();
    @C12579k

    /* renamed from: k */
    public final C11300l<C15187e, C11079d2> f37768k = new VectorComponent$drawVectorBlock$1(this);

    public VectorComponent() {
        super((DefaultConstructorMarker) null);
        C15339b bVar = new C15339b();
        bVar.mo43164u(0.0f);
        bVar.mo43165v(0.0f);
        bVar.mo43146d(new VectorComponent$root$1$1(this));
        this.f37760c = bVar;
    }

    /* renamed from: a */
    public void mo43054a(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        mo43080g(eVar, 1.0f, (C15249k2) null);
    }

    /* renamed from: f */
    public final void mo43079f() {
        this.f37761d = true;
        this.f37763f.invoke();
    }

    /* renamed from: g */
    public final void mo43080g(@C12579k C15187e eVar, float f, @C12580l C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (k2Var == null) {
            k2Var = mo43081h();
        }
        if (this.f37761d || !C15104m.m65014k(this.f37767j, eVar.mo42718b())) {
            this.f37760c.mo43167x(C15104m.m65023t(eVar.mo42718b()) / this.f37765h);
            this.f37760c.mo43168y(C15104m.m65016m(eVar.mo42718b()) / this.f37766i);
            this.f37762e.mo43138b(C16502r.m74668a((int) ((float) Math.ceil((double) C15104m.m65023t(eVar.mo42718b()))), (int) ((float) Math.ceil((double) C15104m.m65016m(eVar.mo42718b())))), eVar, eVar.getLayoutDirection(), this.f37768k);
            this.f37761d = false;
            this.f37767j = eVar.mo42718b();
        }
        this.f37762e.mo43139c(eVar, f, k2Var);
    }

    @C12580l
    /* renamed from: h */
    public final C15249k2 mo43081h() {
        return (C15249k2) this.f37764g.getValue();
    }

    @C12579k
    /* renamed from: i */
    public final C11289a<C11079d2> mo43082i() {
        return this.f37763f;
    }

    @C12579k
    /* renamed from: j */
    public final String mo43083j() {
        return this.f37760c.mo43148f();
    }

    @C12579k
    /* renamed from: k */
    public final C15339b mo43084k() {
        return this.f37760c;
    }

    /* renamed from: l */
    public final float mo43085l() {
        return this.f37766i;
    }

    /* renamed from: m */
    public final float mo43086m() {
        return this.f37765h;
    }

    /* renamed from: n */
    public final void mo43087n(@C12580l C15249k2 k2Var) {
        this.f37764g.setValue(k2Var);
    }

    /* renamed from: o */
    public final void mo43088o(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f37763f = aVar;
    }

    /* renamed from: p */
    public final void mo43089p(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f37760c.mo43162t(str);
    }

    /* renamed from: q */
    public final void mo43090q(float f) {
        boolean z;
        if (this.f37766i == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f37766i = f;
            mo43079f();
        }
    }

    /* renamed from: r */
    public final void mo43091r(float f) {
        boolean z;
        if (this.f37765h == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f37765h = f;
            mo43079f();
        }
    }

    @C12579k
    public String toString() {
        String str = "Params: " + "\tname: " + mo43083j() + "\n" + "\tviewportWidth: " + this.f37765h + "\n" + "\tviewportHeight: " + this.f37766i + "\n";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
