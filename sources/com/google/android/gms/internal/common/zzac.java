package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32488a;
import com.google.errorprone.annotations.C32496e;
import com.google.errorprone.annotations.C32497f;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
@C32497f("Use ImmutableList.of or another implementation")
public abstract class zzac extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f104409a = new Object[0];

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @C32488a
    /* renamed from: e */
    public int mo134943e(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo134944h() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo134945i() {
        throw null;
    }

    /* renamed from: k */
    public zzag mo134947k() {
        throw null;
    }

    /* renamed from: q */
    public abstract C41104g iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract boolean mo134949r();

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f104409a);
    }

    @CheckForNull
    /* renamed from: w */
    public Object[] mo134955w() {
        throw null;
    }

    @C32488a
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] w = mo134955w();
            if (w != null) {
                return Arrays.copyOfRange(w, mo134945i(), mo134944h(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo134943e(objArr, 0);
        return objArr;
    }
}
