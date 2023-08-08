package com.usabilla.sdk.ubform.utils.ext;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.C19552a;
import com.google.firebase.remoteconfig.C33585u;
import com.usabilla.sdk.ubform.C9771d;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.form.C10050c;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.h */
public final class C10134h {
    /* renamed from: a */
    public static final /* synthetic */ void m38360a(Context context, FormType formType, FeedbackResult feedbackResult) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(formType, "formType");
        C19552a.m91036b(context).mo57835d(C10050c.f27644a.mo21171a(formType, feedbackResult));
    }

    /* renamed from: b */
    public static final /* synthetic */ void m38361b(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, C33585u.C33588c.f81747z3);
        C19552a b = C19552a.m91036b(context);
        Intent intent = new Intent(C9771d.f26776d);
        intent.putExtra(FeedbackResult.f27419g, str);
        C11079d2 d2Var = C11079d2.f28267a;
        b.mo57835d(intent);
    }
}
