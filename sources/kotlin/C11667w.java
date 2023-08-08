package kotlin;

import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
/* renamed from: kotlin.w */
public final class C11667w implements Comparable<C11667w> {
    @C12579k

    /* renamed from: e */
    public static final C11668a f28977e = new C11668a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f28978f = 255;
    @C12579k
    @C11287e

    /* renamed from: g */
    public static final C11667w f28979g = C11671x.m45784a();

    /* renamed from: a */
    public final int f28980a;

    /* renamed from: b */
    public final int f28981b;

    /* renamed from: c */
    public final int f28982c;

    /* renamed from: d */
    public final int f28983d;

    /* renamed from: kotlin.w$a */
    public static final class C11668a {
        public /* synthetic */ C11668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11668a() {
        }
    }

    public C11667w(int i, int i2, int i3) {
        this.f28980a = i;
        this.f28981b = i2;
        this.f28982c = i3;
        this.f28983d = mo23545z(i, i2, i3);
    }

    /* renamed from: b */
    public int compareTo(@C12579k C11667w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "other");
        return this.f28983d - wVar.f28983d;
    }

    public boolean equals(@C12580l Object obj) {
        C11667w wVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11667w) {
            wVar = (C11667w) obj;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            return false;
        }
        if (this.f28983d == wVar.f28983d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo23538g() {
        return this.f28980a;
    }

    public int hashCode() {
        return this.f28983d;
    }

    /* renamed from: q */
    public final int mo23540q() {
        return this.f28981b;
    }

    /* renamed from: r */
    public final int mo23541r() {
        return this.f28982c;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28980a);
        sb.append('.');
        sb.append(this.f28981b);
        sb.append('.');
        sb.append(this.f28982c);
        return sb.toString();
    }

    /* renamed from: w */
    public final boolean mo23543w(int i, int i2) {
        int i3 = this.f28980a;
        if (i3 > i || (i3 == i && this.f28981b >= i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo23544y(int i, int i2, int i3) {
        int i4;
        int i5 = this.f28980a;
        if (i5 > i || (i5 == i && ((i4 = this.f28981b) > i2 || (i4 == i2 && this.f28982c >= i3)))) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final int mo23545z(int i, int i2, int i3) {
        boolean z = false;
        if (new C11466l(0, 255).mo23056Q(i) && new C11466l(0, 255).mo23056Q(i2) && new C11466l(0, 255).mo23056Q(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public C11667w(int i, int i2) {
        this(i, i2, 0);
    }
}
