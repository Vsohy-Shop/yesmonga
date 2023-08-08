package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.w */
public final class C30249w extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzbc f72293a;

    public C30249w(zzbc zzbc) {
        this.f72293a = zzbc;
    }

    public final void clear() {
        this.f72293a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f72293a.containsKey(obj);
    }

    public final Iterator iterator() {
        zzbc zzbc = this.f72293a;
        Map l = zzbc.mo85430l();
        if (l != null) {
            return l.keySet().iterator();
        }
        return new C30177q(zzbc);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l = this.f72293a.mo85430l();
        if (l != null) {
            return l.keySet().remove(obj);
        }
        if (this.f72293a.mo85441u(obj) == zzbc.f72393x) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.f72293a.size();
    }
}
