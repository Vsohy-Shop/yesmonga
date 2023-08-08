package androidx.compose.material3;

import androidx.compose.foundation.shape.C2683e;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material3.n2 */
public final class C8253n2 {

    /* renamed from: f */
    public static final int f20382f = 0;
    @C12579k

    /* renamed from: a */
    public final C2683e f20383a;
    @C12579k

    /* renamed from: b */
    public final C2683e f20384b;
    @C12579k

    /* renamed from: c */
    public final C2683e f20385c;
    @C12579k

    /* renamed from: d */
    public final C2683e f20386d;
    @C12579k

    /* renamed from: e */
    public final C2683e f20387e;

    public C8253n2() {
        this((C2683e) null, (C2683e) null, (C2683e) null, (C2683e) null, (C2683e) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C8253n2 m27410b(C8253n2 n2Var, C2683e eVar, C2683e eVar2, C2683e eVar3, C2683e eVar4, C2683e eVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = n2Var.f20383a;
        }
        if ((i & 2) != 0) {
            eVar2 = n2Var.f20384b;
        }
        C2683e eVar6 = eVar2;
        if ((i & 4) != 0) {
            eVar3 = n2Var.f20385c;
        }
        C2683e eVar7 = eVar3;
        if ((i & 8) != 0) {
            eVar4 = n2Var.f20386d;
        }
        C2683e eVar8 = eVar4;
        if ((i & 16) != 0) {
            eVar5 = n2Var.f20387e;
        }
        return n2Var.mo12872a(eVar, eVar6, eVar7, eVar8, eVar5);
    }

    @C12579k
    /* renamed from: a */
    public final C8253n2 mo12872a(@C12579k C2683e eVar, @C12579k C2683e eVar2, @C12579k C2683e eVar3, @C12579k C2683e eVar4, @C12579k C2683e eVar5) {
        Intrinsics.checkNotNullParameter(eVar, "extraSmall");
        Intrinsics.checkNotNullParameter(eVar2, "small");
        Intrinsics.checkNotNullParameter(eVar3, "medium");
        Intrinsics.checkNotNullParameter(eVar4, "large");
        Intrinsics.checkNotNullParameter(eVar5, "extraLarge");
        return new C8253n2(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    @C12579k
    /* renamed from: c */
    public final C2683e mo12873c() {
        return this.f20387e;
    }

    @C12579k
    /* renamed from: d */
    public final C2683e mo12874d() {
        return this.f20383a;
    }

    @C12579k
    /* renamed from: e */
    public final C2683e mo12875e() {
        return this.f20386d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8253n2)) {
            return false;
        }
        C8253n2 n2Var = (C8253n2) obj;
        if (Intrinsics.areEqual((Object) this.f20383a, (Object) n2Var.f20383a) && Intrinsics.areEqual((Object) this.f20384b, (Object) n2Var.f20384b) && Intrinsics.areEqual((Object) this.f20385c, (Object) n2Var.f20385c) && Intrinsics.areEqual((Object) this.f20386d, (Object) n2Var.f20386d) && Intrinsics.areEqual((Object) this.f20387e, (Object) n2Var.f20387e)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final C2683e mo12877f() {
        return this.f20385c;
    }

    @C12579k
    /* renamed from: g */
    public final C2683e mo12878g() {
        return this.f20384b;
    }

    public int hashCode() {
        return (((((((this.f20383a.hashCode() * 31) + this.f20384b.hashCode()) * 31) + this.f20385c.hashCode()) * 31) + this.f20386d.hashCode()) * 31) + this.f20387e.hashCode();
    }

    @C12579k
    public String toString() {
        return "Shapes(extraSmall=" + this.f20383a + ", small=" + this.f20384b + ", medium=" + this.f20385c + ", large=" + this.f20386d + ", extraLarge=" + this.f20387e + ')';
    }

    public C8253n2(@C12579k C2683e eVar, @C12579k C2683e eVar2, @C12579k C2683e eVar3, @C12579k C2683e eVar4, @C12579k C2683e eVar5) {
        Intrinsics.checkNotNullParameter(eVar, "extraSmall");
        Intrinsics.checkNotNullParameter(eVar2, "small");
        Intrinsics.checkNotNullParameter(eVar3, "medium");
        Intrinsics.checkNotNullParameter(eVar4, "large");
        Intrinsics.checkNotNullParameter(eVar5, "extraLarge");
        this.f20383a = eVar;
        this.f20384b = eVar2;
        this.f20385c = eVar3;
        this.f20386d = eVar4;
        this.f20387e = eVar5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8253n2(androidx.compose.foundation.shape.C2683e r4, androidx.compose.foundation.shape.C2683e r5, androidx.compose.foundation.shape.C2683e r6, androidx.compose.foundation.shape.C2683e r7, androidx.compose.foundation.shape.C2683e r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            androidx.compose.material3.m2 r4 = androidx.compose.material3.C8247m2.f20362a
            androidx.compose.foundation.shape.e r4 = r4.mo12857b()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0014
            androidx.compose.material3.m2 r5 = androidx.compose.material3.C8247m2.f20362a
            androidx.compose.foundation.shape.e r5 = r5.mo12860e()
        L_0x0014:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001f
            androidx.compose.material3.m2 r5 = androidx.compose.material3.C8247m2.f20362a
            androidx.compose.foundation.shape.e r6 = r5.mo12859d()
        L_0x001f:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x002a
            androidx.compose.material3.m2 r5 = androidx.compose.material3.C8247m2.f20362a
            androidx.compose.foundation.shape.e r7 = r5.mo12858c()
        L_0x002a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0035
            androidx.compose.material3.m2 r5 = androidx.compose.material3.C8247m2.f20362a
            androidx.compose.foundation.shape.e r8 = r5.mo12856a()
        L_0x0035:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C8253n2.<init>(androidx.compose.foundation.shape.e, androidx.compose.foundation.shape.e, androidx.compose.foundation.shape.e, androidx.compose.foundation.shape.e, androidx.compose.foundation.shape.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
