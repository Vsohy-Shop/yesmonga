package com.usabilla.sdk.ubform.sdk.field.presenter.common;

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
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10013a;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10014b;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10015c;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10018d;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10020e;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10021f;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10022g;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10023h;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10025i;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10026j;
import com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.page.contract.C10061a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONException;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.common.a */
public final class C10016a {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.presenter.common.a$a */
    public /* synthetic */ class C10017a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldType.values().length];
            iArr[FieldType.CHECKBOX.ordinal()] = 1;
            iArr[FieldType.MOOD.ordinal()] = 2;
            iArr[FieldType.PARAGRAPH.ordinal()] = 3;
            iArr[FieldType.PARAGRAPH_WITH_TITLE.ordinal()] = 4;
            iArr[FieldType.TEXT.ordinal()] = 5;
            iArr[FieldType.TEXT_AREA.ordinal()] = 6;
            iArr[FieldType.CHOICE.ordinal()] = 7;
            iArr[FieldType.EMAIL.ordinal()] = 8;
            iArr[FieldType.RADIO.ordinal()] = 9;
            iArr[FieldType.NPS.ordinal()] = 10;
            iArr[FieldType.RATING.ordinal()] = 11;
            iArr[FieldType.STAR.ordinal()] = 12;
            iArr[FieldType.HEADER.ordinal()] = 13;
            iArr[FieldType.SCREENSHOT.ordinal()] = 14;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final FieldPresenter<?, ?> m37748a(@C12579k FieldModel<?> fieldModel, @C12579k C10061a.C10062a aVar) throws JSONException {
        int i;
        Intrinsics.checkNotNullParameter(fieldModel, "fieldModel");
        Intrinsics.checkNotNullParameter(aVar, "pagePresenter");
        FieldType c = fieldModel.mo20972c();
        if (c == null) {
            i = -1;
        } else {
            i = C10017a.$EnumSwitchMapping$0[c.ordinal()];
        }
        switch (i) {
            case 1:
                return new C10013a((CheckboxModel) fieldModel, aVar);
            case 2:
                return new C10018d((MoodModel) fieldModel, aVar);
            case 3:
            case 4:
                return new ParagraphPresenter((ParagraphModel) fieldModel, aVar);
            case 5:
            case 6:
                return new C10026j((TextBoxModel) fieldModel, aVar);
            case 7:
                return new C10020e((PickerModel) fieldModel, aVar);
            case 8:
                return new C10014b((EmailModel) fieldModel, aVar);
            case 9:
                return new C10021f((RadioModel) fieldModel, aVar);
            case 10:
            case 11:
                return new C10023h((SliderModel) fieldModel, aVar);
            case 12:
                return new C10025i((StarModel) fieldModel, aVar);
            case 13:
                return new C10015c((HeaderModel) fieldModel, aVar);
            case 14:
                return new C10022g((ScreenshotModel) fieldModel, aVar);
            default:
                throw new JSONException(Intrinsics.stringPlus("Unknown field type: ", c.mo21121g()));
        }
    }
}
