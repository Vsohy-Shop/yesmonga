package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.i0 */
public final class C38638i0 extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    public final /* synthetic */ zzbs f97914a;

    public C38638i0(zzbs zzbs) {
        this.f97914a = zzbs;
    }

    public final void clear() {
        this.f97914a.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map l = this.f97914a.mo122612l();
        if (l != null) {
            return l.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d = this.f97914a.mo122620s(entry.getKey());
            if (d == -1 || !C38676l.m160047a(this.f97914a.f98388d[d], entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        zzbs zzbs = this.f97914a;
        Map l = zzbs.mo122612l();
        if (l != null) {
            return l.entrySet().iterator();
        }
        return new C38612g0(zzbs);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l = this.f97914a.mo122612l();
        if (l != null) {
            return l.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f97914a.mo122617q()) {
            return false;
        }
        int c = this.f97914a.mo122618r();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object h = this.f97914a.f98385a;
        zzbs zzbs = this.f97914a;
        int b = C38716o0.m160084b(key, value, c, h, zzbs.f98386b, zzbs.f98387c, zzbs.f98388d);
        if (b == -1) {
            return false;
        }
        this.f97914a.mo122615p(b, c);
        zzbs zzbs2 = this.f97914a;
        zzbs2.f98390f = zzbs2.f98390f - 1;
        this.f97914a.mo122613n();
        return true;
    }

    public final int size() {
        return this.f97914a.size();
    }
}
