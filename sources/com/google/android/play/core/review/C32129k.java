package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32041d;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32084r0;
import com.google.android.play.core.internal.C32092u;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.review.k */
public final class C32129k {

    /* renamed from: c */
    public static final C32062k f78349c = new C32062k("ReviewService");
    @Nullable

    /* renamed from: a */
    public C32092u<C32041d> f78350a;

    /* renamed from: b */
    public final String f78351b;

    public C32129k(Context context) {
        this.f78351b = context.getPackageName();
        if (C32084r0.m129917a(context)) {
            Context context2 = context;
            this.f78350a = new C32092u(context2, f78349c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C32125g.f78343a);
        }
    }

    /* renamed from: a */
    public final C32227d<ReviewInfo> mo92880a() {
        C32062k kVar = f78349c;
        kVar.mo92778d("requestInAppReview (%s)", this.f78351b);
        if (this.f78350a == null) {
            kVar.mo92776b("Play Store app is either not installed or not the official version", new Object[0]);
            return C32229f.m130361d(new C32123e());
        }
        C32239p pVar = new C32239p();
        this.f78350a.mo92829a(new C32126h(this, pVar, pVar));
        return pVar.mo93032c();
    }
}
