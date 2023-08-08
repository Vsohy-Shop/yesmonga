package androidx.compose.runtime.collection;

import androidx.compose.runtime.C8407b;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nIdentityScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,315:1\n236#1,5:321\n241#1,17:342\n236#1,22:359\n61#1:381\n61#1:382\n61#1:383\n105#2,5:316\n146#2,16:326\n*S KotlinDebug\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n*L\n220#1:321,5\n220#1:342,17\n230#1:359,22\n270#1:381\n292#1:382\n302#1:383\n91#1:316,5\n221#1:326,16\n*E\n"})
/* renamed from: androidx.compose.runtime.collection.e */
public final class C8421e<T> {
    @C12579k

    /* renamed from: a */
    public int[] f22777a;
    @C12579k

    /* renamed from: b */
    public Object[] f22778b;
    @C12579k

    /* renamed from: c */
    public C8419d<T>[] f22779c;

    /* renamed from: d */
    public int f22780d;

    public C8421e() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f22777a = iArr;
        this.f22778b = new Object[50];
        this.f22779c = new C8419d[50];
    }

    @C11532s0
    /* renamed from: k */
    public static /* synthetic */ void m30307k() {
    }

    @C11532s0
    /* renamed from: m */
    public static /* synthetic */ void m30308m() {
    }

    @C11532s0
    /* renamed from: o */
    public static /* synthetic */ void m30309o() {
    }

    @C11532s0
    /* renamed from: q */
    public static /* synthetic */ void m30310q() {
    }

    /* renamed from: A */
    public final Object mo15404A(int i) {
        Object obj = this.f22778b[this.f22777a[i]];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    /* renamed from: c */
    public final boolean mo15405c(@C12579k Object obj, @C12579k T t) {
        Intrinsics.checkNotNullParameter(obj, "value");
        Intrinsics.checkNotNullParameter(t, "scope");
        return mo15411i(obj).add(t);
    }

    /* renamed from: d */
    public final void mo15406d() {
        int length = this.f22779c.length;
        for (int i = 0; i < length; i++) {
            C8419d<T> dVar = this.f22779c[i];
            if (dVar != null) {
                dVar.clear();
            }
            this.f22777a[i] = i;
            this.f22778b[i] = null;
        }
        this.f22780d = 0;
    }

    /* renamed from: e */
    public final boolean mo15407e(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "element");
        if (mo15408f(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo15408f(Object obj) {
        int b = C8407b.m30216b(obj);
        int i = this.f22780d - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f22778b[this.f22777a[i3]];
            Intrinsics.checkNotNull(obj2);
            int b2 = C8407b.m30216b(obj2);
            if (b2 < b) {
                i2 = i3 + 1;
            } else if (b2 > b) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return mo15409g(i3, obj, b);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: g */
    public final int mo15409g(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f22778b[this.f22777a[i3]];
            Intrinsics.checkNotNull(obj2);
            if (obj2 == obj) {
                return i3;
            }
            if (C8407b.m30216b(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f22780d;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f22780d;
                break;
            }
            Object obj3 = this.f22778b[this.f22777a[i4]];
            Intrinsics.checkNotNull(obj3);
            if (obj3 == obj) {
                return i4;
            }
            if (C8407b.m30216b(obj3) != i2) {
                break;
            }
            i4++;
        }
        return -(i4 + 1);
    }

    /* renamed from: h */
    public final void mo15410h(@C12579k Object obj, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(obj, "value");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int a = mo15408f(obj);
        if (a >= 0) {
            C8419d b = mo15420v(a);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                lVar.invoke(b.get(i));
            }
        }
    }

    /* renamed from: i */
    public final C8419d<T> mo15411i(Object obj) {
        int i;
        if (this.f22780d > 0) {
            i = mo15408f(obj);
            if (i >= 0) {
                return mo15420v(i);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f22780d;
        int[] iArr = this.f22777a;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.f22778b[i4] = obj;
            C8419d<T> dVar = this.f22779c[i4];
            if (dVar == null) {
                dVar = new C8419d<>();
                this.f22779c[i4] = dVar;
            }
            int i5 = this.f22780d;
            if (i2 < i5) {
                int[] iArr2 = this.f22777a;
                C10956m.m41171a1(iArr2, iArr2, i2 + 1, i2, i5);
            }
            this.f22777a[i2] = i4;
            this.f22780d++;
            return dVar;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.f22779c, length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.f22779c = (C8419d[]) copyOf;
        C8419d<T> dVar2 = new C8419d<>();
        this.f22779c[i3] = dVar2;
        Object[] copyOf2 = Arrays.copyOf(this.f22778b, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.f22778b = copyOf2;
        copyOf2[i3] = obj;
        int[] iArr3 = new int[length];
        int i6 = this.f22780d;
        while (true) {
            i6++;
            if (i6 >= length) {
                break;
            }
            iArr3[i6] = i6;
        }
        int i7 = this.f22780d;
        if (i2 < i7) {
            C10956m.m41171a1(this.f22777a, iArr3, i2 + 1, i2, i7);
        }
        iArr3[i2] = i3;
        if (i2 > 0) {
            C10956m.m41225j1(this.f22777a, iArr3, 0, 0, i2, 6, (Object) null);
        }
        this.f22777a = iArr3;
        this.f22780d++;
        return dVar2;
    }

    @C12579k
    /* renamed from: j */
    public final C8419d<T>[] mo15412j() {
        return this.f22779c;
    }

    /* renamed from: l */
    public final int mo15413l() {
        return this.f22780d;
    }

    @C12579k
    /* renamed from: n */
    public final int[] mo15414n() {
        return this.f22777a;
    }

    @C12579k
    /* renamed from: p */
    public final Object[] mo15415p() {
        return this.f22778b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r4.f22777a[r5];
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15416r(@org.jetbrains.annotations.C12579k java.lang.Object r5, @org.jetbrains.annotations.C12579k T r6) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r5 = r4.mo15408f(r5)
            r0 = 0
            if (r5 < 0) goto L_0x0043
            int[] r1 = r4.f22777a
            r1 = r1[r5]
            androidx.compose.runtime.collection.d<T>[] r2 = r4.f22779c
            r2 = r2[r1]
            if (r2 != 0) goto L_0x001c
            return r0
        L_0x001c:
            boolean r6 = r2.remove(r6)
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0042
            int r0 = r5 + 1
            int r2 = r4.f22780d
            if (r0 >= r2) goto L_0x0031
            int[] r3 = r4.f22777a
            kotlin.collections.C10956m.m41171a1(r3, r3, r5, r0, r2)
        L_0x0031:
            int[] r5 = r4.f22777a
            int r0 = r4.f22780d
            int r2 = r0 + -1
            r5[r2] = r1
            java.lang.Object[] r5 = r4.f22778b
            r2 = 0
            r5[r1] = r2
            int r0 = r0 + -1
            r4.f22780d = r0
        L_0x0042:
            return r6
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.C8421e.mo15416r(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: s */
    public final void mo15417s(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, "scope");
        int l = mo15413l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            int i3 = mo15414n()[i2];
            C8419d dVar = mo15412j()[i3];
            Intrinsics.checkNotNull(dVar);
            dVar.remove(t);
            if (dVar.size() > 0) {
                if (i != i2) {
                    int i4 = mo15414n()[i];
                    mo15414n()[i] = i3;
                    mo15414n()[i2] = i4;
                }
                i++;
            }
        }
        int l2 = mo15413l();
        for (int i5 = i; i5 < l2; i5++) {
            mo15415p()[mo15414n()[i5]] = null;
        }
        mo15422x(i);
    }

    /* renamed from: t */
    public final void mo15418t(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int l = mo15413l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            int i3 = mo15414n()[i2];
            C8419d dVar = mo15412j()[i3];
            Intrinsics.checkNotNull(dVar);
            int size = dVar.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = dVar.mo15398w()[i5];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!lVar.invoke(obj).booleanValue()) {
                    if (i4 != i5) {
                        dVar.mo15398w()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size2 = dVar.size();
            for (int i6 = i4; i6 < size2; i6++) {
                dVar.mo15398w()[i6] = null;
            }
            dVar.mo15377Q(i4);
            if (dVar.size() > 0) {
                if (i != i2) {
                    int i7 = mo15414n()[i];
                    mo15414n()[i] = i3;
                    mo15414n()[i2] = i7;
                }
                i++;
            }
        }
        int l2 = mo15413l();
        for (int i8 = i; i8 < l2; i8++) {
            mo15415p()[mo15414n()[i8]] = null;
        }
        mo15422x(i);
    }

    /* renamed from: u */
    public final void mo15419u(C11300l<? super C8419d<T>, C11079d2> lVar) {
        int l = mo15413l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            int i3 = mo15414n()[i2];
            C8419d dVar = mo15412j()[i3];
            Intrinsics.checkNotNull(dVar);
            lVar.invoke(dVar);
            if (dVar.size() > 0) {
                if (i != i2) {
                    int i4 = mo15414n()[i];
                    mo15414n()[i] = i3;
                    mo15414n()[i2] = i4;
                }
                i++;
            }
        }
        int l2 = mo15413l();
        for (int i5 = i; i5 < l2; i5++) {
            mo15415p()[mo15414n()[i5]] = null;
        }
        mo15422x(i);
    }

    /* renamed from: v */
    public final C8419d<T> mo15420v(int i) {
        C8419d<T> dVar = this.f22779c[this.f22777a[i]];
        Intrinsics.checkNotNull(dVar);
        return dVar;
    }

    /* renamed from: w */
    public final void mo15421w(@C12579k C8419d<T>[] dVarArr) {
        Intrinsics.checkNotNullParameter(dVarArr, "<set-?>");
        this.f22779c = dVarArr;
    }

    /* renamed from: x */
    public final void mo15422x(int i) {
        this.f22780d = i;
    }

    /* renamed from: y */
    public final void mo15423y(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f22777a = iArr;
    }

    /* renamed from: z */
    public final void mo15424z(@C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f22778b = objArr;
    }
}
