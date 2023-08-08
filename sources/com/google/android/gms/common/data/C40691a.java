package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.a */
public abstract class C40691a<T> implements C40692b<T> {
    @C0363p0
    @C40473a

    /* renamed from: a */
    public final DataHolder f103670a;

    @C40473a
    public C40691a(@C0363p0 DataHolder dataHolder) {
        this.f103670a = dataHolder;
    }

    @C0359n0
    /* renamed from: Q0 */
    public Iterator<T> mo133700Q0() {
        return new C40703l(this);
    }

    public final void close() {
        release();
    }

    @C0359n0
    public abstract T get(int i);

    public int getCount() {
        DataHolder dataHolder = this.f103670a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @C0363p0
    public final Bundle getMetadata() {
        DataHolder dataHolder = this.f103670a;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.getMetadata();
    }

    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.f103670a;
        return dataHolder == null || dataHolder.isClosed();
    }

    @C0359n0
    public Iterator<T> iterator() {
        return new C40693c(this);
    }

    public void release() {
        DataHolder dataHolder = this.f103670a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
