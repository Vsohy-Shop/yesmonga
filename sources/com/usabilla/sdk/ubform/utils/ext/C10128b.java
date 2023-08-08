package com.usabilla.sdk.ubform.utils.ext;

import android.app.Activity;
import com.google.android.play.core.review.C32121c;
import com.google.android.play.core.review.C32122d;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.tasks.C32227d;
import com.google.firebase.remoteconfig.C33585u;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.b */
public final class C10128b {
    /* renamed from: b */
    public static final /* synthetic */ void m38327b(Activity activity, FormType formType, FeedbackResult feedbackResult, String str) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(formType, "formType");
        Intrinsics.checkNotNullParameter(feedbackResult, FeedbackResult.f27417e);
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        C32121c a = C32122d.m130038a(activity);
        Intrinsics.checkNotNullExpressionValue(a, "create(this)");
        C32227d<ReviewInfo> a2 = a.mo92878a();
        Intrinsics.checkNotNullExpressionValue(a2, "manager.requestReviewFlow()");
        a2.mo93013a(new C10127a(activity, formType, feedbackResult, str, a));
    }

    /* renamed from: c */
    public static final void m38328c(Activity activity, FormType formType, FeedbackResult feedbackResult, String str, C32121c cVar, C32227d dVar) {
        String str2;
        Intrinsics.checkNotNullParameter(activity, "$this_showPlayStoreFlow");
        Intrinsics.checkNotNullParameter(formType, "$formType");
        Intrinsics.checkNotNullParameter(feedbackResult, "$feedbackResult");
        Intrinsics.checkNotNullParameter(str, "$entries");
        Intrinsics.checkNotNullParameter(cVar, "$manager");
        Intrinsics.checkNotNullParameter(dVar, "task");
        C10134h.m38360a(activity, formType, feedbackResult);
        C10134h.m38361b(activity, str);
        if (dVar.mo93023k()) {
            cVar.mo92879b(activity, (ReviewInfo) dVar.mo93020h());
            return;
        }
        Logger.Companion companion = Logger.f26647a;
        Exception g = dVar.mo93019g();
        if (g == null) {
            str2 = null;
        } else {
            str2 = g.getLocalizedMessage();
        }
        companion.logError(Intrinsics.stringPlus("Error showing PlayStore flow. ", str2));
    }
}
