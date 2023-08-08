package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.j */
public final class C16297j {
    @C12579k

    /* renamed from: f */
    public static final C16298a f40489f = new C16298a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f40490g = 8;

    /* renamed from: h */
    public static final int f40491h = -1;
    @C12579k

    /* renamed from: a */
    public final C16285d0 f40492a;

    /* renamed from: b */
    public int f40493b;

    /* renamed from: c */
    public int f40494c;

    /* renamed from: d */
    public int f40495d;

    /* renamed from: e */
    public int f40496e;

    /* renamed from: androidx.compose.ui.text.input.j$a */
    public static final class C16298a {
        public /* synthetic */ C16298a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C16298a() {
        }
    }

    public /* synthetic */ C16297j(C16156d dVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j);
    }

    /* renamed from: a */
    public final void mo47200a() {
        mo47214o(this.f40495d, this.f40496e, "");
        this.f40495d = -1;
        this.f40496e = -1;
    }

    /* renamed from: b */
    public final void mo47201b() {
        this.f40495d = -1;
        this.f40496e = -1;
    }

    /* renamed from: c */
    public final void mo47202c(int i, int i2) {
        long b = C16359o0.m73780b(i, i2);
        this.f40492a.mo47180d(i, i2, "");
        long a = C16300k.m73451a(C16359o0.m73780b(this.f40493b, this.f40494c), b);
        mo47219t(C16356n0.m73740l(a));
        mo47218s(C16356n0.m73739k(a));
        if (mo47212m()) {
            long a2 = C16300k.m73451a(C16359o0.m73780b(this.f40495d, this.f40496e), b);
            if (C16356n0.m73736h(a2)) {
                mo47201b();
                return;
            }
            this.f40495d = C16356n0.m73740l(a2);
            this.f40496e = C16356n0.m73739k(a2);
        }
    }

    /* renamed from: d */
    public final char mo47203d(int i) {
        return this.f40492a.mo47177a(i);
    }

    @C12580l
    /* renamed from: e */
    public final C16356n0 mo47204e() {
        if (mo47212m()) {
            return C16356n0.m73730b(C16359o0.m73780b(this.f40495d, this.f40496e));
        }
        return null;
    }

    /* renamed from: f */
    public final int mo47205f() {
        return this.f40496e;
    }

    /* renamed from: g */
    public final int mo47206g() {
        return this.f40495d;
    }

    /* renamed from: h */
    public final int mo47207h() {
        int i = this.f40493b;
        int i2 = this.f40494c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    /* renamed from: i */
    public final int mo47208i() {
        return this.f40492a.mo47178b();
    }

    /* renamed from: j */
    public final long mo47209j() {
        return C16359o0.m73780b(this.f40493b, this.f40494c);
    }

    /* renamed from: k */
    public final int mo47210k() {
        return this.f40494c;
    }

    /* renamed from: l */
    public final int mo47211l() {
        return this.f40493b;
    }

    /* renamed from: m */
    public final boolean mo47212m() {
        return this.f40495d != -1;
    }

    /* renamed from: n */
    public final void mo47213n(int i, int i2, @C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "text");
        mo47214o(i, i2, dVar.mo46683j());
    }

    /* renamed from: o */
    public final void mo47214o(int i, int i2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        if (i < 0 || i > this.f40492a.mo47178b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f40492a.mo47178b());
        } else if (i2 < 0 || i2 > this.f40492a.mo47178b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f40492a.mo47178b());
        } else if (i <= i2) {
            this.f40492a.mo47180d(i, i2, str);
            mo47219t(str.length() + i);
            mo47218s(i + str.length());
            this.f40495d = -1;
            this.f40496e = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        }
    }

    /* renamed from: p */
    public final void mo47215p(int i, int i2) {
        if (i < 0 || i > this.f40492a.mo47178b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f40492a.mo47178b());
        } else if (i2 < 0 || i2 > this.f40492a.mo47178b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f40492a.mo47178b());
        } else if (i < i2) {
            this.f40495d = i;
            this.f40496e = i2;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
        }
    }

    /* renamed from: q */
    public final void mo47216q(int i) {
        mo47217r(i, i);
    }

    /* renamed from: r */
    public final void mo47217r(int i, int i2) {
        if (i < 0 || i > this.f40492a.mo47178b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f40492a.mo47178b());
        } else if (i2 < 0 || i2 > this.f40492a.mo47178b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f40492a.mo47178b());
        } else if (i <= i2) {
            mo47219t(i);
            mo47218s(i2);
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        }
    }

    /* renamed from: s */
    public final void mo47218s(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f40494c = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    /* renamed from: t */
    public final void mo47219t(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f40493b = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    @C12579k
    public String toString() {
        return this.f40492a.toString();
    }

    @C12579k
    /* renamed from: u */
    public final C16156d mo47221u() {
        return new C16156d(toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ C16297j(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public C16297j(C16156d dVar, long j) {
        this.f40492a = new C16285d0(dVar.mo46683j());
        this.f40493b = C16356n0.m73740l(j);
        this.f40494c = C16356n0.m73739k(j);
        this.f40495d = -1;
        this.f40496e = -1;
        int l = C16356n0.m73740l(j);
        int k = C16356n0.m73739k(j);
        if (l < 0 || l > dVar.length()) {
            throw new IndexOutOfBoundsException("start (" + l + ") offset is outside of text region " + dVar.length());
        } else if (k < 0 || k > dVar.length()) {
            throw new IndexOutOfBoundsException("end (" + k + ") offset is outside of text region " + dVar.length());
        } else if (l > k) {
            throw new IllegalArgumentException("Do not set reversed range: " + l + " > " + k);
        }
    }

    public C16297j(String str, long j) {
        this(new C16156d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), j, (DefaultConstructorMarker) null);
    }
}
