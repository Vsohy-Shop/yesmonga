package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32496e;
import java.util.ListIterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.h */
public abstract class C41106h extends C41104g implements ListIterator {
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
