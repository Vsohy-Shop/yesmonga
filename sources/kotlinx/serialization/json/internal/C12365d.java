package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.d */
public final class C12365d implements CharSequence {
    @C12579k

    /* renamed from: a */
    public final char[] f30281a;

    /* renamed from: b */
    public final int f30282b;

    public C12365d(@C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "source");
        this.f30281a = cArr;
        this.f30282b = cArr.length;
    }

    /* renamed from: a */
    public char mo25484a(int i) {
        return this.f30281a[i];
    }

    /* renamed from: b */
    public int mo25485b() {
        return this.f30282b;
    }

    public final /* bridge */ char charAt(int i) {
        return mo25484a(i);
    }

    public final /* bridge */ int length() {
        return mo25485b();
    }

    @C12579k
    public CharSequence subSequence(int i, int i2) {
        return new String(this.f30281a, i, i2 - i);
    }
}
