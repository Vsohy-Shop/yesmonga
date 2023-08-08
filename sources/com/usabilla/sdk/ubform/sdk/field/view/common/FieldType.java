package com.usabilla.sdk.ubform.sdk.field.view.common;

import androidx.annotation.C0359n0;
import com.carrefour.fid.android.shared.constant.C28549i0;
import org.json.JSONException;

public enum FieldType {
    MOOD("mood"),
    EMAIL("email"),
    STAR("star"),
    PARAGRAPH("paragraph"),
    PARAGRAPH_WITH_TITLE("titleParagraph"),
    TEXT_AREA("textArea"),
    TEXT("text"),
    CHOICE("choice"),
    NPS("nps"),
    RATING("rating"),
    SCREENSHOT("screenshot"),
    CHECKBOX("checkbox"),
    RADIO("radio"),
    HEADER(C28549i0.f69374H),
    CONTINUE("continue");
    
    private final String type;

    /* access modifiers changed from: public */
    FieldType(@C0359n0 String str) {
        this.type = str;
    }

    /* renamed from: b */
    public static FieldType m37914b(@C0359n0 String str) throws JSONException {
        for (FieldType fieldType : values()) {
            if (fieldType.mo21121g().equals(str)) {
                return fieldType;
            }
        }
        throw new RuntimeException("Unknown field type: " + str);
    }

    /* renamed from: g */
    public String mo21121g() {
        return this.type;
    }
}
