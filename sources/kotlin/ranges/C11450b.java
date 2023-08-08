package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.C10972q;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.ranges.b */
public final class C11450b extends C10972q {

    /* renamed from: a */
    public final int f28580a;

    /* renamed from: b */
    public final int f28581b;

    /* renamed from: c */
    public boolean f28582c;

    /* renamed from: d */
    public int f28583d;

    public C11450b(char c, char c2, int i) {
        this.f28580a = i;
        this.f28581b = c2;
        boolean z = true;
        if (i <= 0 ? Intrinsics.compare((int) c, (int) c2) < 0 : Intrinsics.compare((int) c, (int) c2) > 0) {
            z = false;
        }
        this.f28582c = z;
        this.f28583d = !z ? c2 : c;
    }

    /* renamed from: c */
    public char mo22395c() {
        int i = this.f28583d;
        if (i != this.f28581b) {
            this.f28583d = this.f28580a + i;
        } else if (this.f28582c) {
            this.f28582c = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    /* renamed from: d */
    public final int mo23016d() {
        return this.f28580a;
    }

    public boolean hasNext() {
        return this.f28582c;
    }
}
