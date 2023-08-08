package com.usabilla.sdk.ubform.net.parser;

import android.graphics.Color;
import android.os.Bundle;
import com.bumptech.glide.gifdecoder.C22073d;
import com.usabilla.sdk.ubform.response.UbException;
import com.usabilla.sdk.ubform.sdk.banner.BannerPosition;
import com.usabilla.sdk.ubform.sdk.field.model.common.C10012a;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.form.FormType;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.sdk.form.model.UbFonts;
import com.usabilla.sdk.ubform.sdk.form.model.UbImages;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import com.usabilla.sdk.ubform.sdk.page.PageType;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import com.usabilla.sdk.ubform.sdk.rule.RulePageModel;
import com.usabilla.sdk.ubform.utils.ext.ExtensionJsonKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.net.parser.a */
public final class C9874a implements C9875b<FormModel> {
    @C12579k

    /* renamed from: A */
    public static final String f27044A = "action";
    @C12579k

    /* renamed from: B */
    public static final String f27045B = "control";
    @C12579k

    /* renamed from: C */
    public static final String f27046C = "showHideRule";
    @C12579k

    /* renamed from: D */
    public static final String f27047D = "jump";
    @C12579k

    /* renamed from: E */
    public static final String f27048E = "show";
    @C12579k

    /* renamed from: F */
    public static final String f27049F = "value";
    @C12579k

    /* renamed from: G */
    public static final String f27050G = "jumpRules";
    @C12579k

    /* renamed from: H */
    public static final String f27051H = "screenshot";
    @C12579k

    /* renamed from: I */
    public static final String f27052I = "screenshotTitle";
    @C12579k

    /* renamed from: J */
    public static final String f27053J = "structure";
    @C12579k

    /* renamed from: K */
    public static final String f27054K = "version";
    @C12579k

    /* renamed from: L */
    public static final String f27055L = ("{\"type\":\"" + FieldType.SCREENSHOT.mo21121g() + "\", \"screenshotTitle\":\"%s\"}");
    @C12579k

    /* renamed from: a */
    public static final C9874a f27056a = new C9874a();
    @C12579k

    /* renamed from: b */
    public static final String f27057b = "appStore";
    @C12579k

    /* renamed from: c */
    public static final String f27058c = "appStoreRedirect";
    @C12579k

    /* renamed from: d */
    public static final String f27059d = "appSubmit";
    @C12579k

    /* renamed from: e */
    public static final String f27060e = "cancelButton";
    @C12579k

    /* renamed from: f */
    public static final String f27061f = "navigationNext";
    @C12579k

    /* renamed from: g */
    public static final String f27062g = "progressBar";
    @C12579k

    /* renamed from: h */
    public static final String f27063h = "colors";
    @C12579k

    /* renamed from: i */
    public static final String f27064i = "darkColors";
    @C12579k

    /* renamed from: j */
    public static final String f27065j = "group1";
    @C12579k

    /* renamed from: k */
    public static final String f27066k = "group2";
    @C12579k

    /* renamed from: l */
    public static final String f27067l = "group3";
    @C12579k

    /* renamed from: m */
    public static final String f27068m = "group4";
    @C12579k

    /* renamed from: n */
    public static final String f27069n = "group5";
    @C12579k

    /* renamed from: o */
    public static final String f27070o = "group6";
    @C12579k

    /* renamed from: p */
    public static final String f27071p = "group7";
    @C12579k

    /* renamed from: q */
    public static final String f27072q = "data";
    @C12579k

    /* renamed from: r */
    public static final String f27073r = "errorMessage";
    @C12579k

    /* renamed from: s */
    public static final String f27074s = "form";
    @C12579k

    /* renamed from: t */
    public static final String f27075t = "hash";
    @C12579k

    /* renamed from: u */
    public static final String f27076u = "id";
    @C12579k

    /* renamed from: v */
    public static final String f27077v = "localization";
    @C12579k

    /* renamed from: w */
    public static final String f27078w = "fields";
    @C12579k

    /* renamed from: x */
    public static final String f27079x = "name";
    @C12579k

    /* renamed from: y */
    public static final String f27080y = "type";
    @C12579k

    /* renamed from: z */
    public static final String f27081z = "pages";

    /* renamed from: b */
    public final PageModel mo20321b(PageModel pageModel, String str, UbInternalTheme ubInternalTheme) {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(f27055L, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        FieldModel<?> a = C10012a.m37712a(new JSONObject(format));
        a.mo20988v(ubInternalTheme);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(pageModel.mo21412n());
        arrayList.add(a);
        return PageModel.m38065k(pageModel, arrayList, (Map) null, (String) null, (String) null, false, false, (String) null, (List) null, C22073d.f56678l, (Object) null);
    }

    /* renamed from: c */
    public final List<RulePageModel> mo20322c(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(f27050G)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f27050G);
            if (jSONArray.length() > 0) {
                Iterator it = C11479u.m44378W1(0, jSONArray.length()).iterator();
                while (it.hasNext()) {
                    int c = ((C10953k0) it).mo6374c();
                    C9874a aVar = f27056a;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(c);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "rulesArray.getJSONObject(\n                            it\n                        )");
                    arrayList.add(aVar.mo20337r(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo20323d(List<PageModel> list) {
        PageModel pageModel;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            pageModel = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((PageModel) obj).mo21418t(), (Object) PageType.BANNER.mo21378q())) {
                break;
            }
        }
        if (obj != null) {
            ListIterator<PageModel> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                PageModel previous = listIterator.previous();
                if (Intrinsics.areEqual((Object) previous.mo21418t(), (Object) PageType.TOAST.mo21378q())) {
                    pageModel = previous;
                    break;
                }
            }
            if (pageModel != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo20324e(int i, Collection<PageModel> collection) {
        return i == collection.size() - 1;
    }

    /* renamed from: f */
    public final boolean mo20325f(int i, List<PageModel> list, PageType pageType) {
        return i < list.size() - 1 && Intrinsics.areEqual((Object) list.get(i + 1).mo21418t(), (Object) pageType.mo21378q());
    }

    @C12579k
    /* renamed from: g */
    public FormModel mo20320a(@C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        try {
            if (jSONObject.has(f27053J)) {
                return mo20327h(jSONObject);
            }
            return mo20339t(jSONObject);
        } catch (JSONException e) {
            throw new UbException.UbParseException(new Throwable(e.getLocalizedMessage()));
        }
    }

    /* renamed from: h */
    public final FormModel mo20327h(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        FormModel formModel = r1;
        FormModel formModel2 = new FormModel(FormType.CAMPAIGN, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048574, (DefaultConstructorMarker) null);
        String string = jSONObject2.getString("version");
        String string2 = jSONObject2.getString("id");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(ID)");
        Intrinsics.checkNotNullExpressionValue(string, "getString(VERSION)");
        FormModel copy$default = FormModel.copy$default(formModel, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, string2, (String) null, (String) null, (String) null, (String) null, (String) null, string, false, false, false, false, false, false, 0, 1044415, (Object) null);
        JSONObject jSONObject3 = jSONObject2.getJSONObject(f27053J);
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "formJson");
        return mo20333n(copy$default, jSONObject3);
    }

    /* renamed from: i */
    public final UbInternalTheme mo20328i(UbInternalTheme ubInternalTheme, JSONObject jSONObject) {
        UbColors j = mo20329j(jSONObject);
        UbColors o = mo20334o(jSONObject);
        UbInternalTheme ubInternalTheme2 = null;
        if (o != null) {
            if (j != null) {
                ubInternalTheme2 = UbInternalTheme.copy$default(ubInternalTheme, (UsabillaThemeUnity) null, o, j, (UbFonts) null, (UbImages) null, false, 57, (Object) null);
            }
            if (ubInternalTheme2 == null) {
                ubInternalTheme2 = UbInternalTheme.copy$default(ubInternalTheme, (UsabillaThemeUnity) null, o, (UbColors) null, (UbFonts) null, (UbImages) null, false, 61, (Object) null);
            }
        }
        if (ubInternalTheme2 == null) {
            return new UbInternalTheme((UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, (UbFonts) null, (UbImages) null, false, 63, (DefaultConstructorMarker) null);
        }
        return ubInternalTheme2;
    }

    /* renamed from: j */
    public final UbColors mo20329j(JSONObject jSONObject) {
        int i;
        if (!jSONObject.has(f27064i)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(f27064i);
        if (jSONObject2.length() <= 0) {
            return null;
        }
        int parseColor = Color.parseColor(jSONObject2.getJSONObject(f27065j).getString(f27075t));
        int parseColor2 = Color.parseColor(jSONObject2.getJSONObject(f27066k).getString(f27075t));
        int parseColor3 = Color.parseColor(jSONObject2.getJSONObject(f27067l).getString(f27075t));
        int parseColor4 = Color.parseColor(jSONObject2.getJSONObject(f27068m).getString(f27075t));
        int parseColor5 = Color.parseColor(jSONObject2.getJSONObject(f27069n).getString(f27075t));
        int parseColor6 = Color.parseColor(jSONObject2.getJSONObject(f27070o).getString(f27075t));
        if (jSONObject2.has(f27071p)) {
            i = Color.parseColor(jSONObject2.getJSONObject(f27071p).getString(f27075t));
        } else {
            i = parseColor5;
        }
        return new UbColors(parseColor2, parseColor6, parseColor5, i, parseColor4, parseColor3, parseColor);
    }

    /* renamed from: k */
    public final FormModel mo20330k(FormModel formModel, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string = jSONObject2.getString(f27059d);
        boolean optBoolean = jSONObject2.optBoolean("screenshot", true);
        String optString = jSONObject2.optString(f27073r);
        String str = optString;
        boolean optBoolean2 = jSONObject2.optBoolean(f27058c, false);
        String lowerCase = f27062g.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        boolean optBoolean3 = jSONObject2.optBoolean(f27062g, jSONObject2.optBoolean(lowerCase, false));
        Intrinsics.checkNotNullExpressionValue(optString, "optString(ERROR_MESSAGE)");
        Intrinsics.checkNotNullExpressionValue(string, "getString(APP_SUBMIT)");
        return FormModel.copy$default(formModel, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, str, (String) null, (String) null, (String) null, (String) null, string, (String) null, (String) null, false, optBoolean2, optBoolean3, optBoolean, false, false, 0, 932831, (Object) null);
    }

    /* renamed from: l */
    public final FieldModel<?> mo20331l(JSONObject jSONObject, UbInternalTheme ubInternalTheme) {
        FieldModel<?> a = C10012a.m37712a(jSONObject);
        a.mo20988v(ubInternalTheme);
        if (jSONObject.has(f27046C) && (jSONObject.get(f27046C) instanceof JSONObject)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(f27046C);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "fieldJson.getJSONObject(RULE_HIDE)");
            a.mo20987u(mo20332m(jSONObject2));
        }
        return a;
    }

    /* renamed from: m */
    public final RuleFieldModel mo20332m(JSONObject jSONObject) {
        RuleFieldModel ruleFieldModel = new RuleFieldModel();
        ruleFieldModel.mo21501c(jSONObject.getString(f27045B));
        JSONArray jSONArray = jSONObject.getJSONArray("value");
        C11466l W1 = C11479u.m44378W1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.getString(((C10953k0) it).mo6374c()));
        }
        ruleFieldModel.mo21502d(arrayList);
        ruleFieldModel.mo21506f(Intrinsics.areEqual((Object) jSONObject.getString("action"), (Object) f27048E));
        return ruleFieldModel;
    }

    /* renamed from: n */
    public final FormModel mo20333n(FormModel formModel, JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObject2 = jSONObject;
        FormModel p = mo20335p(FormModel.copy$default(mo20330k(formModel, jSONObject), (FormType) null, mo20328i(formModel.getTheme(), jSONObject2), (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048573, (Object) null), jSONObject2);
        if (p.getFormType() != FormType.CAMPAIGN) {
            z = true;
        } else {
            z = false;
        }
        return mo20338s(p, jSONObject2, z);
    }

    /* renamed from: o */
    public final UbColors mo20334o(JSONObject jSONObject) {
        int i;
        if (!jSONObject.has(f27063h)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(f27063h);
        if (jSONObject2.length() <= 0) {
            return null;
        }
        int parseColor = Color.parseColor(jSONObject2.getJSONObject(f27065j).getString(f27075t));
        int parseColor2 = Color.parseColor(jSONObject2.getJSONObject(f27066k).getString(f27075t));
        int parseColor3 = Color.parseColor(jSONObject2.getJSONObject(f27067l).getString(f27075t));
        int parseColor4 = Color.parseColor(jSONObject2.getJSONObject(f27068m).getString(f27075t));
        int parseColor5 = Color.parseColor(jSONObject2.getJSONObject(f27069n).getString(f27075t));
        int parseColor6 = Color.parseColor(jSONObject2.getJSONObject(f27070o).getString(f27075t));
        if (jSONObject2.has(f27071p)) {
            i = Color.parseColor(jSONObject2.getJSONObject(f27071p).getString(f27075t));
        } else {
            i = parseColor5;
        }
        return new UbColors(parseColor2, parseColor6, parseColor5, i, parseColor4, parseColor3, parseColor);
    }

    /* renamed from: p */
    public final FormModel mo20335p(FormModel formModel, JSONObject jSONObject) {
        FormModel formModel2;
        JSONObject a = ExtensionJsonKt.m38312a(jSONObject, f27077v);
        if (a == null) {
            return formModel;
        }
        if (a.has(f27061f)) {
            String string = a.getString(f27061f);
            Intrinsics.checkNotNullExpressionValue(string, "it.getString(NAVIGATION_NEXT)");
            formModel2 = FormModel.copy$default(formModel, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, string, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048319, (Object) null);
        } else {
            formModel2 = formModel;
        }
        if (a.has(f27060e)) {
            String string2 = a.getString(f27060e);
            Intrinsics.checkNotNullExpressionValue(string2, "it.getString(CANCEL_BUTTON)");
            formModel2 = FormModel.copy$default(formModel2, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, string2, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048447, (Object) null);
        }
        FormModel formModel3 = formModel2;
        if (a.has("screenshotTitle")) {
            String string3 = a.getString("screenshotTitle");
            Intrinsics.checkNotNullExpressionValue(string3, "it.getString(SCREENSHOT_TITLE)");
            formModel3 = FormModel.copy$default(formModel3, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, string3, (String) null, false, false, false, false, false, false, 0, 1046527, (Object) null);
        }
        FormModel formModel4 = formModel3;
        if (!a.has(f27057b)) {
            return formModel4;
        }
        String string4 = a.getString(f27057b);
        Intrinsics.checkNotNullExpressionValue(string4, "it.getString(APP_STORE)");
        return FormModel.copy$default(formModel4, (FormType) null, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, string4, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048063, (Object) null);
    }

    /* renamed from: q */
    public final PageModel mo20336q(FormModel formModel, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "pageJson.getString(PAGE_NAME)");
        String string2 = jSONObject2.getString("type");
        Intrinsics.checkNotNullExpressionValue(string2, "pageJson.getString(PAGE_TYPE)");
        String optString = jSONObject2.optString(f27047D);
        Intrinsics.checkNotNullExpressionValue(optString, "pageJson.optString(RULE_JUMP_DESTINATION)");
        PageModel pageModel = new PageModel((List) null, (Map) null, string, string2, false, false, optString, (List) null, 179, (DefaultConstructorMarker) null);
        JSONArray jSONArray = jSONObject2.getJSONArray("fields");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "fieldArray.getJSONObject(i)");
                arrayList.add(mo20331l(jSONObject3, formModel.getTheme()));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        PageModel k = PageModel.m38065k(pageModel, arrayList, (Map) null, (String) null, (String) null, false, false, (String) null, (List) null, C22073d.f56678l, (Object) null);
        if (C11622t.equals(k.mo21418t(), PageType.END.mo21378q(), true)) {
            k = PageModel.m38065k(k, (List) null, (Map) null, (String) null, (String) null, true, false, (String) null, (List) null, 239, (Object) null);
        }
        if (z) {
            k = mo20321b(k, formModel.getTitleScreenshot(), formModel.getTheme());
        }
        return PageModel.m38065k(k, (List) null, (Map) null, (String) null, (String) null, false, false, (String) null, mo20322c(jSONObject2), 127, (Object) null);
    }

    /* renamed from: r */
    public final RulePageModel mo20337r(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("value");
        RulePageModel rulePageModel = new RulePageModel();
        rulePageModel.mo21501c(jSONObject.getString(f27045B));
        C11466l W1 = C11479u.m44378W1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.getString(((C10953k0) it).mo6374c()));
        }
        rulePageModel.mo21502d(arrayList);
        rulePageModel.mo21512f(jSONObject.getString(f27047D));
        return rulePageModel;
    }

    /* renamed from: s */
    public final FormModel mo20338s(FormModel formModel, JSONObject jSONObject, boolean z) {
        boolean z2;
        boolean z3;
        FormModel formModel2;
        int i = 0;
        if (!z || !formModel.isScreenshotVisible()) {
            z2 = false;
        } else {
            z2 = true;
        }
        JSONArray jSONArray = jSONObject.getJSONObject("form").getJSONArray("pages");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "pagesArray.getJSONObject(i)");
                if (i2 != 0 || !z2) {
                    formModel2 = formModel;
                    z3 = false;
                } else {
                    formModel2 = formModel;
                    z3 = true;
                }
                arrayList.add(mo20336q(formModel2, jSONObject2, z3));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        } else {
            FormModel formModel3 = formModel;
        }
        if (formModel.getFormType() != FormType.CAMPAIGN || mo20323d(arrayList)) {
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (Object next : arrayList) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                PageModel pageModel = (PageModel) next;
                C9874a aVar = f27056a;
                if (aVar.mo20324e(i, arrayList) || aVar.mo20325f(i, arrayList, PageType.TOAST) || aVar.mo20325f(i, arrayList, PageType.END)) {
                    pageModel = PageModel.m38065k(pageModel, (List) null, (Map) null, (String) null, (String) null, false, true, (String) null, (List) null, 223, (Object) null);
                }
                arrayList2.add(pageModel);
                i = i4;
            }
            return FormModel.copy$default(formModel, (FormType) null, (UbInternalTheme) null, (Bundle) null, CollectionsKt___CollectionsKt.m40572T5(arrayList2), (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, 0, 1048567, (Object) null);
        }
        throw new UbException.UbInvalidCampaignException(new Throwable("Campaign form " + formModel.getFormId() + " invalid: missing BANNER or TOAST page"));
    }

    /* renamed from: t */
    public final FormModel mo20339t(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        FormType formType = FormType.PASSIVE_FEEDBACK;
        String string = jSONObject2.getString("version");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(VERSION)");
        return mo20333n(new FormModel(formType, (UbInternalTheme) null, (Bundle) null, (List) null, (BannerPosition) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, string, false, false, false, false, false, false, 0, 1044478, (DefaultConstructorMarker) null), jSONObject2);
    }
}
