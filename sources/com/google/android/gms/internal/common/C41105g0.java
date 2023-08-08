package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.g0 */
public abstract class C41105g0 extends C41106h {

    /* renamed from: a */
    public final int f104398a;

    /* renamed from: b */
    public int f104399b;

    public C41105g0(int i, int i2) {
        C41124z.m166999b(i2, i, "index");
        this.f104398a = i;
        this.f104399b = i2;
    }

    /* renamed from: b */
    public abstract Object mo134917b(int i);

    public final boolean hasNext() {
        return this.f104399b < this.f104398a;
    }

    public final boolean hasPrevious() {
        return this.f104399b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f104399b;
            this.f104399b = i + 1;
            return mo134917b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f104399b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f104399b - 1;
            this.f104399b = i;
            return mo134917b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f104399b - 1;
    }
}
