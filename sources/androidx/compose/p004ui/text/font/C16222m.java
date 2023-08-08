package androidx.compose.p004ui.text.font;

import android.content.Context;
import androidx.compose.p004ui.text.font.C16238t;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.m */
public final class C16222m implements C16227o0 {
    @C12579k

    /* renamed from: a */
    public final C16238t.C16240b f40321a;
    @C12579k

    /* renamed from: b */
    public final Context f40322b;
    @C12579k

    /* renamed from: c */
    public final Object f40323c = new Object();

    public C16222m(@C12579k C16238t.C16240b bVar, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(bVar, "loader");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f40321a = bVar;
        this.f40322b = context;
    }

    @C12580l
    /* renamed from: a */
    public Object mo46754a(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "font");
        if (!(tVar instanceof C16185d)) {
            return this.f40321a.mo45979a(tVar);
        }
        C16185d dVar = (C16185d) tVar;
        return dVar.mo46869c().mo46872b(this.f40322b, dVar);
    }

    @C12579k
    /* renamed from: b */
    public Object mo46755b() {
        return this.f40323c;
    }

    @C12580l
    /* renamed from: c */
    public Object mo46756c(@C12579k C16238t tVar, @C12579k C11045c<Object> cVar) {
        if (!(tVar instanceof C16185d)) {
            return this.f40321a.mo45979a(tVar);
        }
        C16185d dVar = (C16185d) tVar;
        return dVar.mo46869c().mo46871a(this.f40322b, dVar, cVar);
    }

    @C12579k
    /* renamed from: d */
    public final C16238t.C16240b mo46984d() {
        return this.f40321a;
    }
}
