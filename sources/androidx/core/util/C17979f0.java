package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.SparseLongArray;
import androidx.annotation.C0376v0;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10955l0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.util.f0 */
public final class C17979f0 {

    /* renamed from: androidx.core.util.f0$a */
    public static final class C17980a extends C10953k0 {

        /* renamed from: a */
        public int f46466a;

        /* renamed from: b */
        public final /* synthetic */ SparseLongArray f46467b;

        public C17980a(SparseLongArray sparseLongArray) {
            this.f46467b = sparseLongArray;
        }

        /* renamed from: c */
        public int mo6374c() {
            SparseLongArray sparseLongArray = this.f46467b;
            int i = this.f46466a;
            this.f46466a = i + 1;
            return sparseLongArray.keyAt(i);
        }

        /* renamed from: d */
        public final int mo52446d() {
            return this.f46466a;
        }

        /* renamed from: e */
        public final void mo52447e(int i) {
            this.f46466a = i;
        }

        public boolean hasNext() {
            return this.f46466a < this.f46467b.size();
        }
    }

    /* renamed from: androidx.core.util.f0$b */
    public static final class C17981b extends C10955l0 {

        /* renamed from: a */
        public int f46468a;

        /* renamed from: b */
        public final /* synthetic */ SparseLongArray f46469b;

        public C17981b(SparseLongArray sparseLongArray) {
            this.f46469b = sparseLongArray;
        }

        /* renamed from: c */
        public long mo6234c() {
            SparseLongArray sparseLongArray = this.f46469b;
            int i = this.f46468a;
            this.f46468a = i + 1;
            return sparseLongArray.valueAt(i);
        }

        /* renamed from: d */
        public final int mo52449d() {
            return this.f46468a;
        }

        /* renamed from: e */
        public final void mo52450e(int i) {
            this.f46468a = i;
        }

        public boolean hasNext() {
            return this.f46468a < this.f46469b.size();
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: a */
    public static final boolean m81684a(@C12579k SparseLongArray sparseLongArray, int i) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: b */
    public static final boolean m81685b(@C12579k SparseLongArray sparseLongArray, int i) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: c */
    public static final boolean m81686c(@C12579k SparseLongArray sparseLongArray, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.indexOfValue(j) >= 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: d */
    public static final void m81687d(@C12579k SparseLongArray sparseLongArray, @C12579k C11304p<? super Integer, ? super Long, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: e */
    public static final long m81688e(@C12579k SparseLongArray sparseLongArray, int i, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return sparseLongArray.get(i, j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: f */
    public static final long m81689f(@C12579k SparseLongArray sparseLongArray, int i, @C12579k C11289a<Long> aVar) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return aVar.invoke().longValue();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: g */
    public static final int m81690g(@C12579k SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return sparseLongArray.size();
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: h */
    public static final boolean m81691h(@C12579k SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: i */
    public static final boolean m81692i(@C12579k SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    @C12579k
    /* renamed from: j */
    public static final C10953k0 m81693j(@C12579k SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return new C17980a(sparseLongArray);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    @C12579k
    /* renamed from: k */
    public static final SparseLongArray m81694k(@C12579k SparseLongArray sparseLongArray, @C12579k SparseLongArray sparseLongArray2) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseLongArray2, "other");
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        m81695l(sparseLongArray3, sparseLongArray);
        m81695l(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: l */
    public static final void m81695l(@C12579k SparseLongArray sparseLongArray, @C12579k SparseLongArray sparseLongArray2) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        Intrinsics.checkNotNullParameter(sparseLongArray2, "other");
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: m */
    public static final boolean m81696m(@C12579k SparseLongArray sparseLongArray, int i, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    /* renamed from: n */
    public static final void m81697n(@C12579k SparseLongArray sparseLongArray, int i, long j) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        sparseLongArray.put(i, j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(18)
    @C12579k
    /* renamed from: o */
    public static final C10955l0 m81698o(@C12579k SparseLongArray sparseLongArray) {
        Intrinsics.checkNotNullParameter(sparseLongArray, "<this>");
        return new C17981b(sparseLongArray);
    }
}
