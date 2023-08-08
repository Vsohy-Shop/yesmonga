package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8585m0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.vector.m */
public final class C15378m extends C15381o implements Iterable<C15381o>, C11345a {

    /* renamed from: z */
    public static final int f38013z = 0;
    @C12579k

    /* renamed from: b */
    public final String f38014b;

    /* renamed from: c */
    public final float f38015c;

    /* renamed from: d */
    public final float f38016d;

    /* renamed from: e */
    public final float f38017e;

    /* renamed from: f */
    public final float f38018f;

    /* renamed from: g */
    public final float f38019g;

    /* renamed from: v */
    public final float f38020v;

    /* renamed from: w */
    public final float f38021w;
    @C12579k

    /* renamed from: x */
    public final List<C15349f> f38022x;
    @C12579k

    /* renamed from: y */
    public final List<C15381o> f38023y;

    /* renamed from: androidx.compose.ui.graphics.vector.m$a */
    public static final class C15379a implements Iterator<C15381o>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<C15381o> f38024a;

        public C15379a(C15378m mVar) {
            this.f38024a = mVar.f38023y.iterator();
        }

        @C12579k
        /* renamed from: b */
        public final Iterator<C15381o> mo43549b() {
            return this.f38024a;
        }

        @C12579k
        /* renamed from: c */
        public C15381o next() {
            return this.f38024a.next();
        }

        public boolean hasNext() {
            return this.f38024a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15378m() {
        this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    /* renamed from: H */
    public final float mo43535H() {
        return this.f38018f;
    }

    /* renamed from: M */
    public final float mo43536M() {
        return this.f38019g;
    }

    /* renamed from: Q */
    public final int mo43537Q() {
        return this.f38023y.size();
    }

    /* renamed from: W */
    public final float mo43538W() {
        return this.f38020v;
    }

    /* renamed from: X */
    public final float mo43539X() {
        return this.f38021w;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C15378m)) {
            return false;
        }
        C15378m mVar = (C15378m) obj;
        if (!Intrinsics.areEqual((Object) this.f38014b, (Object) mVar.f38014b)) {
            return false;
        }
        if (this.f38015c == mVar.f38015c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f38016d == mVar.f38016d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f38017e == mVar.f38017e) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f38018f == mVar.f38018f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f38019g == mVar.f38019g) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.f38020v == mVar.f38020v) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.f38021w == mVar.f38021w) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && Intrinsics.areEqual((Object) this.f38022x, (Object) mVar.f38022x) && Intrinsics.areEqual((Object) this.f38023y, (Object) mVar.f38023y)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: h */
    public final C15381o mo43541h(int i) {
        return this.f38023y.get(i);
    }

    public int hashCode() {
        return (((((((((((((((((this.f38014b.hashCode() * 31) + Float.hashCode(this.f38015c)) * 31) + Float.hashCode(this.f38016d)) * 31) + Float.hashCode(this.f38017e)) * 31) + Float.hashCode(this.f38018f)) * 31) + Float.hashCode(this.f38019g)) * 31) + Float.hashCode(this.f38020v)) * 31) + Float.hashCode(this.f38021w)) * 31) + this.f38022x.hashCode()) * 31) + this.f38023y.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<C15349f> mo43543i() {
        return this.f38022x;
    }

    @C12579k
    public Iterator<C15381o> iterator() {
        return new C15379a(this);
    }

    @C12579k
    /* renamed from: q */
    public final String mo43545q() {
        return this.f38014b;
    }

    /* renamed from: r */
    public final float mo43546r() {
        return this.f38016d;
    }

    /* renamed from: w */
    public final float mo43547w() {
        return this.f38017e;
    }

    /* renamed from: y */
    public final float mo43548y() {
        return this.f38015c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15378m(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0028
            r6 = r7
            goto L_0x0029
        L_0x0028:
            r6 = r15
        L_0x0029:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r7 = r16
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r3
            goto L_0x0038
        L_0x0036:
            r8 = r17
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = r18
        L_0x003f:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0048
            java.util.List r9 = androidx.compose.p004ui.graphics.vector.C15380n.m67243h()
            goto L_0x004a
        L_0x0048:
            r9 = r19
        L_0x004a:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0053
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0055
        L_0x0053:
            r0 = r20
        L_0x0055:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r3
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.vector.C15378m.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15378m(@C12579k String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @C12579k List<? extends C15349f> list, @C12579k List<? extends C15381o> list2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "clipPathData");
        Intrinsics.checkNotNullParameter(list2, "children");
        this.f38014b = str;
        this.f38015c = f;
        this.f38016d = f2;
        this.f38017e = f3;
        this.f38018f = f4;
        this.f38019g = f5;
        this.f38020v = f6;
        this.f38021w = f7;
        this.f38022x = list;
        this.f38023y = list2;
    }
}
