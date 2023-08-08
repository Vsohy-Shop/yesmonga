package com.usabilla.sdk.ubform.sdk.page.presenter;

import android.util.Log;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.form.contract.C10053a;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import com.usabilla.sdk.ubform.sdk.rule.RulePageModel;
import com.usabilla.sdk.ubform.utils.ext.ExtensionViewKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONException;

/* renamed from: com.usabilla.sdk.ubform.sdk.page.presenter.a */
public abstract class C10067a implements C10061a.C10062a {
    @C12579k

    /* renamed from: a */
    public PageModel f27678a;
    @C12579k

    /* renamed from: b */
    public final UbInternalTheme f27679b;
    @C12580l

    /* renamed from: c */
    public C10053a.C10054a f27680c;
    @C12580l

    /* renamed from: d */
    public C10061a.C10063b f27681d;
    @C12579k

    /* renamed from: e */
    public final List<FieldPresenter<?, ?>> f27682e = new ArrayList();

    public C10067a(@C12579k PageModel pageModel, @C12579k UbInternalTheme ubInternalTheme) {
        Intrinsics.checkNotNullParameter(pageModel, "pageModel");
        Intrinsics.checkNotNullParameter(ubInternalTheme, "themeConfig");
        this.f27678a = pageModel;
        this.f27679b = ubInternalTheme;
    }

    /* renamed from: C */
    public final void mo21432C() {
        try {
            C10061a.C10063b bVar = this.f27681d;
            if (bVar != null) {
                bVar.mo21382a(this.f27678a.mo21412n(), Intrinsics.areEqual((Object) this.f27678a.mo21418t(), (Object) PageType.BANNER.mo21378q()));
            }
            mo21445t("");
        } catch (JSONException e) {
            Log.getStackTraceString(e);
            C10053a.C10054a aVar = this.f27680c;
            if (aVar != null) {
                aVar.mo21177e();
            }
        }
    }

    @C12579k
    /* renamed from: D */
    public final List<FieldPresenter<?, ?>> mo21433D() {
        return this.f27682e;
    }

    @C12580l
    /* renamed from: F */
    public final C10053a.C10054a mo21434F() {
        return this.f27680c;
    }

    @C12579k
    /* renamed from: G */
    public final PageModel mo21435G() {
        return this.f27678a;
    }

    @C12580l
    /* renamed from: H */
    public final C10061a.C10063b mo21436H() {
        return this.f27681d;
    }

    @C12579k
    /* renamed from: I */
    public final UbInternalTheme mo21437I() {
        return this.f27679b;
    }

    /* renamed from: J */
    public void mo21379J(@C12579k FieldPresenter<?, ?> fieldPresenter) {
        Intrinsics.checkNotNullParameter(fieldPresenter, "fieldPresenter");
        this.f27682e.add(fieldPresenter);
    }

    @C12580l
    /* renamed from: M */
    public final RulePageModel mo21438M() {
        for (RulePageModel rulePageModel : this.f27678a.mo21415q()) {
            Iterator<Map.Entry<String, List<String>>> it = mo21435G().mo21413o().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    List list = (List) next.getValue();
                    if (Intrinsics.areEqual((Object) rulePageModel.mo21499a(), (Object) (String) next.getKey()) && mo21439N(rulePageModel, list)) {
                        return rulePageModel;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: N */
    public final boolean mo21439N(RulePageModel rulePageModel, List<String> list) {
        if (list.size() > 1) {
            return mo21446v(rulePageModel, list);
        }
        List<String> b = rulePageModel.mo21500b();
        Intrinsics.checkNotNullExpressionValue(b, "rule.value");
        Iterable<String> iterable = b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (String contains : iterable) {
                if (list.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: O */
    public void mo20466O() {
        this.f27681d = null;
        this.f27682e.clear();
    }

    /* renamed from: P */
    public final void mo21440P(String str, List<String> list) {
        if (list.isEmpty()) {
            PageModel pageModel = this.f27678a;
            Map<String, List<String>> o = pageModel.mo21413o();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : o.entrySet()) {
                if (!Intrinsics.areEqual(next.getKey(), (Object) str)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            this.f27678a = PageModel.m38065k(pageModel, (List) null, linkedHashMap, (String) null, (String) null, false, false, (String) null, (List) null, 253, (Object) null);
            return;
        }
        Map<String, List<String>> J0 = C10977s0.m41442J0(this.f27678a.mo21413o());
        J0.put(str, list);
        this.f27678a = PageModel.m38065k(this.f27678a, (List) null, C10977s0.m41430D0(J0), (String) null, (String) null, false, false, (String) null, (List) null, 253, (Object) null);
    }

    /* renamed from: S */
    public final void mo21441S(@C12580l C10053a.C10054a aVar) {
        this.f27680c = aVar;
    }

    /* renamed from: U */
    public final void mo21442U(@C12579k PageModel pageModel) {
        Intrinsics.checkNotNullParameter(pageModel, "<set-?>");
        this.f27678a = pageModel;
    }

    @C12579k
    /* renamed from: k */
    public Map<String, List<String>> mo21380k() {
        return this.f27678a.mo21413o();
    }

    /* renamed from: l */
    public final void mo21443l(@C12580l List<? extends FieldModel<?>> list) {
        FieldModel fieldModel;
        Object d;
        C10061a.C10063b H;
        FieldModel fieldModel2;
        Object d2;
        C10061a.C10063b H2;
        if (!(list == null || (fieldModel2 = (FieldModel) CollectionsKt___CollectionsKt.m40559R2(list, 0)) == null || (d2 = fieldModel2.mo20973d()) == null || (H2 = mo21436H()) == null)) {
            H2.mo21392j(d2.toString(), mo21437I());
        }
        if (list != null && (fieldModel = (FieldModel) CollectionsKt___CollectionsKt.m40559R2(list, 1)) != null && (d = fieldModel.mo20973d()) != null && (H = mo21436H()) != null) {
            H.mo21384c(d.toString(), mo21437I());
        }
    }

    @C12579k
    /* renamed from: o */
    public Map<String, RuleFieldModel> mo21381o() {
        return this.f27678a.mo21411m();
    }

    /* renamed from: q */
    public void mo20465L(@C12579k C10061a.C10063b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40383c.f102945c);
        this.f27681d = bVar;
    }

    /* renamed from: t */
    public final void mo21445t(String str) {
        ArrayList<RuleFieldModel> arrayList = new ArrayList<>();
        for (FieldPresenter fieldPresenter : this.f27682e) {
            String e = fieldPresenter.mo20826p().mo20974e();
            if (e == null || !C11622t.equals(e, str, true)) {
                arrayList.addAll(fieldPresenter.mo20822A(mo21380k(), mo21435G().mo21411m()));
            }
        }
        for (RuleFieldModel ruleFieldModel : arrayList) {
            ArrayList<FieldPresenter> arrayList2 = new ArrayList<>();
            Iterator it = mo21433D().iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                FieldPresenter fieldPresenter2 = (FieldPresenter) next;
                if (fieldPresenter2.mo20826p().mo20975f() != null && Intrinsics.areEqual((Object) fieldPresenter2.mo20826p().mo20975f().mo21499a(), (Object) ruleFieldModel.mo21499a())) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            for (FieldPresenter fieldPresenter3 : arrayList2) {
                FieldView<?> j = fieldPresenter3.mo20825j();
                if (j != null) {
                    j.mo20831c();
                    fieldPresenter3.mo20826p().mo20900n();
                    ExtensionViewKt.m38321e(j, false);
                }
            }
        }
    }

    /* renamed from: v */
    public final boolean mo21446v(RulePageModel rulePageModel, List<String> list) {
        for (String contains : list) {
            if (rulePageModel.mo21500b().contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public void mo20735w(@C12579k String str, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, "fieldId");
        Intrinsics.checkNotNullParameter(list, "fieldValues");
        mo21440P(str, list);
        mo21445t(str);
    }
}
