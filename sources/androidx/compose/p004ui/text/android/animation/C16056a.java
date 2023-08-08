package androidx.compose.p004ui.text.android.animation;

import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.animation.a */
public final class C16056a {

    /* renamed from: g */
    public static final int f39953g = 0;

    /* renamed from: a */
    public final int f39954a;

    /* renamed from: b */
    public final int f39955b;

    /* renamed from: c */
    public final int f39956c;

    /* renamed from: d */
    public final int f39957d;

    /* renamed from: e */
    public final int f39958e;

    /* renamed from: f */
    public final int f39959f;

    public C16056a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f39954a = i;
        this.f39955b = i2;
        this.f39956c = i3;
        this.f39957d = i4;
        this.f39958e = i5;
        this.f39959f = i6;
    }

    /* renamed from: h */
    public static /* synthetic */ C16056a m72411h(C16056a aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = aVar.f39954a;
        }
        if ((i7 & 2) != 0) {
            i2 = aVar.f39955b;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = aVar.f39956c;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = aVar.f39957d;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = aVar.f39958e;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = aVar.f39959f;
        }
        return aVar.mo46330g(i, i8, i9, i10, i11, i6);
    }

    /* renamed from: a */
    public final int mo46323a() {
        return this.f39954a;
    }

    /* renamed from: b */
    public final int mo46324b() {
        return this.f39955b;
    }

    /* renamed from: c */
    public final int mo46325c() {
        return this.f39956c;
    }

    /* renamed from: d */
    public final int mo46326d() {
        return this.f39957d;
    }

    /* renamed from: e */
    public final int mo46327e() {
        return this.f39958e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16056a)) {
            return false;
        }
        C16056a aVar = (C16056a) obj;
        return this.f39954a == aVar.f39954a && this.f39955b == aVar.f39955b && this.f39956c == aVar.f39956c && this.f39957d == aVar.f39957d && this.f39958e == aVar.f39958e && this.f39959f == aVar.f39959f;
    }

    /* renamed from: f */
    public final int mo46329f() {
        return this.f39959f;
    }

    @C12579k
    /* renamed from: g */
    public final C16056a mo46330g(int i, int i2, int i3, int i4, int i5, int i6) {
        return new C16056a(i, i2, i3, i4, i5, i6);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f39954a) * 31) + Integer.hashCode(this.f39955b)) * 31) + Integer.hashCode(this.f39956c)) * 31) + Integer.hashCode(this.f39957d)) * 31) + Integer.hashCode(this.f39958e)) * 31) + Integer.hashCode(this.f39959f);
    }

    /* renamed from: i */
    public final int mo46332i() {
        return this.f39959f;
    }

    /* renamed from: j */
    public final int mo46333j() {
        return this.f39955b;
    }

    /* renamed from: k */
    public final int mo46334k() {
        return this.f39956c;
    }

    /* renamed from: l */
    public final int mo46335l() {
        return this.f39958e;
    }

    /* renamed from: m */
    public final int mo46336m() {
        return this.f39954a;
    }

    /* renamed from: n */
    public final int mo46337n() {
        return this.f39957d;
    }

    @C12579k
    public String toString() {
        return "Segment(startOffset=" + this.f39954a + ", endOffset=" + this.f39955b + ", left=" + this.f39956c + ", top=" + this.f39957d + ", right=" + this.f39958e + ", bottom=" + this.f39959f + ')';
    }
}
