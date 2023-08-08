package androidx.compose.runtime.collection;

import androidx.compose.runtime.C8407b;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.collection.b */
public final class C8417b {

    /* renamed from: a */
    public int f22767a;
    @C12579k

    /* renamed from: b */
    public Object[] f22768b = new Object[4];
    @C12579k

    /* renamed from: c */
    public int[] f22769c = new int[4];

    @C11532s0
    /* renamed from: h */
    public static /* synthetic */ void m30257h() {
    }

    @C11532s0
    /* renamed from: j */
    public static /* synthetic */ void m30258j() {
    }

    @C11532s0
    /* renamed from: l */
    public static /* synthetic */ void m30259l() {
    }

    /* renamed from: a */
    public final int mo15343a(@C12579k Object obj, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(obj, "key");
        if (this.f22767a > 0) {
            i2 = mo15345c(obj);
            if (i2 >= 0) {
                int[] iArr = this.f22769c;
                int i3 = iArr[i2];
                iArr[i2] = i;
                return i3;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        int i5 = this.f22767a;
        Object[] objArr = this.f22768b;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            int[] iArr2 = new int[(objArr.length * 2)];
            int i6 = i4 + 1;
            C10956m.m41183c1(objArr, objArr2, i6, i4, i5);
            C10956m.m41171a1(this.f22769c, iArr2, i6, i4, this.f22767a);
            int i7 = i4;
            C10956m.m41237l1(this.f22768b, objArr2, 0, 0, i7, 6, (Object) null);
            C10956m.m41225j1(this.f22769c, iArr2, 0, 0, i7, 6, (Object) null);
            this.f22768b = objArr2;
            this.f22769c = iArr2;
        } else {
            int i8 = i4 + 1;
            C10956m.m41183c1(objArr, objArr, i8, i4, i5);
            int[] iArr3 = this.f22769c;
            C10956m.m41171a1(iArr3, iArr3, i8, i4, this.f22767a);
        }
        this.f22768b[i4] = obj;
        this.f22769c[i4] = i;
        this.f22767a++;
        return -1;
    }

    /* renamed from: b */
    public final boolean mo15344b(@C12579k C11304p<Object, ? super Integer, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int i = mo15350i();
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = mo15349g()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            if (pVar.invoke(obj, Integer.valueOf(mo15351k()[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final int mo15345c(Object obj) {
        int i = this.f22767a - 1;
        int b = C8407b.m30216b(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f22768b[i3];
            int b2 = C8407b.m30216b(obj2);
            if (b2 < b) {
                i2 = i3 + 1;
            } else if (b2 > b) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return mo15346d(i3, obj, b);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: d */
    public final int mo15346d(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f22768b[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C8407b.m30216b(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f22767a;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f22767a;
                break;
            }
            Object obj3 = this.f22768b[i4];
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

    /* renamed from: e */
    public final void mo15347e(@C12579k C11304p<Object, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        int i = mo15350i();
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = mo15349g()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            pVar.invoke(obj, Integer.valueOf(mo15351k()[i2]));
        }
    }

    /* renamed from: f */
    public final int mo15348f(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "key");
        int c = mo15345c(obj);
        if (c >= 0) {
            return this.f22769c[c];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @C12579k
    /* renamed from: g */
    public final Object[] mo15349g() {
        return this.f22768b;
    }

    /* renamed from: i */
    public final int mo15350i() {
        return this.f22767a;
    }

    @C12579k
    /* renamed from: k */
    public final int[] mo15351k() {
        return this.f22769c;
    }

    /* renamed from: m */
    public final boolean mo15352m(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "key");
        int c = mo15345c(obj);
        if (c < 0) {
            return false;
        }
        int i = this.f22767a;
        if (c < i - 1) {
            Object[] objArr = this.f22768b;
            int i2 = c + 1;
            C10956m.m41183c1(objArr, objArr, c, i2, i);
            int[] iArr = this.f22769c;
            C10956m.m41171a1(iArr, iArr, c, i2, this.f22767a);
        }
        int i3 = this.f22767a - 1;
        this.f22767a = i3;
        this.f22768b[i3] = null;
        return true;
    }

    /* renamed from: n */
    public final void mo15353n(@C12579k C11304p<Object, ? super Integer, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int i = mo15350i();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = mo15349g()[i3];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            int i4 = mo15351k()[i3];
            if (!pVar.invoke(obj, Integer.valueOf(i4)).booleanValue()) {
                if (i2 != i3) {
                    mo15349g()[i2] = obj;
                    mo15351k()[i2] = i4;
                }
                i2++;
            }
        }
        int i5 = mo15350i();
        for (int i6 = i2; i6 < i5; i6++) {
            mo15349g()[i6] = null;
        }
        mo15355p(i2);
    }

    /* renamed from: o */
    public final void mo15354o(@C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f22768b = objArr;
    }

    /* renamed from: p */
    public final void mo15355p(int i) {
        this.f22767a = i;
    }

    /* renamed from: q */
    public final void mo15356q(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f22769c = iArr;
    }
}
