package androidx.compose.p004ui.graphics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.o3 */
public final class C15282o3 {
    @C12579k

    /* renamed from: a */
    public final int[] f37613a;

    /* renamed from: b */
    public final int f37614b;

    /* renamed from: c */
    public final int f37615c;

    /* renamed from: d */
    public final int f37616d;

    /* renamed from: e */
    public final int f37617e;

    public C15282o3(@C12579k int[] iArr, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "buffer");
        this.f37613a = iArr;
        this.f37614b = i;
        this.f37615c = i2;
        this.f37616d = i3;
        this.f37617e = i4;
    }

    /* renamed from: a */
    public final long mo42923a(int i, int i2) {
        return C15258l2.m66177b(this.f37613a[this.f37616d + (i2 * this.f37617e) + i]);
    }

    @C12579k
    /* renamed from: b */
    public final int[] mo42924b() {
        return this.f37613a;
    }

    /* renamed from: c */
    public final int mo42925c() {
        return this.f37616d;
    }

    /* renamed from: d */
    public final int mo42926d() {
        return this.f37615c;
    }

    /* renamed from: e */
    public final int mo42927e() {
        return this.f37617e;
    }

    /* renamed from: f */
    public final int mo42928f() {
        return this.f37614b;
    }
}
