package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.w */
public final class C2849w {
    @C12579k

    /* renamed from: a */
    public LayoutDirection f7474a;
    @C12579k

    /* renamed from: b */
    public C16479d f7475b;
    @C12579k

    /* renamed from: c */
    public C16242u.C16244b f7476c;
    @C12579k

    /* renamed from: d */
    public C16361p0 f7477d;
    @C12579k

    /* renamed from: e */
    public Object f7478e;

    /* renamed from: f */
    public long f7479f = mo9911a();

    public C2849w(@C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, @C12579k C16361p0 p0Var, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(p0Var, "resolvedStyle");
        Intrinsics.checkNotNullParameter(obj, "typeface");
        this.f7474a = layoutDirection;
        this.f7475b = dVar;
        this.f7476c = bVar;
        this.f7477d = p0Var;
        this.f7478e = obj;
    }

    /* renamed from: a */
    public final long mo9911a() {
        return C2847u.m13130b(this.f7477d, this.f7475b, this.f7476c, (String) null, 0, 24, (Object) null);
    }

    @C12579k
    /* renamed from: b */
    public final C16479d mo9912b() {
        return this.f7475b;
    }

    @C12579k
    /* renamed from: c */
    public final C16242u.C16244b mo9913c() {
        return this.f7476c;
    }

    @C12579k
    /* renamed from: d */
    public final LayoutDirection mo9914d() {
        return this.f7474a;
    }

    /* renamed from: e */
    public final long mo9915e() {
        return this.f7479f;
    }

    @C12579k
    /* renamed from: f */
    public final C16361p0 mo9916f() {
        return this.f7477d;
    }

    @C12579k
    /* renamed from: g */
    public final Object mo9917g() {
        return this.f7478e;
    }

    /* renamed from: h */
    public final void mo9918h(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f7475b = dVar;
    }

    /* renamed from: i */
    public final void mo9919i(@C12579k C16242u.C16244b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f7476c = bVar;
    }

    /* renamed from: j */
    public final void mo9920j(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.f7474a = layoutDirection;
    }

    /* renamed from: k */
    public final void mo9921k(@C12579k C16361p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        this.f7477d = p0Var;
    }

    /* renamed from: l */
    public final void mo9922l(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f7478e = obj;
    }

    /* renamed from: m */
    public final void mo9923m(@C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, @C12579k C16361p0 p0Var, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(p0Var, "resolvedStyle");
        Intrinsics.checkNotNullParameter(obj, "typeface");
        if (layoutDirection != this.f7474a || !Intrinsics.areEqual((Object) dVar, (Object) this.f7475b) || !Intrinsics.areEqual((Object) bVar, (Object) this.f7476c) || !Intrinsics.areEqual((Object) p0Var, (Object) this.f7477d) || !Intrinsics.areEqual(obj, this.f7478e)) {
            this.f7474a = layoutDirection;
            this.f7475b = dVar;
            this.f7476c = bVar;
            this.f7477d = p0Var;
            this.f7478e = obj;
            this.f7479f = mo9911a();
        }
    }
}
