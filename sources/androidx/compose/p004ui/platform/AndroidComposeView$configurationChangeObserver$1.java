package androidx.compose.p004ui.platform;

import android.content.res.Configuration;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/content/res/Configuration;", "it", "Lkotlin/d2;", "a", "(Landroid/content/res/Configuration;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1 */
public final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements C11300l<Configuration, C11079d2> {

    /* renamed from: f */
    public static final AndroidComposeView$configurationChangeObserver$1 f39190f = new AndroidComposeView$configurationChangeObserver$1();

    public AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo45370a(@C12579k Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo45370a((Configuration) obj);
        return C11079d2.f28267a;
    }
}
