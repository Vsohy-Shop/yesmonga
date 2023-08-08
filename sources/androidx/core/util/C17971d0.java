package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10968o;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.d0 */
public final class C17971d0 {

    /* renamed from: androidx.core.util.d0$a */
    public static final class C17972a extends C10953k0 {

        /* renamed from: a */
        public int f46458a;

        /* renamed from: b */
        public final /* synthetic */ SparseBooleanArray f46459b;

        public C17972a(SparseBooleanArray sparseBooleanArray) {
            this.f46459b = sparseBooleanArray;
        }

        /* renamed from: c */
        public int mo6374c() {
            SparseBooleanArray sparseBooleanArray = this.f46459b;
            int i = this.f46458a;
            this.f46458a = i + 1;
            return sparseBooleanArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo52434d() {
            return this.f46458a;
        }

        /* renamed from: e */
        public final void mo52435e(int i) {
            this.f46458a = i;
        }

        public boolean hasNext() {
            return this.f46458a < this.f46459b.size();
        }
    }

    /* renamed from: androidx.core.util.d0$b */
    public static final class C17973b extends C10968o {

        /* renamed from: a */
        public int f46460a;

        /* renamed from: b */
        public final /* synthetic */ SparseBooleanArray f46461b;

        public C17973b(SparseBooleanArray sparseBooleanArray) {
            this.f46461b = sparseBooleanArray;
        }

        /* renamed from: c */
        public boolean mo22368c() {
            SparseBooleanArray sparseBooleanArray = this.f46461b;
            int i = this.f46460a;
            this.f46460a = i + 1;
            return sparseBooleanArray.valueAt(i);
        }

        /* renamed from: d */
        public final int mo52437d() {
            return this.f46460a;
        }

        /* renamed from: e */
        public final void mo52438e(int i) {
            this.f46460a = i;
        }

        public boolean hasNext() {
            return this.f46460a < this.f46461b.size();
        }
    }

    /* renamed from: a */
    public static final boolean m81640a(@C12579k SparseBooleanArray sparseBooleanArray, int i) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m81641b(@C12579k SparseBooleanArray sparseBooleanArray, int i) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m81642c(@C12579k SparseBooleanArray sparseBooleanArray, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.indexOfValue(z) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final void m81643d(@C12579k SparseBooleanArray sparseBooleanArray, @C12579k C11304p<? super Integer, ? super Boolean, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    /* renamed from: e */
    public static final boolean m81644e(@C12579k SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return sparseBooleanArray.get(i, z);
    }

    /* renamed from: f */
    public static final boolean m81645f(@C12579k SparseBooleanArray sparseBooleanArray, int i, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return aVar.invoke().booleanValue();
    }

    /* renamed from: g */
    public static final int m81646g(@C12579k SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return sparseBooleanArray.size();
    }

    /* renamed from: h */
    public static final boolean m81647h(@C12579k SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m81648i(@C12579k SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: j */
    public static final C10953k0 m81649j(@C12579k SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return new C17972a(sparseBooleanArray);
    }

    @C12579k
    /* renamed from: k */
    public static final SparseBooleanArray m81650k(@C12579k SparseBooleanArray sparseBooleanArray, @C12579k SparseBooleanArray sparseBooleanArray2) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseBooleanArray2, "other");
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        m81651l(sparseBooleanArray3, sparseBooleanArray);
        m81651l(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    /* renamed from: l */
    public static final void m81651l(@C12579k SparseBooleanArray sparseBooleanArray, @C12579k SparseBooleanArray sparseBooleanArray2) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseBooleanArray2, "other");
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    /* renamed from: m */
    public static final boolean m81652m(@C12579k SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    /* renamed from: n */
    public static final void m81653n(@C12579k SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        sparseBooleanArray.put(i, z);
    }

    @C12579k
    /* renamed from: o */
    public static final C10968o m81654o(@C12579k SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<this>");
        return new C17973b(sparseBooleanArray);
    }
}
