package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.events.C9175a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public enum ViewType {
    CONTAINER("container"),
    LINEAR_LAYOUT("linear_layout"),
    SCROLL_LAYOUT("scroll_layout"),
    EMPTY_VIEW("empty_view"),
    WEB_VIEW("web_view"),
    MEDIA("media"),
    LABEL("label"),
    LABEL_BUTTON("label_button"),
    IMAGE_BUTTON("image_button"),
    PAGER_CONTROLLER("pager_controller"),
    PAGER(C9175a.f24940g0),
    PAGER_INDICATOR("pager_indicator"),
    FORM_CONTROLLER("form_controller"),
    NPS_FORM_CONTROLLER("nps_form_controller"),
    CHECKBOX_CONTROLLER("checkbox_controller"),
    CHECKBOX("checkbox"),
    TOGGLE("toggle"),
    RADIO_INPUT_CONTROLLER("radio_input_controller"),
    RADIO_INPUT("radio_input"),
    TEXT_INPUT("text_input"),
    SCORE("score"),
    STATE_CONTROLLER("state_controller"),
    UNKNOWN("");
    

    /* renamed from: M0 */
    public static final List<ViewType> f88553M0 = null;

    /* renamed from: N0 */
    public static final List<ViewType> f88554N0 = null;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    static {
        ViewType viewType;
        ViewType viewType2;
        ViewType viewType3;
        ViewType viewType4;
        ViewType viewType5;
        ViewType viewType6;
        ViewType viewType7;
        ViewType viewType8;
        ViewType viewType9;
        ViewType viewType10;
        ViewType viewType11;
        f88553M0 = Arrays.asList(new ViewType[]{viewType4, viewType5, viewType7, viewType8, viewType6, viewType9, viewType10, viewType2, viewType3});
        f88554N0 = Arrays.asList(new ViewType[]{viewType4, viewType2, viewType3, viewType, viewType7, viewType11});
    }

    /* access modifiers changed from: public */
    ViewType(@C0359n0 String str) {
        this.value = str;
    }

    @C0359n0
    /* renamed from: b */
    public static ViewType m147722b(int i) {
        for (ViewType viewType : values()) {
            if (viewType.ordinal() == i) {
                return viewType;
            }
        }
        return UNKNOWN;
    }

    @C0359n0
    /* renamed from: g */
    public static ViewType m147723g(@C0359n0 String str) {
        for (ViewType viewType : values()) {
            if (viewType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return viewType;
            }
        }
        return UNKNOWN;
    }

    /* renamed from: q */
    public boolean mo107324q() {
        return f88554N0.contains(this);
    }

    /* renamed from: r */
    public boolean mo107325r() {
        return f88553M0.contains(this);
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
