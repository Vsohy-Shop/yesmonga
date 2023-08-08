package androidx.compose.animation;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.e */
public abstract class C2025e {
    @C12579k

    /* renamed from: a */
    public static final C2026a f5662a = new C2026a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f5663b = 0;
    @C12579k

    /* renamed from: c */
    public static final C2025e f5664c = new C2027f(new C2047w((C2033j) null, (C2043s) null, (ChangeSize) null, (C2039o) null, 15, (DefaultConstructorMarker) null));

    /* renamed from: androidx.compose.animation.e$a */
    public static final class C2026a {
        public /* synthetic */ C2026a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C2025e mo7027a() {
            return C2025e.f5664c;
        }

        public C2026a() {
        }
    }

    public /* synthetic */ C2025e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: b */
    public abstract C2047w mo7022b();

    @C8547h2
    @C12579k
    /* renamed from: c */
    public final C2025e mo7023c(@C12579k C2025e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "enter");
        C2033j h = mo7022b().mo7093h();
        if (h == null) {
            h = eVar.mo7022b().mo7093h();
        }
        C2043s j = mo7022b().mo7096j();
        if (j == null) {
            j = eVar.mo7022b().mo7096j();
        }
        ChangeSize g = mo7022b().mo7092g();
        if (g == null) {
            g = eVar.mo7022b().mo7092g();
        }
        C2039o i = mo7022b().mo7095i();
        if (i == null) {
            i = eVar.mo7022b().mo7095i();
        }
        return new C2027f(new C2047w(h, j, g, i));
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof C2025e) && Intrinsics.areEqual((Object) ((C2025e) obj).mo7022b(), (Object) mo7022b());
    }

    public int hashCode() {
        return mo7022b().hashCode();
    }

    @C12579k
    public String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual((Object) this, (Object) f5664c)) {
            return "EnterTransition.None";
        }
        C2047w b = mo7022b();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        C2033j h = b.mo7093h();
        String str4 = null;
        if (h != null) {
            str = h.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        C2043s j = b.mo7096j();
        if (j != null) {
            str2 = j.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        ChangeSize g = b.mo7092g();
        if (g != null) {
            str3 = g.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        C2039o i = b.mo7095i();
        if (i != null) {
            str4 = i.toString();
        }
        sb.append(str4);
        return sb.toString();
    }

    public C2025e() {
    }
}
