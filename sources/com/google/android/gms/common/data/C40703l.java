package com.google.android.gms.common.data;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import java.util.NoSuchElementException;

@C40473a
/* renamed from: com.google.android.gms.common.data.l */
public class C40703l<T> extends C40693c<T> {

    /* renamed from: c */
    public Object f103683c;

    public C40703l(@C0359n0 C40692b bVar) {
        super(bVar);
    }

    @C0359n0
    public final Object next() {
        if (hasNext()) {
            int i = this.f103672b + 1;
            this.f103672b = i;
            if (i == 0) {
                Object l = C40843u.m166202l(this.f103671a.get(0));
                this.f103683c = l;
                if (!(l instanceof C40697f)) {
                    String valueOf = String.valueOf(l.getClass());
                    throw new IllegalStateException("DataBuffer reference of type " + valueOf + " is not movable");
                }
            } else {
                ((C40697f) C40843u.m166202l(this.f103683c)).mo134177n(this.f103672b);
            }
            return this.f103683c;
        }
        int i2 = this.f103672b;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i2);
    }
}
