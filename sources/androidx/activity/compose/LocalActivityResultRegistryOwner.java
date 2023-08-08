package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.C0304i;
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
@C11363r0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"})
public final class LocalActivityResultRegistryOwner {
    @C12579k

    /* renamed from: a */
    public static final LocalActivityResultRegistryOwner f706a = new LocalActivityResultRegistryOwner();
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C0304i> f707b = CompositionLocalKt.m29858d((C8410b2) null, LocalActivityResultRegistryOwner$LocalComposition$1.f709f, 1, (Object) null);

    /* renamed from: c */
    public static final int f708c = 0;

    @C8540g
    @C12580l
    @C11314h(name = "getCurrent")
    /* renamed from: a */
    public final C0304i mo795a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1418020823);
        C0304i iVar = (C0304i) oVar.mo15032w(f707b);
        if (iVar == null) {
            Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof C0304i) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(context, "innerContext.baseContext");
                }
            }
            iVar = (C0304i) context;
        }
        oVar.mo15002m0();
        return iVar;
    }

    @C12579k
    /* renamed from: b */
    public final C8572j1<C0304i> mo796b(@C12579k C0304i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "registryOwner");
        return f707b.mo16141f(iVar);
    }
}
