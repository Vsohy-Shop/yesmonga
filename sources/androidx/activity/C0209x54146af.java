package androidx.activity;

import android.view.View;
import androidx.activity.C0235d0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/View;", "it", "Landroidx/activity/s;", "a", "(Landroid/view/View;)Landroidx/activity/s;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 */
public final class C0209x54146af extends Lambda implements C11300l<View, C0308s> {

    /* renamed from: f */
    public static final C0209x54146af f694f = new C0209x54146af();

    public C0209x54146af() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final C0308s invoke(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        Object tag = view.getTag(C0235d0.C0236a.report_drawn);
        if (tag instanceof C0308s) {
            return (C0308s) tag;
        }
        return null;
    }
}
