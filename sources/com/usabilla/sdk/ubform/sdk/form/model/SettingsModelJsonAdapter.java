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

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/SettingsModelJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/form/model/SettingsModel;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/usabilla/sdk/ubform/sdk/form/model/Setting;", "listOfSettingAdapter", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class SettingsModelJsonAdapter extends C35384h<SettingsModel> {
    @C12579k
    private final C35384h<List<Setting>> listOfSettingAdapter;
    @C12579k
    private final JsonReader.C35351b options;

    public SettingsModelJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("settings");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"settings\")");
        this.options = a;
        C35384h<List<Setting>> g = sVar.mo106089g(C35431v.m146026m(List.class, Setting.class), C10930d1.m40892k(), "settings");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(Types.newParameterizedType(List::class.java, Setting::class.java), emptySet(),\n      \"settings\")");
        this.listOfSettingAdapter = g;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SettingsModel");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C12579k
    public SettingsModel fromJson(@C12579k JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "reader");
        jsonReader.mo105873b();
        List list = null;
        while (jsonReader.mo105877g()) {
            int x = jsonReader.mo105893x(this.options);
            if (x == -1) {
                jsonReader.mo105867D();
                jsonReader.mo105868E();
            } else if (x == 0 && (list = this.listOfSettingAdapter.fromJson(jsonReader)) == null) {
                JsonDataException z = C35393c.m145827z("settings", "settings", jsonReader);
                Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"settings\", \"settings\", reader)");
                throw z;
            }
        }
        jsonReader.mo105875d();
        if (list != null) {
            return new SettingsModel(list);
        }
        JsonDataException q = C35393c.m145818q("settings", "settings", jsonReader);
        Intrinsics.checkNotNullExpressionValue(q, "missingProperty(\"settings\", \"settings\", reader)");
        throw q;
    }

    public void toJson(@C12579k C35407q qVar, @C12580l SettingsModel settingsModel) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (settingsModel != null) {
            qVar.mo106040c();
            qVar.mo106045n("settings");
            this.listOfSettingAdapter.toJson(qVar, settingsModel.getSettings());
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
