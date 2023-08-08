package com.contentsquare.android.sdk;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.lf */
public class C14510lf implements C14260cg {

    /* renamed from: a */
    public final List<C14260cg> f35897a = Collections.singletonList(new C14611p6());

    /* renamed from: a */
    public boolean mo34888a(View view, View view2) {
        for (C14260cg a : this.f35897a) {
            if (a.mo34888a(view, view2)) {
                return true;
            }
        }
        return false;
    }
}
