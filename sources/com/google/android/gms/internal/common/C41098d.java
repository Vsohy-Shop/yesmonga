package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32488a;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.common.d */
public final class C41098d extends C41094b {
    public C41098d() {
        super(4);
    }

    @C32488a
    /* renamed from: c */
    public final C41098d mo134914c(Object obj) {
        super.mo134910a(obj);
        return this;
    }

    @C32488a
    /* renamed from: d */
    public final C41098d mo134915d(Iterator it) {
        while (it.hasNext()) {
            super.mo134910a(it.next());
        }
        return this;
    }

    public C41098d(int i) {
        super(4);
    }
}
