package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15259l3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n1#2:556\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathComponent */
public final class PathComponent extends C15373i {
    @C12579k

    /* renamed from: c */
    public String f37737c = "";
    @C12580l

    /* renamed from: d */
    public C15421z1 f37738d;

    /* renamed from: e */
    public float f37739e = 1.0f;
    @C12579k

    /* renamed from: f */
    public List<? extends C15349f> f37740f = C15380n.m67243h();

    /* renamed from: g */
    public int f37741g = C15380n.m67238c();

    /* renamed from: h */
    public float f37742h = 1.0f;

    /* renamed from: i */
    public float f37743i;
    @C12580l

    /* renamed from: j */
    public C15421z1 f37744j;

    /* renamed from: k */
    public int f37745k = C15380n.m67239d();

    /* renamed from: l */
    public int f37746l = C15380n.m67240e();

    /* renamed from: m */
    public float f37747m = 4.0f;

    /* renamed from: n */
    public float f37748n;

    /* renamed from: o */
    public float f37749o = 1.0f;

    /* renamed from: p */
    public float f37750p;

    /* renamed from: q */
    public boolean f37751q = true;

    /* renamed from: r */
    public boolean f37752r = true;

    /* renamed from: s */
    public boolean f37753s = true;
    @C12580l

    /* renamed from: t */
    public C15198m f37754t;
    @C12579k

    /* renamed from: u */
    public final C15231i3 f37755u = C15318t0.m66550a();
    @C12579k

    /* renamed from: v */
    public final C15231i3 f37756v = C15318t0.m66550a();
    @C12579k

    /* renamed from: w */
    public final C11677z f37757w = C10864b0.m38747b(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.f37759f);
    @C12579k

    /* renamed from: x */
    public final C15370h f37758x = new C15370h();

    public PathComponent() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: A */
    public final void mo43045A(int i) {
        this.f37745k = i;
        this.f37752r = true;
        mo43530c();
    }

    /* renamed from: B */
    public final void mo43046B(int i) {
        this.f37746l = i;
        this.f37752r = true;
        mo43530c();
    }

    /* renamed from: C */
    public final void mo43047C(float f) {
        this.f37747m = f;
        this.f37752r = true;
        mo43530c();
    }

    /* renamed from: D */
    public final void mo43048D(float f) {
        this.f37743i = f;
        mo43530c();
    }

    /* renamed from: E */
    public final void mo43049E(float f) {
        boolean z;
        if (this.f37749o == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f37749o = f;
            this.f37753s = true;
            mo43530c();
        }
    }

    /* renamed from: F */
    public final void mo43050F(float f) {
        boolean z;
        if (this.f37750p == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f37750p = f;
            this.f37753s = true;
            mo43530c();
        }
    }

    /* renamed from: G */
    public final void mo43051G(float f) {
        boolean z;
        if (this.f37748n == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f37748n = f;
            this.f37753s = true;
            mo43530c();
        }
    }

    /* renamed from: H */
    public final void mo43052H() {
        this.f37758x.mo43487e();
        this.f37755u.reset();
        this.f37758x.mo43484b(this.f37740f).mo43479D(this.f37755u);
        mo43053I();
    }

    /* renamed from: I */
    public final void mo43053I() {
        boolean z;
        boolean z2;
        this.f37756v.reset();
        if (this.f37748n == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f37749o == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C15231i3.m66005m(this.f37756v, this.f37755u, 0, 2, (Object) null);
                return;
            }
        }
        mo43060j().mo42884c(this.f37755u, false);
        float f = mo43060j().mo42886f();
        float f2 = this.f37748n;
        float f3 = this.f37750p;
        float f4 = ((f2 + f3) % 1.0f) * f;
        float f5 = ((this.f37749o + f3) % 1.0f) * f;
        if (f4 > f5) {
            mo43060j().mo42883b(f4, f, this.f37756v, true);
            mo43060j().mo42883b(0.0f, f5, this.f37756v, true);
            return;
        }
        mo43060j().mo42883b(f4, f5, this.f37756v, true);
    }

    /* renamed from: a */
    public void mo43054a(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (this.f37751q) {
            mo43052H();
        } else if (this.f37753s) {
            mo43053I();
        }
        this.f37751q = false;
        this.f37753s = false;
        C15421z1 z1Var = this.f37738d;
        if (z1Var != null) {
            C15187e.m65694J4(eVar, this.f37756v, z1Var, this.f37739e, (C15192h) null, (C15249k2) null, 0, 56, (Object) null);
        }
        C15421z1 z1Var2 = this.f37744j;
        if (z1Var2 != null) {
            C15198m mVar = this.f37754t;
            if (this.f37752r || mVar == null) {
                mVar = new C15198m(this.f37743i, this.f37747m, this.f37745k, this.f37746l, (C15242j3) null, 16, (DefaultConstructorMarker) null);
                this.f37754t = mVar;
                this.f37752r = false;
            }
            C15198m mVar2 = mVar;
            C15187e.m65694J4(eVar, this.f37756v, z1Var2, this.f37742h, mVar2, (C15249k2) null, 0, 48, (Object) null);
        }
    }

    @C12580l
    /* renamed from: e */
    public final C15421z1 mo43055e() {
        return this.f37738d;
    }

    /* renamed from: f */
    public final float mo43056f() {
        return this.f37739e;
    }

    @C12579k
    /* renamed from: g */
    public final String mo43057g() {
        return this.f37737c;
    }

    @C12579k
    /* renamed from: h */
    public final List<C15349f> mo43058h() {
        return this.f37740f;
    }

    /* renamed from: i */
    public final int mo43059i() {
        return this.f37741g;
    }

    /* renamed from: j */
    public final C15259l3 mo43060j() {
        return (C15259l3) this.f37757w.getValue();
    }

    @C12580l
    /* renamed from: k */
    public final C15421z1 mo43061k() {
        return this.f37744j;
    }

    /* renamed from: l */
    public final float mo43062l() {
        return this.f37742h;
    }

    /* renamed from: m */
    public final int mo43063m() {
        return this.f37745k;
    }

    /* renamed from: n */
    public final int mo43064n() {
        return this.f37746l;
    }

    /* renamed from: o */
    public final float mo43065o() {
        return this.f37747m;
    }

    /* renamed from: p */
    public final float mo43066p() {
        return this.f37743i;
    }

    /* renamed from: q */
    public final float mo43067q() {
        return this.f37749o;
    }

    /* renamed from: r */
    public final float mo43068r() {
        return this.f37750p;
    }

    /* renamed from: s */
    public final float mo43069s() {
        return this.f37748n;
    }

    /* renamed from: t */
    public final void mo43070t(@C12580l C15421z1 z1Var) {
        this.f37738d = z1Var;
        mo43530c();
    }

    @C12579k
    public String toString() {
        return this.f37755u.toString();
    }

    /* renamed from: u */
    public final void mo43072u(float f) {
        this.f37739e = f;
        mo43530c();
    }

    /* renamed from: v */
    public final void mo43073v(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f37737c = str;
        mo43530c();
    }

    /* renamed from: w */
    public final void mo43074w(@C12579k List<? extends C15349f> list) {
        Intrinsics.checkNotNullParameter(list, "value");
        this.f37740f = list;
        this.f37751q = true;
        mo43530c();
    }

    /* renamed from: x */
    public final void mo43075x(int i) {
        this.f37741g = i;
        this.f37756v.mo42806g(i);
        mo43530c();
    }

    /* renamed from: y */
    public final void mo43076y(@C12580l C15421z1 z1Var) {
        this.f37744j = z1Var;
        mo43530c();
    }

    /* renamed from: z */
    public final void mo43077z(float f) {
        this.f37742h = f;
        mo43530c();
    }
}
