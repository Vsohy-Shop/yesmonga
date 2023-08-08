package com.usabilla.sdk.ubform.utils;

import android.os.SystemClock;
import android.view.View;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.utils.i */
public final class C10142i implements View.OnClickListener {

    /* renamed from: a */
    public int f27902a;
    @C12579k

    /* renamed from: b */
    public final C11300l<View, C11079d2> f27903b;

    /* renamed from: c */
    public long f27904c;

    public C10142i(int i, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onSafeCLick");
        this.f27902a = i;
        this.f27903b = lVar;
    }

    public void onClick(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
        if (SystemClock.elapsedRealtime() - this.f27904c >= ((long) this.f27902a)) {
            this.f27904c = SystemClock.elapsedRealtime();
            this.f27903b.invoke(view);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10142i(int i, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000 : i, lVar);
    }
}
