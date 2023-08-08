package com.usabilla.sdk.ubform.sdk.banner.presenter;

import android.graphics.Color;
import android.widget.Button;
import androidx.compose.runtime.C8698y1;
import androidx.core.view.C18124b2;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.sdk.C9911a;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfiguration;
import com.usabilla.sdk.ubform.sdk.banner.contract.C9924a;
import com.usabilla.sdk.ubform.sdk.entity.FeedbackResult;
import com.usabilla.sdk.ubform.sdk.field.model.ButtonModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.page.presenter.C10067a;
import com.usabilla.sdk.ubform.sdk.rule.RulePageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11677z;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class BannerPresenter extends C10067a implements C9924a.C9925a {
    @C12580l

    /* renamed from: X */
    public BannerConfiguration f27329X;
    @C12579k

    /* renamed from: f */
    public final FormModel f27330f;
    @C12579k

    /* renamed from: g */
    public final C9911a f27331g;

    /* renamed from: v */
    public final boolean f27332v;
    @C12579k

    /* renamed from: w */
    public final C11677z f27333w;
    @C12580l

    /* renamed from: x */
    public Button f27334x;
    @C12580l

    /* renamed from: y */
    public Button f27335y;
    @C12580l

    /* renamed from: z */
    public C9924a.C9926b f27336z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BannerPresenter(@org.jetbrains.annotations.C12579k com.usabilla.sdk.ubform.sdk.form.model.FormModel r5, @org.jetbrains.annotations.C12579k com.usabilla.sdk.ubform.sdk.C9911a r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "formModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "formNavigation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List r0 = r5.getPages()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r0.next()
            com.usabilla.sdk.ubform.sdk.page.model.PageModel r1 = (com.usabilla.sdk.ubform.sdk.page.model.PageModel) r1
            java.lang.String r2 = r1.mo21418t()
            com.usabilla.sdk.ubform.sdk.page.PageType r3 = com.usabilla.sdk.ubform.sdk.page.PageType.BANNER
            java.lang.String r3 = r3.mo21378q()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0014
            com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme r0 = r5.getTheme()
            r4.<init>(r1, r0)
            r4.f27330f = r5
            r4.f27331g = r6
            r4.f27332v = r7
            com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter$layoutResource$2 r5 = com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter$layoutResource$2.f27337f
            kotlin.z r5 = kotlin.C10864b0.m38748c(r5)
            r4.f27333w = r5
            return
        L_0x0046:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.banner.presenter.BannerPresenter.<init>(com.usabilla.sdk.ubform.sdk.form.model.FormModel, com.usabilla.sdk.ubform.sdk.a, boolean):void");
    }

    /* renamed from: T */
    public void mo20712T() {
    }

    /* renamed from: W */
    public final void mo20713W() {
        BannerConfiguration bannerConfiguration = this.f27329X;
        if (bannerConfiguration == null) {
            mo20734p0();
        } else {
            mo20733o0(bannerConfiguration.mo20672l());
        }
    }

    /* renamed from: X */
    public int mo20714X() {
        return ((Number) this.f27333w.getValue()).intValue();
    }

    /* renamed from: Y */
    public final void mo20715Y() {
        FieldModel fieldModel = mo21435G().mo21412n().get(0);
        if (fieldModel.mo20979k() && !fieldModel.mo20885j()) {
            mo20716Z(this.f27334x);
        }
    }

    /* renamed from: Z */
    public final void mo20716Z(Button button) {
        if (button != null) {
            button.setEnabled(false);
            button.setTextColor(Color.argb(Math.round(((float) Color.alpha(mo21437I().getColors().getAccent())) * 0.5f), Color.red(mo21437I().getColors().getAccent()), Color.green(mo21437I().getColors().getAccent()), Color.blue(mo21437I().getColors().getAccent())));
        }
    }

    /* renamed from: a */
    public void mo20717a(@C12580l UbScreenshot ubScreenshot) {
    }

    /* renamed from: b0 */
    public final void mo20718b0() {
        Button button;
        FieldModel fieldModel = mo21435G().mo21412n().get(0);
        if (fieldModel.mo20979k() && !fieldModel.mo20885j() && (button = this.f27335y) != null) {
            button.setEnabled(false);
        }
    }

    /* renamed from: c0 */
    public final void mo20719c0(Button button) {
        if (button != null) {
            button.setEnabled(true);
            button.setTextColor(mo21437I().getColors().getAccent());
        }
    }

    /* renamed from: d */
    public void mo20709d(int i, int i2, int i3) {
        C9924a.C9926b bVar;
        if (((i2 & C8698y1.f23301m) != 0 || (i & 512) != 0) && (bVar = this.f27336z) != null) {
            bVar.mo20629B(i3);
        }
    }

    /* renamed from: d0 */
    public final PageModel mo20720d0(String str) {
        Object obj;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f27330f.getPages()) {
            if (Intrinsics.areEqual((Object) ((PageModel) next).mo21414p(), (Object) str)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PageModel pageModel = (PageModel) obj;
            if (mo20729k0(pageModel) || mo20728j0(pageModel)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (PageModel) obj;
    }

    /* renamed from: e */
    public void mo20721e() {
        mo20726h0(this.f27330f.generateFeedbackResultFromBanner(true));
        this.f27331g.mo20561y0();
    }

    @C12580l
    /* renamed from: e0 */
    public final BannerConfiguration mo20722e0() {
        return this.f27329X;
    }

    /* renamed from: f */
    public void mo20710f(@C12579k C9924a.C9926b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C9851c.f26937h);
        this.f27336z = bVar;
    }

    /* renamed from: f0 */
    public final void mo20723f0(PageModel pageModel) {
        C9924a.C9926b bVar = this.f27336z;
        if (bVar != null) {
            bVar.mo20648j0(pageModel);
        }
    }

    /* renamed from: g */
    public void mo20711g() {
        this.f27336z = null;
    }

    /* renamed from: g0 */
    public final void mo20724g0(String str) {
        mo20726h0(this.f27330f.generateFeedbackResultFromBanner(false));
        this.f27331g.mo20561y0();
        this.f27331g.mo20557C(str);
    }

    /* renamed from: h */
    public void mo20725h() {
        String l = mo21435G().mo21410l();
        RulePageModel M = mo21438M();
        if (M != null) {
            l = M.mo21511e();
            Intrinsics.checkNotNullExpressionValue(l, "it.jumpTo");
        }
        C9924a.C9926b bVar = this.f27336z;
        if (bVar != null) {
            bVar.mo20649t();
        }
        PageModel d0 = mo20720d0(l);
        if (d0 == null) {
            for (PageModel pageModel : this.f27330f.getPages()) {
                if (!Intrinsics.areEqual((Object) pageModel.mo21418t(), (Object) PageType.BANNER.mo21378q())) {
                    d0 = pageModel;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        mo20730l0(d0);
    }

    /* renamed from: h0 */
    public final void mo20726h0(FeedbackResult feedbackResult) {
        if (!this.f27332v || !this.f27330f.shouldInviteForPlayStoreReview()) {
            this.f27331g.mo20559T(feedbackResult);
            this.f27331g.mo20560m0(mo21380k().toString());
            return;
        }
        this.f27331g.mo20558L(feedbackResult, mo21380k().toString());
    }

    /* renamed from: i0 */
    public final boolean mo20727i0(List<String> list) {
        if (!list.isEmpty()) {
            if (list.get(0).length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j0 */
    public final boolean mo20728j0(PageModel pageModel) {
        return Intrinsics.areEqual((Object) pageModel.mo21418t(), (Object) PageType.TOAST.mo21378q()) || Intrinsics.areEqual((Object) pageModel.mo21418t(), (Object) PageType.END.mo21378q());
    }

    /* renamed from: k0 */
    public final boolean mo20729k0(PageModel pageModel) {
        return Intrinsics.areEqual((Object) pageModel.mo21418t(), (Object) PageType.FORM.mo21378q());
    }

    /* renamed from: l0 */
    public final void mo20730l0(PageModel pageModel) {
        if (Intrinsics.areEqual((Object) pageModel.mo21418t(), (Object) PageType.FORM.mo21378q())) {
            mo20723f0(pageModel);
        } else {
            mo20724g0(pageModel.mo21417s());
        }
    }

    /* renamed from: m0 */
    public final void mo20731m0(boolean z) {
        this.f27330f.getTheme().setDarkModeActive$ubform_sdkRelease(z);
    }

    /* renamed from: n0 */
    public final void mo20732n0(@C12580l BannerConfiguration bannerConfiguration) {
        this.f27329X = bannerConfiguration;
    }

    /* renamed from: o0 */
    public final void mo20733o0(BannerConfigNavigation bannerConfigNavigation) {
        Button button;
        ArrayList<FieldModel> arrayList = new ArrayList<>();
        Iterator it = mo21435G().mo21412n().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FieldModel) next).mo20972c() != FieldType.CONTINUE) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<ButtonModel> arrayList2 = new ArrayList<>(C10978t.m41495Y(arrayList, 10));
        for (FieldModel fieldModel : arrayList) {
            arrayList2.add((ButtonModel) fieldModel);
        }
        BannerConfigNavigation bannerConfigNavigation2 = bannerConfigNavigation;
        for (ButtonModel buttonModel : arrayList2) {
            String x = buttonModel.mo20874x();
            if (x != null && (!C11622t.isBlank(x))) {
                bannerConfigNavigation2 = BannerConfigNavigation.m37261l(bannerConfigNavigation2, (String) null, (String) null, (String) null, (String) null, (String) null, x, 0, 0, (Integer) null, (Integer) null, C28539g.f69230F, (Object) null);
            }
            BannerConfigNavigation bannerConfigNavigation3 = bannerConfigNavigation2;
            String y = buttonModel.mo20875y();
            if (y != null && (!C11622t.isBlank(y))) {
                bannerConfigNavigation3 = BannerConfigNavigation.m37261l(bannerConfigNavigation3, (String) null, (String) null, y, (String) null, (String) null, (String) null, 0, 0, (Integer) null, (Integer) null, C18124b2.f46742u, (Object) null);
            }
            bannerConfigNavigation2 = bannerConfigNavigation3;
        }
        C10061a.C10063b H = mo21436H();
        if (H == null) {
            button = null;
        } else {
            button = H.mo21388g(bannerConfigNavigation2, mo21437I());
        }
        this.f27335y = button;
        mo20718b0();
    }

    /* renamed from: p0 */
    public final void mo20734p0() {
        Button button;
        C10061a.C10063b H;
        C10061a.C10063b H2 = mo21436H();
        if (H2 != null) {
            H2.mo21390h(-1);
        }
        ArrayList<FieldModel> arrayList = new ArrayList<>();
        Iterator it = mo21435G().mo21412n().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((FieldModel) next).mo20972c() != FieldType.CONTINUE) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<ButtonModel> arrayList2 = new ArrayList<>(C10978t.m41495Y(arrayList, 10));
        for (FieldModel fieldModel : arrayList) {
            arrayList2.add((ButtonModel) fieldModel);
        }
        for (ButtonModel buttonModel : arrayList2) {
            String x = buttonModel.mo20874x();
            if (!(x == null || !(!C11622t.isBlank(x)) || (H = mo21436H()) == null)) {
                H.mo21393k(x, mo21437I());
            }
            String y = buttonModel.mo20875y();
            if (y != null && (!C11622t.isBlank(y))) {
                C10061a.C10063b H3 = mo21436H();
                if (H3 == null) {
                    button = null;
                } else {
                    button = H3.mo21385d(y, mo21437I());
                }
                this.f27334x = button;
            }
            mo20715Y();
        }
    }

    /* renamed from: u */
    public void mo20469u() {
        C10061a.C10063b H = mo21436H();
        if (H != null) {
            H.mo21395m(mo21437I().getColors().getCard());
        }
        mo21432C();
        mo20713W();
    }

    /* renamed from: w */
    public void mo20735w(@C12579k String str, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, "fieldId");
        Intrinsics.checkNotNullParameter(list, "fieldValues");
        super.mo20735w(str, list);
        if (mo20727i0(list)) {
            if (mo21435G().mo21412n().get(0).mo20979k()) {
                mo20719c0(this.f27334x);
                Button button = this.f27335y;
                if (button != null) {
                    button.setEnabled(true);
                }
            }
            if (this.f27334x == null && this.f27335y == null) {
                mo20725h();
            }
        }
    }
}
