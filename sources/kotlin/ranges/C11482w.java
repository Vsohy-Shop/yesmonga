package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C11419p1;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.C11345a;

@C11665v0(version = "1.3")
/* renamed from: kotlin.ranges.w */
public final class C11482w implements Iterator<C11419p1>, C11345a {

    /* renamed from: a */
    public final int f28622a;

    /* renamed from: b */
    public boolean f28623b;

    /* renamed from: c */
    public final int f28624c;

    /* renamed from: d */
    public int f28625d;

    public /* synthetic */ C11482w(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    /* renamed from: b */
    public int mo23101b() {
        int i = this.f28625d;
        if (i != this.f28622a) {
            this.f28625d = C11419p1.m43971M(this.f28624c + i);
        } else if (this.f28623b) {
            this.f28623b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f28623b;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return C11419p1.m43993g(mo23101b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C11482w(int i, int i2, int i3) {
        this.f28622a = i2;
        boolean z = true;
        if (i3 <= 0 ? Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0 : Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
            z = false;
        }
        this.f28623b = z;
        this.f28624c = C11419p1.m43971M(i3);
        this.f28625d = !this.f28623b ? i2 : i;
    }
}
