package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.w */
public final class C2417w implements C2366i0 {
    @C12579k

    /* renamed from: a */
    public final C2354e1 f6364a;
    @C12579k

    /* renamed from: b */
    public final C16479d f6365b;

    public C2417w(@C12579k C2354e1 e1Var, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(e1Var, "insets");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f6364a = e1Var;
        this.f6365b = dVar;
    }

    /* renamed from: a */
    public float mo8090a() {
        C16479d dVar = this.f6365b;
        return dVar.mo7416L(this.f6364a.mo7986c(dVar));
    }

    /* renamed from: b */
    public float mo8091b(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        C16479d dVar = this.f6365b;
        return dVar.mo7416L(this.f6364a.mo7987d(dVar, layoutDirection));
    }

    /* renamed from: c */
    public float mo8092c(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        C16479d dVar = this.f6365b;
        return dVar.mo7416L(this.f6364a.mo7985b(dVar, layoutDirection));
    }

    /* renamed from: d */
    public float mo8093d() {
        C16479d dVar = this.f6365b;
        return dVar.mo7416L(this.f6364a.mo7984a(dVar));
    }

    @C12579k
    /* renamed from: e */
    public final C2354e1 mo8220e() {
        return this.f6364a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2417w)) {
            return false;
        }
        C2417w wVar = (C2417w) obj;
        if (!Intrinsics.areEqual((Object) this.f6364a, (Object) wVar.f6364a) || !Intrinsics.areEqual((Object) this.f6365b, (Object) wVar.f6365b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6364a.hashCode() * 31) + this.f6365b.hashCode();
    }

    @C12579k
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f6364a + ", density=" + this.f6365b + ')';
    }
}
