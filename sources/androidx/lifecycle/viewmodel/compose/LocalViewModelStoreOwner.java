package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,53:1\n76#2:54\n76#2:55\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n41#1:54\n42#1:55\n*E\n"})
public final class LocalViewModelStoreOwner {
    @C12579k

    /* renamed from: a */
    public static final LocalViewModelStoreOwner f49869a = new LocalViewModelStoreOwner();
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C19395b1> f49870b = CompositionLocalKt.m29858d((C8410b2) null, LocalViewModelStoreOwner$LocalViewModelStoreOwner$1.f49872f, 1, (Object) null);

    /* renamed from: c */
    public static final int f49871c = 0;

    @C8540g
    @C12580l
    @C11314h(name = "getCurrent")
    /* renamed from: a */
    public final C19395b1 mo57681a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-584162872);
        C19395b1 b1Var = (C19395b1) oVar.mo15032w(f49870b);
        if (b1Var == null) {
            b1Var = ViewTreeViewModelStoreOwner.m90624a((View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k()));
        }
        oVar.mo15002m0();
        return b1Var;
    }

    @C12579k
    /* renamed from: b */
    public final C8572j1<C19395b1> mo57682b(@C12579k C19395b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "viewModelStoreOwner");
        return f49870b.mo16141f(b1Var);
    }
}
