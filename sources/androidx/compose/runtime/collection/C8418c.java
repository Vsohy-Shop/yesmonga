package androidx.compose.runtime.collection;

import androidx.compose.runtime.C8407b;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,208:1\n118#1,22:209\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n142#1:209,22\n*E\n"})
/* renamed from: androidx.compose.runtime.collection.c */
public final class C8418c<Key, Value> {
    @C12579k

    /* renamed from: a */
    public Object[] f22770a;
    @C12579k

    /* renamed from: b */
    public Object[] f22771b;

    /* renamed from: c */
    public int f22772c;

    public C8418c() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo15357a() {
        this.f22772c = 0;
        C10956m.m41313w2(this.f22770a, (Object) null, 0, 0, 6, (Object) null);
        C10956m.m41313w2(this.f22771b, (Object) null, 0, 0, 6, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo15358b(@C12579k Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (mo15359c(key) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo15359c(Object obj) {
        int b = C8407b.m30216b(obj);
        int i = this.f22772c - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f22770a[i3];
            int b2 = C8407b.m30216b(obj2);
            if (b2 < b) {
                i2 = i3 + 1;
            } else if (b2 > b) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return mo15360d(i3, obj, b);
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: d */
    public final int mo15360d(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f22770a[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C8407b.m30216b(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.f22772c;
        while (true) {
            if (i4 >= i5) {
                i4 = this.f22772c;
                break;
            }
            Object obj3 = this.f22770a[i4];
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
    public final void mo15361e(@C12579k C11304p<? super Key, ? super Value, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        int h = mo15364h();
        for (int i = 0; i < h; i++) {
            Object obj = mo15363g()[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            pVar.invoke(obj, mo15365i()[i]);
        }
    }

    @C12580l
    /* renamed from: f */
    public final Value mo15362f(@C12579k Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int c = mo15359c(key);
        if (c >= 0) {
            return this.f22771b[c];
        }
        return null;
    }

    @C12579k
    /* renamed from: g */
    public final Object[] mo15363g() {
        return this.f22770a;
    }

    /* renamed from: h */
    public final int mo15364h() {
        return this.f22772c;
    }

    @C12579k
    /* renamed from: i */
    public final Object[] mo15365i() {
        return this.f22771b;
    }

    /* renamed from: j */
    public final boolean mo15366j() {
        return this.f22772c == 0;
    }

    /* renamed from: k */
    public final boolean mo15367k() {
        return this.f22772c > 0;
    }

    @C12580l
    /* renamed from: l */
    public final Value mo15368l(@C12579k Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int c = mo15359c(key);
        if (c < 0) {
            return null;
        }
        Value[] valueArr = this.f22771b;
        Value value = valueArr[c];
        int i = this.f22772c;
        Object[] objArr = this.f22770a;
        int i2 = c + 1;
        C10956m.m41183c1(objArr, objArr, c, i2, i);
        C10956m.m41183c1(valueArr, valueArr, c, i2, i);
        int i3 = i - 1;
        objArr[i3] = null;
        valueArr[i3] = null;
        this.f22772c = i3;
        return value;
    }

    /* renamed from: m */
    public final void mo15369m(@C12579k C11304p<? super Key, ? super Value, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        int h = mo15364h();
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            Object obj = mo15363g()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!pVar.invoke(obj, mo15365i()[i2]).booleanValue()) {
                if (i != i2) {
                    mo15363g()[i] = obj;
                    mo15365i()[i] = mo15365i()[i2];
                }
                i++;
            }
        }
        if (mo15364h() > i) {
            int h2 = mo15364h();
            for (int i3 = i; i3 < h2; i3++) {
                mo15363g()[i3] = null;
                mo15365i()[i3] = null;
            }
            mo15373q(i);
        }
    }

    /* renamed from: n */
    public final void mo15370n(@C12579k C11300l<? super Value, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int h = mo15364h();
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            Object obj = mo15363g()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!lVar.invoke(mo15365i()[i2]).booleanValue()) {
                if (i != i2) {
                    mo15363g()[i] = obj;
                    mo15365i()[i] = mo15365i()[i2];
                }
                i++;
            }
        }
        if (mo15364h() > i) {
            int h2 = mo15364h();
            for (int i3 = i; i3 < h2; i3++) {
                mo15363g()[i3] = null;
                mo15365i()[i3] = null;
            }
            mo15373q(i);
        }
    }

    /* renamed from: o */
    public final void mo15371o(@C12579k Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(key, "key");
        int c = mo15359c(key);
        if (c >= 0) {
            this.f22771b[c] = value;
            return;
        }
        int i = -(c + 1);
        int i2 = this.f22772c;
        Object[] objArr3 = this.f22770a;
        if (i2 == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[(i2 * 2)];
        } else {
            objArr = objArr3;
        }
        int i3 = i + 1;
        C10956m.m41183c1(objArr3, objArr, i3, i, i2);
        if (z) {
            C10956m.m41237l1(this.f22770a, objArr, 0, 0, i, 6, (Object) null);
        }
        objArr[i] = key;
        this.f22770a = objArr;
        if (z) {
            objArr2 = new Object[(this.f22772c * 2)];
        } else {
            objArr2 = this.f22771b;
        }
        C10956m.m41183c1(this.f22771b, objArr2, i3, i, this.f22772c);
        if (z) {
            C10956m.m41237l1(this.f22771b, objArr2, 0, 0, i, 6, (Object) null);
        }
        objArr2[i] = value;
        this.f22771b = objArr2;
        this.f22772c++;
    }

    /* renamed from: p */
    public final void mo15372p(@C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f22770a = objArr;
    }

    /* renamed from: q */
    public final void mo15373q(int i) {
        this.f22772c = i;
    }

    /* renamed from: r */
    public final void mo15374r(@C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f22771b = objArr;
    }

    public C8418c(int i) {
        this.f22770a = new Object[i];
        this.f22771b = new Object[i];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8418c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
