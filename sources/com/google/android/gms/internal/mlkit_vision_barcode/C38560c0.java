package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.c0 */
public class C38560c0 extends C38534a0 implements List {

    /* renamed from: f */
    public final /* synthetic */ zzbe f97743f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38560c0(zzbe zzbe, Object obj, @CheckForNull List list, C38534a0 a0Var) {
        super(zzbe, obj, list, a0Var);
        this.f97743f = zzbe;
    }

    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f97681b.isEmpty();
        ((List) this.f97681b).add(i, obj);
        zzbe zzbe = this.f97743f;
        zzbe.f98383d = zzbe.f98383d + 1;
        if (isEmpty) {
            mo122199e();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f97681b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f97681b.size();
        zzbe zzbe = this.f97743f;
        zzbe.f98383d = zzbe.f98383d + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        mo122199e();
        return true;
    }

    public final Object get(int i) {
        zzb();
        return ((List) this.f97681b).get(i);
    }

    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f97681b).indexOf(obj);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.f97681b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new C38547b0(this);
    }

    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f97681b).remove(i);
        zzbe zzbe = this.f97743f;
        zzbe.f98383d = zzbe.f98383d - 1;
        mo122201h();
        return remove;
    }

    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f97681b).set(i, obj);
    }

    public final List subList(int i, int i2) {
        zzb();
        zzbe zzbe = this.f97743f;
        Object obj = this.f97680a;
        List subList = ((List) this.f97681b).subList(i, i2);
        C38534a0 a0Var = this.f97682c;
        if (a0Var == null) {
            a0Var = this;
        }
        return zzbe.mo122601i(obj, subList, a0Var);
    }

    public final ListIterator listIterator(int i) {
        zzb();
        return new C38547b0(this, i);
    }
}
