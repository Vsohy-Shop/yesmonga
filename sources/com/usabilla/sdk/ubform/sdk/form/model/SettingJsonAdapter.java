package com.usabilla.sdk.ubform.sdk.form.model;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.C35431v;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/SettingJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/form/model/Setting;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/usabilla/sdk/ubform/sdk/form/model/VariableName;", "variableNameAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "", "Lcom/usabilla/sdk/ubform/sdk/form/model/SettingRules;", "listOfSettingRulesAdapter", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class SettingJsonAdapter extends C35384h<Setting> {
    @C12579k
    private final C35384h<List<SettingRules>> listOfSettingRulesAdapter;
    @C12579k
    private final JsonReader.C35351b options;
    @C12579k
    private final C35384h<String> stringAdapter;
    @C12579k
    private final C35384h<VariableName> variableNameAdapter;

    public SettingJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("variable", "value", "rules");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"variable\", \"value\", \"rules\")");
        this.options = a;
        C35384h<VariableName> g = sVar.mo106089g(VariableName.class, C10930d1.m40892k(), "variable");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(VariableName::class.java, emptySet(), \"variable\")");
        this.variableNameAdapter = g;
        C35384h<String> g2 = sVar.mo106089g(String.class, C10930d1.m40892k(), "value");
        Intrinsics.checkNotNullExpressionValue(g2, "moshi.adapter(String::class.java, emptySet(),\n      \"value\")");
        this.stringAdapter = g2;
        C35384h<List<SettingRules>> g3 = sVar.mo106089g(C35431v.m146026m(List.class, SettingRules.class), C10930d1.m40892k(), "rules");
        Intrinsics.checkNotNullExpressionValue(g3, "moshi.adapter(Types.newParameterizedType(List::class.java, SettingRules::class.java),\n      emptySet(), \"rules\")");
        this.listOfSettingRulesAdapter = g3;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Setting");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C12579k
    public Setting fromJson(@C12579k JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "reader");
        jsonReader.mo105873b();
        VariableName variableName = null;
        String str = null;
        List list = null;
        while (jsonReader.mo105877g()) {
            int x = jsonReader.mo105893x(this.options);
            if (x == -1) {
                jsonReader.mo105867D();
                jsonReader.mo105868E();
            } else if (x == 0) {
                variableName = this.variableNameAdapter.fromJson(jsonReader);
                if (variableName == null) {
                    JsonDataException z = C35393c.m145827z("variable", "variable", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"variable\", \"variable\", reader)");
                    throw z;
                }
            } else if (x == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException z2 = C35393c.m145827z("value__", "value", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(z2, "unexpectedNull(\"value__\",\n            \"value\", reader)");
                    throw z2;
                }
            } else if (x == 2 && (list = this.listOfSettingRulesAdapter.fromJson(jsonReader)) == null) {
                JsonDataException z3 = C35393c.m145827z("rules", "rules", jsonReader);
                Intrinsics.checkNotNullExpressionValue(z3, "unexpectedNull(\"rules\", \"rules\", reader)");
                throw z3;
            }
        }
        jsonReader.mo105875d();
        if (variableName == null) {
            JsonDataException q = C35393c.m145818q("variable", "variable", jsonReader);
            Intrinsics.checkNotNullExpressionValue(q, "missingProperty(\"variable\", \"variable\", reader)");
            throw q;
        } else if (str == null) {
            JsonDataException q2 = C35393c.m145818q("value__", "value", jsonReader);
            Intrinsics.checkNotNullExpressionValue(q2, "missingProperty(\"value__\", \"value\", reader)");
            throw q2;
        } else if (list != null) {
            return new Setting(variableName, str, list);
        } else {
            JsonDataException q3 = C35393c.m145818q("rules", "rules", jsonReader);
            Intrinsics.checkNotNullExpressionValue(q3, "missingProperty(\"rules\", \"rules\", reader)");
            throw q3;
        }
    }

    public void toJson(@C12579k C35407q qVar, @C12580l Setting setting) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (setting != null) {
            qVar.mo106040c();
            qVar.mo106045n("variable");
            this.variableNameAdapter.toJson(qVar, setting.getVariable());
            qVar.mo106045n("value");
            this.stringAdapter.toJson(qVar, setting.getValue());
            qVar.mo106045n("rules");
            this.listOfSettingRulesAdapter.toJson(qVar, setting.getRules());
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
