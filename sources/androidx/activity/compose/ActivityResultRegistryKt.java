package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0304i;
import androidx.activity.result.contract.C0266a;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"})
public final class ActivityResultRegistryKt {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final <I, O> C0228d<I, O> m1275a(@C12579k C0266a<I, O> aVar, @C12579k C11300l<? super O, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        C0266a<I, O> aVar2 = aVar;
        C11300l<? super O, C11079d2> lVar2 = lVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(aVar, "contract");
        Intrinsics.checkNotNullParameter(lVar2, "onResult");
        oVar2.mo14918M(-1408504823);
        C8578k2<T> t = C8415c2.m30251t(aVar, oVar2, 8);
        C8578k2<T> t2 = C8415c2.m30251t(lVar2, oVar2, (i >> 3) & 14);
        Object d = RememberSaveableKt.m31343d(new Object[0], (C8628e) null, (String) null, ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.f703f, oVar, 3080, 6);
        Intrinsics.checkNotNullExpressionValue(d, "rememberSaveable { UUID.randomUUID().toString() }");
        String str = (String) d;
        C0304i a = LocalActivityResultRegistryOwner.f706a.mo795a(oVar2, 6);
        if (a != null) {
            ActivityResultRegistry i2 = a.mo715i();
            oVar2.mo14918M(-3687241);
            Object N = oVar.mo14921N();
            C8592o.C8593a aVar3 = C8592o.f23032a;
            if (N == aVar3.mo16277a()) {
                N = new C0226b();
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            C0226b bVar = (C0226b) N;
            oVar2.mo14918M(-3687241);
            Object N2 = oVar.mo14921N();
            if (N2 == aVar3.mo16277a()) {
                N2 = new C0228d(bVar, t);
                oVar2.mo14893C(N2);
            }
            oVar.mo15002m0();
            C0228d<I, O> dVar = (C0228d) N2;
            EffectsKt.m29889a(i2, str, aVar, new ActivityResultRegistryKt$rememberLauncherForActivityResult$1(bVar, i2, str, aVar, t2), oVar, 520);
            oVar.mo15002m0();
            return dVar;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}
