package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.a0 */
public class C38534a0 extends AbstractCollection {

    /* renamed from: a */
    public final Object f97680a;

    /* renamed from: b */
    public Collection f97681b;
    @CheckForNull

    /* renamed from: c */
    public final C38534a0 f97682c;
    @CheckForNull

    /* renamed from: d */
    public final Collection f97683d;

    /* renamed from: e */
    public final /* synthetic */ zzbe f97684e;

    public C38534a0(zzbe zzbe, Object obj, @CheckForNull Collection collection, C38534a0 a0Var) {
        Collection collection2;
        this.f97684e = zzbe;
        this.f97680a = obj;
        this.f97681b = collection;
        this.f97682c = a0Var;
        if (a0Var == null) {
            collection2 = null;
        } else {
            collection2 = a0Var.f97681b;
        }
        this.f97683d = collection2;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f97681b.isEmpty();
        boolean add = this.f97681b.add(obj);
        if (add) {
            zzbe zzbe = this.f97684e;
            zzbe.f98383d = zzbe.f98383d + 1;
            if (isEmpty) {
                mo122199e();
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
        boolean addAll = this.f97681b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f97681b.size();
        zzbe zzbe = this.f97684e;
        zzbe.f98383d = zzbe.f98383d + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo122199e();
        return true;
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f97681b.clear();
            zzbe zzbe = this.f97684e;
            zzbe.f98383d = zzbe.f98383d - size;
            mo122201h();
        }
    }

    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.f97681b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        zzb();
        return this.f97681b.containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo122199e() {
        C38534a0 a0Var = this.f97682c;
        if (a0Var != null) {
            a0Var.mo122199e();
        } else {
            this.f97684e.f98382c.put(this.f97680a, this.f97681b);
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f97681b.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo122201h() {
        C38534a0 a0Var = this.f97682c;
        if (a0Var != null) {
            a0Var.mo122201h();
        } else if (this.f97681b.isEmpty()) {
            this.f97684e.f98382c.remove(this.f97680a);
        }
    }

    public final int hashCode() {
        zzb();
        return this.f97681b.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new C38850z(this);
    }

    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.f97681b.remove(obj);
        if (remove) {
            zzbe zzbe = this.f97684e;
            zzbe.f98383d = zzbe.f98383d - 1;
            mo122201h();
        }
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f97681b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f97681b.size();
            zzbe zzbe = this.f97684e;
            zzbe.f98383d = zzbe.f98383d + (size2 - size);
            mo122201h();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f97681b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f97681b.size();
            zzbe zzbe = this.f97684e;
            zzbe.f98383d = zzbe.f98383d + (size2 - size);
            mo122201h();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f97681b.size();
    }

    public final String toString() {
        zzb();
        return this.f97681b.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        C38534a0 a0Var = this.f97682c;
        if (a0Var != null) {
            a0Var.zzb();
            if (this.f97682c.f97681b != this.f97683d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f97681b.isEmpty() && (collection = (Collection) this.f97684e.f98382c.get(this.f97680a)) != null) {
            this.f97681b = collection;
        }
    }
}
