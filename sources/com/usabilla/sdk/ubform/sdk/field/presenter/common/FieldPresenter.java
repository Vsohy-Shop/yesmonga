package com.usabilla.sdk.ubform.sdk.field.presenter.common;

import com.google.android.gms.analytics.ecommerce.C40383c;
import com.usabilla.sdk.ubform.sdk.field.contract.common.C9964a;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class FieldPresenter<M extends FieldModel<?>, V> implements C9964a.C9965a<M, V> {
    @C12579k

    /* renamed from: a */
    public final M f27502a;
    @C12579k

    /* renamed from: b */
    public final C10061a.C10062a f27503b;
    @C12579k

    /* renamed from: c */
    public final String f27504c = " *";
    @C12580l

    /* renamed from: d */
    public FieldView<?> f27505d;
    @C12579k

    /* renamed from: e */
    public final C11677z f27506e = C10864b0.m38748c(new FieldPresenter$fieldTitle$2(this));

    public FieldPresenter(@C12579k M m, @C12579k C10061a.C10062a aVar) {
        Intrinsics.checkNotNullParameter(m, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "mPagePresenter");
        this.f27502a = m;
        this.f27503b = aVar;
    }

    @C12579k
    /* renamed from: A */
    public List<RuleFieldModel> mo20822A(@C12579k Map<String, ? extends List<String>> map, @C12579k Map<String, ? extends RuleFieldModel> map2) {
        boolean z;
        List<RuleFieldModel> list;
        Intrinsics.checkNotNullParameter(map, "fieldValues");
        Intrinsics.checkNotNullParameter(map2, "fieldRuleMap");
        RuleFieldModel f = mo20826p().mo20975f();
        if (mo20825j() == null || f == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        String a = f.mo21499a();
        List<String> b = f.mo21500b();
        Collection collection = (List) map.get(a);
        if (collection == null) {
            collection = new ArrayList();
        }
        if (Collections.disjoint(b, collection) != f.mo21505e()) {
            z = true;
        } else {
            z = false;
        }
        if (mo21028h0(z)) {
            String e = mo20826p().mo20974e();
            Intrinsics.checkNotNullExpressionValue(e, "fieldModel.id");
            list = mo21025e0(e, map2, new ArrayList());
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        mo20823B(z);
        return list;
    }

    /* renamed from: B */
    public void mo20823B(boolean z) {
        FieldView<?> j;
        FieldView<?> j2 = mo20825j();
        if (j2 != null) {
            j2.setFieldVisible(z);
        }
        mo20826p().mo20984r(z);
        if (!z && mo20826p().mo20974e() != null && (j = mo20825j()) != null) {
            j.mo20831c();
        }
    }

    /* renamed from: O */
    public void mo20466O() {
        mo20827r((FieldView<?>) null);
    }

    /* renamed from: d0 */
    public void mo20465L(@C12579k C9964a.C9966b bVar) {
        Intrinsics.checkNotNullParameter(bVar, C40383c.f102945c);
        mo20827r((FieldView) bVar);
    }

    /* renamed from: e0 */
    public final List<RuleFieldModel> mo21025e0(String str, Map<String, ? extends RuleFieldModel> map, List<RuleFieldModel> list) {
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            RuleFieldModel ruleFieldModel = (RuleFieldModel) next.getValue();
            if (Intrinsics.areEqual((Object) ruleFieldModel.mo21499a(), (Object) str)) {
                list.add(ruleFieldModel);
                mo21025e0(str2, map, list);
            }
        }
        return list;
    }

    @C12579k
    /* renamed from: f0 */
    public M mo20826p() {
        return this.f27502a;
    }

    @C12579k
    /* renamed from: g0 */
    public final C10061a.C10062a mo21027g0() {
        return this.f27503b;
    }

    /* renamed from: h0 */
    public final boolean mo21028h0(boolean z) {
        return !mo20826p().mo20980l() || !z;
    }

    @C12580l
    /* renamed from: j */
    public FieldView<?> mo20825j() {
        return this.f27505d;
    }

    /* renamed from: r */
    public void mo20827r(@C12580l FieldView<?> fieldView) {
        this.f27505d = fieldView;
    }

    @C12579k
    /* renamed from: s */
    public String mo20828s() {
        Object value = this.f27506e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-fieldTitle>(...)");
        return (String) value;
    }

    /* renamed from: u */
    public void mo20469u() {
        String str;
        mo20822A(this.f27503b.mo21380k(), this.f27503b.mo21381o());
        FieldView<?> j = mo20825j();
        if (j != null) {
            j.mo20833e();
            String h = mo20826p().mo20977h();
            if (mo20826p().mo20979k()) {
                str = this.f27504c;
            } else {
                str = null;
            }
            j.setTitleText(h, str);
            j.setDefaultContentDescription(mo20826p().mo20977h(), mo20826p().mo20979k());
            j.mo20835j();
            j.mo20834g(mo20826p().mo20974e());
        }
    }

    public boolean validate() {
        return mo20826p().mo20899m();
    }

    /* renamed from: z */
    public void mo20830z(boolean z) {
        FieldView<?> j = mo20825j();
        if (j != null) {
            j.setErrorVisible(z);
        }
    }
}
