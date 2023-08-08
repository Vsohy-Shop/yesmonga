package androidx.compose.p004ui.text.caches;

import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.C10956m;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.caches.c */
public final class C16154c<K, V> {
    @C12579k

    /* renamed from: a */
    public int[] f40165a;
    @C12579k

    /* renamed from: b */
    public Object[] f40166b;

    /* renamed from: c */
    public int f40167c;

    @C11315i
    public C16154c() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: y */
    public static /* synthetic */ void m72701y() {
    }

    /* renamed from: a */
    public final void mo46643a() {
        if (this.f40167c > 0) {
            this.f40165a = C16152a.f40153a;
            this.f40166b = C16152a.f40154b;
            this.f40167c = 0;
        }
        if (this.f40167c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public final boolean mo46644b(K k) {
        return mo46653i(k) >= 0;
    }

    /* renamed from: c */
    public final boolean mo46645c(V v) {
        return mo46655k(v) >= 0;
    }

    /* renamed from: d */
    public final void mo46646d(int i) {
        int i2 = this.f40167c;
        int[] iArr = this.f40165a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f40165a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40166b, i << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f40166b = copyOf2;
        }
        if (this.f40167c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @C12580l
    /* renamed from: e */
    public final V mo46647e(K k) {
        int i = mo46653i(k);
        if (i >= 0) {
            return this.f40166b[(i << 1) + 1];
        }
        return null;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C16154c) {
                C16154c cVar = (C16154c) obj;
                int i = this.f40167c;
                if (i != cVar.f40167c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object m = mo46657m(i2);
                    Object z = mo46670z(i2);
                    Object e = cVar.mo46647e(m);
                    if (z == null) {
                        if (e != null || !cVar.mo46644b(m)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(z, e)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f40167c != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.f40167c;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object m2 = mo46657m(i4);
                    Object z2 = mo46670z(i4);
                    Object obj2 = ((Map) obj).get(m2);
                    if (z2 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(m2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(z2, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final V mo46649f(K k, V v) {
        int i = mo46653i(k);
        if (i >= 0) {
            return this.f40166b[(i << 1) + 1];
        }
        return v;
    }

    /* renamed from: g */
    public final int mo46650g() {
        return this.f40167c;
    }

    /* renamed from: h */
    public final int mo46651h(@C12579k Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "key");
        int i2 = this.f40167c;
        if (i2 == 0) {
            return -1;
        }
        int a = C16152a.m72680a(this.f40165a, i2, i);
        if (a < 0 || Intrinsics.areEqual(obj, this.f40166b[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f40165a[i3] == i) {
            if (Intrinsics.areEqual(obj, this.f40166b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f40165a[i4] == i) {
            if (Intrinsics.areEqual(obj, this.f40166b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f40165a;
        Object[] objArr = this.f40166b;
        int i2 = this.f40167c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public final int mo46653i(@C12580l Object obj) {
        return obj == null ? mo46654j() : mo46651h(obj, obj.hashCode());
    }

    /* renamed from: j */
    public final int mo46654j() {
        int i = this.f40167c;
        if (i == 0) {
            return -1;
        }
        int a = C16152a.m72680a(this.f40165a, i, 0);
        if (a < 0 || this.f40166b[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f40165a[i2] == 0) {
            if (this.f40166b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f40165a[i3] == 0) {
            if (this.f40166b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: k */
    public final int mo46655k(V v) {
        int i = this.f40167c << 1;
        Object[] objArr = this.f40166b;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.areEqual((Object) v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public final boolean mo46656l() {
        return this.f40167c <= 0;
    }

    /* renamed from: m */
    public final K mo46657m(int i) {
        return this.f40166b[i << 1];
    }

    @C12580l
    /* renamed from: n */
    public final V mo46658n(K k, V v) {
        int i;
        int i2;
        int i3 = this.f40167c;
        if (k == null) {
            i2 = mo46654j();
            i = 0;
        } else {
            i = k.hashCode();
            i2 = mo46651h(k, i);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f40166b;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f40165a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f40165a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40166b, i6 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f40166b = copyOf2;
            if (i3 != this.f40167c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f40165a;
            int i7 = i5 + 1;
            C10956m.m41171a1(iArr2, iArr2, i7, i5, i3);
            Object[] objArr = this.f40166b;
            C10956m.m41183c1(objArr, objArr, i7 << 1, i5 << 1, this.f40167c << 1);
        }
        int i8 = this.f40167c;
        if (i3 == i8) {
            int[] iArr3 = this.f40165a;
            if (i5 < iArr3.length) {
                iArr3[i5] = i;
                Object[] objArr2 = this.f40166b;
                int i9 = i5 << 1;
                objArr2[i9] = k;
                objArr2[i9 + 1] = v;
                this.f40167c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: o */
    public final void mo46659o(@C12579k C16154c<? extends K, ? extends V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "array");
        int i = cVar.f40167c;
        mo46646d(this.f40167c + i);
        if (this.f40167c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                mo46658n(cVar.mo46657m(i2), cVar.mo46670z(i2));
            }
        } else if (i > 0) {
            C10956m.m41171a1(cVar.f40165a, this.f40165a, 0, 0, i);
            C10956m.m41183c1(cVar.f40166b, this.f40166b, 0, 0, i << 1);
            this.f40167c = i;
        }
    }

    @C12580l
    /* renamed from: p */
    public final V mo46660p(K k, V v) {
        V e = mo46647e(k);
        if (e == null) {
            return mo46658n(k, v);
        }
        return e;
    }

    @C12580l
    /* renamed from: q */
    public final V mo46661q(K k) {
        int i = mo46653i(k);
        if (i >= 0) {
            return mo46663s(i);
        }
        return null;
    }

    /* renamed from: r */
    public final boolean mo46662r(K k, V v) {
        int i = mo46653i(k);
        if (i < 0 || !Intrinsics.areEqual((Object) v, mo46670z(i))) {
            return false;
        }
        mo46663s(i);
        return true;
    }

    @C12580l
    /* renamed from: s */
    public final V mo46663s(int i) {
        V[] vArr = this.f40166b;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f40167c;
        if (i3 <= 1) {
            mo46643a();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f40165a;
            int i5 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 + 1;
                    C10956m.m41171a1(iArr, iArr, i, i6, i7);
                    Object[] objArr = this.f40166b;
                    C10956m.m41183c1(objArr, objArr, i2, i6 << 1, i7 << 1);
                }
                Object[] objArr2 = this.f40166b;
                int i8 = i4 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                int[] iArr2 = new int[i5];
                this.f40165a = iArr2;
                this.f40166b = new Object[(i5 << 1)];
                if (i > 0) {
                    C10956m.m41171a1(iArr, iArr2, 0, 0, i);
                    C10956m.m41183c1(vArr, this.f40166b, 0, 0, i2);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 + 1;
                    C10956m.m41171a1(iArr, this.f40165a, i, i9, i10);
                    C10956m.m41183c1(vArr, this.f40166b, i2, i9 << 1, i10 << 1);
                }
            }
            if (i3 == this.f40167c) {
                this.f40167c = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    @C12580l
    /* renamed from: t */
    public final V mo46664t(K k, V v) {
        int i = mo46653i(k);
        if (i >= 0) {
            return mo46667v(i, v);
        }
        return null;
    }

    @C12579k
    public String toString() {
        if (mo46656l()) {
            return C28819e.f70617a;
        }
        StringBuilder sb = new StringBuilder(this.f40167c * 28);
        sb.append(C12361b.f30258i);
        int i = this.f40167c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object m = mo46657m(i2);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object z = mo46670z(i2);
            if (z != this) {
                sb.append(z);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C12361b.f30259j);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final boolean mo46666u(K k, V v, V v2) {
        int i = mo46653i(k);
        if (i < 0 || mo46670z(i) != v) {
            return false;
        }
        mo46667v(i, v2);
        return true;
    }

    /* renamed from: v */
    public final V mo46667v(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f40166b;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: w */
    public final void mo46668w(int i) {
        this.f40167c = i;
    }

    @C11314h(name = "size")
    /* renamed from: x */
    public final int mo46669x() {
        return this.f40167c;
    }

    /* renamed from: z */
    public final V mo46670z(int i) {
        return this.f40166b[(i << 1) + 1];
    }

    @C11315i
    public C16154c(int i) {
        if (i == 0) {
            this.f40165a = C16152a.f40153a;
            this.f40166b = C16152a.f40154b;
        } else {
            this.f40165a = new int[i];
            this.f40166b = new Object[(i << 1)];
        }
        this.f40167c = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16154c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public C16154c(@C12580l C16154c<K, V> cVar) {
        this(0, 1, (DefaultConstructorMarker) null);
        if (cVar != null) {
            mo46659o(cVar);
        }
    }
}
