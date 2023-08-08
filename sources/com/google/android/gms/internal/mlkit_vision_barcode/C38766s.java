package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.s */
public final class C38766s extends C38851z0 {

    /* renamed from: a */
    public final /* synthetic */ C38790u f98143a;

    public C38766s(C38790u uVar) {
        this.f98143a = uVar;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f98143a.f98186d.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final Map mo122495e() {
        return this.f98143a;
    }

    public final Iterator<Map.Entry> iterator() {
        return new C38778t(this.f98143a);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzbe.m160245l(this.f98143a.f98187e, entry.getKey());
        return true;
    }
}
