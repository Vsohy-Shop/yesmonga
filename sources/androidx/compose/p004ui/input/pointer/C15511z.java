package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15094f;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.pointer.z */
public final class C15511z {

    /* renamed from: a */
    public final long f38590a;

    /* renamed from: b */
    public final long f38591b;

    /* renamed from: c */
    public final long f38592c;

    /* renamed from: d */
    public final long f38593d;

    /* renamed from: e */
    public final boolean f38594e;

    /* renamed from: f */
    public final float f38595f;

    /* renamed from: g */
    public final int f38596g;

    /* renamed from: h */
    public final boolean f38597h;
    @C12579k

    /* renamed from: i */
    public final List<C15471e> f38598i;

    /* renamed from: j */
    public final long f38599j;

    public /* synthetic */ C15511z(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5);
    }

    /* renamed from: l */
    public static /* synthetic */ C15511z m68831l(C15511z zVar, long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, int i2, Object obj) {
        C15511z zVar2 = zVar;
        int i3 = i2;
        return zVar.mo44208k((i3 & 1) != 0 ? zVar2.f38590a : j, (i3 & 2) != 0 ? zVar2.f38591b : j2, (i3 & 4) != 0 ? zVar2.f38592c : j3, (i3 & 8) != 0 ? zVar2.f38593d : j4, (i3 & 16) != 0 ? zVar2.f38594e : z, (i3 & 32) != 0 ? zVar2.f38595f : f, (i3 & 64) != 0 ? zVar2.f38596g : i, (i3 & 128) != 0 ? zVar2.f38597h : z2, (i3 & 256) != 0 ? zVar2.f38598i : list, (i3 & 512) != 0 ? zVar2.f38599j : j5);
    }

    /* renamed from: a */
    public final long mo44196a() {
        return this.f38590a;
    }

    /* renamed from: b */
    public final long mo44197b() {
        return this.f38599j;
    }

    /* renamed from: c */
    public final long mo44198c() {
        return this.f38591b;
    }

    /* renamed from: d */
    public final long mo44199d() {
        return this.f38592c;
    }

    /* renamed from: e */
    public final long mo44200e() {
        return this.f38593d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15511z)) {
            return false;
        }
        C15511z zVar = (C15511z) obj;
        return C15506v.m68789d(this.f38590a, zVar.f38590a) && this.f38591b == zVar.f38591b && C15094f.m64876l(this.f38592c, zVar.f38592c) && C15094f.m64876l(this.f38593d, zVar.f38593d) && this.f38594e == zVar.f38594e && Float.compare(this.f38595f, zVar.f38595f) == 0 && C15481i0.m68620i(this.f38596g, zVar.f38596g) && this.f38597h == zVar.f38597h && Intrinsics.areEqual((Object) this.f38598i, (Object) zVar.f38598i) && C15094f.m64876l(this.f38599j, zVar.f38599j);
    }

    /* renamed from: f */
    public final boolean mo44202f() {
        return this.f38594e;
    }

    /* renamed from: g */
    public final float mo44203g() {
        return this.f38595f;
    }

    /* renamed from: h */
    public final int mo44204h() {
        return this.f38596g;
    }

    public int hashCode() {
        int f = ((((((C15506v.m68790f(this.f38590a) * 31) + Long.hashCode(this.f38591b)) * 31) + C15094f.m64883s(this.f38592c)) * 31) + C15094f.m64883s(this.f38593d)) * 31;
        boolean z = this.f38594e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (((((f + (z ? 1 : 0)) * 31) + Float.hashCode(this.f38595f)) * 31) + C15481i0.m68621j(this.f38596g)) * 31;
        boolean z3 = this.f38597h;
        if (!z3) {
            z2 = z3;
        }
        return ((((hashCode + (z2 ? 1 : 0)) * 31) + this.f38598i.hashCode()) * 31) + C15094f.m64883s(this.f38599j);
    }

    /* renamed from: i */
    public final boolean mo44206i() {
        return this.f38597h;
    }

    @C12579k
    /* renamed from: j */
    public final List<C15471e> mo44207j() {
        return this.f38598i;
    }

    @C12579k
    /* renamed from: k */
    public final C15511z mo44208k(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, @C12579k List<C15471e> list, long j5) {
        long j6 = j;
        Intrinsics.checkNotNullParameter(list, "historical");
        return new C15511z(j, j2, j3, j4, z, f, i, z2, list, j5, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public final boolean mo44209m() {
        return this.f38594e;
    }

    @C12579k
    /* renamed from: n */
    public final List<C15471e> mo44210n() {
        return this.f38598i;
    }

    /* renamed from: o */
    public final long mo44211o() {
        return this.f38590a;
    }

    /* renamed from: p */
    public final boolean mo44212p() {
        return this.f38597h;
    }

    /* renamed from: q */
    public final long mo44213q() {
        return this.f38593d;
    }

    /* renamed from: r */
    public final long mo44214r() {
        return this.f38592c;
    }

    /* renamed from: s */
    public final float mo44215s() {
        return this.f38595f;
    }

    /* renamed from: t */
    public final long mo44216t() {
        return this.f38599j;
    }

    @C12579k
    public String toString() {
        return "PointerInputEventData(id=" + C15506v.m68791g(this.f38590a) + ", uptime=" + this.f38591b + ", positionOnScreen=" + C15094f.m64889y(this.f38592c) + ", position=" + C15094f.m64889y(this.f38593d) + ", down=" + this.f38594e + ", pressure=" + this.f38595f + ", type=" + C15481i0.m68622k(this.f38596g) + ", issuesEnterExit=" + this.f38597h + ", historical=" + this.f38598i + ", scrollDelta=" + C15094f.m64889y(this.f38599j) + ')';
    }

    /* renamed from: u */
    public final int mo44218u() {
        return this.f38596g;
    }

    /* renamed from: v */
    public final long mo44219v() {
        return this.f38591b;
    }

    public C15511z(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<C15471e> list, long j5) {
        this.f38590a = j;
        this.f38591b = j2;
        this.f38592c = j3;
        this.f38593d = j4;
        this.f38594e = z;
        this.f38595f = f;
        this.f38596g = i;
        this.f38597h = z2;
        this.f38598i = list;
        this.f38599j = j5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15511z(long r20, long r22, long r24, long r26, boolean r28, float r29, int r30, boolean r31, java.util.List r32, long r33, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r14 = r1
            goto L_0x000b
        L_0x0009:
            r14 = r31
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0016
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r15 = r1
            goto L_0x0018
        L_0x0016:
            r15 = r32
        L_0x0018:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0025
            androidx.compose.ui.geometry.f$a r0 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r0 = r0.mo42248e()
            r16 = r0
            goto L_0x0027
        L_0x0025:
            r16 = r33
        L_0x0027:
            r18 = 0
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r24
            r9 = r26
            r11 = r28
            r12 = r29
            r13 = r30
            r2.<init>(r3, r5, r7, r9, r11, r12, r13, r14, r15, r16, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.pointer.C15511z.<init>(long, long, long, long, boolean, float, int, boolean, java.util.List, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
