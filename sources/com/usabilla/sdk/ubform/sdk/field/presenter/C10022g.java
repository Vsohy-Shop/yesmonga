package com.usabilla.sdk.ubform.sdk.field.presenter;

import android.content.Context;
import android.graphics.Bitmap;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.bus.Bus;
import com.usabilla.sdk.ubform.bus.BusEvent;
import com.usabilla.sdk.ubform.bus.C9746b;
import com.usabilla.sdk.ubform.screenshot.UbImageSource;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.field.UbScreenshotType;
import com.usabilla.sdk.ubform.sdk.field.contract.C9980h;
import com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import com.usabilla.sdk.ubform.utils.behavior.C10114a;
import com.usabilla.sdk.ubform.utils.behavior.C10115b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.g */
public final class C10022g extends FieldPresenter<ScreenshotModel, UbScreenshot> implements C9980h.C9981a, C9746b {
    @C12580l

    /* renamed from: f */
    public final String f27513f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10022g(@C12579k ScreenshotModel screenshotModel, @C12579k C10061a.C10062a aVar) {
        super(screenshotModel, aVar);
        Intrinsics.checkNotNullParameter(screenshotModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
        this.f27513f = screenshotModel.mo20917x();
    }

    /* renamed from: I */
    public void mo20856I() {
        ((ScreenshotModel) mo20826p()).mo20900n();
        mo21034j0((UbImageSource) null);
    }

    /* renamed from: O */
    public void mo20466O() {
        super.mo20466O();
        Bus.f26721a.mo19921d(BusEvent.SCREENSHOT_SELECTED);
    }

    @C12580l
    /* renamed from: P */
    public Bitmap mo20857P(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        UbScreenshot ubScreenshot = (UbScreenshot) ((ScreenshotModel) mo20826p()).mo20973d();
        if (ubScreenshot == null) {
            return null;
        }
        return ubScreenshot.mo20544d(context);
    }

    @C12580l
    /* renamed from: Z */
    public String mo20858Z() {
        return this.f27513f;
    }

    /* renamed from: a */
    public void mo20859a(@C12580l UbScreenshot ubScreenshot) {
        mo21027g0().mo20717a(ubScreenshot);
    }

    /* renamed from: i0 */
    public void mo20824R(@C12579k UbScreenshot ubScreenshot) {
        Intrinsics.checkNotNullParameter(ubScreenshot, "newValue");
        ((ScreenshotModel) mo20826p()).mo20983q(ubScreenshot);
    }

    /* renamed from: j0 */
    public final void mo21034j0(UbImageSource ubImageSource) {
        String str;
        C10114a aVar = new C10114a(C10115b.C10116a.f27829a);
        if (ubImageSource == null) {
            str = null;
        } else {
            str = ubImageSource.mo20359q();
        }
        aVar.mo21558a(C10115b.C10116a.f27831c, str).mo21559b();
    }

    /* renamed from: u */
    public void mo20469u() {
        super.mo20469u();
        Bus.f26721a.mo19919b(BusEvent.SCREENSHOT_SELECTED, this);
        UbScreenshot ubScreenshot = (UbScreenshot) ((ScreenshotModel) mo20826p()).mo20973d();
        boolean z = false;
        if (ubScreenshot != null && ubScreenshot.mo20550i()) {
            z = true;
        }
        if (z) {
            mo21034j0(UbImageSource.DEFAULT);
        }
    }

    /* renamed from: v */
    public <T> void mo19932v(@C12579k BusEvent busEvent, T t) {
        Intrinsics.checkNotNullParameter(busEvent, "event");
        if (busEvent == BusEvent.SCREENSHOT_SELECTED) {
            ScreenshotModel screenshotModel = (ScreenshotModel) mo20826p();
            if (t != null) {
                screenshotModel.mo20983q(new UbScreenshot((String) t, UbScreenshotType.URI, false, 4, (DefaultConstructorMarker) null));
                FieldView<?> j = mo20825j();
                if (j != null) {
                    ((C9980h.C9982b) j).setupScreenshot();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.field.contract.ScreenshotContract.View");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }
}
