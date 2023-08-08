package androidx.compose.p004ui.node;

import java.util.Arrays;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.node.c */
public final class C15673c {
    @C12579k

    /* renamed from: a */
    public final int[] f38990a;

    public /* synthetic */ C15673c(int[] iArr) {
        this.f38990a = iArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15673c m70138a(int[] iArr) {
        return new C15673c(iArr);
    }

    @C12579k
    /* renamed from: b */
    public static int[] m70139b(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "data");
        return iArr;
    }

    /* renamed from: c */
    public static boolean m70140c(int[] iArr, Object obj) {
        return (obj instanceof C15673c) && Intrinsics.areEqual((Object) iArr, (Object) ((C15673c) obj).mo44954j());
    }

    /* renamed from: d */
    public static final boolean m70141d(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual((Object) iArr, (Object) iArr2);
    }

    /* renamed from: e */
    public static final int m70142e(int[] iArr, int i) {
        return iArr[i + m70143f(iArr)];
    }

    /* renamed from: f */
    public static final int m70143f(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: g */
    public static int m70144g(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: h */
    public static final void m70145h(int[] iArr, int i, int i2) {
        iArr[i + m70143f(iArr)] = i2;
    }

    /* renamed from: i */
    public static String m70146i(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m70140c(this.f38990a, obj);
    }

    public int hashCode() {
        return m70144g(this.f38990a);
    }

    /* renamed from: j */
    public final /* synthetic */ int[] mo44954j() {
        return this.f38990a;
    }

    public String toString() {
        return m70146i(this.f38990a);
    }
}
