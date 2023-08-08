package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40666o;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.b */
public interface C40692b<T> extends Iterable<T>, C40666o, Closeable {
    @C0359n0
    /* renamed from: Q0 */
    Iterator<T> mo133700Q0();

    void close();

    @C0359n0
    T get(int i);

    int getCount();

    @C0363p0
    @C40473a
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @C0359n0
    Iterator<T> iterator();

    void release();
}
