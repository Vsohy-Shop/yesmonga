package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.t */
public final class C30213t extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    public final /* synthetic */ zzbc f72210a;

    public C30213t(zzbc zzbc) {
        this.f72210a = zzbc;
    }

    public final void clear() {
        this.f72210a.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map l = this.f72210a.mo85430l();
        if (l != null) {
            return l.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d = this.f72210a.mo85438s(entry.getKey());
            if (d == -1 || !C30272xa.m121934a(this.f72210a.f72397d[d], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        zzbc zzbc = this.f72210a;
        Map l = zzbc.mo85430l();
        if (l != null) {
            return l.entrySet().iterator();
        }
        return new C30189r(zzbc);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l = this.f72210a.mo85430l();
        if (l != null) {
            return l.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f72210a.mo85435q()) {
            return false;
        }
        int c = this.f72210a.mo85436r();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object h = this.f72210a.f72394a;
        zzbc zzbc = this.f72210a;
        int b = C29985a0.m121573b(key, value, c, h, zzbc.f72395b, zzbc.f72396c, zzbc.f72397d);
        if (b == -1) {
            return false;
        }
        this.f72210a.mo85433p(b, c);
        zzbc zzbc2 = this.f72210a;
        zzbc2.f72399f = zzbc2.f72399f - 1;
        this.f72210a.mo85431n();
        return true;
    }

    public final int size() {
        return this.f72210a.size();
    }
}
