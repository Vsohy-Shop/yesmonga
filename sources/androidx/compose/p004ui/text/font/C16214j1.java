package androidx.compose.p004ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.j1 */
public final class C16214j1 {
    @C12580l

    /* renamed from: a */
    public final C16242u f40306a;
    @C12579k

    /* renamed from: b */
    public final C16209i0 f40307b;

    /* renamed from: c */
    public final int f40308c;

    /* renamed from: d */
    public final int f40309d;
    @C12580l

    /* renamed from: e */
    public final Object f40310e;

    public /* synthetic */ C16214j1(C16242u uVar, C16209i0 i0Var, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, i0Var, i, i2, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ C16214j1 m73085g(C16214j1 j1Var, C16242u uVar, C16209i0 i0Var, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            uVar = j1Var.f40306a;
        }
        if ((i3 & 2) != 0) {
            i0Var = j1Var.f40307b;
        }
        C16209i0 i0Var2 = i0Var;
        if ((i3 & 4) != 0) {
            i = j1Var.f40308c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = j1Var.f40309d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = j1Var.f40310e;
        }
        return j1Var.mo46967f(uVar, i0Var2, i4, i5, obj);
    }

    @C12580l
    /* renamed from: a */
    public final C16242u mo46961a() {
        return this.f40306a;
    }

    @C12579k
    /* renamed from: b */
    public final C16209i0 mo46962b() {
        return this.f40307b;
    }

    /* renamed from: c */
    public final int mo46963c() {
        return this.f40308c;
    }

    /* renamed from: d */
    public final int mo46964d() {
        return this.f40309d;
    }

    @C12580l
    /* renamed from: e */
    public final Object mo46965e() {
        return this.f40310e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16214j1)) {
            return false;
        }
        C16214j1 j1Var = (C16214j1) obj;
        return Intrinsics.areEqual((Object) this.f40306a, (Object) j1Var.f40306a) && Intrinsics.areEqual((Object) this.f40307b, (Object) j1Var.f40307b) && C16190e0.m72951f(this.f40308c, j1Var.f40308c) && C16194f0.m72971h(this.f40309d, j1Var.f40309d) && Intrinsics.areEqual(this.f40310e, j1Var.f40310e);
    }

    @C12579k
    /* renamed from: f */
    public final C16214j1 mo46967f(@C12580l C16242u uVar, @C12579k C16209i0 i0Var, int i, int i2, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return new C16214j1(uVar, i0Var, i, i2, obj, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: h */
    public final C16242u mo46968h() {
        return this.f40306a;
    }

    public int hashCode() {
        C16242u uVar = this.f40306a;
        int i = 0;
        int hashCode = (((((((uVar == null ? 0 : uVar.hashCode()) * 31) + this.f40307b.hashCode()) * 31) + C16190e0.m72952h(this.f40308c)) * 31) + C16194f0.m72972i(this.f40309d)) * 31;
        Object obj = this.f40310e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final int mo46970i() {
        return this.f40308c;
    }

    /* renamed from: j */
    public final int mo46971j() {
        return this.f40309d;
    }

    @C12579k
    /* renamed from: k */
    public final C16209i0 mo46972k() {
        return this.f40307b;
    }

    @C12580l
    /* renamed from: l */
    public final Object mo46973l() {
        return this.f40310e;
    }

    @C12579k
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f40306a + ", fontWeight=" + this.f40307b + ", fontStyle=" + C16190e0.m72953i(this.f40308c) + ", fontSynthesis=" + C16194f0.m72975l(this.f40309d) + ", resourceLoaderCacheKey=" + this.f40310e + ')';
    }

    public C16214j1(C16242u uVar, C16209i0 i0Var, int i, int i2, Object obj) {
        this.f40306a = uVar;
        this.f40307b = i0Var;
        this.f40308c = i;
        this.f40309d = i2;
        this.f40310e = obj;
    }
}
