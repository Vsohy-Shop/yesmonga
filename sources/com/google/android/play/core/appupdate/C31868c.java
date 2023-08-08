package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import android.support.annotation.NonNull;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.install.C32019a;
import com.google.android.play.core.install.model.C32022b;
import com.google.android.play.core.tasks.C32227d;

/* renamed from: com.google.android.play.core.appupdate.c */
public interface C31868c {
    /* renamed from: a */
    boolean mo92400a(@NonNull C31865a aVar, @NonNull Activity activity, @NonNull C31870e eVar, int i) throws IntentSender.SendIntentException;

    /* renamed from: b */
    boolean mo92401b(@NonNull C31865a aVar, @C32022b int i, @NonNull C32014a aVar2, int i2) throws IntentSender.SendIntentException;

    @NonNull
    /* renamed from: c */
    C32227d<Void> mo92402c();

    @NonNull
    /* renamed from: d */
    C32227d<C31865a> mo92403d();

    /* renamed from: e */
    void mo92404e(@NonNull C32019a aVar);

    /* renamed from: f */
    boolean mo92405f(@NonNull C31865a aVar, @NonNull C32014a aVar2, @NonNull C31870e eVar, int i) throws IntentSender.SendIntentException;

    /* renamed from: g */
    C32227d<Integer> mo92406g(@NonNull C31865a aVar, @NonNull Activity activity, @NonNull C31870e eVar);

    /* renamed from: h */
    boolean mo92407h(@NonNull C31865a aVar, @C32022b int i, @NonNull Activity activity, int i2) throws IntentSender.SendIntentException;

    /* renamed from: i */
    void mo92408i(@NonNull C32019a aVar);
}
