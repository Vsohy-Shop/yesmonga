package com.carrefour.fid.android.design.components.widgets.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.res.C17465i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.divider.C37091a;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0014R0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/ListItemRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/d2;", "onAttachedToWindow", "", "Lcom/carrefour/fid/android/design/components/widgets/list/i;", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nListItemRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemRecyclerView.kt\ncom/carrefour/fid/android/design/components/widgets/list/ListItemRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public class ListItemRecyclerView extends RecyclerView {

    /* renamed from: B2 */
    public static final int f93446B2 = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemRecyclerView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    public final List<C37269i> getList() {
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemAdapter");
        return ((C37261b) adapter).getList();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundResource(C36896b.C36904h.background_round_white);
        setClipToPadding(false);
        setPadding(getPaddingLeft(), getPaddingTop() + getResources().getDimensionPixelSize(C36896b.C36903g.ds_spacing_xs), getPaddingRight(), getPaddingBottom() + getResources().getDimensionPixelSize(C36896b.C36903g.ds_spacing_xxs));
    }

    public final void setList(@C12579k List<? extends C37269i> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        RecyclerView.Adapter adapter = getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.list.ListItemAdapter");
        ((C37261b) adapter).setList(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemRecyclerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItemRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemRecyclerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C37091a aVar;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setAdapter(new C37261b());
        setLayoutManager(new LinearLayoutManager(context));
        Drawable g = C17465i.m80175g(getResources(), C36896b.C36904h.ds_component_list_divider, context.getTheme());
        if (g != null) {
            aVar = new C37091a(context, 1, false, g, new C37091a.C37093b(C36896b.C36903g.ds_spacing_s, C36896b.C36904h.ds_component_list_divider_white_background));
        } else {
            aVar = null;
        }
        if (aVar != null) {
            mo59589n(aVar);
        }
    }
}
