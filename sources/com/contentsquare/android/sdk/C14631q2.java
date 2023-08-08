package com.contentsquare.android.sdk;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;

/* renamed from: com.contentsquare.android.sdk.q2 */
public final class C14631q2<E> implements Iterator<E>, C11345a {

    /* renamed from: a */
    public final /* synthetic */ Iterator<E> f36224a;

    public C14631q2(Iterator<? extends E> it) {
        Intrinsics.checkNotNullParameter(it, "delegate");
        this.f36224a = it;
    }

    public boolean hasNext() {
        return this.f36224a.hasNext();
    }

    public E next() {
        return this.f36224a.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
