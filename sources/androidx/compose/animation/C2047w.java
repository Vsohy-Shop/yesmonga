package androidx.compose.animation;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.w */
public final class C2047w {
    @C12580l

    /* renamed from: a */
    public final C2033j f5698a;
    @C12580l

    /* renamed from: b */
    public final C2043s f5699b;
    @C12580l

    /* renamed from: c */
    public final ChangeSize f5700c;
    @C12580l

    /* renamed from: d */
    public final C2039o f5701d;

    public C2047w() {
        this((C2033j) null, (C2043s) null, (ChangeSize) null, (C2039o) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ C2047w m8767f(C2047w wVar, C2033j jVar, C2043s sVar, ChangeSize changeSize, C2039o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = wVar.f5698a;
        }
        if ((i & 2) != 0) {
            sVar = wVar.f5699b;
        }
        if ((i & 4) != 0) {
            changeSize = wVar.f5700c;
        }
        if ((i & 8) != 0) {
            oVar = wVar.f5701d;
        }
        return wVar.mo7090e(jVar, sVar, changeSize, oVar);
    }

    @C12580l
    /* renamed from: a */
    public final C2033j mo7086a() {
        return this.f5698a;
    }

    @C12580l
    /* renamed from: b */
    public final C2043s mo7087b() {
        return this.f5699b;
    }

    @C12580l
    /* renamed from: c */
    public final ChangeSize mo7088c() {
        return this.f5700c;
    }

    @C12580l
    /* renamed from: d */
    public final C2039o mo7089d() {
        return this.f5701d;
    }

    @C12579k
    /* renamed from: e */
    public final C2047w mo7090e(@C12580l C2033j jVar, @C12580l C2043s sVar, @C12580l ChangeSize changeSize, @C12580l C2039o oVar) {
        return new C2047w(jVar, sVar, changeSize, oVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2047w)) {
            return false;
        }
        C2047w wVar = (C2047w) obj;
        return Intrinsics.areEqual((Object) this.f5698a, (Object) wVar.f5698a) && Intrinsics.areEqual((Object) this.f5699b, (Object) wVar.f5699b) && Intrinsics.areEqual((Object) this.f5700c, (Object) wVar.f5700c) && Intrinsics.areEqual((Object) this.f5701d, (Object) wVar.f5701d);
    }

    @C12580l
    /* renamed from: g */
    public final ChangeSize mo7092g() {
        return this.f5700c;
    }

    @C12580l
    /* renamed from: h */
    public final C2033j mo7093h() {
        return this.f5698a;
    }

    public int hashCode() {
        C2033j jVar = this.f5698a;
        int i = 0;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        C2043s sVar = this.f5699b;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        ChangeSize changeSize = this.f5700c;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        C2039o oVar = this.f5701d;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final C2039o mo7095i() {
        return this.f5701d;
    }

    @C12580l
    /* renamed from: j */
    public final C2043s mo7096j() {
        return this.f5699b;
    }

    @C12579k
    public String toString() {
        return "TransitionData(fade=" + this.f5698a + ", slide=" + this.f5699b + ", changeSize=" + this.f5700c + ", scale=" + this.f5701d + ')';
    }

    public C2047w(@C12580l C2033j jVar, @C12580l C2043s sVar, @C12580l ChangeSize changeSize, @C12580l C2039o oVar) {
        this.f5698a = jVar;
        this.f5699b = sVar;
        this.f5700c = changeSize;
        this.f5701d = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2047w(C2033j jVar, C2043s sVar, ChangeSize changeSize, C2039o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jVar, (i & 2) != 0 ? null : sVar, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : oVar);
    }
}
