package androidx.compose.p004ui.node;

import java.util.Arrays;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.node.m1 */
public final class C15711m1 {
    @C12579k

    /* renamed from: a */
    public final int[] f39039a;

    public /* synthetic */ C15711m1(int[] iArr) {
        this.f39039a = iArr;
    }

    /* renamed from: a */
    public static final void m70414a(int[] iArr, @C12579k C15722p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "diagonals");
        if (!m70422j(iArr)) {
            pVar.mo45175e(m70424l(iArr), m70425m(iArr), m70420h(iArr) - m70424l(iArr));
        } else if (m70423k(iArr)) {
            pVar.mo45175e(m70424l(iArr), m70425m(iArr), m70419g(iArr));
        } else if (m70427o(iArr)) {
            pVar.mo45175e(m70424l(iArr), m70425m(iArr) + 1, m70419g(iArr));
        } else {
            pVar.mo45175e(m70424l(iArr) + 1, m70425m(iArr), m70419g(iArr));
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C15711m1 m70415b(int[] iArr) {
        return new C15711m1(iArr);
    }

    @C12579k
    /* renamed from: c */
    public static int[] m70416c(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "data");
        return iArr;
    }

    /* renamed from: d */
    public static boolean m70417d(int[] iArr, Object obj) {
        return (obj instanceof C15711m1) && Intrinsics.areEqual((Object) iArr, (Object) ((C15711m1) obj).mo45159q());
    }

    /* renamed from: e */
    public static final boolean m70418e(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual((Object) iArr, (Object) iArr2);
    }

    /* renamed from: g */
    public static final int m70419g(int[] iArr) {
        return Math.min(m70420h(iArr) - m70424l(iArr), m70421i(iArr) - m70425m(iArr));
    }

    /* renamed from: h */
    public static final int m70420h(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: i */
    public static final int m70421i(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: j */
    public static final boolean m70422j(int[] iArr) {
        return m70421i(iArr) - m70425m(iArr) != m70420h(iArr) - m70424l(iArr);
    }

    /* renamed from: k */
    public static final boolean m70423k(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: l */
    public static final int m70424l(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: m */
    public static final int m70425m(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: n */
    public static int m70426n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: o */
    public static final boolean m70427o(int[] iArr) {
        return m70421i(iArr) - m70425m(iArr) > m70420h(iArr) - m70424l(iArr);
    }

    @C12579k
    /* renamed from: p */
    public static String m70428p(int[] iArr) {
        return "Snake(" + m70424l(iArr) + ',' + m70425m(iArr) + ',' + m70420h(iArr) + ',' + m70421i(iArr) + ',' + m70423k(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m70417d(this.f39039a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final int[] mo45157f() {
        return this.f39039a;
    }

    public int hashCode() {
        return m70426n(this.f39039a);
    }

    /* renamed from: q */
    public final /* synthetic */ int[] mo45159q() {
        return this.f39039a;
    }

    @C12579k
    public String toString() {
        return m70428p(this.f39039a);
    }
}
