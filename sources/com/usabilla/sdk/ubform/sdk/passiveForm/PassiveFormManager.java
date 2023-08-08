package com.usabilla.sdk.ubform.sdk.passiveForm;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.field.UbScreenshotType;
import com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.utils.ext.C10130d;
import com.usabilla.sdk.ubform.utils.ext.C10134h;
import com.usabilla.sdk.ubform.utils.ext.C10136j;
import java.io.File;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PassiveFormManager {
    @C12579k

    /* renamed from: a */
    public final File f27699a;
    @C12579k

    /* renamed from: b */
    public final PassiveFormStore f27700b;
    @C12580l

    /* renamed from: c */
    public FormModel f27701c;

    public PassiveFormManager(@C12579k File file, @C12579k PassiveFormStore passiveFormStore) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(passiveFormStore, "store");
        this.f27699a = file;
        this.f27700b = passiveFormStore;
    }

    /* renamed from: c */
    public final void mo21469c(FormModel formModel, Bitmap bitmap) {
        C10130d.m38334d(bitmap, this.f27699a);
        Uri fromFile = Uri.fromFile(this.f27699a);
        if (fromFile != null) {
            String uri = fromFile.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
            UbScreenshot ubScreenshot = new UbScreenshot(uri, UbScreenshotType.URI, false, 4, (DefaultConstructorMarker) null);
            ScreenshotModel a = C10136j.m38363a(formModel.getPages());
            if (a != null) {
                a.mo20983q(ubScreenshot);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo21470d(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C10134h.m38360a(context, FormType.PASSIVE_FEEDBACK, new FeedbackResult(-1, -1, false));
        FormModel formModel = this.f27701c;
        if (formModel == null) {
            return true;
        }
        C10134h.m38361b(context, formModel.generateEntriesString());
        return true;
    }

    @C12579k
    /* renamed from: e */
    public final C11907e<FormModel> mo21471e(@C12579k String str, @C12580l Bitmap bitmap, @C12580l UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(str, "formId");
        return new PassiveFormManager$getForm$$inlined$map$1(C11909g.m47494u(this.f27700b.mo21485c(str), new PassiveFormManager$getForm$1((C11045c<? super PassiveFormManager$getForm$1>) null)), ubInternalTheme, str, bitmap, this);
    }

    @C12579k
    /* renamed from: f */
    public final C11907e<Integer> mo21472f() {
        return this.f27700b.mo21487e();
    }
}
