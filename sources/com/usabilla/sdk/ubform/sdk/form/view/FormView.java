package com.usabilla.sdk.ubform.sdk.form.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.sdk.form.FormViewPager;
import com.usabilla.sdk.ubform.sdk.form.contract.C10053a;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.presenter.C10058c;
import com.usabilla.sdk.ubform.sdk.page.presenter.PagePresenter;
import com.usabilla.sdk.ubform.sdk.page.view.PageView;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b4\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010%\u001a\n \u001d*\u0004\u0018\u00010\"0\"8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b#\u0010$R.\u0010,\u001a\u0004\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u00168\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u00101\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00066"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/view/FormView;", "Landroid/widget/RelativeLayout;", "Lcom/usabilla/sdk/ubform/sdk/form/contract/a$b;", "Lkotlin/d2;", "onDetachedFromWindow", "", "pageIndex", "d", "backgroundColor", "accentColor", "maxPages", "setupProgressBar", "c", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "setTheme", "", "Lcom/usabilla/sdk/ubform/sdk/page/presenter/PagePresenter;", "pagePresenters", "a", "progress", "b", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;", "presenter", "e", "Lcom/usabilla/sdk/ubform/sdk/form/view/a;", "Lcom/usabilla/sdk/ubform/sdk/form/view/a;", "formAdapter", "Landroid/widget/ProgressBar;", "kotlin.jvm.PlatformType", "Lkotlin/z;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "Lcom/usabilla/sdk/ubform/sdk/form/FormViewPager;", "getPager", "()Lcom/usabilla/sdk/ubform/sdk/form/FormViewPager;", "pager", "value", "Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;", "getFormPresenter", "()Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;", "setFormPresenter", "(Lcom/usabilla/sdk/ubform/sdk/form/presenter/c;)V", "formPresenter", "Lcom/usabilla/sdk/ubform/sdk/form/FormViewPager;", "viewPager", "getCurrentItem", "()I", "currentItem", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/form/view/a;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class FormView extends RelativeLayout implements C10053a.C10055b {
    @C12579k

    /* renamed from: a */
    public final C10060a f27657a;
    @C12579k

    /* renamed from: b */
    public final C11677z f27658b = C10864b0.m38748c(new FormView$progressBar$2(this));
    @C12579k

    /* renamed from: c */
    public final C11677z f27659c = C10864b0.m38748c(new FormView$pager$2(this));
    @C12580l

    /* renamed from: d */
    public C10058c f27660d;
    @C12579k

    /* renamed from: e */
    public final FormViewPager f27661e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormView(@C12579k Context context, @C12579k C10060a aVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "formAdapter");
        this.f27657a = aVar;
        View.inflate(context, C9747c.C9759l.ub_form, this);
        FormViewPager pager = getPager();
        Intrinsics.checkNotNullExpressionValue(pager, C9175a.f24940g0);
        this.f27661e = pager;
    }

    private final FormViewPager getPager() {
        return (FormViewPager) this.f27659c.getValue();
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.f27658b.getValue();
    }

    /* renamed from: a */
    public void mo21181a(@C12579k List<PagePresenter> list) {
        Intrinsics.checkNotNullParameter(list, "pagePresenters");
        for (PagePresenter pageView : list) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            this.f27657a.mo21376v(new PageView(context, pageView));
        }
        this.f27661e.setAdapter(this.f27657a);
    }

    /* renamed from: b */
    public void mo21182b(int i) {
        getProgressBar().setProgress(i);
    }

    /* renamed from: c */
    public void mo21183c() {
        getProgressBar().setVisibility(8);
    }

    /* renamed from: d */
    public void mo21184d(int i) {
        this.f27661e.setCurrentItem(i);
    }

    /* renamed from: e */
    public final void mo21368e(C10058c cVar) {
        cVar.mo20465L(this);
        cVar.mo20469u();
    }

    public int getCurrentItem() {
        return getPager().getCurrentItem();
    }

    @C12580l
    public C10058c getFormPresenter() {
        return this.f27660d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10058c formPresenter = getFormPresenter();
        if (formPresenter != null) {
            formPresenter.mo20466O();
        }
    }

    public void setFormPresenter(@C12580l C10058c cVar) {
        this.f27660d = cVar;
        if (cVar != null) {
            mo21368e(cVar);
        }
    }

    public void setTheme(@C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        try {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            ubInternalTheme.initializeFont(context);
        } catch (Resources.NotFoundException unused) {
            Logger.f26647a.logInfo("Couldn't apply custom font ");
        }
    }

    public void setupProgressBar(int i, int i2, int i3) {
        ProgressBar progressBar = getProgressBar();
        progressBar.setBackgroundColor(i);
        progressBar.setVisibility(0);
        progressBar.setMax(i3);
        progressBar.setProgress(1);
        progressBar.setClickable(true);
        progressBar.getProgressDrawable().setTint(i2);
    }
}
