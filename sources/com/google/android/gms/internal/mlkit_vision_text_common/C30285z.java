package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.z */
public final class C30285z extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ zzbc f72370a;

    public C30285z(zzbc zzbc) {
        this.f72370a = zzbc;
    }

    public final void clear() {
        this.f72370a.clear();
    }

    public final Iterator iterator() {
        zzbc zzbc = this.f72370a;
        Map l = zzbc.mo85430l();
        if (l != null) {
            return l.values().iterator();
        }
        return new C30201s(zzbc);
    }

    public final int size() {
        return this.f72370a.size();
    }
}
