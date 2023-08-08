package androidx.compose.p004ui.graphics.painter;

import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.painter.c */
public final class C15294c extends Painter {
    @C12579k

    /* renamed from: g */
    public final C15421z1 f37640g;

    /* renamed from: v */
    public float f37641v = 1.0f;
    @C12580l

    /* renamed from: w */
    public C15249k2 f37642w;

    public C15294c(@C12579k C15421z1 z1Var) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        this.f37640g = z1Var;
    }

    /* renamed from: a */
    public boolean mo42942a(float f) {
        this.f37641v = f;
        return true;
    }

    /* renamed from: b */
    public boolean mo42943b(@C12580l C15249k2 k2Var) {
        this.f37642w = k2Var;
        return true;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C15294c) && Intrinsics.areEqual((Object) this.f37640g, (Object) ((C15294c) obj).f37640g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37640g.hashCode();
    }

    /* renamed from: l */
    public long mo42949l() {
        return this.f37640g.mo43002b();
    }

    /* renamed from: n */
    public void mo42951n(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C15187e.m65700T3(eVar, this.f37640g, 0, 0, this.f37641v, (C15192h) null, this.f37642w, 0, 86, (Object) null);
    }

    @C12579k
    /* renamed from: o */
    public final C15421z1 mo42961o() {
        return this.f37640g;
    }

    @C12579k
    public String toString() {
        return "BrushPainter(brush=" + this.f37640g + ')';
    }
}
