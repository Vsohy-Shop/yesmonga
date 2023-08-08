package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.l */
public class C30117l extends AbstractCollection {

    /* renamed from: a */
    public final Object f71982a;

    /* renamed from: b */
    public Collection f71983b;
    @CheckForNull

    /* renamed from: c */
    public final C30117l f71984c;
    @CheckForNull

    /* renamed from: d */
    public final Collection f71985d;

    /* renamed from: e */
    public final /* synthetic */ zzao f71986e;

    public C30117l(zzao zzao, Object obj, @CheckForNull Collection collection, C30117l lVar) {
        Collection collection2;
        this.f71986e = zzao;
        this.f71982a = obj;
        this.f71983b = collection;
        this.f71984c = lVar;
        if (lVar == null) {
            collection2 = null;
        } else {
            collection2 = lVar.f71983b;
        }
        this.f71985d = collection2;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f71983b.isEmpty();
        boolean add = this.f71983b.add(obj);
        if (add) {
            zzao zzao = this.f71986e;
            zzao.f72392d = zzao.f72392d + 1;
            if (isEmpty) {
                mo85201e();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f71983b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f71983b.size();
        zzao zzao = this.f71986e;
        zzao.f72392d = zzao.f72392d + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo85201e();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f71983b.clear();
            zzao zzao = this.f71986e;
            zzao.f72392d = zzao.f72392d - size;
            mo85203h();
        }
    }

    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.f71983b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f71983b.containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo85201e() {
        C30117l lVar = this.f71984c;
        if (lVar != null) {
            lVar.mo85201e();
        } else {
            this.f71986e.f72391c.put(this.f71982a, this.f71983b);
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f71983b.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo85203h() {
        C30117l lVar = this.f71984c;
        if (lVar != null) {
            lVar.mo85203h();
        } else if (this.f71983b.isEmpty()) {
            this.f71986e.f72391c.remove(this.f71982a);
        }
    }

    public final int hashCode() {
        zzb();
        return this.f71983b.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new C30105k(this);
    }

    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.f71983b.remove(obj);
        if (remove) {
            zzao zzao = this.f71986e;
            zzao.f72392d = zzao.f72392d - 1;
            mo85203h();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f71983b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f71983b.size();
            zzao zzao = this.f71986e;
            zzao.f72392d = zzao.f72392d + (size2 - size);
            mo85203h();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f71983b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f71983b.size();
            zzao zzao = this.f71986e;
            zzao.f72392d = zzao.f72392d + (size2 - size);
            mo85203h();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f71983b.size();
    }

    public final String toString() {
        zzb();
        return this.f71983b.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        C30117l lVar = this.f71984c;
        if (lVar != null) {
            lVar.zzb();
            if (this.f71984c.f71983b != this.f71985d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f71983b.isEmpty() && (collection = (Collection) this.f71986e.f72391c.get(this.f71982a)) != null) {
            this.f71983b = collection;
        }
    }
}
