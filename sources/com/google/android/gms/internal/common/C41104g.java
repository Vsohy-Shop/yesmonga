package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32496e;
import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.g */
public abstract class C41104g implements Iterator {
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
