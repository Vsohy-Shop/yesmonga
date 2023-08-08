package androidx.hilt.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C19502x0;
import androidx.navigation.NavBackStackEntry;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.internal.lifecycle.C10202d;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "HiltViewModelFactory")
/* renamed from: androidx.hilt.navigation.a */
public final class C19284a {
    @C11314h(name = "create")
    @C12579k
    /* renamed from: a */
    public static final C19502x0.C19506b m90443a(@C12579k Context context, @C12579k NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                C19502x0.C19506b d = C10202d.m38430d((Activity) context, navBackStackEntry, navBackStackEntry.mo58062d(), navBackStackEntry.getDefaultViewModelProviderFactory());
                Intrinsics.checkNotNullExpressionValue(d, "HiltViewModelFactory.cre…delProviderFactory,\n    )");
                return d;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory for a " + "NavBackStackEntry but instead found: " + context);
    }
}
