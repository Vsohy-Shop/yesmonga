package kotlin;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.x0 */
public class C11672x0 {
    @C11110f
    /* renamed from: a */
    public static final Void m45785a() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @C11110f
    /* renamed from: b */
    public static final Void m45786b(String str) {
        Intrinsics.checkNotNullParameter(str, "reason");
        throw new NotImplementedError("An operation is not implemented: " + str);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: c */
    public static final <T> T m45787c(T t, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        lVar.invoke(t);
        return t;
    }

    @C11110f
    /* renamed from: d */
    public static final <T> T m45788d(T t, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        lVar.invoke(t);
        return t;
    }

    @C11110f
    /* renamed from: e */
    public static final <T, R> R m45789e(T t, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return lVar.invoke(t);
    }

    @C11110f
    /* renamed from: f */
    public static final void m45790f(int i, C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (int i2 = 0; i2 < i; i2++) {
            lVar.invoke(Integer.valueOf(i2));
        }
    }

    @C11110f
    /* renamed from: g */
    public static final <T, R> R m45791g(T t, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return lVar.invoke(t);
    }

    @C11110f
    /* renamed from: h */
    public static final <R> R m45792h(C11289a<? extends R> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        return aVar.invoke();
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: i */
    public static final <T> T m45793i(T t, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (lVar.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: j */
    public static final <T> T m45794j(T t, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (!lVar.invoke(t).booleanValue()) {
            return t;
        }
        return null;
    }

    @C11110f
    /* renamed from: k */
    public static final <T, R> R m45795k(T t, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return lVar.invoke(t);
    }
}
