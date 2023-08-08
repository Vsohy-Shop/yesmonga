package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C8567o(parameters = 0)
@C11363r0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n1182#2:217\n1161#2,2:218\n523#3:220\n523#3:221\n523#3:222\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n98#1:217\n98#1:218,2\n150#1:220\n152#1:221\n169#1:222\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.t */
public final class C2567t<T> implements C2539c<T> {

    /* renamed from: d */
    public static final int f6761d = 8;
    @C12579k

    /* renamed from: a */
    public final C8423g<C2539c.C2540a<T>> f6762a = new C8423g<>(new C2539c.C2540a[16], 0);

    /* renamed from: b */
    public int f6763b;
    @C12580l

    /* renamed from: c */
    public C2539c.C2540a<? extends T> f6764c;

    /* renamed from: b */
    public void mo8726b(int i, int i2, @C12579k C11300l<? super C2539c.C2540a<? extends T>, C11079d2> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        mo8814d(i);
        mo8814d(i2);
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int a = C2541d.m11396b(this.f6762a, i);
            int b = ((C2539c.C2540a) this.f6762a.mo15462d0()[a]).mo8730b();
            while (b <= i2) {
                C2539c.C2540a aVar = (C2539c.C2540a) this.f6762a.mo15462d0()[a];
                lVar.invoke(aVar);
                b += aVar.mo8729a();
                a++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
    }

    /* renamed from: c */
    public final void mo8813c(int i, T t) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
        } else if (i != 0) {
            C2539c.C2540a aVar = new C2539c.C2540a(getSize(), i, t);
            this.f6763b = getSize() + i;
            this.f6762a.mo15463e(aVar);
        }
    }

    /* renamed from: d */
    public final void mo8814d(int i) {
        boolean z = false;
        if (i >= 0 && i < getSize()) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + getSize());
        }
    }

    /* renamed from: e */
    public final boolean mo8815e(C2539c.C2540a<? extends T> aVar, int i) {
        return i < aVar.mo8730b() + aVar.mo8729a() && aVar.mo8730b() <= i;
    }

    /* renamed from: f */
    public final C2539c.C2540a<T> mo8816f(int i) {
        C2539c.C2540a<? extends T> aVar = this.f6764c;
        if (aVar != null && mo8815e(aVar, i)) {
            return aVar;
        }
        C8423g<C2539c.C2540a<T>> gVar = this.f6762a;
        C2539c.C2540a<? extends T> aVar2 = (C2539c.C2540a) gVar.mo15462d0()[C2541d.m11396b(gVar, i)];
        this.f6764c = aVar2;
        return aVar2;
    }

    @C12579k
    public C2539c.C2540a<T> get(int i) {
        mo8814d(i);
        return mo8816f(i);
    }

    public int getSize() {
        return this.f6763b;
    }
}
