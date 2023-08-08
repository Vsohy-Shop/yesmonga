package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.w0 */
public abstract class C1580w0<C> {

    /* renamed from: a */
    public Set<C> f4495a = new HashSet();

    /* renamed from: a */
    public void mo5542a(@C0359n0 List<C> list) {
        this.f4495a.addAll(list);
    }

    @C0359n0
    /* renamed from: b */
    public abstract C1580w0<C> clone();

    @C0359n0
    /* renamed from: c */
    public List<C> mo5543c() {
        return Collections.unmodifiableList(new ArrayList(this.f4495a));
    }
}
