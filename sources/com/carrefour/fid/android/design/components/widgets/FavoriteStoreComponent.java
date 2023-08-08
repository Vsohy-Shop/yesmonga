package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37063m;
import com.carrefour.fid.android.design.components.extension.C37116g;
import com.urbanairship.iam.events.C9175a;
import java.text.SimpleDateFormat;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/FavoriteStoreComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/r1;", "store", "Lkotlin/d2;", "v", "u", "Lcom/carrefour/fid/android/design/components/databinding/m;", "a", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/m;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class FavoriteStoreComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93053b = 8;
    @C12579k

    /* renamed from: a */
    public final C11677z f93054a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FavoriteStoreComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37063m getBinding() {
        return (C37063m) this.f93054a.getValue();
    }

    /* renamed from: u */
    public final void mo112877u(C37396r1 r1Var) {
        TextView textView = getBinding().f92718b;
        if (Intrinsics.areEqual((Object) r1Var.mo113985h(), (Object) Boolean.TRUE) && r1Var.mo113984g() != null) {
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreDescription$lambda$1");
            C37116g.m152165c(textView, C36896b.C36904h.ic_open_store_badge, (Integer) null, 2, (Object) null);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH'h'mm");
            String format = simpleDateFormat.format(r1Var.mo113984g().mo113994f());
            String format2 = simpleDateFormat.format(r1Var.mo113984g().mo113992e());
            textView.setText(textView.getContext().getString(C36896b.C36912p.favorite_store_opening_time, new Object[]{format, format2}));
        } else if (Intrinsics.areEqual((Object) r1Var.mo113985h(), (Object) Boolean.FALSE)) {
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreDescription$lambda$1");
            C37116g.m152165c(textView, C36896b.C36904h.ic_closed_store_badge, (Integer) null, 2, (Object) null);
            textView.setText(C36896b.C36912p.favorite_store_closed);
        } else {
            Intrinsics.checkNotNullExpressionValue(textView, "bindStoreDescription$lambda$1");
            C37116g.m152165c(textView, C36896b.C36904h.ic_not_available_store_badge, (Integer) null, 2, (Object) null);
            textView.setText(C36896b.C36912p.favorite_store_not_available);
        }
    }

    /* renamed from: v */
    public final void mo112878v(@C12580l C37396r1 r1Var) {
        C37063m binding = getBinding();
        if (r1Var != null) {
            binding.f92720d.setText(r1Var.mo113983f());
            mo112877u(r1Var);
            return;
        }
        binding.f92720d.setText(C36896b.C36912p.favorite_store_title);
        binding.f92718b.setText(C36896b.C36912p.favorite_store_description);
        TextView textView = binding.f92718b;
        Intrinsics.checkNotNullExpressionValue(textView, "favoriteStoreDescription");
        C37116g.m152163a(textView);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FavoriteStoreComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoriteStoreComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FavoriteStoreComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93054a = C10864b0.m38748c(new FavoriteStoreComponent$binding$2(context, this));
        setBackgroundResource(C36896b.C36904h.background_default_ripple);
        setClickable(false);
    }
}
