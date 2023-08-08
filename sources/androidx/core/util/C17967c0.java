package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.c0 */
public final class C17967c0 {

    /* renamed from: androidx.core.util.c0$a */
    public static final class C17968a extends C10953k0 {

        /* renamed from: a */
        public int f46454a;

        /* renamed from: b */
        public final /* synthetic */ SparseArray<T> f46455b;

        public C17968a(SparseArray<T> sparseArray) {
            this.f46455b = sparseArray;
        }

        /* renamed from: c */
        public int mo6374c() {
            SparseArray<T> sparseArray = this.f46455b;
            int i = this.f46454a;
            this.f46454a = i + 1;
            return sparseArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo52426d() {
            return this.f46454a;
        }

        /* renamed from: e */
        public final void mo52427e(int i) {
            this.f46454a = i;
        }

        public boolean hasNext() {
            return this.f46454a < this.f46455b.size();
        }
    }

    /* renamed from: androidx.core.util.c0$b */
    public static final class C17969b implements Iterator<T>, C11345a {

        /* renamed from: a */
        public int f46456a;

        /* renamed from: b */
        public final /* synthetic */ SparseArray<T> f46457b;

        public C17969b(SparseArray<T> sparseArray) {
            this.f46457b = sparseArray;
        }

        /* renamed from: b */
        public final int mo52429b() {
            return this.f46456a;
        }

        /* renamed from: c */
        public final void mo52430c(int i) {
            this.f46456a = i;
        }

        public boolean hasNext() {
            return this.f46456a < this.f46457b.size();
        }

        public T next() {
            SparseArray<T> sparseArray = this.f46457b;
            int i = this.f46456a;
            this.f46456a = i + 1;
            return sparseArray.valueAt(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final <T> boolean m81620a(@C12579k SparseArray<T> sparseArray, int i) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final <T> boolean m81621b(@C12579k SparseArray<T> sparseArray, int i) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final <T> boolean m81622c(@C12579k SparseArray<T> sparseArray, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final <T> void m81623d(@C12579k SparseArray<T> sparseArray, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    /* renamed from: e */
    public static final <T> T m81624e(@C12579k SparseArray<T> sparseArray, int i, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        T t2 = sparseArray.get(i);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    /* renamed from: f */
    public static final <T> T m81625f(@C12579k SparseArray<T> sparseArray, int i, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        T t = sparseArray.get(i);
        if (t == null) {
            return aVar.invoke();
        }
        return t;
    }

    /* renamed from: g */
    public static final <T> int m81626g(@C12579k SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size();
    }

    /* renamed from: h */
    public static final <T> boolean m81627h(@C12579k SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final <T> boolean m81628i(@C12579k SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        if (sparseArray.size() != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: j */
    public static final <T> C10953k0 m81629j(@C12579k SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new C17968a(sparseArray);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> SparseArray<T> m81630k(@C12579k SparseArray<T> sparseArray, @C12579k SparseArray<T> sparseArray2) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseArray2, "other");
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        m81631l(sparseArray3, sparseArray);
        m81631l(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    /* renamed from: l */
    public static final <T> void m81631l(@C12579k SparseArray<T> sparseArray, @C12579k SparseArray<T> sparseArray2) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseArray2, "other");
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    /* renamed from: m */
    public static final <T> boolean m81632m(@C12579k SparseArray<T> sparseArray, int i, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !Intrinsics.areEqual((Object) t, (Object) sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    /* renamed from: n */
    public static final <T> void m81633n(@C12579k SparseArray<T> sparseArray, int i, T t) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        sparseArray.put(i, t);
    }

    @C12579k
    /* renamed from: o */
    public static final <T> Iterator<T> m81634o(@C12579k SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new C17969b(sparseArray);
    }
}
