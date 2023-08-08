package com.usabilla.sdk.ubform.sdk.field.view.common;

/* renamed from: com.usabilla.sdk.ubform.sdk.field.view.common.b */
public final class C10040b {

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.common.b$a */
    public /* synthetic */ class C10041a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldType.values().length];
            iArr[FieldType.CHECKBOX.ordinal()] = 1;
            iArr[FieldType.CHOICE.ordinal()] = 2;
            iArr[FieldType.EMAIL.ordinal()] = 3;
            iArr[FieldType.MOOD.ordinal()] = 4;
            iArr[FieldType.PARAGRAPH.ordinal()] = 5;
            iArr[FieldType.PARAGRAPH_WITH_TITLE.ordinal()] = 6;
            iArr[FieldType.RADIO.ordinal()] = 7;
            iArr[FieldType.NPS.ordinal()] = 8;
            iArr[FieldType.RATING.ordinal()] = 9;
            iArr[FieldType.STAR.ordinal()] = 10;
            iArr[FieldType.TEXT.ordinal()] = 11;
            iArr[FieldType.TEXT_AREA.ordinal()] = 12;
            iArr[FieldType.HEADER.ordinal()] = 13;
            iArr[FieldType.SCREENSHOT.ordinal()] = 14;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter<?, ?>, com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.usabilla.sdk.ubform.sdk.field.view.common.FieldView<?> m37931a(@org.jetbrains.annotations.C12579k android.content.Context r2, @org.jetbrains.annotations.C12579k com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter<?, ?> r3) throws org.json.JSONException {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fieldPresenter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r0 = r3.mo20826p()
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r0 = r0.mo20972c()
            if (r0 != 0) goto L_0x0016
            r0 = -1
            goto L_0x001e
        L_0x0016:
            int[] r1 = com.usabilla.sdk.ubform.sdk.field.view.common.C10040b.C10041a.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L_0x001e:
            switch(r0) {
                case 1: goto L_0x0091;
                case 2: goto L_0x0089;
                case 3: goto L_0x0081;
                case 4: goto L_0x0079;
                case 5: goto L_0x0071;
                case 6: goto L_0x0071;
                case 7: goto L_0x0069;
                case 8: goto L_0x0061;
                case 9: goto L_0x0061;
                case 10: goto L_0x0059;
                case 11: goto L_0x0051;
                case 12: goto L_0x0049;
                case 13: goto L_0x0041;
                case 14: goto L_0x0039;
                default: goto L_0x0021;
            }
        L_0x0021:
            org.json.JSONException r2 = new org.json.JSONException
            com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel r3 = r3.mo20826p()
            com.usabilla.sdk.ubform.sdk.field.view.common.FieldType r3 = r3.mo20972c()
            java.lang.String r3 = r3.mo21121g()
            java.lang.String r0 = "Unknown field type: "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r3)
            r2.<init>(r3)
            throw r2
        L_0x0039:
            com.usabilla.sdk.ubform.sdk.field.view.ScreenshotView r0 = new com.usabilla.sdk.ubform.sdk.field.view.ScreenshotView
            com.usabilla.sdk.ubform.sdk.field.presenter.g r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10022g) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0041:
            com.usabilla.sdk.ubform.sdk.field.view.HeaderView r0 = new com.usabilla.sdk.ubform.sdk.field.view.HeaderView
            com.usabilla.sdk.ubform.sdk.field.presenter.c r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10015c) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0049:
            com.usabilla.sdk.ubform.sdk.field.view.TextAreaView r0 = new com.usabilla.sdk.ubform.sdk.field.view.TextAreaView
            com.usabilla.sdk.ubform.sdk.field.presenter.j r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10026j) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0051:
            com.usabilla.sdk.ubform.sdk.field.view.TextBoxView r0 = new com.usabilla.sdk.ubform.sdk.field.view.TextBoxView
            com.usabilla.sdk.ubform.sdk.field.presenter.j r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10026j) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0059:
            com.usabilla.sdk.ubform.sdk.field.view.StarView r0 = new com.usabilla.sdk.ubform.sdk.field.view.StarView
            com.usabilla.sdk.ubform.sdk.field.presenter.i r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10025i) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0061:
            com.usabilla.sdk.ubform.sdk.field.view.SliderView r0 = new com.usabilla.sdk.ubform.sdk.field.view.SliderView
            com.usabilla.sdk.ubform.sdk.field.presenter.h r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10023h) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0069:
            com.usabilla.sdk.ubform.sdk.field.view.RadioView r0 = new com.usabilla.sdk.ubform.sdk.field.view.RadioView
            com.usabilla.sdk.ubform.sdk.field.presenter.f r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10021f) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0071:
            com.usabilla.sdk.ubform.sdk.field.view.ParagraphView r0 = new com.usabilla.sdk.ubform.sdk.field.view.ParagraphView
            com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0079:
            com.usabilla.sdk.ubform.sdk.field.view.MoodView r0 = new com.usabilla.sdk.ubform.sdk.field.view.MoodView
            com.usabilla.sdk.ubform.sdk.field.presenter.d r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10018d) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0081:
            com.usabilla.sdk.ubform.sdk.field.view.EmailView r0 = new com.usabilla.sdk.ubform.sdk.field.view.EmailView
            com.usabilla.sdk.ubform.sdk.field.presenter.b r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10014b) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0089:
            com.usabilla.sdk.ubform.sdk.field.view.PickerView r0 = new com.usabilla.sdk.ubform.sdk.field.view.PickerView
            com.usabilla.sdk.ubform.sdk.field.presenter.e r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10020e) r3
            r0.<init>(r2, r3)
            goto L_0x0098
        L_0x0091:
            com.usabilla.sdk.ubform.sdk.field.view.CheckboxView r0 = new com.usabilla.sdk.ubform.sdk.field.view.CheckboxView
            com.usabilla.sdk.ubform.sdk.field.presenter.a r3 = (com.usabilla.sdk.ubform.sdk.field.presenter.C10013a) r3
            r0.<init>(r2, r3)
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.sdk.field.view.common.C10040b.m37931a(android.content.Context, com.usabilla.sdk.ubform.sdk.field.presenter.common.FieldPresenter):com.usabilla.sdk.ubform.sdk.field.view.common.FieldView");
    }
}
