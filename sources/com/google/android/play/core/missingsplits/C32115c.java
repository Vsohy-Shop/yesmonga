package com.google.android.play.core.missingsplits;

import android.content.Context;
import android.support.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
/* renamed from: com.google.android.play.core.missingsplits.c */
public class C32115c {

    /* renamed from: a */
    public static final AtomicReference<Boolean> f78330a = new AtomicReference<>((Object) null);

    @Deprecated
    @NonNull
    /* renamed from: a */
    public static C32114b m130020a(@NonNull Context context) {
        return new C32118f(context, Runtime.getRuntime(), new C32116d(context, context.getPackageManager()), f78330a);
    }
}
