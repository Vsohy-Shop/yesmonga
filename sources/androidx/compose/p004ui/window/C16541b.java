package androidx.compose.p004ui.window;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.window.b */
public final class C16541b {

    /* renamed from: f */
    public static final int f41029f = 0;

    /* renamed from: a */
    public final boolean f41030a;

    /* renamed from: b */
    public final boolean f41031b;
    @C12579k

    /* renamed from: c */
    public final SecureFlagPolicy f41032c;

    /* renamed from: d */
    public final boolean f41033d;

    /* renamed from: e */
    public final boolean f41034e;

    public C16541b() {
        this(false, false, (SecureFlagPolicy) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final boolean mo48074a() {
        return this.f41034e;
    }

    /* renamed from: b */
    public final boolean mo48075b() {
        return this.f41030a;
    }

    /* renamed from: c */
    public final boolean mo48076c() {
        return this.f41031b;
    }

    @C12579k
    /* renamed from: d */
    public final SecureFlagPolicy mo48077d() {
        return this.f41032c;
    }

    /* renamed from: e */
    public final boolean mo48078e() {
        return this.f41033d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16541b)) {
            return false;
        }
        C16541b bVar = (C16541b) obj;
        if (this.f41030a == bVar.f41030a && this.f41031b == bVar.f41031b && this.f41032c == bVar.f41032c && this.f41033d == bVar.f41033d && this.f41034e == bVar.f41034e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f41030a) * 31) + Boolean.hashCode(this.f41031b)) * 31) + this.f41032c.hashCode()) * 31) + Boolean.hashCode(this.f41033d)) * 31) + Boolean.hashCode(this.f41034e);
    }

    public C16541b(boolean z, boolean z2, @C12579k SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "securePolicy");
        this.f41030a = z;
        this.f41031b = z2;
        this.f41032c = secureFlagPolicy;
        this.f41033d = z3;
        this.f41034e = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16541b(boolean r5, boolean r6, androidx.compose.p004ui.window.SecureFlagPolicy r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 1
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            androidx.compose.ui.window.SecureFlagPolicy r7 = androidx.compose.p004ui.window.SecureFlagPolicy.Inherit
        L_0x0015:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>((boolean) r6, (boolean) r7, (androidx.compose.p004ui.window.SecureFlagPolicy) r8, (boolean) r9, (boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.C16541b.<init>(boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16541b(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16541b(boolean z, boolean z2, @C12579k SecureFlagPolicy secureFlagPolicy) {
        this(z, z2, secureFlagPolicy, true, true);
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "securePolicy");
    }
}
