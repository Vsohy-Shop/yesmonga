package com.usabilla.sdk.ubform.sdk.passiveForm;

import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.response.UbError;
import com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.json.JSONException;
import org.json.JSONObject;

public final class PassiveFormService {
    @C12579k

    /* renamed from: a */
    public final C9870g f27709a;
    @C12579k

    /* renamed from: b */
    public final C9853d f27710b;

    /* renamed from: c */
    public final int f27711c = 31250;

    public PassiveFormService(@C12579k C9870g gVar, @C12579k C9853d dVar) {
        Intrinsics.checkNotNullParameter(gVar, "client");
        Intrinsics.checkNotNullParameter(dVar, "requestBuilder");
        this.f27709a = gVar;
        this.f27710b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final /* synthetic */ List m38168f(String str, C10087a aVar) throws JSONException, UbError.UbHttpError {
        ArrayList<String> c = mo21475c(str);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = c.iterator();
        int i = 1;
        while (it.hasNext()) {
            String next = it.next();
            String a = aVar.mo21497a();
            String b = aVar.mo21498b();
            Intrinsics.checkNotNullExpressionValue(next, "chunk");
            arrayList.add(mo21474b(mo21476d(a, b, i, next, false)));
            i++;
        }
        arrayList.add(mo21474b(mo21476d(aVar.mo21497a(), aVar.mo21498b(), i, "", true)));
        return arrayList;
    }

    /* renamed from: b */
    public final C11907e<C11079d2> mo21474b(JSONObject jSONObject) throws UbError.UbHttpError {
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27709a, this.f27710b.mo20275b(jSONObject)), PassiveFormService$createScreenshotSubmissionChunk$1.f27712f, PassiveFormService$createScreenshotSubmissionChunk$2.f27713f);
    }

    /* renamed from: c */
    public final ArrayList<String> mo21475c(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        int length = str.length();
        int i = this.f27711c;
        int i2 = length / i;
        int i3 = length % i;
        if (i2 > 0) {
            C11466l W1 = C11479u.m44378W1(0, i2);
            ArrayList<Number> arrayList2 = new ArrayList<>(C10978t.m41495Y(W1, 10));
            Iterator it = W1.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C10953k0) it).mo6374c() * this.f27711c));
            }
            for (Number intValue : arrayList2) {
                int intValue2 = intValue.intValue();
                String substring = str.substring(intValue2, this.f27711c + intValue2);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
            }
        }
        if (i3 > 0) {
            String substring2 = str.substring(i2 * this.f27711c);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
            arrayList.add(substring2);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final JSONObject mo21476d(String str, String str2, int i, String str3, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("id", str);
        jSONObject.put(C10087a.f27734e, str2);
        jSONObject.put("type", "app_feedback");
        jSONObject.put("subtype", "media.screenshot");
        jSONObject.put(C9851c.f26937h, i);
        jSONObject.put(C9851c.f26941l, z);
        jSONObject3.put("screenshot", str3);
        jSONObject2.put("media", jSONObject3);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    /* renamed from: e */
    public final /* synthetic */ C11907e mo21477e(String str) throws UbError.UbServerError {
        Intrinsics.checkNotNullParameter(str, "formId");
        C9872i f = this.f27710b.mo20279f(str);
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27709a, f), PassiveFormService$getPassiveForm$1.f27714f, new PassiveFormService$getPassiveForm$2(f));
    }

    @C12579k
    /* renamed from: g */
    public final C11907e<List<C11907e<C11079d2>>> mo21478g(@C12579k C9851c cVar) throws UbError.UbServerError {
        Intrinsics.checkNotNullParameter(cVar, "payload");
        C9872i b = this.f27710b.mo20275b(new JSONObject(cVar.mo20272d()));
        return ExtensionFlowKt.m38302c(ExtensionFlowKt.m38301b(this.f27709a, b), new PassiveFormService$submitPassiveForm$1(cVar, this), new PassiveFormService$submitPassiveForm$2(b));
    }
}
