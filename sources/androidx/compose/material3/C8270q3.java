package androidx.compose.material3;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C8251n0
/* renamed from: androidx.compose.material3.q3 */
public final class C8270q3 {

    /* renamed from: f */
    public static final int f20426f = 0;

    /* renamed from: a */
    public final long f20427a;

    /* renamed from: b */
    public final long f20428b;

    /* renamed from: c */
    public final long f20429c;

    /* renamed from: d */
    public final long f20430d;

    /* renamed from: e */
    public final long f20431e;

    public /* synthetic */ C8270q3(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    @C8540g
    /* renamed from: a */
    public final long mo12935a(float f, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1456204135);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1456204135, i, -1, "androidx.compose.material3.TopAppBarColors.containerColor (AppBar.kt:936)");
        }
        long n = C15258l2.m66189n(this.f20427a, this.f20428b, C1947b0.m8289a().mo6791a(f));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return n;
    }

    /* renamed from: b */
    public final long mo12936b() {
        return this.f20431e;
    }

    /* renamed from: c */
    public final long mo12937c() {
        return this.f20429c;
    }

    /* renamed from: d */
    public final long mo12938d() {
        return this.f20430d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8270q3)) {
            return false;
        }
        C8270q3 q3Var = (C8270q3) obj;
        if (C15240j2.m66082y(this.f20427a, q3Var.f20427a) && C15240j2.m66082y(this.f20428b, q3Var.f20428b) && C15240j2.m66082y(this.f20429c, q3Var.f20429c) && C15240j2.m66082y(this.f20430d, q3Var.f20430d) && C15240j2.m66082y(this.f20431e, q3Var.f20431e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((C15240j2.m66056K(this.f20427a) * 31) + C15240j2.m66056K(this.f20428b)) * 31) + C15240j2.m66056K(this.f20429c)) * 31) + C15240j2.m66056K(this.f20430d)) * 31) + C15240j2.m66056K(this.f20431e);
    }

    public C8270q3(long j, long j2, long j3, long j4, long j5) {
        this.f20427a = j;
        this.f20428b = j2;
        this.f20429c = j3;
        this.f20430d = j4;
        this.f20431e = j5;
    }
}
