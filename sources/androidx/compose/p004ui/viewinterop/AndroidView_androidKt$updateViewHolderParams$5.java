package androidx.compose.p004ui.viewinterop;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/unit/LayoutDirection;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/LayoutDirection;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5 */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends Lambda implements C11304p<LayoutNode, LayoutDirection, C11079d2> {

    /* renamed from: f */
    public static final AndroidView_androidKt$updateViewHolderParams$5 f40961f = new AndroidView_androidKt$updateViewHolderParams$5();

    /* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5$a */
    public /* synthetic */ class C16520a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p004ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5.C16520a.<clinit>():void");
        }
    }

    public AndroidView_androidKt$updateViewHolderParams$5() {
        super(2);
    }

    /* renamed from: a */
    public final void mo47986a(@C12579k LayoutNode layoutNode, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(layoutDirection, "it");
        ViewFactoryHolder c = AndroidView_androidKt.m74834f(layoutNode);
        int i = C16520a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        c.setLayoutDirection(i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo47986a((LayoutNode) obj, (LayoutDirection) obj2);
        return C11079d2.f28267a;
    }
}
