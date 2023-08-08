package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.node.C15680d1;
import androidx.compose.p004ui.semantics.C16033h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.t3 */
public final class C15975t3 implements C15680d1 {

    /* renamed from: a */
    public final int f39671a;
    @C12579k

    /* renamed from: b */
    public final List<C15975t3> f39672b;
    @C12580l

    /* renamed from: c */
    public Float f39673c;
    @C12580l

    /* renamed from: d */
    public Float f39674d;
    @C12580l

    /* renamed from: e */
    public C16033h f39675e;
    @C12580l

    /* renamed from: f */
    public C16033h f39676f;

    public C15975t3(int i, @C12579k List<C15975t3> list, @C12580l Float f, @C12580l Float f2, @C12580l C16033h hVar, @C12580l C16033h hVar2) {
        Intrinsics.checkNotNullParameter(list, "allScopes");
        this.f39671a = i;
        this.f39672b = list;
        this.f39673c = f;
        this.f39674d = f2;
        this.f39675e = hVar;
        this.f39676f = hVar2;
    }

    @C12579k
    /* renamed from: a */
    public final List<C15975t3> mo45957a() {
        return this.f39672b;
    }

    @C12580l
    /* renamed from: b */
    public final C16033h mo45958b() {
        return this.f39675e;
    }

    @C12580l
    /* renamed from: c */
    public final Float mo45959c() {
        return this.f39673c;
    }

    @C12580l
    /* renamed from: d */
    public final Float mo45960d() {
        return this.f39674d;
    }

    /* renamed from: e */
    public final int mo45961e() {
        return this.f39671a;
    }

    /* renamed from: e0 */
    public boolean mo44553e0() {
        return this.f39672b.contains(this);
    }

    @C12580l
    /* renamed from: f */
    public final C16033h mo45962f() {
        return this.f39676f;
    }

    /* renamed from: g */
    public final void mo45963g(@C12580l C16033h hVar) {
        this.f39675e = hVar;
    }

    /* renamed from: h */
    public final void mo45964h(@C12580l Float f) {
        this.f39673c = f;
    }

    /* renamed from: i */
    public final void mo45965i(@C12580l Float f) {
        this.f39674d = f;
    }

    /* renamed from: j */
    public final void mo45966j(@C12580l C16033h hVar) {
        this.f39676f = hVar;
    }
}
