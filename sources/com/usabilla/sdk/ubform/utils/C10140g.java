package com.usabilla.sdk.ubform.utils;

import com.urbanairship.analytics.C35554i;
import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.net.C9850b;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.sdk.field.model.common.ClientModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.form.BaseForm;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.page.model.PageModel;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.ext.C10131e;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONException;
import org.json.JSONObject;
import p073j$.time.ZoneOffset;

/* renamed from: com.usabilla.sdk.ubform.utils.g */
public final class C10140g {
    @C12579k

    /* renamed from: a */
    public final String f27876a = "app_id";
    @C12579k

    /* renamed from: b */
    public final String f27877b = "version";
    @C12579k

    /* renamed from: c */
    public final String f27878c = "data";
    @C12579k

    /* renamed from: d */
    public final String f27879d = "SDK_version";
    @C12579k

    /* renamed from: e */
    public final String f27880e = "timestamp";
    @C12579k

    /* renamed from: f */
    public final String f27881f = "device";
    @C12579k

    /* renamed from: g */
    public final String f27882g = C10108c.f27822y;
    @C12579k

    /* renamed from: h */
    public final String f27883h = C35554i.f87765Z;
    @C12579k

    /* renamed from: i */
    public final String f27884i = "battery";
    @C12579k

    /* renamed from: j */
    public final String f27885j = "lang";
    @C12579k

    /* renamed from: k */
    public final String f27886k = "reachability";
    @C12579k

    /* renamed from: l */
    public final String f27887l = "orientation";
    @C12579k

    /* renamed from: m */
    public final String f27888m = "free_memory";
    @C12579k

    /* renamed from: n */
    public final String f27889n = "total_memory";
    @C12579k

    /* renamed from: o */
    public final String f27890o = "free_space";
    @C12579k

    /* renamed from: p */
    public final String f27891p = "total_space";
    @C12579k

    /* renamed from: q */
    public final String f27892q = "rooted";
    @C12579k

    /* renamed from: r */
    public final String f27893r = "screensize";
    @C12579k

    /* renamed from: s */
    public final String f27894s = "app_version";
    @C12579k

    /* renamed from: t */
    public final String f27895t = "app_name";
    @C12579k

    /* renamed from: u */
    public final String f27896u = "custom_variables";
    @C12579k

    /* renamed from: v */
    public final String f27897v = "defaultForm";
    @C12579k

    /* renamed from: w */
    public final String f27898w = "sdk_version";
    @C12579k

    /* renamed from: x */
    public final String f27899x = "language";
    @C12579k

    /* renamed from: y */
    public final String f27900y = "screen";
    @C12579k

    /* renamed from: z */
    public final String f27901z = "network_connection";

    /* renamed from: a */
    public final JSONObject mo21584a(List<PageModel> list) {
        JSONObject jSONObject = new JSONObject();
        int size = list.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                for (FieldModel next : list.get(i).mo21412n()) {
                    try {
                        Object obj = JSONObject.NULL;
                        if (next.mo20980l()) {
                            obj = next.mo20872a();
                        }
                        jSONObject.put(next.mo20974e(), obj);
                    } catch (JSONException e) {
                        Logger.f26647a.logError(Intrinsics.stringPlus("Convert FormClient To Json exception ", e.getMessage()));
                    }
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return jSONObject;
    }

    @C12580l
    /* renamed from: b */
    public final JSONObject mo21585b(@C12579k FormModel formModel, boolean z) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        try {
            return new C9850b((String) null, (Integer) null, mo21584a(C10976s.m41419k(formModel.getPages().get(formModel.getCurrentPageIndex()))), (JSONObject) null, bool, (JSONObject) null, 43, (DefaultConstructorMarker) null).mo20269a();
        } catch (JSONException e) {
            Logger.f26647a.logError(Intrinsics.stringPlus("Create campaign patch payload exception ", e.getMessage()));
            return null;
        }
    }

    @C12580l
    /* renamed from: c */
    public final JSONObject mo21586c(@C12579k AppInfo appInfo, @C12579k FormModel formModel, boolean z) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(this.f27894s, appInfo.mo19778w());
        jSONObject.put(this.f27895t, appInfo.mo19777v());
        jSONObject.put(this.f27884i, appInfo.mo19780x());
        jSONObject.put(this.f27881f, appInfo.mo19782z());
        jSONObject.put(this.f27899x, Locale.getDefault().getLanguage());
        jSONObject.put(this.f27901z, appInfo.mo19781y());
        jSONObject.put(this.f27887l, appInfo.mo19745C());
        jSONObject.put(this.f27883h, appInfo.mo19746D());
        jSONObject.put(this.f27900y, appInfo.mo19748F());
        jSONObject.put(this.f27898w, appInfo.mo19749G());
        jSONObject.put(this.f27882g, appInfo.mo19750H());
        jSONObject.put(this.f27880e, C10113b.m38276b(System.currentTimeMillis(), (ZoneOffset) null, 2, (Object) null));
        String t = appInfo.mo19774t();
        int parseInt = Integer.parseInt(formModel.getVersion());
        try {
            return new C9850b(t, Integer.valueOf(parseInt), mo21584a(C10976s.m41419k(formModel.getPages().get(formModel.getCurrentPageIndex()))), jSONObject, Boolean.valueOf(z), new JSONObject(C10131e.m38337b(formModel.getCustomVariables()))).mo20269a();
        } catch (JSONException e) {
            Logger.f26647a.logError(Intrinsics.stringPlus("Create campaign post payload exception ", e.getMessage()));
            return null;
        }
    }

    @C12579k
    /* renamed from: d */
    public final C9851c mo21587d(@C12579k AppInfo appInfo, @C12579k FormModel formModel, @C12579k ClientModel clientModel, @C12580l String str) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(formModel, BaseForm.f27616v);
        Intrinsics.checkNotNullParameter(clientModel, "clientModel");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(this.f27876a, formModel.getFormId());
            jSONObject.put(this.f27877b, formModel.getVersion());
            jSONObject.put(this.f27878c, mo21584a(formModel.getPages()));
            jSONObject.put(this.f27879d, appInfo.mo19749G());
            jSONObject.put(this.f27880e, C10113b.m38276b(System.currentTimeMillis(), (ZoneOffset) null, 2, (Object) null));
            jSONObject.put(this.f27881f, appInfo.mo19782z());
            jSONObject.put(this.f27882g, appInfo.mo19750H());
            jSONObject.put(this.f27883h, appInfo.mo19746D());
            jSONObject.put(this.f27884i, appInfo.mo19780x());
            jSONObject.put(this.f27885j, Locale.getDefault().getLanguage());
            jSONObject.put(this.f27886k, appInfo.mo19781y());
            jSONObject.put(this.f27887l, appInfo.mo19745C());
            jSONObject.put(this.f27888m, appInfo.mo19743A());
            jSONObject.put(this.f27889n, appInfo.mo19751I());
            jSONObject.put(this.f27890o, appInfo.mo19744B());
            jSONObject.put(this.f27891p, appInfo.mo19752J());
            jSONObject.put(this.f27892q, appInfo.mo19747E());
            jSONObject.put(this.f27893r, appInfo.mo19748F());
            jSONObject.put(this.f27894s, appInfo.mo19778w());
            jSONObject.put(this.f27895t, appInfo.mo19777v());
            jSONObject.put(this.f27896u, new JSONObject(C10131e.m38337b(formModel.getCustomVariables())));
            if (formModel.isDefaultForm()) {
                jSONObject.put(this.f27897v, true);
            }
            Pair<String, JSONObject> e = clientModel.mo20959e();
            jSONObject.put(e.mo21846a(), e.mo21847b());
        } catch (JSONException e2) {
            Logger.f26647a.logError(Intrinsics.stringPlus("Create passive feedback payload exception ", e2.getMessage()));
        }
        return new C9851c(Integer.parseInt(formModel.getVersion()), (String) null, (String) null, false, jSONObject, str, 14, (DefaultConstructorMarker) null);
    }
}
