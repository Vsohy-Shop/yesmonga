package com.carrefour.fid.android.design.components.extension;

import android.view.View;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.extension.h */
public final class C37117h implements View.OnAttachStateChangeListener, C11300l<Throwable, C11079d2> {
    @C12579k

    /* renamed from: a */
    public final View f92912a;
    @C12579k

    /* renamed from: b */
    public final C11723c2 f92913b;

    public C37117h(@C12579k View view, @C12579k C11723c2 c2Var) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(c2Var, "job");
        this.f92912a = view;
        this.f92913b = c2Var;
    }

    /* renamed from: a */
    public void mo112727a(@C12580l Throwable th) {
        this.f92912a.removeOnAttachStateChangeListener(this);
        C11723c2.C11724a.m46184b(this.f92913b, (CancellationException) null, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo112727a((Throwable) obj);
        return C11079d2.f28267a;
    }

    public void onViewAttachedToWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
    }

    public void onViewDetachedFromWindow(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        this.f92912a.removeOnAttachStateChangeListener(this);
        C11723c2.C11724a.m46184b(this.f92913b, (CancellationException) null, 1, (Object) null);
    }
}
