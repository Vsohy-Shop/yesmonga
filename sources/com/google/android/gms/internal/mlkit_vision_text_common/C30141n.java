package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.n */
public class C30141n extends C30117l implements List {

    /* renamed from: f */
    public final /* synthetic */ zzao f72033f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30141n(zzao zzao, Object obj, @CheckForNull List list, C30117l lVar) {
        super(zzao, obj, list, lVar);
        this.f72033f = zzao;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f71983b.isEmpty();
        ((List) this.f71983b).add(i, obj);
        zzao zzao = this.f72033f;
        zzao.f72392d = zzao.f72392d + 1;
        if (isEmpty) {
            mo85201e();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f71983b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f71983b.size();
        zzao zzao = this.f72033f;
        zzao.f72392d = zzao.f72392d + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo85201e();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f71983b).get(i);
    }

    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f71983b).indexOf(obj);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f71983b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new C30129m(this);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f71983b).remove(i);
        zzao zzao = this.f72033f;
        zzao.f72392d = zzao.f72392d - 1;
        mo85203h();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f71983b).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        zzao zzao = this.f72033f;
        Object obj = this.f71982a;
        List subList = ((List) this.f71983b).subList(i, i2);
        C30117l lVar = this.f71984c;
        if (lVar == null) {
            lVar = this;
        }
        return zzao.mo85419i(obj, subList, lVar);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new C30129m(this, i);
    }
}
