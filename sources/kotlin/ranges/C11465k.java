package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.C10953k0;

/* renamed from: kotlin.ranges.k */
public final class C11465k extends C10953k0 {

    /* renamed from: a */
    public final int f28598a;

    /* renamed from: b */
    public final int f28599b;

    /* renamed from: c */
    public boolean f28600c;

    /* renamed from: d */
    public int f28601d;

    public C11465k(int i, int i2, int i3) {
        this.f28598a = i3;
        this.f28599b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f28600c = z;
        this.f28601d = !z ? i2 : i;
    }

    /* renamed from: c */
    public int mo6374c() {
        int i = this.f28601d;
        if (i != this.f28599b) {
            this.f28601d = this.f28598a + i;
        } else if (this.f28600c) {
            this.f28600c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    /* renamed from: d */
    public final int mo23054d() {
        return this.f28598a;
    }

    public boolean hasNext() {
        return this.f28600c;
    }
}
