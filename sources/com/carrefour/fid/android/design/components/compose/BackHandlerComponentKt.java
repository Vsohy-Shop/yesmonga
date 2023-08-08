package com.carrefour.fid.android.design.components.compose;

import androidx.activity.C0213a0;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.C19499w;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBackHandlerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BackHandlerComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n76#2:41\n25#3:42\n50#3:49\n49#3:50\n1114#4,6:43\n1114#4,6:51\n76#5:57\n*S KotlinDebug\n*F\n+ 1 BackHandlerComponent.kt\ncom/carrefour/fid/android/design/components/compose/BackHandlerComponentKt\n*L\n16#1:41\n17#1:42\n29#1:49\n29#1:50\n17#1:43,6\n29#1:51,6\n15#1:57\n*E\n"})
public final class BackHandlerComponentKt {

    /* renamed from: com.carrefour.fid.android.design.components.compose.BackHandlerComponentKt$a */
    public static final class C36916a extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ C8578k2<C11289a<C11079d2>> f92090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36916a(boolean z, C8578k2<? extends C11289a<C11079d2>> k2Var) {
            super(z);
            this.f92090d = k2Var;
        }

        /* renamed from: f */
        public void mo792f() {
            BackHandlerComponentKt.m151320b(this.f92090d).invoke();
        }
    }

    @C8540g
    /* renamed from: a */
    public static final void m151319a(boolean z, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(aVar, "onBack");
        C8592o o = oVar.mo15009o(-1770278673);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo14927P(aVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                z = true;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1770278673, i3, -1, "com.carrefour.fid.android.design.components.compose.BackHandler (BackHandlerComponent.kt:13)");
            }
            C8578k2<T> t = C8415c2.m30251t(aVar, o, (i3 >> 3) & 14);
            C19499w wVar = (C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i());
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar2 = C8592o.f23032a;
            if (N == aVar2.mo16277a()) {
                N = new C36916a(z, t);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C36916a aVar3 = (C36916a) N;
            C0213a0 a = LocalOnBackPressedDispatcherOwner.f714a.mo801a(o, LocalOnBackPressedDispatcherOwner.f716c);
            if (a != null) {
                OnBackPressedDispatcher Z = a.mo702Z();
                Boolean valueOf = Boolean.valueOf(z);
                o.mo14918M(511388516);
                boolean n0 = o.mo15006n0(valueOf) | o.mo15006n0(aVar3);
                Object N2 = o.mo14921N();
                if (n0 || N2 == aVar2.mo16277a()) {
                    N2 = new BackHandlerComponentKt$BackHandler$1$1(aVar3, z);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                EffectsKt.m29899k((C11289a) N2, o, 0);
                EffectsKt.m29890b(wVar, Z, new BackHandlerComponentKt$BackHandler$2(Z, wVar, aVar3), o, 72);
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided on LocalOnBackPressedDispatcherOwner".toString());
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BackHandlerComponentKt$BackHandler$3(z, aVar, i, i2));
        }
    }

    /* renamed from: b */
    public static final C11289a<C11079d2> m151320b(C8578k2<? extends C11289a<C11079d2>> k2Var) {
        return (C11289a) k2Var.getValue();
    }
}
