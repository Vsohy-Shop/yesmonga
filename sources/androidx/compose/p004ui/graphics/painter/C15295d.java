package androidx.compose.p004ui.graphics.painter;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.painter.d */
public final class C15295d extends Painter {

    /* renamed from: g */
    public final long f37643g;

    /* renamed from: v */
    public float f37644v;
    @C12580l

    /* renamed from: w */
    public C15249k2 f37645w;

    /* renamed from: x */
    public final long f37646x;

    public /* synthetic */ C15295d(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public boolean mo42942a(float f) {
        this.f37644v = f;
        return true;
    }

    /* renamed from: b */
    public boolean mo42943b(@C12580l C15249k2 k2Var) {
        this.f37645w = k2Var;
        return true;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C15295d) && C15240j2.m66082y(this.f37643g, ((C15295d) obj).f37643g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C15240j2.m66056K(this.f37643g);
    }

    /* renamed from: l */
    public long mo42949l() {
        return this.f37646x;
    }

    /* renamed from: n */
    public void mo42951n(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C15187e.m65710e5(eVar, this.f37643g, 0, 0, this.f37644v, (C15192h) null, this.f37645w, 0, 86, (Object) null);
    }

    /* renamed from: o */
    public final long mo42965o() {
        return this.f37643g;
    }

    @C12579k
    public String toString() {
        return "ColorPainter(color=" + C15240j2.m66057L(this.f37643g) + ')';
    }

    public C15295d(long j) {
        this.f37643g = j;
        this.f37644v = 1.0f;
        this.f37646x = C15104m.f37280b.mo42316a();
    }
}
