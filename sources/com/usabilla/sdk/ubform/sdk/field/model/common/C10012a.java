package com.usabilla.sdk.ubform.sdk.field.model.common;

import com.usabilla.sdk.ubform.sdk.field.model.ButtonModel;
import com.usabilla.sdk.ubform.sdk.field.model.CheckboxModel;
import com.usabilla.sdk.ubform.sdk.field.model.EmailModel;
import com.usabilla.sdk.ubform.sdk.field.model.HeaderModel;
import com.usabilla.sdk.ubform.sdk.field.model.MoodModel;
import com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel;
import com.usabilla.sdk.ubform.sdk.field.model.PickerModel;
import com.usabilla.sdk.ubform.sdk.field.model.RadioModel;
import com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel;
import com.usabilla.sdk.ubform.sdk.field.model.SliderModel;
import com.usabilla.sdk.ubform.sdk.field.model.StarModel;
import com.usabilla.sdk.ubform.sdk.field.model.TextBoxModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import java.util.List;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.a */
public final class C10012a {
    @C12579k

    /* renamed from: a */
    public static final C10012a f27496a = new C10012a();
    @C12579k

    /* renamed from: b */
    public static final String f27497b = "mode";
    @C12579k

    /* renamed from: c */
    public static final String f27498c = "type";
    @C12579k

    /* renamed from: d */
    public static MaskModel f27499d = new MaskModel((List) null, 0, 3, (DefaultConstructorMarker) null);

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final FieldModel<?> m37712a(@C12579k JSONObject jSONObject) throws JSONException {
        boolean z;
        Intrinsics.checkNotNullParameter(jSONObject, "fieldJson");
        String string = jSONObject.getString("type");
        if (Intrinsics.areEqual((Object) string, (Object) FieldType.CHECKBOX.mo21121g())) {
            return new CheckboxModel(jSONObject);
        }
        if (Intrinsics.areEqual((Object) string, (Object) FieldType.CHOICE.mo21121g())) {
            return new PickerModel(jSONObject);
        }
        if (Intrinsics.areEqual((Object) string, (Object) FieldType.EMAIL.mo21121g())) {
            return new EmailModel(jSONObject);
        }
        if (Intrinsics.areEqual((Object) string, (Object) FieldType.HEADER.mo21121g())) {
            return new HeaderModel(jSONObject);
        }
        if (!Intrinsics.areEqual((Object) string, (Object) FieldType.MOOD.mo21121g())) {
            boolean z2 = true;
            if (Intrinsics.areEqual((Object) string, (Object) FieldType.PARAGRAPH.mo21121g())) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) string, (Object) FieldType.PARAGRAPH_WITH_TITLE.mo21121g());
            }
            if (z) {
                return new ParagraphModel(jSONObject);
            }
            if (Intrinsics.areEqual((Object) string, (Object) FieldType.RADIO.mo21121g())) {
                return new RadioModel(jSONObject);
            }
            if (Intrinsics.areEqual((Object) string, (Object) FieldType.NPS.mo21121g())) {
                return new SliderModel(jSONObject, true);
            }
            if (Intrinsics.areEqual((Object) string, (Object) FieldType.RATING.mo21121g())) {
                return new SliderModel(jSONObject, false);
            }
            if (!Intrinsics.areEqual((Object) string, (Object) FieldType.TEXT.mo21121g())) {
                z2 = Intrinsics.areEqual((Object) string, (Object) FieldType.TEXT_AREA.mo21121g());
            }
            if (z2) {
                return new TextBoxModel(jSONObject, f27499d);
            }
            if (Intrinsics.areEqual((Object) string, (Object) FieldType.SCREENSHOT.mo21121g())) {
                return new ScreenshotModel(jSONObject);
            }
            if (Intrinsics.areEqual((Object) string, (Object) FieldType.CONTINUE.mo21121g())) {
                return new ButtonModel(jSONObject);
            }
            throw new JSONException(Intrinsics.stringPlus("Unknown field type: ", jSONObject.getString("type")));
        } else if (!jSONObject.has("mode") || !Intrinsics.areEqual((Object) FieldType.STAR.mo21121g(), (Object) jSONObject.getString("mode"))) {
            return new MoodModel(jSONObject);
        } else {
            return new StarModel(jSONObject);
        }
    }

    @C12579k
    /* renamed from: b */
    public final MaskModel mo21015b() {
        return f27499d;
    }

    /* renamed from: c */
    public final void mo21016c(@C12579k MaskModel maskModel) {
        Intrinsics.checkNotNullParameter(maskModel, "<set-?>");
        f27499d = maskModel;
    }
}
