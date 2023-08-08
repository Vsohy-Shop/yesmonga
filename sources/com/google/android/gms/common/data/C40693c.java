package com.google.android.gms.common.data;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.Iterator;
import java.util.NoSuchElementException;

@C40473a
/* renamed from: com.google.android.gms.common.data.c */
public class C40693c<T> implements Iterator<T> {
    @C0359n0

    /* renamed from: a */
    public final C40692b f103671a;

    /* renamed from: b */
    public int f103672b = -1;

    public C40693c(@C0359n0 C40692b bVar) {
        this.f103671a = (C40692b) C40843u.m166202l(bVar);
    }

    public final boolean hasNext() {
        return this.f103672b < this.f103671a.getCount() + -1;
    }

    @C0359n0
    public Object next() {
        if (hasNext()) {
            C40692b bVar = this.f103671a;
            int i = this.f103672b + 1;
            this.f103672b = i;
            return bVar.get(i);
        }
        int i2 = this.f103672b;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
