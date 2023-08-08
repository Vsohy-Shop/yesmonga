package androidx.compose.animation;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.g */
public abstract class C2028g {
    @C12579k

    /* renamed from: a */
    public static final C2029a f5666a = new C2029a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f5667b = 0;
    @C12579k

    /* renamed from: c */
    public static final C2028g f5668c = new C2030h(new C2047w((C2033j) null, (C2043s) null, (ChangeSize) null, (C2039o) null, 15, (DefaultConstructorMarker) null));

    /* renamed from: androidx.compose.animation.g$a */
    public static final class C2029a {
        public /* synthetic */ C2029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C2028g mo7033a() {
            return C2028g.f5668c;
        }

        public C2029a() {
        }
    }

    public /* synthetic */ C2028g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C12579k
    /* renamed from: b */
    public abstract C2047w mo7028b();

    @C8547h2
    @C12579k
    /* renamed from: c */
    public final C2028g mo7029c(@C12579k C2028g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "exit");
        C2033j h = mo7028b().mo7093h();
        if (h == null) {
            h = gVar.mo7028b().mo7093h();
        }
        C2043s j = mo7028b().mo7096j();
        if (j == null) {
            j = gVar.mo7028b().mo7096j();
        }
        ChangeSize g = mo7028b().mo7092g();
        if (g == null) {
            g = gVar.mo7028b().mo7092g();
        }
        C2039o i = mo7028b().mo7095i();
        if (i == null) {
            i = gVar.mo7028b().mo7095i();
        }
        return new C2030h(new C2047w(h, j, g, i));
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof C2028g) && Intrinsics.areEqual((Object) ((C2028g) obj).mo7028b(), (Object) mo7028b());
    }

    public int hashCode() {
        return mo7028b().hashCode();
    }

    @C12579k
    public String toString() {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual((Object) this, (Object) f5668c)) {
            return "ExitTransition.None";
        }
        C2047w b = mo7028b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
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

    public C2028g() {
    }
}
