package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.style.c */
public final class C16413c implements TextForegroundStyle {
    @C12579k

    /* renamed from: b */
    public final C15127c4 f40672b;

    /* renamed from: c */
    public final float f40673c;

    public C16413c(@C12579k C15127c4 c4Var, float f) {
        Intrinsics.checkNotNullParameter(c4Var, "value");
        this.f40672b = c4Var;
        this.f40673c = f;
    }

    /* renamed from: h */
    public static /* synthetic */ C16413c m74036h(C16413c cVar, C15127c4 c4Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            c4Var = cVar.f40672b;
        }
        if ((i & 2) != 0) {
            f = cVar.getAlpha();
        }
        return cVar.mo47597g(c4Var, f);
    }

    /* renamed from: a */
    public long mo47577a() {
        return C15240j2.f37547b.mo42851u();
    }

    @C12579k
    /* renamed from: d */
    public C15421z1 mo47580d() {
        return this.f40672b;
    }

    @C12579k
    /* renamed from: e */
    public final C15127c4 mo47594e() {
        return this.f40672b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16413c)) {
            return false;
        }
        C16413c cVar = (C16413c) obj;
        return Intrinsics.areEqual((Object) this.f40672b, (Object) cVar.f40672b) && Float.compare(getAlpha(), cVar.getAlpha()) == 0;
    }

    /* renamed from: f */
    public final float mo47596f() {
        return getAlpha();
    }

    @C12579k
    /* renamed from: g */
    public final C16413c mo47597g(@C12579k C15127c4 c4Var, float f) {
        Intrinsics.checkNotNullParameter(c4Var, "value");
        return new C16413c(c4Var, f);
    }

    public float getAlpha() {
        return this.f40673c;
    }

    public int hashCode() {
        return (this.f40672b.hashCode() * 31) + Float.hashCode(getAlpha());
    }

    @C12579k
    /* renamed from: i */
    public final C15127c4 mo47599i() {
        return this.f40672b;
    }

    @C12579k
    public String toString() {
        return "BrushStyle(value=" + this.f40672b + ", alpha=" + getAlpha() + ')';
    }
}
