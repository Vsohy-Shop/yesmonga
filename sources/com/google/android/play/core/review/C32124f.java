package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.review.f */
public final class C32124f implements C32121c {

    /* renamed from: a */
    public final C32129k f78341a;

    /* renamed from: b */
    public final Handler f78342b = new Handler(Looper.getMainLooper());

    public C32124f(C32129k kVar) {
        this.f78341a = kVar;
    }

    @NonNull
    /* renamed from: a */
    public final C32227d<ReviewInfo> mo92878a() {
        return this.f78341a.mo92880a();
    }

    @NonNull
    /* renamed from: b */
    public final C32227d<Void> mo92879b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo92871a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C32239p pVar = new C32239p();
        intent.putExtra("result_receiver", new C32120b(this.f78342b, pVar));
        activity.startActivity(intent);
        return pVar.mo93032c();
    }
}
