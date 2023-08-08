package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31395g;
import com.google.android.material.internal.C31422p;
import com.google.android.material.theme.overlay.C31683a;

public class TextInputEditText extends AppCompatEditText {

    /* renamed from: g */
    public final Rect f76845g;

    /* renamed from: v */
    public boolean f76846v;

    public TextInputEditText(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0363p0
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @C0363p0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: g */
    public final String mo91462g(@C0359n0 TextInputLayout textInputLayout) {
        String str;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        String str2 = "";
        if (!TextUtils.isEmpty(hint)) {
            str = hint.toString();
        } else {
            str = str2;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            if (!TextUtils.isEmpty(str)) {
                str2 = ", " + str;
            }
            sb.append(str2);
            return sb.toString();
        } else if (!TextUtils.isEmpty(str)) {
            return str;
        } else {
            return str2;
        }
    }

    public void getFocusedRect(@C0363p0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (mo91467i(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f76845g);
            rect.bottom = this.f76845g.bottom;
        }
    }

    public boolean getGlobalVisibleRect(@C0363p0 Rect rect, @C0363p0 Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (mo91467i(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @C0363p0
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.mo91516Z()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* renamed from: h */
    public boolean mo91466h() {
        return this.f76846v;
    }

    /* renamed from: i */
    public final boolean mo91467i(@C0363p0 TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f76846v;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo91516Z() && super.getHint() == null && C31395g.m126865c()) {
            setHint("");
        }
    }

    @C0363p0
    public InputConnection onCreateInputConnection(@C0359n0 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public boolean requestRectangleOnScreen(@C0363p0 Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!mo91467i(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f76845g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f76845g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f76846v = z;
    }

    public TextInputEditText(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.editTextStyle);
    }

    public TextInputEditText(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C31683a.m128455c(context, attributeSet, i, 0), attributeSet, i);
        this.f76845g = new Rect();
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.TextInputEditText, i, C31076a.C31090n.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(j.getBoolean(C31076a.C31091o.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        j.recycle();
    }
}
