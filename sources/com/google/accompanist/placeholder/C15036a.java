package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C1984k0;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.accompanist.placeholder.a */
public final class C15036a implements C15037b {

    /* renamed from: b */
    public final long f37163b;
    @C12579k

    /* renamed from: c */
    public final C1984k0<Float> f37164c;
    @C12579k

    /* renamed from: d */
    public final C15225h4 f37165d;

    public /* synthetic */ C15036a(long j, C1984k0 k0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, k0Var);
    }

    /* renamed from: g */
    public static /* synthetic */ C15036a m64443g(C15036a aVar, long j, C1984k0<Float> k0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.f37163b;
        }
        if ((i & 2) != 0) {
            k0Var = aVar.mo42040b();
        }
        return aVar.mo42045f(j, k0Var);
    }

    @C12579k
    /* renamed from: a */
    public C15421z1 mo42039a(float f, long j) {
        return this.f37165d;
    }

    @C12579k
    /* renamed from: b */
    public C1984k0<Float> mo42040b() {
        return this.f37164c;
    }

    /* renamed from: c */
    public float mo42041c(float f) {
        return f;
    }

    /* renamed from: d */
    public final long mo42042d() {
        return this.f37163b;
    }

    @C12579k
    /* renamed from: e */
    public final C1984k0<Float> mo42043e() {
        return mo42040b();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15036a)) {
            return false;
        }
        C15036a aVar = (C15036a) obj;
        return C15240j2.m66082y(this.f37163b, aVar.f37163b) && Intrinsics.areEqual((Object) mo42040b(), (Object) aVar.mo42040b());
    }

    @C12579k
    /* renamed from: f */
    public final C15036a mo42045f(long j, @C12579k C1984k0<Float> k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "animationSpec");
        return new C15036a(j, k0Var, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        return (C15240j2.m66056K(this.f37163b) * 31) + mo42040b().hashCode();
    }

    @C12579k
    public String toString() {
        return "Fade(highlightColor=" + C15240j2.m66057L(this.f37163b) + ", animationSpec=" + mo42040b() + ')';
    }

    public C15036a(long j, C1984k0<Float> k0Var) {
        this.f37163b = j;
        this.f37164c = k0Var;
        this.f37165d = new C15225h4(j, (DefaultConstructorMarker) null);
    }
}
