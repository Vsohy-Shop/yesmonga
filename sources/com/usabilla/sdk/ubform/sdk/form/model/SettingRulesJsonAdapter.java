package com.usabilla.sdk.ubform.sdk.form.model;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import kotlin.C11076d0;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/SettingRulesJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/form/model/SettingRules;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class SettingRulesJsonAdapter extends C35384h<SettingRules> {
    @C12579k
    private final JsonReader.C35351b options;
    @C12579k
    private final C35384h<String> stringAdapter;

    public SettingRulesJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("name", "value");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"name\", \"value\")");
        this.options = a;
        C35384h<String> g = sVar.mo106089g(String.class, C10930d1.m40892k(), "name");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(String::class.java, emptySet(),\n      \"name\")");
        this.stringAdapter = g;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SettingRules");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C12579k
    public SettingRules fromJson(@C12579k JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "reader");
        jsonReader.mo105873b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo105877g()) {
            int x = jsonReader.mo105893x(this.options);
            if (x == -1) {
                jsonReader.mo105867D();
                jsonReader.mo105868E();
            } else if (x == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException z = C35393c.m145827z("name", "name", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"name\", \"name\",\n            reader)");
                    throw z;
                }
            } else if (x == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException z2 = C35393c.m145827z("value__", "value", jsonReader);
                Intrinsics.checkNotNullExpressionValue(z2, "unexpectedNull(\"value__\",\n            \"value\", reader)");
                throw z2;
            }
        }
        jsonReader.mo105875d();
        if (str == null) {
            JsonDataException q = C35393c.m145818q("name", "name", jsonReader);
            Intrinsics.checkNotNullExpressionValue(q, "missingProperty(\"name\", \"name\", reader)");
            throw q;
        } else if (str2 != null) {
            return new SettingRules(str, str2);
        } else {
            JsonDataException q2 = C35393c.m145818q("value__", "value", jsonReader);
            Intrinsics.checkNotNullExpressionValue(q2, "missingProperty(\"value__\", \"value\", reader)");
            throw q2;
        }
    }

    public void toJson(@C12579k C35407q qVar, @C12580l SettingRules settingRules) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (settingRules != null) {
            qVar.mo106040c();
            qVar.mo106045n("name");
            this.stringAdapter.toJson(qVar, settingRules.getName());
            qVar.mo106045n("value");
            this.stringAdapter.toJson(qVar, settingRules.getValue());
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
