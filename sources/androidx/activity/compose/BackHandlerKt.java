package androidx.activity.compose;

import androidx.activity.C0213a0;
import androidx.activity.C0309t;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.C19499w;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n50#2:118\n49#2:119\n955#3,6:112\n955#3,6:120\n76#4:126\n89#5:127\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111\n94#1:118\n94#1:119\n86#1:112,6\n94#1:120,6\n100#1:126\n84#1:127\n*E\n"})
public final class BackHandlerKt {

    /* renamed from: androidx.activity.compose.BackHandlerKt$a */
    public static final class C0220a extends C0309t {

        /* renamed from: d */
        public final /* synthetic */ C8578k2<C11289a<C11079d2>> f704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0220a(boolean z, C8578k2<? extends C11289a<C11079d2>> k2Var) {
            super(z);
            this.f704d = k2Var;
        }

        /* renamed from: f */
        public void mo792f() {
            BackHandlerKt.m1280b(this.f704d).invoke();
        }
    }

    @C8540g
    /* renamed from: a */
    public static final void m1279a(boolean z, @C12579k C11289a<C11079d2> aVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(aVar, "onBack");
        C8592o o = oVar.mo15009o(-361453782);
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
            if (o.mo15006n0(aVar)) {
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
            C8578k2<T> t = C8415c2.m30251t(aVar, o, (i3 >> 3) & 14);
            o.mo14918M(-3687241);
            Object N = o.mo14921N();
            C8592o.C8593a aVar2 = C8592o.f23032a;
            if (N == aVar2.mo16277a()) {
                N = new C0220a(z, t);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C0220a aVar3 = (C0220a) N;
            Boolean valueOf = Boolean.valueOf(z);
            o.mo14918M(-3686552);
            boolean n0 = o.mo15006n0(valueOf) | o.mo15006n0(aVar3);
            Object N2 = o.mo14921N();
            if (n0 || N2 == aVar2.mo16277a()) {
                N2 = new BackHandlerKt$BackHandler$1$1(aVar3, z);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            EffectsKt.m29899k((C11289a) N2, o, 0);
            C0213a0 a = LocalOnBackPressedDispatcherOwner.f714a.mo801a(o, 6);
            if (a != null) {
                OnBackPressedDispatcher Z = a.mo702Z();
                C19499w wVar = (C19499w) o.mo15032w(AndroidCompositionLocals_androidKt.m70954i());
                EffectsKt.m29890b(wVar, Z, new BackHandlerKt$BackHandler$2(Z, wVar, aVar3), o, 72);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BackHandlerKt$BackHandler$3(z, aVar, i, i2));
        }
    }

    /* renamed from: b */
    public static final C11289a<C11079d2> m1280b(C8578k2<? extends C11289a<C11079d2>> k2Var) {
        return (C11289a) k2Var.getValue();
    }
}
