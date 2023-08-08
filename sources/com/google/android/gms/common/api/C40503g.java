package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.data.C40691a;
import com.google.android.gms.common.data.C40692b;
import java.util.Iterator;

@C40473a
/* renamed from: com.google.android.gms.common.api.g */
public class C40503g<T, R extends C40691a<T> & C40669r> extends C40668q<R> implements C40692b<T> {
    @C40473a
    public C40503g() {
    }

    @C0359n0
    /* renamed from: Q0 */
    public final Iterator<T> mo133700Q0() {
        return ((C40691a) mo134100i()).mo133700Q0();
    }

    public final void close() {
        ((C40691a) mo134100i()).close();
    }

    @C0359n0
    public final T get(int i) {
        return ((C40691a) mo134100i()).get(i);
    }

    public final int getCount() {
        return ((C40691a) mo134100i()).getCount();
    }

    @C0363p0
    public final Bundle getMetadata() {
        return ((C40691a) mo134100i()).getMetadata();
    }

    public final boolean isClosed() {
        return ((C40691a) mo134100i()).isClosed();
    }

    @C0359n0
    public final Iterator<T> iterator() {
        return ((C40691a) mo134100i()).iterator();
    }

    public final void release() {
        ((C40691a) mo134100i()).release();
    }

    @C40473a
    public C40503g(@C0359n0 R r) {
        super(r);
    }
}
