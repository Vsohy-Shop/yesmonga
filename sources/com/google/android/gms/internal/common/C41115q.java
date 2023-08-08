package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32488a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.q */
public abstract class C41115q implements Iterator {
    @CheckForNull

    /* renamed from: a */
    public Object f104404a;

    /* renamed from: b */
    public int f104405b = 2;

    @CheckForNull
    /* renamed from: b */
    public abstract Object mo134916b();

    @CheckForNull
    @C32488a
    /* renamed from: c */
    public final Object mo134933c() {
        this.f104405b = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f104405b;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f104405b = 4;
                    this.f104404a = mo134916b();
                    if (this.f104405b != 3) {
                        this.f104405b = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f104405b = 2;
            Object obj = this.f104404a;
            this.f104404a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
