package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n4513#2,5:289\n4513#2,5:294\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:289,5\n286#1:294,5\n*E\n"})
/* renamed from: androidx.compose.runtime.d1 */
public final class C8431d1<N> implements C8428d<N> {
    @C12579k

    /* renamed from: a */
    public final C8428d<N> f22792a;

    /* renamed from: b */
    public final int f22793b;

    /* renamed from: c */
    public int f22794c;

    public C8431d1(@C12579k C8428d<N> dVar, int i) {
        Intrinsics.checkNotNullParameter(dVar, "applier");
        this.f22792a = dVar;
        this.f22793b = i;
    }

    /* renamed from: a */
    public N mo15321a() {
        return this.f22792a.mo15321a();
    }

    /* renamed from: b */
    public void mo15555b(int i, int i2, int i3) {
        int i4;
        if (this.f22794c == 0) {
            i4 = this.f22793b;
        } else {
            i4 = 0;
        }
        this.f22792a.mo15555b(i + i4, i2 + i4, i3);
    }

    /* renamed from: c */
    public void mo15556c(int i, int i2) {
        this.f22792a.mo15556c(i + (this.f22794c == 0 ? this.f22793b : 0), i2);
    }

    public void clear() {
        ComposerKt.m29774A("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    public void mo15557e(int i, N n) {
        this.f22792a.mo15557e(i + (this.f22794c == 0 ? this.f22793b : 0), n);
    }

    /* renamed from: h */
    public void mo15559h(int i, N n) {
        this.f22792a.mo15559h(i + (this.f22794c == 0 ? this.f22793b : 0), n);
    }

    /* renamed from: i */
    public void mo15323i(N n) {
        this.f22794c++;
        this.f22792a.mo15323i(n);
    }

    /* renamed from: k */
    public void mo15324k() {
        boolean z;
        int i = this.f22794c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f22794c = i - 1;
            this.f22792a.mo15324k();
            return;
        }
        ComposerKt.m29774A("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}
