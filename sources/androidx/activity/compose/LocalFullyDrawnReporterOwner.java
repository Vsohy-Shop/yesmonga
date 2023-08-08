package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.C0308s;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
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
@C11363r0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,176:1\n76#2:177\n76#2:178\n76#2:179\n23#3,8:180\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n106#1:177\n107#1:178\n108#1:179\n108#1:180,8\n*E\n"})
public final class LocalFullyDrawnReporterOwner {
    @C12579k

    /* renamed from: a */
    public static final LocalFullyDrawnReporterOwner f710a = new LocalFullyDrawnReporterOwner();
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C0308s> f711b = CompositionLocalKt.m29858d((C8410b2) null, LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1.f713f, 1, (Object) null);

    /* renamed from: c */
    public static final int f712c = 0;

    @C8540g
    @C12580l
    @C11314h(name = "getCurrent")
    /* renamed from: a */
    public final C0308s mo798a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(540186968);
        C0308s sVar = (C0308s) oVar.mo15032w(f711b);
        oVar.mo14918M(1606493384);
        if (sVar == null) {
            sVar = ViewTreeFullyDrawnReporterOwner.m1263a((View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k()));
        }
        oVar.mo15002m0();
        if (sVar == null) {
            Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof C0308s) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(context, "innerContext.baseContext");
                }
            }
            sVar = (C0308s) context;
        }
        oVar.mo15002m0();
        return sVar;
    }

    @C12579k
    /* renamed from: b */
    public final C8572j1<C0308s> mo799b(@C12579k C0308s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "fullyDrawnReporterOwner");
        return f711b.mo16141f(sVar);
    }
}
