package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.google.android.play.core.review.C32121c;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;

/* renamed from: com.google.android.play.core.review.testing.b */
public class C32132b implements C32121c {

    /* renamed from: a */
    public final Context f78354a;

    /* renamed from: b */
    public ReviewInfo f78355b;

    public C32132b(Context context) {
        this.f78354a = context;
    }

    @NonNull
    /* renamed from: a */
    public C32227d<ReviewInfo> mo92878a() {
        ReviewInfo b = ReviewInfo.m130033b(PendingIntent.getBroadcast(this.f78354a, 0, new Intent(), 0));
        this.f78355b = b;
        return C32229f.m130358a(b);
    }

    @NonNull
    /* renamed from: b */
    public C32227d<Void> mo92879b(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        return reviewInfo != this.f78355b ? C32229f.m130361d(new C32131a()) : C32229f.m130358a(null);
    }
}
