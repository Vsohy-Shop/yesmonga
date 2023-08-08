package com.usabilla.sdk.ubform.utils.ext;

import android.app.Activity;
import com.google.android.play.core.review.C32121c;
import com.google.android.play.core.tasks.C32224a;
import com.google.android.play.core.tasks.C32227d;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.form.FormType;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.a */
public final /* synthetic */ class C10127a implements C32224a {

    /* renamed from: a */
    public final /* synthetic */ Activity f27861a;

    /* renamed from: b */
    public final /* synthetic */ FormType f27862b;

    /* renamed from: c */
    public final /* synthetic */ FeedbackResult f27863c;

    /* renamed from: d */
    public final /* synthetic */ String f27864d;

    /* renamed from: e */
    public final /* synthetic */ C32121c f27865e;

    public /* synthetic */ C10127a(Activity activity, FormType formType, FeedbackResult feedbackResult, String str, C32121c cVar) {
        this.f27861a = activity;
        this.f27862b = formType;
        this.f27863c = feedbackResult;
        this.f27864d = str;
        this.f27865e = cVar;
    }

    /* renamed from: a */
    public final void mo21579a(C32227d dVar) {
        C10128b.m38328c(this.f27861a, this.f27862b, this.f27863c, this.f27864d, this.f27865e, dVar);
    }
}
