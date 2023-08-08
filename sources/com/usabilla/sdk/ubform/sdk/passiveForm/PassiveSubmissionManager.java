package com.usabilla.sdk.ubform.sdk.passiveForm;

import android.content.Context;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.p007db.unsent.C9785a;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.utils.C10140g;
import com.usabilla.sdk.ubform.utils.ext.C10136j;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

public final class PassiveSubmissionManager {
    @C12579k

    /* renamed from: a */
    public final Context f27726a;
    @C12579k

    /* renamed from: b */
    public final AppInfo f27727b;
    @C12579k

    /* renamed from: c */
    public final PassiveFormService f27728c;
    @C12579k

    /* renamed from: d */
    public final C9785a f27729d;
    @C12579k

    /* renamed from: e */
    public final C10140g f27730e;
    @C12579k

    /* renamed from: f */
    public final C12074o0 f27731f;

    public PassiveSubmissionManager(@C12579k Context context, @C12579k AppInfo appInfo, @C12579k PassiveFormService passiveFormService, @C12579k C9785a aVar, @C12579k C10140g gVar, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(passiveFormService, "submissionService");
        Intrinsics.checkNotNullParameter(aVar, "unsentFeedbackDao");
        Intrinsics.checkNotNullParameter(gVar, "payloadGenerator");
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        this.f27726a = context;
        this.f27727b = appInfo;
        this.f27728c = passiveFormService;
        this.f27729d = aVar;
        this.f27730e = gVar;
        this.f27731f = o0Var;
    }

    /* renamed from: d */
    public final void mo21491d(C9851c cVar) {
        Logger.f26647a.logInfo("Add unsent feedback to retry queue");
        C11723c2 unused = C12038j.m48061f(this.f27731f, (CoroutineContext) null, (CoroutineStart) null, new PassiveSubmissionManager$addToRetryQueue$1(this, cVar, (C11045c<? super PassiveSubmissionManager$addToRetryQueue$1>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public final void mo21492e(@C12579k FormModel formModel, @C12579k ClientModel clientModel) {
        String str;
        UbScreenshot ubScreenshot;
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(clientModel, "clientModel");
        ScreenshotModel a = C10136j.m38363a(formModel.getPages());
        if (a == null || (ubScreenshot = (UbScreenshot) a.mo20973d()) == null) {
            str = null;
        } else {
            str = ubScreenshot.mo20543c(this.f27726a);
        }
        C11723c2 unused = C12038j.m48061f(this.f27731f, (CoroutineContext) null, (CoroutineStart) null, new PassiveSubmissionManager$submitPassiveForm$1(this, this.f27730e.mo21587d(this.f27727b, formModel, clientModel, str), (C11045c<? super PassiveSubmissionManager$submitPassiveForm$1>) null), 3, (Object) null);
    }
}
