package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.field.model.PickerModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10020e;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J,\u0010\u0011\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/UbSpinner;", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "Landroid/widget/AdapterView$OnItemClickListener;", "", "enoughToFilter", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Landroid/widget/AdapterView;", "adapterView", "Landroid/view/View;", "view", "", "pos", "", "id", "Lkotlin/d2;", "onItemClick", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/e;", "e", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/e;", "getPresenter", "()Lcom/usabilla/sdk/ubform/sdk/field/presenter/e;", "presenter", "f", "Z", "isPopupShown", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/e;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbSpinner extends AppCompatAutoCompleteTextView implements AdapterView.OnItemClickListener {
    @C12579k

    /* renamed from: e */
    public final C10020e f26771e;

    /* renamed from: f */
    public boolean f26772f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbSpinner(@C12579k Context context, @C12579k C10020e eVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(eVar, "presenter");
        this.f26771e = eVar;
        setSingleLine();
        setOnItemClickListener(this);
        setKeyListener((KeyListener) null);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C10133g.m38356r(context, C9747c.C9755h.ub_arrow_drop_down, ((PickerModel) eVar.mo20826p()).mo20976g().getColors().getTitle(), true), (Drawable) null);
    }

    public boolean enoughToFilter() {
        return true;
    }

    @C12579k
    public final C10020e getPresenter() {
        return this.f26771e;
    }

    public void onItemClick(@C12579k AdapterView<?> adapterView, @C12579k View view, int i, long j) {
        Intrinsics.checkNotNullParameter(adapterView, "adapterView");
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f26772f = false;
        setSelection(0);
        this.f26771e.mo21031i0(i);
    }

    public boolean onTouchEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f26772f) {
                dismissDropDown();
            } else {
                requestFocus();
                showDropDown();
                z = true;
            }
            this.f26772f = z;
        }
        return super.onTouchEvent(motionEvent);
    }
}
