package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.graphics.drawscope.C15184c;
import com.google.firebase.crashlytics.C32648f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.draw.g */
public final class C8748g implements C8746f {
    @C12579k

    /* renamed from: a */
    public final CacheDrawScope f23450a;
    @C12579k

    /* renamed from: b */
    public final C11300l<CacheDrawScope, C8751i> f23451b;

    public C8748g(@C12579k CacheDrawScope cacheDrawScope, @C12579k C11300l<? super CacheDrawScope, C8751i> lVar) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(lVar, "onBuildDrawCache");
        this.f23450a = cacheDrawScope;
        this.f23451b = lVar;
    }

    /* renamed from: g */
    public static /* synthetic */ C8748g m32530g(C8748g gVar, CacheDrawScope cacheDrawScope, C11300l<CacheDrawScope, C8751i> lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheDrawScope = gVar.f23450a;
        }
        if ((i & 2) != 0) {
            lVar = gVar.f23451b;
        }
        return gVar.mo17176e(cacheDrawScope, lVar);
    }

    /* renamed from: C */
    public void mo7212C(@C12579k C15184c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        C8751i d = this.f23450a.mo17091d();
        Intrinsics.checkNotNull(d);
        d.mo17182a().invoke(cVar);
    }

    @C12579k
    /* renamed from: a */
    public final CacheDrawScope mo17174a() {
        return this.f23450a;
    }

    @C12579k
    /* renamed from: b */
    public final C11300l<CacheDrawScope, C8751i> mo17175b() {
        return this.f23451b;
    }

    @C12579k
    /* renamed from: e */
    public final C8748g mo17176e(@C12579k CacheDrawScope cacheDrawScope, @C12579k C11300l<? super CacheDrawScope, C8751i> lVar) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(lVar, "onBuildDrawCache");
        return new C8748g(cacheDrawScope, lVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8748g)) {
            return false;
        }
        C8748g gVar = (C8748g) obj;
        if (Intrinsics.areEqual((Object) this.f23450a, (Object) gVar.f23450a) && Intrinsics.areEqual((Object) this.f23451b, (Object) gVar.f23451b)) {
            return true;
        }
        return false;
    }

    /* renamed from: h4 */
    public void mo17173h4(@C12579k C8743c cVar) {
        Intrinsics.checkNotNullParameter(cVar, C32648f.f79206e);
        CacheDrawScope cacheDrawScope = this.f23450a;
        cacheDrawScope.mo17095i(cVar);
        cacheDrawScope.mo17096j((C8751i) null);
        this.f23451b.invoke(cacheDrawScope);
        if (cacheDrawScope.mo17091d() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public int hashCode() {
        return (this.f23450a.hashCode() * 31) + this.f23451b.hashCode();
    }

    @C12579k
    /* renamed from: l */
    public final CacheDrawScope mo17179l() {
        return this.f23450a;
    }

    @C12579k
    /* renamed from: m */
    public final C11300l<CacheDrawScope, C8751i> mo17180m() {
        return this.f23451b;
    }

    @C12579k
    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f23450a + ", onBuildDrawCache=" + this.f23451b + ')';
    }
}
