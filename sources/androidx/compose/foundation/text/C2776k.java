package androidx.compose.foundation.text;

import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.text.k */
public final class C2776k {
    @C12579k

    /* renamed from: g */
    public static final C2777a f7285g = new C2777a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f7286h = 0;
    @C12579k

    /* renamed from: i */
    public static final C2776k f7287i = new C2776k((C11300l) null, (C11300l) null, (C11300l) null, (C11300l) null, (C11300l) null, (C11300l) null, 63, (DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: a */
    public final C11300l<C2775j, C11079d2> f7288a;
    @C12580l

    /* renamed from: b */
    public final C11300l<C2775j, C11079d2> f7289b;
    @C12580l

    /* renamed from: c */
    public final C11300l<C2775j, C11079d2> f7290c;
    @C12580l

    /* renamed from: d */
    public final C11300l<C2775j, C11079d2> f7291d;
    @C12580l

    /* renamed from: e */
    public final C11300l<C2775j, C11079d2> f7292e;
    @C12580l

    /* renamed from: f */
    public final C11300l<C2775j, C11079d2> f7293f;

    /* renamed from: androidx.compose.foundation.text.k$a */
    public static final class C2777a {
        public /* synthetic */ C2777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m12597b() {
        }

        @C12579k
        /* renamed from: a */
        public final C2776k mo9531a() {
            return C2776k.f7287i;
        }

        public C2777a() {
        }
    }

    public C2776k() {
        this((C11300l) null, (C11300l) null, (C11300l) null, (C11300l) null, (C11300l) null, (C11300l) null, 63, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: b */
    public final C11300l<C2775j, C11079d2> mo9523b() {
        return this.f7288a;
    }

    @C12580l
    /* renamed from: c */
    public final C11300l<C2775j, C11079d2> mo9524c() {
        return this.f7289b;
    }

    @C12580l
    /* renamed from: d */
    public final C11300l<C2775j, C11079d2> mo9525d() {
        return this.f7290c;
    }

    @C12580l
    /* renamed from: e */
    public final C11300l<C2775j, C11079d2> mo9526e() {
        return this.f7291d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2776k)) {
            return false;
        }
        C2776k kVar = (C2776k) obj;
        if (!Intrinsics.areEqual((Object) this.f7288a, (Object) kVar.f7288a) || !Intrinsics.areEqual((Object) this.f7289b, (Object) kVar.f7289b) || !Intrinsics.areEqual((Object) this.f7290c, (Object) kVar.f7290c) || !Intrinsics.areEqual((Object) this.f7291d, (Object) kVar.f7291d) || !Intrinsics.areEqual((Object) this.f7292e, (Object) kVar.f7292e) || !Intrinsics.areEqual((Object) this.f7293f, (Object) kVar.f7293f)) {
            return false;
        }
        return true;
    }

    @C12580l
    /* renamed from: f */
    public final C11300l<C2775j, C11079d2> mo9528f() {
        return this.f7292e;
    }

    @C12580l
    /* renamed from: g */
    public final C11300l<C2775j, C11079d2> mo9529g() {
        return this.f7293f;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C11300l<C2775j, C11079d2> lVar = this.f7288a;
        int i6 = 0;
        if (lVar != null) {
            i = lVar.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        C11300l<C2775j, C11079d2> lVar2 = this.f7289b;
        if (lVar2 != null) {
            i2 = lVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        C11300l<C2775j, C11079d2> lVar3 = this.f7290c;
        if (lVar3 != null) {
            i3 = lVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        C11300l<C2775j, C11079d2> lVar4 = this.f7291d;
        if (lVar4 != null) {
            i4 = lVar4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        C11300l<C2775j, C11079d2> lVar5 = this.f7292e;
        if (lVar5 != null) {
            i5 = lVar5.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        C11300l<C2775j, C11079d2> lVar6 = this.f7293f;
        if (lVar6 != null) {
            i6 = lVar6.hashCode();
        }
        return i11 + i6;
    }

    public C2776k(@C12580l C11300l<? super C2775j, C11079d2> lVar, @C12580l C11300l<? super C2775j, C11079d2> lVar2, @C12580l C11300l<? super C2775j, C11079d2> lVar3, @C12580l C11300l<? super C2775j, C11079d2> lVar4, @C12580l C11300l<? super C2775j, C11079d2> lVar5, @C12580l C11300l<? super C2775j, C11079d2> lVar6) {
        this.f7288a = lVar;
        this.f7289b = lVar2;
        this.f7290c = lVar3;
        this.f7291d = lVar4;
        this.f7292e = lVar5;
        this.f7293f = lVar6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2776k(kotlin.jvm.functions.C11300l r6, kotlin.jvm.functions.C11300l r7, kotlin.jvm.functions.C11300l r8, kotlin.jvm.functions.C11300l r9, kotlin.jvm.functions.C11300l r10, kotlin.jvm.functions.C11300l r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C2776k.<init>(kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
