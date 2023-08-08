package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.e */
public final class C30033e extends C30142n0 {

    /* renamed from: a */
    public final /* synthetic */ C30057g f71810a;

    public C30033e(C30057g gVar) {
        this.f71810a = gVar;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f71810a.f71868d.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final Map mo85078e() {
        return this.f71810a;
    }

    public final Iterator<Map.Entry> iterator() {
        return new C30045f(this.f71810a);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzao.m121951l(this.f71810a.f71869e, entry.getKey());
        return true;
    }
}
