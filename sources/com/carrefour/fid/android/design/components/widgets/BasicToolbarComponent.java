package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0375v;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37054i1;
import com.carrefour.fid.android.design.components.type.IconsPosition;
import com.carrefour.fid.android.design.components.type.TextAlignmentPosition;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001CB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bA\u0010BJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u001a\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u001d\u001a\u00020\bJ\u0010\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 J\u000e\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020 J\u000e\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0013J\u0018\u0010)\u001a\u00020\b2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'J\u0018\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\r\u001a\u00020\u0006J\u0019\u0010-\u001a\u00020\b2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\r\u001a\u00020\u0006R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R*\u00108\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00101\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/BasicToolbarComponent;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lkotlin/d2;", "a0", "Lcom/carrefour/fid/android/design/components/widgets/BasicToolbarComponent$a;", "toolbarViewUI", "Y", "color", "setLabelColor", "Lcom/carrefour/fid/android/design/components/type/TextAlignmentPosition;", "gravity", "setLabelAlignment", "f0", "", "withDriveSelection", "b0", "g0", "", "text", "setLabelText", "setLeftIconDescription", "setRightIconDescription", "setSearchIconDescription", "Z", "withIconSearch", "d0", "", "alpha", "setAlphaSearchBar", "textOffset", "setSizeLabelView", "visible", "m0", "Lkotlin/Function0;", "onSearchClickListener", "setOnSearchClickListener", "Landroid/graphics/drawable/Drawable;", "icon", "setRightIcon", "setRightIconResource", "(Ljava/lang/Integer;)V", "setLeftIcon", "n1", "Lkotlin/jvm/functions/a;", "onDriveSelectionClickListener", "o1", "getOnIconRightClickListener", "()Lkotlin/jvm/functions/a;", "setOnIconRightClickListener", "(Lkotlin/jvm/functions/a;)V", "onIconRightClickListener", "p1", "getOnIconLeftClickListener", "setOnIconLeftClickListener", "onIconLeftClickListener", "Lcom/carrefour/fid/android/design/components/databinding/i1;", "q1", "Lcom/carrefour/fid/android/design/components/databinding/i1;", "binding", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasicToolbarComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicToolbarComponent.kt\ncom/carrefour/fid/android/design/components/widgets/BasicToolbarComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,352:1\n262#2,2:353\n*S KotlinDebug\n*F\n+ 1 BasicToolbarComponent.kt\ncom/carrefour/fid/android/design/components/widgets/BasicToolbarComponent\n*L\n219#1:353,2\n*E\n"})
public final class BasicToolbarComponent extends Toolbar {

    /* renamed from: r1 */
    public static final int f92998r1 = 8;
    @C12580l

    /* renamed from: n1 */
    public C11289a<C11079d2> f92999n1;
    @C12580l

    /* renamed from: o1 */
    public C11289a<C11079d2> f93000o1;
    @C12580l

    /* renamed from: p1 */
    public C11289a<C11079d2> f93001p1;
    @C12579k

    /* renamed from: q1 */
    public final C37054i1 f93002q1;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.BasicToolbarComponent$b */
    public /* synthetic */ class C37149b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        static {
            /*
                com.carrefour.fid.android.design.components.type.TextAlignmentPosition[] r0 = com.carrefour.fid.android.design.components.type.TextAlignmentPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.design.components.type.TextAlignmentPosition r2 = com.carrefour.fid.android.design.components.type.TextAlignmentPosition.VIEW_START     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.design.components.type.TextAlignmentPosition r3 = com.carrefour.fid.android.design.components.type.TextAlignmentPosition.VIEW_END     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.design.components.type.TextAlignmentPosition r4 = com.carrefour.fid.android.design.components.type.TextAlignmentPosition.CENTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.design.components.type.TextAlignmentPosition r4 = com.carrefour.fid.android.design.components.type.TextAlignmentPosition.GRAVITY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.design.components.type.IconsPosition[] r0 = com.carrefour.fid.android.design.components.type.IconsPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.type.IconsPosition r4 = com.carrefour.fid.android.design.components.type.IconsPosition.LEFT     // Catch:{ NoSuchFieldError -> 0x003c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.carrefour.fid.android.design.components.type.IconsPosition r1 = com.carrefour.fid.android.design.components.type.IconsPosition.RIGHT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.carrefour.fid.android.design.components.type.IconsPosition r1 = com.carrefour.fid.android.design.components.type.IconsPosition.LEFT_RIGHT     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.BasicToolbarComponent.C37149b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BasicToolbarComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m152238c0(BasicToolbarComponent basicToolbarComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        basicToolbarComponent.mo112776b0(z);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m152239e0(BasicToolbarComponent basicToolbarComponent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        basicToolbarComponent.mo112777d0(z);
    }

    /* renamed from: h0 */
    public static final void m152240h0(BasicToolbarComponent basicToolbarComponent, View view) {
        Intrinsics.checkNotNullParameter(basicToolbarComponent, "this$0");
        C11289a<C11079d2> aVar = basicToolbarComponent.f93000o1;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i0 */
    public static final void m152241i0(BasicToolbarComponent basicToolbarComponent, View view) {
        Intrinsics.checkNotNullParameter(basicToolbarComponent, "this$0");
        C11289a<C11079d2> aVar = basicToolbarComponent.f93001p1;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: j0 */
    public static final void m152242j0(BasicToolbarComponent basicToolbarComponent, View view) {
        Intrinsics.checkNotNullParameter(basicToolbarComponent, "this$0");
        C11289a<C11079d2> aVar = basicToolbarComponent.f92999n1;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: k0 */
    public static final void m152243k0(BasicToolbarComponent basicToolbarComponent, View view) {
        Intrinsics.checkNotNullParameter(basicToolbarComponent, "this$0");
        C11289a<C11079d2> aVar = basicToolbarComponent.f92999n1;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: l0 */
    public static final void m152244l0(C11289a aVar, View view) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final void setLabelAlignment(TextAlignmentPosition textAlignmentPosition) {
        TextView textView = this.f93002q1.f92692e;
        int i = C37149b.$EnumSwitchMapping$0[textAlignmentPosition.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 6;
            } else if (i == 3) {
                i2 = 4;
            } else if (i == 4) {
                i2 = 1;
            }
        }
        textView.setTextAlignment(i2);
    }

    private final void setLabelColor(int i) {
        this.f93002q1.f92692e.setTextColor(i);
    }

    public static /* synthetic */ void setOnSearchClickListener$default(BasicToolbarComponent basicToolbarComponent, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        basicToolbarComponent.setOnSearchClickListener(aVar);
    }

    /* renamed from: Y */
    public final void mo112773Y(C37148a aVar) {
        if (aVar != null) {
            setLabelText(aVar.mo112813r());
            setLabelColor(aVar.mo112814s());
            setLabelAlignment(aVar.mo112815t());
            setRightIconDescription(aVar.mo112818v());
            setLeftIconDescription(aVar.mo112817u());
            mo112776b0(aVar.mo112821y());
            mo112777d0(aVar.mo112822z());
            mo112778f0(aVar);
            invalidate();
            requestLayout();
        }
    }

    /* renamed from: Z */
    public final void mo112774Z() {
        this.f93002q1.f92693f.setImportantForAccessibility(2);
    }

    /* renamed from: a0 */
    public final void mo112775a0(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C36896b.C36914r.BasicToolbarComponent, i, 0);
            try {
                try {
                    mo112773Y(new C37148a(obtainStyledAttributes.getString(C36896b.C36914r.BasicToolbarComponent_labelText), obtainStyledAttributes.getColor(C36896b.C36914r.BasicToolbarComponent_labelTextColor, obtainStyledAttributes.getResources().getColor(C36896b.C36902f.ds_grey_white, context.getTheme())), TextAlignmentPosition.f92951a.mo112746a(Integer.valueOf(obtainStyledAttributes.getInteger(C36896b.C36914r.BasicToolbarComponent_labelTextGravity, TextAlignmentPosition.VIEW_START.mo112745q()))), obtainStyledAttributes.getDrawable(C36896b.C36914r.BasicToolbarComponent_toolbarRightIcon), obtainStyledAttributes.getDrawable(C36896b.C36914r.BasicToolbarComponent_toolbarLeftIcon), IconsPosition.f92936a.mo112740a(Integer.valueOf(obtainStyledAttributes.getInteger(C36896b.C36914r.BasicToolbarComponent_toolbarIconsPosition, -1))), obtainStyledAttributes.getBoolean(C36896b.C36914r.BasicToolbarComponent_withDriveSelection, false), obtainStyledAttributes.getBoolean(C36896b.C36914r.BasicToolbarComponent_withSearch, false), obtainStyledAttributes.getColor(C36896b.C36914r.BasicToolbarComponent_toolbarLeftIconColor, 0), obtainStyledAttributes.getColor(C36896b.C36914r.BasicToolbarComponent_toolbarRightIconColor, 0), obtainStyledAttributes.getString(C36896b.C36914r.BasicToolbarComponent_rightIconDescription), obtainStyledAttributes.getString(C36896b.C36914r.BasicToolbarComponent_leftIconDescription)));
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    th = th;
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    /* renamed from: b0 */
    public final void mo112776b0(boolean z) {
        int i;
        Group group = this.f93002q1.f92691d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        group.setVisibility(i);
    }

    /* renamed from: d0 */
    public final void mo112777d0(boolean z) {
        int i;
        ImageButton imageButton = this.f93002q1.f92695h;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.toolbarSearchIcon");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    /* renamed from: f0 */
    public final void mo112778f0(C37148a aVar) {
        int i = C37149b.$EnumSwitchMapping$1[aVar.mo112812q().ordinal()];
        if (i == 1) {
            setLeftIcon(aVar.mo112810o(), aVar.mo112819w());
        } else if (i == 2) {
            setRightIcon(aVar.mo112811p(), aVar.mo112820x());
        } else if (i != 3) {
            this.f93002q1.f92694g.setVisibility(8);
            this.f93002q1.f92693f.setVisibility(8);
        } else {
            setLeftIcon(aVar.mo112810o(), aVar.mo112819w());
            setRightIcon(aVar.mo112811p(), aVar.mo112820x());
        }
    }

    /* renamed from: g0 */
    public final void mo112779g0() {
        this.f93002q1.f92694g.setOnClickListener(new C37199b(this));
        this.f93002q1.f92693f.setOnClickListener(new C37202c(this));
        this.f93002q1.f92690c.setOnClickListener(new C37215d(this));
        this.f93002q1.f92689b.setOnClickListener(new C37218e(this));
    }

    @C12580l
    public final C11289a<C11079d2> getOnIconLeftClickListener() {
        return this.f93001p1;
    }

    @C12580l
    public final C11289a<C11079d2> getOnIconRightClickListener() {
        return this.f93000o1;
    }

    /* renamed from: m0 */
    public final void mo112782m0(boolean z) {
        this.f93002q1.f92694g.setVisibility(z ? 0 : 8);
    }

    public final void setAlphaSearchBar(float f) {
        this.f93002q1.f92695h.setAlpha(f);
    }

    public final void setLabelText(@C12580l String str) {
        TextView textView = this.f93002q1.f92692e;
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void setLeftIcon(@C12580l Drawable drawable, int i) {
        if (drawable != null) {
            ImageView imageView = this.f93002q1.f92693f;
            imageView.setImageDrawable(drawable);
            imageView.setColorFilter(i);
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView2 = this.f93002q1.f92693f;
        imageView2.setImageDrawable((Drawable) null);
        imageView2.setVisibility(8);
    }

    public final void setLeftIconDescription(@C12580l String str) {
        this.f93002q1.f92693f.setContentDescription(str);
    }

    public final void setOnIconLeftClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93001p1 = aVar;
    }

    public final void setOnIconRightClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93000o1 = aVar;
    }

    public final void setOnSearchClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93002q1.f92695h.setOnClickListener(new C37221f(aVar));
    }

    public final void setRightIcon(@C12580l Drawable drawable, int i) {
        if (drawable != null) {
            ImageButton imageButton = this.f93002q1.f92694g;
            imageButton.setImageDrawable(drawable);
            imageButton.setColorFilter(i);
            imageButton.setVisibility(0);
            return;
        }
        ImageButton imageButton2 = this.f93002q1.f92694g;
        imageButton2.setImageDrawable((Drawable) null);
        imageButton2.setVisibility(8);
    }

    public final void setRightIconDescription(@C12580l String str) {
        this.f93002q1.f92694g.setContentDescription(str);
    }

    public final void setRightIconResource(@C0375v @C12580l Integer num) {
        if (num != null) {
            ImageButton imageButton = this.f93002q1.f92694g;
            imageButton.setImageResource(num.intValue());
            imageButton.setVisibility(0);
            return;
        }
        ImageButton imageButton2 = this.f93002q1.f92694g;
        imageButton2.setImageDrawable((Drawable) null);
        imageButton2.setVisibility(8);
    }

    public final void setSearchIconDescription(@C12580l String str) {
        this.f93002q1.f92695h.setContentDescription(str);
    }

    public final void setSizeLabelView(float f) {
        TextView textView = this.f93002q1.f92692e;
        if (f <= 15.0f) {
            f = 15.0f;
        }
        textView.setTextSize(2, f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public BasicToolbarComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicToolbarComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public BasicToolbarComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37054i1 d = C37054i1.m151997d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n            Lay…           true\n        )");
        this.f93002q1 = d;
        mo112775a0(context, attributeSet, i);
        mo112779g0();
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.BasicToolbarComponent$a */
    public static final class C37148a {

        /* renamed from: m */
        public static final int f93003m = 8;
        @C12580l

        /* renamed from: a */
        public final String f93004a;

        /* renamed from: b */
        public final int f93005b;
        @C12579k

        /* renamed from: c */
        public final TextAlignmentPosition f93006c;
        @C12580l

        /* renamed from: d */
        public final Drawable f93007d;
        @C12580l

        /* renamed from: e */
        public final Drawable f93008e;
        @C12579k

        /* renamed from: f */
        public final IconsPosition f93009f;

        /* renamed from: g */
        public final boolean f93010g;

        /* renamed from: h */
        public final boolean f93011h;

        /* renamed from: i */
        public final int f93012i;

        /* renamed from: j */
        public final int f93013j;
        @C12580l

        /* renamed from: k */
        public final String f93014k;
        @C12580l

        /* renamed from: l */
        public final String f93015l;

        public C37148a(@C12580l String str, int i, @C12579k TextAlignmentPosition textAlignmentPosition, @C12580l Drawable drawable, @C12580l Drawable drawable2, @C12579k IconsPosition iconsPosition, boolean z, boolean z2, int i2, int i3, @C12580l String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(textAlignmentPosition, "labelTextGravity");
            Intrinsics.checkNotNullParameter(iconsPosition, "iconsPosition");
            this.f93004a = str;
            this.f93005b = i;
            this.f93006c = textAlignmentPosition;
            this.f93007d = drawable;
            this.f93008e = drawable2;
            this.f93009f = iconsPosition;
            this.f93010g = z;
            this.f93011h = z2;
            this.f93012i = i2;
            this.f93013j = i3;
            this.f93014k = str2;
            this.f93015l = str3;
        }

        /* renamed from: n */
        public static /* synthetic */ C37148a m152253n(C37148a aVar, String str, int i, TextAlignmentPosition textAlignmentPosition, Drawable drawable, Drawable drawable2, IconsPosition iconsPosition, boolean z, boolean z2, int i2, int i3, String str2, String str3, int i4, Object obj) {
            C37148a aVar2 = aVar;
            int i5 = i4;
            return aVar.mo112809m((i5 & 1) != 0 ? aVar2.f93004a : str, (i5 & 2) != 0 ? aVar2.f93005b : i, (i5 & 4) != 0 ? aVar2.f93006c : textAlignmentPosition, (i5 & 8) != 0 ? aVar2.f93007d : drawable, (i5 & 16) != 0 ? aVar2.f93008e : drawable2, (i5 & 32) != 0 ? aVar2.f93009f : iconsPosition, (i5 & 64) != 0 ? aVar2.f93010g : z, (i5 & 128) != 0 ? aVar2.f93011h : z2, (i5 & 256) != 0 ? aVar2.f93012i : i2, (i5 & 512) != 0 ? aVar2.f93013j : i3, (i5 & 1024) != 0 ? aVar2.f93014k : str2, (i5 & 2048) != 0 ? aVar2.f93015l : str3);
        }

        @C12580l
        /* renamed from: a */
        public final String mo112795a() {
            return this.f93004a;
        }

        /* renamed from: b */
        public final int mo112796b() {
            return this.f93013j;
        }

        @C12580l
        /* renamed from: c */
        public final String mo112797c() {
            return this.f93014k;
        }

        @C12580l
        /* renamed from: d */
        public final String mo112798d() {
            return this.f93015l;
        }

        /* renamed from: e */
        public final int mo112799e() {
            return this.f93005b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37148a)) {
                return false;
            }
            C37148a aVar = (C37148a) obj;
            return Intrinsics.areEqual((Object) this.f93004a, (Object) aVar.f93004a) && this.f93005b == aVar.f93005b && this.f93006c == aVar.f93006c && Intrinsics.areEqual((Object) this.f93007d, (Object) aVar.f93007d) && Intrinsics.areEqual((Object) this.f93008e, (Object) aVar.f93008e) && this.f93009f == aVar.f93009f && this.f93010g == aVar.f93010g && this.f93011h == aVar.f93011h && this.f93012i == aVar.f93012i && this.f93013j == aVar.f93013j && Intrinsics.areEqual((Object) this.f93014k, (Object) aVar.f93014k) && Intrinsics.areEqual((Object) this.f93015l, (Object) aVar.f93015l);
        }

        @C12579k
        /* renamed from: f */
        public final TextAlignmentPosition mo112801f() {
            return this.f93006c;
        }

        @C12580l
        /* renamed from: g */
        public final Drawable mo112802g() {
            return this.f93007d;
        }

        @C12580l
        /* renamed from: h */
        public final Drawable mo112803h() {
            return this.f93008e;
        }

        public int hashCode() {
            String str = this.f93004a;
            int i = 0;
            int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f93005b)) * 31) + this.f93006c.hashCode()) * 31;
            Drawable drawable = this.f93007d;
            int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            Drawable drawable2 = this.f93008e;
            int hashCode3 = (((hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31) + this.f93009f.hashCode()) * 31;
            boolean z = this.f93010g;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f93011h;
            if (!z3) {
                z2 = z3;
            }
            int hashCode4 = (((((i2 + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.f93012i)) * 31) + Integer.hashCode(this.f93013j)) * 31;
            String str2 = this.f93014k;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93015l;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode5 + i;
        }

        @C12579k
        /* renamed from: i */
        public final IconsPosition mo112805i() {
            return this.f93009f;
        }

        /* renamed from: j */
        public final boolean mo112806j() {
            return this.f93010g;
        }

        /* renamed from: k */
        public final boolean mo112807k() {
            return this.f93011h;
        }

        /* renamed from: l */
        public final int mo112808l() {
            return this.f93012i;
        }

        @C12579k
        /* renamed from: m */
        public final C37148a mo112809m(@C12580l String str, int i, @C12579k TextAlignmentPosition textAlignmentPosition, @C12580l Drawable drawable, @C12580l Drawable drawable2, @C12579k IconsPosition iconsPosition, boolean z, boolean z2, int i2, int i3, @C12580l String str2, @C12580l String str3) {
            TextAlignmentPosition textAlignmentPosition2 = textAlignmentPosition;
            Intrinsics.checkNotNullParameter(textAlignmentPosition2, "labelTextGravity");
            IconsPosition iconsPosition2 = iconsPosition;
            Intrinsics.checkNotNullParameter(iconsPosition2, "iconsPosition");
            return new C37148a(str, i, textAlignmentPosition2, drawable, drawable2, iconsPosition2, z, z2, i2, i3, str2, str3);
        }

        @C12580l
        /* renamed from: o */
        public final Drawable mo112810o() {
            return this.f93008e;
        }

        @C12580l
        /* renamed from: p */
        public final Drawable mo112811p() {
            return this.f93007d;
        }

        @C12579k
        /* renamed from: q */
        public final IconsPosition mo112812q() {
            return this.f93009f;
        }

        @C12580l
        /* renamed from: r */
        public final String mo112813r() {
            return this.f93004a;
        }

        /* renamed from: s */
        public final int mo112814s() {
            return this.f93005b;
        }

        @C12579k
        /* renamed from: t */
        public final TextAlignmentPosition mo112815t() {
            return this.f93006c;
        }

        @C12579k
        public String toString() {
            String str = this.f93004a;
            int i = this.f93005b;
            TextAlignmentPosition textAlignmentPosition = this.f93006c;
            Drawable drawable = this.f93007d;
            Drawable drawable2 = this.f93008e;
            IconsPosition iconsPosition = this.f93009f;
            boolean z = this.f93010g;
            boolean z2 = this.f93011h;
            int i2 = this.f93012i;
            int i3 = this.f93013j;
            String str2 = this.f93014k;
            String str3 = this.f93015l;
            return "ToolbarViewUI(labelText=" + str + ", labelTextColor=" + i + ", labelTextGravity=" + textAlignmentPosition + ", iconRight=" + drawable + ", iconLeft=" + drawable2 + ", iconsPosition=" + iconsPosition + ", withDriveSelection=" + z + ", withIconSearch=" + z2 + ", toolbarLeftIconColor=" + i2 + ", toolbarRightIconColor=" + i3 + ", rightIconDescription=" + str2 + ", leftIconDescription=" + str3 + ")";
        }

        @C12580l
        /* renamed from: u */
        public final String mo112817u() {
            return this.f93015l;
        }

        @C12580l
        /* renamed from: v */
        public final String mo112818v() {
            return this.f93014k;
        }

        /* renamed from: w */
        public final int mo112819w() {
            return this.f93012i;
        }

        /* renamed from: x */
        public final int mo112820x() {
            return this.f93013j;
        }

        /* renamed from: y */
        public final boolean mo112821y() {
            return this.f93010g;
        }

        /* renamed from: z */
        public final boolean mo112822z() {
            return this.f93011h;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37148a(java.lang.String r16, int r17, com.carrefour.fid.android.design.components.type.TextAlignmentPosition r18, android.graphics.drawable.Drawable r19, android.graphics.drawable.Drawable r20, com.carrefour.fid.android.design.components.type.IconsPosition r21, boolean r22, boolean r23, int r24, int r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
            /*
                r15 = this;
                r0 = r28
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000d
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                r3 = r1
                goto L_0x000f
            L_0x000d:
                r3 = r16
            L_0x000f:
                r1 = r0 & 4
                if (r1 == 0) goto L_0x0017
                com.carrefour.fid.android.design.components.type.TextAlignmentPosition r1 = com.carrefour.fid.android.design.components.type.TextAlignmentPosition.UNKNOWN
                r5 = r1
                goto L_0x0019
            L_0x0017:
                r5 = r18
            L_0x0019:
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x0020
                r6 = r2
                goto L_0x0022
            L_0x0020:
                r6 = r19
            L_0x0022:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0028
                r7 = r2
                goto L_0x002a
            L_0x0028:
                r7 = r20
            L_0x002a:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0032
                com.carrefour.fid.android.design.components.type.IconsPosition r1 = com.carrefour.fid.android.design.components.type.IconsPosition.UNKNOWN
                r8 = r1
                goto L_0x0034
            L_0x0032:
                r8 = r21
            L_0x0034:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L_0x003b
                r9 = r2
                goto L_0x003d
            L_0x003b:
                r9 = r22
            L_0x003d:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0043
                r10 = r2
                goto L_0x0045
            L_0x0043:
                r10 = r23
            L_0x0045:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x004b
                r11 = r2
                goto L_0x004d
            L_0x004b:
                r11 = r24
            L_0x004d:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0053
                r12 = r2
                goto L_0x0055
            L_0x0053:
                r12 = r25
            L_0x0055:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0060
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                r13 = r1
                goto L_0x0062
            L_0x0060:
                r13 = r26
            L_0x0062:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x006d
                java.lang.String r0 = new java.lang.String
                r0.<init>()
                r14 = r0
                goto L_0x006f
            L_0x006d:
                r14 = r27
            L_0x006f:
                r2 = r15
                r4 = r17
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.BasicToolbarComponent.C37148a.<init>(java.lang.String, int, com.carrefour.fid.android.design.components.type.TextAlignmentPosition, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, com.carrefour.fid.android.design.components.type.IconsPosition, boolean, boolean, int, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
