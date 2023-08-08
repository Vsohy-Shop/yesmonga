package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.C0213a0;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
public final class LocalOnBackPressedDispatcherOwner {
    @C12579k

    /* renamed from: a */
    public static final LocalOnBackPressedDispatcherOwner f714a = new LocalOnBackPressedDispatcherOwner();
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C0213a0> f715b = CompositionLocalKt.m29858d((C8410b2) null, C0222xbb3fc51f.f717f, 1, (Object) null);

    /* renamed from: c */
    public static final int f716c = 0;

    @C8540g
    @C12580l
    @C11314h(name = "getCurrent")
    /* renamed from: a */
    public final C0213a0 mo801a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-2068013981);
        C0213a0 a0Var = (C0213a0) oVar.mo15032w(f715b);
        oVar.mo14918M(1680121597);
        if (a0Var == null) {
            a0Var = ViewTreeOnBackPressedDispatcherOwner.m1267a((View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k()));
        }
        oVar.mo15002m0();
        if (a0Var == null) {
            Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof C0213a0) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(context, "innerContext.baseContext");
                }
            }
            a0Var = (C0213a0) context;
        }
        oVar.mo15002m0();
        return a0Var;
    }

    @C12579k
    /* renamed from: b */
    public final C8572j1<C0213a0> mo802b(@C12579k C0213a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "dispatcherOwner");
        return f715b.mo16141f(a0Var);
    }
}
