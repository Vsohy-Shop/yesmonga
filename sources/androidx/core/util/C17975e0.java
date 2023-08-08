package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.e0 */
public final class C17975e0 {

    /* renamed from: androidx.core.util.e0$a */
    public static final class C17976a extends C10953k0 {

        /* renamed from: a */
        public int f46462a;

        /* renamed from: b */
        public final /* synthetic */ SparseIntArray f46463b;

        public C17976a(SparseIntArray sparseIntArray) {
            this.f46463b = sparseIntArray;
        }

        /* renamed from: c */
        public int mo6374c() {
            SparseIntArray sparseIntArray = this.f46463b;
            int i = this.f46462a;
            this.f46462a = i + 1;
            return sparseIntArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo52440d() {
            return this.f46462a;
        }

        /* renamed from: e */
        public final void mo52441e(int i) {
            this.f46462a = i;
        }

        public boolean hasNext() {
            return this.f46462a < this.f46463b.size();
        }
    }

    /* renamed from: androidx.core.util.e0$b */
    public static final class C17977b extends C10953k0 {

        /* renamed from: a */
        public int f46464a;

        /* renamed from: b */
        public final /* synthetic */ SparseIntArray f46465b;

        public C17977b(SparseIntArray sparseIntArray) {
            this.f46465b = sparseIntArray;
        }

        /* renamed from: c */
        public int mo6374c() {
            SparseIntArray sparseIntArray = this.f46465b;
            int i = this.f46464a;
            this.f46464a = i + 1;
            return sparseIntArray.valueAt(i);
        }

        /* renamed from: d */
        public final int mo52443d() {
            return this.f46464a;
        }

        /* renamed from: e */
        public final void mo52444e(int i) {
            this.f46464a = i;
        }

        public boolean hasNext() {
            return this.f46464a < this.f46465b.size();
        }
    }

    /* renamed from: a */
    public static final boolean m81662a(@C12579k SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m81663b(@C12579k SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m81664c(@C12579k SparseIntArray sparseIntArray, int i) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.indexOfValue(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final void m81665d(@C12579k SparseIntArray sparseIntArray, @C12579k C11304p<? super Integer, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    /* renamed from: e */
    public static final int m81666e(@C12579k SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.get(i, i2);
    }

    /* renamed from: f */
    public static final int m81667f(@C12579k SparseIntArray sparseIntArray, int i, @C12579k C11289a<Integer> aVar) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return aVar.invoke().intValue();
    }

    /* renamed from: g */
    public static final int m81668g(@C12579k SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    /* renamed from: h */
    public static final boolean m81669h(@C12579k SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m81670i(@C12579k SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: j */
    public static final C10953k0 m81671j(@C12579k SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return new C17976a(sparseIntArray);
    }

    @C12579k
    /* renamed from: k */
    public static final SparseIntArray m81672k(@C12579k SparseIntArray sparseIntArray, @C12579k SparseIntArray sparseIntArray2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseIntArray2, "other");
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        m81673l(sparseIntArray3, sparseIntArray);
        m81673l(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    /* renamed from: l */
    public static final void m81673l(@C12579k SparseIntArray sparseIntArray, @C12579k SparseIntArray sparseIntArray2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseIntArray2, "other");
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    /* renamed from: m */
    public static final boolean m81674m(@C12579k SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 || i2 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    /* renamed from: n */
    public static final void m81675n(@C12579k SparseIntArray sparseIntArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        sparseIntArray.put(i, i2);
    }

    @C12579k
    /* renamed from: o */
    public static final C10953k0 m81676o(@C12579k SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return new C17977b(sparseIntArray);
    }
}
