package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:149\n*E\n"})
/* renamed from: androidx.compose.ui.text.style.d */
public final class C16414d implements TextForegroundStyle {

    /* renamed from: b */
    public final long f40674b;

    public /* synthetic */ C16414d(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: g */
    public static /* synthetic */ C16414d m74043g(C16414d dVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dVar.f40674b;
        }
        return dVar.mo47603f(j);
    }

    /* renamed from: a */
    public long mo47577a() {
        return this.f40674b;
    }

    @C12580l
    /* renamed from: d */
    public C15421z1 mo47580d() {
        return null;
    }

    /* renamed from: e */
    public final long mo47601e() {
        return this.f40674b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16414d) && C15240j2.m66082y(this.f40674b, ((C16414d) obj).f40674b);
    }

    @C12579k
    /* renamed from: f */
    public final C16414d mo47603f(long j) {
        return new C16414d(j, (DefaultConstructorMarker) null);
    }

    public float getAlpha() {
        return C15240j2.m66047A(mo47577a());
    }

    /* renamed from: h */
    public final long mo47604h() {
        return this.f40674b;
    }

    public int hashCode() {
        return C15240j2.m66056K(this.f40674b);
    }

    @C12579k
    public String toString() {
        return "ColorStyle(value=" + C15240j2.m66057L(this.f40674b) + ')';
    }

    public C16414d(long j) {
        this.f40674b = j;
        if (!(j != C15240j2.f37547b.mo42851u())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
