package androidx.compose.p004ui.text;

import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* renamed from: androidx.compose.ui.text.v */
public final class C16454v {

    /* renamed from: d */
    public static final int f40781d = 0;

    /* renamed from: a */
    public final long f40782a;

    /* renamed from: b */
    public final long f40783b;

    /* renamed from: c */
    public final int f40784c;

    public /* synthetic */ C16454v(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }

    /* renamed from: b */
    public static /* synthetic */ C16454v m74302b(C16454v vVar, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = vVar.f40782a;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = vVar.f40783b;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = vVar.f40784c;
        }
        return vVar.mo47755a(j3, j4, i);
    }

    @C12579k
    /* renamed from: a */
    public final C16454v mo47755a(long j, long j2, int i) {
        return new C16454v(j, j2, i, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final long mo47756c() {
        return this.f40783b;
    }

    /* renamed from: d */
    public final int mo47757d() {
        return this.f40784c;
    }

    /* renamed from: e */
    public final long mo47758e() {
        return this.f40782a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16454v)) {
            return false;
        }
        C16454v vVar = (C16454v) obj;
        if (C16504t.m74683j(this.f40782a, vVar.f40782a) && C16504t.m74683j(this.f40783b, vVar.f40783b) && C16455w.m74317k(this.f40784c, vVar.f40784c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C16504t.m74688o(this.f40782a) * 31) + C16504t.m74688o(this.f40783b)) * 31) + C16455w.m74318l(this.f40784c);
    }

    @C12579k
    public String toString() {
        return "Placeholder(width=" + C16504t.m74694u(this.f40782a) + ", height=" + C16504t.m74694u(this.f40783b) + ", placeholderVerticalAlign=" + C16455w.m74319m(this.f40784c) + ')';
    }

    public C16454v(long j, long j2, int i) {
        this.f40782a = j;
        this.f40783b = j2;
        this.f40784c = i;
        if (!(!C16506u.m74718s(j))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        } else if (!(!C16506u.m74718s(j2))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }
}
