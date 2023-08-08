package androidx.compose.p004ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import java.util.HashMap;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u001e\u0010\f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0017J\b\u0010 \u001a\u00020\u0007H\u0016R3\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"0!j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\"`#8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&R3\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170!j\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0017`#8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b(\u0010&¨\u0006."}, mo22516d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/d2;", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "", "location", "Landroid/graphics/Rect;", "dirty", "", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Landroid/graphics/Canvas;", "canvas", "a", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "requestLayout", "shouldDelayChildPressedState", "Ljava/util/HashMap;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "getLayoutNodeToHolder", "layoutNodeToHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n54#1:99,2\n61#1:101,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidViewsHandler */
public final class AndroidViewsHandler extends ViewGroup {
    @C12579k

    /* renamed from: a */
    public final HashMap<AndroidViewHolder, LayoutNode> f39311a = new HashMap<>();
    @C12579k

    /* renamed from: b */
    public final HashMap<LayoutNode, AndroidViewHolder> f39312b = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setClipChildren(false);
    }

    /* renamed from: a */
    public final void mo45506a(@C12579k AndroidViewHolder androidViewHolder, @C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(androidViewHolder, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        androidViewHolder.draw(canvas);
    }

    @C12580l
    /* renamed from: b */
    public Void mo45507b(@C12580l int[] iArr, @C12580l Rect rect) {
        return null;
    }

    public boolean dispatchTouchEvent(@C12580l MotionEvent motionEvent) {
        return true;
    }

    @C12579k
    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.f39311a;
    }

    @C12579k
    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f39312b;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) mo45507b(iArr, rect);
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@C12579k View view, @C12579k View view2) {
        Intrinsics.checkNotNullParameter(view, "child");
        Intrinsics.checkNotNullParameter(view2, "target");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AndroidViewHolder> keySet = this.f39311a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : keySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z2 = false;
            }
            if (z2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<AndroidViewHolder> keySet = this.f39311a.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "holderToLayoutNode.keys");
                for (AndroidViewHolder k : keySet) {
                    k.mo47939k();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutNode layoutNode = this.f39311a.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.m69647C1(layoutNode, false, 1, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
