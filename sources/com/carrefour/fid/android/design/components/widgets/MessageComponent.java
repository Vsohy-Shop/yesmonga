package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0324b1;
import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import androidx.core.content.res.C17465i;
import androidx.core.widget.C18483j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37032b0;
import com.carrefour.fid.android.design.components.utils.C37140g;
import com.carrefour.fid.android.design.components.widgets.list.C37261b;
import com.carrefour.fid.android.design.components.widgets.list.C37267g;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002-(B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0014\u0010\r\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0014\u0010\u000e\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u001e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u0014\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eJ\"\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0002H\u0002R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/MessageComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "icon", "title", "description", "iconButton", "Lkotlin/d2;", "setupMessageOnBoardingView", "setupMessageErrorView", "Lkotlin/Function0;", "listener", "setOnPrimaryButtonClickListener", "setOnSecondaryButtonClickListener", "setOnThirdButtonClickListener", "Landroid/view/View$OnClickListener;", "primaryClickListener", "secondaryClickListener", "thirdClickListener", "C", "", "Lcom/carrefour/fid/android/design/components/widgets/list/g;", "list", "setList", "", "enabled", "J", "K", "L", "M", "Lcom/carrefour/fid/android/design/components/widgets/MessageComponent$a;", "model", "A", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "B", "Lcom/carrefour/fid/android/design/components/databinding/b0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/b0;", "binding", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Type", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class MessageComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93066b = 8;
    @C12579k

    /* renamed from: a */
    public final C37032b0 f93067a;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/MessageComponent$Type;", "", "", "icon", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "titleColor", "I", "r", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;I)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Type {
        ERROR(Integer.valueOf(C36896b.C36904h.ds_gr_red_error), C36896b.C36902f.ds_red_1),
        ON_BOARDING((String) null, r1),
        ON_OTHERS((String) null, r1);
        
        @C12580l
        private final Integer icon;
        private final int titleColor;

        /* access modifiers changed from: public */
        Type(@C0375v Integer num, @C0358n int i) {
            this.icon = num;
            this.titleColor = i;
        }

        @C12580l
        /* renamed from: q */
        public final Integer mo112908q() {
            return this.icon;
        }

        /* renamed from: r */
        public final int mo112909r() {
            return this.titleColor;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public MessageComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: D */
    public static final void m152357D(View.OnClickListener onClickListener, MessageComponent messageComponent, View view) {
        Intrinsics.checkNotNullParameter(onClickListener, "$primaryClickListener");
        Intrinsics.checkNotNullParameter(messageComponent, "this$0");
        onClickListener.onClick(messageComponent);
    }

    /* renamed from: E */
    public static final void m152358E(View.OnClickListener onClickListener, MessageComponent messageComponent, View view) {
        Intrinsics.checkNotNullParameter(onClickListener, "$secondaryClickListener");
        Intrinsics.checkNotNullParameter(messageComponent, "this$0");
        onClickListener.onClick(messageComponent);
    }

    /* renamed from: F */
    public static final void m152359F(View.OnClickListener onClickListener, MessageComponent messageComponent, View view) {
        Intrinsics.checkNotNullParameter(onClickListener, "$thirdClickListener");
        Intrinsics.checkNotNullParameter(messageComponent, "this$0");
        onClickListener.onClick(messageComponent);
    }

    /* renamed from: G */
    public static final void m152360G(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$listener");
        aVar.invoke();
    }

    /* renamed from: H */
    public static final void m152361H(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$listener");
        aVar.invoke();
    }

    /* renamed from: I */
    public static final void m152362I(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$listener");
        aVar.invoke();
    }

    public static /* synthetic */ void setupMessageOnBoardingView$default(MessageComponent messageComponent, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = -1;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        messageComponent.setupMessageOnBoardingView(i, i2, i3, i4);
    }

    /* renamed from: A */
    public final void mo112895A(@C12579k C37154a aVar) {
        int i;
        C11079d2 d2Var;
        Integer q;
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        C37032b0 b0Var = this.f93067a;
        b0Var.f92574i.setText(aVar.mo112928r());
        AppCompatTextView appCompatTextView = b0Var.f92574i;
        int s = aVar.mo112929s();
        if (s == 0 || s != 1) {
            i = 5;
        } else {
            i = 4;
        }
        appCompatTextView.setTextAlignment(i);
        Drawable m = aVar.mo112923m();
        C11079d2 d2Var2 = null;
        if (m != null) {
            b0Var.f92569d.setImageDrawable(m);
            if (aVar.mo112930t() == Type.ON_BOARDING) {
                int dimension = (int) getContext().getResources().getDimension(C36896b.C36903g.ds_message_onboarding_image_size);
                ViewGroup.LayoutParams layoutParams = b0Var.f92569d.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                b0Var.f92569d.setLayoutParams(layoutParams);
                C18483j.m83673c(b0Var.f92569d, ColorStateList.valueOf(C17318d.m79723f(getContext(), C36896b.C36902f.ds_primary)));
            }
            b0Var.f92569d.setVisibility(0);
            d2Var = C11079d2.f28267a;
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            b0Var.f92569d.setVisibility(8);
        }
        String l = aVar.mo112922l();
        if (l != null) {
            b0Var.f92568c.setText(l);
            b0Var.f92568c.setVisibility(0);
            d2Var2 = C11079d2.f28267a;
        }
        if (d2Var2 == null) {
            b0Var.f92568c.setVisibility(8);
        }
        if (aVar.mo112925o() != null) {
            this.f93067a.f92570e.setVisibility(0);
            this.f93067a.f92570e.setText(aVar.mo112925o());
        } else {
            this.f93067a.f92570e.setVisibility(8);
        }
        if (aVar.mo112926p() != null) {
            this.f93067a.f92572g.setVisibility(0);
            this.f93067a.f92572g.setText(aVar.mo112926p());
        } else {
            this.f93067a.f92572g.setVisibility(8);
        }
        if (aVar.mo112927q() != null) {
            this.f93067a.f92573h.setVisibility(0);
            this.f93067a.f92573h.setText(aVar.mo112927q());
        } else {
            this.f93067a.f92573h.setVisibility(8);
        }
        Type t = aVar.mo112930t();
        if (t != null) {
            this.f93067a.f92574i.setTextColor(C17465i.m80173e(getResources(), t.mo112909r(), getContext().getTheme()));
            if (t.mo112908q() == null || ((q = t.mo112908q()) != null && q.intValue() == 0)) {
                this.f93067a.f92574i.setTextAlignment(4);
                AppCompatTextView appCompatTextView2 = this.f93067a.f92574i;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.messageTitle");
                C37140g.m152216a(appCompatTextView2, 0, C36896b.C36903g.ds_component_image_error_inset_size_l);
            } else {
                this.f93067a.f92574i.setTextAlignment(5);
                AppCompatTextView appCompatTextView3 = this.f93067a.f92574i;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.messageTitle");
                C37140g.m152216a(appCompatTextView3, t.mo112908q().intValue(), C36896b.C36903g.ds_component_image_error_inset_size_l);
            }
        }
        Drawable n = aVar.mo112924n();
        if (n != null) {
            this.f93067a.f92570e.setIcon(n);
            this.f93067a.f92570e.setIconGravity(2);
        }
    }

    /* renamed from: B */
    public final void mo112896B(Context context, AttributeSet attributeSet, int i) {
        Type type;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.MessageComponent, i, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C36896b.C36914r.MessageComponent_imageMessage);
                String string = obtainStyledAttributes.getString(C36896b.C36914r.MessageComponent_titleMessage);
                if (string == null) {
                    string = new String();
                }
                String str = string;
                Intrinsics.checkNotNullExpressionValue(str, "getString(R.styleable.Me…titleMessage) ?: String()");
                int integer = obtainStyledAttributes.getInteger(C36896b.C36914r.MessageComponent_titleAlignment, 0);
                String string2 = obtainStyledAttributes.getString(C36896b.C36914r.MessageComponent_descriptionMessage);
                String string3 = obtainStyledAttributes.getString(C36896b.C36914r.MessageComponent_primaryActionMessage);
                Drawable drawable2 = obtainStyledAttributes.getDrawable(C36896b.C36914r.MessageComponent_primaryActionIcon);
                String string4 = obtainStyledAttributes.getString(C36896b.C36914r.MessageComponent_secondaryActionMessage);
                String string5 = obtainStyledAttributes.getString(C36896b.C36914r.MessageComponent_thirdActionMessage);
                int integer2 = obtainStyledAttributes.getInteger(C36896b.C36914r.MessageComponent_typeMessage, 0);
                if (integer2 == 0) {
                    type = Type.ERROR;
                } else if (integer2 == 1) {
                    type = Type.ON_BOARDING;
                } else if (integer2 != 2) {
                    type = Type.ERROR;
                } else {
                    type = Type.ON_OTHERS;
                }
                mo112895A(new C37154a(drawable, str, string2, string3, string4, string5, type, integer, drawable2));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: C */
    public final void mo112897C(@C12579k View.OnClickListener onClickListener, @C12579k View.OnClickListener onClickListener2, @C12579k View.OnClickListener onClickListener3) {
        Intrinsics.checkNotNullParameter(onClickListener, "primaryClickListener");
        Intrinsics.checkNotNullParameter(onClickListener2, "secondaryClickListener");
        Intrinsics.checkNotNullParameter(onClickListener3, "thirdClickListener");
        this.f93067a.f92570e.setOnClickListener(new C37188a0(onClickListener, this));
        this.f93067a.f92572g.setOnClickListener(new C37200b0(onClickListener2, this));
        this.f93067a.f92573h.setOnClickListener(new C37203c0(onClickListener3, this));
    }

    /* renamed from: J */
    public final void mo112898J(boolean z) {
        this.f93067a.f92570e.setEnabled(z);
        this.f93067a.f92572g.setEnabled(z);
        this.f93067a.f92573h.setEnabled(z);
    }

    /* renamed from: K */
    public final void mo112899K(boolean z) {
        this.f93067a.f92570e.setLoading(z);
    }

    /* renamed from: L */
    public final void mo112900L(boolean z) {
        this.f93067a.f92572g.setLoading(z);
    }

    /* renamed from: M */
    public final void mo112901M(boolean z) {
        this.f93067a.f92573h.setLoading(z);
    }

    public final void setList(@C12579k List<C37267g> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView recyclerView = this.f93067a.f92571f;
        if (!list.isEmpty()) {
            recyclerView.setVisibility(0);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C37261b bVar = new C37261b();
            bVar.setList(list);
            recyclerView.setAdapter(bVar);
            return;
        }
        recyclerView.setVisibility(8);
    }

    public final void setOnPrimaryButtonClickListener(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        this.f93067a.f92570e.setOnClickListener(new C37219e0(aVar));
    }

    public final void setOnSecondaryButtonClickListener(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        this.f93067a.f92572g.setOnClickListener(new C37216d0(aVar));
    }

    public final void setOnThirdButtonClickListener(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        this.f93067a.f92573h.setOnClickListener(new C37433z(aVar));
    }

    public final void setupMessageErrorView(@C0375v int i, @C0324b1 int i2) {
        this.f93067a.f92569d.setImageDrawable(C17318d.m79726i(getContext(), i));
        this.f93067a.f92574i.setText(getContext().getString(i2));
    }

    public final void setupMessageOnBoardingView(@C0375v int i, @C0324b1 int i2, @C0324b1 int i3, @C0375v int i4) {
        this.f93067a.f92569d.setImageDrawable(C17318d.m79726i(getContext(), i));
        this.f93067a.f92574i.setText(getContext().getString(i2));
        AppCompatTextView appCompatTextView = this.f93067a.f92568c;
        if (i3 != -1) {
            appCompatTextView.setText(appCompatTextView.getContext().getString(i3));
            appCompatTextView.setVisibility(0);
        } else {
            appCompatTextView.setVisibility(8);
        }
        if (i4 != -1) {
            this.f93067a.f92570e.setIcon(C17318d.m79726i(getContext(), i4));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public MessageComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public MessageComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37032b0 b = C37032b0.m151938b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93067a = b;
        mo112896B(context, attributeSet, i);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.MessageComponent$a */
    public static final class C37154a {

        /* renamed from: j */
        public static final int f93072j = 8;
        @C12580l

        /* renamed from: a */
        public final Drawable f93073a;
        @C12579k

        /* renamed from: b */
        public final String f93074b;
        @C12580l

        /* renamed from: c */
        public final String f93075c;
        @C12580l

        /* renamed from: d */
        public final String f93076d;
        @C12580l

        /* renamed from: e */
        public final String f93077e;
        @C12580l

        /* renamed from: f */
        public final String f93078f;
        @C12580l

        /* renamed from: g */
        public final Type f93079g;

        /* renamed from: h */
        public final int f93080h;
        @C12580l

        /* renamed from: i */
        public final Drawable f93081i;

        public C37154a(@C12580l Drawable drawable, @C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Type type, int i, @C12580l Drawable drawable2) {
            Intrinsics.checkNotNullParameter(str, "title");
            this.f93073a = drawable;
            this.f93074b = str;
            this.f93075c = str2;
            this.f93076d = str3;
            this.f93077e = str4;
            this.f93078f = str5;
            this.f93079g = type;
            this.f93080h = i;
            this.f93081i = drawable2;
        }

        /* renamed from: k */
        public static /* synthetic */ C37154a m152379k(C37154a aVar, Drawable drawable, String str, String str2, String str3, String str4, String str5, Type type, int i, Drawable drawable2, int i2, Object obj) {
            C37154a aVar2 = aVar;
            int i3 = i2;
            return aVar.mo112921j((i3 & 1) != 0 ? aVar2.f93073a : drawable, (i3 & 2) != 0 ? aVar2.f93074b : str, (i3 & 4) != 0 ? aVar2.f93075c : str2, (i3 & 8) != 0 ? aVar2.f93076d : str3, (i3 & 16) != 0 ? aVar2.f93077e : str4, (i3 & 32) != 0 ? aVar2.f93078f : str5, (i3 & 64) != 0 ? aVar2.f93079g : type, (i3 & 128) != 0 ? aVar2.f93080h : i, (i3 & 256) != 0 ? aVar2.f93081i : drawable2);
        }

        @C12580l
        /* renamed from: a */
        public final Drawable mo112910a() {
            return this.f93073a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo112911b() {
            return this.f93074b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo112912c() {
            return this.f93075c;
        }

        @C12580l
        /* renamed from: d */
        public final String mo112913d() {
            return this.f93076d;
        }

        @C12580l
        /* renamed from: e */
        public final String mo112914e() {
            return this.f93077e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37154a)) {
                return false;
            }
            C37154a aVar = (C37154a) obj;
            return Intrinsics.areEqual((Object) this.f93073a, (Object) aVar.f93073a) && Intrinsics.areEqual((Object) this.f93074b, (Object) aVar.f93074b) && Intrinsics.areEqual((Object) this.f93075c, (Object) aVar.f93075c) && Intrinsics.areEqual((Object) this.f93076d, (Object) aVar.f93076d) && Intrinsics.areEqual((Object) this.f93077e, (Object) aVar.f93077e) && Intrinsics.areEqual((Object) this.f93078f, (Object) aVar.f93078f) && this.f93079g == aVar.f93079g && this.f93080h == aVar.f93080h && Intrinsics.areEqual((Object) this.f93081i, (Object) aVar.f93081i);
        }

        @C12580l
        /* renamed from: f */
        public final String mo112916f() {
            return this.f93078f;
        }

        @C12580l
        /* renamed from: g */
        public final Type mo112917g() {
            return this.f93079g;
        }

        /* renamed from: h */
        public final int mo112918h() {
            return this.f93080h;
        }

        public int hashCode() {
            Drawable drawable = this.f93073a;
            int i = 0;
            int hashCode = (((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f93074b.hashCode()) * 31;
            String str = this.f93075c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f93076d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93077e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f93078f;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Type type = this.f93079g;
            int hashCode6 = (((hashCode5 + (type == null ? 0 : type.hashCode())) * 31) + Integer.hashCode(this.f93080h)) * 31;
            Drawable drawable2 = this.f93081i;
            if (drawable2 != null) {
                i = drawable2.hashCode();
            }
            return hashCode6 + i;
        }

        @C12580l
        /* renamed from: i */
        public final Drawable mo112920i() {
            return this.f93081i;
        }

        @C12579k
        /* renamed from: j */
        public final C37154a mo112921j(@C12580l Drawable drawable, @C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Type type, int i, @C12580l Drawable drawable2) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new C37154a(drawable, str, str2, str3, str4, str5, type, i, drawable2);
        }

        @C12580l
        /* renamed from: l */
        public final String mo112922l() {
            return this.f93075c;
        }

        @C12580l
        /* renamed from: m */
        public final Drawable mo112923m() {
            return this.f93073a;
        }

        @C12580l
        /* renamed from: n */
        public final Drawable mo112924n() {
            return this.f93081i;
        }

        @C12580l
        /* renamed from: o */
        public final String mo112925o() {
            return this.f93076d;
        }

        @C12580l
        /* renamed from: p */
        public final String mo112926p() {
            return this.f93077e;
        }

        @C12580l
        /* renamed from: q */
        public final String mo112927q() {
            return this.f93078f;
        }

        @C12579k
        /* renamed from: r */
        public final String mo112928r() {
            return this.f93074b;
        }

        /* renamed from: s */
        public final int mo112929s() {
            return this.f93080h;
        }

        @C12580l
        /* renamed from: t */
        public final Type mo112930t() {
            return this.f93079g;
        }

        @C12579k
        public String toString() {
            Drawable drawable = this.f93073a;
            String str = this.f93074b;
            String str2 = this.f93075c;
            String str3 = this.f93076d;
            String str4 = this.f93077e;
            String str5 = this.f93078f;
            Type type = this.f93079g;
            int i = this.f93080h;
            Drawable drawable2 = this.f93081i;
            return "UiModel(image=" + drawable + ", title=" + str + ", description=" + str2 + ", primaryActionText=" + str3 + ", secondaryActionText=" + str4 + ", thirdActionText=" + str5 + ", type=" + type + ", titleAlignment=" + i + ", primaryActionIcon=" + drawable2 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37154a(android.graphics.drawable.Drawable r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.carrefour.fid.android.design.components.widgets.MessageComponent.Type r20, int r21, android.graphics.drawable.Drawable r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r7 = r2
                goto L_0x000b
            L_0x0009:
                r7 = r17
            L_0x000b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0011
                r8 = r2
                goto L_0x0013
            L_0x0011:
                r8 = r18
            L_0x0013:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0019
                r9 = r2
                goto L_0x001b
            L_0x0019:
                r9 = r19
            L_0x001b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0023
                com.carrefour.fid.android.design.components.widgets.MessageComponent$Type r1 = com.carrefour.fid.android.design.components.widgets.MessageComponent.Type.ERROR
                r10 = r1
                goto L_0x0025
            L_0x0023:
                r10 = r20
            L_0x0025:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002c
                r1 = 0
                r11 = r1
                goto L_0x002e
            L_0x002c:
                r11 = r21
            L_0x002e:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0034
                r12 = r2
                goto L_0x0036
            L_0x0034:
                r12 = r22
            L_0x0036:
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.MessageComponent.C37154a.<init>(android.graphics.drawable.Drawable, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.design.components.widgets.MessageComponent$Type, int, android.graphics.drawable.Drawable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
