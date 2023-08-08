package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.p0 */
public final class C16312p0 implements C16293h {

    /* renamed from: c */
    public static final int f40526c = 0;
    @C12579k

    /* renamed from: a */
    public final C16156d f40527a;

    /* renamed from: b */
    public final int f40528b;

    public C16312p0(@C12579k C16156d dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "annotatedString");
        this.f40527a = dVar;
        this.f40528b = i;
    }

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        int i;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        if (jVar.mo47212m()) {
            int g = jVar.mo47206g();
            jVar.mo47214o(jVar.mo47206g(), jVar.mo47205f(), mo47289d());
            if (mo47289d().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                jVar.mo47215p(g, mo47289d().length() + g);
            }
        } else {
            int l = jVar.mo47211l();
            jVar.mo47214o(jVar.mo47211l(), jVar.mo47210k(), mo47289d());
            if (mo47289d().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jVar.mo47215p(l, mo47289d().length() + l);
            }
        }
        int h = jVar.mo47207h();
        int i2 = this.f40528b;
        if (i2 > 0) {
            i = (h + i2) - 1;
        } else {
            i = (h + i2) - mo47289d().length();
        }
        jVar.mo47216q(C11479u.m44334I(i, 0, jVar.mo47208i()));
    }

    @C12579k
    /* renamed from: b */
    public final C16156d mo47287b() {
        return this.f40527a;
    }

    /* renamed from: c */
    public final int mo47288c() {
        return this.f40528b;
    }

    @C12579k
    /* renamed from: d */
    public final String mo47289d() {
        return this.f40527a.mo46683j();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16312p0)) {
            return false;
        }
        C16312p0 p0Var = (C16312p0) obj;
        if (Intrinsics.areEqual((Object) mo47289d(), (Object) p0Var.mo47289d()) && this.f40528b == p0Var.f40528b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (mo47289d().hashCode() * 31) + this.f40528b;
    }

    @C12579k
    public String toString() {
        return "SetComposingTextCommand(text='" + mo47289d() + "', newCursorPosition=" + this.f40528b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16312p0(@C12579k String str, int i) {
        this(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i);
        Intrinsics.checkNotNullParameter(str, "text");
    }
}
