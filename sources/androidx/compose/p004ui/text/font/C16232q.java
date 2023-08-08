package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16201h0;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.font.q */
public final class C16232q extends C16185d {
    @C12579k

    /* renamed from: g */
    public final String f40332g;
    @C12579k

    /* renamed from: h */
    public final C16209i0 f40333h;

    /* renamed from: i */
    public final int f40334i;

    public /* synthetic */ C16232q(String str, C16209i0 i0Var, int i, C16201h0.C16206e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i0Var, i, eVar);
    }

    /* renamed from: b */
    public int mo46930b() {
        return this.f40334i;
    }

    @C12580l
    /* renamed from: e */
    public final Typeface mo46995e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return C16241t0.m73158a().mo47001c(this.f40332g, getWeight(), mo46930b(), mo46870d(), context);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16232q)) {
            return false;
        }
        C16232q qVar = (C16232q) obj;
        if (C16228p.m73126d(this.f40332g, qVar.f40332g) && Intrinsics.areEqual((Object) getWeight(), (Object) qVar.getWeight()) && C16190e0.m72951f(mo46930b(), qVar.mo46930b()) && Intrinsics.areEqual((Object) mo46870d(), (Object) qVar.mo46870d())) {
            return true;
        }
        return false;
    }

    @C12579k
    public C16209i0 getWeight() {
        return this.f40333h;
    }

    public int hashCode() {
        return (((((C16228p.m73127f(this.f40332g) * 31) + getWeight().hashCode()) * 31) + C16190e0.m72952h(mo46930b())) * 31) + mo46870d().hashCode();
    }

    @C12579k
    public String toString() {
        return "Font(familyName=\"" + C16228p.m73128g(this.f40332g) + "\", weight=" + getWeight() + ", style=" + C16190e0.m72953i(mo46930b()) + ')';
    }

    public C16232q(String str, C16209i0 i0Var, int i, C16201h0.C16206e eVar) {
        super(C16182c0.f40243b.mo46867c(), C16223m0.f40324a, eVar, (DefaultConstructorMarker) null);
        this.f40332g = str;
        this.f40333h = i0Var;
        this.f40334i = i;
    }
}
