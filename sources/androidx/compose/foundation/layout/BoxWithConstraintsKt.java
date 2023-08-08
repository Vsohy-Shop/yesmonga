package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n50#2:125\n49#2:126\n1057#3,6:127\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125\n67#1:126\n67#1:127,6\n*E\n"})
public final class BoxWithConstraintsKt {
    @C8540g
    @C8782q
    /* renamed from: a */
    public static final void m9860a(@C12580l C8767m mVar, @C12580l C8734c cVar, boolean z, @C12579k C11305q<? super C2365i, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(qVar, "content");
        C8592o o = oVar.mo15009o(1781813501);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(cVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14961b(z)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (o.mo15006n0(qVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) != 1170 || !o.mo15011p()) {
            if (i8 != 0) {
                mVar = C8767m.f23478j;
            }
            if (i9 != 0) {
                cVar = C8734c.f23406a.mo17061C();
            }
            if (i10 != 0) {
                z = false;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            int i11 = i3 >> 3;
            C15560f0 k = BoxKt.m9849k(cVar, z, o, (i11 & 112) | (i11 & 14));
            o.mo14918M(511388516);
            boolean n0 = o.mo15006n0(qVar) | o.mo15006n0(k);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new BoxWithConstraintsKt$BoxWithConstraints$1$1(k, qVar, i3);
                o.mo14893C(N);
            }
            o.mo15002m0();
            SubcomposeLayoutKt.m69021a(mVar, (C11304p) N, o, i3 & 14, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8734c cVar2 = cVar;
        boolean z2 = z;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BoxWithConstraintsKt$BoxWithConstraints$2(mVar2, cVar2, z2, qVar, i, i2));
        }
    }
}
