package com.urbanairship.messagecenter;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18098w0;
import com.urbanairship.UAirship;
import com.urbanairship.images.C9282f;
import com.urbanairship.messagecenter.C9401y;
import com.urbanairship.util.C9636a;
import com.urbanairship.util.C9676r0;
import java.util.ArrayList;
import java.util.List;

public class MessageItemView extends FrameLayout {

    /* renamed from: w */
    public static final int[] f25529w = {C9401y.C9404c.ua_state_highlighted};

    /* renamed from: a */
    public View f25530a;

    /* renamed from: b */
    public TextView f25531b;

    /* renamed from: c */
    public TextView f25532c;

    /* renamed from: d */
    public ImageView f25533d;

    /* renamed from: e */
    public CheckBox f25534e;

    /* renamed from: f */
    public final List<Integer> f25535f;

    /* renamed from: g */
    public boolean f25536g;

    /* renamed from: v */
    public View.OnClickListener f25537v;

    public MessageItemView(@C0359n0 Context context) {
        this(context, (AttributeSet) null, C9401y.C9404c.messageCenterStyle);
    }

    @C0359n0
    /* renamed from: d */
    public static String m35150d(@C0359n0 Context context, @C0359n0 C9371g gVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(context.getString(C9401y.C9416o.ua_mc_description_state_selected));
        }
        if (!gVar.mo18991o0()) {
            sb.append(context.getString(C9401y.C9416o.ua_mc_description_state_unread));
        }
        sb.append(context.getString(C9401y.C9416o.ua_mc_description_title_and_date, new Object[]{gVar.mo18988j0(), DateFormat.getLongDateFormat(context).format(gVar.mo18985h0())}));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m35151f(View view) {
        View.OnClickListener onClickListener = this.f25537v;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m35152g(View view) {
        View.OnClickListener onClickListener = this.f25537v;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ boolean m35153h(View view, C18098w0.C18099a aVar) {
        View.OnClickListener onClickListener = this.f25537v;
        if (onClickListener == null) {
            return true;
        }
        onClickListener.onClick(this);
        return true;
    }

    /* renamed from: e */
    public final void mo18896e(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        int i3 = C9401y.C9412k.ua_item_mc_content;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9401y.C9418q.MessageCenter, i, i2);
        if (obtainStyledAttributes.getBoolean(C9401y.C9418q.MessageCenter_messageCenterItemIconEnabled, false)) {
            i3 = C9401y.C9412k.ua_item_mc_icon_content;
        }
        int resourceId = obtainStyledAttributes.getResourceId(C9401y.C9418q.MessageCenter_messageCenterItemDateTextAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C9401y.C9418q.MessageCenter_messageCenterItemTitleTextAppearance, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(C9401y.C9418q.MessageCenter_messageCenterItemBackground, 0);
        if (resourceId3 != 0) {
            setBackgroundResource(resourceId3);
        }
        obtainStyledAttributes.recycle();
        View inflate = View.inflate(context, i3, this);
        this.f25530a = inflate;
        TextView textView = (TextView) inflate.findViewById(C9401y.C9409h.title);
        this.f25531b = textView;
        C9676r0.m36241a(context, textView, resourceId2);
        TextView textView2 = (TextView) this.f25530a.findViewById(C9401y.C9409h.date);
        this.f25532c = textView2;
        C9676r0.m36241a(context, textView2, resourceId);
        ImageView imageView = (ImageView) this.f25530a.findViewById(C9401y.C9409h.image);
        this.f25533d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new C9389p(this));
        }
        CheckBox checkBox = (CheckBox) this.f25530a.findViewById(C9401y.C9409h.checkbox);
        this.f25534e = checkBox;
        if (checkBox != null) {
            checkBox.setOnClickListener(new C9390q(this));
        }
    }

    /* renamed from: i */
    public final void mo18897i(@C0359n0 View view, boolean z) {
        int i;
        for (Integer intValue : this.f25535f) {
            C18196h2.m82626r1(view, intValue.intValue());
        }
        Context context = getContext();
        if (z) {
            i = C9401y.C9416o.ua_mc_action_unselect;
        } else {
            i = C9401y.C9416o.ua_mc_action_select;
        }
        this.f25535f.add(Integer.valueOf(C18196h2.m82564c(view, context.getString(i), new C9388o(this))));
        C9636a.m36112a(view, C9401y.C9416o.ua_mc_action_click);
    }

    /* renamed from: j */
    public void mo18898j(@C0359n0 C9371g gVar, @C0375v int i, boolean z) {
        this.f25532c.setText(DateFormat.getDateFormat(getContext()).format(gVar.mo18985h0()));
        if (gVar.mo18991o0()) {
            this.f25531b.setText(gVar.mo18988j0());
        } else {
            SpannableString spannableString = new SpannableString(gVar.mo18988j0());
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
            this.f25531b.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
        CheckBox checkBox = this.f25534e;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
        if (this.f25533d != null) {
            UAirship.m146188Y().mo106229t().mo18651a(getContext(), this.f25533d, C9282f.m34839f(gVar.mo18975M()).mo18676i(i).mo18673f());
        }
        this.f25530a.setContentDescription(m35150d(getContext(), gVar, z));
        mo18897i(this.f25530a, z);
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f25536g) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        View.mergeDrawableStates(onCreateDrawableState, f25529w);
        return onCreateDrawableState;
    }

    public void setActivated(boolean z) {
        super.setActivated(z);
        CheckBox checkBox = this.f25534e;
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    public void setHighlighted(boolean z) {
        if (this.f25536g != z) {
            this.f25536g = z;
            refreshDrawableState();
        }
    }

    public void setSelectionListener(@C0363p0 View.OnClickListener onClickListener) {
        this.f25537v = onClickListener;
    }

    public MessageItemView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C9401y.C9404c.messageCenterStyle);
    }

    public MessageItemView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25535f = new ArrayList();
        mo18896e(context, attributeSet, i, C9401y.C9417p.MessageCenter);
    }

    public MessageItemView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25535f = new ArrayList();
        mo18896e(context, attributeSet, i, i2);
    }
}
