package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.google.firebase.analytics.ktx.c */
public final class C32556c {
    @C12579k

    /* renamed from: a */
    public final Bundle f79027a = new Bundle();

    @C12579k
    /* renamed from: a */
    public final Bundle mo94668a() {
        return this.f79027a;
    }

    /* renamed from: b */
    public final void mo94669b(@C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f79027a.putDouble(str, d);
    }

    /* renamed from: c */
    public final void mo94670c(@C12579k String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f79027a.putLong(str, j);
    }

    /* renamed from: d */
    public final void mo94671d(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(bundle, "value");
        this.f79027a.putBundle(str, bundle);
    }

    /* renamed from: e */
    public final void mo94672e(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.f79027a.putString(str, str2);
    }

    /* renamed from: f */
    public final void mo94673f(@C12579k String str, @C12579k Bundle[] bundleArr) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(bundleArr, "value");
        this.f79027a.putParcelableArray(str, (Parcelable[]) bundleArr);
    }
}
