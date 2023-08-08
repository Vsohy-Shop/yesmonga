package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.e0 */
public final class C41101e0 {

    /* renamed from: a */
    public final C41120v f104395a;

    /* renamed from: b */
    public final boolean f104396b;

    /* renamed from: c */
    public final C41095b0 f104397c;

    public C41101e0(C41095b0 b0Var, boolean z, C41120v vVar, int i, byte[] bArr) {
        this.f104397c = b0Var;
        this.f104396b = z;
        this.f104395a = vVar;
    }

    /* renamed from: c */
    public static C41101e0 m166971c(C41120v vVar) {
        return new C41101e0(new C41095b0(vVar), false, C41119u.f104408b, Integer.MAX_VALUE, (byte[]) null);
    }

    /* renamed from: b */
    public final C41101e0 mo134918b() {
        return new C41101e0(this.f104397c, true, this.f104395a, Integer.MAX_VALUE, (byte[]) null);
    }

    /* renamed from: d */
    public final Iterable mo134919d(CharSequence charSequence) {
        return new C41097c0(this, charSequence);
    }

    /* renamed from: f */
    public final List mo134920f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h = mo134921h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add((String) h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public final Iterator mo134921h(CharSequence charSequence) {
        return new C41093a0(this.f104397c, this, charSequence);
    }
}
