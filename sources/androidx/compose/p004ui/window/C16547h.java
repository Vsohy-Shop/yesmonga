package androidx.compose.p004ui.window;

import androidx.compose.p004ui.C8761g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.window.h */
public final class C16547h {

    /* renamed from: h */
    public static final int f41035h = 0;

    /* renamed from: a */
    public final boolean f41036a;

    /* renamed from: b */
    public final boolean f41037b;

    /* renamed from: c */
    public final boolean f41038c;
    @C12579k

    /* renamed from: d */
    public final SecureFlagPolicy f41039d;

    /* renamed from: e */
    public final boolean f41040e;

    /* renamed from: f */
    public final boolean f41041f;

    /* renamed from: g */
    public final boolean f41042g;

    @C8761g
    public C16547h() {
        this(false, false, false, (SecureFlagPolicy) null, false, false, false, 127, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final boolean mo48084a() {
        return this.f41041f;
    }

    /* renamed from: b */
    public final boolean mo48085b() {
        return this.f41037b;
    }

    /* renamed from: c */
    public final boolean mo48086c() {
        return this.f41038c;
    }

    /* renamed from: d */
    public final boolean mo48087d() {
        return this.f41040e;
    }

    /* renamed from: e */
    public final boolean mo48088e() {
        return this.f41036a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16547h)) {
            return false;
        }
        C16547h hVar = (C16547h) obj;
        if (this.f41036a == hVar.f41036a && this.f41037b == hVar.f41037b && this.f41038c == hVar.f41038c && this.f41039d == hVar.f41039d && this.f41040e == hVar.f41040e && this.f41041f == hVar.f41041f && this.f41042g == hVar.f41042g) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final SecureFlagPolicy mo48090f() {
        return this.f41039d;
    }

    /* renamed from: g */
    public final boolean mo48091g() {
        return this.f41042g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f41037b) * 31) + Boolean.hashCode(this.f41036a)) * 31) + Boolean.hashCode(this.f41037b)) * 31) + Boolean.hashCode(this.f41038c)) * 31) + this.f41039d.hashCode()) * 31) + Boolean.hashCode(this.f41040e)) * 31) + Boolean.hashCode(this.f41041f)) * 31) + Boolean.hashCode(this.f41042g);
    }

    @C8761g
    public C16547h(boolean z, boolean z2, boolean z3, @C12579k SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "securePolicy");
        this.f41036a = z;
        this.f41037b = z2;
        this.f41038c = z3;
        this.f41039d = secureFlagPolicy;
        this.f41040e = z4;
        this.f41041f = z5;
        this.f41042g = z6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16547h(boolean r7, boolean r8, boolean r9, androidx.compose.p004ui.window.SecureFlagPolicy r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            r1 = 1
            if (r7 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            androidx.compose.ui.window.SecureFlagPolicy r10 = androidx.compose.p004ui.window.SecureFlagPolicy.Inherit
        L_0x001d:
            r4 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.C16547h.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16547h(boolean r5, boolean r6, boolean r7, androidx.compose.p004ui.window.SecureFlagPolicy r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 1
            if (r12 == 0) goto L_0x000c
            r12 = r0
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r7
        L_0x0014:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            androidx.compose.ui.window.SecureFlagPolicy r8 = androidx.compose.p004ui.window.SecureFlagPolicy.Inherit
        L_0x001a:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x0021:
            r3 = r9
        L_0x0022:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.C16547h.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16547h(boolean z, boolean z2, boolean z3, @C12579k SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false);
        Intrinsics.checkNotNullParameter(secureFlagPolicy, "securePolicy");
    }
}
