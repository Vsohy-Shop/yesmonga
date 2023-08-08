package androidx.window.embedding;

import androidx.window.core.C20994d;
import com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.v */
public final class C21026v extends C21029y {

    /* renamed from: e */
    public final boolean f54221e;

    /* renamed from: f */
    public final boolean f54222f;

    /* renamed from: g */
    public final boolean f54223g;
    @C12579k

    /* renamed from: h */
    public final Set<C21025u> f54224h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21026v(java.util.Set r8, boolean r9, boolean r10, boolean r11, int r12, int r13, float r14, int r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r7 = this;
            r0 = r16
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r9
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = r10
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r11
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r12
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = r13
        L_0x0025:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x002c
            r6 = 1056964608(0x3f000000, float:0.5)
            goto L_0x002d
        L_0x002c:
            r6 = r14
        L_0x002d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x0033:
            r0 = r15
        L_0x0034:
            r9 = r7
            r10 = r8
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r2
            r16 = r6
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.C21026v.<init>(java.util.Set, boolean, boolean, boolean, int, int, float, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21026v) || !super.equals(obj)) {
            return false;
        }
        C21026v vVar = (C21026v) obj;
        if (Intrinsics.areEqual((Object) this.f54224h, (Object) vVar.f54224h) && this.f54221e == vVar.f54221e && this.f54222f == vVar.f54222f && this.f54223g == vVar.f54223g) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo62877f() {
        return this.f54223g;
    }

    @C12579k
    /* renamed from: g */
    public final Set<C21025u> mo62878g() {
        return this.f54224h;
    }

    /* renamed from: h */
    public final boolean mo62879h() {
        return this.f54221e;
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.f54224h.hashCode()) * 31) + Boolean.hashCode(this.f54221e)) * 31) + Boolean.hashCode(this.f54222f)) * 31) + Boolean.hashCode(this.f54223g);
    }

    /* renamed from: i */
    public final boolean mo62881i() {
        return this.f54222f;
    }

    @C12579k
    /* renamed from: j */
    public final C21026v mo62882j(@C12579k C21025u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f54224h);
        linkedHashSet.add(uVar);
        return new C21026v(CollectionsKt___CollectionsKt.m40582V5(linkedHashSet), this.f54221e, this.f54222f, this.f54223g, mo62889d(), mo62888c(), mo62890e(), mo62887b());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21026v(@C12579k Set<C21025u> set, boolean z, boolean z2, boolean z3, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        Intrinsics.checkNotNullParameter(set, C23812d.f59917a);
        this.f54221e = z;
        this.f54222f = z2;
        this.f54223g = z3;
        this.f54224h = CollectionsKt___CollectionsKt.m40582V5(set);
    }
}
