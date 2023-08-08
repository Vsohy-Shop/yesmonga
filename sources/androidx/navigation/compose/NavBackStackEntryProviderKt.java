package androidx.navigation.compose;

import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.saveable.C8623b;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.compose.C19490c;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import java.lang.ref.WeakReference;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class NavBackStackEntryProviderKt {
    @C8540g
    /* renamed from: a */
    public static final void m91702a(@C12579k NavBackStackEntry navBackStackEntry, @C12579k C8623b bVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-1579360880);
        CompositionLocalKt.m29856b(new C8572j1[]{LocalViewModelStoreOwner.f49869a.mo57682b(navBackStackEntry), AndroidCompositionLocals_androidKt.m70954i().mo16141f(navBackStackEntry), AndroidCompositionLocals_androidKt.m70955j().mo16141f(navBackStackEntry)}, C8553b.m31048b(o, -52928304, true, new NavBackStackEntryProviderKt$LocalOwnersProvider$1(bVar, pVar, i)), o, 56);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new NavBackStackEntryProviderKt$LocalOwnersProvider$2(navBackStackEntry, bVar, pVar, i));
        }
    }

    @C8540g
    /* renamed from: b */
    public static final void m91703b(C8623b bVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8592o oVar, int i) {
        C19477a aVar;
        C8592o o = oVar.mo15009o(1211832233);
        o.mo14918M(1729797275);
        C19395b1 a = LocalViewModelStoreOwner.f49869a.mo57681a(o, 6);
        if (a != null) {
            if (a instanceof C19455p) {
                aVar = ((C19455p) a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(aVar, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                aVar = C19477a.C19478a.f49866b;
            }
            C19476v0 g = C19490c.m90839g(C19709a.class, a, (String) null, (C19502x0.C19506b) null, aVar, o, 36936, 0);
            o.mo15002m0();
            C19709a aVar2 = (C19709a) g;
            aVar2.mo58374e0(new WeakReference(bVar));
            bVar.mo8711d(aVar2.mo58372c0(), pVar, o, (i & 112) | 520);
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new NavBackStackEntryProviderKt$SaveableStateProvider$1(bVar, pVar, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
