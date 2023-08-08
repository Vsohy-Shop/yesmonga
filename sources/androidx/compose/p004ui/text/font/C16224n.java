package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16238t;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.n */
public final class C16224n implements C16227o0 {
    @C12579k

    /* renamed from: a */
    public final C16238t.C16240b f40325a;
    @C12579k

    /* renamed from: b */
    public final Object f40326b = new Object();

    public C16224n(@C12579k C16238t.C16240b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "loader");
        this.f40325a = bVar;
    }

    @C12579k
    /* renamed from: a */
    public Object mo46754a(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "font");
        return this.f40325a.mo45979a(tVar);
    }

    @C12579k
    /* renamed from: b */
    public Object mo46755b() {
        return this.f40326b;
    }

    @C12580l
    /* renamed from: c */
    public Object mo46756c(@C12579k C16238t tVar, @C12579k C11045c<Object> cVar) {
        return this.f40325a.mo45979a(tVar);
    }

    @C12579k
    /* renamed from: d */
    public final C16238t.C16240b mo46985d() {
        return this.f40325a;
    }
}
