package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import com.urbanairship.iam.events.C9175a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.s */
public final class C19466s {
    @C12579k

    /* renamed from: a */
    public static final C19466s f49855a = new C19466s();
    @C12579k

    /* renamed from: b */
    public static final AtomicBoolean f49856b = new AtomicBoolean(false);

    @C0344h1
    /* renamed from: androidx.lifecycle.s$a */
    public static final class C19467a extends C19434l {
        public void onActivityCreated(@C12579k Activity activity, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
            C19448n0.f49828b.mo57631d(activity);
        }
    }

    @C11384m
    /* renamed from: a */
    public static final void m90789a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        if (!f49856b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C19467a());
        }
    }
}
