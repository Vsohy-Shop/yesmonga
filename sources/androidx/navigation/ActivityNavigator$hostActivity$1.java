package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class ActivityNavigator$hostActivity$1 extends Lambda implements C11300l<Context, Context> {

    /* renamed from: f */
    public static final ActivityNavigator$hostActivity$1 f50341f = new ActivityNavigator$hostActivity$1();

    public ActivityNavigator$hostActivity$1() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final Context invoke(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
